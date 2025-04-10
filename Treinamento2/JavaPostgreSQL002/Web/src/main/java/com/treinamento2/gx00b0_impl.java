package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class gx00b0_impl extends GXDataArea
{
   public gx00b0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00b0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00b0_impl.class ));
   }

   public gx00b0_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "pserv_lot_id") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "pserv_lot_id") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "pserv_lot_id") ;
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
            AV11pserv_lot_id = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11pserv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11pserv_lot_id), 8, 0));
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
      AV6cserv_lot_id = (int)(GXutil.lval( httpContext.GetPar( "cserv_lot_id"))) ;
      AV7cserv_lot_idade = (short)(GXutil.lval( httpContext.GetPar( "cserv_lot_idade"))) ;
      AV8cserv_lot_unid = httpContext.GetPar( "cserv_lot_unid") ;
      AV9cserv_lot_foto = httpContext.GetPar( "cserv_lot_foto") ;
      AV10cunid_id = (int)(GXutil.lval( httpContext.GetPar( "cunid_id"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( subGrid1_Rows, AV6cserv_lot_id, AV7cserv_lot_idade, AV8cserv_lot_unid, AV9cserv_lot_foto, AV10cunid_id) ;
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
      pa0D2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0D2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.treinamento2.gx00b0", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV11pserv_lot_id,8,0))}, new String[] {"pserv_lot_id"}) +"\">") ;
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
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCSERV_LOT_ID", GXutil.ltrim( localUtil.ntoc( AV6cserv_lot_id, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCSERV_LOT_IDADE", GXutil.ltrim( localUtil.ntoc( AV7cserv_lot_idade, (byte)(4), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCSERV_LOT_UNID", AV8cserv_lot_unid);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCSERV_LOT_FOTO", AV9cserv_lot_foto);
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUNID_ID", GXutil.ltrim( localUtil.ntoc( AV10cunid_id, (byte)(8), (byte)(0), ",", "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_64", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_64, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "vPSERV_LOT_ID", GXutil.ltrim( localUtil.ntoc( AV11pserv_lot_id, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "SERV_LOT_IDFILTERCONTAINER_Class", GXutil.rtrim( divServ_lot_idfiltercontainer_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "SERV_LOT_IDADEFILTERCONTAINER_Class", GXutil.rtrim( divServ_lot_idadefiltercontainer_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "SERV_LOT_UNIDFILTERCONTAINER_Class", GXutil.rtrim( divServ_lot_unidfiltercontainer_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "SERV_LOT_FOTOFILTERCONTAINER_Class", GXutil.rtrim( divServ_lot_fotofiltercontainer_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "UNID_IDFILTERCONTAINER_Class", GXutil.rtrim( divUnid_idfiltercontainer_Class));
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
         we0D2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0D2( ) ;
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
      return formatLink("com.treinamento2.gx00b0", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV11pserv_lot_id,8,0))}, new String[] {"pserv_lot_id"})  ;
   }

   public String getPgmname( )
   {
      return "Gx00B0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Serv Lotado" ;
   }

   public void wb0D0( )
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
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divServ_lot_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divServ_lot_idfiltercontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLblserv_lot_idfilter_Internalname, "serv_lot_id", "", "", lblLblserv_lot_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e110d1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx00B0.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.treinamento2.GxWebStd.gx_label_element( httpContext, edtavCserv_lot_id_Internalname, "serv_lot_id", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavCserv_lot_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cserv_lot_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtavCserv_lot_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6cserv_lot_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6cserv_lot_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCserv_lot_id_Jsonclick, 0, "Attribute", "", "", "", "", edtavCserv_lot_id_Visible, edtavCserv_lot_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Gx00B0.htm");
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
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divServ_lot_idadefiltercontainer_Internalname, 1, 0, "px", 0, "px", divServ_lot_idadefiltercontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLblserv_lot_idadefilter_Internalname, "serv_lot_idade", "", "", lblLblserv_lot_idadefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120d1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx00B0.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.treinamento2.GxWebStd.gx_label_element( httpContext, edtavCserv_lot_idade_Internalname, "serv_lot_idade", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavCserv_lot_idade_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cserv_lot_idade, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( ((edtavCserv_lot_idade_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7cserv_lot_idade), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7cserv_lot_idade), "ZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCserv_lot_idade_Jsonclick, 0, "Attribute", "", "", "", "", edtavCserv_lot_idade_Visible, edtavCserv_lot_idade_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Gx00B0.htm");
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
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divServ_lot_unidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divServ_lot_unidfiltercontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLblserv_lot_unidfilter_Internalname, "serv_lot_unid", "", "", lblLblserv_lot_unidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130d1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx00B0.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.treinamento2.GxWebStd.gx_label_element( httpContext, edtavCserv_lot_unid_Internalname, "serv_lot_unid", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavCserv_lot_unid_Internalname, AV8cserv_lot_unid, GXutil.rtrim( localUtil.format( AV8cserv_lot_unid, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCserv_lot_unid_Jsonclick, 0, "Attribute", "", "", "", "", edtavCserv_lot_unid_Visible, edtavCserv_lot_unid_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_Gx00B0.htm");
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
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divServ_lot_fotofiltercontainer_Internalname, 1, 0, "px", 0, "px", divServ_lot_fotofiltercontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLblserv_lot_fotofilter_Internalname, "serv_lot_foto", "", "", lblLblserv_lot_fotofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140d1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx00B0.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.treinamento2.GxWebStd.gx_label_element( httpContext, edtavCserv_lot_foto_Internalname, "serv_lot_foto", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavCserv_lot_foto_Internalname, AV9cserv_lot_foto, GXutil.rtrim( localUtil.format( AV9cserv_lot_foto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCserv_lot_foto_Jsonclick, 0, "Attribute", "", "", "", "", edtavCserv_lot_foto_Visible, edtavCserv_lot_foto_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_Gx00B0.htm");
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
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divUnid_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUnid_idfiltercontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLblunid_idfilter_Internalname, "unid_id", "", "", lblLblunid_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150d1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx00B0.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.treinamento2.GxWebStd.gx_label_element( httpContext, edtavCunid_id_Internalname, "unid_id", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavCunid_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cunid_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtavCunid_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10cunid_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10cunid_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCunid_id_Jsonclick, 0, "Attribute", "", "", "", "", edtavCunid_id_Visible, edtavCunid_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Gx00B0.htm");
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
         com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 64, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e160d1_client"+"'", TempTags, "", 2, "HLP_Gx00B0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 64, 2, 0)+","+"null"+");", "Fechar", bttBtn_cancel_Jsonclick, 1, "Fechar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00B0.htm");
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

   public void start0D2( )
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
      Form.getMeta().addItem("description", "Selection List Serv Lotado", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0D0( ) ;
   }

   public void ws0D2( )
   {
      start0D2( ) ;
      evt0D2( ) ;
   }

   public void evt0D2( )
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
                           A37serv_lot_id = (int)(localUtil.ctol( httpContext.cgiGet( edtserv_lot_id_Internalname), ",", ".")) ;
                           A39serv_lot_idade = (short)(localUtil.ctol( httpContext.cgiGet( edtserv_lot_idade_Internalname), ",", ".")) ;
                           n39serv_lot_idade = false ;
                           A40serv_lot_unid = httpContext.cgiGet( edtserv_lot_unid_Internalname) ;
                           n40serv_lot_unid = false ;
                           A41serv_lot_foto = httpContext.cgiGet( edtserv_lot_foto_Internalname) ;
                           n41serv_lot_foto = false ;
                           A6unid_id = (int)(localUtil.ctol( httpContext.cgiGet( edtunid_id_Internalname), ",", ".")) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e170D2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e180D2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cserv_lot_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCSERV_LOT_ID"), ",", ".") != AV6cserv_lot_id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cserv_lot_idade Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCSERV_LOT_IDADE"), ",", ".") != AV7cserv_lot_idade )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cserv_lot_unid Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCSERV_LOT_UNID"), AV8cserv_lot_unid) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cserv_lot_foto Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCSERV_LOT_FOTO"), AV9cserv_lot_foto) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cunid_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUNID_ID"), ",", ".") != AV10cunid_id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e190D2 ();
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

   public void we0D2( )
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

   public void pa0D2( )
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
                                  int AV6cserv_lot_id ,
                                  short AV7cserv_lot_idade ,
                                  String AV8cserv_lot_unid ,
                                  String AV9cserv_lot_foto ,
                                  int AV10cunid_id )
   {
      initialize_formulas( ) ;
      com.treinamento2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf0D2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "gxhash_SERV_LOT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A37serv_lot_id), "ZZZZZZZ9")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "SERV_LOT_ID", GXutil.ltrim( localUtil.ntoc( A37serv_lot_id, (byte)(8), (byte)(0), ".", "")));
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
      rf0D2( ) ;
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

   public void rf0D2( )
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
                                              Short.valueOf(AV7cserv_lot_idade) ,
                                              AV8cserv_lot_unid ,
                                              AV9cserv_lot_foto ,
                                              Integer.valueOf(AV10cunid_id) ,
                                              Short.valueOf(A39serv_lot_idade) ,
                                              A40serv_lot_unid ,
                                              A41serv_lot_foto ,
                                              Integer.valueOf(A6unid_id) ,
                                              Integer.valueOf(AV6cserv_lot_id) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.INT
                                              }
         });
         lV8cserv_lot_unid = GXutil.concat( GXutil.rtrim( AV8cserv_lot_unid), "%", "") ;
         lV9cserv_lot_foto = GXutil.concat( GXutil.rtrim( AV9cserv_lot_foto), "%", "") ;
         /* Using cursor H000D2 */
         pr_default.execute(0, new Object[] {Integer.valueOf(AV6cserv_lot_id), Short.valueOf(AV7cserv_lot_idade), lV8cserv_lot_unid, lV9cserv_lot_foto, Integer.valueOf(AV10cunid_id), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_64_idx = 1 ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_642( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( GRID1_nCurrentRecord < subgrid1_fnc_recordsperpage( ) ) ) )
         {
            A6unid_id = H000D2_A6unid_id[0] ;
            A41serv_lot_foto = H000D2_A41serv_lot_foto[0] ;
            n41serv_lot_foto = H000D2_n41serv_lot_foto[0] ;
            A40serv_lot_unid = H000D2_A40serv_lot_unid[0] ;
            n40serv_lot_unid = H000D2_n40serv_lot_unid[0] ;
            A39serv_lot_idade = H000D2_A39serv_lot_idade[0] ;
            n39serv_lot_idade = H000D2_n39serv_lot_idade[0] ;
            A37serv_lot_id = H000D2_A37serv_lot_id[0] ;
            /* Execute user event: Load */
            e180D2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(64) ;
         wb0D0( ) ;
      }
      bGXsfl_64_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes0D2( )
   {
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "gxhash_SERV_LOT_ID"+"_"+sGXsfl_64_idx, getSecureSignedToken( sGXsfl_64_idx, localUtil.format( DecimalUtil.doubleToDec(A37serv_lot_id), "ZZZZZZZ9")));
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
                                           Short.valueOf(AV7cserv_lot_idade) ,
                                           AV8cserv_lot_unid ,
                                           AV9cserv_lot_foto ,
                                           Integer.valueOf(AV10cunid_id) ,
                                           Short.valueOf(A39serv_lot_idade) ,
                                           A40serv_lot_unid ,
                                           A41serv_lot_foto ,
                                           Integer.valueOf(A6unid_id) ,
                                           Integer.valueOf(AV6cserv_lot_id) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV8cserv_lot_unid = GXutil.concat( GXutil.rtrim( AV8cserv_lot_unid), "%", "") ;
      lV9cserv_lot_foto = GXutil.concat( GXutil.rtrim( AV9cserv_lot_foto), "%", "") ;
      /* Using cursor H000D3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV6cserv_lot_id), Short.valueOf(AV7cserv_lot_idade), lV8cserv_lot_unid, lV9cserv_lot_foto, Integer.valueOf(AV10cunid_id)});
      GRID1_nRecordCount = H000D3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cserv_lot_id, AV7cserv_lot_idade, AV8cserv_lot_unid, AV9cserv_lot_foto, AV10cunid_id) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cserv_lot_id, AV7cserv_lot_idade, AV8cserv_lot_unid, AV9cserv_lot_foto, AV10cunid_id) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cserv_lot_id, AV7cserv_lot_idade, AV8cserv_lot_unid, AV9cserv_lot_foto, AV10cunid_id) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cserv_lot_id, AV7cserv_lot_idade, AV8cserv_lot_unid, AV9cserv_lot_foto, AV10cunid_id) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cserv_lot_id, AV7cserv_lot_idade, AV8cserv_lot_unid, AV9cserv_lot_foto, AV10cunid_id) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      edtserv_lot_id_Enabled = 0 ;
      edtserv_lot_idade_Enabled = 0 ;
      edtserv_lot_unid_Enabled = 0 ;
      edtserv_lot_foto_Enabled = 0 ;
      edtunid_id_Enabled = 0 ;
      fix_multi_value_controls( ) ;
   }

   public void strup0D0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e170D2 ();
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCserv_lot_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCserv_lot_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCSERV_LOT_ID");
            GX_FocusControl = edtavCserv_lot_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cserv_lot_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cserv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cserv_lot_id), 8, 0));
         }
         else
         {
            AV6cserv_lot_id = (int)(localUtil.ctol( httpContext.cgiGet( edtavCserv_lot_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cserv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6cserv_lot_id), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCserv_lot_idade_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCserv_lot_idade_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCSERV_LOT_IDADE");
            GX_FocusControl = edtavCserv_lot_idade_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cserv_lot_idade = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cserv_lot_idade", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7cserv_lot_idade), 4, 0));
         }
         else
         {
            AV7cserv_lot_idade = (short)(localUtil.ctol( httpContext.cgiGet( edtavCserv_lot_idade_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cserv_lot_idade", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7cserv_lot_idade), 4, 0));
         }
         AV8cserv_lot_unid = httpContext.cgiGet( edtavCserv_lot_unid_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cserv_lot_unid", AV8cserv_lot_unid);
         AV9cserv_lot_foto = httpContext.cgiGet( edtavCserv_lot_foto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cserv_lot_foto", AV9cserv_lot_foto);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCunid_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCunid_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUNID_ID");
            GX_FocusControl = edtavCunid_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cunid_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cunid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10cunid_id), 8, 0));
         }
         else
         {
            AV10cunid_id = (int)(localUtil.ctol( httpContext.cgiGet( edtavCunid_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cunid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10cunid_id), 8, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCSERV_LOT_ID"), ",", ".") != AV6cserv_lot_id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCSERV_LOT_IDADE"), ",", ".") != AV7cserv_lot_idade )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCSERV_LOT_UNID"), AV8cserv_lot_unid) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCSERV_LOT_FOTO"), AV9cserv_lot_foto) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUNID_ID"), ",", ".") != AV10cunid_id )
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
      e170D2 ();
      if (returnInSub) return;
   }

   public void e170D2( )
   {
      /* Start Routine */
      returnInSub = false ;
      Form.setCaption( GXutil.format( "Lista de Seleção %1", "Serv Lotado", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV12ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e180D2( )
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
      e190D2 ();
      if (returnInSub) return;
   }

   public void e190D2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV11pserv_lot_id = A37serv_lot_id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pserv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11pserv_lot_id), 8, 0));
      httpContext.setWebReturnParms(new Object[] {Integer.valueOf(AV11pserv_lot_id)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV11pserv_lot_id"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV11pserv_lot_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pserv_lot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11pserv_lot_id), 8, 0));
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
      pa0D2( ) ;
      ws0D2( ) ;
      we0D2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20254817585455", true, true);
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
      httpContext.AddJavascriptSource("gx00b0.js", "?20254817585456", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_642( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_64_idx ;
      edtserv_lot_id_Internalname = "SERV_LOT_ID_"+sGXsfl_64_idx ;
      edtserv_lot_idade_Internalname = "SERV_LOT_IDADE_"+sGXsfl_64_idx ;
      edtserv_lot_unid_Internalname = "SERV_LOT_UNID_"+sGXsfl_64_idx ;
      edtserv_lot_foto_Internalname = "SERV_LOT_FOTO_"+sGXsfl_64_idx ;
      edtunid_id_Internalname = "UNID_ID_"+sGXsfl_64_idx ;
   }

   public void subsflControlProps_fel_642( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_64_fel_idx ;
      edtserv_lot_id_Internalname = "SERV_LOT_ID_"+sGXsfl_64_fel_idx ;
      edtserv_lot_idade_Internalname = "SERV_LOT_IDADE_"+sGXsfl_64_fel_idx ;
      edtserv_lot_unid_Internalname = "SERV_LOT_UNID_"+sGXsfl_64_fel_idx ;
      edtserv_lot_foto_Internalname = "SERV_LOT_FOTO_"+sGXsfl_64_fel_idx ;
      edtunid_id_Internalname = "UNID_ID_"+sGXsfl_64_fel_idx ;
   }

   public void sendrow_642( )
   {
      sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_642( ) ;
      wb0D0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A37serv_lot_id, (byte)(8), (byte)(0), ",", "")))+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtserv_lot_id_Internalname,GXutil.ltrim( localUtil.ntoc( A37serv_lot_id, (byte)(8), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A37serv_lot_id), "ZZZZZZZ9"))," dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtserv_lot_id_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"Id","end",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"end"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtserv_lot_idade_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A37serv_lot_id, (byte)(8), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtserv_lot_idade_Internalname, "Link", edtserv_lot_idade_Link, !bGXsfl_64_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtserv_lot_idade_Internalname,GXutil.ltrim( localUtil.ntoc( A39serv_lot_idade, (byte)(4), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A39serv_lot_idade), "ZZZ9"))," dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'",edtserv_lot_idade_Link,"","","",edtserv_lot_idade_Jsonclick,Integer.valueOf(0),"DescriptionAttribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","end",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"start"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtserv_lot_unid_Internalname,A40serv_lot_unid,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtserv_lot_unid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","start",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"start"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtserv_lot_foto_Internalname,A41serv_lot_foto,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtserv_lot_foto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","start",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"end"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtunid_id_Internalname,GXutil.ltrim( localUtil.ntoc( A6unid_id, (byte)(8), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6unid_id), "ZZZZZZZ9"))," dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtunid_id_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"Id","end",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes0D2( ) ;
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
         httpContext.writeValue( "serv_lot_id") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"end"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "serv_lot_idade") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"start"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "serv_lot_unid") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"start"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "serv_lot_foto") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"end"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "unid_id") ;
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
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( GXutil.ltrim( localUtil.ntoc( A37serv_lot_id, (byte)(8), (byte)(0), ".", ""))));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( GXutil.ltrim( localUtil.ntoc( A39serv_lot_idade, (byte)(4), (byte)(0), ".", ""))));
         Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtserv_lot_idade_Link));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( A40serv_lot_unid));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( A41serv_lot_foto));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( GXutil.ltrim( localUtil.ntoc( A6unid_id, (byte)(8), (byte)(0), ".", ""))));
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
      lblLblserv_lot_idfilter_Internalname = "LBLSERV_LOT_IDFILTER" ;
      edtavCserv_lot_id_Internalname = "vCSERV_LOT_ID" ;
      divServ_lot_idfiltercontainer_Internalname = "SERV_LOT_IDFILTERCONTAINER" ;
      lblLblserv_lot_idadefilter_Internalname = "LBLSERV_LOT_IDADEFILTER" ;
      edtavCserv_lot_idade_Internalname = "vCSERV_LOT_IDADE" ;
      divServ_lot_idadefiltercontainer_Internalname = "SERV_LOT_IDADEFILTERCONTAINER" ;
      lblLblserv_lot_unidfilter_Internalname = "LBLSERV_LOT_UNIDFILTER" ;
      edtavCserv_lot_unid_Internalname = "vCSERV_LOT_UNID" ;
      divServ_lot_unidfiltercontainer_Internalname = "SERV_LOT_UNIDFILTERCONTAINER" ;
      lblLblserv_lot_fotofilter_Internalname = "LBLSERV_LOT_FOTOFILTER" ;
      edtavCserv_lot_foto_Internalname = "vCSERV_LOT_FOTO" ;
      divServ_lot_fotofiltercontainer_Internalname = "SERV_LOT_FOTOFILTERCONTAINER" ;
      lblLblunid_idfilter_Internalname = "LBLUNID_IDFILTER" ;
      edtavCunid_id_Internalname = "vCUNID_ID" ;
      divUnid_idfiltercontainer_Internalname = "UNID_IDFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtserv_lot_id_Internalname = "SERV_LOT_ID" ;
      edtserv_lot_idade_Internalname = "SERV_LOT_IDADE" ;
      edtserv_lot_unid_Internalname = "SERV_LOT_UNID" ;
      edtserv_lot_foto_Internalname = "SERV_LOT_FOTO" ;
      edtunid_id_Internalname = "UNID_ID" ;
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
      edtunid_id_Jsonclick = "" ;
      edtserv_lot_foto_Jsonclick = "" ;
      edtserv_lot_unid_Jsonclick = "" ;
      edtserv_lot_idade_Jsonclick = "" ;
      edtserv_lot_idade_Link = "" ;
      edtserv_lot_id_Jsonclick = "" ;
      edtavLinkselection_gximage = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtunid_id_Enabled = 0 ;
      edtserv_lot_foto_Enabled = 0 ;
      edtserv_lot_unid_Enabled = 0 ;
      edtserv_lot_idade_Enabled = 0 ;
      edtserv_lot_id_Enabled = 0 ;
      edtavCunid_id_Jsonclick = "" ;
      edtavCunid_id_Enabled = 1 ;
      edtavCunid_id_Visible = 1 ;
      edtavCserv_lot_foto_Jsonclick = "" ;
      edtavCserv_lot_foto_Enabled = 1 ;
      edtavCserv_lot_foto_Visible = 1 ;
      edtavCserv_lot_unid_Jsonclick = "" ;
      edtavCserv_lot_unid_Enabled = 1 ;
      edtavCserv_lot_unid_Visible = 1 ;
      edtavCserv_lot_idade_Jsonclick = "" ;
      edtavCserv_lot_idade_Enabled = 1 ;
      edtavCserv_lot_idade_Visible = 1 ;
      edtavCserv_lot_id_Jsonclick = "" ;
      edtavCserv_lot_id_Enabled = 1 ;
      edtavCserv_lot_id_Visible = 1 ;
      divUnid_idfiltercontainer_Class = "AdvancedContainerItem AdvancedContainerItemExpanded" ;
      divServ_lot_fotofiltercontainer_Class = "AdvancedContainerItem AdvancedContainerItemExpanded" ;
      divServ_lot_unidfiltercontainer_Class = "AdvancedContainerItem AdvancedContainerItemExpanded" ;
      divServ_lot_idadefiltercontainer_Class = "AdvancedContainerItem AdvancedContainerItemExpanded" ;
      divServ_lot_idfiltercontainer_Class = "AdvancedContainerItem AdvancedContainerItemExpanded" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Serv Lotado" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cserv_lot_id',fld:'vCSERV_LOT_ID',pic:'ZZZZZZZ9'},{av:'AV7cserv_lot_idade',fld:'vCSERV_LOT_IDADE',pic:'ZZZ9'},{av:'AV8cserv_lot_unid',fld:'vCSERV_LOT_UNID',pic:''},{av:'AV9cserv_lot_foto',fld:'vCSERV_LOT_FOTO',pic:''},{av:'AV10cunid_id',fld:'vCUNID_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e160D1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]");
      setEventMetadata("'TOGGLE'",",oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLSERV_LOT_IDFILTER.CLICK","{handler:'e110D1',iparms:[{av:'divServ_lot_idfiltercontainer_Class',ctrl:'SERV_LOT_IDFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLSERV_LOT_IDFILTER.CLICK",",oparms:[{av:'divServ_lot_idfiltercontainer_Class',ctrl:'SERV_LOT_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCserv_lot_id_Visible',ctrl:'vCSERV_LOT_ID',prop:'Visible'}]}");
      setEventMetadata("LBLSERV_LOT_IDADEFILTER.CLICK","{handler:'e120D1',iparms:[{av:'divServ_lot_idadefiltercontainer_Class',ctrl:'SERV_LOT_IDADEFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLSERV_LOT_IDADEFILTER.CLICK",",oparms:[{av:'divServ_lot_idadefiltercontainer_Class',ctrl:'SERV_LOT_IDADEFILTERCONTAINER',prop:'Class'},{av:'edtavCserv_lot_idade_Visible',ctrl:'vCSERV_LOT_IDADE',prop:'Visible'}]}");
      setEventMetadata("LBLSERV_LOT_UNIDFILTER.CLICK","{handler:'e130D1',iparms:[{av:'divServ_lot_unidfiltercontainer_Class',ctrl:'SERV_LOT_UNIDFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLSERV_LOT_UNIDFILTER.CLICK",",oparms:[{av:'divServ_lot_unidfiltercontainer_Class',ctrl:'SERV_LOT_UNIDFILTERCONTAINER',prop:'Class'},{av:'edtavCserv_lot_unid_Visible',ctrl:'vCSERV_LOT_UNID',prop:'Visible'}]}");
      setEventMetadata("LBLSERV_LOT_FOTOFILTER.CLICK","{handler:'e140D1',iparms:[{av:'divServ_lot_fotofiltercontainer_Class',ctrl:'SERV_LOT_FOTOFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLSERV_LOT_FOTOFILTER.CLICK",",oparms:[{av:'divServ_lot_fotofiltercontainer_Class',ctrl:'SERV_LOT_FOTOFILTERCONTAINER',prop:'Class'},{av:'edtavCserv_lot_foto_Visible',ctrl:'vCSERV_LOT_FOTO',prop:'Visible'}]}");
      setEventMetadata("LBLUNID_IDFILTER.CLICK","{handler:'e150D1',iparms:[{av:'divUnid_idfiltercontainer_Class',ctrl:'UNID_IDFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLUNID_IDFILTER.CLICK",",oparms:[{av:'divUnid_idfiltercontainer_Class',ctrl:'UNID_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCunid_id_Visible',ctrl:'vCUNID_ID',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e190D2',iparms:[{av:'A37serv_lot_id',fld:'SERV_LOT_ID',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV11pserv_lot_id',fld:'vPSERV_LOT_ID',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cserv_lot_id',fld:'vCSERV_LOT_ID',pic:'ZZZZZZZ9'},{av:'AV7cserv_lot_idade',fld:'vCSERV_LOT_IDADE',pic:'ZZZ9'},{av:'AV8cserv_lot_unid',fld:'vCSERV_LOT_UNID',pic:''},{av:'AV9cserv_lot_foto',fld:'vCSERV_LOT_FOTO',pic:''},{av:'AV10cunid_id',fld:'vCUNID_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("GRID1_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cserv_lot_id',fld:'vCSERV_LOT_ID',pic:'ZZZZZZZ9'},{av:'AV7cserv_lot_idade',fld:'vCSERV_LOT_IDADE',pic:'ZZZ9'},{av:'AV8cserv_lot_unid',fld:'vCSERV_LOT_UNID',pic:''},{av:'AV9cserv_lot_foto',fld:'vCSERV_LOT_FOTO',pic:''},{av:'AV10cunid_id',fld:'vCUNID_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("GRID1_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cserv_lot_id',fld:'vCSERV_LOT_ID',pic:'ZZZZZZZ9'},{av:'AV7cserv_lot_idade',fld:'vCSERV_LOT_IDADE',pic:'ZZZ9'},{av:'AV8cserv_lot_unid',fld:'vCSERV_LOT_UNID',pic:''},{av:'AV9cserv_lot_foto',fld:'vCSERV_LOT_FOTO',pic:''},{av:'AV10cunid_id',fld:'vCUNID_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("GRID1_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6cserv_lot_id',fld:'vCSERV_LOT_ID',pic:'ZZZZZZZ9'},{av:'AV7cserv_lot_idade',fld:'vCSERV_LOT_IDADE',pic:'ZZZ9'},{av:'AV8cserv_lot_unid',fld:'vCSERV_LOT_UNID',pic:''},{av:'AV9cserv_lot_foto',fld:'vCSERV_LOT_FOTO',pic:''},{av:'AV10cunid_id',fld:'vCUNID_ID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("GRID1_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Unid_id',iparms:[]");
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
      AV8cserv_lot_unid = "" ;
      AV9cserv_lot_foto = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblserv_lot_idfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblserv_lot_idadefilter_Jsonclick = "" ;
      lblLblserv_lot_unidfilter_Jsonclick = "" ;
      lblLblserv_lot_fotofilter_Jsonclick = "" ;
      lblLblunid_idfilter_Jsonclick = "" ;
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
      A40serv_lot_unid = "" ;
      A41serv_lot_foto = "" ;
      lV8cserv_lot_unid = "" ;
      lV9cserv_lot_foto = "" ;
      H000D2_A6unid_id = new int[1] ;
      H000D2_A41serv_lot_foto = new String[] {""} ;
      H000D2_n41serv_lot_foto = new boolean[] {false} ;
      H000D2_A40serv_lot_unid = new String[] {""} ;
      H000D2_n40serv_lot_unid = new boolean[] {false} ;
      H000D2_A39serv_lot_idade = new short[1] ;
      H000D2_n39serv_lot_idade = new boolean[] {false} ;
      H000D2_A37serv_lot_id = new int[1] ;
      H000D3_AGRID1_nRecordCount = new long[1] ;
      AV12ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid1_Linesclass = "" ;
      sImgUrl = "" ;
      ROClassString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.gx00b0__default(),
         new Object[] {
             new Object[] {
            H000D2_A6unid_id, H000D2_A41serv_lot_foto, H000D2_n41serv_lot_foto, H000D2_A40serv_lot_unid, H000D2_n40serv_lot_unid, H000D2_A39serv_lot_idade, H000D2_n39serv_lot_idade, H000D2_A37serv_lot_id
            }
            , new Object[] {
            H000D3_AGRID1_nRecordCount
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
   private short AV7cserv_lot_idade ;
   private short wbEnd ;
   private short wbStart ;
   private short A39serv_lot_idade ;
   private short gxcookieaux ;
   private int nRC_GXsfl_64 ;
   private int subGrid1_Rows ;
   private int AV11pserv_lot_id ;
   private int nGXsfl_64_idx=1 ;
   private int AV6cserv_lot_id ;
   private int AV10cunid_id ;
   private int edtavCserv_lot_id_Enabled ;
   private int edtavCserv_lot_id_Visible ;
   private int edtavCserv_lot_idade_Enabled ;
   private int edtavCserv_lot_idade_Visible ;
   private int edtavCserv_lot_unid_Visible ;
   private int edtavCserv_lot_unid_Enabled ;
   private int edtavCserv_lot_foto_Visible ;
   private int edtavCserv_lot_foto_Enabled ;
   private int edtavCunid_id_Enabled ;
   private int edtavCunid_id_Visible ;
   private int A37serv_lot_id ;
   private int A6unid_id ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtserv_lot_id_Enabled ;
   private int edtserv_lot_idade_Enabled ;
   private int edtserv_lot_unid_Enabled ;
   private int edtserv_lot_foto_Enabled ;
   private int edtunid_id_Enabled ;
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
   private String divServ_lot_idfiltercontainer_Class ;
   private String divServ_lot_idadefiltercontainer_Class ;
   private String divServ_lot_unidfiltercontainer_Class ;
   private String divServ_lot_fotofiltercontainer_Class ;
   private String divUnid_idfiltercontainer_Class ;
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
   private String divServ_lot_idfiltercontainer_Internalname ;
   private String lblLblserv_lot_idfilter_Internalname ;
   private String lblLblserv_lot_idfilter_Jsonclick ;
   private String edtavCserv_lot_id_Internalname ;
   private String TempTags ;
   private String edtavCserv_lot_id_Jsonclick ;
   private String divServ_lot_idadefiltercontainer_Internalname ;
   private String lblLblserv_lot_idadefilter_Internalname ;
   private String lblLblserv_lot_idadefilter_Jsonclick ;
   private String edtavCserv_lot_idade_Internalname ;
   private String edtavCserv_lot_idade_Jsonclick ;
   private String divServ_lot_unidfiltercontainer_Internalname ;
   private String lblLblserv_lot_unidfilter_Internalname ;
   private String lblLblserv_lot_unidfilter_Jsonclick ;
   private String edtavCserv_lot_unid_Internalname ;
   private String edtavCserv_lot_unid_Jsonclick ;
   private String divServ_lot_fotofiltercontainer_Internalname ;
   private String lblLblserv_lot_fotofilter_Internalname ;
   private String lblLblserv_lot_fotofilter_Jsonclick ;
   private String edtavCserv_lot_foto_Internalname ;
   private String edtavCserv_lot_foto_Jsonclick ;
   private String divUnid_idfiltercontainer_Internalname ;
   private String lblLblunid_idfilter_Internalname ;
   private String lblLblunid_idfilter_Jsonclick ;
   private String edtavCunid_id_Internalname ;
   private String edtavCunid_id_Jsonclick ;
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
   private String edtserv_lot_id_Internalname ;
   private String edtserv_lot_idade_Internalname ;
   private String edtserv_lot_unid_Internalname ;
   private String edtserv_lot_foto_Internalname ;
   private String edtunid_id_Internalname ;
   private String AV12ADVANCED_LABEL_TEMPLATE ;
   private String edtavLinkselection_gximage ;
   private String sGXsfl_64_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String edtavLinkselection_Link ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtserv_lot_id_Jsonclick ;
   private String edtserv_lot_idade_Link ;
   private String edtserv_lot_idade_Jsonclick ;
   private String edtserv_lot_unid_Jsonclick ;
   private String edtserv_lot_foto_Jsonclick ;
   private String edtunid_id_Jsonclick ;
   private String subGrid1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_64_Refreshing=false ;
   private boolean n39serv_lot_idade ;
   private boolean n40serv_lot_unid ;
   private boolean n41serv_lot_foto ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV8cserv_lot_unid ;
   private String AV9cserv_lot_foto ;
   private String AV13Linkselection_GXI ;
   private String A40serv_lot_unid ;
   private String A41serv_lot_foto ;
   private String lV8cserv_lot_unid ;
   private String lV9cserv_lot_foto ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXWebForm Form ;
   private IDataStoreProvider pr_default ;
   private int[] H000D2_A6unid_id ;
   private String[] H000D2_A41serv_lot_foto ;
   private boolean[] H000D2_n41serv_lot_foto ;
   private String[] H000D2_A40serv_lot_unid ;
   private boolean[] H000D2_n40serv_lot_unid ;
   private short[] H000D2_A39serv_lot_idade ;
   private boolean[] H000D2_n39serv_lot_idade ;
   private int[] H000D2_A37serv_lot_id ;
   private long[] H000D3_AGRID1_nRecordCount ;
}

final  class gx00b0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000D2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV7cserv_lot_idade ,
                                          String AV8cserv_lot_unid ,
                                          String AV9cserv_lot_foto ,
                                          int AV10cunid_id ,
                                          short A39serv_lot_idade ,
                                          String A40serv_lot_unid ,
                                          String A41serv_lot_foto ,
                                          int A6unid_id ,
                                          int AV6cserv_lot_id )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[8];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " unid_id, serv_lot_foto, serv_lot_unid, serv_lot_idade, serv_lot_id" ;
      sFromString = " FROM ServLotado" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(serv_lot_id >= ?)");
      if ( ! (0==AV7cserv_lot_idade) )
      {
         addWhere(sWhereString, "(serv_lot_idade >= ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cserv_lot_unid)==0) )
      {
         addWhere(sWhereString, "(serv_lot_unid like ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cserv_lot_foto)==0) )
      {
         addWhere(sWhereString, "(serv_lot_foto like ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cunid_id) )
      {
         addWhere(sWhereString, "(unid_id >= ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      sOrderString += " ORDER BY serv_lot_id" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " OFFSET " + "?" + " LIMIT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H000D3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV7cserv_lot_idade ,
                                          String AV8cserv_lot_unid ,
                                          String AV9cserv_lot_foto ,
                                          int AV10cunid_id ,
                                          short A39serv_lot_idade ,
                                          String A40serv_lot_unid ,
                                          String A41serv_lot_foto ,
                                          int A6unid_id ,
                                          int AV6cserv_lot_id )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[5];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ServLotado" ;
      addWhere(sWhereString, "(serv_lot_id >= ?)");
      if ( ! (0==AV7cserv_lot_idade) )
      {
         addWhere(sWhereString, "(serv_lot_idade >= ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cserv_lot_unid)==0) )
      {
         addWhere(sWhereString, "(serv_lot_unid like ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cserv_lot_foto)==0) )
      {
         addWhere(sWhereString, "(serv_lot_foto like ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cunid_id) )
      {
         addWhere(sWhereString, "(unid_id >= ?)");
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
                  return conditional_H000D2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() );
            case 1 :
                  return conditional_H000D3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000D2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H000D3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[7])[0] = rslt.getInt(5);
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
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 40);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 40);
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
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 40);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 40);
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

