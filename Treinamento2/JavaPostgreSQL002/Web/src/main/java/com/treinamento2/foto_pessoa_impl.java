package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class foto_pessoa_impl extends GXDataArea
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
      Form.getMeta().addItem("description", "foto_pessoa", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtfp_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Treinamento2", true);
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public foto_pessoa_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public foto_pessoa_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( foto_pessoa_impl.class ));
   }

   public foto_pessoa_impl( int remoteHandle ,
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
      com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "foto_pessoa", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "heading-01", 0, "", 1, 1, 0, (short)(0), "HLP_foto_pessoa.htm");
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
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_foto_pessoa.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-prev" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_foto_pessoa.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-next" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_foto_pessoa.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-last" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_foto_pessoa.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "Button button-secondary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Selecionar", bttBtn_select_Jsonclick, 4, "Selecionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.treinamento2.gx0030"+"',["+"{Ctrl:gx.dom.el('"+"FP_ID"+"'), id:'"+"FP_ID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_foto_pessoa.htm");
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
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtfp_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtfp_id_Internalname, "fp_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtfp_id_Internalname, GXutil.ltrim( localUtil.ntoc( A3fp_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtfp_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3fp_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3fp_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtfp_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtfp_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Id", "end", false, "", "HLP_foto_pessoa.htm");
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
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtpes_id_Internalname, GXutil.ltrim( localUtil.ntoc( A4pes_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtpes_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4pes_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4pes_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtpes_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtpes_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Id", "end", false, "", "HLP_foto_pessoa.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_4_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_4_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
      com.treinamento2.GxWebStd.gx_bitmap( httpContext, imgprompt_4_Internalname, sImgUrl, imgprompt_4_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_4_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_foto_pessoa.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtfp_data_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtfp_data_Internalname, "fp_data", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtfp_data_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtfp_data_Internalname, localUtil.format(A14fp_data, "99/99/99"), localUtil.format( A14fp_data, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'por',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'por',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtfp_data_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtfp_data_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_foto_pessoa.htm");
      com.treinamento2.GxWebStd.gx_bitmap( httpContext, edtfp_data_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtfp_data_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_foto_pessoa.htm");
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
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtfp_bucket_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtfp_bucket_Internalname, "fp_bucket", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtfp_bucket_Internalname, A15fp_bucket, GXutil.rtrim( localUtil.format( A15fp_bucket, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtfp_bucket_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtfp_bucket_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_foto_pessoa.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtfp_hash_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtfp_hash_Internalname, "fp_hash", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtfp_hash_Internalname, A16fp_hash, GXutil.rtrim( localUtil.format( A16fp_hash, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtfp_hash_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtfp_hash_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_foto_pessoa.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "Button button-primary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_foto_pessoa.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Fechar", bttBtn_cancel_Jsonclick, 1, "Fechar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_foto_pessoa.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_foto_pessoa.htm");
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
         Z3fp_id = (int)(localUtil.ctol( httpContext.cgiGet( "Z3fp_id"), ",", ".")) ;
         Z14fp_data = localUtil.ctod( httpContext.cgiGet( "Z14fp_data"), 0) ;
         n14fp_data = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14fp_data)) ? true : false) ;
         Z15fp_bucket = httpContext.cgiGet( "Z15fp_bucket") ;
         n15fp_bucket = ((GXutil.strcmp("", A15fp_bucket)==0) ? true : false) ;
         Z16fp_hash = httpContext.cgiGet( "Z16fp_hash") ;
         n16fp_hash = ((GXutil.strcmp("", A16fp_hash)==0) ? true : false) ;
         Z4pes_id = (int)(localUtil.ctol( httpContext.cgiGet( "Z4pes_id"), ",", ".")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtfp_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtfp_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FP_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtfp_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3fp_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3fp_id), 8, 0));
         }
         else
         {
            A3fp_id = (int)(localUtil.ctol( httpContext.cgiGet( edtfp_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3fp_id), 8, 0));
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
         if ( localUtil.vcdate( httpContext.cgiGet( edtfp_data_Internalname), (byte)(3)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FP_DATA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtfp_data_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14fp_data = GXutil.nullDate() ;
            n14fp_data = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14fp_data", localUtil.format(A14fp_data, "99/99/99"));
         }
         else
         {
            A14fp_data = localUtil.ctod( httpContext.cgiGet( edtfp_data_Internalname), 3) ;
            n14fp_data = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14fp_data", localUtil.format(A14fp_data, "99/99/99"));
         }
         n14fp_data = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14fp_data)) ? true : false) ;
         A15fp_bucket = httpContext.cgiGet( edtfp_bucket_Internalname) ;
         n15fp_bucket = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A15fp_bucket", A15fp_bucket);
         n15fp_bucket = ((GXutil.strcmp("", A15fp_bucket)==0) ? true : false) ;
         A16fp_hash = httpContext.cgiGet( edtfp_hash_Internalname) ;
         n16fp_hash = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A16fp_hash", A16fp_hash);
         n16fp_hash = ((GXutil.strcmp("", A16fp_hash)==0) ? true : false) ;
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
            A3fp_id = (int)(GXutil.lval( httpContext.GetPar( "fp_id"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3fp_id), 8, 0));
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
            initAll033( ) ;
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
      disableAttributes033( ) ;
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

   public void resetCaption030( )
   {
   }

   public void zm033( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14fp_data = T00033_A14fp_data[0] ;
            Z15fp_bucket = T00033_A15fp_bucket[0] ;
            Z16fp_hash = T00033_A16fp_hash[0] ;
            Z4pes_id = T00033_A4pes_id[0] ;
         }
         else
         {
            Z14fp_data = A14fp_data ;
            Z15fp_bucket = A15fp_bucket ;
            Z16fp_hash = A16fp_hash ;
            Z4pes_id = A4pes_id ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z3fp_id = A3fp_id ;
         Z14fp_data = A14fp_data ;
         Z15fp_bucket = A15fp_bucket ;
         Z16fp_hash = A16fp_hash ;
         Z4pes_id = A4pes_id ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_4_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.treinamento2.gx0050"+"',["+"{Ctrl:gx.dom.el('"+"PES_ID"+"'), id:'"+"PES_ID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
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

   public void load033( )
   {
      /* Using cursor T00035 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A3fp_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A14fp_data = T00035_A14fp_data[0] ;
         n14fp_data = T00035_n14fp_data[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14fp_data", localUtil.format(A14fp_data, "99/99/99"));
         A15fp_bucket = T00035_A15fp_bucket[0] ;
         n15fp_bucket = T00035_n15fp_bucket[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A15fp_bucket", A15fp_bucket);
         A16fp_hash = T00035_A16fp_hash[0] ;
         n16fp_hash = T00035_n16fp_hash[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16fp_hash", A16fp_hash);
         A4pes_id = T00035_A4pes_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4pes_id), 8, 0));
         zm033( -1) ;
      }
      pr_default.close(3);
      onLoadActions033( ) ;
   }

   public void onLoadActions033( )
   {
   }

   public void checkExtendedTable033( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00034 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A4pes_id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'Pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtpes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors033( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( int A4pes_id )
   {
      /* Using cursor T00036 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A4pes_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'Pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtpes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      com.treinamento2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey033( )
   {
      /* Using cursor T00037 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A3fp_id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00033 */
      pr_default.execute(1, new Object[] {Integer.valueOf(A3fp_id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm033( 1) ;
         RcdFound3 = (short)(1) ;
         A3fp_id = T00033_A3fp_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3fp_id), 8, 0));
         A14fp_data = T00033_A14fp_data[0] ;
         n14fp_data = T00033_n14fp_data[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14fp_data", localUtil.format(A14fp_data, "99/99/99"));
         A15fp_bucket = T00033_A15fp_bucket[0] ;
         n15fp_bucket = T00033_n15fp_bucket[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A15fp_bucket", A15fp_bucket);
         A16fp_hash = T00033_A16fp_hash[0] ;
         n16fp_hash = T00033_n16fp_hash[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16fp_hash", A16fp_hash);
         A4pes_id = T00033_A4pes_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4pes_id), 8, 0));
         Z3fp_id = A3fp_id ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load033( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey033( ) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey033( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey033( ) ;
      if ( RcdFound3 == 0 )
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
      RcdFound3 = (short)(0) ;
      /* Using cursor T00038 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A3fp_id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T00038_A3fp_id[0] < A3fp_id ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T00038_A3fp_id[0] > A3fp_id ) ) )
         {
            A3fp_id = T00038_A3fp_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3fp_id), 8, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T00039 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A3fp_id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T00039_A3fp_id[0] > A3fp_id ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T00039_A3fp_id[0] < A3fp_id ) ) )
         {
            A3fp_id = T00039_A3fp_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3fp_id), 8, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey033( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtfp_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert033( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound3 == 1 )
         {
            if ( A3fp_id != Z3fp_id )
            {
               A3fp_id = Z3fp_id ;
               httpContext.ajax_rsp_assign_attri("", false, "A3fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3fp_id), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "FP_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtfp_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtfp_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update033( ) ;
               GX_FocusControl = edtfp_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A3fp_id != Z3fp_id )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtfp_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert033( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "FP_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtfp_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtfp_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert033( ) ;
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
      if ( A3fp_id != Z3fp_id )
      {
         A3fp_id = Z3fp_id ;
         httpContext.ajax_rsp_assign_attri("", false, "A3fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3fp_id), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "FP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtfp_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtfp_id_Internalname ;
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
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "FP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtfp_id_Internalname ;
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
      scanStart033( ) ;
      if ( RcdFound3 == 0 )
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
      scanEnd033( ) ;
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
      if ( RcdFound3 == 0 )
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
      if ( RcdFound3 == 0 )
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
      scanStart033( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound3 != 0 )
         {
            scanNext033( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtpes_id_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd033( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency033( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00032 */
         pr_default.execute(0, new Object[] {Integer.valueOf(A3fp_id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"foto_pessoa"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z14fp_data), GXutil.resetTime(T00032_A14fp_data[0])) ) || ( GXutil.strcmp(Z15fp_bucket, T00032_A15fp_bucket[0]) != 0 ) || ( GXutil.strcmp(Z16fp_hash, T00032_A16fp_hash[0]) != 0 ) || ( Z4pes_id != T00032_A4pes_id[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z14fp_data), GXutil.resetTime(T00032_A14fp_data[0])) ) )
            {
               GXutil.writeLogln("foto_pessoa:[seudo value changed for attri]"+"fp_data");
               GXutil.writeLogRaw("Old: ",Z14fp_data);
               GXutil.writeLogRaw("Current: ",T00032_A14fp_data[0]);
            }
            if ( GXutil.strcmp(Z15fp_bucket, T00032_A15fp_bucket[0]) != 0 )
            {
               GXutil.writeLogln("foto_pessoa:[seudo value changed for attri]"+"fp_bucket");
               GXutil.writeLogRaw("Old: ",Z15fp_bucket);
               GXutil.writeLogRaw("Current: ",T00032_A15fp_bucket[0]);
            }
            if ( GXutil.strcmp(Z16fp_hash, T00032_A16fp_hash[0]) != 0 )
            {
               GXutil.writeLogln("foto_pessoa:[seudo value changed for attri]"+"fp_hash");
               GXutil.writeLogRaw("Old: ",Z16fp_hash);
               GXutil.writeLogRaw("Current: ",T00032_A16fp_hash[0]);
            }
            if ( Z4pes_id != T00032_A4pes_id[0] )
            {
               GXutil.writeLogln("foto_pessoa:[seudo value changed for attri]"+"pes_id");
               GXutil.writeLogRaw("Old: ",Z4pes_id);
               GXutil.writeLogRaw("Current: ",T00032_A4pes_id[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"foto_pessoa"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert033( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable033( ) ;
      }
      if ( AnyError == 0 )
      {
         zm033( 0) ;
         checkOptimisticConcurrency033( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm033( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert033( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000310 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n14fp_data), A14fp_data, Boolean.valueOf(n15fp_bucket), A15fp_bucket, Boolean.valueOf(n16fp_hash), A16fp_hash, Integer.valueOf(A4pes_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000311 */
                  pr_default.execute(9);
                  A3fp_id = T000311_A3fp_id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3fp_id), 8, 0));
                  pr_default.close(9);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("foto_pessoa");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption030( ) ;
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
            load033( ) ;
         }
         endLevel033( ) ;
      }
      closeExtendedTableCursors033( ) ;
   }

   public void update033( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable033( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency033( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm033( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate033( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000312 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n14fp_data), A14fp_data, Boolean.valueOf(n15fp_bucket), A15fp_bucket, Boolean.valueOf(n16fp_hash), A16fp_hash, Integer.valueOf(A4pes_id), Integer.valueOf(A3fp_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("foto_pessoa");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"foto_pessoa"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate033( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption030( ) ;
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
         endLevel033( ) ;
      }
      closeExtendedTableCursors033( ) ;
   }

   public void deferredUpdate033( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency033( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls033( ) ;
         afterConfirm033( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete033( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000313 */
               pr_default.execute(11, new Object[] {Integer.valueOf(A3fp_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("foto_pessoa");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound3 == 0 )
                     {
                        initAll033( ) ;
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
                     resetCaption030( ) ;
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel033( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls033( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel033( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete033( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "foto_pessoa");
         if ( AnyError == 0 )
         {
            confirmValues030( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "foto_pessoa");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart033( )
   {
      /* Using cursor T000314 */
      pr_default.execute(12);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A3fp_id = T000314_A3fp_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3fp_id), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext033( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A3fp_id = T000314_A3fp_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3fp_id), 8, 0));
      }
   }

   public void scanEnd033( )
   {
      pr_default.close(12);
   }

   public void afterConfirm033( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert033( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate033( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete033( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete033( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate033( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes033( )
   {
      edtfp_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtfp_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtfp_id_Enabled), 5, 0), true);
      edtpes_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtpes_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtpes_id_Enabled), 5, 0), true);
      edtfp_data_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtfp_data_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtfp_data_Enabled), 5, 0), true);
      edtfp_bucket_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtfp_bucket_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtfp_bucket_Enabled), 5, 0), true);
      edtfp_hash_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtfp_hash_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtfp_hash_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes033( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues030( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.treinamento2.foto_pessoa", new String[] {}, new String[] {}) +"\">") ;
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
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z3fp_id", GXutil.ltrim( localUtil.ntoc( Z3fp_id, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z14fp_data", localUtil.dtoc( Z14fp_data, 0, "/"));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z15fp_bucket", Z15fp_bucket);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z16fp_hash", Z16fp_hash);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z4pes_id", GXutil.ltrim( localUtil.ntoc( Z4pes_id, (byte)(8), (byte)(0), ",", "")));
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
      return formatLink("com.treinamento2.foto_pessoa", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "foto_pessoa" ;
   }

   public String getPgmdesc( )
   {
      return "foto_pessoa" ;
   }

   public void initializeNonKey033( )
   {
      A4pes_id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4pes_id), 8, 0));
      A14fp_data = GXutil.nullDate() ;
      n14fp_data = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14fp_data", localUtil.format(A14fp_data, "99/99/99"));
      n14fp_data = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14fp_data)) ? true : false) ;
      A15fp_bucket = "" ;
      n15fp_bucket = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A15fp_bucket", A15fp_bucket);
      n15fp_bucket = ((GXutil.strcmp("", A15fp_bucket)==0) ? true : false) ;
      A16fp_hash = "" ;
      n16fp_hash = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A16fp_hash", A16fp_hash);
      n16fp_hash = ((GXutil.strcmp("", A16fp_hash)==0) ? true : false) ;
      Z14fp_data = GXutil.nullDate() ;
      Z15fp_bucket = "" ;
      Z16fp_hash = "" ;
      Z4pes_id = 0 ;
   }

   public void initAll033( )
   {
      A3fp_id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3fp_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3fp_id), 8, 0));
      initializeNonKey033( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20254815252383", true, true);
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
      httpContext.AddJavascriptSource("foto_pessoa.js", "?20254815252384", false, true);
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
      edtfp_id_Internalname = "FP_ID" ;
      edtpes_id_Internalname = "PES_ID" ;
      edtfp_data_Internalname = "FP_DATA" ;
      edtfp_bucket_Internalname = "FP_BUCKET" ;
      edtfp_hash_Internalname = "FP_HASH" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_4_Internalname = "PROMPT_4" ;
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
      Form.setCaption( "foto_pessoa" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtfp_hash_Jsonclick = "" ;
      edtfp_hash_Enabled = 1 ;
      edtfp_bucket_Jsonclick = "" ;
      edtfp_bucket_Enabled = 1 ;
      edtfp_data_Jsonclick = "" ;
      edtfp_data_Enabled = 1 ;
      imgprompt_4_Visible = 1 ;
      imgprompt_4_Link = "" ;
      edtpes_id_Jsonclick = "" ;
      edtpes_id_Enabled = 1 ;
      edtfp_id_Jsonclick = "" ;
      edtfp_id_Enabled = 1 ;
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

   public void valid_Fp_id( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4pes_id", GXutil.ltrim( localUtil.ntoc( A4pes_id, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14fp_data", localUtil.format(A14fp_data, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A15fp_bucket", A15fp_bucket);
      httpContext.ajax_rsp_assign_attri("", false, "A16fp_hash", A16fp_hash);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z3fp_id", GXutil.ltrim( localUtil.ntoc( Z3fp_id, (byte)(8), (byte)(0), ".", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z4pes_id", GXutil.ltrim( localUtil.ntoc( Z4pes_id, (byte)(8), (byte)(0), ".", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z14fp_data", localUtil.format(Z14fp_data, "99/99/99"));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z15fp_bucket", Z15fp_bucket);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z16fp_hash", Z16fp_hash);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Pes_id( )
   {
      /* Using cursor T000315 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A4pes_id)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'Pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtpes_id_Internalname ;
      }
      pr_default.close(13);
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
      setEventMetadata("VALID_FP_ID","{handler:'valid_Fp_id',iparms:[{av:'A3fp_id',fld:'FP_ID',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_FP_ID",",oparms:[{av:'A4pes_id',fld:'PES_ID',pic:'ZZZZZZZ9'},{av:'A14fp_data',fld:'FP_DATA',pic:''},{av:'A15fp_bucket',fld:'FP_BUCKET',pic:''},{av:'A16fp_hash',fld:'FP_HASH',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z3fp_id'},{av:'Z4pes_id'},{av:'Z14fp_data'},{av:'Z15fp_bucket'},{av:'Z16fp_hash'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_PES_ID","{handler:'valid_Pes_id',iparms:[{av:'A4pes_id',fld:'PES_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_PES_ID",",oparms:[]}");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z14fp_data = GXutil.nullDate() ;
      Z15fp_bucket = "" ;
      Z16fp_hash = "" ;
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
      A14fp_data = GXutil.nullDate() ;
      A15fp_bucket = "" ;
      A16fp_hash = "" ;
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
      T00035_A3fp_id = new int[1] ;
      T00035_A14fp_data = new java.util.Date[] {GXutil.nullDate()} ;
      T00035_n14fp_data = new boolean[] {false} ;
      T00035_A15fp_bucket = new String[] {""} ;
      T00035_n15fp_bucket = new boolean[] {false} ;
      T00035_A16fp_hash = new String[] {""} ;
      T00035_n16fp_hash = new boolean[] {false} ;
      T00035_A4pes_id = new int[1] ;
      T00034_A4pes_id = new int[1] ;
      T00036_A4pes_id = new int[1] ;
      T00037_A3fp_id = new int[1] ;
      T00033_A3fp_id = new int[1] ;
      T00033_A14fp_data = new java.util.Date[] {GXutil.nullDate()} ;
      T00033_n14fp_data = new boolean[] {false} ;
      T00033_A15fp_bucket = new String[] {""} ;
      T00033_n15fp_bucket = new boolean[] {false} ;
      T00033_A16fp_hash = new String[] {""} ;
      T00033_n16fp_hash = new boolean[] {false} ;
      T00033_A4pes_id = new int[1] ;
      sMode3 = "" ;
      T00038_A3fp_id = new int[1] ;
      T00039_A3fp_id = new int[1] ;
      T00032_A3fp_id = new int[1] ;
      T00032_A14fp_data = new java.util.Date[] {GXutil.nullDate()} ;
      T00032_n14fp_data = new boolean[] {false} ;
      T00032_A15fp_bucket = new String[] {""} ;
      T00032_n15fp_bucket = new boolean[] {false} ;
      T00032_A16fp_hash = new String[] {""} ;
      T00032_n16fp_hash = new boolean[] {false} ;
      T00032_A4pes_id = new int[1] ;
      T000311_A3fp_id = new int[1] ;
      T000314_A3fp_id = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ14fp_data = GXutil.nullDate() ;
      ZZ15fp_bucket = "" ;
      ZZ16fp_hash = "" ;
      T000315_A4pes_id = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.foto_pessoa__default(),
         new Object[] {
             new Object[] {
            T00032_A3fp_id, T00032_A14fp_data, T00032_n14fp_data, T00032_A15fp_bucket, T00032_n15fp_bucket, T00032_A16fp_hash, T00032_n16fp_hash, T00032_A4pes_id
            }
            , new Object[] {
            T00033_A3fp_id, T00033_A14fp_data, T00033_n14fp_data, T00033_A15fp_bucket, T00033_n15fp_bucket, T00033_A16fp_hash, T00033_n16fp_hash, T00033_A4pes_id
            }
            , new Object[] {
            T00034_A4pes_id
            }
            , new Object[] {
            T00035_A3fp_id, T00035_A14fp_data, T00035_n14fp_data, T00035_A15fp_bucket, T00035_n15fp_bucket, T00035_A16fp_hash, T00035_n16fp_hash, T00035_A4pes_id
            }
            , new Object[] {
            T00036_A4pes_id
            }
            , new Object[] {
            T00037_A3fp_id
            }
            , new Object[] {
            T00038_A3fp_id
            }
            , new Object[] {
            T00039_A3fp_id
            }
            , new Object[] {
            }
            , new Object[] {
            T000311_A3fp_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000314_A3fp_id
            }
            , new Object[] {
            T000315_A4pes_id
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
   private short RcdFound3 ;
   private int Z3fp_id ;
   private int Z4pes_id ;
   private int A4pes_id ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A3fp_id ;
   private int edtfp_id_Enabled ;
   private int edtpes_id_Enabled ;
   private int imgprompt_4_Visible ;
   private int edtfp_data_Enabled ;
   private int edtfp_bucket_Enabled ;
   private int edtfp_hash_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ3fp_id ;
   private int ZZ4pes_id ;
   private String sPrefix ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtfp_id_Internalname ;
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
   private String edtfp_id_Jsonclick ;
   private String edtpes_id_Internalname ;
   private String edtpes_id_Jsonclick ;
   private String imgprompt_4_gximage ;
   private String sImgUrl ;
   private String imgprompt_4_Internalname ;
   private String imgprompt_4_Link ;
   private String edtfp_data_Internalname ;
   private String edtfp_data_Jsonclick ;
   private String edtfp_bucket_Internalname ;
   private String edtfp_bucket_Jsonclick ;
   private String edtfp_hash_Internalname ;
   private String edtfp_hash_Jsonclick ;
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
   private String sMode3 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z14fp_data ;
   private java.util.Date A14fp_data ;
   private java.util.Date ZZ14fp_data ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n14fp_data ;
   private boolean n15fp_bucket ;
   private boolean n16fp_hash ;
   private String Z15fp_bucket ;
   private String Z16fp_hash ;
   private String A15fp_bucket ;
   private String A16fp_hash ;
   private String ZZ15fp_bucket ;
   private String ZZ16fp_hash ;
   private com.genexus.webpanels.GXWebForm Form ;
   private IDataStoreProvider pr_default ;
   private int[] T00035_A3fp_id ;
   private java.util.Date[] T00035_A14fp_data ;
   private boolean[] T00035_n14fp_data ;
   private String[] T00035_A15fp_bucket ;
   private boolean[] T00035_n15fp_bucket ;
   private String[] T00035_A16fp_hash ;
   private boolean[] T00035_n16fp_hash ;
   private int[] T00035_A4pes_id ;
   private int[] T00034_A4pes_id ;
   private int[] T00036_A4pes_id ;
   private int[] T00037_A3fp_id ;
   private int[] T00033_A3fp_id ;
   private java.util.Date[] T00033_A14fp_data ;
   private boolean[] T00033_n14fp_data ;
   private String[] T00033_A15fp_bucket ;
   private boolean[] T00033_n15fp_bucket ;
   private String[] T00033_A16fp_hash ;
   private boolean[] T00033_n16fp_hash ;
   private int[] T00033_A4pes_id ;
   private int[] T00038_A3fp_id ;
   private int[] T00039_A3fp_id ;
   private int[] T00032_A3fp_id ;
   private java.util.Date[] T00032_A14fp_data ;
   private boolean[] T00032_n14fp_data ;
   private String[] T00032_A15fp_bucket ;
   private boolean[] T00032_n15fp_bucket ;
   private String[] T00032_A16fp_hash ;
   private boolean[] T00032_n16fp_hash ;
   private int[] T00032_A4pes_id ;
   private int[] T000311_A3fp_id ;
   private int[] T000314_A3fp_id ;
   private int[] T000315_A4pes_id ;
}

final  class foto_pessoa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00032", "SELECT fp_id, fp_data, fp_bucket, fp_hash, pes_id FROM foto_pessoa WHERE fp_id = ?  FOR UPDATE OF foto_pessoa NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00033", "SELECT fp_id, fp_data, fp_bucket, fp_hash, pes_id FROM foto_pessoa WHERE fp_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00034", "SELECT pes_id FROM Pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00035", "SELECT TM1.fp_id, TM1.fp_data, TM1.fp_bucket, TM1.fp_hash, TM1.pes_id FROM foto_pessoa TM1 WHERE TM1.fp_id = ? ORDER BY TM1.fp_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00036", "SELECT pes_id FROM Pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00037", "SELECT fp_id FROM foto_pessoa WHERE fp_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00038", "SELECT fp_id FROM foto_pessoa WHERE ( fp_id > ?) ORDER BY fp_id  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00039", "SELECT fp_id FROM foto_pessoa WHERE ( fp_id < ?) ORDER BY fp_id DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000310", "SAVEPOINT gxupdate;INSERT INTO foto_pessoa(fp_data, fp_bucket, fp_hash, pes_id) VALUES(?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000311", "SELECT currval('fp_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000312", "SAVEPOINT gxupdate;UPDATE foto_pessoa SET fp_data=?, fp_bucket=?, fp_hash=?, pes_id=?  WHERE fp_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000313", "SAVEPOINT gxupdate;DELETE FROM foto_pessoa  WHERE fp_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000314", "SELECT fp_id FROM foto_pessoa ORDER BY fp_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000315", "SELECT pes_id FROM Pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 13 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 50);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 50);
               }
               stmt.setInt(4, ((Number) parms[6]).intValue());
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 50);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 50);
               }
               stmt.setInt(4, ((Number) parms[6]).intValue());
               stmt.setInt(5, ((Number) parms[7]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

