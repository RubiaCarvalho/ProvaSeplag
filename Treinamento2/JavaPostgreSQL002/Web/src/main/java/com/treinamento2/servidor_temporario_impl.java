package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class servidor_temporario_impl extends GXDataArea
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
         A31st_pes_id = (int)(GXutil.lval( httpContext.GetPar( "st_pes_id"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A31st_pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A31st_pes_id), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A31st_pes_id) ;
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
      Form.getMeta().addItem("description", "servidor_temporario", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtst_pes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Treinamento2", true);
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public servidor_temporario_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public servidor_temporario_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( servidor_temporario_impl.class ));
   }

   public servidor_temporario_impl( int remoteHandle ,
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
      com.treinamento2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "servidor_temporario", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "heading-01", 0, "", 1, 1, 0, (short)(0), "HLP_servidor_temporario.htm");
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
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_servidor_temporario.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-prev" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_servidor_temporario.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-next" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_servidor_temporario.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-last" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_servidor_temporario.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "Button button-secondary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Selecionar", bttBtn_select_Jsonclick, 4, "Selecionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.treinamento2.gx0080"+"',["+"{Ctrl:gx.dom.el('"+"ST_PES_ID"+"'), id:'"+"ST_PES_ID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_servidor_temporario.htm");
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
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtst_pes_id_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtst_pes_id_Internalname, "st_pes_id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtst_pes_id_Internalname, GXutil.ltrim( localUtil.ntoc( A31st_pes_id, (byte)(8), (byte)(0), ",", "")), GXutil.ltrim( ((edtst_pes_id_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A31st_pes_id), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A31st_pes_id), "ZZZZZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtst_pes_id_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtst_pes_id_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Id", "end", false, "", "HLP_servidor_temporario.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_31_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_31_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "prompt.gif", "", context.getHttpContext().getTheme( )) ;
      com.treinamento2.GxWebStd.gx_bitmap( httpContext, imgprompt_31_Internalname, sImgUrl, imgprompt_31_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_31_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_servidor_temporario.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtst_data_admissao_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtst_data_admissao_Internalname, "Admissao ", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtst_data_admissao_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtst_data_admissao_Internalname, localUtil.format(A25st_data_admissao, "99/99/99"), localUtil.format( A25st_data_admissao, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'por',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'por',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtst_data_admissao_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtst_data_admissao_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_servidor_temporario.htm");
      com.treinamento2.GxWebStd.gx_bitmap( httpContext, edtst_data_admissao_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtst_data_admissao_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_servidor_temporario.htm");
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
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtst_data_demissao_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.treinamento2.GxWebStd.gx_label_element( httpContext, edtst_data_demissao_Internalname, "de Demissao", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtst_data_demissao_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      com.treinamento2.GxWebStd.gx_single_line_edit( httpContext, edtst_data_demissao_Internalname, localUtil.format(A26st_data_demissao, "99/99/99"), localUtil.format( A26st_data_demissao, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'por',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'por',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtst_data_demissao_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtst_data_demissao_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_servidor_temporario.htm");
      com.treinamento2.GxWebStd.gx_bitmap( httpContext, edtst_data_demissao_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtst_data_demissao_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_servidor_temporario.htm");
      httpContext.writeTextNL( "</div>") ;
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
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_servidor_temporario.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Fechar", bttBtn_cancel_Jsonclick, 1, "Fechar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_servidor_temporario.htm");
      com.treinamento2.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.treinamento2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.treinamento2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_servidor_temporario.htm");
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
         Z31st_pes_id = (int)(localUtil.ctol( httpContext.cgiGet( "Z31st_pes_id"), ",", ".")) ;
         Z25st_data_admissao = localUtil.ctod( httpContext.cgiGet( "Z25st_data_admissao"), 0) ;
         Z26st_data_demissao = localUtil.ctod( httpContext.cgiGet( "Z26st_data_demissao"), 0) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtst_pes_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtst_pes_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ST_PES_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtst_pes_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A31st_pes_id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A31st_pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A31st_pes_id), 8, 0));
         }
         else
         {
            A31st_pes_id = (int)(localUtil.ctol( httpContext.cgiGet( edtst_pes_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A31st_pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A31st_pes_id), 8, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtst_data_admissao_Internalname), (byte)(3)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ST_DATA_ADMISSAO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtst_data_admissao_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A25st_data_admissao = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A25st_data_admissao", localUtil.format(A25st_data_admissao, "99/99/99"));
         }
         else
         {
            A25st_data_admissao = localUtil.ctod( httpContext.cgiGet( edtst_data_admissao_Internalname), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "A25st_data_admissao", localUtil.format(A25st_data_admissao, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtst_data_demissao_Internalname), (byte)(3)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ST_DATA_DEMISSAO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtst_data_demissao_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A26st_data_demissao = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A26st_data_demissao", localUtil.format(A26st_data_demissao, "99/99/99"));
         }
         else
         {
            A26st_data_demissao = localUtil.ctod( httpContext.cgiGet( edtst_data_demissao_Internalname), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "A26st_data_demissao", localUtil.format(A26st_data_demissao, "99/99/99"));
         }
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
            A31st_pes_id = (int)(GXutil.lval( httpContext.GetPar( "st_pes_id"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A31st_pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A31st_pes_id), 8, 0));
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
            initAll078( ) ;
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
      disableAttributes078( ) ;
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

   public void resetCaption070( )
   {
   }

   public void zm078( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z25st_data_admissao = T00073_A25st_data_admissao[0] ;
            Z26st_data_demissao = T00073_A26st_data_demissao[0] ;
         }
         else
         {
            Z25st_data_admissao = A25st_data_admissao ;
            Z26st_data_demissao = A26st_data_demissao ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z25st_data_admissao = A25st_data_admissao ;
         Z26st_data_demissao = A26st_data_demissao ;
         Z31st_pes_id = A31st_pes_id ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_31_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.treinamento2.gx0050"+"',["+"{Ctrl:gx.dom.el('"+"ST_PES_ID"+"'), id:'"+"ST_PES_ID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");") ;
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

   public void load078( )
   {
      /* Using cursor T00075 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A31st_pes_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A25st_data_admissao = T00075_A25st_data_admissao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A25st_data_admissao", localUtil.format(A25st_data_admissao, "99/99/99"));
         A26st_data_demissao = T00075_A26st_data_demissao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A26st_data_demissao", localUtil.format(A26st_data_demissao, "99/99/99"));
         zm078( -1) ;
      }
      pr_default.close(3);
      onLoadActions078( ) ;
   }

   public void onLoadActions078( )
   {
   }

   public void checkExtendedTable078( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00074 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A31st_pes_id)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'servidor_temporario'.", "ForeignKeyNotFound", 1, "ST_PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtst_pes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors078( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( int A31st_pes_id )
   {
      /* Using cursor T00076 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A31st_pes_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'servidor_temporario'.", "ForeignKeyNotFound", 1, "ST_PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtst_pes_id_Internalname ;
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

   public void getKey078( )
   {
      /* Using cursor T00077 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A31st_pes_id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound8 = (short)(1) ;
      }
      else
      {
         RcdFound8 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00073 */
      pr_default.execute(1, new Object[] {Integer.valueOf(A31st_pes_id)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm078( 1) ;
         RcdFound8 = (short)(1) ;
         A25st_data_admissao = T00073_A25st_data_admissao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A25st_data_admissao", localUtil.format(A25st_data_admissao, "99/99/99"));
         A26st_data_demissao = T00073_A26st_data_demissao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A26st_data_demissao", localUtil.format(A26st_data_demissao, "99/99/99"));
         A31st_pes_id = T00073_A31st_pes_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31st_pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A31st_pes_id), 8, 0));
         Z31st_pes_id = A31st_pes_id ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load078( ) ;
         if ( AnyError == 1 )
         {
            RcdFound8 = (short)(0) ;
            initializeNonKey078( ) ;
         }
         Gx_mode = sMode8 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound8 = (short)(0) ;
         initializeNonKey078( ) ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode8 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey078( ) ;
      if ( RcdFound8 == 0 )
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
      RcdFound8 = (short)(0) ;
      /* Using cursor T00078 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A31st_pes_id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T00078_A31st_pes_id[0] < A31st_pes_id ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T00078_A31st_pes_id[0] > A31st_pes_id ) ) )
         {
            A31st_pes_id = T00078_A31st_pes_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A31st_pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A31st_pes_id), 8, 0));
            RcdFound8 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound8 = (short)(0) ;
      /* Using cursor T00079 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A31st_pes_id)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T00079_A31st_pes_id[0] > A31st_pes_id ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T00079_A31st_pes_id[0] < A31st_pes_id ) ) )
         {
            A31st_pes_id = T00079_A31st_pes_id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A31st_pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A31st_pes_id), 8, 0));
            RcdFound8 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey078( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtst_pes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert078( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound8 == 1 )
         {
            if ( A31st_pes_id != Z31st_pes_id )
            {
               A31st_pes_id = Z31st_pes_id ;
               httpContext.ajax_rsp_assign_attri("", false, "A31st_pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A31st_pes_id), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ST_PES_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtst_pes_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtst_pes_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update078( ) ;
               GX_FocusControl = edtst_pes_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A31st_pes_id != Z31st_pes_id )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtst_pes_id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert078( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ST_PES_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtst_pes_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtst_pes_id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert078( ) ;
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
      if ( A31st_pes_id != Z31st_pes_id )
      {
         A31st_pes_id = Z31st_pes_id ;
         httpContext.ajax_rsp_assign_attri("", false, "A31st_pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A31st_pes_id), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ST_PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtst_pes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtst_pes_id_Internalname ;
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
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "ST_PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtst_pes_id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtst_data_admissao_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart078( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtst_data_admissao_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd078( ) ;
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
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtst_data_admissao_Internalname ;
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
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtst_data_admissao_Internalname ;
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
      scanStart078( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound8 != 0 )
         {
            scanNext078( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtst_data_admissao_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd078( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency078( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00072 */
         pr_default.execute(0, new Object[] {Integer.valueOf(A31st_pes_id)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"servidor_temporario"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z25st_data_admissao), GXutil.resetTime(T00072_A25st_data_admissao[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z26st_data_demissao), GXutil.resetTime(T00072_A26st_data_demissao[0])) ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z25st_data_admissao), GXutil.resetTime(T00072_A25st_data_admissao[0])) ) )
            {
               GXutil.writeLogln("servidor_temporario:[seudo value changed for attri]"+"st_data_admissao");
               GXutil.writeLogRaw("Old: ",Z25st_data_admissao);
               GXutil.writeLogRaw("Current: ",T00072_A25st_data_admissao[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z26st_data_demissao), GXutil.resetTime(T00072_A26st_data_demissao[0])) ) )
            {
               GXutil.writeLogln("servidor_temporario:[seudo value changed for attri]"+"st_data_demissao");
               GXutil.writeLogRaw("Old: ",Z26st_data_demissao);
               GXutil.writeLogRaw("Current: ",T00072_A26st_data_demissao[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"servidor_temporario"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert078( )
   {
      beforeValidate078( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable078( ) ;
      }
      if ( AnyError == 0 )
      {
         zm078( 0) ;
         checkOptimisticConcurrency078( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm078( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert078( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000710 */
                  pr_default.execute(8, new Object[] {A25st_data_admissao, A26st_data_demissao, Integer.valueOf(A31st_pes_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_temporario");
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
                        resetCaption070( ) ;
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
            load078( ) ;
         }
         endLevel078( ) ;
      }
      closeExtendedTableCursors078( ) ;
   }

   public void update078( )
   {
      beforeValidate078( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable078( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency078( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm078( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate078( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000711 */
                  pr_default.execute(9, new Object[] {A25st_data_admissao, A26st_data_demissao, Integer.valueOf(A31st_pes_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_temporario");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"servidor_temporario"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate078( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption070( ) ;
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
         endLevel078( ) ;
      }
      closeExtendedTableCursors078( ) ;
   }

   public void deferredUpdate078( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate078( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency078( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls078( ) ;
         afterConfirm078( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete078( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000712 */
               pr_default.execute(10, new Object[] {Integer.valueOf(A31st_pes_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_temporario");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound8 == 0 )
                     {
                        initAll078( ) ;
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
                     resetCaption070( ) ;
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
      sMode8 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel078( ) ;
      Gx_mode = sMode8 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls078( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel078( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete078( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "servidor_temporario");
         if ( AnyError == 0 )
         {
            confirmValues070( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "servidor_temporario");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart078( )
   {
      /* Using cursor T000713 */
      pr_default.execute(11);
      RcdFound8 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A31st_pes_id = T000713_A31st_pes_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31st_pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A31st_pes_id), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext078( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound8 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A31st_pes_id = T000713_A31st_pes_id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31st_pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A31st_pes_id), 8, 0));
      }
   }

   public void scanEnd078( )
   {
      pr_default.close(11);
   }

   public void afterConfirm078( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert078( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate078( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete078( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete078( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate078( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes078( )
   {
      edtst_pes_id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtst_pes_id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtst_pes_id_Enabled), 5, 0), true);
      edtst_data_admissao_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtst_data_admissao_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtst_data_admissao_Enabled), 5, 0), true);
      edtst_data_demissao_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtst_data_demissao_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtst_data_demissao_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes078( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues070( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.treinamento2.servidor_temporario", new String[] {}, new String[] {}) +"\">") ;
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
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z31st_pes_id", GXutil.ltrim( localUtil.ntoc( Z31st_pes_id, (byte)(8), (byte)(0), ",", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z25st_data_admissao", localUtil.dtoc( Z25st_data_admissao, 0, "/"));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z26st_data_demissao", localUtil.dtoc( Z26st_data_demissao, 0, "/"));
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
      return formatLink("com.treinamento2.servidor_temporario", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "servidor_temporario" ;
   }

   public String getPgmdesc( )
   {
      return "servidor_temporario" ;
   }

   public void initializeNonKey078( )
   {
      A25st_data_admissao = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A25st_data_admissao", localUtil.format(A25st_data_admissao, "99/99/99"));
      A26st_data_demissao = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A26st_data_demissao", localUtil.format(A26st_data_demissao, "99/99/99"));
      Z25st_data_admissao = GXutil.nullDate() ;
      Z26st_data_demissao = GXutil.nullDate() ;
   }

   public void initAll078( )
   {
      A31st_pes_id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A31st_pes_id", GXutil.ltrimstr( DecimalUtil.doubleToDec(A31st_pes_id), 8, 0));
      initializeNonKey078( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20254815252837", true, true);
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
      httpContext.AddJavascriptSource("servidor_temporario.js", "?20254815252837", false, true);
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
      edtst_pes_id_Internalname = "ST_PES_ID" ;
      edtst_data_admissao_Internalname = "ST_DATA_ADMISSAO" ;
      edtst_data_demissao_Internalname = "ST_DATA_DEMISSAO" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_31_Internalname = "PROMPT_31" ;
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
      Form.setCaption( "servidor_temporario" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtst_data_demissao_Jsonclick = "" ;
      edtst_data_demissao_Enabled = 1 ;
      edtst_data_admissao_Jsonclick = "" ;
      edtst_data_admissao_Enabled = 1 ;
      imgprompt_31_Visible = 1 ;
      imgprompt_31_Link = "" ;
      edtst_pes_id_Jsonclick = "" ;
      edtst_pes_id_Enabled = 1 ;
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
      GX_FocusControl = edtst_data_admissao_Internalname ;
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

   public void valid_St_pes_id( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T000714 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A31st_pes_id)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'servidor_temporario'.", "ForeignKeyNotFound", 1, "ST_PES_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtst_pes_id_Internalname ;
      }
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A25st_data_admissao", localUtil.format(A25st_data_admissao, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A26st_data_demissao", localUtil.format(A26st_data_demissao, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z31st_pes_id", GXutil.ltrim( localUtil.ntoc( Z31st_pes_id, (byte)(8), (byte)(0), ".", "")));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z25st_data_admissao", localUtil.format(Z25st_data_admissao, "99/99/99"));
      com.treinamento2.GxWebStd.gx_hidden_field( httpContext, "Z26st_data_demissao", localUtil.format(Z26st_data_demissao, "99/99/99"));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
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
      setEventMetadata("VALID_ST_PES_ID","{handler:'valid_St_pes_id',iparms:[{av:'A31st_pes_id',fld:'ST_PES_ID',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ST_PES_ID",",oparms:[{av:'A25st_data_admissao',fld:'ST_DATA_ADMISSAO',pic:''},{av:'A26st_data_demissao',fld:'ST_DATA_DEMISSAO',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z31st_pes_id'},{av:'Z25st_data_admissao'},{av:'Z26st_data_demissao'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      Z25st_data_admissao = GXutil.nullDate() ;
      Z26st_data_demissao = GXutil.nullDate() ;
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
      imgprompt_31_gximage = "" ;
      sImgUrl = "" ;
      A25st_data_admissao = GXutil.nullDate() ;
      A26st_data_demissao = GXutil.nullDate() ;
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
      T00075_A25st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      T00075_A26st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      T00075_A31st_pes_id = new int[1] ;
      T00074_A31st_pes_id = new int[1] ;
      T00076_A31st_pes_id = new int[1] ;
      T00077_A31st_pes_id = new int[1] ;
      T00073_A25st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      T00073_A26st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      T00073_A31st_pes_id = new int[1] ;
      sMode8 = "" ;
      T00078_A31st_pes_id = new int[1] ;
      T00079_A31st_pes_id = new int[1] ;
      T00072_A25st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      T00072_A26st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      T00072_A31st_pes_id = new int[1] ;
      T000713_A31st_pes_id = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T000714_A31st_pes_id = new int[1] ;
      ZZ25st_data_admissao = GXutil.nullDate() ;
      ZZ26st_data_demissao = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.servidor_temporario__default(),
         new Object[] {
             new Object[] {
            T00072_A25st_data_admissao, T00072_A26st_data_demissao, T00072_A31st_pes_id
            }
            , new Object[] {
            T00073_A25st_data_admissao, T00073_A26st_data_demissao, T00073_A31st_pes_id
            }
            , new Object[] {
            T00074_A31st_pes_id
            }
            , new Object[] {
            T00075_A25st_data_admissao, T00075_A26st_data_demissao, T00075_A31st_pes_id
            }
            , new Object[] {
            T00076_A31st_pes_id
            }
            , new Object[] {
            T00077_A31st_pes_id
            }
            , new Object[] {
            T00078_A31st_pes_id
            }
            , new Object[] {
            T00079_A31st_pes_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000713_A31st_pes_id
            }
            , new Object[] {
            T000714_A31st_pes_id
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
   private short RcdFound8 ;
   private int Z31st_pes_id ;
   private int A31st_pes_id ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtst_pes_id_Enabled ;
   private int imgprompt_31_Visible ;
   private int edtst_data_admissao_Enabled ;
   private int edtst_data_demissao_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ31st_pes_id ;
   private String sPrefix ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtst_pes_id_Internalname ;
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
   private String edtst_pes_id_Jsonclick ;
   private String imgprompt_31_gximage ;
   private String sImgUrl ;
   private String imgprompt_31_Internalname ;
   private String imgprompt_31_Link ;
   private String edtst_data_admissao_Internalname ;
   private String edtst_data_admissao_Jsonclick ;
   private String edtst_data_demissao_Internalname ;
   private String edtst_data_demissao_Jsonclick ;
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
   private String sMode8 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z25st_data_admissao ;
   private java.util.Date Z26st_data_demissao ;
   private java.util.Date A25st_data_admissao ;
   private java.util.Date A26st_data_demissao ;
   private java.util.Date ZZ25st_data_admissao ;
   private java.util.Date ZZ26st_data_demissao ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private com.genexus.webpanels.GXWebForm Form ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T00075_A25st_data_admissao ;
   private java.util.Date[] T00075_A26st_data_demissao ;
   private int[] T00075_A31st_pes_id ;
   private int[] T00074_A31st_pes_id ;
   private int[] T00076_A31st_pes_id ;
   private int[] T00077_A31st_pes_id ;
   private java.util.Date[] T00073_A25st_data_admissao ;
   private java.util.Date[] T00073_A26st_data_demissao ;
   private int[] T00073_A31st_pes_id ;
   private int[] T00078_A31st_pes_id ;
   private int[] T00079_A31st_pes_id ;
   private java.util.Date[] T00072_A25st_data_admissao ;
   private java.util.Date[] T00072_A26st_data_demissao ;
   private int[] T00072_A31st_pes_id ;
   private int[] T000713_A31st_pes_id ;
   private int[] T000714_A31st_pes_id ;
}

final  class servidor_temporario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00072", "SELECT st_data_admissao, st_data_demissao, st_pes_id FROM servidor_temporario WHERE st_pes_id = ?  FOR UPDATE OF servidor_temporario NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00073", "SELECT st_data_admissao, st_data_demissao, st_pes_id FROM servidor_temporario WHERE st_pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00074", "SELECT pes_id AS st_pes_id FROM Pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00075", "SELECT TM1.st_data_admissao, TM1.st_data_demissao, TM1.st_pes_id AS st_pes_id FROM servidor_temporario TM1 WHERE TM1.st_pes_id = ? ORDER BY TM1.st_pes_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00076", "SELECT pes_id AS st_pes_id FROM Pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00077", "SELECT st_pes_id FROM servidor_temporario WHERE st_pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00078", "SELECT st_pes_id FROM servidor_temporario WHERE ( st_pes_id > ?) ORDER BY st_pes_id  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00079", "SELECT st_pes_id FROM servidor_temporario WHERE ( st_pes_id < ?) ORDER BY st_pes_id DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000710", "SAVEPOINT gxupdate;INSERT INTO servidor_temporario(st_data_admissao, st_data_demissao, st_pes_id) VALUES(?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000711", "SAVEPOINT gxupdate;UPDATE servidor_temporario SET st_data_admissao=?, st_data_demissao=?  WHERE st_pes_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000712", "SAVEPOINT gxupdate;DELETE FROM servidor_temporario  WHERE st_pes_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000713", "SELECT st_pes_id FROM servidor_temporario ORDER BY st_pes_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000714", "SELECT pes_id AS st_pes_id FROM Pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 12 :
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

