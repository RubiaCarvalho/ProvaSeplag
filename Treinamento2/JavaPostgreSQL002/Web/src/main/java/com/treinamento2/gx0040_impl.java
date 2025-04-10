package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class gx0040_impl extends GXDataArea
{
   public gx0040_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx0040_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx0040_impl.class ));
   }

   public gx0040_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "plot_id") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "plot_id") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "plot_id") ;
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
            AV12plot_id = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12plot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12plot_id), 8, 0));
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
      nRC_GXsfl_74 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_74"))) ;
      nGXsfl_74_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_74_idx"))) ;
      sGXsfl_74_idx = httpContext.GetPar( "sGXsfl_74_idx") ;
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
      AV6clot_id = (int)(GXutil.lval( httpContext.GetPar( "clot_id"))) ;
      AV7cpes_id = (int)(GXutil.lval( httpContext.GetPar( "cpes_id"))) ;
      AV8cunid_id = (int)(GXutil.lval( httpContext.GetPar( "cunid_id"))) ;
      AV9clot_data_lotacao = localUtil.parseDateParm( httpContext.GetPar( "clot_data_lotacao")) ;
      AV10clot_data_remocao = localUtil.parseDateParm( httpContext.GetPar( "clot_data_remocao")) ;
      AV11clot_portaria = httpContext.GetPar( "clot_portaria") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( subGrid1_Rows, AV6clot_id, AV7cpes_id, AV8cunid_id, AV9clot_data_lotacao, AV10clot_data_remocao, AV11clot_portaria) ;
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
      pa032( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start032( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.treinamento2.gx0040", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV12plot_id,8,0))}, new String[] {"plot_id"}) +"\">") ;
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
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLOT_ID", GXutil.ltrim( localUtil.ntoc( AV6clot_id, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCPES_ID", GXutil.ltrim( localUtil.ntoc( AV7cpes_id, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUNID_ID", GXutil.ltrim( localUtil.ntoc( AV8cunid_id, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLOT_DATA_LOTACAO", localUtil.format(AV9clot_data_lotacao, "99/99/99"));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLOT_DATA_REMOCAO", localUtil.format(AV10clot_data_remocao, "99/99/99"));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLOT_PORTARIA", AV11clot_portaria);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_74", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_74, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "vPLOT_ID", GXutil.ltrim( localUtil.ntoc( AV12plot_id, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "LOT_IDFILTERCONTAINER_Class", GXutil.rtrim( divLot_idfiltercontainer_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "PES_IDFILTERCONTAINER_Class", GXutil.rtrim( divPes_idfiltercontainer_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "UNID_IDFILTERCONTAINER_Class", GXutil.rtrim( divUnid_idfiltercontainer_Class));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "LOT_PORTARIAFILTERCONTAINER_Class", GXutil.rtrim( divLot_portariafiltercontainer_Class));
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
         we032( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt032( ) ;
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
      return formatLink("com.treinamento2.gx0040", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV12plot_id,8,0))}, new String[] {"plot_id"})  ;
   }

   public String getPgmname( )
   {
      return "Gx0040" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List lotacao" ;
   }

   public void wb030( )
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
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divLot_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divLot_idfiltercontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLbllot_idfilter_Internalname, "lot_id", "", "", lblLbllot_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11031_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0040.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.treinamento2.GxWebStd.gx_label_element( httpContext, edtavClot_id_Internalname, "lot_id", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavClot_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV6clot_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtavClot_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6clot_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6clot_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClot_id_Jsonclick, 0, "Attribute", "", "", "", "", edtavClot_id_Visible, edtavClot_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Gx0040.htm");
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
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divPes_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divPes_idfiltercontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLblpes_idfilter_Internalname, "pes_id", "", "", lblLblpes_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12031_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0040.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.treinamento2.GxWebStd.gx_label_element( httpContext, edtavCpes_id_Internalname, "pes_id", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavCpes_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cpes_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtavCpes_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7cpes_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7cpes_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCpes_id_Jsonclick, 0, "Attribute", "", "", "", "", edtavCpes_id_Visible, edtavCpes_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Gx0040.htm");
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
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLblunid_idfilter_Internalname, "unid_id", "", "", lblLblunid_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13031_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0040.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavCunid_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cunid_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtavCunid_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8cunid_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8cunid_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCunid_id_Jsonclick, 0, "Attribute", "", "", "", "", edtavCunid_id_Visible, edtavCunid_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Gx0040.htm");
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
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divLot_data_lotacaofiltercontainer_Internalname, 1, 0, "px", 0, "px", "AdvancedContainerItem AdvancedContainerItemExpanded", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLbllot_data_lotacaofilter_Internalname, "lot_data_lotacao", "", "", lblLbllot_data_lotacaofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "WWAdvancedLabel WWDateFilterLabel", 0, "", 1, 1, 0, (short)(1), "HLP_Gx0040.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.treinamento2.GxWebStd.gx_label_element( httpContext, edtavClot_data_lotacao_Internalname, "lot_data_lotacao", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavClot_data_lotacao_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavClot_data_lotacao_Internalname, localUtil.format(AV9clot_data_lotacao, "99/99/99"), localUtil.format( AV9clot_data_lotacao, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'por',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'por',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClot_data_lotacao_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavClot_data_lotacao_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Gx0040.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divLot_data_remocaofiltercontainer_Internalname, 1, 0, "px", 0, "px", "AdvancedContainerItem AdvancedContainerItemExpanded", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLbllot_data_remocaofilter_Internalname, "lot_data_remocao", "", "", lblLbllot_data_remocaofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "WWAdvancedLabel WWDateFilterLabel", 0, "", 1, 1, 0, (short)(1), "HLP_Gx0040.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.treinamento2.GxWebStd.gx_label_element( httpContext, edtavClot_data_remocao_Internalname, "lot_data_remocao", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavClot_data_remocao_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavClot_data_remocao_Internalname, localUtil.format(AV10clot_data_remocao, "99/99/99"), localUtil.format( AV10clot_data_remocao, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'por',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'por',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClot_data_remocao_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavClot_data_remocao_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Gx0040.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.treinamento2.GxWebStd.gx_div_start( httpContext, divLot_portariafiltercontainer_Internalname, 1, 0, "px", 0, "px", divLot_portariafiltercontainer_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Text block */
         com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblLbllot_portariafilter_Internalname, "lot_portaria", "", "", lblLbllot_portariafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14031_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, 0, (short)(1), "HLP_Gx0040.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "start", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.treinamento2.GxWebStd.gx_label_element( httpContext, edtavClot_portaria_Internalname, "lot_portaria", "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtavClot_portaria_Internalname, AV11clot_portaria, GXutil.rtrim( localUtil.format( AV11clot_portaria, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClot_portaria_Jsonclick, 0, "Attribute", "", "", "", "", edtavClot_portaria_Visible, edtavClot_portaria_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "start", true, "", "HLP_Gx0040.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e15031_client"+"'", TempTags, "", 2, "HLP_Gx0040.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         startgridcontrol74( ) ;
      }
      if ( wbEnd == 74 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_74 = (int)(nGXsfl_74_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "Fechar", bttBtn_cancel_Jsonclick, 1, "Fechar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx0040.htm");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      }
      if ( wbEnd == 74 )
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

   public void start032( )
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
      Form.getMeta().addItem("description", "Selection List lotacao", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup030( ) ;
   }

   public void ws032( )
   {
      start032( ) ;
      evt032( ) ;
   }

   public void evt032( )
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
                           nGXsfl_74_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_742( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV14Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_74_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A5lot_id = (int)(localUtil.ctol( httpContext.cgiGet( edtlot_id_Internalname), ",", ".")) ;
                           A4pes_id = (int)(localUtil.ctol( httpContext.cgiGet( edtpes_id_Internalname), ",", ".")) ;
                           A6unid_id = (int)(localUtil.ctol( httpContext.cgiGet( edtunid_id_Internalname), ",", ".")) ;
                           A17lot_data_lotacao = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtlot_data_lotacao_Internalname), 0)) ;
                           n17lot_data_lotacao = false ;
                           A18lot_data_remocao = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtlot_data_remocao_Internalname), 0)) ;
                           n18lot_data_remocao = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e16032 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e17032 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Clot_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLOT_ID"), ",", ".") != AV6clot_id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cpes_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCPES_ID"), ",", ".") != AV7cpes_id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cunid_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUNID_ID"), ",", ".") != AV8cunid_id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clot_data_lotacao Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCLOT_DATA_LOTACAO"), 0), AV9clot_data_lotacao) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clot_data_remocao Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCLOT_DATA_REMOCAO"), 0), AV10clot_data_remocao) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clot_portaria Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCLOT_PORTARIA"), AV11clot_portaria) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e18032 ();
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

   public void we032( )
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

   public void pa032( )
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
      subsflControlProps_742( ) ;
      while ( nGXsfl_74_idx <= nRC_GXsfl_74 )
      {
         sendrow_742( ) ;
         nGXsfl_74_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_74_idx+1) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_742( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  int AV6clot_id ,
                                  int AV7cpes_id ,
                                  int AV8cunid_id ,
                                  java.util.Date AV9clot_data_lotacao ,
                                  java.util.Date AV10clot_data_remocao ,
                                  String AV11clot_portaria )
   {
      initialize_formulas( ) ;
      com.treinamento2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf032( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "gxhash_LOT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5lot_id), "ZZZZZZZ9")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "LOT_ID", GXutil.ltrim( localUtil.ntoc( A5lot_id, (byte)(8), (byte)(0), ".", "")));
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
      rf032( ) ;
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

   public void rf032( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(74) ;
      nGXsfl_74_idx = 1 ;
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_742( ) ;
      bGXsfl_74_Refreshing = true ;
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
         subsflControlProps_742( ) ;
         GXPagingFrom2 = (int)(GRID1_nFirstRecordOnPage) ;
         GXPagingTo2 = (int)(subgrid1_fnc_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Integer.valueOf(AV7cpes_id) ,
                                              Integer.valueOf(AV8cunid_id) ,
                                              AV9clot_data_lotacao ,
                                              AV10clot_data_remocao ,
                                              AV11clot_portaria ,
                                              Integer.valueOf(A4pes_id) ,
                                              Integer.valueOf(A6unid_id) ,
                                              A17lot_data_lotacao ,
                                              A18lot_data_remocao ,
                                              A19lot_portaria ,
                                              Integer.valueOf(AV6clot_id) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT
                                              }
         });
         lV11clot_portaria = GXutil.concat( GXutil.rtrim( AV11clot_portaria), "%", "") ;
         /* Using cursor H00032 */
         pr_default.execute(0, new Object[] {Integer.valueOf(AV6clot_id), Integer.valueOf(AV7cpes_id), Integer.valueOf(AV8cunid_id), AV9clot_data_lotacao, AV10clot_data_remocao, lV11clot_portaria, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_74_idx = 1 ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_742( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( GRID1_nCurrentRecord < subgrid1_fnc_recordsperpage( ) ) ) )
         {
            A19lot_portaria = H00032_A19lot_portaria[0] ;
            n19lot_portaria = H00032_n19lot_portaria[0] ;
            A18lot_data_remocao = H00032_A18lot_data_remocao[0] ;
            n18lot_data_remocao = H00032_n18lot_data_remocao[0] ;
            A17lot_data_lotacao = H00032_A17lot_data_lotacao[0] ;
            n17lot_data_lotacao = H00032_n17lot_data_lotacao[0] ;
            A6unid_id = H00032_A6unid_id[0] ;
            A4pes_id = H00032_A4pes_id[0] ;
            A5lot_id = H00032_A5lot_id[0] ;
            /* Execute user event: Load */
            e17032 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(74) ;
         wb030( ) ;
      }
      bGXsfl_74_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes032( )
   {
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "gxhash_LOT_ID"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, localUtil.format( DecimalUtil.doubleToDec(A5lot_id), "ZZZZZZZ9")));
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
                                           Integer.valueOf(AV7cpes_id) ,
                                           Integer.valueOf(AV8cunid_id) ,
                                           AV9clot_data_lotacao ,
                                           AV10clot_data_remocao ,
                                           AV11clot_portaria ,
                                           Integer.valueOf(A4pes_id) ,
                                           Integer.valueOf(A6unid_id) ,
                                           A17lot_data_lotacao ,
                                           A18lot_data_remocao ,
                                           A19lot_portaria ,
                                           Integer.valueOf(AV6clot_id) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT
                                           }
      });
      lV11clot_portaria = GXutil.concat( GXutil.rtrim( AV11clot_portaria), "%", "") ;
      /* Using cursor H00033 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV6clot_id), Integer.valueOf(AV7cpes_id), Integer.valueOf(AV8cunid_id), AV9clot_data_lotacao, AV10clot_data_remocao, lV11clot_portaria});
      GRID1_nRecordCount = H00033_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6clot_id, AV7cpes_id, AV8cunid_id, AV9clot_data_lotacao, AV10clot_data_remocao, AV11clot_portaria) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6clot_id, AV7cpes_id, AV8cunid_id, AV9clot_data_lotacao, AV10clot_data_remocao, AV11clot_portaria) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6clot_id, AV7cpes_id, AV8cunid_id, AV9clot_data_lotacao, AV10clot_data_remocao, AV11clot_portaria) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6clot_id, AV7cpes_id, AV8cunid_id, AV9clot_data_lotacao, AV10clot_data_remocao, AV11clot_portaria) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6clot_id, AV7cpes_id, AV8cunid_id, AV9clot_data_lotacao, AV10clot_data_remocao, AV11clot_portaria) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      edtlot_id_Enabled = 0 ;
      edtpes_id_Enabled = 0 ;
      edtunid_id_Enabled = 0 ;
      edtlot_data_lotacao_Enabled = 0 ;
      edtlot_data_remocao_Enabled = 0 ;
      fix_multi_value_controls( ) ;
   }

   public void strup030( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e16032 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_74 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_74"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClot_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClot_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLOT_ID");
            GX_FocusControl = edtavClot_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6clot_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6clot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6clot_id), 8, 0));
         }
         else
         {
            AV6clot_id = (int)(localUtil.ctol( httpContext.cgiGet( edtavClot_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6clot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6clot_id), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCpes_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCpes_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCPES_ID");
            GX_FocusControl = edtavCpes_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cpes_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cpes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7cpes_id), 8, 0));
         }
         else
         {
            AV7cpes_id = (int)(localUtil.ctol( httpContext.cgiGet( edtavCpes_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cpes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7cpes_id), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCunid_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCunid_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUNID_ID");
            GX_FocusControl = edtavCunid_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cunid_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cunid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8cunid_id), 8, 0));
         }
         else
         {
            AV8cunid_id = (int)(localUtil.ctol( httpContext.cgiGet( edtavCunid_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cunid_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8cunid_id), 8, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavClot_data_lotacao_Internalname), (byte)(3)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCLOT_DATA_LOTACAO");
            GX_FocusControl = edtavClot_data_lotacao_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9clot_data_lotacao = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9clot_data_lotacao", localUtil.format(AV9clot_data_lotacao, "99/99/99"));
         }
         else
         {
            AV9clot_data_lotacao = localUtil.ctod( httpContext.cgiGet( edtavClot_data_lotacao_Internalname), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9clot_data_lotacao", localUtil.format(AV9clot_data_lotacao, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavClot_data_remocao_Internalname), (byte)(3)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCLOT_DATA_REMOCAO");
            GX_FocusControl = edtavClot_data_remocao_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10clot_data_remocao = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10clot_data_remocao", localUtil.format(AV10clot_data_remocao, "99/99/99"));
         }
         else
         {
            AV10clot_data_remocao = localUtil.ctod( httpContext.cgiGet( edtavClot_data_remocao_Internalname), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10clot_data_remocao", localUtil.format(AV10clot_data_remocao, "99/99/99"));
         }
         AV11clot_portaria = httpContext.cgiGet( edtavClot_portaria_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11clot_portaria", AV11clot_portaria);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLOT_ID"), ",", ".") != AV6clot_id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCPES_ID"), ",", ".") != AV7cpes_id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUNID_ID"), ",", ".") != AV8cunid_id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vCLOT_DATA_LOTACAO"), 3)), GXutil.resetTime(AV9clot_data_lotacao)) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vCLOT_DATA_REMOCAO"), 3)), GXutil.resetTime(AV10clot_data_remocao)) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCLOT_PORTARIA"), AV11clot_portaria) != 0 )
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
      e16032 ();
      if (returnInSub) return;
   }

   public void e16032( )
   {
      /* Start Routine */
      returnInSub = false ;
      Form.setCaption( GXutil.format( "Lista de Seleção %1", "lotacao", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV13ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e17032( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtavLinkselection_gximage = "selectRow" ;
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavLinkselection_Internalname, AV5LinkSelection);
      AV14Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_742( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_74_Refreshing )
      {
         httpContext.doAjaxLoad(74, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e18032 ();
      if (returnInSub) return;
   }

   public void e18032( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV12plot_id = A5lot_id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12plot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12plot_id), 8, 0));
      httpContext.setWebReturnParms(new Object[] {Integer.valueOf(AV12plot_id)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV12plot_id"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV12plot_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12plot_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12plot_id), 8, 0));
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
      pa032( ) ;
      ws032( ) ;
      we032( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2025481525339", true, true);
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
      httpContext.AddJavascriptSource("gx0040.js", "?2025481525339", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_742( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_74_idx ;
      edtlot_id_Internalname = "LOT_ID_"+sGXsfl_74_idx ;
      edtpes_id_Internalname = "PES_ID_"+sGXsfl_74_idx ;
      edtunid_id_Internalname = "UNID_ID_"+sGXsfl_74_idx ;
      edtlot_data_lotacao_Internalname = "LOT_DATA_LOTACAO_"+sGXsfl_74_idx ;
      edtlot_data_remocao_Internalname = "LOT_DATA_REMOCAO_"+sGXsfl_74_idx ;
   }

   public void subsflControlProps_fel_742( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_74_fel_idx ;
      edtlot_id_Internalname = "LOT_ID_"+sGXsfl_74_fel_idx ;
      edtpes_id_Internalname = "PES_ID_"+sGXsfl_74_fel_idx ;
      edtunid_id_Internalname = "UNID_ID_"+sGXsfl_74_fel_idx ;
      edtlot_data_lotacao_Internalname = "LOT_DATA_LOTACAO_"+sGXsfl_74_fel_idx ;
      edtlot_data_remocao_Internalname = "LOT_DATA_REMOCAO_"+sGXsfl_74_fel_idx ;
   }

   public void sendrow_742( )
   {
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_742( ) ;
      wb030( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_74_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_74_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_74_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5lot_id, (byte)(8), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_74_Refreshing);
         ClassString = "SelectionAttribute" + " " + ((GXutil.strcmp(edtavLinkselection_gximage, "")==0) ? "" : "GX_Image_"+edtavLinkselection_gximage+"_Class") ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV14Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV14Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"WWActionColumn","","","","","","",Integer.valueOf(1),Boolean.valueOf(AV5LinkSelection_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"end"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtlot_id_Internalname,GXutil.ltrim( localUtil.ntoc( A5lot_id, (byte)(8), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5lot_id), "ZZZZZZZ9"))," dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtlot_id_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"Id","end",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"end"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtpes_id_Internalname,GXutil.ltrim( localUtil.ntoc( A4pes_id, (byte)(8), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4pes_id), "ZZZZZZZ9"))," dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtpes_id_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"Id","end",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"end"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtunid_id_Internalname,GXutil.ltrim( localUtil.ntoc( A6unid_id, (byte)(8), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6unid_id), "ZZZZZZZ9"))," dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtunid_id_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"Id","end",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"end"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtlot_data_lotacao_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5lot_id, (byte)(8), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtlot_data_lotacao_Internalname, "Link", edtlot_data_lotacao_Link, !bGXsfl_74_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtlot_data_lotacao_Internalname,localUtil.format(A17lot_data_lotacao, "99/99/99"),localUtil.format( A17lot_data_lotacao, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'",edtlot_data_lotacao_Link,"","","",edtlot_data_lotacao_Jsonclick,Integer.valueOf(0),"DescriptionAttribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","end",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"end"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtlot_data_remocao_Internalname,localUtil.format(A18lot_data_remocao, "99/99/99"),localUtil.format( A18lot_data_remocao, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtlot_data_remocao_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn OptionalColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","end",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes032( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_74_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_74_idx+1) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_742( ) ;
      }
      /* End function sendrow_742 */
   }

   public void startgridcontrol74( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"74\">") ;
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
         httpContext.writeValue( "lot_id") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"end"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "pes_id") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"end"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "unid_id") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"end"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "lot_data_lotacao") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"end"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "lot_data_remocao") ;
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
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( GXutil.ltrim( localUtil.ntoc( A5lot_id, (byte)(8), (byte)(0), ".", ""))));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( GXutil.ltrim( localUtil.ntoc( A4pes_id, (byte)(8), (byte)(0), ".", ""))));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( GXutil.ltrim( localUtil.ntoc( A6unid_id, (byte)(8), (byte)(0), ".", ""))));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( localUtil.format(A17lot_data_lotacao, "99/99/99")));
         Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtlot_data_lotacao_Link));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", WebUtils.htmlEncode( localUtil.format(A18lot_data_remocao, "99/99/99")));
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
      lblLbllot_idfilter_Internalname = "LBLLOT_IDFILTER" ;
      edtavClot_id_Internalname = "vCLOT_ID" ;
      divLot_idfiltercontainer_Internalname = "LOT_IDFILTERCONTAINER" ;
      lblLblpes_idfilter_Internalname = "LBLPES_IDFILTER" ;
      edtavCpes_id_Internalname = "vCPES_ID" ;
      divPes_idfiltercontainer_Internalname = "PES_IDFILTERCONTAINER" ;
      lblLblunid_idfilter_Internalname = "LBLUNID_IDFILTER" ;
      edtavCunid_id_Internalname = "vCUNID_ID" ;
      divUnid_idfiltercontainer_Internalname = "UNID_IDFILTERCONTAINER" ;
      lblLbllot_data_lotacaofilter_Internalname = "LBLLOT_DATA_LOTACAOFILTER" ;
      edtavClot_data_lotacao_Internalname = "vCLOT_DATA_LOTACAO" ;
      divLot_data_lotacaofiltercontainer_Internalname = "LOT_DATA_LOTACAOFILTERCONTAINER" ;
      lblLbllot_data_remocaofilter_Internalname = "LBLLOT_DATA_REMOCAOFILTER" ;
      edtavClot_data_remocao_Internalname = "vCLOT_DATA_REMOCAO" ;
      divLot_data_remocaofiltercontainer_Internalname = "LOT_DATA_REMOCAOFILTERCONTAINER" ;
      lblLbllot_portariafilter_Internalname = "LBLLOT_PORTARIAFILTER" ;
      edtavClot_portaria_Internalname = "vCLOT_PORTARIA" ;
      divLot_portariafiltercontainer_Internalname = "LOT_PORTARIAFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtlot_id_Internalname = "LOT_ID" ;
      edtpes_id_Internalname = "PES_ID" ;
      edtunid_id_Internalname = "UNID_ID" ;
      edtlot_data_lotacao_Internalname = "LOT_DATA_LOTACAO" ;
      edtlot_data_remocao_Internalname = "LOT_DATA_REMOCAO" ;
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
      edtlot_data_remocao_Jsonclick = "" ;
      edtlot_data_lotacao_Jsonclick = "" ;
      edtlot_data_lotacao_Link = "" ;
      edtunid_id_Jsonclick = "" ;
      edtpes_id_Jsonclick = "" ;
      edtlot_id_Jsonclick = "" ;
      edtavLinkselection_gximage = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtlot_data_remocao_Enabled = 0 ;
      edtlot_data_lotacao_Enabled = 0 ;
      edtunid_id_Enabled = 0 ;
      edtpes_id_Enabled = 0 ;
      edtlot_id_Enabled = 0 ;
      edtavClot_portaria_Jsonclick = "" ;
      edtavClot_portaria_Enabled = 1 ;
      edtavClot_portaria_Visible = 1 ;
      edtavClot_data_remocao_Jsonclick = "" ;
      edtavClot_data_remocao_Enabled = 1 ;
      edtavClot_data_lotacao_Jsonclick = "" ;
      edtavClot_data_lotacao_Enabled = 1 ;
      edtavCunid_id_Jsonclick = "" ;
      edtavCunid_id_Enabled = 1 ;
      edtavCunid_id_Visible = 1 ;
      edtavCpes_id_Jsonclick = "" ;
      edtavCpes_id_Enabled = 1 ;
      edtavCpes_id_Visible = 1 ;
      edtavClot_id_Jsonclick = "" ;
      edtavClot_id_Enabled = 1 ;
      edtavClot_id_Visible = 1 ;
      divLot_portariafiltercontainer_Class = "AdvancedContainerItem AdvancedContainerItemExpanded" ;
      divUnid_idfiltercontainer_Class = "AdvancedContainerItem AdvancedContainerItemExpanded" ;
      divPes_idfiltercontainer_Class = "AdvancedContainerItem AdvancedContainerItemExpanded" ;
      divLot_idfiltercontainer_Class = "AdvancedContainerItem AdvancedContainerItemExpanded" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List lotacao" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6clot_id',fld:'vCLOT_ID',pic:'ZZZZZZZ9'},{av:'AV7cpes_id',fld:'vCPES_ID',pic:'ZZZZZZZ9'},{av:'AV8cunid_id',fld:'vCUNID_ID',pic:'ZZZZZZZ9'},{av:'AV9clot_data_lotacao',fld:'vCLOT_DATA_LOTACAO',pic:''},{av:'AV10clot_data_remocao',fld:'vCLOT_DATA_REMOCAO',pic:''},{av:'AV11clot_portaria',fld:'vCLOT_PORTARIA',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e15031',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]");
      setEventMetadata("'TOGGLE'",",oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLLOT_IDFILTER.CLICK","{handler:'e11031',iparms:[{av:'divLot_idfiltercontainer_Class',ctrl:'LOT_IDFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLLOT_IDFILTER.CLICK",",oparms:[{av:'divLot_idfiltercontainer_Class',ctrl:'LOT_IDFILTERCONTAINER',prop:'Class'},{av:'edtavClot_id_Visible',ctrl:'vCLOT_ID',prop:'Visible'}]}");
      setEventMetadata("LBLPES_IDFILTER.CLICK","{handler:'e12031',iparms:[{av:'divPes_idfiltercontainer_Class',ctrl:'PES_IDFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLPES_IDFILTER.CLICK",",oparms:[{av:'divPes_idfiltercontainer_Class',ctrl:'PES_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCpes_id_Visible',ctrl:'vCPES_ID',prop:'Visible'}]}");
      setEventMetadata("LBLUNID_IDFILTER.CLICK","{handler:'e13031',iparms:[{av:'divUnid_idfiltercontainer_Class',ctrl:'UNID_IDFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLUNID_IDFILTER.CLICK",",oparms:[{av:'divUnid_idfiltercontainer_Class',ctrl:'UNID_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCunid_id_Visible',ctrl:'vCUNID_ID',prop:'Visible'}]}");
      setEventMetadata("LBLLOT_PORTARIAFILTER.CLICK","{handler:'e14031',iparms:[{av:'divLot_portariafiltercontainer_Class',ctrl:'LOT_PORTARIAFILTERCONTAINER',prop:'Class'}]");
      setEventMetadata("LBLLOT_PORTARIAFILTER.CLICK",",oparms:[{av:'divLot_portariafiltercontainer_Class',ctrl:'LOT_PORTARIAFILTERCONTAINER',prop:'Class'},{av:'edtavClot_portaria_Visible',ctrl:'vCLOT_PORTARIA',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e18032',iparms:[{av:'A5lot_id',fld:'LOT_ID',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV12plot_id',fld:'vPLOT_ID',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6clot_id',fld:'vCLOT_ID',pic:'ZZZZZZZ9'},{av:'AV7cpes_id',fld:'vCPES_ID',pic:'ZZZZZZZ9'},{av:'AV8cunid_id',fld:'vCUNID_ID',pic:'ZZZZZZZ9'},{av:'AV9clot_data_lotacao',fld:'vCLOT_DATA_LOTACAO',pic:''},{av:'AV10clot_data_remocao',fld:'vCLOT_DATA_REMOCAO',pic:''},{av:'AV11clot_portaria',fld:'vCLOT_PORTARIA',pic:''}]");
      setEventMetadata("GRID1_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6clot_id',fld:'vCLOT_ID',pic:'ZZZZZZZ9'},{av:'AV7cpes_id',fld:'vCPES_ID',pic:'ZZZZZZZ9'},{av:'AV8cunid_id',fld:'vCUNID_ID',pic:'ZZZZZZZ9'},{av:'AV9clot_data_lotacao',fld:'vCLOT_DATA_LOTACAO',pic:''},{av:'AV10clot_data_remocao',fld:'vCLOT_DATA_REMOCAO',pic:''},{av:'AV11clot_portaria',fld:'vCLOT_PORTARIA',pic:''}]");
      setEventMetadata("GRID1_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6clot_id',fld:'vCLOT_ID',pic:'ZZZZZZZ9'},{av:'AV7cpes_id',fld:'vCPES_ID',pic:'ZZZZZZZ9'},{av:'AV8cunid_id',fld:'vCUNID_ID',pic:'ZZZZZZZ9'},{av:'AV9clot_data_lotacao',fld:'vCLOT_DATA_LOTACAO',pic:''},{av:'AV10clot_data_remocao',fld:'vCLOT_DATA_REMOCAO',pic:''},{av:'AV11clot_portaria',fld:'vCLOT_PORTARIA',pic:''}]");
      setEventMetadata("GRID1_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV6clot_id',fld:'vCLOT_ID',pic:'ZZZZZZZ9'},{av:'AV7cpes_id',fld:'vCPES_ID',pic:'ZZZZZZZ9'},{av:'AV8cunid_id',fld:'vCUNID_ID',pic:'ZZZZZZZ9'},{av:'AV9clot_data_lotacao',fld:'vCLOT_DATA_LOTACAO',pic:''},{av:'AV10clot_data_remocao',fld:'vCLOT_DATA_REMOCAO',pic:''},{av:'AV11clot_portaria',fld:'vCLOT_PORTARIA',pic:''}]");
      setEventMetadata("GRID1_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Lot_data_remocao',iparms:[]");
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
      AV9clot_data_lotacao = GXutil.nullDate() ;
      AV10clot_data_remocao = GXutil.nullDate() ;
      AV11clot_portaria = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLbllot_idfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblpes_idfilter_Jsonclick = "" ;
      lblLblunid_idfilter_Jsonclick = "" ;
      lblLbllot_data_lotacaofilter_Jsonclick = "" ;
      lblLbllot_data_remocaofilter_Jsonclick = "" ;
      lblLbllot_portariafilter_Jsonclick = "" ;
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
      AV14Linkselection_GXI = "" ;
      A17lot_data_lotacao = GXutil.nullDate() ;
      A18lot_data_remocao = GXutil.nullDate() ;
      lV11clot_portaria = "" ;
      A19lot_portaria = "" ;
      H00032_A19lot_portaria = new String[] {""} ;
      H00032_n19lot_portaria = new boolean[] {false} ;
      H00032_A18lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      H00032_n18lot_data_remocao = new boolean[] {false} ;
      H00032_A17lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      H00032_n17lot_data_lotacao = new boolean[] {false} ;
      H00032_A6unid_id = new int[1] ;
      H00032_A4pes_id = new int[1] ;
      H00032_A5lot_id = new int[1] ;
      H00033_AGRID1_nRecordCount = new long[1] ;
      AV13ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid1_Linesclass = "" ;
      sImgUrl = "" ;
      ROClassString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.gx0040__default(),
         new Object[] {
             new Object[] {
            H00032_A19lot_portaria, H00032_n19lot_portaria, H00032_A18lot_data_remocao, H00032_n18lot_data_remocao, H00032_A17lot_data_lotacao, H00032_n17lot_data_lotacao, H00032_A6unid_id, H00032_A4pes_id, H00032_A5lot_id
            }
            , new Object[] {
            H00033_AGRID1_nRecordCount
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
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private int nRC_GXsfl_74 ;
   private int subGrid1_Rows ;
   private int AV12plot_id ;
   private int nGXsfl_74_idx=1 ;
   private int AV6clot_id ;
   private int AV7cpes_id ;
   private int AV8cunid_id ;
   private int edtavClot_id_Enabled ;
   private int edtavClot_id_Visible ;
   private int edtavCpes_id_Enabled ;
   private int edtavCpes_id_Visible ;
   private int edtavCunid_id_Enabled ;
   private int edtavCunid_id_Visible ;
   private int edtavClot_data_lotacao_Enabled ;
   private int edtavClot_data_remocao_Enabled ;
   private int edtavClot_portaria_Visible ;
   private int edtavClot_portaria_Enabled ;
   private int A5lot_id ;
   private int A4pes_id ;
   private int A6unid_id ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtlot_id_Enabled ;
   private int edtpes_id_Enabled ;
   private int edtunid_id_Enabled ;
   private int edtlot_data_lotacao_Enabled ;
   private int edtlot_data_remocao_Enabled ;
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
   private String divLot_idfiltercontainer_Class ;
   private String divPes_idfiltercontainer_Class ;
   private String divUnid_idfiltercontainer_Class ;
   private String divLot_portariafiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_74_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divLot_idfiltercontainer_Internalname ;
   private String lblLbllot_idfilter_Internalname ;
   private String lblLbllot_idfilter_Jsonclick ;
   private String edtavClot_id_Internalname ;
   private String TempTags ;
   private String edtavClot_id_Jsonclick ;
   private String divPes_idfiltercontainer_Internalname ;
   private String lblLblpes_idfilter_Internalname ;
   private String lblLblpes_idfilter_Jsonclick ;
   private String edtavCpes_id_Internalname ;
   private String edtavCpes_id_Jsonclick ;
   private String divUnid_idfiltercontainer_Internalname ;
   private String lblLblunid_idfilter_Internalname ;
   private String lblLblunid_idfilter_Jsonclick ;
   private String edtavCunid_id_Internalname ;
   private String edtavCunid_id_Jsonclick ;
   private String divLot_data_lotacaofiltercontainer_Internalname ;
   private String lblLbllot_data_lotacaofilter_Internalname ;
   private String lblLbllot_data_lotacaofilter_Jsonclick ;
   private String edtavClot_data_lotacao_Internalname ;
   private String edtavClot_data_lotacao_Jsonclick ;
   private String divLot_data_remocaofiltercontainer_Internalname ;
   private String lblLbllot_data_remocaofilter_Internalname ;
   private String lblLbllot_data_remocaofilter_Jsonclick ;
   private String edtavClot_data_remocao_Internalname ;
   private String edtavClot_data_remocao_Jsonclick ;
   private String divLot_portariafiltercontainer_Internalname ;
   private String lblLbllot_portariafilter_Internalname ;
   private String lblLbllot_portariafilter_Jsonclick ;
   private String edtavClot_portaria_Internalname ;
   private String edtavClot_portaria_Jsonclick ;
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
   private String edtlot_id_Internalname ;
   private String edtpes_id_Internalname ;
   private String edtunid_id_Internalname ;
   private String edtlot_data_lotacao_Internalname ;
   private String edtlot_data_remocao_Internalname ;
   private String AV13ADVANCED_LABEL_TEMPLATE ;
   private String edtavLinkselection_gximage ;
   private String sGXsfl_74_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String edtavLinkselection_Link ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtlot_id_Jsonclick ;
   private String edtpes_id_Jsonclick ;
   private String edtunid_id_Jsonclick ;
   private String edtlot_data_lotacao_Link ;
   private String edtlot_data_lotacao_Jsonclick ;
   private String edtlot_data_remocao_Jsonclick ;
   private String subGrid1_Header ;
   private java.util.Date AV9clot_data_lotacao ;
   private java.util.Date AV10clot_data_remocao ;
   private java.util.Date A17lot_data_lotacao ;
   private java.util.Date A18lot_data_remocao ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_74_Refreshing=false ;
   private boolean n17lot_data_lotacao ;
   private boolean n18lot_data_remocao ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n19lot_portaria ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV11clot_portaria ;
   private String AV14Linkselection_GXI ;
   private String lV11clot_portaria ;
   private String A19lot_portaria ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXWebForm Form ;
   private IDataStoreProvider pr_default ;
   private String[] H00032_A19lot_portaria ;
   private boolean[] H00032_n19lot_portaria ;
   private java.util.Date[] H00032_A18lot_data_remocao ;
   private boolean[] H00032_n18lot_data_remocao ;
   private java.util.Date[] H00032_A17lot_data_lotacao ;
   private boolean[] H00032_n17lot_data_lotacao ;
   private int[] H00032_A6unid_id ;
   private int[] H00032_A4pes_id ;
   private int[] H00032_A5lot_id ;
   private long[] H00033_AGRID1_nRecordCount ;
}

final  class gx0040__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00032( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV7cpes_id ,
                                          int AV8cunid_id ,
                                          java.util.Date AV9clot_data_lotacao ,
                                          java.util.Date AV10clot_data_remocao ,
                                          String AV11clot_portaria ,
                                          int A4pes_id ,
                                          int A6unid_id ,
                                          java.util.Date A17lot_data_lotacao ,
                                          java.util.Date A18lot_data_remocao ,
                                          String A19lot_portaria ,
                                          int AV6clot_id )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[9];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " lot_portaria, lot_data_remocao, lot_data_lotacao, unid_id, pes_id, lot_id" ;
      sFromString = " FROM lotacao" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(lot_id >= ?)");
      if ( ! (0==AV7cpes_id) )
      {
         addWhere(sWhereString, "(pes_id >= ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cunid_id) )
      {
         addWhere(sWhereString, "(unid_id >= ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9clot_data_lotacao)) )
      {
         addWhere(sWhereString, "(lot_data_lotacao >= ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10clot_data_remocao)) )
      {
         addWhere(sWhereString, "(lot_data_remocao >= ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11clot_portaria)==0) )
      {
         addWhere(sWhereString, "(lot_portaria like ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      sOrderString += " ORDER BY lot_id" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " OFFSET " + "?" + " LIMIT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H00033( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV7cpes_id ,
                                          int AV8cunid_id ,
                                          java.util.Date AV9clot_data_lotacao ,
                                          java.util.Date AV10clot_data_remocao ,
                                          String AV11clot_portaria ,
                                          int A4pes_id ,
                                          int A6unid_id ,
                                          java.util.Date A17lot_data_lotacao ,
                                          java.util.Date A18lot_data_remocao ,
                                          String A19lot_portaria ,
                                          int AV6clot_id )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[6];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM lotacao" ;
      addWhere(sWhereString, "(lot_id >= ?)");
      if ( ! (0==AV7cpes_id) )
      {
         addWhere(sWhereString, "(pes_id >= ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cunid_id) )
      {
         addWhere(sWhereString, "(unid_id >= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9clot_data_lotacao)) )
      {
         addWhere(sWhereString, "(lot_data_lotacao >= ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10clot_data_remocao)) )
      {
         addWhere(sWhereString, "(lot_data_remocao >= ?)");
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11clot_portaria)==0) )
      {
         addWhere(sWhereString, "(lot_portaria like ?)");
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
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
                  return conditional_H00032(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() );
            case 1 :
                  return conditional_H00033(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00032", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00033", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((int[]) buf[8])[0] = rslt.getInt(6);
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
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               return;
      }
   }

}

