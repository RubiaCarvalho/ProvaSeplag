package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class servidor_efetivo_bc extends GXWebProcedure implements IGxSilentTrn
{
   public servidor_efetivo_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public servidor_efetivo_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( servidor_efetivo_bc.class ));
   }

   public servidor_efetivo_bc( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow069( ) ;
      standaloneNotModal( ) ;
      initializeNonKey069( ) ;
      standaloneModal( ) ;
      addRow069( ) ;
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
            Z32se_pes_id = A32se_pes_id ;
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

   public void confirm_060( )
   {
      beforeValidate069( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls069( ) ;
         }
         else
         {
            checkExtendedTable069( ) ;
            if ( AnyError == 0 )
            {
               zm069( 2) ;
            }
            closeExtendedTableCursors069( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm069( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z27se_matricula = A27se_matricula ;
      }
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -1 )
      {
         Z27se_matricula = A27se_matricula ;
         Z32se_pes_id = A32se_pes_id ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load069( )
   {
      /* Using cursor BC00065 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A32se_pes_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A27se_matricula = BC00065_A27se_matricula[0] ;
         n27se_matricula = BC00065_n27se_matricula[0] ;
         zm069( -1) ;
      }
      pr_default.close(3);
      onLoadActions069( ) ;
   }

   public void onLoadActions069( )
   {
   }

   public void checkExtendedTable069( )
   {
      standaloneModal( ) ;
      /* Using cursor BC00066 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A32se_pes_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'servidor_efetivo'.", "ForeignKeyNotFound", 1, "SE_PES_ID");
         AnyError = (short)(1) ;
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors069( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void getKey069( )
   {
      /* Using cursor BC00067 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A32se_pes_id)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound9 = (short)(1) ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00068 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A32se_pes_id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm069( 1) ;
         RcdFound9 = (short)(1) ;
         A27se_matricula = BC00068_A27se_matricula[0] ;
         n27se_matricula = BC00068_n27se_matricula[0] ;
         A32se_pes_id = BC00068_A32se_pes_id[0] ;
         Z32se_pes_id = A32se_pes_id ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load069( ) ;
         if ( AnyError == 1 )
         {
            RcdFound9 = (short)(0) ;
            initializeNonKey069( ) ;
         }
         Gx_mode = sMode9 ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
         initializeNonKey069( ) ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode9 ;
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey069( ) ;
      if ( RcdFound9 == 0 )
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
      confirm_060( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency069( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00069 */
         pr_default.execute(7, new Object[] {Integer.valueOf(A32se_pes_id)});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"servidor_efetivo"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) || ( GXutil.strcmp(Z27se_matricula, BC00069_A27se_matricula[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"servidor_efetivo"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert069( )
   {
      beforeValidate069( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable069( ) ;
      }
      if ( AnyError == 0 )
      {
         zm069( 0) ;
         checkOptimisticConcurrency069( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm069( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert069( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000610 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n27se_matricula), A27se_matricula, Integer.valueOf(A32se_pes_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_efetivo");
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
            load069( ) ;
         }
         endLevel069( ) ;
      }
      closeExtendedTableCursors069( ) ;
   }

   public void update069( )
   {
      beforeValidate069( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable069( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency069( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm069( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate069( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000611 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n27se_matricula), A27se_matricula, Integer.valueOf(A32se_pes_id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_efetivo");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"servidor_efetivo"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate069( ) ;
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
         endLevel069( ) ;
      }
      closeExtendedTableCursors069( ) ;
   }

   public void deferredUpdate069( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate069( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency069( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls069( ) ;
         afterConfirm069( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete069( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000612 */
               pr_default.execute(10, new Object[] {Integer.valueOf(A32se_pes_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("servidor_efetivo");
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
      sMode9 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel069( ) ;
      Gx_mode = sMode9 ;
   }

   public void onDeleteControls069( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel069( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete069( ) ;
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

   public void scanKeyStart069( )
   {
      /* Using cursor BC000613 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A32se_pes_id)});
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A27se_matricula = BC000613_A27se_matricula[0] ;
         n27se_matricula = BC000613_n27se_matricula[0] ;
         A32se_pes_id = BC000613_A32se_pes_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext069( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound9 = (short)(0) ;
      scanKeyLoad069( ) ;
   }

   public void scanKeyLoad069( )
   {
      sMode9 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A27se_matricula = BC000613_A27se_matricula[0] ;
         n27se_matricula = BC000613_n27se_matricula[0] ;
         A32se_pes_id = BC000613_A32se_pes_id[0] ;
      }
      Gx_mode = sMode9 ;
   }

   public void scanKeyEnd069( )
   {
      pr_default.close(11);
   }

   public void afterConfirm069( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert069( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate069( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete069( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete069( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate069( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes069( )
   {
   }

   public void send_integrity_lvl_hashes069( )
   {
   }

   public void addRow069( )
   {
      VarsToRow9( bcservidor_efetivo) ;
   }

   public void readRow069( )
   {
      RowToVars9( bcservidor_efetivo, 1) ;
   }

   public void initializeNonKey069( )
   {
      A27se_matricula = "" ;
      n27se_matricula = false ;
      Z27se_matricula = "" ;
   }

   public void initAll069( )
   {
      A32se_pes_id = 0 ;
      initializeNonKey069( ) ;
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

   public void VarsToRow9( com.treinamento2.Sdtservidor_efetivo obj9 )
   {
      obj9.setgxTv_Sdtservidor_efetivo_Mode( Gx_mode );
      obj9.setgxTv_Sdtservidor_efetivo_Se_matricula( A27se_matricula );
      obj9.setgxTv_Sdtservidor_efetivo_Se_pes_id( A32se_pes_id );
      obj9.setgxTv_Sdtservidor_efetivo_Se_pes_id_Z( Z32se_pes_id );
      obj9.setgxTv_Sdtservidor_efetivo_Se_matricula_Z( Z27se_matricula );
      obj9.setgxTv_Sdtservidor_efetivo_Se_matricula_N( (byte)((byte)((n27se_matricula)?1:0)) );
      obj9.setgxTv_Sdtservidor_efetivo_Mode( Gx_mode );
   }

   public void KeyVarsToRow9( com.treinamento2.Sdtservidor_efetivo obj9 )
   {
      obj9.setgxTv_Sdtservidor_efetivo_Se_pes_id( A32se_pes_id );
   }

   public void RowToVars9( com.treinamento2.Sdtservidor_efetivo obj9 ,
                           int forceLoad )
   {
      Gx_mode = obj9.getgxTv_Sdtservidor_efetivo_Mode() ;
      A27se_matricula = obj9.getgxTv_Sdtservidor_efetivo_Se_matricula() ;
      n27se_matricula = false ;
      A32se_pes_id = obj9.getgxTv_Sdtservidor_efetivo_Se_pes_id() ;
      Z32se_pes_id = obj9.getgxTv_Sdtservidor_efetivo_Se_pes_id_Z() ;
      Z27se_matricula = obj9.getgxTv_Sdtservidor_efetivo_Se_matricula_Z() ;
      n27se_matricula = (boolean)((obj9.getgxTv_Sdtservidor_efetivo_Se_matricula_N()==0)?false:true) ;
      Gx_mode = obj9.getgxTv_Sdtservidor_efetivo_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A32se_pes_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey069( ) ;
      scanKeyStart069( ) ;
      if ( RcdFound9 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z32se_pes_id = A32se_pes_id ;
      }
      zm069( -1) ;
      onLoadActions069( ) ;
      addRow069( ) ;
      scanKeyEnd069( ) ;
      if ( RcdFound9 == 0 )
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
      RowToVars9( bcservidor_efetivo, 0) ;
      scanKeyStart069( ) ;
      if ( RcdFound9 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z32se_pes_id = A32se_pes_id ;
      }
      zm069( -1) ;
      onLoadActions069( ) ;
      addRow069( ) ;
      scanKeyEnd069( ) ;
      if ( RcdFound9 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey069( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert069( ) ;
      }
      else
      {
         if ( RcdFound9 == 1 )
         {
            if ( A32se_pes_id != Z32se_pes_id )
            {
               A32se_pes_id = Z32se_pes_id ;
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
               update069( ) ;
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
               if ( A32se_pes_id != Z32se_pes_id )
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
                     insert069( ) ;
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
                     insert069( ) ;
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
      RowToVars9( bcservidor_efetivo, 1) ;
      saveImpl( ) ;
      VarsToRow9( bcservidor_efetivo) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars9( bcservidor_efetivo, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert069( ) ;
      afterTrn( ) ;
      VarsToRow9( bcservidor_efetivo) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow9( bcservidor_efetivo) ;
      }
      else
      {
         com.treinamento2.Sdtservidor_efetivo auxBC = new com.treinamento2.Sdtservidor_efetivo( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A32se_pes_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcservidor_efetivo);
            auxBC.Save();
            bcservidor_efetivo.copy(auxBC);
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
      RowToVars9( bcservidor_efetivo, 1) ;
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
      RowToVars9( bcservidor_efetivo, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert069( ) ;
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
            VarsToRow9( bcservidor_efetivo) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow9( bcservidor_efetivo) ;
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
      RowToVars9( bcservidor_efetivo, 0) ;
      getKey069( ) ;
      if ( RcdFound9 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A32se_pes_id != Z32se_pes_id )
         {
            A32se_pes_id = Z32se_pes_id ;
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
         if ( A32se_pes_id != Z32se_pes_id )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "servidor_efetivo_bc");
      VarsToRow9( bcservidor_efetivo) ;
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
      Gx_mode = bcservidor_efetivo.getgxTv_Sdtservidor_efetivo_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcservidor_efetivo.setgxTv_Sdtservidor_efetivo_Mode( Gx_mode );
   }

   public void SetSDT( com.treinamento2.Sdtservidor_efetivo sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcservidor_efetivo )
      {
         bcservidor_efetivo = sdt ;
         if ( GXutil.strcmp(bcservidor_efetivo.getgxTv_Sdtservidor_efetivo_Mode(), "") == 0 )
         {
            bcservidor_efetivo.setgxTv_Sdtservidor_efetivo_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow9( bcservidor_efetivo) ;
         }
         else
         {
            RowToVars9( bcservidor_efetivo, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcservidor_efetivo.getgxTv_Sdtservidor_efetivo_Mode(), "") == 0 )
         {
            bcservidor_efetivo.setgxTv_Sdtservidor_efetivo_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars9( bcservidor_efetivo, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public Sdtservidor_efetivo getservidor_efetivo_BC( )
   {
      return bcservidor_efetivo ;
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
      Z27se_matricula = "" ;
      A27se_matricula = "" ;
      BC00065_A27se_matricula = new String[] {""} ;
      BC00065_n27se_matricula = new boolean[] {false} ;
      BC00065_A32se_pes_id = new int[1] ;
      BC00066_A32se_pes_id = new int[1] ;
      BC00067_A32se_pes_id = new int[1] ;
      BC00068_A27se_matricula = new String[] {""} ;
      BC00068_n27se_matricula = new boolean[] {false} ;
      BC00068_A32se_pes_id = new int[1] ;
      sMode9 = "" ;
      BC00069_A27se_matricula = new String[] {""} ;
      BC00069_n27se_matricula = new boolean[] {false} ;
      BC00069_A32se_pes_id = new int[1] ;
      BC000613_A27se_matricula = new String[] {""} ;
      BC000613_n27se_matricula = new boolean[] {false} ;
      BC000613_A32se_pes_id = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.servidor_efetivo_bc__default(),
         new Object[] {
             new Object[] {
            BC00062_A27se_matricula, BC00062_n27se_matricula, BC00062_A32se_pes_id
            }
            , new Object[] {
            BC00063_A27se_matricula, BC00063_n27se_matricula, BC00063_A32se_pes_id
            }
            , new Object[] {
            BC00064_A32se_pes_id
            }
            , new Object[] {
            BC00065_A27se_matricula, BC00065_n27se_matricula, BC00065_A32se_pes_id
            }
            , new Object[] {
            BC00066_A32se_pes_id
            }
            , new Object[] {
            BC00067_A32se_pes_id
            }
            , new Object[] {
            BC00068_A27se_matricula, BC00068_n27se_matricula, BC00068_A32se_pes_id
            }
            , new Object[] {
            BC00069_A27se_matricula, BC00069_n27se_matricula, BC00069_A32se_pes_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000613_A27se_matricula, BC000613_n27se_matricula, BC000613_A32se_pes_id
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short RcdFound9 ;
   private int trnEnded ;
   private int Z32se_pes_id ;
   private int A32se_pes_id ;
   private int GX_JID ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode9 ;
   private boolean n27se_matricula ;
   private String Z27se_matricula ;
   private String A27se_matricula ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private String[] BC00065_A27se_matricula ;
   private boolean[] BC00065_n27se_matricula ;
   private int[] BC00065_A32se_pes_id ;
   private int[] BC00066_A32se_pes_id ;
   private int[] BC00067_A32se_pes_id ;
   private String[] BC00068_A27se_matricula ;
   private boolean[] BC00068_n27se_matricula ;
   private int[] BC00068_A32se_pes_id ;
   private String[] BC00069_A27se_matricula ;
   private boolean[] BC00069_n27se_matricula ;
   private int[] BC00069_A32se_pes_id ;
   private String[] BC000613_A27se_matricula ;
   private boolean[] BC000613_n27se_matricula ;
   private int[] BC000613_A32se_pes_id ;
   private com.treinamento2.Sdtservidor_efetivo bcservidor_efetivo ;
   private String[] BC00062_A27se_matricula ;
   private int[] BC00062_A32se_pes_id ;
   private String[] BC00063_A27se_matricula ;
   private int[] BC00063_A32se_pes_id ;
   private int[] BC00064_A32se_pes_id ;
   private boolean[] BC00062_n27se_matricula ;
   private boolean[] BC00063_n27se_matricula ;
}

final  class servidor_efetivo_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00062", "SELECT se_matricula, se_pes_id FROM servidor_efetivo WHERE se_pes_id = ?  FOR UPDATE OF servidor_efetivo",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00063", "SELECT se_matricula, se_pes_id FROM servidor_efetivo WHERE se_pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00064", "SELECT pes_id AS se_pes_id FROM Pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00065", "SELECT TM1.se_matricula, TM1.se_pes_id AS se_pes_id FROM servidor_efetivo TM1 WHERE TM1.se_pes_id = ? ORDER BY TM1.se_pes_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00066", "SELECT pes_id AS se_pes_id FROM Pessoa WHERE pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00067", "SELECT se_pes_id FROM servidor_efetivo WHERE se_pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00068", "SELECT se_matricula, se_pes_id FROM servidor_efetivo WHERE se_pes_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00069", "SELECT se_matricula, se_pes_id FROM servidor_efetivo WHERE se_pes_id = ?  FOR UPDATE OF servidor_efetivo",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000610", "SAVEPOINT gxupdate;INSERT INTO servidor_efetivo(se_matricula, se_pes_id) VALUES(?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000611", "SAVEPOINT gxupdate;UPDATE servidor_efetivo SET se_matricula=?  WHERE se_pes_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000612", "SAVEPOINT gxupdate;DELETE FROM servidor_efetivo  WHERE se_pes_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000613", "SELECT TM1.se_matricula, TM1.se_pes_id AS se_pes_id FROM servidor_efetivo TM1 WHERE TM1.se_pes_id = ? ORDER BY TM1.se_pes_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
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
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 20);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 20);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
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

