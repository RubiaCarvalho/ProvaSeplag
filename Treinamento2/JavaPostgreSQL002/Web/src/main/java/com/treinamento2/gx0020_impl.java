package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class gx0020_impl extends GXDataArea
{
   public gx0020_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0020_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0020_impl.class ));
   }

   public gx0020_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "pend_id") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "pend_id") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "pend_id") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            gxnrgrid1_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            gxgrgrid1_refresh_invoke( ) ;
            return  ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV11pend_id = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11pend_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11pend_id), 8, 0));
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_64 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_64"))) ;
      nGXsfl_64_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_64_idx"))) ;
      sGXsfl_64_idx = httpContext.GetPar( "sGXsfl_64_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public void gxgrgrid1_refresh_invoke( )
   {
      subGrid1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid1_Rows"))) ;
      AV6cend_id = (int)(GXutil.lval( httpContext.GetPar( "cend_id"))) ;
      AV7cend_tipo_logradouro = httpContext.GetPar( "cend_tipo_logradouro") ;
      AV8cend_numero = (short)(GXutil.lval( httpContext.GetPar( "cend_numero"))) ;
      AV9cend_bairro = httpContext.GetPar( "cend_bairro") ;
      AV10ccid_id = (int)(GXutil.lval( httpContext.GetPar( "ccid_id"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( subGrid1_Rows, AV6cend_id, AV7cend_tipo_logradouro, AV8cend_numero, AV9cend_bairro, AV10ccid_id) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid1_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "com.treinamento2.general.ui.masterprompt");
         MasterPageObj.setDataArea(this,true);
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

   public byte executeStartEvent( )
   {
      pa072( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start072( ) ;
      }
      return gxajaxcallmode ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
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
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.treinamento2.gx0020", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV11pend_id,8,0))}, new String[] {"pend_id"}) +"\">") ;
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
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCEND_ID", GXutil.ltrim( localUtil.ntoc( AV6cend_id, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCEND_TIPO_LOGRADOURO", AV7cend_tipo_logradouro);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCEND_NUMERO", GXutil.ltrim( localUtil.ntoc( AV8cend_numero, (byte)(4), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCEND_BAIRRO", AV9cend_bairro);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCID_ID", GXutil.ltrim( localUtil.ntoc( AV10ccid_id, (byte)(8), (byte)(0), ",", "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_64", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_64, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "vPEND_ID", GXutil.ltrim( localUtil.ntoc( AV11pend_id, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "END_IDFILTERCONTAINER_Class", GXutil.rtrim( divEnd_idfiltercontainer_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "END_TIPO_LOGRADOUROFILTERCONTAINER_Class", GXutil.rtrim( divEnd_tipo_logradourofiltercontainer_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "END_NUMEROFILTERCONTAINER_Class", GXutil.rtrim( divEnd_numerofiltercontainer_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "END_BAIRROFILTERCONTAINER_Class", GXutil.rtrim( divEnd_bairrofiltercontainer_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "CID_IDFILTERCONTAINER_Class", GXutil.rtrim( divCid_idfiltercontainer_Class));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
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

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.treinamento2.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we072( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt072( ) ;
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
      return formatLink("com.treinamento2.gx0020", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV11pend_id,8,0))}, new String[] {"pend_id"})  ;
   }

   public String getPgmname( )
   {
      return "Gx0020" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Endereco" ;
   }

   public void wb070( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         com.treinamento2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "start", "top", " "+"data-gx-base-lib=\"none\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divMain_Internalname, 1, 0, "px", 0, "px", "ContainerFluid PromptContainer", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 PromptAdvancedBarCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divAdvancedcontainer_Internalname, 1, 0, "px", 0, "px", divAdvancedcontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divEnd_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divEnd_idfiltercontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLblend_idfilter_Internalname, "end_id", "", "", lblLblend_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11071_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0020.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.treinamento2.GxWebStd.gx_label_element( httpContext, edtavCend_id_Internalname, "end_id", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavCend_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cend_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtavCend_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6cend_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6cend_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCend_id_Jsonclick, 0, "Attribute", "", "", "", "", edtavCend_id_Visible, edtavCend_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Gx0020.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
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
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divEnd_tipo_logradourofiltercontainer_Internalname, 1, 0, "px", 0, "px", divEnd_tipo_logradourofiltercontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLblend_tipo_logradourofilter_Internalname, "end_tipo_logradouro", "", "", lblLblend_tipo_logradourofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12071_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0020.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.treinamento2.GxWebStd.gx_label_element( httpContext, edtavCend_tipo_logradouro_Internalname, "end_tipo_logradouro", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavCend_tipo_logradouro_Internalname, AV7cend_tipo_logradouro, GXutil.rtrim( localUtil.format( AV7cend_tipo_logradouro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCend_tipo_logradouro_Jsonclick, 0, "Attribute", "", "", "", "", edtavCend_tipo_logradouro_Visible, edtavCend_tipo_logradouro_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_Gx0020.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
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
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divEnd_numerofiltercontainer_Internalname, 1, 0, "px", 0, "px", divEnd_numerofiltercontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLblend_numerofilter_Internalname, "end_numero", "", "", lblLblend_numerofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13071_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0020.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.treinamento2.GxWebStd.gx_label_element( httpContext, edtavCend_numero_Internalname, "end_numero", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavCend_numero_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cend_numero, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( ((edtavCend_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8cend_numero), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8cend_numero), "ZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCend_numero_Jsonclick, 0, "Attribute", "", "", "", "", edtavCend_numero_Visible, edtavCend_numero_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Gx0020.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
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
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divEnd_bairrofiltercontainer_Internalname, 1, 0, "px", 0, "px", divEnd_bairrofiltercontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLblend_bairrofilter_Internalname, "end_bairro", "", "", lblLblend_bairrofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14071_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0020.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.treinamento2.GxWebStd.gx_label_element( httpContext, edtavCend_bairro_Internalname, "end_bairro", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavCend_bairro_Internalname, AV9cend_bairro, GXutil.rtrim( localUtil.format( AV9cend_bairro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCend_bairro_Jsonclick, 0, "Attribute", "", "", "", "", edtavCend_bairro_Visible, edtavCend_bairro_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_Gx0020.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
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
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divCid_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCid_idfiltercontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLblcid_idfilter_Internalname, "cid_id", "", "", lblLblcid_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e15071_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0020.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.treinamento2.GxWebStd.gx_label_element( httpContext, edtavCcid_id_Internalname, "cid_id", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavCcid_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV10ccid_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtavCcid_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10ccid_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10ccid_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcid_id_Jsonclick, 0, "Attribute", "", "", "", "", edtavCcid_id_Visible, edtavCcid_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Gx0020.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 WWGridCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "Table", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-sm hidden-md hidden-lg ToggleCell", "start", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 64, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e16071_client"+"'", TempTags, "", 2, "HLP_Gx0020.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         startgridcontrol64( ) ;
      }
      if ( wbEnd == 64 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_64 = (int)(nGXsfl_64_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 64, 2, 0)+","+"null"+");", "Fechar", bttBtn_cancel_Jsonclick, 1, "Fechar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0020.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      }
      if ( wbEnd == 64 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid1Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
               Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start072( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 18_0_11-185416", (short)(0)) ;
         }
      }
      Form.getMeta().addItem("description", "Selection List Endereco", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup070( ) ;
   }

   public void ws072( )
   {
      start072( ) ;
      evt072( ) ;
   }

   public void evt072( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
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
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID1PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid1_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid1_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid1_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid1_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_64_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_642( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV13Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_64_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A2end_id = (int)(localUtil.ctol( httpContext.cgiGet( edtend_id_Internalname), ",", ".")) ;
                           A10end_tipo_logradouro = httpContext.cgiGet( edtend_tipo_logradouro_Internalname) ;
                           n10end_tipo_logradouro = false ;
                           A12end_numero = (short)(localUtil.ctol( httpContext.cgiGet( edtend_numero_Internalname), ",", ".")) ;
                           n12end_numero = false ;
                           A1cid_id = (int)(localUtil.ctol( httpContext.cgiGet( edtcid_id_Internalname), ",", ".")) ;
                           n1cid_id = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e17072 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e18072 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cend_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCEND_ID"), ",", ".") != AV6cend_id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cend_tipo_logradouro Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCEND_TIPO_LOGRADOURO"), AV7cend_tipo_logradouro) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cend_numero Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCEND_NUMERO"), ",", ".") != AV8cend_numero )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cend_bairro Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCEND_BAIRRO"), AV9cend_bairro) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccid_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCID_ID"), ",", ".") != AV10ccid_id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e19072 ();
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we072( )
   {
      if ( ! com.treinamento2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.treinamento2.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa072( )
   {
      if ( nDonePA == 0 )
      {
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
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      com.treinamento2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_642( ) ;
      while ( nGXsfl_64_idx <= nRC_GXsfl_64 )
      {
         sendrow_642( ) ;
         nGXsfl_64_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_64_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_64_idx+1) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_642( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  int AV6cend_id ,
                                  String AV7cend_tipo_logradouro ,
                                  short AV8cend_numero ,
                                  String AV9cend_bairro ,
                                  int AV10ccid_id )
   {
      initialize_formulas( ) ;
      com.treinamento2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf072( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "gxhash_END_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2end_id), "ZZZZZZZ9")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "END_ID", GXutil.ltrim( localUtil.ntoc( A2end_id, (byte)(8), (byte)(0), ".", "")));
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf072( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
   }

   public void rf072( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(64) ;
      nGXsfl_64_idx = 1 ;
      sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_642( ) ;
      bGXsfl_64_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "PromptGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_642( ) ;
         GXPagingFrom2 = (int)(GRID1_nFirstRecordOnPage) ;
         GXPagingTo2 = (int)(subgrid1_fnc_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV7cend_tipo_logradouro ,
                                              Short.valueOf(AV8cend_numero) ,
                                              AV9cend_bairro ,
                                              Integer.valueOf(AV10ccid_id) ,
                                              A10end_tipo_logradouro ,
                                              Short.valueOf(A12end_numero) ,
                                              A13end_bairro ,
                                              Integer.valueOf(A1cid_id) ,
                                              Integer.valueOf(AV6cend_id) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT
                                              }
         });
         lV7cend_tipo_logradouro = GXutil.concat( GXutil.rtrim( AV7cend_tipo_logradouro), "%", "") ;
         lV9cend_bairro = GXutil.concat( GXutil.rtrim( AV9cend_bairro), "%", "") ;
         /* Using cursor H00072 */
         pr_default.execute(0, new Object[] {Integer.valueOf(AV6cend_id), lV7cend_tipo_logradouro, Short.valueOf(AV8cend_numero), lV9cend_bairro, Integer.valueOf(AV10ccid_id), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_64_idx = 1 ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_642( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( GRID1_nCurrentRecord < subgrid1_fnc_recordsperpage( ) ) ) )
         {
            A13end_bairro = H00072_A13end_bairro[0] ;
            n13end_bairro = H00072_n13end_bairro[0] ;
            A1cid_id = H00072_A1cid_id[0] ;
            n1cid_id = H00072_n1cid_id[0] ;
            A12end_numero = H00072_A12end_numero[0] ;
            n12end_numero = H00072_n12end_numero[0] ;
            A10end_tipo_logradouro = H00072_A10end_tipo_logradouro[0] ;
            n10end_tipo_logradouro = H00072_n10end_tipo_logradouro[0] ;
            A2end_id = H00072_A2end_id[0] ;
            /* Execute user event: Load */
            e18072 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(64) ;
         wb070( ) ;
      }
      bGXsfl_64_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes072( )
   {
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "gxhash_END_ID"+"_"+sGXsfl_64_idx, getSecureSignedToken( sGXsfl_64_idx, localUtil.format( DecimalUtil.doubleToDec(A2end_id), "ZZZZZZZ9")));
   }

   public int subgrid1_fnc_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( ((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( DecimalUtil.decToDouble(DecimalUtil.doubleToDec(GRID1_nRecordCount).divide(DecimalUtil.doubleToDec(subgrid1_fnc_recordsperpage( )), java.math.MathContext.DECIMAL128)))) ;
      }
      return (int)(GXutil.Int( DecimalUtil.decToDouble(DecimalUtil.doubleToDec(GRID1_nRecordCount).divide(DecimalUtil.doubleToDec(subgrid1_fnc_recordsperpage( )), java.math.MathContext.DECIMAL128)))+1) ;
   }

   public int subgrid1_fnc_recordcount( )
   {
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV7cend_tipo_logradouro ,
                                           Short.valueOf(AV8cend_numero) ,
                                           AV9cend_bairro ,
                                           Integer.valueOf(AV10ccid_id) ,
                                           A10end_tipo_logradouro ,
                                           Short.valueOf(A12end_numero) ,
                                           A13end_bairro ,
                                           Integer.valueOf(A1cid_id) ,
                                           Integer.valueOf(AV6cend_id) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT
                                           }
      });
      lV7cend_tipo_logradouro = GXutil.concat( GXutil.rtrim( AV7cend_tipo_logradouro), "%", "") ;
      lV9cend_bairro = GXutil.concat( GXutil.rtrim( AV9cend_bairro), "%", "") ;
      /* Using cursor H00073 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV6cend_id), lV7cend_tipo_logradouro, Short.valueOf(AV8cend_numero), lV9cend_bairro, Integer.valueOf(AV10ccid_id)});
      GRID1_nRecordCount = H00073_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID1_nRecordCount) ;
   }

   public int subgrid1_fnc_recordsperpage( )
   {
      return 10*1 ;
   }

   public int subgrid1_fnc_currentpage( )
   {
      return (int)(GXutil.Int( DecimalUtil.decToDouble(DecimalUtil.doubleToDec(GRID1_nFirstRecordOnPage).divide(DecimalUtil.doubleToDec(subgrid1_fnc_recordsperpage( )), java.math.MathContext.DECIMAL128)))+1) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cend_id, AV7cend_tipo_logradouro, AV8cend_numero, AV9cend_bairro, AV10ccid_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_fnc_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cend_id, AV7cend_tipo_logradouro, AV8cend_numero, AV9cend_bairro, AV10ccid_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_fnc_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cend_id, AV7cend_tipo_logradouro, AV8cend_numero, AV9cend_bairro, AV10ccid_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( )))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-subgrid1_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cend_id, AV7cend_tipo_logradouro, AV8cend_numero, AV9cend_bairro, AV10ccid_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cend_id, AV7cend_tipo_logradouro, AV8cend_numero, AV9cend_bairro, AV10ccid_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      edtend_id_Enabled = 0 ;
      edtend_tipo_logradouro_Enabled = 0 ;
      edtend_numero_Enabled = 0 ;
      edtcid_id_Enabled = 0 ;
      fix_multi_value_controls( ) ;
   }

   public void strup070( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e17072 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_64 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_64"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCend_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCend_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCEND_ID");
            GX_FocusControl = edtavCend_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cend_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cend_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cend_id), 8, 0));
         }
         else
         {
            AV6cend_id = (int)(localUtil.ctol( httpContext.cgiGet( edtavCend_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cend_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cend_id), 8, 0));
         }
         AV7cend_tipo_logradouro = httpContext.cgiGet( edtavCend_tipo_logradouro_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cend_tipo_logradouro", AV7cend_tipo_logradouro);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCend_numero_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCend_numero_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCEND_NUMERO");
            GX_FocusControl = edtavCend_numero_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cend_numero = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cend_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8cend_numero), 4, 0));
         }
         else
         {
            AV8cend_numero = (short)(localUtil.ctol( httpContext.cgiGet( edtavCend_numero_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cend_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8cend_numero), 4, 0));
         }
         AV9cend_bairro = httpContext.cgiGet( edtavCend_bairro_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cend_bairro", AV9cend_bairro);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcid_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcid_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCID_ID");
            GX_FocusControl = edtavCcid_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10ccid_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10ccid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ccid_id), 8, 0));
         }
         else
         {
            AV10ccid_id = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcid_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10ccid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ccid_id), 8, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCEND_ID"), ",", ".") != AV6cend_id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCEND_TIPO_LOGRADOURO"), AV7cend_tipo_logradouro) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCEND_NUMERO"), ",", ".") != AV8cend_numero )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCEND_BAIRRO"), AV9cend_bairro) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCID_ID"), ",", ".") != AV10ccid_id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e17072 ();
      if (returnInSub) return;
   }

   public void e17072( )
   {
      /* Start Routine */
      returnInSub = false ;
      Form.setCaption( GXutil.format( "Lista de Seleção %1", "Endereco", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV12ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e18072( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtavLinkselection_gximage = "selectRow" ;
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavLinkselection_Internalname, AV5LinkSelection);
      AV13Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_642( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_64_Refreshing )
      {
         httpContext.doAjaxLoad(64, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e19072 ();
      if (returnInSub) return;
   }

   public void e19072( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV11pend_id = A2end_id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pend_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11pend_id), 8, 0));
      httpContext.setWebReturnParms(new Object[] {Integer.valueOf(AV11pend_id)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV11pend_id"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV11pend_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pend_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11pend_id), 8, 0));
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa072( ) ;
      ws072( ) ;
      we072( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20254815253692", true, true);
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
      httpContext.AddJavascriptSource("gx0020.js", "?20254815253692", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_642( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_64_idx ;
      edtend_id_Internalname = "END_ID_"+sGXsfl_64_idx ;
      edtend_tipo_logradouro_Internalname = "END_TIPO_LOGRADOURO_"+sGXsfl_64_idx ;
      edtend_numero_Internalname = "END_NUMERO_"+sGXsfl_64_idx ;
      edtcid_id_Internalname = "CID_ID_"+sGXsfl_64_idx ;
   }

   public void subsflControlProps_fel_642( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_64_fel_idx ;
      edtend_id_Internalname = "END_ID_"+sGXsfl_64_fel_idx ;
      edtend_tipo_logradouro_Internalname = "END_TIPO_LOGRADOURO_"+sGXsfl_64_fel_idx ;
      edtend_numero_Internalname = "END_NUMERO_"+sGXsfl_64_fel_idx ;
      edtcid_id_Internalname = "CID_ID_"+sGXsfl_64_fel_idx ;
   }

   public void sendrow_642( )
   {
      sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_642( ) ;
      wb070( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_64_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
      {
         Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            subGrid1_Backcolor = subGrid1_Allbackcolor ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
            subGrid1_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_64_idx) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"PromptGrid"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_64_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2end_id, (byte)(8), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_64_Refreshing);
         ClassString = "SelectionAttribute" + " " + ((GXutil.strcmp(edtavLinkselection_gximage, "")==0) ? "" : "GX_Image_"+edtavLinkselection_gximage+"_Class") ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV13Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV13Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"WWActionColumn","","","","","","",Integer.valueOf(1),Boolean.valueOf(AV5LinkSelection_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"end"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtend_id_Internalname,GXutil.ltrim( localUtil.ntoc( A2end_id, (byte)(8), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2end_id), "ZZZZZZZ9"))," dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtend_id_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"Id","end",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"start"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtend_tipo_logradouro_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2end_id, (byte)(8), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtend_tipo_logradouro_Internalname, "Link", edtend_tipo_logradouro_Link, !bGXsfl_64_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtend_tipo_logradouro_Internalname,A10end_tipo_logradouro,"","","'"+""+"'"+",false,"+"'"+""+"'",edtend_tipo_logradouro_Link,"","","",edtend_tipo_logradouro_Jsonclick,Integer.valueOf(0),"DescriptionAttribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","start",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"end"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtend_numero_Internalname,GXutil.ltrim( localUtil.ntoc( A12end_numero, (byte)(4), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12end_numero), "ZZZ9"))," dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtend_numero_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","end",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"end"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtcid_id_Internalname,GXutil.ltrim( localUtil.ntoc( A1cid_id, (byte)(8), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1cid_id), "ZZZZZZZ9"))," dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtcid_id_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"Id","end",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes072( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_64_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_64_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_64_idx+1) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_642( ) ;
      }
      /* End function sendrow_642 */
   }

   public void startgridcontrol64( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"64\">") ;
         sStyleString = "" ;
         com.treinamento2.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "PromptGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            subGrid1_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid1_Class) > 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Title" ;
            }
         }
         else
         {
            subGrid1_Titlebackstyle = (byte)(1) ;
            if ( subGrid1_Backcolorstyle == 1 )
            {
               subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"SelectionAttribute"+" "+((GXutil.strcmp(edtavLinkselection_gximage, "")==0) ? "" : "GX_Image_"+edtavLinkselection_gximage+"_Class")+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"end"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "end_id") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"start"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "end_tipo_logradouro") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"end"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "end_numero") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"end"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "cid_id") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid1Container.AddObjectProperty("GridName", "Grid1");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            Grid1Container.Clear();
         }
         Grid1Container.SetWrapped(nGXWrapped);
         Grid1Container.AddObjectProperty("GridName", "Grid1");
         Grid1Container.AddObjectProperty("Header", subGrid1_Header);
         Grid1Container.AddObjectProperty("Class", "PromptGrid");
         Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("CmpContext", "");
         Grid1Container.AddObjectProperty("InMasterPage", "false");
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV5LinkSelection));
         Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( GXutil.ltrim( localUtil.ntoc( A2end_id, (byte)(8), (byte)(0), ".", ""))));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( A10end_tipo_logradouro));
         Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtend_tipo_logradouro_Link));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( GXutil.ltrim( localUtil.ntoc( A12end_numero, (byte)(4), (byte)(0), ".", ""))));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( GXutil.ltrim( localUtil.ntoc( A1cid_id, (byte)(8), (byte)(0), ".", ""))));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      lblLblend_idfilter_Internalname = "LBLEND_IDFILTER" ;
      edtavCend_id_Internalname = "vCEND_ID" ;
      divEnd_idfiltercontainer_Internalname = "END_IDFILTERCONTAINER" ;
      lblLblend_tipo_logradourofilter_Internalname = "LBLEND_TIPO_LOGRADOUROFILTER" ;
      edtavCend_tipo_logradouro_Internalname = "vCEND_TIPO_LOGRADOURO" ;
      divEnd_tipo_logradourofiltercontainer_Internalname = "END_TIPO_LOGRADOUROFILTERCONTAINER" ;
      lblLblend_numerofilter_Internalname = "LBLEND_NUMEROFILTER" ;
      edtavCend_numero_Internalname = "vCEND_NUMERO" ;
      divEnd_numerofiltercontainer_Internalname = "END_NUMEROFILTERCONTAINER" ;
      lblLblend_bairrofilter_Internalname = "LBLEND_BAIRROFILTER" ;
      edtavCend_bairro_Internalname = "vCEND_BAIRRO" ;
      divEnd_bairrofiltercontainer_Internalname = "END_BAIRROFILTERCONTAINER" ;
      lblLblcid_idfilter_Internalname = "LBLCID_IDFILTER" ;
      edtavCcid_id_Internalname = "vCCID_ID" ;
      divCid_idfiltercontainer_Internalname = "CID_IDFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtend_id_Internalname = "END_ID" ;
      edtend_tipo_logradouro_Internalname = "END_TIPO_LOGRADOURO" ;
      edtend_numero_Internalname = "END_NUMERO" ;
      edtcid_id_Internalname = "CID_ID" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      divMain_Internalname = "MAIN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
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
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      edtcid_id_Jsonclick = "" ;
      edtend_numero_Jsonclick = "" ;
      edtend_tipo_logradouro_Jsonclick = "" ;
      edtend_tipo_logradouro_Link = "" ;
      edtend_id_Jsonclick = "" ;
      edtavLinkselection_gximage = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtcid_id_Enabled = 0 ;
      edtend_numero_Enabled = 0 ;
      edtend_tipo_logradouro_Enabled = 0 ;
      edtend_id_Enabled = 0 ;
      edtavCcid_id_Jsonclick = "" ;
      edtavCcid_id_Enabled = 1 ;
      edtavCcid_id_Visible = 1 ;
      edtavCend_bairro_Jsonclick = "" ;
      edtavCend_bairro_Enabled = 1 ;
      edtavCend_bairro_Visible = 1 ;
      edtavCend_numero_Jsonclick = "" ;
      edtavCend_numero_Enabled = 1 ;
      edtavCend_numero_Visible = 1 ;
      edtavCend_tipo_logradouro_Jsonclick = "" ;
      edtavCend_tipo_logradouro_Enabled = 1 ;
      edtavCend_tipo_logradouro_Visible = 1 ;
      edtavCend_id_Jsonclick = "" ;
      edtavCend_id_Enabled = 1 ;
      edtavCend_id_Visible = 1 ;
      divCid_idfiltercontainer_Class = "AdvancedContainerItem AdvancedContainerItemExpanded" ;
      divEnd_bairrofiltercontainer_Class = "AdvancedContainerItem AdvancedContainerItemExpanded" ;
      divEnd_numerofiltercontainer_Class = "AdvancedContainerItem AdvancedContainerItemExpanded" ;
      divEnd_tipo_logradourofiltercontainer_Class = "AdvancedContainerItem AdvancedContainerItemExpanded" ;
      divEnd_idfiltercontainer_Class = "AdvancedContainerItem AdvancedContainerItemExpanded" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Endereco" );
      subGrid1_Rows = 10 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cend_id',fld:'vCEND_ID',pic:'ZZZZZZZ9'},{av:'AV7cend_tipo_logradouro',fld:'vCEND_TIPO_LOGRADOURO',pic:''},{av:'AV8cend_numero',fld:'vCEND_NUMERO',pic:'ZZZ9'},{av:'AV9cend_bairro',fld:'vCEND_BAIRRO',pic:''},{av:'AV10ccid_id',fld:'vCCID_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e16071',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]");
      setEventMetadata("'TOGGLE'",",oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLEND_IDFILTER.CLICK","{handler:'e11071',iparms:[{av:'divEnd_idfiltercontainer_Class',ctrl:'END_IDFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLEND_IDFILTER.CLICK",",oparms:[{av:'divEnd_idfiltercontainer_Class',ctrl:'END_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCend_id_Visible',ctrl:'vCEND_ID',prop:'Visible'}]}");
      setEventMetadata("LBLEND_TIPO_LOGRADOUROFILTER.CLICK","{handler:'e12071',iparms:[{av:'divEnd_tipo_logradourofiltercontainer_Class',ctrl:'END_TIPO_LOGRADOUROFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLEND_TIPO_LOGRADOUROFILTER.CLICK",",oparms:[{av:'divEnd_tipo_logradourofiltercontainer_Class',ctrl:'END_TIPO_LOGRADOUROFILTERCONTAINER',prop:'Class'},{av:'edtavCend_tipo_logradouro_Visible',ctrl:'vCEND_TIPO_LOGRADOURO',prop:'Visible'}]}");
      setEventMetadata("LBLEND_NUMEROFILTER.CLICK","{handler:'e13071',iparms:[{av:'divEnd_numerofiltercontainer_Class',ctrl:'END_NUMEROFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLEND_NUMEROFILTER.CLICK",",oparms:[{av:'divEnd_numerofiltercontainer_Class',ctrl:'END_NUMEROFILTERCONTAINER',prop:'Class'},{av:'edtavCend_numero_Visible',ctrl:'vCEND_NUMERO',prop:'Visible'}]}");
      setEventMetadata("LBLEND_BAIRROFILTER.CLICK","{handler:'e14071',iparms:[{av:'divEnd_bairrofiltercontainer_Class',ctrl:'END_BAIRROFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLEND_BAIRROFILTER.CLICK",",oparms:[{av:'divEnd_bairrofiltercontainer_Class',ctrl:'END_BAIRROFILTERCONTAINER',prop:'Class'},{av:'edtavCend_bairro_Visible',ctrl:'vCEND_BAIRRO',prop:'Visible'}]}");
      setEventMetadata("LBLCID_IDFILTER.CLICK","{handler:'e15071',iparms:[{av:'divCid_idfiltercontainer_Class',ctrl:'CID_IDFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLCID_IDFILTER.CLICK",",oparms:[{av:'divCid_idfiltercontainer_Class',ctrl:'CID_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCcid_id_Visible',ctrl:'vCCID_ID',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e19072',iparms:[{av:'A2end_id',fld:'END_ID',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV11pend_id',fld:'vPEND_ID',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cend_id',fld:'vCEND_ID',pic:'ZZZZZZZ9'},{av:'AV7cend_tipo_logradouro',fld:'vCEND_TIPO_LOGRADOURO',pic:''},{av:'AV8cend_numero',fld:'vCEND_NUMERO',pic:'ZZZ9'},{av:'AV9cend_bairro',fld:'vCEND_BAIRRO',pic:''},{av:'AV10ccid_id',fld:'vCCID_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("GRID1_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cend_id',fld:'vCEND_ID',pic:'ZZZZZZZ9'},{av:'AV7cend_tipo_logradouro',fld:'vCEND_TIPO_LOGRADOURO',pic:''},{av:'AV8cend_numero',fld:'vCEND_NUMERO',pic:'ZZZ9'},{av:'AV9cend_bairro',fld:'vCEND_BAIRRO',pic:''},{av:'AV10ccid_id',fld:'vCCID_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("GRID1_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cend_id',fld:'vCEND_ID',pic:'ZZZZZZZ9'},{av:'AV7cend_tipo_logradouro',fld:'vCEND_TIPO_LOGRADOURO',pic:''},{av:'AV8cend_numero',fld:'vCEND_NUMERO',pic:'ZZZ9'},{av:'AV9cend_bairro',fld:'vCEND_BAIRRO',pic:''},{av:'AV10ccid_id',fld:'vCCID_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("GRID1_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cend_id',fld:'vCEND_ID',pic:'ZZZZZZZ9'},{av:'AV7cend_tipo_logradouro',fld:'vCEND_TIPO_LOGRADOURO',pic:''},{av:'AV8cend_numero',fld:'vCEND_NUMERO',pic:'ZZZ9'},{av:'AV9cend_bairro',fld:'vCEND_BAIRRO',pic:''},{av:'AV10ccid_id',fld:'vCCID_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("GRID1_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Cid_id',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7cend_tipo_logradouro = "" ;
      AV9cend_bairro = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblend_idfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblend_tipo_logradourofilter_Jsonclick = "" ;
      lblLblend_numerofilter_Jsonclick = "" ;
      lblLblend_bairrofilter_Jsonclick = "" ;
      lblLblcid_idfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV5LinkSelection = "" ;
      AV13Linkselection_GXI = "" ;
      A10end_tipo_logradouro = "" ;
      lV7cend_tipo_logradouro = "" ;
      lV9cend_bairro = "" ;
      A13end_bairro = "" ;
      H00072_A13end_bairro = new String[] {""} ;
      H00072_n13end_bairro = new boolean[] {false} ;
      H00072_A1cid_id = new int[1] ;
      H00072_n1cid_id = new boolean[] {false} ;
      H00072_A12end_numero = new short[1] ;
      H00072_n12end_numero = new boolean[] {false} ;
      H00072_A10end_tipo_logradouro = new String[] {""} ;
      H00072_n10end_tipo_logradouro = new boolean[] {false} ;
      H00072_A2end_id = new int[1] ;
      H00073_AGRID1_nRecordCount = new long[1] ;
      AV12ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid1_Linesclass = "" ;
      sImgUrl = "" ;
      ROClassString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.gx0020__default(),
         new Object[] {
             new Object[] {
            H00072_A13end_bairro, H00072_n13end_bairro, H00072_A1cid_id, H00072_n1cid_id, H00072_A12end_numero, H00072_n12end_numero, H00072_A10end_tipo_logradouro, H00072_n10end_tipo_logradouro, H00072_A2end_id
            }
            , new Object[] {
            H00073_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
   }

   private byte GRID1_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short AV8cend_numero ;
   private short wbEnd ;
   private short wbStart ;
   private short A12end_numero ;
   private short gxcookieaux ;
   private int nRC_GXsfl_64 ;
   private int subGrid1_Rows ;
   private int AV11pend_id ;
   private int nGXsfl_64_idx=1 ;
   private int AV6cend_id ;
   private int AV10ccid_id ;
   private int edtavCend_id_Enabled ;
   private int edtavCend_id_Visible ;
   private int edtavCend_tipo_logradouro_Visible ;
   private int edtavCend_tipo_logradouro_Enabled ;
   private int edtavCend_numero_Enabled ;
   private int edtavCend_numero_Visible ;
   private int edtavCend_bairro_Visible ;
   private int edtavCend_bairro_Enabled ;
   private int edtavCcid_id_Enabled ;
   private int edtavCcid_id_Visible ;
   private int A2end_id ;
   private int A1cid_id ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtend_id_Enabled ;
   private int edtend_tipo_logradouro_Enabled ;
   private int edtend_numero_Enabled ;
   private int edtcid_id_Enabled ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divEnd_idfiltercontainer_Class ;
   private String divEnd_tipo_logradourofiltercontainer_Class ;
   private String divEnd_numerofiltercontainer_Class ;
   private String divEnd_bairrofiltercontainer_Class ;
   private String divCid_idfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_64_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divEnd_idfiltercontainer_Internalname ;
   private String lblLblend_idfilter_Internalname ;
   private String lblLblend_idfilter_Jsonclick ;
   private String edtavCend_id_Internalname ;
   private String TempTags ;
   private String edtavCend_id_Jsonclick ;
   private String divEnd_tipo_logradourofiltercontainer_Internalname ;
   private String lblLblend_tipo_logradourofilter_Internalname ;
   private String lblLblend_tipo_logradourofilter_Jsonclick ;
   private String edtavCend_tipo_logradouro_Internalname ;
   private String edtavCend_tipo_logradouro_Jsonclick ;
   private String divEnd_numerofiltercontainer_Internalname ;
   private String lblLblend_numerofilter_Internalname ;
   private String lblLblend_numerofilter_Jsonclick ;
   private String edtavCend_numero_Internalname ;
   private String edtavCend_numero_Jsonclick ;
   private String divEnd_bairrofiltercontainer_Internalname ;
   private String lblLblend_bairrofilter_Internalname ;
   private String lblLblend_bairrofilter_Jsonclick ;
   private String edtavCend_bairro_Internalname ;
   private String edtavCend_bairro_Jsonclick ;
   private String divCid_idfiltercontainer_Internalname ;
   private String lblLblcid_idfilter_Internalname ;
   private String lblLblcid_idfilter_Jsonclick ;
   private String edtavCcid_id_Internalname ;
   private String edtavCcid_id_Jsonclick ;
   private String divGridtable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtend_id_Internalname ;
   private String edtend_tipo_logradouro_Internalname ;
   private String edtend_numero_Internalname ;
   private String edtcid_id_Internalname ;
   private String AV12ADVANCED_LABEL_TEMPLATE ;
   private String edtavLinkselection_gximage ;
   private String sGXsfl_64_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String edtavLinkselection_Link ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtend_id_Jsonclick ;
   private String edtend_tipo_logradouro_Link ;
   private String edtend_tipo_logradouro_Jsonclick ;
   private String edtend_numero_Jsonclick ;
   private String edtcid_id_Jsonclick ;
   private String subGrid1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_64_Refreshing=false ;
   private boolean n10end_tipo_logradouro ;
   private boolean n12end_numero ;
   private boolean n1cid_id ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n13end_bairro ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV7cend_tipo_logradouro ;
   private String AV9cend_bairro ;
   private String AV13Linkselection_GXI ;
   private String A10end_tipo_logradouro ;
   private String lV7cend_tipo_logradouro ;
   private String lV9cend_bairro ;
   private String A13end_bairro ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXWebForm Form ;
   private IDataStoreProvider pr_default ;
   private String[] H00072_A13end_bairro ;
   private boolean[] H00072_n13end_bairro ;
   private int[] H00072_A1cid_id ;
   private boolean[] H00072_n1cid_id ;
   private short[] H00072_A12end_numero ;
   private boolean[] H00072_n12end_numero ;
   private String[] H00072_A10end_tipo_logradouro ;
   private boolean[] H00072_n10end_tipo_logradouro ;
   private int[] H00072_A2end_id ;
   private long[] H00073_AGRID1_nRecordCount ;
}

final  class gx0020__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00072( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV7cend_tipo_logradouro ,
                                          short AV8cend_numero ,
                                          String AV9cend_bairro ,
                                          int AV10ccid_id ,
                                          String A10end_tipo_logradouro ,
                                          short A12end_numero ,
                                          String A13end_bairro ,
                                          int A1cid_id ,
                                          int AV6cend_id )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[8];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " end_bairro, cid_id, end_numero, end_tipo_logradouro, end_id" ;
      sFromString = " FROM Endereco" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(end_id >= ?)");
      if ( ! (GXutil.strcmp("", AV7cend_tipo_logradouro)==0) )
      {
         addWhere(sWhereString, "(end_tipo_logradouro like ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cend_numero) )
      {
         addWhere(sWhereString, "(end_numero >= ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cend_bairro)==0) )
      {
         addWhere(sWhereString, "(end_bairro like ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10ccid_id) )
      {
         addWhere(sWhereString, "(cid_id >= ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      sOrderString += " ORDER BY end_id" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " OFFSET " + "?" + " LIMIT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H00073( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV7cend_tipo_logradouro ,
                                          short AV8cend_numero ,
                                          String AV9cend_bairro ,
                                          int AV10ccid_id ,
                                          String A10end_tipo_logradouro ,
                                          short A12end_numero ,
                                          String A13end_bairro ,
                                          int A1cid_id ,
                                          int AV6cend_id )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[5];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM Endereco" ;
      addWhere(sWhereString, "(end_id >= ?)");
      if ( ! (GXutil.strcmp("", AV7cend_tipo_logradouro)==0) )
      {
         addWhere(sWhereString, "(end_tipo_logradouro like ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cend_numero) )
      {
         addWhere(sWhereString, "(end_numero >= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cend_bairro)==0) )
      {
         addWhere(sWhereString, "(end_bairro like ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10ccid_id) )
      {
         addWhere(sWhereString, "(cid_id >= ?)");
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H00072(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() );
            case 1 :
                  return conditional_H00073(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00072", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00073", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 50);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 50);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               return;
      }
   }

}

