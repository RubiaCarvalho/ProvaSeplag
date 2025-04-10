package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class end_funcional_impl extends GXDataArea
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
         A33unidade_id = (int)(GXutil.lval( httpContext.GetPar( "unidade_id"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A33unidade_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A33unidade_id), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A33unidade_id) ;
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
      Form.getMeta().addItem("description", "End_Funcional", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtend_funcional_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Treinamento2", true);
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public end_funcional_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public end_funcional_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( end_funcional_impl.class ));
   }

   public end_funcional_impl( int remoteHandle ,
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
      com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "End_Funcional", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "heading-01", 0, "", 1, 1, 0, (short)(0), "HLP_End_Funcional.htm");
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
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_End_Funcional.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-prev" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_End_Funcional.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-next" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_End_Funcional.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-last" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_End_Funcional.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "Button button-secondary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Selecionar", bttBtn_select_Jsonclick, 4, "Selecionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.treinamento2.gx00c0"+"',["+"{Ctrl:gx.dom.el('"+"END_FUNCIONAL_ID"+"'), id:'"+"END_FUNCIONAL_ID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_End_Funcional.htm");
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
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_funcional_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtend_funcional_id_Internalname, "end_funcional_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtend_funcional_id_Internalname, GXutil.ltrim( localUtil.ntoc( A42end_funcional_id, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( ((edtend_funcional_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A42end_funcional_id), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A42end_funcional_id), "ZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtend_funcional_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtend_funcional_id_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_End_Funcional.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtunidade_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtunidade_id_Internalname, "unidade_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtunidade_id_Internalname, GXutil.ltrim( localUtil.ntoc( A33unidade_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtunidade_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A33unidade_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A33unidade_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtunidade_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtunidade_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Id", "end", false, "", "HLP_End_Funcional.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_33_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_33_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
      com.treinamento2.GxWebStd.gx_bitmap( httpContext, imgprompt_33_Internalname, sImgUrl, imgprompt_33_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_33_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_End_Funcional.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtendereco_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtendereco_id_Internalname, "endereco_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtendereco_id_Internalname, GXutil.ltrim( localUtil.ntoc( A30endereco_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtendereco_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30endereco_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30endereco_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtendereco_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtendereco_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Id", "end", false, "", "HLP_End_Funcional.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "Button button-primary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_End_Funcional.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Fechar", bttBtn_cancel_Jsonclick, 1, "Fechar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_End_Funcional.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_End_Funcional.htm");
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
         Z42end_funcional_id = (short)(localUtil.ctol( httpContext.cgiGet( "Z42end_funcional_id"), ",", ".")) ;
         Z33unidade_id = (int)(localUtil.ctol( httpContext.cgiGet( "Z33unidade_id"), ",", ".")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtend_funcional_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtend_funcional_id_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "END_FUNCIONAL_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtend_funcional_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A42end_funcional_id = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A42end_funcional_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A42end_funcional_id), 4, 0));
         }
         else
         {
            A42end_funcional_id = (short)(localUtil.ctol( httpContext.cgiGet( edtend_funcional_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A42end_funcional_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A42end_funcional_id), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtunidade_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtunidade_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "UNIDADE_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtunidade_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A33unidade_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A33unidade_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A33unidade_id), 8, 0));
         }
         else
         {
            A33unidade_id = (int)(localUtil.ctol( httpContext.cgiGet( edtunidade_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A33unidade_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A33unidade_id), 8, 0));
         }
         A30endereco_id = (int)(localUtil.ctol( httpContext.cgiGet( edtendereco_id_Internalname), ",", ".")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30endereco_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30endereco_id), 8, 0));
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
            A42end_funcional_id = (short)(GXutil.lval( httpContext.GetPar( "end_funcional_id"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A42end_funcional_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A42end_funcional_id), 4, 0));
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
            initAll0C12( ) ;
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
      disableAttributes0C12( ) ;
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

   public void resetCaption0C0( )
   {
   }

   public void zm0C12( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z33unidade_id = T000C3_A33unidade_id[0] ;
         }
         else
         {
            Z33unidade_id = A33unidade_id ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z42end_funcional_id = A42end_funcional_id ;
         Z33unidade_id = A33unidade_id ;
         Z30endereco_id = A30endereco_id ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_33_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.treinamento2.gx00a0"+"',["+"{Ctrl:gx.dom.el('"+"UNIDADE_ID"+"'), id:'"+"UNIDADE_ID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
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

   public void load0C12( )
   {
      /* Using cursor T000C5 */
      pr_default.execute(3, new Object[] {Short.valueOf(A42end_funcional_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A33unidade_id = T000C5_A33unidade_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33unidade_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A33unidade_id), 8, 0));
         A30endereco_id = T000C5_A30endereco_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30endereco_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30endereco_id), 8, 0));
         zm0C12( -1) ;
      }
      pr_default.close(3);
      onLoadActions0C12( ) ;
   }

   public void onLoadActions0C12( )
   {
   }

   public void checkExtendedTable0C12( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T000C4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A33unidade_id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'unidade_endereco'.", "ForeignKeyNotFound", 1, "UNIDADE_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunidade_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A30endereco_id = T000C4_A30endereco_id[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A30endereco_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30endereco_id), 8, 0));
      pr_default.close(2);
   }

   public void closeExtendedTableCursors0C12( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( int A33unidade_id )
   {
      /* Using cursor T000C6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A33unidade_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'unidade_endereco'.", "ForeignKeyNotFound", 1, "UNIDADE_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunidade_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A30endereco_id = T000C6_A30endereco_id[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A30endereco_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30endereco_id), 8, 0));
      com.treinamento2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30endereco_id, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey0C12( )
   {
      /* Using cursor T000C7 */
      pr_default.execute(5, new Object[] {Short.valueOf(A42end_funcional_id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000C3 */
      pr_default.execute(1, new Object[] {Short.valueOf(A42end_funcional_id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0C12( 1) ;
         RcdFound12 = (short)(1) ;
         A42end_funcional_id = T000C3_A42end_funcional_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42end_funcional_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A42end_funcional_id), 4, 0));
         A33unidade_id = T000C3_A33unidade_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33unidade_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A33unidade_id), 8, 0));
         Z42end_funcional_id = A42end_funcional_id ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0C12( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey0C12( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey0C12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0C12( ) ;
      if ( RcdFound12 == 0 )
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
      RcdFound12 = (short)(0) ;
      /* Using cursor T000C8 */
      pr_default.execute(6, new Object[] {Short.valueOf(A42end_funcional_id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000C8_A42end_funcional_id[0] < A42end_funcional_id ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000C8_A42end_funcional_id[0] > A42end_funcional_id ) ) )
         {
            A42end_funcional_id = T000C8_A42end_funcional_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A42end_funcional_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A42end_funcional_id), 4, 0));
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T000C9 */
      pr_default.execute(7, new Object[] {Short.valueOf(A42end_funcional_id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T000C9_A42end_funcional_id[0] > A42end_funcional_id ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T000C9_A42end_funcional_id[0] < A42end_funcional_id ) ) )
         {
            A42end_funcional_id = T000C9_A42end_funcional_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A42end_funcional_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A42end_funcional_id), 4, 0));
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0C12( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtend_funcional_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0C12( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound12 == 1 )
         {
            if ( A42end_funcional_id != Z42end_funcional_id )
            {
               A42end_funcional_id = Z42end_funcional_id ;
               httpContext.ajax_rsp_assign_attri("", false, "A42end_funcional_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A42end_funcional_id), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "END_FUNCIONAL_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtend_funcional_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtend_funcional_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0C12( ) ;
               GX_FocusControl = edtend_funcional_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A42end_funcional_id != Z42end_funcional_id )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtend_funcional_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0C12( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "END_FUNCIONAL_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtend_funcional_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtend_funcional_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0C12( ) ;
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
      if ( A42end_funcional_id != Z42end_funcional_id )
      {
         A42end_funcional_id = Z42end_funcional_id ;
         httpContext.ajax_rsp_assign_attri("", false, "A42end_funcional_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A42end_funcional_id), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "END_FUNCIONAL_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtend_funcional_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtend_funcional_id_Internalname ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "END_FUNCIONAL_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtend_funcional_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtunidade_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart0C12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtunidade_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0C12( ) ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtunidade_id_Internalname ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtunidade_id_Internalname ;
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
      scanStart0C12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound12 != 0 )
         {
            scanNext0C12( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtunidade_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0C12( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0C12( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000C2 */
         pr_default.execute(0, new Object[] {Short.valueOf(A42end_funcional_id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"End_Funcional"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z33unidade_id != T000C2_A33unidade_id[0] ) )
         {
            if ( Z33unidade_id != T000C2_A33unidade_id[0] )
            {
               GXutil.writeLogln("end_funcional:[seudo value changed for attri]"+"unidade_id");
               GXutil.writeLogRaw("Old: ",Z33unidade_id);
               GXutil.writeLogRaw("Current: ",T000C2_A33unidade_id[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"End_Funcional"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0C12( )
   {
      beforeValidate0C12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C12( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0C12( 0) ;
         checkOptimisticConcurrency0C12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0C12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C10 */
                  pr_default.execute(8, new Object[] {Short.valueOf(A42end_funcional_id), Integer.valueOf(A33unidade_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("End_Funcional");
                  if ( (pr_default.getStatus(8) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption0C0( ) ;
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
            load0C12( ) ;
         }
         endLevel0C12( ) ;
      }
      closeExtendedTableCursors0C12( ) ;
   }

   public void update0C12( )
   {
      beforeValidate0C12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0C12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A33unidade_id), Short.valueOf(A42end_funcional_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("End_Funcional");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"End_Funcional"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0C12( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption0C0( ) ;
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
         endLevel0C12( ) ;
      }
      closeExtendedTableCursors0C12( ) ;
   }

   public void deferredUpdate0C12( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0C12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0C12( ) ;
         afterConfirm0C12( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0C12( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000C12 */
               pr_default.execute(10, new Object[] {Short.valueOf(A42end_funcional_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("End_Funcional");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound12 == 0 )
                     {
                        initAll0C12( ) ;
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
                     resetCaption0C0( ) ;
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0C12( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0C12( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000C13 */
         pr_default.execute(11, new Object[] {Integer.valueOf(A33unidade_id)});
         A30endereco_id = T000C13_A30endereco_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30endereco_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30endereco_id), 8, 0));
         pr_default.close(11);
      }
   }

   public void endLevel0C12( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0C12( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "end_funcional");
         if ( AnyError == 0 )
         {
            confirmValues0C0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "end_funcional");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0C12( )
   {
      /* Using cursor T000C14 */
      pr_default.execute(12);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A42end_funcional_id = T000C14_A42end_funcional_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42end_funcional_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A42end_funcional_id), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0C12( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A42end_funcional_id = T000C14_A42end_funcional_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42end_funcional_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A42end_funcional_id), 4, 0));
      }
   }

   public void scanEnd0C12( )
   {
      pr_default.close(12);
   }

   public void afterConfirm0C12( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0C12( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0C12( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0C12( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0C12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0C12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0C12( )
   {
      edtend_funcional_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_funcional_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_funcional_id_Enabled), 5, 0), true);
      edtunidade_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtunidade_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtunidade_id_Enabled), 5, 0), true);
      edtendereco_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtendereco_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtendereco_id_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes0C12( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0C0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.treinamento2.end_funcional", new String[] {}, new String[] {}) +"\">") ;
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
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z42end_funcional_id", GXutil.ltrim( localUtil.ntoc( Z42end_funcional_id, (byte)(4), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z33unidade_id", GXutil.ltrim( localUtil.ntoc( Z33unidade_id, (byte)(8), (byte)(0), ",", "")));
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
      return formatLink("com.treinamento2.end_funcional", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "End_Funcional" ;
   }

   public String getPgmdesc( )
   {
      return "End_Funcional" ;
   }

   public void initializeNonKey0C12( )
   {
      A33unidade_id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A33unidade_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A33unidade_id), 8, 0));
      A30endereco_id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30endereco_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30endereco_id), 8, 0));
      Z33unidade_id = 0 ;
   }

   public void initAll0C12( )
   {
      A42end_funcional_id = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A42end_funcional_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A42end_funcional_id), 4, 0));
      initializeNonKey0C12( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2025481965929", true, true);
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
      httpContext.AddJavascriptSource("end_funcional.js", "?2025481965929", false, true);
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
      edtend_funcional_id_Internalname = "END_FUNCIONAL_ID" ;
      edtunidade_id_Internalname = "UNIDADE_ID" ;
      edtendereco_id_Internalname = "ENDERECO_ID" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_33_Internalname = "PROMPT_33" ;
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
      Form.setCaption( "End_Funcional" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtendereco_id_Jsonclick = "" ;
      edtendereco_id_Enabled = 0 ;
      imgprompt_33_Visible = 1 ;
      imgprompt_33_Link = "" ;
      edtunidade_id_Jsonclick = "" ;
      edtunidade_id_Enabled = 1 ;
      edtend_funcional_id_Jsonclick = "" ;
      edtend_funcional_id_Enabled = 1 ;
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
      GX_FocusControl = edtunidade_id_Internalname ;
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

   public void valid_End_funcional_id( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A33unidade_id", GXutil.ltrim( localUtil.ntoc( A33unidade_id, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A30endereco_id", GXutil.ltrim( localUtil.ntoc( A30endereco_id, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z42end_funcional_id", GXutil.ltrim( localUtil.ntoc( Z42end_funcional_id, (byte)(4), (byte)(0), ".", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z33unidade_id", GXutil.ltrim( localUtil.ntoc( Z33unidade_id, (byte)(8), (byte)(0), ".", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z30endereco_id", GXutil.ltrim( localUtil.ntoc( Z30endereco_id, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Unidade_id( )
   {
      /* Using cursor T000C13 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A33unidade_id)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'unidade_endereco'.", "ForeignKeyNotFound", 1, "UNIDADE_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunidade_id_Internalname ;
      }
      A30endereco_id = T000C13_A30endereco_id[0] ;
      pr_default.close(11);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A30endereco_id", GXutil.ltrim( localUtil.ntoc( A30endereco_id, (byte)(8), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_END_FUNCIONAL_ID","{handler:'valid_End_funcional_id',iparms:[{av:'A42end_funcional_id',fld:'END_FUNCIONAL_ID',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_END_FUNCIONAL_ID",",oparms:[{av:'A33unidade_id',fld:'UNIDADE_ID',pic:'ZZZZZZZ9'},{av:'A30endereco_id',fld:'ENDERECO_ID',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z42end_funcional_id'},{av:'Z33unidade_id'},{av:'Z30endereco_id'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_UNIDADE_ID","{handler:'valid_Unidade_id',iparms:[{av:'A33unidade_id',fld:'UNIDADE_ID',pic:'ZZZZZZZ9'},{av:'A30endereco_id',fld:'ENDERECO_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_UNIDADE_ID",",oparms:[{av:'A30endereco_id',fld:'ENDERECO_ID',pic:'ZZZZZZZ9'}]}");
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
      pr_default.close(11);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
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
      imgprompt_33_gximage = "" ;
      sImgUrl = "" ;
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
      T000C5_A42end_funcional_id = new short[1] ;
      T000C5_A33unidade_id = new int[1] ;
      T000C5_A30endereco_id = new int[1] ;
      T000C4_A30endereco_id = new int[1] ;
      T000C6_A30endereco_id = new int[1] ;
      T000C7_A42end_funcional_id = new short[1] ;
      T000C3_A42end_funcional_id = new short[1] ;
      T000C3_A33unidade_id = new int[1] ;
      sMode12 = "" ;
      T000C8_A42end_funcional_id = new short[1] ;
      T000C9_A42end_funcional_id = new short[1] ;
      T000C2_A42end_funcional_id = new short[1] ;
      T000C2_A33unidade_id = new int[1] ;
      T000C13_A30endereco_id = new int[1] ;
      T000C14_A42end_funcional_id = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.end_funcional__default(),
         new Object[] {
             new Object[] {
            T000C2_A42end_funcional_id, T000C2_A33unidade_id
            }
            , new Object[] {
            T000C3_A42end_funcional_id, T000C3_A33unidade_id
            }
            , new Object[] {
            T000C4_A30endereco_id
            }
            , new Object[] {
            T000C5_A42end_funcional_id, T000C5_A33unidade_id, T000C5_A30endereco_id
            }
            , new Object[] {
            T000C6_A30endereco_id
            }
            , new Object[] {
            T000C7_A42end_funcional_id
            }
            , new Object[] {
            T000C8_A42end_funcional_id
            }
            , new Object[] {
            T000C9_A42end_funcional_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000C13_A30endereco_id
            }
            , new Object[] {
            T000C14_A42end_funcional_id
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z42end_funcional_id ;
   private short gxcookieaux ;
   private short AnyError ;
   private short IsModified ;
   private short IsConfirmed ;
   private short A42end_funcional_id ;
   private short RcdFound12 ;
   private short ZZ42end_funcional_id ;
   private int Z33unidade_id ;
   private int A33unidade_id ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtend_funcional_id_Enabled ;
   private int edtunidade_id_Enabled ;
   private int imgprompt_33_Visible ;
   private int A30endereco_id ;
   private int edtendereco_id_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int Z30endereco_id ;
   private int idxLst ;
   private int ZZ33unidade_id ;
   private int ZZ30endereco_id ;
   private String sPrefix ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtend_funcional_id_Internalname ;
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
   private String edtend_funcional_id_Jsonclick ;
   private String edtunidade_id_Internalname ;
   private String edtunidade_id_Jsonclick ;
   private String imgprompt_33_gximage ;
   private String sImgUrl ;
   private String imgprompt_33_Internalname ;
   private String imgprompt_33_Link ;
   private String edtendereco_id_Internalname ;
   private String edtendereco_id_Jsonclick ;
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
   private String sMode12 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private com.genexus.webpanels.GXWebForm Form ;
   private IDataStoreProvider pr_default ;
   private short[] T000C5_A42end_funcional_id ;
   private int[] T000C5_A33unidade_id ;
   private int[] T000C5_A30endereco_id ;
   private int[] T000C4_A30endereco_id ;
   private int[] T000C6_A30endereco_id ;
   private short[] T000C7_A42end_funcional_id ;
   private short[] T000C3_A42end_funcional_id ;
   private int[] T000C3_A33unidade_id ;
   private short[] T000C8_A42end_funcional_id ;
   private short[] T000C9_A42end_funcional_id ;
   private short[] T000C2_A42end_funcional_id ;
   private int[] T000C2_A33unidade_id ;
   private int[] T000C13_A30endereco_id ;
   private short[] T000C14_A42end_funcional_id ;
}

final  class end_funcional__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000C2", "SELECT end_funcional_id, unidade_id FROM End_Funcional WHERE end_funcional_id = ?  FOR UPDATE OF End_Funcional NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000C3", "SELECT end_funcional_id, unidade_id FROM End_Funcional WHERE end_funcional_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000C4", "SELECT endereco_id FROM unidade_endereco WHERE unidade_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000C5", "SELECT TM1.end_funcional_id, TM1.unidade_id, T2.endereco_id FROM (End_Funcional TM1 INNER JOIN unidade_endereco T2 ON T2.unidade_id = TM1.unidade_id) WHERE TM1.end_funcional_id = ? ORDER BY TM1.end_funcional_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000C6", "SELECT endereco_id FROM unidade_endereco WHERE unidade_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000C7", "SELECT end_funcional_id FROM End_Funcional WHERE end_funcional_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000C8", "SELECT end_funcional_id FROM End_Funcional WHERE ( end_funcional_id > ?) ORDER BY end_funcional_id  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000C9", "SELECT end_funcional_id FROM End_Funcional WHERE ( end_funcional_id < ?) ORDER BY end_funcional_id DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000C10", "SAVEPOINT gxupdate;INSERT INTO End_Funcional(end_funcional_id, unidade_id) VALUES(?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000C11", "SAVEPOINT gxupdate;UPDATE End_Funcional SET unidade_id=?  WHERE end_funcional_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000C12", "SAVEPOINT gxupdate;DELETE FROM End_Funcional  WHERE end_funcional_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000C13", "SELECT endereco_id FROM unidade_endereco WHERE unidade_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000C14", "SELECT end_funcional_id FROM End_Funcional ORDER BY end_funcional_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

