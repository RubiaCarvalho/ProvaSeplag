package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class servlotado_impl extends GXDataArea
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
         A6unid_id = (int)(GXutil.lval( httpContext.GetPar( "unid_id"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6unid_id), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A6unid_id) ;
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
      Form.getMeta().addItem("description", "Serv Lotado", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtserv_lot_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Treinamento2", true);
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public servlotado_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public servlotado_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( servlotado_impl.class ));
   }

   public servlotado_impl( int remoteHandle ,
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
      com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Serv Lotado", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "heading-01", 0, "", 1, 1, 0, (short)(0), "HLP_ServLotado.htm");
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
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ServLotado.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-prev" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ServLotado.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-next" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ServLotado.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-last" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ServLotado.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "Button button-secondary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Selecionar", bttBtn_select_Jsonclick, 4, "Selecionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.treinamento2.gx00b0"+"',["+"{Ctrl:gx.dom.el('"+"SERV_LOT_ID"+"'), id:'"+"SERV_LOT_ID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_ServLotado.htm");
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
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtserv_lot_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtserv_lot_id_Internalname, "serv_lot_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtserv_lot_id_Internalname, GXutil.ltrim( localUtil.ntoc( A37serv_lot_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtserv_lot_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A37serv_lot_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A37serv_lot_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtserv_lot_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtserv_lot_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Id", "end", false, "", "HLP_ServLotado.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtserv_lot_idade_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtserv_lot_idade_Internalname, "serv_lot_idade", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtserv_lot_idade_Internalname, GXutil.ltrim( localUtil.ntoc( A39serv_lot_idade, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( ((edtserv_lot_idade_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A39serv_lot_idade), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A39serv_lot_idade), "ZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtserv_lot_idade_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtserv_lot_idade_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_ServLotado.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtserv_lot_unid_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtserv_lot_unid_Internalname, "serv_lot_unid", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtserv_lot_unid_Internalname, A40serv_lot_unid, GXutil.rtrim( localUtil.format( A40serv_lot_unid, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtserv_lot_unid_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtserv_lot_unid_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_ServLotado.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtserv_lot_foto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtserv_lot_foto_Internalname, "serv_lot_foto", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtserv_lot_foto_Internalname, A41serv_lot_foto, GXutil.rtrim( localUtil.format( A41serv_lot_foto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtserv_lot_foto_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtserv_lot_foto_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_ServLotado.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtunid_id_Internalname, GXutil.ltrim( localUtil.ntoc( A6unid_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtunid_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6unid_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6unid_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtunid_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtunid_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Id", "end", false, "", "HLP_ServLotado.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_6_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_6_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
      com.treinamento2.GxWebStd.gx_bitmap( httpContext, imgprompt_6_Internalname, sImgUrl, imgprompt_6_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_6_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ServLotado.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtunid_nome_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtunid_nome_Internalname, "Unidade Nome", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_html_textarea( httpContext, edtunid_nome_Internalname, A7unid_nome, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", (short)(0), 1, edtunid_nome_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "", "HLP_ServLotado.htm");
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
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ServLotado.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Fechar", bttBtn_cancel_Jsonclick, 1, "Fechar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ServLotado.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ServLotado.htm");
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
         Z37serv_lot_id = (int)(localUtil.ctol( httpContext.cgiGet( "Z37serv_lot_id"), ",", ".")) ;
         Z39serv_lot_idade = (short)(localUtil.ctol( httpContext.cgiGet( "Z39serv_lot_idade"), ",", ".")) ;
         n39serv_lot_idade = ((0==A39serv_lot_idade) ? true : false) ;
         Z40serv_lot_unid = httpContext.cgiGet( "Z40serv_lot_unid") ;
         n40serv_lot_unid = ((GXutil.strcmp("", A40serv_lot_unid)==0) ? true : false) ;
         Z41serv_lot_foto = httpContext.cgiGet( "Z41serv_lot_foto") ;
         n41serv_lot_foto = ((GXutil.strcmp("", A41serv_lot_foto)==0) ? true : false) ;
         Z6unid_id = (int)(localUtil.ctol( httpContext.cgiGet( "Z6unid_id"), ",", ".")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtserv_lot_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtserv_lot_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SERV_LOT_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtserv_lot_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A37serv_lot_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A37serv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A37serv_lot_id), 8, 0));
         }
         else
         {
            A37serv_lot_id = (int)(localUtil.ctol( httpContext.cgiGet( edtserv_lot_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A37serv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A37serv_lot_id), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtserv_lot_idade_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtserv_lot_idade_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SERV_LOT_IDADE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtserv_lot_idade_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A39serv_lot_idade = (short)(0) ;
            n39serv_lot_idade = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A39serv_lot_idade", GXutil.ltrimstr( DecimalUtil.doubleToDec(A39serv_lot_idade), 4, 0));
         }
         else
         {
            A39serv_lot_idade = (short)(localUtil.ctol( httpContext.cgiGet( edtserv_lot_idade_Internalname), ",", ".")) ;
            n39serv_lot_idade = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A39serv_lot_idade", GXutil.ltrimstr( DecimalUtil.doubleToDec(A39serv_lot_idade), 4, 0));
         }
         n39serv_lot_idade = ((0==A39serv_lot_idade) ? true : false) ;
         A40serv_lot_unid = httpContext.cgiGet( edtserv_lot_unid_Internalname) ;
         n40serv_lot_unid = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A40serv_lot_unid", A40serv_lot_unid);
         n40serv_lot_unid = ((GXutil.strcmp("", A40serv_lot_unid)==0) ? true : false) ;
         A41serv_lot_foto = httpContext.cgiGet( edtserv_lot_foto_Internalname) ;
         n41serv_lot_foto = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A41serv_lot_foto", A41serv_lot_foto);
         n41serv_lot_foto = ((GXutil.strcmp("", A41serv_lot_foto)==0) ? true : false) ;
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
         A7unid_nome = httpContext.cgiGet( edtunid_nome_Internalname) ;
         n7unid_nome = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7unid_nome", A7unid_nome);
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
            A37serv_lot_id = (int)(GXutil.lval( httpContext.GetPar( "serv_lot_id"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A37serv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A37serv_lot_id), 8, 0));
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
            initAll0B11( ) ;
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
      disableAttributes0B11( ) ;
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

   public void resetCaption0B0( )
   {
   }

   public void zm0B11( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z39serv_lot_idade = T000B3_A39serv_lot_idade[0] ;
            Z40serv_lot_unid = T000B3_A40serv_lot_unid[0] ;
            Z41serv_lot_foto = T000B3_A41serv_lot_foto[0] ;
            Z6unid_id = T000B3_A6unid_id[0] ;
         }
         else
         {
            Z39serv_lot_idade = A39serv_lot_idade ;
            Z40serv_lot_unid = A40serv_lot_unid ;
            Z41serv_lot_foto = A41serv_lot_foto ;
            Z6unid_id = A6unid_id ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z37serv_lot_id = A37serv_lot_id ;
         Z39serv_lot_idade = A39serv_lot_idade ;
         Z40serv_lot_unid = A40serv_lot_unid ;
         Z41serv_lot_foto = A41serv_lot_foto ;
         Z6unid_id = A6unid_id ;
         Z7unid_nome = A7unid_nome ;
      }
   }

   public void standaloneNotModal( )
   {
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

   public void load0B11( )
   {
      /* Using cursor T000B5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A37serv_lot_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A39serv_lot_idade = T000B5_A39serv_lot_idade[0] ;
         n39serv_lot_idade = T000B5_n39serv_lot_idade[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39serv_lot_idade", GXutil.ltrimstr( DecimalUtil.doubleToDec(A39serv_lot_idade), 4, 0));
         A40serv_lot_unid = T000B5_A40serv_lot_unid[0] ;
         n40serv_lot_unid = T000B5_n40serv_lot_unid[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40serv_lot_unid", A40serv_lot_unid);
         A41serv_lot_foto = T000B5_A41serv_lot_foto[0] ;
         n41serv_lot_foto = T000B5_n41serv_lot_foto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41serv_lot_foto", A41serv_lot_foto);
         A7unid_nome = T000B5_A7unid_nome[0] ;
         n7unid_nome = T000B5_n7unid_nome[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7unid_nome", A7unid_nome);
         A6unid_id = T000B5_A6unid_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6unid_id), 8, 0));
         zm0B11( -1) ;
      }
      pr_default.close(3);
      onLoadActions0B11( ) ;
   }

   public void onLoadActions0B11( )
   {
   }

   public void checkExtendedTable0B11( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T000B4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A6unid_id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'Unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7unid_nome = T000B4_A7unid_nome[0] ;
      n7unid_nome = T000B4_n7unid_nome[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7unid_nome", A7unid_nome);
      pr_default.close(2);
   }

   public void closeExtendedTableCursors0B11( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( int A6unid_id )
   {
      /* Using cursor T000B6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A6unid_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'Unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunid_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A7unid_nome = T000B6_A7unid_nome[0] ;
      n7unid_nome = T000B6_n7unid_nome[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7unid_nome", A7unid_nome);
      com.treinamento2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A7unid_nome)+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey0B11( )
   {
      /* Using cursor T000B7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A37serv_lot_id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
      else
      {
         RcdFound11 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000B3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(A37serv_lot_id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0B11( 1) ;
         RcdFound11 = (short)(1) ;
         A37serv_lot_id = T000B3_A37serv_lot_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A37serv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A37serv_lot_id), 8, 0));
         A39serv_lot_idade = T000B3_A39serv_lot_idade[0] ;
         n39serv_lot_idade = T000B3_n39serv_lot_idade[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39serv_lot_idade", GXutil.ltrimstr( DecimalUtil.doubleToDec(A39serv_lot_idade), 4, 0));
         A40serv_lot_unid = T000B3_A40serv_lot_unid[0] ;
         n40serv_lot_unid = T000B3_n40serv_lot_unid[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40serv_lot_unid", A40serv_lot_unid);
         A41serv_lot_foto = T000B3_A41serv_lot_foto[0] ;
         n41serv_lot_foto = T000B3_n41serv_lot_foto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41serv_lot_foto", A41serv_lot_foto);
         A6unid_id = T000B3_A6unid_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6unid_id), 8, 0));
         Z37serv_lot_id = A37serv_lot_id ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0B11( ) ;
         if ( AnyError == 1 )
         {
            RcdFound11 = (short)(0) ;
            initializeNonKey0B11( ) ;
         }
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound11 = (short)(0) ;
         initializeNonKey0B11( ) ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0B11( ) ;
      if ( RcdFound11 == 0 )
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
      RcdFound11 = (short)(0) ;
      /* Using cursor T000B8 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A37serv_lot_id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000B8_A37serv_lot_id[0] < A37serv_lot_id ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000B8_A37serv_lot_id[0] > A37serv_lot_id ) ) )
         {
            A37serv_lot_id = T000B8_A37serv_lot_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A37serv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A37serv_lot_id), 8, 0));
            RcdFound11 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound11 = (short)(0) ;
      /* Using cursor T000B9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A37serv_lot_id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T000B9_A37serv_lot_id[0] > A37serv_lot_id ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T000B9_A37serv_lot_id[0] < A37serv_lot_id ) ) )
         {
            A37serv_lot_id = T000B9_A37serv_lot_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A37serv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A37serv_lot_id), 8, 0));
            RcdFound11 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0B11( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtserv_lot_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0B11( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound11 == 1 )
         {
            if ( A37serv_lot_id != Z37serv_lot_id )
            {
               A37serv_lot_id = Z37serv_lot_id ;
               httpContext.ajax_rsp_assign_attri("", false, "A37serv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A37serv_lot_id), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "SERV_LOT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtserv_lot_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtserv_lot_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0B11( ) ;
               GX_FocusControl = edtserv_lot_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A37serv_lot_id != Z37serv_lot_id )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtserv_lot_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0B11( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "SERV_LOT_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtserv_lot_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtserv_lot_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0B11( ) ;
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
      if ( A37serv_lot_id != Z37serv_lot_id )
      {
         A37serv_lot_id = Z37serv_lot_id ;
         httpContext.ajax_rsp_assign_attri("", false, "A37serv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A37serv_lot_id), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "SERV_LOT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtserv_lot_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtserv_lot_id_Internalname ;
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
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "SERV_LOT_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtserv_lot_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtserv_lot_idade_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart0B11( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtserv_lot_idade_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0B11( ) ;
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
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtserv_lot_idade_Internalname ;
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
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtserv_lot_idade_Internalname ;
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
      scanStart0B11( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound11 != 0 )
         {
            scanNext0B11( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtserv_lot_idade_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0B11( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0B11( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000B2 */
         pr_default.execute(0, new Object[] {Integer.valueOf(A37serv_lot_id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ServLotado"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z39serv_lot_idade != T000B2_A39serv_lot_idade[0] ) || ( GXutil.strcmp(Z40serv_lot_unid, T000B2_A40serv_lot_unid[0]) != 0 ) || ( GXutil.strcmp(Z41serv_lot_foto, T000B2_A41serv_lot_foto[0]) != 0 ) || ( Z6unid_id != T000B2_A6unid_id[0] ) )
         {
            if ( Z39serv_lot_idade != T000B2_A39serv_lot_idade[0] )
            {
               GXutil.writeLogln("servlotado:[seudo value changed for attri]"+"serv_lot_idade");
               GXutil.writeLogRaw("Old: ",Z39serv_lot_idade);
               GXutil.writeLogRaw("Current: ",T000B2_A39serv_lot_idade[0]);
            }
            if ( GXutil.strcmp(Z40serv_lot_unid, T000B2_A40serv_lot_unid[0]) != 0 )
            {
               GXutil.writeLogln("servlotado:[seudo value changed for attri]"+"serv_lot_unid");
               GXutil.writeLogRaw("Old: ",Z40serv_lot_unid);
               GXutil.writeLogRaw("Current: ",T000B2_A40serv_lot_unid[0]);
            }
            if ( GXutil.strcmp(Z41serv_lot_foto, T000B2_A41serv_lot_foto[0]) != 0 )
            {
               GXutil.writeLogln("servlotado:[seudo value changed for attri]"+"serv_lot_foto");
               GXutil.writeLogRaw("Old: ",Z41serv_lot_foto);
               GXutil.writeLogRaw("Current: ",T000B2_A41serv_lot_foto[0]);
            }
            if ( Z6unid_id != T000B2_A6unid_id[0] )
            {
               GXutil.writeLogln("servlotado:[seudo value changed for attri]"+"unid_id");
               GXutil.writeLogRaw("Old: ",Z6unid_id);
               GXutil.writeLogRaw("Current: ",T000B2_A6unid_id[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ServLotado"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0B11( )
   {
      beforeValidate0B11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B11( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0B11( 0) ;
         checkOptimisticConcurrency0B11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B11( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0B11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000B10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n39serv_lot_idade), Short.valueOf(A39serv_lot_idade), Boolean.valueOf(n40serv_lot_unid), A40serv_lot_unid, Boolean.valueOf(n41serv_lot_foto), A41serv_lot_foto, Integer.valueOf(A6unid_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000B11 */
                  pr_default.execute(9);
                  A37serv_lot_id = T000B11_A37serv_lot_id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A37serv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A37serv_lot_id), 8, 0));
                  pr_default.close(9);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ServLotado");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption0B0( ) ;
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
            load0B11( ) ;
         }
         endLevel0B11( ) ;
      }
      closeExtendedTableCursors0B11( ) ;
   }

   public void update0B11( )
   {
      beforeValidate0B11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0B11( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0B11( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0B11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000B12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n39serv_lot_idade), Short.valueOf(A39serv_lot_idade), Boolean.valueOf(n40serv_lot_unid), A40serv_lot_unid, Boolean.valueOf(n41serv_lot_foto), A41serv_lot_foto, Integer.valueOf(A6unid_id), Integer.valueOf(A37serv_lot_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ServLotado");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ServLotado"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0B11( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption0B0( ) ;
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
         endLevel0B11( ) ;
      }
      closeExtendedTableCursors0B11( ) ;
   }

   public void deferredUpdate0B11( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0B11( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0B11( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0B11( ) ;
         afterConfirm0B11( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0B11( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000B13 */
               pr_default.execute(11, new Object[] {Integer.valueOf(A37serv_lot_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ServLotado");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound11 == 0 )
                     {
                        initAll0B11( ) ;
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
                     resetCaption0B0( ) ;
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
      sMode11 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0B11( ) ;
      Gx_mode = sMode11 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0B11( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000B14 */
         pr_default.execute(12, new Object[] {Integer.valueOf(A6unid_id)});
         A7unid_nome = T000B14_A7unid_nome[0] ;
         n7unid_nome = T000B14_n7unid_nome[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7unid_nome", A7unid_nome);
         pr_default.close(12);
      }
   }

   public void endLevel0B11( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0B11( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "servlotado");
         if ( AnyError == 0 )
         {
            confirmValues0B0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "servlotado");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0B11( )
   {
      /* Using cursor T000B15 */
      pr_default.execute(13);
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A37serv_lot_id = T000B15_A37serv_lot_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A37serv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A37serv_lot_id), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0B11( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A37serv_lot_id = T000B15_A37serv_lot_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A37serv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A37serv_lot_id), 8, 0));
      }
   }

   public void scanEnd0B11( )
   {
      pr_default.close(13);
   }

   public void afterConfirm0B11( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0B11( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0B11( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0B11( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0B11( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0B11( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0B11( )
   {
      edtserv_lot_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtserv_lot_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtserv_lot_id_Enabled), 5, 0), true);
      edtserv_lot_idade_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtserv_lot_idade_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtserv_lot_idade_Enabled), 5, 0), true);
      edtserv_lot_unid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtserv_lot_unid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtserv_lot_unid_Enabled), 5, 0), true);
      edtserv_lot_foto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtserv_lot_foto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtserv_lot_foto_Enabled), 5, 0), true);
      edtunid_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtunid_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtunid_id_Enabled), 5, 0), true);
      edtunid_nome_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtunid_nome_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtunid_nome_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes0B11( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0B0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.treinamento2.servlotado", new String[] {}, new String[] {}) +"\">") ;
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
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z37serv_lot_id", GXutil.ltrim( localUtil.ntoc( Z37serv_lot_id, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z39serv_lot_idade", GXutil.ltrim( localUtil.ntoc( Z39serv_lot_idade, (byte)(4), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z40serv_lot_unid", Z40serv_lot_unid);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z41serv_lot_foto", Z41serv_lot_foto);
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
      return formatLink("com.treinamento2.servlotado", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ServLotado" ;
   }

   public String getPgmdesc( )
   {
      return "Serv Lotado" ;
   }

   public void initializeNonKey0B11( )
   {
      A39serv_lot_idade = (short)(0) ;
      n39serv_lot_idade = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A39serv_lot_idade", GXutil.ltrimstr( DecimalUtil.doubleToDec(A39serv_lot_idade), 4, 0));
      n39serv_lot_idade = ((0==A39serv_lot_idade) ? true : false) ;
      A40serv_lot_unid = "" ;
      n40serv_lot_unid = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A40serv_lot_unid", A40serv_lot_unid);
      n40serv_lot_unid = ((GXutil.strcmp("", A40serv_lot_unid)==0) ? true : false) ;
      A41serv_lot_foto = "" ;
      n41serv_lot_foto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A41serv_lot_foto", A41serv_lot_foto);
      n41serv_lot_foto = ((GXutil.strcmp("", A41serv_lot_foto)==0) ? true : false) ;
      A6unid_id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6unid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6unid_id), 8, 0));
      A7unid_nome = "" ;
      n7unid_nome = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7unid_nome", A7unid_nome);
      Z39serv_lot_idade = (short)(0) ;
      Z40serv_lot_unid = "" ;
      Z41serv_lot_foto = "" ;
      Z6unid_id = 0 ;
   }

   public void initAll0B11( )
   {
      A37serv_lot_id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A37serv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A37serv_lot_id), 8, 0));
      initializeNonKey0B11( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20254817585324", true, true);
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
      httpContext.AddJavascriptSource("servlotado.js", "?20254817585324", false, true);
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
      edtserv_lot_id_Internalname = "SERV_LOT_ID" ;
      edtserv_lot_idade_Internalname = "SERV_LOT_IDADE" ;
      edtserv_lot_unid_Internalname = "SERV_LOT_UNID" ;
      edtserv_lot_foto_Internalname = "SERV_LOT_FOTO" ;
      edtunid_id_Internalname = "UNID_ID" ;
      edtunid_nome_Internalname = "UNID_NOME" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      Form.setCaption( "Serv Lotado" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtunid_nome_Enabled = 0 ;
      imgprompt_6_Visible = 1 ;
      imgprompt_6_Link = "" ;
      edtunid_id_Jsonclick = "" ;
      edtunid_id_Enabled = 1 ;
      edtserv_lot_foto_Jsonclick = "" ;
      edtserv_lot_foto_Enabled = 1 ;
      edtserv_lot_unid_Jsonclick = "" ;
      edtserv_lot_unid_Enabled = 1 ;
      edtserv_lot_idade_Jsonclick = "" ;
      edtserv_lot_idade_Enabled = 1 ;
      edtserv_lot_id_Jsonclick = "" ;
      edtserv_lot_id_Enabled = 1 ;
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
      GX_FocusControl = edtserv_lot_idade_Internalname ;
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

   public void valid_Serv_lot_id( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A39serv_lot_idade", GXutil.ltrim( localUtil.ntoc( A39serv_lot_idade, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A40serv_lot_unid", A40serv_lot_unid);
      httpContext.ajax_rsp_assign_attri("", false, "A41serv_lot_foto", A41serv_lot_foto);
      httpContext.ajax_rsp_assign_attri("", false, "A6unid_id", GXutil.ltrim( localUtil.ntoc( A6unid_id, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7unid_nome", A7unid_nome);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z37serv_lot_id", GXutil.ltrim( localUtil.ntoc( Z37serv_lot_id, (byte)(8), (byte)(0), ".", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z39serv_lot_idade", GXutil.ltrim( localUtil.ntoc( Z39serv_lot_idade, (byte)(4), (byte)(0), ".", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z40serv_lot_unid", Z40serv_lot_unid);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z41serv_lot_foto", Z41serv_lot_foto);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z6unid_id", GXutil.ltrim( localUtil.ntoc( Z6unid_id, (byte)(8), (byte)(0), ".", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z7unid_nome", Z7unid_nome);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Unid_id( )
   {
      n7unid_nome = false ;
      /* Using cursor T000B14 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A6unid_id)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'Unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtunid_id_Internalname ;
      }
      A7unid_nome = T000B14_A7unid_nome[0] ;
      n7unid_nome = T000B14_n7unid_nome[0] ;
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7unid_nome", A7unid_nome);
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
      setEventMetadata("VALID_SERV_LOT_ID","{handler:'valid_Serv_lot_id',iparms:[{av:'A37serv_lot_id',fld:'SERV_LOT_ID',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_SERV_LOT_ID",",oparms:[{av:'A39serv_lot_idade',fld:'SERV_LOT_IDADE',pic:'ZZZ9'},{av:'A40serv_lot_unid',fld:'SERV_LOT_UNID',pic:''},{av:'A41serv_lot_foto',fld:'SERV_LOT_FOTO',pic:''},{av:'A6unid_id',fld:'UNID_ID',pic:'ZZZZZZZ9'},{av:'A7unid_nome',fld:'UNID_NOME',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z37serv_lot_id'},{av:'Z39serv_lot_idade'},{av:'Z40serv_lot_unid'},{av:'Z41serv_lot_foto'},{av:'Z6unid_id'},{av:'Z7unid_nome'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_UNID_ID","{handler:'valid_Unid_id',iparms:[{av:'A6unid_id',fld:'UNID_ID',pic:'ZZZZZZZ9'},{av:'A7unid_nome',fld:'UNID_NOME',pic:''}]");
      setEventMetadata("VALID_UNID_ID",",oparms:[{av:'A7unid_nome',fld:'UNID_NOME',pic:''}]}");
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
      pr_default.close(12);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z40serv_lot_unid = "" ;
      Z41serv_lot_foto = "" ;
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
      A40serv_lot_unid = "" ;
      A41serv_lot_foto = "" ;
      imgprompt_6_gximage = "" ;
      sImgUrl = "" ;
      A7unid_nome = "" ;
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
      Z7unid_nome = "" ;
      T000B5_A37serv_lot_id = new int[1] ;
      T000B5_A39serv_lot_idade = new short[1] ;
      T000B5_n39serv_lot_idade = new boolean[] {false} ;
      T000B5_A40serv_lot_unid = new String[] {""} ;
      T000B5_n40serv_lot_unid = new boolean[] {false} ;
      T000B5_A41serv_lot_foto = new String[] {""} ;
      T000B5_n41serv_lot_foto = new boolean[] {false} ;
      T000B5_A7unid_nome = new String[] {""} ;
      T000B5_n7unid_nome = new boolean[] {false} ;
      T000B5_A6unid_id = new int[1] ;
      T000B4_A7unid_nome = new String[] {""} ;
      T000B4_n7unid_nome = new boolean[] {false} ;
      T000B6_A7unid_nome = new String[] {""} ;
      T000B6_n7unid_nome = new boolean[] {false} ;
      T000B7_A37serv_lot_id = new int[1] ;
      T000B3_A37serv_lot_id = new int[1] ;
      T000B3_A39serv_lot_idade = new short[1] ;
      T000B3_n39serv_lot_idade = new boolean[] {false} ;
      T000B3_A40serv_lot_unid = new String[] {""} ;
      T000B3_n40serv_lot_unid = new boolean[] {false} ;
      T000B3_A41serv_lot_foto = new String[] {""} ;
      T000B3_n41serv_lot_foto = new boolean[] {false} ;
      T000B3_A6unid_id = new int[1] ;
      sMode11 = "" ;
      T000B8_A37serv_lot_id = new int[1] ;
      T000B9_A37serv_lot_id = new int[1] ;
      T000B2_A37serv_lot_id = new int[1] ;
      T000B2_A39serv_lot_idade = new short[1] ;
      T000B2_n39serv_lot_idade = new boolean[] {false} ;
      T000B2_A40serv_lot_unid = new String[] {""} ;
      T000B2_n40serv_lot_unid = new boolean[] {false} ;
      T000B2_A41serv_lot_foto = new String[] {""} ;
      T000B2_n41serv_lot_foto = new boolean[] {false} ;
      T000B2_A6unid_id = new int[1] ;
      T000B11_A37serv_lot_id = new int[1] ;
      T000B14_A7unid_nome = new String[] {""} ;
      T000B14_n7unid_nome = new boolean[] {false} ;
      T000B15_A37serv_lot_id = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ40serv_lot_unid = "" ;
      ZZ41serv_lot_foto = "" ;
      ZZ7unid_nome = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.servlotado__default(),
         new Object[] {
             new Object[] {
            T000B2_A37serv_lot_id, T000B2_A39serv_lot_idade, T000B2_n39serv_lot_idade, T000B2_A40serv_lot_unid, T000B2_n40serv_lot_unid, T000B2_A41serv_lot_foto, T000B2_n41serv_lot_foto, T000B2_A6unid_id
            }
            , new Object[] {
            T000B3_A37serv_lot_id, T000B3_A39serv_lot_idade, T000B3_n39serv_lot_idade, T000B3_A40serv_lot_unid, T000B3_n40serv_lot_unid, T000B3_A41serv_lot_foto, T000B3_n41serv_lot_foto, T000B3_A6unid_id
            }
            , new Object[] {
            T000B4_A7unid_nome, T000B4_n7unid_nome
            }
            , new Object[] {
            T000B5_A37serv_lot_id, T000B5_A39serv_lot_idade, T000B5_n39serv_lot_idade, T000B5_A40serv_lot_unid, T000B5_n40serv_lot_unid, T000B5_A41serv_lot_foto, T000B5_n41serv_lot_foto, T000B5_A7unid_nome, T000B5_n7unid_nome, T000B5_A6unid_id
            }
            , new Object[] {
            T000B6_A7unid_nome, T000B6_n7unid_nome
            }
            , new Object[] {
            T000B7_A37serv_lot_id
            }
            , new Object[] {
            T000B8_A37serv_lot_id
            }
            , new Object[] {
            T000B9_A37serv_lot_id
            }
            , new Object[] {
            }
            , new Object[] {
            T000B11_A37serv_lot_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000B14_A7unid_nome, T000B14_n7unid_nome
            }
            , new Object[] {
            T000B15_A37serv_lot_id
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z39serv_lot_idade ;
   private short gxcookieaux ;
   private short AnyError ;
   private short IsModified ;
   private short IsConfirmed ;
   private short A39serv_lot_idade ;
   private short RcdFound11 ;
   private short ZZ39serv_lot_idade ;
   private int Z37serv_lot_id ;
   private int Z6unid_id ;
   private int A6unid_id ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A37serv_lot_id ;
   private int edtserv_lot_id_Enabled ;
   private int edtserv_lot_idade_Enabled ;
   private int edtserv_lot_unid_Enabled ;
   private int edtserv_lot_foto_Enabled ;
   private int edtunid_id_Enabled ;
   private int imgprompt_6_Visible ;
   private int edtunid_nome_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ37serv_lot_id ;
   private int ZZ6unid_id ;
   private String sPrefix ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtserv_lot_id_Internalname ;
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
   private String edtserv_lot_id_Jsonclick ;
   private String edtserv_lot_idade_Internalname ;
   private String edtserv_lot_idade_Jsonclick ;
   private String edtserv_lot_unid_Internalname ;
   private String edtserv_lot_unid_Jsonclick ;
   private String edtserv_lot_foto_Internalname ;
   private String edtserv_lot_foto_Jsonclick ;
   private String edtunid_id_Internalname ;
   private String edtunid_id_Jsonclick ;
   private String imgprompt_6_gximage ;
   private String sImgUrl ;
   private String imgprompt_6_Internalname ;
   private String imgprompt_6_Link ;
   private String edtunid_nome_Internalname ;
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
   private String sMode11 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n39serv_lot_idade ;
   private boolean n40serv_lot_unid ;
   private boolean n41serv_lot_foto ;
   private boolean n7unid_nome ;
   private String Z40serv_lot_unid ;
   private String Z41serv_lot_foto ;
   private String A40serv_lot_unid ;
   private String A41serv_lot_foto ;
   private String A7unid_nome ;
   private String Z7unid_nome ;
   private String ZZ40serv_lot_unid ;
   private String ZZ41serv_lot_foto ;
   private String ZZ7unid_nome ;
   private com.genexus.webpanels.GXWebForm Form ;
   private IDataStoreProvider pr_default ;
   private int[] T000B5_A37serv_lot_id ;
   private short[] T000B5_A39serv_lot_idade ;
   private boolean[] T000B5_n39serv_lot_idade ;
   private String[] T000B5_A40serv_lot_unid ;
   private boolean[] T000B5_n40serv_lot_unid ;
   private String[] T000B5_A41serv_lot_foto ;
   private boolean[] T000B5_n41serv_lot_foto ;
   private String[] T000B5_A7unid_nome ;
   private boolean[] T000B5_n7unid_nome ;
   private int[] T000B5_A6unid_id ;
   private String[] T000B4_A7unid_nome ;
   private boolean[] T000B4_n7unid_nome ;
   private String[] T000B6_A7unid_nome ;
   private boolean[] T000B6_n7unid_nome ;
   private int[] T000B7_A37serv_lot_id ;
   private int[] T000B3_A37serv_lot_id ;
   private short[] T000B3_A39serv_lot_idade ;
   private boolean[] T000B3_n39serv_lot_idade ;
   private String[] T000B3_A40serv_lot_unid ;
   private boolean[] T000B3_n40serv_lot_unid ;
   private String[] T000B3_A41serv_lot_foto ;
   private boolean[] T000B3_n41serv_lot_foto ;
   private int[] T000B3_A6unid_id ;
   private int[] T000B8_A37serv_lot_id ;
   private int[] T000B9_A37serv_lot_id ;
   private int[] T000B2_A37serv_lot_id ;
   private short[] T000B2_A39serv_lot_idade ;
   private boolean[] T000B2_n39serv_lot_idade ;
   private String[] T000B2_A40serv_lot_unid ;
   private boolean[] T000B2_n40serv_lot_unid ;
   private String[] T000B2_A41serv_lot_foto ;
   private boolean[] T000B2_n41serv_lot_foto ;
   private int[] T000B2_A6unid_id ;
   private int[] T000B11_A37serv_lot_id ;
   private String[] T000B14_A7unid_nome ;
   private boolean[] T000B14_n7unid_nome ;
   private int[] T000B15_A37serv_lot_id ;
}

final  class servlotado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000B2", "SELECT serv_lot_id, serv_lot_idade, serv_lot_unid, serv_lot_foto, unid_id FROM ServLotado WHERE serv_lot_id = ?  FOR UPDATE OF ServLotado NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000B3", "SELECT serv_lot_id, serv_lot_idade, serv_lot_unid, serv_lot_foto, unid_id FROM ServLotado WHERE serv_lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000B4", "SELECT unid_nome FROM Unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000B5", "SELECT TM1.serv_lot_id, TM1.serv_lot_idade, TM1.serv_lot_unid, TM1.serv_lot_foto, T2.unid_nome, TM1.unid_id FROM (ServLotado TM1 INNER JOIN Unidade T2 ON T2.unid_id = TM1.unid_id) WHERE TM1.serv_lot_id = ? ORDER BY TM1.serv_lot_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000B6", "SELECT unid_nome FROM Unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000B7", "SELECT serv_lot_id FROM ServLotado WHERE serv_lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000B8", "SELECT serv_lot_id FROM ServLotado WHERE ( serv_lot_id > ?) ORDER BY serv_lot_id  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000B9", "SELECT serv_lot_id FROM ServLotado WHERE ( serv_lot_id < ?) ORDER BY serv_lot_id DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000B10", "SAVEPOINT gxupdate;INSERT INTO ServLotado(serv_lot_idade, serv_lot_unid, serv_lot_foto, unid_id) VALUES(?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000B11", "SELECT currval('serv_lot_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000B12", "SAVEPOINT gxupdate;UPDATE ServLotado SET serv_lot_idade=?, serv_lot_unid=?, serv_lot_foto=?, unid_id=?  WHERE serv_lot_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000B13", "SAVEPOINT gxupdate;DELETE FROM ServLotado  WHERE serv_lot_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000B14", "SELECT unid_nome FROM Unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000B15", "SELECT serv_lot_id FROM ServLotado ORDER BY serv_lot_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 40);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 40);
               }
               stmt.setInt(4, ((Number) parms[6]).intValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 40);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 40);
               }
               stmt.setInt(4, ((Number) parms[6]).intValue());
               stmt.setInt(5, ((Number) parms[7]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

