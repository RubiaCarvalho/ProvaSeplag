package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lotacao_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      gxfirstwebparm_bkp = gxfirstwebparm ;
      gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         dyncall( httpContext.GetNextPar( )) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A4pes_id = (int)(GXutil.lval( httpContext.GetPar( "pes_id"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4pes_id), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A4pes_id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A6unid_id = (int)(GXutil.lval( httpContext.GetPar( "unid_id"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6unid_id), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A6unid_id) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
      {
         httpContext.setAjaxEventMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else
      {
         if ( ! httpContext.IsValidAjaxCall( false) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = gxfirstwebparm_bkp ;
      }
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_web_controls( ) ;
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 18_0_11-185416", (short)(0)) ;
         }
      }
      Form.getMeta().addItem("description", "lotacao", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtlot_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Treinamento2", true);
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public lotacao_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lotacao_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lotacao_impl.class ));
   }

   public lotacao_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "com.treinamento2.general.ui.masterunanimosidebar");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
            }
            if ( ! httpContext.willRedirect( ) )
            {
               addString( httpContext.getJSONResponse( )) ;
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! com.treinamento2.GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         drawControls( ) ;
         fix_multi_value_controls( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void drawControls( )
   {
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "start", "top", " "+"data-gx-base-lib=\"none\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "title-container", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
      /* Text block */
      com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "lotacao", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "heading-01", 0, "", 1, 1, 0, (short)(0), "HLP_lotacao.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "form-container", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 form__toolbar-cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "start", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-first" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_lotacao.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-prev" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_lotacao.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-next" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_lotacao.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-last" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_lotacao.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "Button button-secondary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Selecionar", bttBtn_select_Jsonclick, 4, "Selecionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.treinamento2.gx0040"+"',["+"{Ctrl:gx.dom.el('"+"LOT_ID"+"'), id:'"+"LOT_ID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_lotacao.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell-advanced", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtlot_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtlot_id_Internalname, "lot_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtlot_id_Internalname, GXutil.ltrim( localUtil.ntoc( A5lot_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtlot_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5lot_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5lot_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtlot_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtlot_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Id", "end", false, "", "HLP_lotacao.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtpes_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtpes_id_Internalname, "pes_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtpes_id_Internalname, GXutil.ltrim( localUtil.ntoc( A4pes_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtpes_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4pes_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4pes_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtpes_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtpes_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Id", "end", false, "", "HLP_lotacao.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_4_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_4_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
      com.treinamento2.GxWebStd.gx_bitmap( httpContext, imgprompt_4_Internalname, sImgUrl, imgprompt_4_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_4_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_lotacao.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtunid_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtunid_id_Internalname, "unid_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtunid_id_Internalname, GXutil.ltrim( localUtil.ntoc( A6unid_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtunid_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6unid_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6unid_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtunid_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtunid_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Id", "end", false, "", "HLP_lotacao.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_6_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_6_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
      com.treinamento2.GxWebStd.gx_bitmap( httpContext, imgprompt_6_Internalname, sImgUrl, imgprompt_6_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_6_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_lotacao.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtlot_data_lotacao_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtlot_data_lotacao_Internalname, "lot_data_lotacao", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtlot_data_lotacao_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtlot_data_lotacao_Internalname, localUtil.format(A17lot_data_lotacao, "99/99/99"), localUtil.format( A17lot_data_lotacao, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'por',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'por',false,0);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtlot_data_lotacao_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtlot_data_lotacao_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_lotacao.htm");
      com.treinamento2.GxWebStd.gx_bitmap( httpContext, edtlot_data_lotacao_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtlot_data_lotacao_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_lotacao.htm");
      httpContext.writeTextNL( "</div>") ;
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtlot_data_remocao_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtlot_data_remocao_Internalname, "lot_data_remocao", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtlot_data_remocao_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtlot_data_remocao_Internalname, localUtil.format(A18lot_data_remocao, "99/99/99"), localUtil.format( A18lot_data_remocao, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'por',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'por',false,0);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtlot_data_remocao_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtlot_data_remocao_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_lotacao.htm");
      com.treinamento2.GxWebStd.gx_bitmap( httpContext, edtlot_data_remocao_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtlot_data_remocao_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_lotacao.htm");
      httpContext.writeTextNL( "</div>") ;
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtlot_portaria_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtlot_portaria_Internalname, "lot_portaria", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtlot_portaria_Internalname, A19lot_portaria, GXutil.rtrim( localUtil.format( A19lot_portaria, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtlot_portaria_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtlot_portaria_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_lotacao.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__actions--fixed", "end", "Middle", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group", "start", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "Button button-primary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_lotacao.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Fechar", bttBtn_cancel_Jsonclick, 1, "Fechar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_lotacao.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_lotacao.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "end", "Middle", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z5lot_id = (int)(localUtil.ctol( httpContext.cgiGet( "Z5lot_id"), ",", ".")) ;
         Z17lot_data_lotacao = localUtil.ctod( httpContext.cgiGet( "Z17lot_data_lotacao"), 0) ;
         n17lot_data_lotacao = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A17lot_data_lotacao)) ? true : false) ;
         Z18lot_data_remocao = localUtil.ctod( httpContext.cgiGet( "Z18lot_data_remocao"), 0) ;
         n18lot_data_remocao = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A18lot_data_remocao)) ? true : false) ;
         Z19lot_portaria = httpContext.cgiGet( "Z19lot_portaria") ;
         n19lot_portaria = ((GXutil.strcmp("", A19lot_portaria)==0) ? true : false) ;
         Z4pes_id = (int)(localUtil.ctol( httpContext.cgiGet( "Z4pes_id"), ",", ".")) ;
         Z6unid_id = (int)(localUtil.ctol( httpContext.cgiGet( "Z6unid_id"), ",", ".")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtlot_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtlot_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LOT_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtlot_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5lot_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A5lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5lot_id), 8, 0));
         }
         else
         {
            A5lot_id = (int)(localUtil.ctol( httpContext.cgiGet( edtlot_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5lot_id), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtpes_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtpes_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PES_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtpes_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4pes_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4pes_id), 8, 0));
         }
         else
         {
            A4pes_id = (int)(localUtil.ctol( httpContext.cgiGet( edtpes_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4pes_id), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtunid_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtunid_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UNID_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtunid_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6unid_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6unid_id), 8, 0));
         }
         else
         {
            A6unid_id = (int)(localUtil.ctol( httpContext.cgiGet( edtunid_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6unid_id), 8, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtlot_data_lotacao_Internalname), (byte)(3)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LOT_DATA_LOTACAO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtlot_data_lotacao_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A17lot_data_lotacao = GXutil.nullDate() ;
            n17lot_data_lotacao = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A17lot_data_lotacao", localUtil.format(A17lot_data_lotacao, "99/99/99"));
         }
         else
         {
            A17lot_data_lotacao = localUtil.ctod( httpContext.cgiGet( edtlot_data_lotacao_Internalname), 3) ;
            n17lot_data_lotacao = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A17lot_data_lotacao", localUtil.format(A17lot_data_lotacao, "99/99/99"));
         }
         n17lot_data_lotacao = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A17lot_data_lotacao)) ? true : false) ;
         if ( localUtil.vcdate( httpContext.cgiGet( edtlot_data_remocao_Internalname), (byte)(3)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LOT_DATA_REMOCAO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtlot_data_remocao_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A18lot_data_remocao = GXutil.nullDate() ;
            n18lot_data_remocao = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18lot_data_remocao", localUtil.format(A18lot_data_remocao, "99/99/99"));
         }
         else
         {
            A18lot_data_remocao = localUtil.ctod( httpContext.cgiGet( edtlot_data_remocao_Internalname), 3) ;
            n18lot_data_remocao = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18lot_data_remocao", localUtil.format(A18lot_data_remocao, "99/99/99"));
         }
         n18lot_data_remocao = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A18lot_data_remocao)) ? true : false) ;
         A19lot_portaria = httpContext.cgiGet( edtlot_portaria_Internalname) ;
         n19lot_portaria = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A19lot_portaria", A19lot_portaria);
         n19lot_portaria = ((GXutil.strcmp("", A19lot_portaria)==0) ? true : false) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         standaloneNotModal( ) ;
      }
      else
      {
         standaloneNotModal( ) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
         {
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            A5lot_id = (int)(GXutil.lval( httpContext.GetPar( "lot_id"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5lot_id), 8, 0));
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons_dsp( ) ;
            standaloneModal( ) ;
         }
         else
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            standaloneModal( ) ;
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
         sEvt = httpContext.cgiGet( "_EventName") ;
         EvtGridId = httpContext.cgiGet( "_EventGridId") ;
         EvtRowId = httpContext.cgiGet( "_EventRowId") ;
         if ( GXutil.len( sEvt) > 0 )
         {
            sEvtType = GXutil.left( sEvt, 1) ;
            sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
            if ( GXutil.strcmp(sEvtType, "M") != 0 )
            {
               if ( GXutil.strcmp(sEvtType, "E") == 0 )
               {
                  sEvtType = GXutil.right( sEvt, 1) ;
                  if ( GXutil.strcmp(sEvtType, ".") == 0 )
                  {
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
                     }
                  }
                  else
                  {
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll044( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public void disable_std_buttons( )
   {
      if ( isIns( ) )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_first_Visible), 5, 0), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_previous_Visible), 5, 0), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_next_Visible), 5, 0), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_last_Visible), 5, 0), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_select_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributes044( ) ;
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( isDlt( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void resetCaption040( )
   {
   }

   public void zm044( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z17lot_data_lotacao = T00043_A17lot_data_lotacao[0] ;
            Z18lot_data_remocao = T00043_A18lot_data_remocao[0] ;
            Z19lot_portaria = T00043_A19lot_portaria[0] ;
            Z4pes_id = T00043_A4pes_id[0] ;
            Z6unid_id = T00043_A6unid_id[0] ;
         }
         else
         {
            Z17lot_data_lotacao = A17lot_data_lotacao ;
            Z18lot_data_remocao = A18lot_data_remocao ;
            Z19lot_portaria = A19lot_portaria ;
            Z4pes_id = A4pes_id ;
            Z6unid_id = A6unid_id ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z5lot_id = A5lot_id ;
         Z17lot_data_lotacao = A17lot_data_lotacao ;
         Z18lot_data_remocao = A18lot_data_remocao ;
         Z19lot_portaria = A19lot_portaria ;
         Z4pes_id = A4pes_id ;
         Z6unid_id = A6unid_id ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_4_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.treinamento2.gx0050"+"',["+"{Ctrl:gx.dom.el('"+"PES_ID"+"'), id:'"+"PES_ID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_6_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.treinamento2.gx0060"+"',["+"{Ctrl:gx.dom.el('"+"UNID_ID"+"'), id:'"+"UNID_ID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
   }

   public void load044( )
   {
      /* Using cursor T00046 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A5lot_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A17lot_data_lotacao = T00046_A17lot_data_lotacao[0] ;
         n17lot_data_lotacao = T00046_n17lot_data_lotacao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17lot_data_lotacao", localUtil.format(A17lot_data_lotacao, "99/99/99"));
         A18lot_data_remocao = T00046_A18lot_data_remocao[0] ;
         n18lot_data_remocao = T00046_n18lot_data_remocao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18lot_data_remocao", localUtil.format(A18lot_data_remocao, "99/99/99"));
         A19lot_portaria = T00046_A19lot_portaria[0] ;
         n19lot_portaria = T00046_n19lot_portaria[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19lot_portaria", A19lot_portaria);
         A4pes_id = T00046_A4pes_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4pes_id), 8, 0));
         A6unid_id = T00046_A6unid_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6unid_id), 8, 0));
         zm044( -1) ;
      }
      pr_default.close(4);
      onLoadActions044( ) ;
   }

   public void onLoadActions044( )
   {
   }

   public void checkExtendedTable044( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00044 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A4pes_id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'Pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtpes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T00045 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A6unid_id)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'Unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors044( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( int A4pes_id )
   {
      /* Using cursor T00047 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A4pes_id)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'Pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtpes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.treinamento2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_3( int A6unid_id )
   {
      /* Using cursor T00048 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A6unid_id)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'Unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.treinamento2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey044( )
   {
      /* Using cursor T00049 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A5lot_id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound4 = (short)(1) ;
      }
      else
      {
         RcdFound4 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00043 */
      pr_default.execute(1, new Object[] {Integer.valueOf(A5lot_id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm044( 1) ;
         RcdFound4 = (short)(1) ;
         A5lot_id = T00043_A5lot_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5lot_id), 8, 0));
         A17lot_data_lotacao = T00043_A17lot_data_lotacao[0] ;
         n17lot_data_lotacao = T00043_n17lot_data_lotacao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17lot_data_lotacao", localUtil.format(A17lot_data_lotacao, "99/99/99"));
         A18lot_data_remocao = T00043_A18lot_data_remocao[0] ;
         n18lot_data_remocao = T00043_n18lot_data_remocao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18lot_data_remocao", localUtil.format(A18lot_data_remocao, "99/99/99"));
         A19lot_portaria = T00043_A19lot_portaria[0] ;
         n19lot_portaria = T00043_n19lot_portaria[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19lot_portaria", A19lot_portaria);
         A4pes_id = T00043_A4pes_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4pes_id), 8, 0));
         A6unid_id = T00043_A6unid_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6unid_id), 8, 0));
         Z5lot_id = A5lot_id ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load044( ) ;
         if ( AnyError == 1 )
         {
            RcdFound4 = (short)(0) ;
            initializeNonKey044( ) ;
         }
         Gx_mode = sMode4 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound4 = (short)(0) ;
         initializeNonKey044( ) ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode4 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey044( ) ;
      if ( RcdFound4 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound4 = (short)(0) ;
      /* Using cursor T000410 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A5lot_id)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T000410_A5lot_id[0] < A5lot_id ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T000410_A5lot_id[0] > A5lot_id ) ) )
         {
            A5lot_id = T000410_A5lot_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5lot_id), 8, 0));
            RcdFound4 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound4 = (short)(0) ;
      /* Using cursor T000411 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A5lot_id)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T000411_A5lot_id[0] > A5lot_id ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T000411_A5lot_id[0] < A5lot_id ) ) )
         {
            A5lot_id = T000411_A5lot_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5lot_id), 8, 0));
            RcdFound4 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey044( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtlot_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert044( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound4 == 1 )
         {
            if ( A5lot_id != Z5lot_id )
            {
               A5lot_id = Z5lot_id ;
               httpContext.ajax_rsp_assign_attri("", false, "A5lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5lot_id), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "LOT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtlot_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtlot_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update044( ) ;
               GX_FocusControl = edtlot_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A5lot_id != Z5lot_id )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtlot_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert044( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "LOT_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtlot_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtlot_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert044( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( A5lot_id != Z5lot_id )
      {
         A5lot_id = Z5lot_id ;
         httpContext.ajax_rsp_assign_attri("", false, "A5lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5lot_id), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "LOT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtlot_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtlot_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "LOT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtlot_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtpes_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtpes_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd044( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtpes_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtpes_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound4 != 0 )
         {
            scanNext044( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtpes_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd044( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency044( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00042 */
         pr_default.execute(0, new Object[] {Integer.valueOf(A5lot_id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"lotacao"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z17lot_data_lotacao), GXutil.resetTime(T00042_A17lot_data_lotacao[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z18lot_data_remocao), GXutil.resetTime(T00042_A18lot_data_remocao[0])) ) || ( GXutil.strcmp(Z19lot_portaria, T00042_A19lot_portaria[0]) != 0 ) || ( Z4pes_id != T00042_A4pes_id[0] ) || ( Z6unid_id != T00042_A6unid_id[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z17lot_data_lotacao), GXutil.resetTime(T00042_A17lot_data_lotacao[0])) ) )
            {
               GXutil.writeLogln("lotacao:[seudo value changed for attri]"+"lot_data_lotacao");
               GXutil.writeLogRaw("Old: ",Z17lot_data_lotacao);
               GXutil.writeLogRaw("Current: ",T00042_A17lot_data_lotacao[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z18lot_data_remocao), GXutil.resetTime(T00042_A18lot_data_remocao[0])) ) )
            {
               GXutil.writeLogln("lotacao:[seudo value changed for attri]"+"lot_data_remocao");
               GXutil.writeLogRaw("Old: ",Z18lot_data_remocao);
               GXutil.writeLogRaw("Current: ",T00042_A18lot_data_remocao[0]);
            }
            if ( GXutil.strcmp(Z19lot_portaria, T00042_A19lot_portaria[0]) != 0 )
            {
               GXutil.writeLogln("lotacao:[seudo value changed for attri]"+"lot_portaria");
               GXutil.writeLogRaw("Old: ",Z19lot_portaria);
               GXutil.writeLogRaw("Current: ",T00042_A19lot_portaria[0]);
            }
            if ( Z4pes_id != T00042_A4pes_id[0] )
            {
               GXutil.writeLogln("lotacao:[seudo value changed for attri]"+"pes_id");
               GXutil.writeLogRaw("Old: ",Z4pes_id);
               GXutil.writeLogRaw("Current: ",T00042_A4pes_id[0]);
            }
            if ( Z6unid_id != T00042_A6unid_id[0] )
            {
               GXutil.writeLogln("lotacao:[seudo value changed for attri]"+"unid_id");
               GXutil.writeLogRaw("Old: ",Z6unid_id);
               GXutil.writeLogRaw("Current: ",T00042_A6unid_id[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"lotacao"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         zm044( 0) ;
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000412 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n17lot_data_lotacao), A17lot_data_lotacao, Boolean.valueOf(n18lot_data_remocao), A18lot_data_remocao, Boolean.valueOf(n19lot_portaria), A19lot_portaria, Integer.valueOf(A4pes_id), Integer.valueOf(A6unid_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000413 */
                  pr_default.execute(11);
                  A5lot_id = T000413_A5lot_id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5lot_id), 8, 0));
                  pr_default.close(11);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("lotacao");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption040( ) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load044( ) ;
         }
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void update044( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable044( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm044( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate044( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000414 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n17lot_data_lotacao), A17lot_data_lotacao, Boolean.valueOf(n18lot_data_remocao), A18lot_data_remocao, Boolean.valueOf(n19lot_portaria), A19lot_portaria, Integer.valueOf(A4pes_id), Integer.valueOf(A6unid_id), Integer.valueOf(A5lot_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("lotacao");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"lotacao"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate044( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption040( ) ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel044( ) ;
      }
      closeExtendedTableCursors044( ) ;
   }

   public void deferredUpdate044( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency044( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls044( ) ;
         afterConfirm044( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete044( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000415 */
               pr_default.execute(13, new Object[] {Integer.valueOf(A5lot_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("lotacao");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound4 == 0 )
                     {
                        initAll044( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                     resetCaption040( ) ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode4 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel044( ) ;
      Gx_mode = sMode4 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls044( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel044( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete044( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "lotacao");
         if ( AnyError == 0 )
         {
            confirmValues040( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "lotacao");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart044( )
   {
      /* Using cursor T000416 */
      pr_default.execute(14);
      RcdFound4 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A5lot_id = T000416_A5lot_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5lot_id), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext044( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound4 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A5lot_id = T000416_A5lot_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5lot_id), 8, 0));
      }
   }

   public void scanEnd044( )
   {
      pr_default.close(14);
   }

   public void afterConfirm044( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert044( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate044( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete044( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete044( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate044( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes044( )
   {
      edtlot_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtlot_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlot_id_Enabled), 5, 0), true);
      edtpes_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtpes_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtpes_id_Enabled), 5, 0), true);
      edtunid_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtunid_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtunid_id_Enabled), 5, 0), true);
      edtlot_data_lotacao_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtlot_data_lotacao_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlot_data_lotacao_Enabled), 5, 0), true);
      edtlot_data_remocao_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtlot_data_remocao_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlot_data_remocao_Enabled), 5, 0), true);
      edtlot_portaria_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtlot_portaria_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtlot_portaria_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes044( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues040( )
   {
   }

   public void renderHtmlHeaders( )
   {
      com.treinamento2.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      MasterPageObj.master_styles();
      httpContext.CloseStyles();
      if ( ( ( httpContext.getBrowserType( ) == 1 ) || ( httpContext.getBrowserType( ) == 5 ) ) && ( GXutil.strcmp(httpContext.getBrowserVersion( ), "7.0") == 0 ) )
      {
         httpContext.AddJavascriptSource("json2.js", "?"+httpContext.getBuildNumber( 1715240), false, true);
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 1715240), false, true);
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 1715240), false, true);
      httpContext.AddJavascriptSource("gxcfg.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 1715240), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 1715240), false, true);
      httpContext.AddJavascriptSource("calendar-pt.js", "?"+httpContext.getBuildNumber( 1715240), false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      if ( GXutil.strcmp(httpContext.getLanguageProperty( "rtl"), "true") == 0 )
      {
         httpContext.writeText( " dir=\"rtl\" ") ;
      }
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.treinamento2.lotacao", new String[] {}, new String[] {}) +"\">") ;
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<div style=\"height:0;overflow:hidden\"><input type=\"submit\" title=\"submit\"  disabled></div>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z5lot_id", GXutil.ltrim( localUtil.ntoc( Z5lot_id, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z17lot_data_lotacao", localUtil.dtoc( Z17lot_data_lotacao, 0, "/"));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z18lot_data_remocao", localUtil.dtoc( Z18lot_data_remocao, 0, "/"));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z19lot_portaria", Z19lot_portaria);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z4pes_id", GXutil.ltrim( localUtil.ntoc( Z4pes_id, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z6unid_id", GXutil.ltrim( localUtil.ntoc( Z6unid_id, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      httpContext.writeTextNL( "</form>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      include_jscripts( ) ;
   }

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      com.treinamento2.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.treinamento2.lotacao", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "lotacao" ;
   }

   public String getPgmdesc( )
   {
      return "lotacao" ;
   }

   public void initializeNonKey044( )
   {
      A4pes_id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4pes_id), 8, 0));
      A6unid_id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6unid_id), 8, 0));
      A17lot_data_lotacao = GXutil.nullDate() ;
      n17lot_data_lotacao = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A17lot_data_lotacao", localUtil.format(A17lot_data_lotacao, "99/99/99"));
      n17lot_data_lotacao = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A17lot_data_lotacao)) ? true : false) ;
      A18lot_data_remocao = GXutil.nullDate() ;
      n18lot_data_remocao = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18lot_data_remocao", localUtil.format(A18lot_data_remocao, "99/99/99"));
      n18lot_data_remocao = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A18lot_data_remocao)) ? true : false) ;
      A19lot_portaria = "" ;
      n19lot_portaria = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A19lot_portaria", A19lot_portaria);
      n19lot_portaria = ((GXutil.strcmp("", A19lot_portaria)==0) ? true : false) ;
      Z17lot_data_lotacao = GXutil.nullDate() ;
      Z18lot_data_remocao = GXutil.nullDate() ;
      Z19lot_portaria = "" ;
      Z4pes_id = 0 ;
      Z6unid_id = 0 ;
   }

   public void initAll044( )
   {
      A5lot_id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5lot_id), 8, 0));
      initializeNonKey044( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2025481525218", true, true);
         idxLst = (int)(idxLst+1) ;
      }
      if ( ! outputEnabled )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.por.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("lotacao.js", "?2025481525218", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      divToolbarcell_Internalname = "TOOLBARCELL" ;
      edtlot_id_Internalname = "LOT_ID" ;
      edtpes_id_Internalname = "PES_ID" ;
      edtunid_id_Internalname = "UNID_ID" ;
      edtlot_data_lotacao_Internalname = "LOT_DATA_LOTACAO" ;
      edtlot_data_remocao_Internalname = "LOT_DATA_REMOCAO" ;
      edtlot_portaria_Internalname = "LOT_PORTARIA" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_4_Internalname = "PROMPT_4" ;
      imgprompt_6_Internalname = "PROMPT_6" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("Treinamento2", true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "lotacao" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtlot_portaria_Jsonclick = "" ;
      edtlot_portaria_Enabled = 1 ;
      edtlot_data_remocao_Jsonclick = "" ;
      edtlot_data_remocao_Enabled = 1 ;
      edtlot_data_lotacao_Jsonclick = "" ;
      edtlot_data_lotacao_Enabled = 1 ;
      imgprompt_6_Visible = 1 ;
      imgprompt_6_Link = "" ;
      edtunid_id_Jsonclick = "" ;
      edtunid_id_Enabled = 1 ;
      imgprompt_4_Visible = 1 ;
      imgprompt_4_Link = "" ;
      edtpes_id_Jsonclick = "" ;
      edtpes_id_Enabled = 1 ;
      edtlot_id_Jsonclick = "" ;
      edtlot_id_Enabled = 1 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      GX_FocusControl = edtpes_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public void valid_Lot_id( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4pes_id", GXutil.ltrim( localUtil.ntoc( A4pes_id, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6unid_id", GXutil.ltrim( localUtil.ntoc( A6unid_id, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A17lot_data_lotacao", localUtil.format(A17lot_data_lotacao, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A18lot_data_remocao", localUtil.format(A18lot_data_remocao, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A19lot_portaria", A19lot_portaria);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z5lot_id", GXutil.ltrim( localUtil.ntoc( Z5lot_id, (byte)(8), (byte)(0), ".", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z4pes_id", GXutil.ltrim( localUtil.ntoc( Z4pes_id, (byte)(8), (byte)(0), ".", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z6unid_id", GXutil.ltrim( localUtil.ntoc( Z6unid_id, (byte)(8), (byte)(0), ".", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z17lot_data_lotacao", localUtil.format(Z17lot_data_lotacao, "99/99/99"));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z18lot_data_remocao", localUtil.format(Z18lot_data_remocao, "99/99/99"));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z19lot_portaria", Z19lot_portaria);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Pes_id( )
   {
      /* Using cursor T000417 */
      pr_default.execute(15, new Object[] {Integer.valueOf(A4pes_id)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'Pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtpes_id_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Unid_id( )
   {
      /* Using cursor T000418 */
      pr_default.execute(16, new Object[] {Integer.valueOf(A6unid_id)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'Unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunid_id_Internalname ;
      }
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_LOT_ID","{handler:'valid_Lot_id',iparms:[{av:'A5lot_id',fld:'LOT_ID',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_LOT_ID",",oparms:[{av:'A4pes_id',fld:'PES_ID',pic:'ZZZZZZZ9'},{av:'A6unid_id',fld:'UNID_ID',pic:'ZZZZZZZ9'},{av:'A17lot_data_lotacao',fld:'LOT_DATA_LOTACAO',pic:''},{av:'A18lot_data_remocao',fld:'LOT_DATA_REMOCAO',pic:''},{av:'A19lot_portaria',fld:'LOT_PORTARIA',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z5lot_id'},{av:'Z4pes_id'},{av:'Z6unid_id'},{av:'Z17lot_data_lotacao'},{av:'Z18lot_data_remocao'},{av:'Z19lot_portaria'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_PES_ID","{handler:'valid_Pes_id',iparms:[{av:'A4pes_id',fld:'PES_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_PES_ID",",oparms:[]}");
      setEventMetadata("VALID_UNID_ID","{handler:'valid_Unid_id',iparms:[{av:'A6unid_id',fld:'UNID_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_UNID_ID",",oparms:[]}");
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(15);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z17lot_data_lotacao = GXutil.nullDate() ;
      Z18lot_data_remocao = GXutil.nullDate() ;
      Z19lot_portaria = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      imgprompt_4_gximage = "" ;
      sImgUrl = "" ;
      imgprompt_6_gximage = "" ;
      A17lot_data_lotacao = GXutil.nullDate() ;
      A18lot_data_remocao = GXutil.nullDate() ;
      A19lot_portaria = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      T00046_A5lot_id = new int[1] ;
      T00046_A17lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      T00046_n17lot_data_lotacao = new boolean[] {false} ;
      T00046_A18lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      T00046_n18lot_data_remocao = new boolean[] {false} ;
      T00046_A19lot_portaria = new String[] {""} ;
      T00046_n19lot_portaria = new boolean[] {false} ;
      T00046_A4pes_id = new int[1] ;
      T00046_A6unid_id = new int[1] ;
      T00044_A4pes_id = new int[1] ;
      T00045_A6unid_id = new int[1] ;
      T00047_A4pes_id = new int[1] ;
      T00048_A6unid_id = new int[1] ;
      T00049_A5lot_id = new int[1] ;
      T00043_A5lot_id = new int[1] ;
      T00043_A17lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      T00043_n17lot_data_lotacao = new boolean[] {false} ;
      T00043_A18lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      T00043_n18lot_data_remocao = new boolean[] {false} ;
      T00043_A19lot_portaria = new String[] {""} ;
      T00043_n19lot_portaria = new boolean[] {false} ;
      T00043_A4pes_id = new int[1] ;
      T00043_A6unid_id = new int[1] ;
      sMode4 = "" ;
      T000410_A5lot_id = new int[1] ;
      T000411_A5lot_id = new int[1] ;
      T00042_A5lot_id = new int[1] ;
      T00042_A17lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      T00042_n17lot_data_lotacao = new boolean[] {false} ;
      T00042_A18lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      T00042_n18lot_data_remocao = new boolean[] {false} ;
      T00042_A19lot_portaria = new String[] {""} ;
      T00042_n19lot_portaria = new boolean[] {false} ;
      T00042_A4pes_id = new int[1] ;
      T00042_A6unid_id = new int[1] ;
      T000413_A5lot_id = new int[1] ;
      T000416_A5lot_id = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ17lot_data_lotacao = GXutil.nullDate() ;
      ZZ18lot_data_remocao = GXutil.nullDate() ;
      ZZ19lot_portaria = "" ;
      T000417_A4pes_id = new int[1] ;
      T000418_A6unid_id = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.lotacao__default(),
         new Object[] {
             new Object[] {
            T00042_A5lot_id, T00042_A17lot_data_lotacao, T00042_n17lot_data_lotacao, T00042_A18lot_data_remocao, T00042_n18lot_data_remocao, T00042_A19lot_portaria, T00042_n19lot_portaria, T00042_A4pes_id, T00042_A6unid_id
            }
            , new Object[] {
            T00043_A5lot_id, T00043_A17lot_data_lotacao, T00043_n17lot_data_lotacao, T00043_A18lot_data_remocao, T00043_n18lot_data_remocao, T00043_A19lot_portaria, T00043_n19lot_portaria, T00043_A4pes_id, T00043_A6unid_id
            }
            , new Object[] {
            T00044_A4pes_id
            }
            , new Object[] {
            T00045_A6unid_id
            }
            , new Object[] {
            T00046_A5lot_id, T00046_A17lot_data_lotacao, T00046_n17lot_data_lotacao, T00046_A18lot_data_remocao, T00046_n18lot_data_remocao, T00046_A19lot_portaria, T00046_n19lot_portaria, T00046_A4pes_id, T00046_A6unid_id
            }
            , new Object[] {
            T00047_A4pes_id
            }
            , new Object[] {
            T00048_A6unid_id
            }
            , new Object[] {
            T00049_A5lot_id
            }
            , new Object[] {
            T000410_A5lot_id
            }
            , new Object[] {
            T000411_A5lot_id
            }
            , new Object[] {
            }
            , new Object[] {
            T000413_A5lot_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000416_A5lot_id
            }
            , new Object[] {
            T000417_A4pes_id
            }
            , new Object[] {
            T000418_A6unid_id
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short AnyError ;
   private short IsModified ;
   private short IsConfirmed ;
   private short RcdFound4 ;
   private int Z5lot_id ;
   private int Z4pes_id ;
   private int Z6unid_id ;
   private int A4pes_id ;
   private int A6unid_id ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A5lot_id ;
   private int edtlot_id_Enabled ;
   private int edtpes_id_Enabled ;
   private int imgprompt_4_Visible ;
   private int edtunid_id_Enabled ;
   private int imgprompt_6_Visible ;
   private int edtlot_data_lotacao_Enabled ;
   private int edtlot_data_remocao_Enabled ;
   private int edtlot_portaria_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ5lot_id ;
   private int ZZ4pes_id ;
   private int ZZ6unid_id ;
   private String sPrefix ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtlot_id_Internalname ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String divToolbarcell_Internalname ;
   private String TempTags ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String edtlot_id_Jsonclick ;
   private String edtpes_id_Internalname ;
   private String edtpes_id_Jsonclick ;
   private String imgprompt_4_gximage ;
   private String sImgUrl ;
   private String imgprompt_4_Internalname ;
   private String imgprompt_4_Link ;
   private String edtunid_id_Internalname ;
   private String edtunid_id_Jsonclick ;
   private String imgprompt_6_gximage ;
   private String imgprompt_6_Internalname ;
   private String imgprompt_6_Link ;
   private String edtlot_data_lotacao_Internalname ;
   private String edtlot_data_lotacao_Jsonclick ;
   private String edtlot_data_remocao_Internalname ;
   private String edtlot_data_remocao_Jsonclick ;
   private String edtlot_portaria_Internalname ;
   private String edtlot_portaria_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode4 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z17lot_data_lotacao ;
   private java.util.Date Z18lot_data_remocao ;
   private java.util.Date A17lot_data_lotacao ;
   private java.util.Date A18lot_data_remocao ;
   private java.util.Date ZZ17lot_data_lotacao ;
   private java.util.Date ZZ18lot_data_remocao ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n17lot_data_lotacao ;
   private boolean n18lot_data_remocao ;
   private boolean n19lot_portaria ;
   private String Z19lot_portaria ;
   private String A19lot_portaria ;
   private String ZZ19lot_portaria ;
   private com.genexus.webpanels.GXWebForm Form ;
   private IDataStoreProvider pr_default ;
   private int[] T00046_A5lot_id ;
   private java.util.Date[] T00046_A17lot_data_lotacao ;
   private boolean[] T00046_n17lot_data_lotacao ;
   private java.util.Date[] T00046_A18lot_data_remocao ;
   private boolean[] T00046_n18lot_data_remocao ;
   private String[] T00046_A19lot_portaria ;
   private boolean[] T00046_n19lot_portaria ;
   private int[] T00046_A4pes_id ;
   private int[] T00046_A6unid_id ;
   private int[] T00044_A4pes_id ;
   private int[] T00045_A6unid_id ;
   private int[] T00047_A4pes_id ;
   private int[] T00048_A6unid_id ;
   private int[] T00049_A5lot_id ;
   private int[] T00043_A5lot_id ;
   private java.util.Date[] T00043_A17lot_data_lotacao ;
   private boolean[] T00043_n17lot_data_lotacao ;
   private java.util.Date[] T00043_A18lot_data_remocao ;
   private boolean[] T00043_n18lot_data_remocao ;
   private String[] T00043_A19lot_portaria ;
   private boolean[] T00043_n19lot_portaria ;
   private int[] T00043_A4pes_id ;
   private int[] T00043_A6unid_id ;
   private int[] T000410_A5lot_id ;
   private int[] T000411_A5lot_id ;
   private int[] T00042_A5lot_id ;
   private java.util.Date[] T00042_A17lot_data_lotacao ;
   private boolean[] T00042_n17lot_data_lotacao ;
   private java.util.Date[] T00042_A18lot_data_remocao ;
   private boolean[] T00042_n18lot_data_remocao ;
   private String[] T00042_A19lot_portaria ;
   private boolean[] T00042_n19lot_portaria ;
   private int[] T00042_A4pes_id ;
   private int[] T00042_A6unid_id ;
   private int[] T000413_A5lot_id ;
   private int[] T000416_A5lot_id ;
   private int[] T000417_A4pes_id ;
   private int[] T000418_A6unid_id ;
}

final  class lotacao__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00042", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ?  FOR UPDATE OF lotacao NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00043", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00044", "SELECT pes_id FROM Pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00045", "SELECT unid_id FROM Unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00046", "SELECT TM1.lot_id, TM1.lot_data_lotacao, TM1.lot_data_remocao, TM1.lot_portaria, TM1.pes_id, TM1.unid_id FROM lotacao TM1 WHERE TM1.lot_id = ? ORDER BY TM1.lot_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00047", "SELECT pes_id FROM Pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00048", "SELECT unid_id FROM Unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00049", "SELECT lot_id FROM lotacao WHERE lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000410", "SELECT lot_id FROM lotacao WHERE ( lot_id > ?) ORDER BY lot_id  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000411", "SELECT lot_id FROM lotacao WHERE ( lot_id < ?) ORDER BY lot_id DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000412", "SAVEPOINT gxupdate;INSERT INTO lotacao(lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id) VALUES(?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000413", "SELECT currval('lot_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000414", "SAVEPOINT gxupdate;UPDATE lotacao SET lot_data_lotacao=?, lot_data_remocao=?, lot_portaria=?, pes_id=?, unid_id=?  WHERE lot_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000415", "SAVEPOINT gxupdate;DELETE FROM lotacao  WHERE lot_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000416", "SELECT lot_id FROM lotacao ORDER BY lot_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000417", "SELECT pes_id FROM Pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000418", "SELECT unid_id FROM Unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 100);
               }
               stmt.setInt(4, ((Number) parms[6]).intValue());
               stmt.setInt(5, ((Number) parms[7]).intValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 100);
               }
               stmt.setInt(4, ((Number) parms[6]).intValue());
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setInt(6, ((Number) parms[8]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 16 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

