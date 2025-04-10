package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class endereco_impl extends GXDataArea
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
         A1cid_id = (int)(GXutil.lval( httpContext.GetPar( "cid_id"))) ;
         n1cid_id = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1cid_id), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A1cid_id) ;
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
      Form.getMeta().addItem("description", "Endereco", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtend_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Treinamento2", true);
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public endereco_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public endereco_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( endereco_impl.class ));
   }

   public endereco_impl( int remoteHandle ,
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
      com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Endereco", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "heading-01", 0, "", 1, 1, 0, (short)(0), "HLP_Endereco.htm");
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
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Endereco.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-prev" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Endereco.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-next" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Endereco.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-last" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Endereco.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "Button button-secondary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Selecionar", bttBtn_select_Jsonclick, 4, "Selecionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.treinamento2.gx0020"+"',["+"{Ctrl:gx.dom.el('"+"END_ID"+"'), id:'"+"END_ID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_Endereco.htm");
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
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtend_id_Internalname, "end_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtend_id_Internalname, GXutil.ltrim( localUtil.ntoc( A2end_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtend_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2end_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2end_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtend_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtend_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Id", "end", false, "", "HLP_Endereco.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_tipo_logradouro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtend_tipo_logradouro_Internalname, "end_tipo_logradouro", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtend_tipo_logradouro_Internalname, A10end_tipo_logradouro, GXutil.rtrim( localUtil.format( A10end_tipo_logradouro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtend_tipo_logradouro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtend_tipo_logradouro_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_Endereco.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_logradouro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtend_logradouro_Internalname, "end_logradouro", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_html_textarea( httpContext, edtend_logradouro_Internalname, A11end_logradouro, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", (short)(0), 1, edtend_logradouro_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "", "HLP_Endereco.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_numero_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtend_numero_Internalname, "end_numero", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtend_numero_Internalname, GXutil.ltrim( localUtil.ntoc( A12end_numero, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( ((edtend_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12end_numero), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12end_numero), "ZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtend_numero_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtend_numero_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Endereco.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtend_bairro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtend_bairro_Internalname, "end_bairro", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtend_bairro_Internalname, A13end_bairro, GXutil.rtrim( localUtil.format( A13end_bairro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtend_bairro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtend_bairro_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_Endereco.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtcid_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtcid_id_Internalname, "cid_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtcid_id_Internalname, GXutil.ltrim( localUtil.ntoc( A1cid_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtcid_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1cid_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1cid_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtcid_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtcid_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Id", "end", false, "", "HLP_Endereco.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_1_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_1_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
      com.treinamento2.GxWebStd.gx_bitmap( httpContext, imgprompt_1_Internalname, sImgUrl, imgprompt_1_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_1_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Endereco.htm");
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
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Endereco.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Fechar", bttBtn_cancel_Jsonclick, 1, "Fechar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Endereco.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Endereco.htm");
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
         Z2end_id = (int)(localUtil.ctol( httpContext.cgiGet( "Z2end_id"), ",", ".")) ;
         Z10end_tipo_logradouro = httpContext.cgiGet( "Z10end_tipo_logradouro") ;
         n10end_tipo_logradouro = ((GXutil.strcmp("", A10end_tipo_logradouro)==0) ? true : false) ;
         Z11end_logradouro = httpContext.cgiGet( "Z11end_logradouro") ;
         n11end_logradouro = ((GXutil.strcmp("", A11end_logradouro)==0) ? true : false) ;
         Z12end_numero = (short)(localUtil.ctol( httpContext.cgiGet( "Z12end_numero"), ",", ".")) ;
         n12end_numero = ((0==A12end_numero) ? true : false) ;
         Z13end_bairro = httpContext.cgiGet( "Z13end_bairro") ;
         n13end_bairro = ((GXutil.strcmp("", A13end_bairro)==0) ? true : false) ;
         Z1cid_id = (int)(localUtil.ctol( httpContext.cgiGet( "Z1cid_id"), ",", ".")) ;
         n1cid_id = ((0==A1cid_id) ? true : false) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtend_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtend_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "END_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtend_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2end_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A2end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2end_id), 8, 0));
         }
         else
         {
            A2end_id = (int)(localUtil.ctol( httpContext.cgiGet( edtend_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2end_id), 8, 0));
         }
         A10end_tipo_logradouro = httpContext.cgiGet( edtend_tipo_logradouro_Internalname) ;
         n10end_tipo_logradouro = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10end_tipo_logradouro", A10end_tipo_logradouro);
         n10end_tipo_logradouro = ((GXutil.strcmp("", A10end_tipo_logradouro)==0) ? true : false) ;
         A11end_logradouro = httpContext.cgiGet( edtend_logradouro_Internalname) ;
         n11end_logradouro = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11end_logradouro", A11end_logradouro);
         n11end_logradouro = ((GXutil.strcmp("", A11end_logradouro)==0) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtend_numero_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtend_numero_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "END_NUMERO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtend_numero_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12end_numero = (short)(0) ;
            n12end_numero = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12end_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12end_numero), 4, 0));
         }
         else
         {
            A12end_numero = (short)(localUtil.ctol( httpContext.cgiGet( edtend_numero_Internalname), ",", ".")) ;
            n12end_numero = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12end_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12end_numero), 4, 0));
         }
         n12end_numero = ((0==A12end_numero) ? true : false) ;
         A13end_bairro = httpContext.cgiGet( edtend_bairro_Internalname) ;
         n13end_bairro = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13end_bairro", A13end_bairro);
         n13end_bairro = ((GXutil.strcmp("", A13end_bairro)==0) ? true : false) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtcid_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtcid_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CID_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtcid_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1cid_id = 0 ;
            n1cid_id = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1cid_id), 8, 0));
         }
         else
         {
            A1cid_id = (int)(localUtil.ctol( httpContext.cgiGet( edtcid_id_Internalname), ",", ".")) ;
            n1cid_id = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1cid_id), 8, 0));
         }
         n1cid_id = ((0==A1cid_id) ? true : false) ;
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
            A2end_id = (int)(GXutil.lval( httpContext.GetPar( "end_id"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2end_id), 8, 0));
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
            initAll022( ) ;
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
      disableAttributes022( ) ;
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

   public void resetCaption020( )
   {
   }

   public void zm022( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10end_tipo_logradouro = T00023_A10end_tipo_logradouro[0] ;
            Z11end_logradouro = T00023_A11end_logradouro[0] ;
            Z12end_numero = T00023_A12end_numero[0] ;
            Z13end_bairro = T00023_A13end_bairro[0] ;
            Z1cid_id = T00023_A1cid_id[0] ;
         }
         else
         {
            Z10end_tipo_logradouro = A10end_tipo_logradouro ;
            Z11end_logradouro = A11end_logradouro ;
            Z12end_numero = A12end_numero ;
            Z13end_bairro = A13end_bairro ;
            Z1cid_id = A1cid_id ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z2end_id = A2end_id ;
         Z10end_tipo_logradouro = A10end_tipo_logradouro ;
         Z11end_logradouro = A11end_logradouro ;
         Z12end_numero = A12end_numero ;
         Z13end_bairro = A13end_bairro ;
         Z1cid_id = A1cid_id ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_1_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.treinamento2.gx0010"+"',["+"{Ctrl:gx.dom.el('"+"CID_ID"+"'), id:'"+"CID_ID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
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

   public void load022( )
   {
      /* Using cursor T00025 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A2end_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A10end_tipo_logradouro = T00025_A10end_tipo_logradouro[0] ;
         n10end_tipo_logradouro = T00025_n10end_tipo_logradouro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10end_tipo_logradouro", A10end_tipo_logradouro);
         A11end_logradouro = T00025_A11end_logradouro[0] ;
         n11end_logradouro = T00025_n11end_logradouro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11end_logradouro", A11end_logradouro);
         A12end_numero = T00025_A12end_numero[0] ;
         n12end_numero = T00025_n12end_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12end_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12end_numero), 4, 0));
         A13end_bairro = T00025_A13end_bairro[0] ;
         n13end_bairro = T00025_n13end_bairro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13end_bairro", A13end_bairro);
         A1cid_id = T00025_A1cid_id[0] ;
         n1cid_id = T00025_n1cid_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1cid_id), 8, 0));
         zm022( -1) ;
      }
      pr_default.close(3);
      onLoadActions022( ) ;
   }

   public void onLoadActions022( )
   {
   }

   public void checkExtendedTable022( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00024 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n1cid_id), Integer.valueOf(A1cid_id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         if ( ! ( (0==A1cid_id) ) )
         {
            httpContext.GX_msglist.addItem("Não existe 'Cidade'.", "ForeignKeyNotFound", 1, "CID_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtcid_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors022( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( int A1cid_id )
   {
      /* Using cursor T00026 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n1cid_id), Integer.valueOf(A1cid_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (0==A1cid_id) ) )
         {
            httpContext.GX_msglist.addItem("Não existe 'Cidade'.", "ForeignKeyNotFound", 1, "CID_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtcid_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
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

   public void getKey022( )
   {
      /* Using cursor T00027 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A2end_id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound2 = (short)(1) ;
      }
      else
      {
         RcdFound2 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00023 */
      pr_default.execute(1, new Object[] {Integer.valueOf(A2end_id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm022( 1) ;
         RcdFound2 = (short)(1) ;
         A2end_id = T00023_A2end_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2end_id), 8, 0));
         A10end_tipo_logradouro = T00023_A10end_tipo_logradouro[0] ;
         n10end_tipo_logradouro = T00023_n10end_tipo_logradouro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10end_tipo_logradouro", A10end_tipo_logradouro);
         A11end_logradouro = T00023_A11end_logradouro[0] ;
         n11end_logradouro = T00023_n11end_logradouro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11end_logradouro", A11end_logradouro);
         A12end_numero = T00023_A12end_numero[0] ;
         n12end_numero = T00023_n12end_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12end_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12end_numero), 4, 0));
         A13end_bairro = T00023_A13end_bairro[0] ;
         n13end_bairro = T00023_n13end_bairro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13end_bairro", A13end_bairro);
         A1cid_id = T00023_A1cid_id[0] ;
         n1cid_id = T00023_n1cid_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1cid_id), 8, 0));
         Z2end_id = A2end_id ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load022( ) ;
         if ( AnyError == 1 )
         {
            RcdFound2 = (short)(0) ;
            initializeNonKey022( ) ;
         }
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound2 = (short)(0) ;
         initializeNonKey022( ) ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey022( ) ;
      if ( RcdFound2 == 0 )
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
      RcdFound2 = (short)(0) ;
      /* Using cursor T00028 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A2end_id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T00028_A2end_id[0] < A2end_id ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T00028_A2end_id[0] > A2end_id ) ) )
         {
            A2end_id = T00028_A2end_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2end_id), 8, 0));
            RcdFound2 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound2 = (short)(0) ;
      /* Using cursor T00029 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A2end_id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T00029_A2end_id[0] > A2end_id ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T00029_A2end_id[0] < A2end_id ) ) )
         {
            A2end_id = T00029_A2end_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2end_id), 8, 0));
            RcdFound2 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey022( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtend_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert022( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound2 == 1 )
         {
            if ( A2end_id != Z2end_id )
            {
               A2end_id = Z2end_id ;
               httpContext.ajax_rsp_assign_attri("", false, "A2end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2end_id), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "END_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtend_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtend_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update022( ) ;
               GX_FocusControl = edtend_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A2end_id != Z2end_id )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtend_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert022( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "END_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtend_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtend_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert022( ) ;
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
      if ( A2end_id != Z2end_id )
      {
         A2end_id = Z2end_id ;
         httpContext.ajax_rsp_assign_attri("", false, "A2end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2end_id), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "END_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtend_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtend_id_Internalname ;
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
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "END_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtend_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart022( ) ;
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd022( ) ;
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
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
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
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
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
      scanStart022( ) ;
      if ( RcdFound2 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound2 != 0 )
         {
            scanNext022( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd022( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency022( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00022 */
         pr_default.execute(0, new Object[] {Integer.valueOf(A2end_id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Endereco"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10end_tipo_logradouro, T00022_A10end_tipo_logradouro[0]) != 0 ) || ( GXutil.strcmp(Z11end_logradouro, T00022_A11end_logradouro[0]) != 0 ) || ( Z12end_numero != T00022_A12end_numero[0] ) || ( GXutil.strcmp(Z13end_bairro, T00022_A13end_bairro[0]) != 0 ) || ( Z1cid_id != T00022_A1cid_id[0] ) )
         {
            if ( GXutil.strcmp(Z10end_tipo_logradouro, T00022_A10end_tipo_logradouro[0]) != 0 )
            {
               GXutil.writeLogln("endereco:[seudo value changed for attri]"+"end_tipo_logradouro");
               GXutil.writeLogRaw("Old: ",Z10end_tipo_logradouro);
               GXutil.writeLogRaw("Current: ",T00022_A10end_tipo_logradouro[0]);
            }
            if ( GXutil.strcmp(Z11end_logradouro, T00022_A11end_logradouro[0]) != 0 )
            {
               GXutil.writeLogln("endereco:[seudo value changed for attri]"+"end_logradouro");
               GXutil.writeLogRaw("Old: ",Z11end_logradouro);
               GXutil.writeLogRaw("Current: ",T00022_A11end_logradouro[0]);
            }
            if ( Z12end_numero != T00022_A12end_numero[0] )
            {
               GXutil.writeLogln("endereco:[seudo value changed for attri]"+"end_numero");
               GXutil.writeLogRaw("Old: ",Z12end_numero);
               GXutil.writeLogRaw("Current: ",T00022_A12end_numero[0]);
            }
            if ( GXutil.strcmp(Z13end_bairro, T00022_A13end_bairro[0]) != 0 )
            {
               GXutil.writeLogln("endereco:[seudo value changed for attri]"+"end_bairro");
               GXutil.writeLogRaw("Old: ",Z13end_bairro);
               GXutil.writeLogRaw("Current: ",T00022_A13end_bairro[0]);
            }
            if ( Z1cid_id != T00022_A1cid_id[0] )
            {
               GXutil.writeLogln("endereco:[seudo value changed for attri]"+"cid_id");
               GXutil.writeLogRaw("Old: ",Z1cid_id);
               GXutil.writeLogRaw("Current: ",T00022_A1cid_id[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Endereco"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert022( )
   {
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable022( ) ;
      }
      if ( AnyError == 0 )
      {
         zm022( 0) ;
         checkOptimisticConcurrency022( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm022( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert022( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000210 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n10end_tipo_logradouro), A10end_tipo_logradouro, Boolean.valueOf(n11end_logradouro), A11end_logradouro, Boolean.valueOf(n12end_numero), Short.valueOf(A12end_numero), Boolean.valueOf(n13end_bairro), A13end_bairro, Boolean.valueOf(n1cid_id), Integer.valueOf(A1cid_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000211 */
                  pr_default.execute(9);
                  A2end_id = T000211_A2end_id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2end_id), 8, 0));
                  pr_default.close(9);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Endereco");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption020( ) ;
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
            load022( ) ;
         }
         endLevel022( ) ;
      }
      closeExtendedTableCursors022( ) ;
   }

   public void update022( )
   {
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable022( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency022( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm022( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate022( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000212 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n10end_tipo_logradouro), A10end_tipo_logradouro, Boolean.valueOf(n11end_logradouro), A11end_logradouro, Boolean.valueOf(n12end_numero), Short.valueOf(A12end_numero), Boolean.valueOf(n13end_bairro), A13end_bairro, Boolean.valueOf(n1cid_id), Integer.valueOf(A1cid_id), Integer.valueOf(A2end_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Endereco");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Endereco"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate022( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption020( ) ;
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
         endLevel022( ) ;
      }
      closeExtendedTableCursors022( ) ;
   }

   public void deferredUpdate022( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate022( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency022( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls022( ) ;
         afterConfirm022( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete022( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000213 */
               pr_default.execute(11, new Object[] {Integer.valueOf(A2end_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Endereco");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound2 == 0 )
                     {
                        initAll022( ) ;
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
                     resetCaption020( ) ;
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
      sMode2 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel022( ) ;
      Gx_mode = sMode2 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls022( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T000214 */
         pr_default.execute(12, new Object[] {Integer.valueOf(A2end_id)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"unidade_endereco"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T000215 */
         pr_default.execute(13, new Object[] {Integer.valueOf(A2end_id)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"Transaction1"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void endLevel022( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete022( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "endereco");
         if ( AnyError == 0 )
         {
            confirmValues020( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "endereco");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart022( )
   {
      /* Using cursor T000216 */
      pr_default.execute(14);
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A2end_id = T000216_A2end_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2end_id), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext022( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A2end_id = T000216_A2end_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2end_id), 8, 0));
      }
   }

   public void scanEnd022( )
   {
      pr_default.close(14);
   }

   public void afterConfirm022( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert022( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate022( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete022( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete022( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate022( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes022( )
   {
      edtend_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_id_Enabled), 5, 0), true);
      edtend_tipo_logradouro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_tipo_logradouro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_tipo_logradouro_Enabled), 5, 0), true);
      edtend_logradouro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_logradouro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_logradouro_Enabled), 5, 0), true);
      edtend_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_numero_Enabled), 5, 0), true);
      edtend_bairro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtend_bairro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtend_bairro_Enabled), 5, 0), true);
      edtcid_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtcid_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtcid_id_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes022( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues020( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.treinamento2.endereco", new String[] {}, new String[] {}) +"\">") ;
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
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z2end_id", GXutil.ltrim( localUtil.ntoc( Z2end_id, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z10end_tipo_logradouro", Z10end_tipo_logradouro);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z11end_logradouro", Z11end_logradouro);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z12end_numero", GXutil.ltrim( localUtil.ntoc( Z12end_numero, (byte)(4), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z13end_bairro", Z13end_bairro);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z1cid_id", GXutil.ltrim( localUtil.ntoc( Z1cid_id, (byte)(8), (byte)(0), ",", "")));
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
      return formatLink("com.treinamento2.endereco", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Endereco" ;
   }

   public String getPgmdesc( )
   {
      return "Endereco" ;
   }

   public void initializeNonKey022( )
   {
      A10end_tipo_logradouro = "" ;
      n10end_tipo_logradouro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10end_tipo_logradouro", A10end_tipo_logradouro);
      n10end_tipo_logradouro = ((GXutil.strcmp("", A10end_tipo_logradouro)==0) ? true : false) ;
      A11end_logradouro = "" ;
      n11end_logradouro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11end_logradouro", A11end_logradouro);
      n11end_logradouro = ((GXutil.strcmp("", A11end_logradouro)==0) ? true : false) ;
      A12end_numero = (short)(0) ;
      n12end_numero = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12end_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12end_numero), 4, 0));
      n12end_numero = ((0==A12end_numero) ? true : false) ;
      A13end_bairro = "" ;
      n13end_bairro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13end_bairro", A13end_bairro);
      n13end_bairro = ((GXutil.strcmp("", A13end_bairro)==0) ? true : false) ;
      A1cid_id = 0 ;
      n1cid_id = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1cid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1cid_id), 8, 0));
      n1cid_id = ((0==A1cid_id) ? true : false) ;
      Z10end_tipo_logradouro = "" ;
      Z11end_logradouro = "" ;
      Z12end_numero = (short)(0) ;
      Z13end_bairro = "" ;
      Z1cid_id = 0 ;
   }

   public void initAll022( )
   {
      A2end_id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2end_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2end_id), 8, 0));
      initializeNonKey022( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20254815252749", true, true);
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
      httpContext.AddJavascriptSource("endereco.js", "?20254815252749", false, true);
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
      edtend_id_Internalname = "END_ID" ;
      edtend_tipo_logradouro_Internalname = "END_TIPO_LOGRADOURO" ;
      edtend_logradouro_Internalname = "END_LOGRADOURO" ;
      edtend_numero_Internalname = "END_NUMERO" ;
      edtend_bairro_Internalname = "END_BAIRRO" ;
      edtcid_id_Internalname = "CID_ID" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_1_Internalname = "PROMPT_1" ;
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
      Form.setCaption( "Endereco" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      imgprompt_1_Visible = 1 ;
      imgprompt_1_Link = "" ;
      edtcid_id_Jsonclick = "" ;
      edtcid_id_Enabled = 1 ;
      edtend_bairro_Jsonclick = "" ;
      edtend_bairro_Enabled = 1 ;
      edtend_numero_Jsonclick = "" ;
      edtend_numero_Enabled = 1 ;
      edtend_logradouro_Enabled = 1 ;
      edtend_tipo_logradouro_Jsonclick = "" ;
      edtend_tipo_logradouro_Enabled = 1 ;
      edtend_id_Jsonclick = "" ;
      edtend_id_Enabled = 1 ;
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
      GX_FocusControl = edtend_tipo_logradouro_Internalname ;
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

   public void valid_End_id( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10end_tipo_logradouro", A10end_tipo_logradouro);
      httpContext.ajax_rsp_assign_attri("", false, "A11end_logradouro", A11end_logradouro);
      httpContext.ajax_rsp_assign_attri("", false, "A12end_numero", GXutil.ltrim( localUtil.ntoc( A12end_numero, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13end_bairro", A13end_bairro);
      httpContext.ajax_rsp_assign_attri("", false, "A1cid_id", GXutil.ltrim( localUtil.ntoc( A1cid_id, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z2end_id", GXutil.ltrim( localUtil.ntoc( Z2end_id, (byte)(8), (byte)(0), ".", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z10end_tipo_logradouro", Z10end_tipo_logradouro);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z11end_logradouro", Z11end_logradouro);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z12end_numero", GXutil.ltrim( localUtil.ntoc( Z12end_numero, (byte)(4), (byte)(0), ".", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z13end_bairro", Z13end_bairro);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z1cid_id", GXutil.ltrim( localUtil.ntoc( Z1cid_id, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Cid_id( )
   {
      n1cid_id = false ;
      /* Using cursor T000217 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n1cid_id), Integer.valueOf(A1cid_id)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (0==A1cid_id) ) )
         {
            httpContext.GX_msglist.addItem("Não existe 'Cidade'.", "ForeignKeyNotFound", 1, "CID_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtcid_id_Internalname ;
         }
      }
      pr_default.close(15);
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
      setEventMetadata("VALID_END_ID","{handler:'valid_End_id',iparms:[{av:'A2end_id',fld:'END_ID',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_END_ID",",oparms:[{av:'A10end_tipo_logradouro',fld:'END_TIPO_LOGRADOURO',pic:''},{av:'A11end_logradouro',fld:'END_LOGRADOURO',pic:''},{av:'A12end_numero',fld:'END_NUMERO',pic:'ZZZ9'},{av:'A13end_bairro',fld:'END_BAIRRO',pic:''},{av:'A1cid_id',fld:'CID_ID',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z2end_id'},{av:'Z10end_tipo_logradouro'},{av:'Z11end_logradouro'},{av:'Z12end_numero'},{av:'Z13end_bairro'},{av:'Z1cid_id'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_CID_ID","{handler:'valid_Cid_id',iparms:[{av:'A1cid_id',fld:'CID_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_CID_ID",",oparms:[]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z10end_tipo_logradouro = "" ;
      Z11end_logradouro = "" ;
      Z13end_bairro = "" ;
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
      A10end_tipo_logradouro = "" ;
      A11end_logradouro = "" ;
      A13end_bairro = "" ;
      imgprompt_1_gximage = "" ;
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
      T00025_A2end_id = new int[1] ;
      T00025_A10end_tipo_logradouro = new String[] {""} ;
      T00025_n10end_tipo_logradouro = new boolean[] {false} ;
      T00025_A11end_logradouro = new String[] {""} ;
      T00025_n11end_logradouro = new boolean[] {false} ;
      T00025_A12end_numero = new short[1] ;
      T00025_n12end_numero = new boolean[] {false} ;
      T00025_A13end_bairro = new String[] {""} ;
      T00025_n13end_bairro = new boolean[] {false} ;
      T00025_A1cid_id = new int[1] ;
      T00025_n1cid_id = new boolean[] {false} ;
      T00024_A1cid_id = new int[1] ;
      T00024_n1cid_id = new boolean[] {false} ;
      T00026_A1cid_id = new int[1] ;
      T00026_n1cid_id = new boolean[] {false} ;
      T00027_A2end_id = new int[1] ;
      T00023_A2end_id = new int[1] ;
      T00023_A10end_tipo_logradouro = new String[] {""} ;
      T00023_n10end_tipo_logradouro = new boolean[] {false} ;
      T00023_A11end_logradouro = new String[] {""} ;
      T00023_n11end_logradouro = new boolean[] {false} ;
      T00023_A12end_numero = new short[1] ;
      T00023_n12end_numero = new boolean[] {false} ;
      T00023_A13end_bairro = new String[] {""} ;
      T00023_n13end_bairro = new boolean[] {false} ;
      T00023_A1cid_id = new int[1] ;
      T00023_n1cid_id = new boolean[] {false} ;
      sMode2 = "" ;
      T00028_A2end_id = new int[1] ;
      T00029_A2end_id = new int[1] ;
      T00022_A2end_id = new int[1] ;
      T00022_A10end_tipo_logradouro = new String[] {""} ;
      T00022_n10end_tipo_logradouro = new boolean[] {false} ;
      T00022_A11end_logradouro = new String[] {""} ;
      T00022_n11end_logradouro = new boolean[] {false} ;
      T00022_A12end_numero = new short[1] ;
      T00022_n12end_numero = new boolean[] {false} ;
      T00022_A13end_bairro = new String[] {""} ;
      T00022_n13end_bairro = new boolean[] {false} ;
      T00022_A1cid_id = new int[1] ;
      T00022_n1cid_id = new boolean[] {false} ;
      T000211_A2end_id = new int[1] ;
      T000214_A33unidade_id = new int[1] ;
      T000215_A29pessoa_id = new int[1] ;
      T000216_A2end_id = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ10end_tipo_logradouro = "" ;
      ZZ11end_logradouro = "" ;
      ZZ13end_bairro = "" ;
      T000217_A1cid_id = new int[1] ;
      T000217_n1cid_id = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.endereco__default(),
         new Object[] {
             new Object[] {
            T00022_A2end_id, T00022_A10end_tipo_logradouro, T00022_n10end_tipo_logradouro, T00022_A11end_logradouro, T00022_n11end_logradouro, T00022_A12end_numero, T00022_n12end_numero, T00022_A13end_bairro, T00022_n13end_bairro, T00022_A1cid_id,
            T00022_n1cid_id
            }
            , new Object[] {
            T00023_A2end_id, T00023_A10end_tipo_logradouro, T00023_n10end_tipo_logradouro, T00023_A11end_logradouro, T00023_n11end_logradouro, T00023_A12end_numero, T00023_n12end_numero, T00023_A13end_bairro, T00023_n13end_bairro, T00023_A1cid_id,
            T00023_n1cid_id
            }
            , new Object[] {
            T00024_A1cid_id
            }
            , new Object[] {
            T00025_A2end_id, T00025_A10end_tipo_logradouro, T00025_n10end_tipo_logradouro, T00025_A11end_logradouro, T00025_n11end_logradouro, T00025_A12end_numero, T00025_n12end_numero, T00025_A13end_bairro, T00025_n13end_bairro, T00025_A1cid_id,
            T00025_n1cid_id
            }
            , new Object[] {
            T00026_A1cid_id
            }
            , new Object[] {
            T00027_A2end_id
            }
            , new Object[] {
            T00028_A2end_id
            }
            , new Object[] {
            T00029_A2end_id
            }
            , new Object[] {
            }
            , new Object[] {
            T000211_A2end_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000214_A33unidade_id
            }
            , new Object[] {
            T000215_A29pessoa_id
            }
            , new Object[] {
            T000216_A2end_id
            }
            , new Object[] {
            T000217_A1cid_id
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z12end_numero ;
   private short gxcookieaux ;
   private short AnyError ;
   private short IsModified ;
   private short IsConfirmed ;
   private short A12end_numero ;
   private short RcdFound2 ;
   private short ZZ12end_numero ;
   private int Z2end_id ;
   private int Z1cid_id ;
   private int A1cid_id ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A2end_id ;
   private int edtend_id_Enabled ;
   private int edtend_tipo_logradouro_Enabled ;
   private int edtend_logradouro_Enabled ;
   private int edtend_numero_Enabled ;
   private int edtend_bairro_Enabled ;
   private int edtcid_id_Enabled ;
   private int imgprompt_1_Visible ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ2end_id ;
   private int ZZ1cid_id ;
   private String sPrefix ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtend_id_Internalname ;
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
   private String edtend_id_Jsonclick ;
   private String edtend_tipo_logradouro_Internalname ;
   private String edtend_tipo_logradouro_Jsonclick ;
   private String edtend_logradouro_Internalname ;
   private String edtend_numero_Internalname ;
   private String edtend_numero_Jsonclick ;
   private String edtend_bairro_Internalname ;
   private String edtend_bairro_Jsonclick ;
   private String edtcid_id_Internalname ;
   private String edtcid_id_Jsonclick ;
   private String imgprompt_1_gximage ;
   private String sImgUrl ;
   private String imgprompt_1_Internalname ;
   private String imgprompt_1_Link ;
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
   private String sMode2 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1cid_id ;
   private boolean wbErr ;
   private boolean n10end_tipo_logradouro ;
   private boolean n11end_logradouro ;
   private boolean n12end_numero ;
   private boolean n13end_bairro ;
   private String Z10end_tipo_logradouro ;
   private String Z11end_logradouro ;
   private String Z13end_bairro ;
   private String A10end_tipo_logradouro ;
   private String A11end_logradouro ;
   private String A13end_bairro ;
   private String ZZ10end_tipo_logradouro ;
   private String ZZ11end_logradouro ;
   private String ZZ13end_bairro ;
   private com.genexus.webpanels.GXWebForm Form ;
   private IDataStoreProvider pr_default ;
   private int[] T00025_A2end_id ;
   private String[] T00025_A10end_tipo_logradouro ;
   private boolean[] T00025_n10end_tipo_logradouro ;
   private String[] T00025_A11end_logradouro ;
   private boolean[] T00025_n11end_logradouro ;
   private short[] T00025_A12end_numero ;
   private boolean[] T00025_n12end_numero ;
   private String[] T00025_A13end_bairro ;
   private boolean[] T00025_n13end_bairro ;
   private int[] T00025_A1cid_id ;
   private boolean[] T00025_n1cid_id ;
   private int[] T00024_A1cid_id ;
   private boolean[] T00024_n1cid_id ;
   private int[] T00026_A1cid_id ;
   private boolean[] T00026_n1cid_id ;
   private int[] T00027_A2end_id ;
   private int[] T00023_A2end_id ;
   private String[] T00023_A10end_tipo_logradouro ;
   private boolean[] T00023_n10end_tipo_logradouro ;
   private String[] T00023_A11end_logradouro ;
   private boolean[] T00023_n11end_logradouro ;
   private short[] T00023_A12end_numero ;
   private boolean[] T00023_n12end_numero ;
   private String[] T00023_A13end_bairro ;
   private boolean[] T00023_n13end_bairro ;
   private int[] T00023_A1cid_id ;
   private boolean[] T00023_n1cid_id ;
   private int[] T00028_A2end_id ;
   private int[] T00029_A2end_id ;
   private int[] T00022_A2end_id ;
   private String[] T00022_A10end_tipo_logradouro ;
   private boolean[] T00022_n10end_tipo_logradouro ;
   private String[] T00022_A11end_logradouro ;
   private boolean[] T00022_n11end_logradouro ;
   private short[] T00022_A12end_numero ;
   private boolean[] T00022_n12end_numero ;
   private String[] T00022_A13end_bairro ;
   private boolean[] T00022_n13end_bairro ;
   private int[] T00022_A1cid_id ;
   private boolean[] T00022_n1cid_id ;
   private int[] T000211_A2end_id ;
   private int[] T000214_A33unidade_id ;
   private int[] T000215_A29pessoa_id ;
   private int[] T000216_A2end_id ;
   private int[] T000217_A1cid_id ;
   private boolean[] T000217_n1cid_id ;
}

final  class endereco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00022", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM Endereco WHERE end_id = ?  FOR UPDATE OF Endereco NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00023", "SELECT end_id, end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id FROM Endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00024", "SELECT cid_id FROM Cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00025", "SELECT TM1.end_id, TM1.end_tipo_logradouro, TM1.end_logradouro, TM1.end_numero, TM1.end_bairro, TM1.cid_id FROM Endereco TM1 WHERE TM1.end_id = ? ORDER BY TM1.end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00026", "SELECT cid_id FROM Cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00027", "SELECT end_id FROM Endereco WHERE end_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00028", "SELECT end_id FROM Endereco WHERE ( end_id > ?) ORDER BY end_id  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00029", "SELECT end_id FROM Endereco WHERE ( end_id < ?) ORDER BY end_id DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000210", "SAVEPOINT gxupdate;INSERT INTO Endereco(end_tipo_logradouro, end_logradouro, end_numero, end_bairro, cid_id) VALUES(?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000211", "SELECT currval('end_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000212", "SAVEPOINT gxupdate;UPDATE Endereco SET end_tipo_logradouro=?, end_logradouro=?, end_numero=?, end_bairro=?, cid_id=?  WHERE end_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000213", "SAVEPOINT gxupdate;DELETE FROM Endereco  WHERE end_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000214", "SELECT unidade_id FROM unidade_endereco WHERE endereco_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000215", "SELECT pessoa_id FROM pessoa_endereco WHERE endereco_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000216", "SELECT end_id FROM Endereco ORDER BY end_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000217", "SELECT cid_id FROM Cidade WHERE cid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 15 :
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
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
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 50);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 200);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 100);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 50);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 200);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 100);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               stmt.setInt(6, ((Number) parms[10]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
      }
   }

}

