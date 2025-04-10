package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lotacao_bc extends GXWebProcedure implements IGxSilentTrn
{
   public lotacao_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lotacao_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lotacao_bc.class ));
   }

   public lotacao_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow044( ) ;
      standaloneNotModal( ) ;
      initializeNonKey044( ) ;
      standaloneModal( ) ;
      addRow044( ) ;
      Gx_mode = "INS" ;
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
            Z5lot_id = A5lot_id ;
            SetMode( "UPD") ;
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

   public boolean Reindex( )
   {
      return true ;
   }

   public void confirm_040( )
   {
      beforeValidate044( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls044( ) ;
         }
         else
         {
            checkExtendedTable044( ) ;
            if ( AnyError == 0 )
            {
               zm044( 2) ;
               zm044( 3) ;
            }
            closeExtendedTableCursors044( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm044( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z17lot_data_lotacao = A17lot_data_lotacao ;
         Z18lot_data_remocao = A18lot_data_remocao ;
         Z19lot_portaria = A19lot_portaria ;
         Z4pes_id = A4pes_id ;
         Z6unid_id = A6unid_id ;
      }
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
      }
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
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
   }

   public void standaloneModal( )
   {
   }

   public void load044( )
   {
      /* Using cursor BC00046 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A5lot_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A17lot_data_lotacao = BC00046_A17lot_data_lotacao[0] ;
         n17lot_data_lotacao = BC00046_n17lot_data_lotacao[0] ;
         A18lot_data_remocao = BC00046_A18lot_data_remocao[0] ;
         n18lot_data_remocao = BC00046_n18lot_data_remocao[0] ;
         A19lot_portaria = BC00046_A19lot_portaria[0] ;
         n19lot_portaria = BC00046_n19lot_portaria[0] ;
         A4pes_id = BC00046_A4pes_id[0] ;
         A6unid_id = BC00046_A6unid_id[0] ;
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
      standaloneModal( ) ;
      /* Using cursor BC00047 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A4pes_id)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'Pessoa'.", "ForeignKeyNotFound", 1, "PES_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
      /* Using cursor BC00048 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A6unid_id)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'Unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursors044( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void getKey044( )
   {
      /* Using cursor BC00049 */
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
      /* Using cursor BC000410 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A5lot_id)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         zm044( 1) ;
         RcdFound4 = (short)(1) ;
         A5lot_id = BC000410_A5lot_id[0] ;
         A17lot_data_lotacao = BC000410_A17lot_data_lotacao[0] ;
         n17lot_data_lotacao = BC000410_n17lot_data_lotacao[0] ;
         A18lot_data_remocao = BC000410_A18lot_data_remocao[0] ;
         n18lot_data_remocao = BC000410_n18lot_data_remocao[0] ;
         A19lot_portaria = BC000410_A19lot_portaria[0] ;
         n19lot_portaria = BC000410_n19lot_portaria[0] ;
         A4pes_id = BC000410_A4pes_id[0] ;
         A6unid_id = BC000410_A6unid_id[0] ;
         Z5lot_id = A5lot_id ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load044( ) ;
         if ( AnyError == 1 )
         {
            RcdFound4 = (short)(0) ;
            initializeNonKey044( ) ;
         }
         Gx_mode = sMode4 ;
      }
      else
      {
         RcdFound4 = (short)(0) ;
         initializeNonKey044( ) ;
         sMode4 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode4 ;
      }
      pr_default.close(8);
   }

   public void getEqualNoModal( )
   {
      getKey044( ) ;
      if ( RcdFound4 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
      }
      getByPrimaryKey( ) ;
   }

   public void insert_check( )
   {
      confirm_040( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency044( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC000411 */
         pr_default.execute(9, new Object[] {Integer.valueOf(A5lot_id)});
         if ( (pr_default.getStatus(9) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"lotacao"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(9) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z17lot_data_lotacao), GXutil.resetTime(BC000411_A17lot_data_lotacao[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z18lot_data_remocao), GXutil.resetTime(BC000411_A18lot_data_remocao[0])) ) || ( GXutil.strcmp(Z19lot_portaria, BC000411_A19lot_portaria[0]) != 0 ) || ( Z4pes_id != BC000411_A4pes_id[0] ) || ( Z6unid_id != BC000411_A6unid_id[0] ) )
         {
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
                  /* Using cursor BC000412 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n17lot_data_lotacao), A17lot_data_lotacao, Boolean.valueOf(n18lot_data_remocao), A18lot_data_remocao, Boolean.valueOf(n19lot_portaria), A19lot_portaria, Integer.valueOf(A4pes_id), Integer.valueOf(A6unid_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC000413 */
                  pr_default.execute(11);
                  A5lot_id = BC000413_A5lot_id[0] ;
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
                  /* Using cursor BC000414 */
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
               /* Using cursor BC000415 */
               pr_default.execute(13, new Object[] {Integer.valueOf(A5lot_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("lotacao");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
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
      endLevel044( ) ;
      Gx_mode = sMode4 ;
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
         pr_default.close(9);
      }
      if ( AnyError == 0 )
      {
         beforeComplete044( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart044( )
   {
      /* Using cursor BC000416 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A5lot_id)});
      RcdFound4 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A5lot_id = BC000416_A5lot_id[0] ;
         A17lot_data_lotacao = BC000416_A17lot_data_lotacao[0] ;
         n17lot_data_lotacao = BC000416_n17lot_data_lotacao[0] ;
         A18lot_data_remocao = BC000416_A18lot_data_remocao[0] ;
         n18lot_data_remocao = BC000416_n18lot_data_remocao[0] ;
         A19lot_portaria = BC000416_A19lot_portaria[0] ;
         n19lot_portaria = BC000416_n19lot_portaria[0] ;
         A4pes_id = BC000416_A4pes_id[0] ;
         A6unid_id = BC000416_A6unid_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext044( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound4 = (short)(0) ;
      scanKeyLoad044( ) ;
   }

   public void scanKeyLoad044( )
   {
      sMode4 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound4 = (short)(1) ;
         A5lot_id = BC000416_A5lot_id[0] ;
         A17lot_data_lotacao = BC000416_A17lot_data_lotacao[0] ;
         n17lot_data_lotacao = BC000416_n17lot_data_lotacao[0] ;
         A18lot_data_remocao = BC000416_A18lot_data_remocao[0] ;
         n18lot_data_remocao = BC000416_n18lot_data_remocao[0] ;
         A19lot_portaria = BC000416_A19lot_portaria[0] ;
         n19lot_portaria = BC000416_n19lot_portaria[0] ;
         A4pes_id = BC000416_A4pes_id[0] ;
         A6unid_id = BC000416_A6unid_id[0] ;
      }
      Gx_mode = sMode4 ;
   }

   public void scanKeyEnd044( )
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
   }

   public void send_integrity_lvl_hashes044( )
   {
   }

   public void addRow044( )
   {
      VarsToRow4( bclotacao) ;
   }

   public void readRow044( )
   {
      RowToVars4( bclotacao, 1) ;
   }

   public void initializeNonKey044( )
   {
      A4pes_id = 0 ;
      A6unid_id = 0 ;
      A17lot_data_lotacao = GXutil.nullDate() ;
      n17lot_data_lotacao = false ;
      A18lot_data_remocao = GXutil.nullDate() ;
      n18lot_data_remocao = false ;
      A19lot_portaria = "" ;
      n19lot_portaria = false ;
      Z17lot_data_lotacao = GXutil.nullDate() ;
      Z18lot_data_remocao = GXutil.nullDate() ;
      Z19lot_portaria = "" ;
      Z4pes_id = 0 ;
      Z6unid_id = 0 ;
   }

   public void initAll044( )
   {
      A5lot_id = 0 ;
      initializeNonKey044( ) ;
   }

   public void standaloneModalInsert( )
   {
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

   public void VarsToRow4( com.treinamento2.Sdtlotacao obj4 )
   {
      obj4.setgxTv_Sdtlotacao_Mode( Gx_mode );
      obj4.setgxTv_Sdtlotacao_Pes_id( A4pes_id );
      obj4.setgxTv_Sdtlotacao_Unid_id( A6unid_id );
      obj4.setgxTv_Sdtlotacao_Lot_data_lotacao( A17lot_data_lotacao );
      obj4.setgxTv_Sdtlotacao_Lot_data_remocao( A18lot_data_remocao );
      obj4.setgxTv_Sdtlotacao_Lot_portaria( A19lot_portaria );
      obj4.setgxTv_Sdtlotacao_Lot_id( A5lot_id );
      obj4.setgxTv_Sdtlotacao_Lot_id_Z( Z5lot_id );
      obj4.setgxTv_Sdtlotacao_Pes_id_Z( Z4pes_id );
      obj4.setgxTv_Sdtlotacao_Unid_id_Z( Z6unid_id );
      obj4.setgxTv_Sdtlotacao_Lot_data_lotacao_Z( Z17lot_data_lotacao );
      obj4.setgxTv_Sdtlotacao_Lot_data_remocao_Z( Z18lot_data_remocao );
      obj4.setgxTv_Sdtlotacao_Lot_portaria_Z( Z19lot_portaria );
      obj4.setgxTv_Sdtlotacao_Lot_data_lotacao_N( (byte)((byte)((n17lot_data_lotacao)?1:0)) );
      obj4.setgxTv_Sdtlotacao_Lot_data_remocao_N( (byte)((byte)((n18lot_data_remocao)?1:0)) );
      obj4.setgxTv_Sdtlotacao_Lot_portaria_N( (byte)((byte)((n19lot_portaria)?1:0)) );
      obj4.setgxTv_Sdtlotacao_Mode( Gx_mode );
   }

   public void KeyVarsToRow4( com.treinamento2.Sdtlotacao obj4 )
   {
      obj4.setgxTv_Sdtlotacao_Lot_id( A5lot_id );
   }

   public void RowToVars4( com.treinamento2.Sdtlotacao obj4 ,
                           int forceLoad )
   {
      Gx_mode = obj4.getgxTv_Sdtlotacao_Mode() ;
      A4pes_id = obj4.getgxTv_Sdtlotacao_Pes_id() ;
      A6unid_id = obj4.getgxTv_Sdtlotacao_Unid_id() ;
      A17lot_data_lotacao = obj4.getgxTv_Sdtlotacao_Lot_data_lotacao() ;
      n17lot_data_lotacao = false ;
      A18lot_data_remocao = obj4.getgxTv_Sdtlotacao_Lot_data_remocao() ;
      n18lot_data_remocao = false ;
      A19lot_portaria = obj4.getgxTv_Sdtlotacao_Lot_portaria() ;
      n19lot_portaria = false ;
      A5lot_id = obj4.getgxTv_Sdtlotacao_Lot_id() ;
      Z5lot_id = obj4.getgxTv_Sdtlotacao_Lot_id_Z() ;
      Z4pes_id = obj4.getgxTv_Sdtlotacao_Pes_id_Z() ;
      Z6unid_id = obj4.getgxTv_Sdtlotacao_Unid_id_Z() ;
      Z17lot_data_lotacao = obj4.getgxTv_Sdtlotacao_Lot_data_lotacao_Z() ;
      Z18lot_data_remocao = obj4.getgxTv_Sdtlotacao_Lot_data_remocao_Z() ;
      Z19lot_portaria = obj4.getgxTv_Sdtlotacao_Lot_portaria_Z() ;
      n17lot_data_lotacao = (boolean)((obj4.getgxTv_Sdtlotacao_Lot_data_lotacao_N()==0)?false:true) ;
      n18lot_data_remocao = (boolean)((obj4.getgxTv_Sdtlotacao_Lot_data_remocao_N()==0)?false:true) ;
      n19lot_portaria = (boolean)((obj4.getgxTv_Sdtlotacao_Lot_portaria_N()==0)?false:true) ;
      Gx_mode = obj4.getgxTv_Sdtlotacao_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A5lot_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey044( ) ;
      scanKeyStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z5lot_id = A5lot_id ;
      }
      zm044( -1) ;
      onLoadActions044( ) ;
      addRow044( ) ;
      scanKeyEnd044( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Load( )
   {
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      RowToVars4( bclotacao, 0) ;
      scanKeyStart044( ) ;
      if ( RcdFound4 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z5lot_id = A5lot_id ;
      }
      zm044( -1) ;
      onLoadActions044( ) ;
      addRow044( ) ;
      scanKeyEnd044( ) ;
      if ( RcdFound4 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey044( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert044( ) ;
      }
      else
      {
         if ( RcdFound4 == 1 )
         {
            if ( A5lot_id != Z5lot_id )
            {
               A5lot_id = Z5lot_id ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               update044( ) ;
            }
         }
         else
         {
            if ( isDlt( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               if ( A5lot_id != Z5lot_id )
               {
                  if ( isUpd( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert044( ) ;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert044( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void Save( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars4( bclotacao, 1) ;
      saveImpl( ) ;
      VarsToRow4( bclotacao) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars4( bclotacao, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert044( ) ;
      afterTrn( ) ;
      VarsToRow4( bclotacao) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow4( bclotacao) ;
      }
      else
      {
         com.treinamento2.Sdtlotacao auxBC = new com.treinamento2.Sdtlotacao( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A5lot_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bclotacao);
            auxBC.Save();
            bclotacao.copy(auxBC);
         }
         LclMsgLst = auxTrn.GetMessages() ;
         AnyError = (short)(auxTrn.Errors()) ;
         httpContext.GX_msglist = LclMsgLst ;
         if ( auxTrn.Errors() == 0 )
         {
            Gx_mode = auxTrn.GetMode() ;
            afterTrn( ) ;
         }
      }
   }

   public boolean Update( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars4( bclotacao, 1) ;
      updateImpl( ) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public boolean InsertOrUpdate( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars4( bclotacao, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert044( ) ;
      if ( AnyError == 1 )
      {
         if ( GXutil.strcmp(httpContext.GX_msglist.getItemValue((short)(1)), "DuplicatePrimaryKey") == 0 )
         {
            AnyError = (short)(0) ;
            httpContext.GX_msglist.removeAllItems();
            updateImpl( ) ;
         }
         else
         {
            VarsToRow4( bclotacao) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow4( bclotacao) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars4( bclotacao, 0) ;
      getKey044( ) ;
      if ( RcdFound4 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A5lot_id != Z5lot_id )
         {
            A5lot_id = Z5lot_id ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            update_check( ) ;
         }
      }
      else
      {
         if ( A5lot_id != Z5lot_id )
         {
            Gx_mode = "INS" ;
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               Gx_mode = "INS" ;
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "lotacao_bc");
      VarsToRow4( bclotacao) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public int Errors( )
   {
      if ( AnyError == 0 )
      {
         return 0 ;
      }
      return 1 ;
   }

   public com.genexus.internet.MsgList GetMessages( )
   {
      return LclMsgLst ;
   }

   public String GetMode( )
   {
      Gx_mode = bclotacao.getgxTv_Sdtlotacao_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bclotacao.setgxTv_Sdtlotacao_Mode( Gx_mode );
   }

   public void SetSDT( com.treinamento2.Sdtlotacao sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bclotacao )
      {
         bclotacao = sdt ;
         if ( GXutil.strcmp(bclotacao.getgxTv_Sdtlotacao_Mode(), "") == 0 )
         {
            bclotacao.setgxTv_Sdtlotacao_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow4( bclotacao) ;
         }
         else
         {
            RowToVars4( bclotacao, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bclotacao.getgxTv_Sdtlotacao_Mode(), "") == 0 )
         {
            bclotacao.setgxTv_Sdtlotacao_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars4( bclotacao, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public Sdtlotacao getlotacao_BC( )
   {
      return bclotacao ;
   }


   public void webExecute( )
   {
   }

   public boolean isMasterPage( )
   {
      return false;
   }

   protected void createObjects( )
   {
   }

   protected void Process( )
   {
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
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z17lot_data_lotacao = GXutil.nullDate() ;
      A17lot_data_lotacao = GXutil.nullDate() ;
      Z18lot_data_remocao = GXutil.nullDate() ;
      A18lot_data_remocao = GXutil.nullDate() ;
      Z19lot_portaria = "" ;
      A19lot_portaria = "" ;
      BC00046_A5lot_id = new int[1] ;
      BC00046_A17lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00046_n17lot_data_lotacao = new boolean[] {false} ;
      BC00046_A18lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00046_n18lot_data_remocao = new boolean[] {false} ;
      BC00046_A19lot_portaria = new String[] {""} ;
      BC00046_n19lot_portaria = new boolean[] {false} ;
      BC00046_A4pes_id = new int[1] ;
      BC00046_A6unid_id = new int[1] ;
      BC00047_A4pes_id = new int[1] ;
      BC00048_A6unid_id = new int[1] ;
      BC00049_A5lot_id = new int[1] ;
      BC000410_A5lot_id = new int[1] ;
      BC000410_A17lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000410_n17lot_data_lotacao = new boolean[] {false} ;
      BC000410_A18lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000410_n18lot_data_remocao = new boolean[] {false} ;
      BC000410_A19lot_portaria = new String[] {""} ;
      BC000410_n19lot_portaria = new boolean[] {false} ;
      BC000410_A4pes_id = new int[1] ;
      BC000410_A6unid_id = new int[1] ;
      sMode4 = "" ;
      BC000411_A5lot_id = new int[1] ;
      BC000411_A17lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000411_n17lot_data_lotacao = new boolean[] {false} ;
      BC000411_A18lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000411_n18lot_data_remocao = new boolean[] {false} ;
      BC000411_A19lot_portaria = new String[] {""} ;
      BC000411_n19lot_portaria = new boolean[] {false} ;
      BC000411_A4pes_id = new int[1] ;
      BC000411_A6unid_id = new int[1] ;
      BC000413_A5lot_id = new int[1] ;
      BC000416_A5lot_id = new int[1] ;
      BC000416_A17lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000416_n17lot_data_lotacao = new boolean[] {false} ;
      BC000416_A18lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000416_n18lot_data_remocao = new boolean[] {false} ;
      BC000416_A19lot_portaria = new String[] {""} ;
      BC000416_n19lot_portaria = new boolean[] {false} ;
      BC000416_A4pes_id = new int[1] ;
      BC000416_A6unid_id = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.lotacao_bc__default(),
         new Object[] {
             new Object[] {
            BC00042_A5lot_id, BC00042_A17lot_data_lotacao, BC00042_n17lot_data_lotacao, BC00042_A18lot_data_remocao, BC00042_n18lot_data_remocao, BC00042_A19lot_portaria, BC00042_n19lot_portaria, BC00042_A4pes_id, BC00042_A6unid_id
            }
            , new Object[] {
            BC00043_A5lot_id, BC00043_A17lot_data_lotacao, BC00043_n17lot_data_lotacao, BC00043_A18lot_data_remocao, BC00043_n18lot_data_remocao, BC00043_A19lot_portaria, BC00043_n19lot_portaria, BC00043_A4pes_id, BC00043_A6unid_id
            }
            , new Object[] {
            BC00044_A4pes_id
            }
            , new Object[] {
            BC00045_A6unid_id
            }
            , new Object[] {
            BC00046_A5lot_id, BC00046_A17lot_data_lotacao, BC00046_n17lot_data_lotacao, BC00046_A18lot_data_remocao, BC00046_n18lot_data_remocao, BC00046_A19lot_portaria, BC00046_n19lot_portaria, BC00046_A4pes_id, BC00046_A6unid_id
            }
            , new Object[] {
            BC00047_A4pes_id
            }
            , new Object[] {
            BC00048_A6unid_id
            }
            , new Object[] {
            BC00049_A5lot_id
            }
            , new Object[] {
            BC000410_A5lot_id, BC000410_A17lot_data_lotacao, BC000410_n17lot_data_lotacao, BC000410_A18lot_data_remocao, BC000410_n18lot_data_remocao, BC000410_A19lot_portaria, BC000410_n19lot_portaria, BC000410_A4pes_id, BC000410_A6unid_id
            }
            , new Object[] {
            BC000411_A5lot_id, BC000411_A17lot_data_lotacao, BC000411_n17lot_data_lotacao, BC000411_A18lot_data_remocao, BC000411_n18lot_data_remocao, BC000411_A19lot_portaria, BC000411_n19lot_portaria, BC000411_A4pes_id, BC000411_A6unid_id
            }
            , new Object[] {
            }
            , new Object[] {
            BC000413_A5lot_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000416_A5lot_id, BC000416_A17lot_data_lotacao, BC000416_n17lot_data_lotacao, BC000416_A18lot_data_remocao, BC000416_n18lot_data_remocao, BC000416_A19lot_portaria, BC000416_n19lot_portaria, BC000416_A4pes_id, BC000416_A6unid_id
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short RcdFound4 ;
   private int trnEnded ;
   private int Z5lot_id ;
   private int A5lot_id ;
   private int GX_JID ;
   private int Z4pes_id ;
   private int A4pes_id ;
   private int Z6unid_id ;
   private int A6unid_id ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode4 ;
   private java.util.Date Z17lot_data_lotacao ;
   private java.util.Date A17lot_data_lotacao ;
   private java.util.Date Z18lot_data_remocao ;
   private java.util.Date A18lot_data_remocao ;
   private boolean n17lot_data_lotacao ;
   private boolean n18lot_data_remocao ;
   private boolean n19lot_portaria ;
   private String Z19lot_portaria ;
   private String A19lot_portaria ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private int[] BC00046_A5lot_id ;
   private java.util.Date[] BC00046_A17lot_data_lotacao ;
   private boolean[] BC00046_n17lot_data_lotacao ;
   private java.util.Date[] BC00046_A18lot_data_remocao ;
   private boolean[] BC00046_n18lot_data_remocao ;
   private String[] BC00046_A19lot_portaria ;
   private boolean[] BC00046_n19lot_portaria ;
   private int[] BC00046_A4pes_id ;
   private int[] BC00046_A6unid_id ;
   private int[] BC00047_A4pes_id ;
   private int[] BC00048_A6unid_id ;
   private int[] BC00049_A5lot_id ;
   private int[] BC000410_A5lot_id ;
   private java.util.Date[] BC000410_A17lot_data_lotacao ;
   private boolean[] BC000410_n17lot_data_lotacao ;
   private java.util.Date[] BC000410_A18lot_data_remocao ;
   private boolean[] BC000410_n18lot_data_remocao ;
   private String[] BC000410_A19lot_portaria ;
   private boolean[] BC000410_n19lot_portaria ;
   private int[] BC000410_A4pes_id ;
   private int[] BC000410_A6unid_id ;
   private int[] BC000411_A5lot_id ;
   private java.util.Date[] BC000411_A17lot_data_lotacao ;
   private boolean[] BC000411_n17lot_data_lotacao ;
   private java.util.Date[] BC000411_A18lot_data_remocao ;
   private boolean[] BC000411_n18lot_data_remocao ;
   private String[] BC000411_A19lot_portaria ;
   private boolean[] BC000411_n19lot_portaria ;
   private int[] BC000411_A4pes_id ;
   private int[] BC000411_A6unid_id ;
   private int[] BC000413_A5lot_id ;
   private int[] BC000416_A5lot_id ;
   private java.util.Date[] BC000416_A17lot_data_lotacao ;
   private boolean[] BC000416_n17lot_data_lotacao ;
   private java.util.Date[] BC000416_A18lot_data_remocao ;
   private boolean[] BC000416_n18lot_data_remocao ;
   private String[] BC000416_A19lot_portaria ;
   private boolean[] BC000416_n19lot_portaria ;
   private int[] BC000416_A4pes_id ;
   private int[] BC000416_A6unid_id ;
   private com.treinamento2.Sdtlotacao bclotacao ;
   private int[] BC00042_A5lot_id ;
   private java.util.Date[] BC00042_A17lot_data_lotacao ;
   private java.util.Date[] BC00042_A18lot_data_remocao ;
   private String[] BC00042_A19lot_portaria ;
   private int[] BC00042_A4pes_id ;
   private int[] BC00042_A6unid_id ;
   private int[] BC00043_A5lot_id ;
   private java.util.Date[] BC00043_A17lot_data_lotacao ;
   private java.util.Date[] BC00043_A18lot_data_remocao ;
   private String[] BC00043_A19lot_portaria ;
   private int[] BC00043_A4pes_id ;
   private int[] BC00043_A6unid_id ;
   private int[] BC00044_A4pes_id ;
   private int[] BC00045_A6unid_id ;
   private boolean[] BC00042_n17lot_data_lotacao ;
   private boolean[] BC00042_n18lot_data_remocao ;
   private boolean[] BC00042_n19lot_portaria ;
   private boolean[] BC00043_n17lot_data_lotacao ;
   private boolean[] BC00043_n18lot_data_remocao ;
   private boolean[] BC00043_n19lot_portaria ;
}

final  class lotacao_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00042", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ?  FOR UPDATE OF lotacao",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00043", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00044", "SELECT pes_id FROM Pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00045", "SELECT unid_id FROM Unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00046", "SELECT TM1.lot_id, TM1.lot_data_lotacao, TM1.lot_data_remocao, TM1.lot_portaria, TM1.pes_id, TM1.unid_id FROM lotacao TM1 WHERE TM1.lot_id = ? ORDER BY TM1.lot_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00047", "SELECT pes_id FROM Pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00048", "SELECT unid_id FROM Unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00049", "SELECT lot_id FROM lotacao WHERE lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000410", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000411", "SELECT lot_id, lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id FROM lotacao WHERE lot_id = ?  FOR UPDATE OF lotacao",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000412", "SAVEPOINT gxupdate;INSERT INTO lotacao(lot_data_lotacao, lot_data_remocao, lot_portaria, pes_id, unid_id) VALUES(?, ?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000413", "SELECT currval('lot_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000414", "SAVEPOINT gxupdate;UPDATE lotacao SET lot_data_lotacao=?, lot_data_remocao=?, lot_portaria=?, pes_id=?, unid_id=?  WHERE lot_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000415", "SAVEPOINT gxupdate;DELETE FROM lotacao  WHERE lot_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000416", "SELECT TM1.lot_id, TM1.lot_data_lotacao, TM1.lot_data_remocao, TM1.lot_portaria, TM1.pes_id, TM1.unid_id FROM lotacao TM1 WHERE TM1.lot_id = ? ORDER BY TM1.lot_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               return;
            case 9 :
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
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 14 :
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
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

