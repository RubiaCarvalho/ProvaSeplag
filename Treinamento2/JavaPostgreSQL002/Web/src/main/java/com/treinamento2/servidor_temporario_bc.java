package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class servidor_temporario_bc extends GXWebProcedure implements IGxSilentTrn
{
   public servidor_temporario_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public servidor_temporario_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( servidor_temporario_bc.class ));
   }

   public servidor_temporario_bc( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow078( ) ;
      standaloneNotModal( ) ;
      initializeNonKey078( ) ;
      standaloneModal( ) ;
      addRow078( ) ;
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
            Z31st_pes_id = A31st_pes_id ;
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

   public void confirm_070( )
   {
      beforeValidate078( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls078( ) ;
         }
         else
         {
            checkExtendedTable078( ) ;
            if ( AnyError == 0 )
            {
               zm078( 2) ;
            }
            closeExtendedTableCursors078( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm078( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z25st_data_admissao = A25st_data_admissao ;
         Z26st_data_demissao = A26st_data_demissao ;
      }
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
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
   }

   public void standaloneModal( )
   {
   }

   public void load078( )
   {
      /* Using cursor BC00075 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A31st_pes_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A25st_data_admissao = BC00075_A25st_data_admissao[0] ;
         A26st_data_demissao = BC00075_A26st_data_demissao[0] ;
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
      standaloneModal( ) ;
      /* Using cursor BC00076 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A31st_pes_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'servidor_temporario'.", "ForeignKeyNotFound", 1, "ST_PES_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors078( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void getKey078( )
   {
      /* Using cursor BC00077 */
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
      /* Using cursor BC00078 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A31st_pes_id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm078( 1) ;
         RcdFound8 = (short)(1) ;
         A25st_data_admissao = BC00078_A25st_data_admissao[0] ;
         A26st_data_demissao = BC00078_A26st_data_demissao[0] ;
         A31st_pes_id = BC00078_A31st_pes_id[0] ;
         Z31st_pes_id = A31st_pes_id ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load078( ) ;
         if ( AnyError == 1 )
         {
            RcdFound8 = (short)(0) ;
            initializeNonKey078( ) ;
         }
         Gx_mode = sMode8 ;
      }
      else
      {
         RcdFound8 = (short)(0) ;
         initializeNonKey078( ) ;
         sMode8 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode8 ;
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey078( ) ;
      if ( RcdFound8 == 0 )
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
      confirm_070( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency078( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00079 */
         pr_default.execute(7, new Object[] {Integer.valueOf(A31st_pes_id)});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"servidor_temporario"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z25st_data_admissao), GXutil.resetTime(BC00079_A25st_data_admissao[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z26st_data_demissao), GXutil.resetTime(BC00079_A26st_data_demissao[0])) ) )
         {
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
                  /* Using cursor BC000710 */
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
                  /* Using cursor BC000711 */
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
               /* Using cursor BC000712 */
               pr_default.execute(10, new Object[] {Integer.valueOf(A31st_pes_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_temporario");
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
      sMode8 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel078( ) ;
      Gx_mode = sMode8 ;
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
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete078( ) ;
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

   public void scanKeyStart078( )
   {
      /* Using cursor BC000713 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A31st_pes_id)});
      RcdFound8 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A25st_data_admissao = BC000713_A25st_data_admissao[0] ;
         A26st_data_demissao = BC000713_A26st_data_demissao[0] ;
         A31st_pes_id = BC000713_A31st_pes_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext078( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound8 = (short)(0) ;
      scanKeyLoad078( ) ;
   }

   public void scanKeyLoad078( )
   {
      sMode8 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound8 = (short)(1) ;
         A25st_data_admissao = BC000713_A25st_data_admissao[0] ;
         A26st_data_demissao = BC000713_A26st_data_demissao[0] ;
         A31st_pes_id = BC000713_A31st_pes_id[0] ;
      }
      Gx_mode = sMode8 ;
   }

   public void scanKeyEnd078( )
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
   }

   public void send_integrity_lvl_hashes078( )
   {
   }

   public void addRow078( )
   {
      VarsToRow8( bcservidor_temporario) ;
   }

   public void readRow078( )
   {
      RowToVars8( bcservidor_temporario, 1) ;
   }

   public void initializeNonKey078( )
   {
      A25st_data_admissao = GXutil.nullDate() ;
      A26st_data_demissao = GXutil.nullDate() ;
      Z25st_data_admissao = GXutil.nullDate() ;
      Z26st_data_demissao = GXutil.nullDate() ;
   }

   public void initAll078( )
   {
      A31st_pes_id = 0 ;
      initializeNonKey078( ) ;
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

   public void VarsToRow8( com.treinamento2.Sdtservidor_temporario obj8 )
   {
      obj8.setgxTv_Sdtservidor_temporario_Mode( Gx_mode );
      obj8.setgxTv_Sdtservidor_temporario_St_data_admissao( A25st_data_admissao );
      obj8.setgxTv_Sdtservidor_temporario_St_data_demissao( A26st_data_demissao );
      obj8.setgxTv_Sdtservidor_temporario_St_pes_id( A31st_pes_id );
      obj8.setgxTv_Sdtservidor_temporario_St_pes_id_Z( Z31st_pes_id );
      obj8.setgxTv_Sdtservidor_temporario_St_data_admissao_Z( Z25st_data_admissao );
      obj8.setgxTv_Sdtservidor_temporario_St_data_demissao_Z( Z26st_data_demissao );
      obj8.setgxTv_Sdtservidor_temporario_Mode( Gx_mode );
   }

   public void KeyVarsToRow8( com.treinamento2.Sdtservidor_temporario obj8 )
   {
      obj8.setgxTv_Sdtservidor_temporario_St_pes_id( A31st_pes_id );
   }

   public void RowToVars8( com.treinamento2.Sdtservidor_temporario obj8 ,
                           int forceLoad )
   {
      Gx_mode = obj8.getgxTv_Sdtservidor_temporario_Mode() ;
      A25st_data_admissao = obj8.getgxTv_Sdtservidor_temporario_St_data_admissao() ;
      A26st_data_demissao = obj8.getgxTv_Sdtservidor_temporario_St_data_demissao() ;
      A31st_pes_id = obj8.getgxTv_Sdtservidor_temporario_St_pes_id() ;
      Z31st_pes_id = obj8.getgxTv_Sdtservidor_temporario_St_pes_id_Z() ;
      Z25st_data_admissao = obj8.getgxTv_Sdtservidor_temporario_St_data_admissao_Z() ;
      Z26st_data_demissao = obj8.getgxTv_Sdtservidor_temporario_St_data_demissao_Z() ;
      Gx_mode = obj8.getgxTv_Sdtservidor_temporario_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A31st_pes_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey078( ) ;
      scanKeyStart078( ) ;
      if ( RcdFound8 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z31st_pes_id = A31st_pes_id ;
      }
      zm078( -1) ;
      onLoadActions078( ) ;
      addRow078( ) ;
      scanKeyEnd078( ) ;
      if ( RcdFound8 == 0 )
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
      RowToVars8( bcservidor_temporario, 0) ;
      scanKeyStart078( ) ;
      if ( RcdFound8 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z31st_pes_id = A31st_pes_id ;
      }
      zm078( -1) ;
      onLoadActions078( ) ;
      addRow078( ) ;
      scanKeyEnd078( ) ;
      if ( RcdFound8 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey078( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert078( ) ;
      }
      else
      {
         if ( RcdFound8 == 1 )
         {
            if ( A31st_pes_id != Z31st_pes_id )
            {
               A31st_pes_id = Z31st_pes_id ;
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
               update078( ) ;
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
               if ( A31st_pes_id != Z31st_pes_id )
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
                     insert078( ) ;
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
                     insert078( ) ;
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
      RowToVars8( bcservidor_temporario, 1) ;
      saveImpl( ) ;
      VarsToRow8( bcservidor_temporario) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars8( bcservidor_temporario, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert078( ) ;
      afterTrn( ) ;
      VarsToRow8( bcservidor_temporario) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow8( bcservidor_temporario) ;
      }
      else
      {
         com.treinamento2.Sdtservidor_temporario auxBC = new com.treinamento2.Sdtservidor_temporario( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A31st_pes_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcservidor_temporario);
            auxBC.Save();
            bcservidor_temporario.copy(auxBC);
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
      RowToVars8( bcservidor_temporario, 1) ;
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
      RowToVars8( bcservidor_temporario, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert078( ) ;
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
            VarsToRow8( bcservidor_temporario) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow8( bcservidor_temporario) ;
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
      RowToVars8( bcservidor_temporario, 0) ;
      getKey078( ) ;
      if ( RcdFound8 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A31st_pes_id != Z31st_pes_id )
         {
            A31st_pes_id = Z31st_pes_id ;
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
         if ( A31st_pes_id != Z31st_pes_id )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "servidor_temporario_bc");
      VarsToRow8( bcservidor_temporario) ;
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
      Gx_mode = bcservidor_temporario.getgxTv_Sdtservidor_temporario_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcservidor_temporario.setgxTv_Sdtservidor_temporario_Mode( Gx_mode );
   }

   public void SetSDT( com.treinamento2.Sdtservidor_temporario sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcservidor_temporario )
      {
         bcservidor_temporario = sdt ;
         if ( GXutil.strcmp(bcservidor_temporario.getgxTv_Sdtservidor_temporario_Mode(), "") == 0 )
         {
            bcservidor_temporario.setgxTv_Sdtservidor_temporario_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow8( bcservidor_temporario) ;
         }
         else
         {
            RowToVars8( bcservidor_temporario, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcservidor_temporario.getgxTv_Sdtservidor_temporario_Mode(), "") == 0 )
         {
            bcservidor_temporario.setgxTv_Sdtservidor_temporario_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars8( bcservidor_temporario, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public Sdtservidor_temporario getservidor_temporario_BC( )
   {
      return bcservidor_temporario ;
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
      Z25st_data_admissao = GXutil.nullDate() ;
      A25st_data_admissao = GXutil.nullDate() ;
      Z26st_data_demissao = GXutil.nullDate() ;
      A26st_data_demissao = GXutil.nullDate() ;
      BC00075_A25st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00075_A26st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00075_A31st_pes_id = new int[1] ;
      BC00076_A31st_pes_id = new int[1] ;
      BC00077_A31st_pes_id = new int[1] ;
      BC00078_A25st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00078_A26st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00078_A31st_pes_id = new int[1] ;
      sMode8 = "" ;
      BC00079_A25st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00079_A26st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC00079_A31st_pes_id = new int[1] ;
      BC000713_A25st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000713_A26st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      BC000713_A31st_pes_id = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.servidor_temporario_bc__default(),
         new Object[] {
             new Object[] {
            BC00072_A25st_data_admissao, BC00072_A26st_data_demissao, BC00072_A31st_pes_id
            }
            , new Object[] {
            BC00073_A25st_data_admissao, BC00073_A26st_data_demissao, BC00073_A31st_pes_id
            }
            , new Object[] {
            BC00074_A31st_pes_id
            }
            , new Object[] {
            BC00075_A25st_data_admissao, BC00075_A26st_data_demissao, BC00075_A31st_pes_id
            }
            , new Object[] {
            BC00076_A31st_pes_id
            }
            , new Object[] {
            BC00077_A31st_pes_id
            }
            , new Object[] {
            BC00078_A25st_data_admissao, BC00078_A26st_data_demissao, BC00078_A31st_pes_id
            }
            , new Object[] {
            BC00079_A25st_data_admissao, BC00079_A26st_data_demissao, BC00079_A31st_pes_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000713_A25st_data_admissao, BC000713_A26st_data_demissao, BC000713_A31st_pes_id
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short RcdFound8 ;
   private int trnEnded ;
   private int Z31st_pes_id ;
   private int A31st_pes_id ;
   private int GX_JID ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode8 ;
   private java.util.Date Z25st_data_admissao ;
   private java.util.Date A25st_data_admissao ;
   private java.util.Date Z26st_data_demissao ;
   private java.util.Date A26st_data_demissao ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] BC00075_A25st_data_admissao ;
   private java.util.Date[] BC00075_A26st_data_demissao ;
   private int[] BC00075_A31st_pes_id ;
   private int[] BC00076_A31st_pes_id ;
   private int[] BC00077_A31st_pes_id ;
   private java.util.Date[] BC00078_A25st_data_admissao ;
   private java.util.Date[] BC00078_A26st_data_demissao ;
   private int[] BC00078_A31st_pes_id ;
   private java.util.Date[] BC00079_A25st_data_admissao ;
   private java.util.Date[] BC00079_A26st_data_demissao ;
   private int[] BC00079_A31st_pes_id ;
   private java.util.Date[] BC000713_A25st_data_admissao ;
   private java.util.Date[] BC000713_A26st_data_demissao ;
   private int[] BC000713_A31st_pes_id ;
   private com.treinamento2.Sdtservidor_temporario bcservidor_temporario ;
   private java.util.Date[] BC00072_A25st_data_admissao ;
   private java.util.Date[] BC00072_A26st_data_demissao ;
   private int[] BC00072_A31st_pes_id ;
   private java.util.Date[] BC00073_A25st_data_admissao ;
   private java.util.Date[] BC00073_A26st_data_demissao ;
   private int[] BC00073_A31st_pes_id ;
   private int[] BC00074_A31st_pes_id ;
}

final  class servidor_temporario_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00072", "SELECT st_data_admissao, st_data_demissao, st_pes_id FROM servidor_temporario WHERE st_pes_id = ?  FOR UPDATE OF servidor_temporario",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00073", "SELECT st_data_admissao, st_data_demissao, st_pes_id FROM servidor_temporario WHERE st_pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00074", "SELECT pes_id AS st_pes_id FROM Pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00075", "SELECT TM1.st_data_admissao, TM1.st_data_demissao, TM1.st_pes_id AS st_pes_id FROM servidor_temporario TM1 WHERE TM1.st_pes_id = ? ORDER BY TM1.st_pes_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00076", "SELECT pes_id AS st_pes_id FROM Pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00077", "SELECT st_pes_id FROM servidor_temporario WHERE st_pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00078", "SELECT st_data_admissao, st_data_demissao, st_pes_id FROM servidor_temporario WHERE st_pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00079", "SELECT st_data_admissao, st_data_demissao, st_pes_id FROM servidor_temporario WHERE st_pes_id = ?  FOR UPDATE OF servidor_temporario",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000710", "SAVEPOINT gxupdate;INSERT INTO servidor_temporario(st_data_admissao, st_data_demissao, st_pes_id) VALUES(?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000711", "SAVEPOINT gxupdate;UPDATE servidor_temporario SET st_data_admissao=?, st_data_demissao=?  WHERE st_pes_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000712", "SAVEPOINT gxupdate;DELETE FROM servidor_temporario  WHERE st_pes_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000713", "SELECT TM1.st_data_admissao, TM1.st_data_demissao, TM1.st_pes_id AS st_pes_id FROM servidor_temporario TM1 WHERE TM1.st_pes_id = ? ORDER BY TM1.st_pes_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

