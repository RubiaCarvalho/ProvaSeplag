package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class unidade_bc extends GXWebProcedure implements IGxSilentTrn
{
   public unidade_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public unidade_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( unidade_bc.class ));
   }

   public unidade_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow086( ) ;
      standaloneNotModal( ) ;
      initializeNonKey086( ) ;
      standaloneModal( ) ;
      addRow086( ) ;
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
            Z6unid_id = A6unid_id ;
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

   public void confirm_080( )
   {
      beforeValidate086( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls086( ) ;
         }
         else
         {
            checkExtendedTable086( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors086( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm086( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z7unid_nome = A7unid_nome ;
         Z28unid_sigla = A28unid_sigla ;
      }
      if ( GX_JID == -1 )
      {
         Z6unid_id = A6unid_id ;
         Z7unid_nome = A7unid_nome ;
         Z28unid_sigla = A28unid_sigla ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load086( )
   {
      /* Using cursor BC00084 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A6unid_id)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A7unid_nome = BC00084_A7unid_nome[0] ;
         n7unid_nome = BC00084_n7unid_nome[0] ;
         A28unid_sigla = BC00084_A28unid_sigla[0] ;
         n28unid_sigla = BC00084_n28unid_sigla[0] ;
         zm086( -1) ;
      }
      pr_default.close(2);
      onLoadActions086( ) ;
   }

   public void onLoadActions086( )
   {
   }

   public void checkExtendedTable086( )
   {
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors086( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey086( )
   {
      /* Using cursor BC00085 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A6unid_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound6 = (short)(1) ;
      }
      else
      {
         RcdFound6 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00086 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A6unid_id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm086( 1) ;
         RcdFound6 = (short)(1) ;
         A6unid_id = BC00086_A6unid_id[0] ;
         A7unid_nome = BC00086_A7unid_nome[0] ;
         n7unid_nome = BC00086_n7unid_nome[0] ;
         A28unid_sigla = BC00086_A28unid_sigla[0] ;
         n28unid_sigla = BC00086_n28unid_sigla[0] ;
         Z6unid_id = A6unid_id ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load086( ) ;
         if ( AnyError == 1 )
         {
            RcdFound6 = (short)(0) ;
            initializeNonKey086( ) ;
         }
         Gx_mode = sMode6 ;
      }
      else
      {
         RcdFound6 = (short)(0) ;
         initializeNonKey086( ) ;
         sMode6 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode6 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey086( ) ;
      if ( RcdFound6 == 0 )
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
      confirm_080( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency086( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00087 */
         pr_default.execute(5, new Object[] {Integer.valueOf(A6unid_id)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Unidade"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z7unid_nome, BC00087_A7unid_nome[0]) != 0 ) || ( GXutil.strcmp(Z28unid_sigla, BC00087_A28unid_sigla[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Unidade"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert086( )
   {
      beforeValidate086( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable086( ) ;
      }
      if ( AnyError == 0 )
      {
         zm086( 0) ;
         checkOptimisticConcurrency086( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm086( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert086( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00088 */
                  pr_default.execute(6, new Object[] {Boolean.valueOf(n7unid_nome), A7unid_nome, Boolean.valueOf(n28unid_sigla), A28unid_sigla});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC00089 */
                  pr_default.execute(7);
                  A6unid_id = BC00089_A6unid_id[0] ;
                  pr_default.close(7);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Unidade");
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
            load086( ) ;
         }
         endLevel086( ) ;
      }
      closeExtendedTableCursors086( ) ;
   }

   public void update086( )
   {
      beforeValidate086( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable086( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency086( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm086( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate086( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000810 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n7unid_nome), A7unid_nome, Boolean.valueOf(n28unid_sigla), A28unid_sigla, Integer.valueOf(A6unid_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Unidade");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Unidade"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate086( ) ;
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
         endLevel086( ) ;
      }
      closeExtendedTableCursors086( ) ;
   }

   public void deferredUpdate086( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate086( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency086( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls086( ) ;
         afterConfirm086( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete086( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000811 */
               pr_default.execute(9, new Object[] {Integer.valueOf(A6unid_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Unidade");
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
      sMode6 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel086( ) ;
      Gx_mode = sMode6 ;
   }

   public void onDeleteControls086( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor BC000812 */
         pr_default.execute(10, new Object[] {Integer.valueOf(A6unid_id)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"unidade_endereco"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor BC000813 */
         pr_default.execute(11, new Object[] {Integer.valueOf(A6unid_id)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"lotacao"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void endLevel086( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete086( ) ;
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

   public void scanKeyStart086( )
   {
      /* Using cursor BC000814 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A6unid_id)});
      RcdFound6 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A6unid_id = BC000814_A6unid_id[0] ;
         A7unid_nome = BC000814_A7unid_nome[0] ;
         n7unid_nome = BC000814_n7unid_nome[0] ;
         A28unid_sigla = BC000814_A28unid_sigla[0] ;
         n28unid_sigla = BC000814_n28unid_sigla[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext086( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound6 = (short)(0) ;
      scanKeyLoad086( ) ;
   }

   public void scanKeyLoad086( )
   {
      sMode6 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound6 = (short)(1) ;
         A6unid_id = BC000814_A6unid_id[0] ;
         A7unid_nome = BC000814_A7unid_nome[0] ;
         n7unid_nome = BC000814_n7unid_nome[0] ;
         A28unid_sigla = BC000814_A28unid_sigla[0] ;
         n28unid_sigla = BC000814_n28unid_sigla[0] ;
      }
      Gx_mode = sMode6 ;
   }

   public void scanKeyEnd086( )
   {
      pr_default.close(12);
   }

   public void afterConfirm086( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert086( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate086( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete086( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete086( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate086( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes086( )
   {
   }

   public void send_integrity_lvl_hashes086( )
   {
   }

   public void addRow086( )
   {
      VarsToRow6( bcUnidade) ;
   }

   public void readRow086( )
   {
      RowToVars6( bcUnidade, 1) ;
   }

   public void initializeNonKey086( )
   {
      A7unid_nome = "" ;
      n7unid_nome = false ;
      A28unid_sigla = "" ;
      n28unid_sigla = false ;
      Z7unid_nome = "" ;
      Z28unid_sigla = "" ;
   }

   public void initAll086( )
   {
      A6unid_id = 0 ;
      initializeNonKey086( ) ;
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

   public void VarsToRow6( com.treinamento2.SdtUnidade obj6 )
   {
      obj6.setgxTv_SdtUnidade_Mode( Gx_mode );
      obj6.setgxTv_SdtUnidade_Unid_nome( A7unid_nome );
      obj6.setgxTv_SdtUnidade_Unid_sigla( A28unid_sigla );
      obj6.setgxTv_SdtUnidade_Unid_id( A6unid_id );
      obj6.setgxTv_SdtUnidade_Unid_id_Z( Z6unid_id );
      obj6.setgxTv_SdtUnidade_Unid_nome_Z( Z7unid_nome );
      obj6.setgxTv_SdtUnidade_Unid_sigla_Z( Z28unid_sigla );
      obj6.setgxTv_SdtUnidade_Unid_nome_N( (byte)((byte)((n7unid_nome)?1:0)) );
      obj6.setgxTv_SdtUnidade_Unid_sigla_N( (byte)((byte)((n28unid_sigla)?1:0)) );
      obj6.setgxTv_SdtUnidade_Mode( Gx_mode );
   }

   public void KeyVarsToRow6( com.treinamento2.SdtUnidade obj6 )
   {
      obj6.setgxTv_SdtUnidade_Unid_id( A6unid_id );
   }

   public void RowToVars6( com.treinamento2.SdtUnidade obj6 ,
                           int forceLoad )
   {
      Gx_mode = obj6.getgxTv_SdtUnidade_Mode() ;
      A7unid_nome = obj6.getgxTv_SdtUnidade_Unid_nome() ;
      n7unid_nome = false ;
      A28unid_sigla = obj6.getgxTv_SdtUnidade_Unid_sigla() ;
      n28unid_sigla = false ;
      A6unid_id = obj6.getgxTv_SdtUnidade_Unid_id() ;
      Z6unid_id = obj6.getgxTv_SdtUnidade_Unid_id_Z() ;
      Z7unid_nome = obj6.getgxTv_SdtUnidade_Unid_nome_Z() ;
      Z28unid_sigla = obj6.getgxTv_SdtUnidade_Unid_sigla_Z() ;
      n7unid_nome = (boolean)((obj6.getgxTv_SdtUnidade_Unid_nome_N()==0)?false:true) ;
      n28unid_sigla = (boolean)((obj6.getgxTv_SdtUnidade_Unid_sigla_N()==0)?false:true) ;
      Gx_mode = obj6.getgxTv_SdtUnidade_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A6unid_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey086( ) ;
      scanKeyStart086( ) ;
      if ( RcdFound6 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z6unid_id = A6unid_id ;
      }
      zm086( -1) ;
      onLoadActions086( ) ;
      addRow086( ) ;
      scanKeyEnd086( ) ;
      if ( RcdFound6 == 0 )
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
      RowToVars6( bcUnidade, 0) ;
      scanKeyStart086( ) ;
      if ( RcdFound6 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z6unid_id = A6unid_id ;
      }
      zm086( -1) ;
      onLoadActions086( ) ;
      addRow086( ) ;
      scanKeyEnd086( ) ;
      if ( RcdFound6 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey086( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert086( ) ;
      }
      else
      {
         if ( RcdFound6 == 1 )
         {
            if ( A6unid_id != Z6unid_id )
            {
               A6unid_id = Z6unid_id ;
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
               update086( ) ;
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
               if ( A6unid_id != Z6unid_id )
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
                     insert086( ) ;
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
                     insert086( ) ;
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
      RowToVars6( bcUnidade, 1) ;
      saveImpl( ) ;
      VarsToRow6( bcUnidade) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars6( bcUnidade, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert086( ) ;
      afterTrn( ) ;
      VarsToRow6( bcUnidade) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow6( bcUnidade) ;
      }
      else
      {
         com.treinamento2.SdtUnidade auxBC = new com.treinamento2.SdtUnidade( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A6unid_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcUnidade);
            auxBC.Save();
            bcUnidade.copy(auxBC);
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
      RowToVars6( bcUnidade, 1) ;
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
      RowToVars6( bcUnidade, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert086( ) ;
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
            VarsToRow6( bcUnidade) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow6( bcUnidade) ;
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
      RowToVars6( bcUnidade, 0) ;
      getKey086( ) ;
      if ( RcdFound6 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A6unid_id != Z6unid_id )
         {
            A6unid_id = Z6unid_id ;
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
         if ( A6unid_id != Z6unid_id )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "unidade_bc");
      VarsToRow6( bcUnidade) ;
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
      Gx_mode = bcUnidade.getgxTv_SdtUnidade_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcUnidade.setgxTv_SdtUnidade_Mode( Gx_mode );
   }

   public void SetSDT( com.treinamento2.SdtUnidade sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcUnidade )
      {
         bcUnidade = sdt ;
         if ( GXutil.strcmp(bcUnidade.getgxTv_SdtUnidade_Mode(), "") == 0 )
         {
            bcUnidade.setgxTv_SdtUnidade_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow6( bcUnidade) ;
         }
         else
         {
            RowToVars6( bcUnidade, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcUnidade.getgxTv_SdtUnidade_Mode(), "") == 0 )
         {
            bcUnidade.setgxTv_SdtUnidade_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars6( bcUnidade, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public SdtUnidade getUnidade_BC( )
   {
      return bcUnidade ;
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
      Z7unid_nome = "" ;
      A7unid_nome = "" ;
      Z28unid_sigla = "" ;
      A28unid_sigla = "" ;
      BC00084_A6unid_id = new int[1] ;
      BC00084_A7unid_nome = new String[] {""} ;
      BC00084_n7unid_nome = new boolean[] {false} ;
      BC00084_A28unid_sigla = new String[] {""} ;
      BC00084_n28unid_sigla = new boolean[] {false} ;
      BC00085_A6unid_id = new int[1] ;
      BC00086_A6unid_id = new int[1] ;
      BC00086_A7unid_nome = new String[] {""} ;
      BC00086_n7unid_nome = new boolean[] {false} ;
      BC00086_A28unid_sigla = new String[] {""} ;
      BC00086_n28unid_sigla = new boolean[] {false} ;
      sMode6 = "" ;
      BC00087_A6unid_id = new int[1] ;
      BC00087_A7unid_nome = new String[] {""} ;
      BC00087_n7unid_nome = new boolean[] {false} ;
      BC00087_A28unid_sigla = new String[] {""} ;
      BC00087_n28unid_sigla = new boolean[] {false} ;
      BC00089_A6unid_id = new int[1] ;
      BC000812_A33unidade_id = new int[1] ;
      BC000813_A5lot_id = new int[1] ;
      BC000814_A6unid_id = new int[1] ;
      BC000814_A7unid_nome = new String[] {""} ;
      BC000814_n7unid_nome = new boolean[] {false} ;
      BC000814_A28unid_sigla = new String[] {""} ;
      BC000814_n28unid_sigla = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.unidade_bc__default(),
         new Object[] {
             new Object[] {
            BC00082_A6unid_id, BC00082_A7unid_nome, BC00082_n7unid_nome, BC00082_A28unid_sigla, BC00082_n28unid_sigla
            }
            , new Object[] {
            BC00083_A6unid_id, BC00083_A7unid_nome, BC00083_n7unid_nome, BC00083_A28unid_sigla, BC00083_n28unid_sigla
            }
            , new Object[] {
            BC00084_A6unid_id, BC00084_A7unid_nome, BC00084_n7unid_nome, BC00084_A28unid_sigla, BC00084_n28unid_sigla
            }
            , new Object[] {
            BC00085_A6unid_id
            }
            , new Object[] {
            BC00086_A6unid_id, BC00086_A7unid_nome, BC00086_n7unid_nome, BC00086_A28unid_sigla, BC00086_n28unid_sigla
            }
            , new Object[] {
            BC00087_A6unid_id, BC00087_A7unid_nome, BC00087_n7unid_nome, BC00087_A28unid_sigla, BC00087_n28unid_sigla
            }
            , new Object[] {
            }
            , new Object[] {
            BC00089_A6unid_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000812_A33unidade_id
            }
            , new Object[] {
            BC000813_A5lot_id
            }
            , new Object[] {
            BC000814_A6unid_id, BC000814_A7unid_nome, BC000814_n7unid_nome, BC000814_A28unid_sigla, BC000814_n28unid_sigla
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short RcdFound6 ;
   private int trnEnded ;
   private int Z6unid_id ;
   private int A6unid_id ;
   private int GX_JID ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode6 ;
   private boolean n7unid_nome ;
   private boolean n28unid_sigla ;
   private String Z7unid_nome ;
   private String A7unid_nome ;
   private String Z28unid_sigla ;
   private String A28unid_sigla ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private int[] BC00084_A6unid_id ;
   private String[] BC00084_A7unid_nome ;
   private boolean[] BC00084_n7unid_nome ;
   private String[] BC00084_A28unid_sigla ;
   private boolean[] BC00084_n28unid_sigla ;
   private int[] BC00085_A6unid_id ;
   private int[] BC00086_A6unid_id ;
   private String[] BC00086_A7unid_nome ;
   private boolean[] BC00086_n7unid_nome ;
   private String[] BC00086_A28unid_sigla ;
   private boolean[] BC00086_n28unid_sigla ;
   private int[] BC00087_A6unid_id ;
   private String[] BC00087_A7unid_nome ;
   private boolean[] BC00087_n7unid_nome ;
   private String[] BC00087_A28unid_sigla ;
   private boolean[] BC00087_n28unid_sigla ;
   private int[] BC00089_A6unid_id ;
   private int[] BC000812_A33unidade_id ;
   private int[] BC000813_A5lot_id ;
   private int[] BC000814_A6unid_id ;
   private String[] BC000814_A7unid_nome ;
   private boolean[] BC000814_n7unid_nome ;
   private String[] BC000814_A28unid_sigla ;
   private boolean[] BC000814_n28unid_sigla ;
   private com.treinamento2.SdtUnidade bcUnidade ;
   private int[] BC00082_A6unid_id ;
   private String[] BC00082_A7unid_nome ;
   private String[] BC00082_A28unid_sigla ;
   private int[] BC00083_A6unid_id ;
   private String[] BC00083_A7unid_nome ;
   private String[] BC00083_A28unid_sigla ;
   private boolean[] BC00082_n7unid_nome ;
   private boolean[] BC00082_n28unid_sigla ;
   private boolean[] BC00083_n7unid_nome ;
   private boolean[] BC00083_n28unid_sigla ;
}

final  class unidade_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00082", "SELECT unid_id, unid_nome, unid_sigla FROM Unidade WHERE unid_id = ?  FOR UPDATE OF Unidade",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00083", "SELECT unid_id, unid_nome, unid_sigla FROM Unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00084", "SELECT TM1.unid_id, TM1.unid_nome, TM1.unid_sigla FROM Unidade TM1 WHERE TM1.unid_id = ? ORDER BY TM1.unid_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00085", "SELECT unid_id FROM Unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00086", "SELECT unid_id, unid_nome, unid_sigla FROM Unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00087", "SELECT unid_id, unid_nome, unid_sigla FROM Unidade WHERE unid_id = ?  FOR UPDATE OF Unidade",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC00088", "SAVEPOINT gxupdate;INSERT INTO Unidade(unid_nome, unid_sigla) VALUES(?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC00089", "SELECT currval('unid_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000810", "SAVEPOINT gxupdate;UPDATE Unidade SET unid_nome=?, unid_sigla=?  WHERE unid_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000811", "SAVEPOINT gxupdate;DELETE FROM Unidade  WHERE unid_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000812", "SELECT unidade_id FROM unidade_endereco WHERE unidade_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000813", "SELECT lot_id FROM lotacao WHERE unid_id = ?  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC000814", "SELECT TM1.unid_id, TM1.unid_nome, TM1.unid_sigla FROM Unidade TM1 WHERE TM1.unid_id = ? ORDER BY TM1.unid_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 200);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 20);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 200);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 20);
               }
               stmt.setInt(3, ((Number) parms[4]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
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

