package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class servlotado_bc extends GXWebProcedure implements IGxSilentTrn
{
   public servlotado_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public servlotado_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( servlotado_bc.class ));
   }

   public servlotado_bc( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow0B11( ) ;
      standaloneNotModal( ) ;
      initializeNonKey0B11( ) ;
      standaloneModal( ) ;
      addRow0B11( ) ;
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
            Z37serv_lot_id = A37serv_lot_id ;
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

   public void confirm_0B0( )
   {
      beforeValidate0B11( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls0B11( ) ;
         }
         else
         {
            checkExtendedTable0B11( ) ;
            if ( AnyError == 0 )
            {
               zm0B11( 2) ;
            }
            closeExtendedTableCursors0B11( ) ;
         }
      }
      if ( AnyError == 0 )
      {
      }
   }

   public void zm0B11( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z39serv_lot_idade = A39serv_lot_idade ;
         Z40serv_lot_unid = A40serv_lot_unid ;
         Z41serv_lot_foto = A41serv_lot_foto ;
         Z6unid_id = A6unid_id ;
      }
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z7unid_nome = A7unid_nome ;
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
   }

   public void standaloneModal( )
   {
   }

   public void load0B11( )
   {
      /* Using cursor BC000B5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A37serv_lot_id)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A39serv_lot_idade = BC000B5_A39serv_lot_idade[0] ;
         n39serv_lot_idade = BC000B5_n39serv_lot_idade[0] ;
         A40serv_lot_unid = BC000B5_A40serv_lot_unid[0] ;
         n40serv_lot_unid = BC000B5_n40serv_lot_unid[0] ;
         A41serv_lot_foto = BC000B5_A41serv_lot_foto[0] ;
         n41serv_lot_foto = BC000B5_n41serv_lot_foto[0] ;
         A7unid_nome = BC000B5_A7unid_nome[0] ;
         n7unid_nome = BC000B5_n7unid_nome[0] ;
         A6unid_id = BC000B5_A6unid_id[0] ;
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
      standaloneModal( ) ;
      /* Using cursor BC000B6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A6unid_id)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem("Não existe 'Unidade'.", "ForeignKeyNotFound", 1, "UNID_ID");
         AnyError = (short)(1) ;
      }
      A7unid_nome = BC000B6_A7unid_nome[0] ;
      n7unid_nome = BC000B6_n7unid_nome[0] ;
      pr_default.close(4);
   }

   public void closeExtendedTableCursors0B11( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void getKey0B11( )
   {
      /* Using cursor BC000B7 */
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
      /* Using cursor BC000B8 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A37serv_lot_id)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm0B11( 1) ;
         RcdFound11 = (short)(1) ;
         A37serv_lot_id = BC000B8_A37serv_lot_id[0] ;
         A39serv_lot_idade = BC000B8_A39serv_lot_idade[0] ;
         n39serv_lot_idade = BC000B8_n39serv_lot_idade[0] ;
         A40serv_lot_unid = BC000B8_A40serv_lot_unid[0] ;
         n40serv_lot_unid = BC000B8_n40serv_lot_unid[0] ;
         A41serv_lot_foto = BC000B8_A41serv_lot_foto[0] ;
         n41serv_lot_foto = BC000B8_n41serv_lot_foto[0] ;
         A6unid_id = BC000B8_A6unid_id[0] ;
         Z37serv_lot_id = A37serv_lot_id ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0B11( ) ;
         if ( AnyError == 1 )
         {
            RcdFound11 = (short)(0) ;
            initializeNonKey0B11( ) ;
         }
         Gx_mode = sMode11 ;
      }
      else
      {
         RcdFound11 = (short)(0) ;
         initializeNonKey0B11( ) ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode11 ;
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey0B11( ) ;
      if ( RcdFound11 == 0 )
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
      confirm_0B0( ) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency0B11( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC000B9 */
         pr_default.execute(7, new Object[] {Integer.valueOf(A37serv_lot_id)});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ServLotado"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) || ( Z39serv_lot_idade != BC000B9_A39serv_lot_idade[0] ) || ( GXutil.strcmp(Z40serv_lot_unid, BC000B9_A40serv_lot_unid[0]) != 0 ) || ( GXutil.strcmp(Z41serv_lot_foto, BC000B9_A41serv_lot_foto[0]) != 0 ) || ( Z6unid_id != BC000B9_A6unid_id[0] ) )
         {
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
                  /* Using cursor BC000B10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n39serv_lot_idade), Short.valueOf(A39serv_lot_idade), Boolean.valueOf(n40serv_lot_unid), A40serv_lot_unid, Boolean.valueOf(n41serv_lot_foto), A41serv_lot_foto, Integer.valueOf(A6unid_id)});
                  /* Retrieving last key number assigned */
                  /* Using cursor BC000B11 */
                  pr_default.execute(9);
                  A37serv_lot_id = BC000B11_A37serv_lot_id[0] ;
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
                  /* Using cursor BC000B12 */
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
               /* Using cursor BC000B13 */
               pr_default.execute(11, new Object[] {Integer.valueOf(A37serv_lot_id)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ServLotado");
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
      sMode11 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0B11( ) ;
      Gx_mode = sMode11 ;
   }

   public void onDeleteControls0B11( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC000B14 */
         pr_default.execute(12, new Object[] {Integer.valueOf(A6unid_id)});
         A7unid_nome = BC000B14_A7unid_nome[0] ;
         n7unid_nome = BC000B14_n7unid_nome[0] ;
         pr_default.close(12);
      }
   }

   public void endLevel0B11( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0B11( ) ;
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

   public void scanKeyStart0B11( )
   {
      /* Using cursor BC000B15 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A37serv_lot_id)});
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A37serv_lot_id = BC000B15_A37serv_lot_id[0] ;
         A39serv_lot_idade = BC000B15_A39serv_lot_idade[0] ;
         n39serv_lot_idade = BC000B15_n39serv_lot_idade[0] ;
         A40serv_lot_unid = BC000B15_A40serv_lot_unid[0] ;
         n40serv_lot_unid = BC000B15_n40serv_lot_unid[0] ;
         A41serv_lot_foto = BC000B15_A41serv_lot_foto[0] ;
         n41serv_lot_foto = BC000B15_n41serv_lot_foto[0] ;
         A7unid_nome = BC000B15_A7unid_nome[0] ;
         n7unid_nome = BC000B15_n7unid_nome[0] ;
         A6unid_id = BC000B15_A6unid_id[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0B11( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound11 = (short)(0) ;
      scanKeyLoad0B11( ) ;
   }

   public void scanKeyLoad0B11( )
   {
      sMode11 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A37serv_lot_id = BC000B15_A37serv_lot_id[0] ;
         A39serv_lot_idade = BC000B15_A39serv_lot_idade[0] ;
         n39serv_lot_idade = BC000B15_n39serv_lot_idade[0] ;
         A40serv_lot_unid = BC000B15_A40serv_lot_unid[0] ;
         n40serv_lot_unid = BC000B15_n40serv_lot_unid[0] ;
         A41serv_lot_foto = BC000B15_A41serv_lot_foto[0] ;
         n41serv_lot_foto = BC000B15_n41serv_lot_foto[0] ;
         A7unid_nome = BC000B15_A7unid_nome[0] ;
         n7unid_nome = BC000B15_n7unid_nome[0] ;
         A6unid_id = BC000B15_A6unid_id[0] ;
      }
      Gx_mode = sMode11 ;
   }

   public void scanKeyEnd0B11( )
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
   }

   public void send_integrity_lvl_hashes0B11( )
   {
   }

   public void addRow0B11( )
   {
      VarsToRow11( bcServLotado) ;
   }

   public void readRow0B11( )
   {
      RowToVars11( bcServLotado, 1) ;
   }

   public void initializeNonKey0B11( )
   {
      A39serv_lot_idade = (short)(0) ;
      n39serv_lot_idade = false ;
      A40serv_lot_unid = "" ;
      n40serv_lot_unid = false ;
      A41serv_lot_foto = "" ;
      n41serv_lot_foto = false ;
      A6unid_id = 0 ;
      A7unid_nome = "" ;
      n7unid_nome = false ;
      Z39serv_lot_idade = (short)(0) ;
      Z40serv_lot_unid = "" ;
      Z41serv_lot_foto = "" ;
      Z6unid_id = 0 ;
   }

   public void initAll0B11( )
   {
      A37serv_lot_id = 0 ;
      initializeNonKey0B11( ) ;
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

   public void VarsToRow11( com.treinamento2.SdtServLotado obj11 )
   {
      obj11.setgxTv_SdtServLotado_Mode( Gx_mode );
      obj11.setgxTv_SdtServLotado_Serv_lot_idade( A39serv_lot_idade );
      obj11.setgxTv_SdtServLotado_Serv_lot_unid( A40serv_lot_unid );
      obj11.setgxTv_SdtServLotado_Serv_lot_foto( A41serv_lot_foto );
      obj11.setgxTv_SdtServLotado_Unid_id( A6unid_id );
      obj11.setgxTv_SdtServLotado_Unid_nome( A7unid_nome );
      obj11.setgxTv_SdtServLotado_Serv_lot_id( A37serv_lot_id );
      obj11.setgxTv_SdtServLotado_Serv_lot_id_Z( Z37serv_lot_id );
      obj11.setgxTv_SdtServLotado_Serv_lot_idade_Z( Z39serv_lot_idade );
      obj11.setgxTv_SdtServLotado_Serv_lot_unid_Z( Z40serv_lot_unid );
      obj11.setgxTv_SdtServLotado_Serv_lot_foto_Z( Z41serv_lot_foto );
      obj11.setgxTv_SdtServLotado_Unid_id_Z( Z6unid_id );
      obj11.setgxTv_SdtServLotado_Unid_nome_Z( Z7unid_nome );
      obj11.setgxTv_SdtServLotado_Serv_lot_idade_N( (byte)((byte)((n39serv_lot_idade)?1:0)) );
      obj11.setgxTv_SdtServLotado_Serv_lot_unid_N( (byte)((byte)((n40serv_lot_unid)?1:0)) );
      obj11.setgxTv_SdtServLotado_Serv_lot_foto_N( (byte)((byte)((n41serv_lot_foto)?1:0)) );
      obj11.setgxTv_SdtServLotado_Unid_nome_N( (byte)((byte)((n7unid_nome)?1:0)) );
      obj11.setgxTv_SdtServLotado_Mode( Gx_mode );
   }

   public void KeyVarsToRow11( com.treinamento2.SdtServLotado obj11 )
   {
      obj11.setgxTv_SdtServLotado_Serv_lot_id( A37serv_lot_id );
   }

   public void RowToVars11( com.treinamento2.SdtServLotado obj11 ,
                            int forceLoad )
   {
      Gx_mode = obj11.getgxTv_SdtServLotado_Mode() ;
      A39serv_lot_idade = obj11.getgxTv_SdtServLotado_Serv_lot_idade() ;
      n39serv_lot_idade = false ;
      A40serv_lot_unid = obj11.getgxTv_SdtServLotado_Serv_lot_unid() ;
      n40serv_lot_unid = false ;
      A41serv_lot_foto = obj11.getgxTv_SdtServLotado_Serv_lot_foto() ;
      n41serv_lot_foto = false ;
      A6unid_id = obj11.getgxTv_SdtServLotado_Unid_id() ;
      A7unid_nome = obj11.getgxTv_SdtServLotado_Unid_nome() ;
      n7unid_nome = false ;
      A37serv_lot_id = obj11.getgxTv_SdtServLotado_Serv_lot_id() ;
      Z37serv_lot_id = obj11.getgxTv_SdtServLotado_Serv_lot_id_Z() ;
      Z39serv_lot_idade = obj11.getgxTv_SdtServLotado_Serv_lot_idade_Z() ;
      Z40serv_lot_unid = obj11.getgxTv_SdtServLotado_Serv_lot_unid_Z() ;
      Z41serv_lot_foto = obj11.getgxTv_SdtServLotado_Serv_lot_foto_Z() ;
      Z6unid_id = obj11.getgxTv_SdtServLotado_Unid_id_Z() ;
      Z7unid_nome = obj11.getgxTv_SdtServLotado_Unid_nome_Z() ;
      n39serv_lot_idade = (boolean)((obj11.getgxTv_SdtServLotado_Serv_lot_idade_N()==0)?false:true) ;
      n40serv_lot_unid = (boolean)((obj11.getgxTv_SdtServLotado_Serv_lot_unid_N()==0)?false:true) ;
      n41serv_lot_foto = (boolean)((obj11.getgxTv_SdtServLotado_Serv_lot_foto_N()==0)?false:true) ;
      n7unid_nome = (boolean)((obj11.getgxTv_SdtServLotado_Unid_nome_N()==0)?false:true) ;
      Gx_mode = obj11.getgxTv_SdtServLotado_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A37serv_lot_id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0B11( ) ;
      scanKeyStart0B11( ) ;
      if ( RcdFound11 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z37serv_lot_id = A37serv_lot_id ;
      }
      zm0B11( -1) ;
      onLoadActions0B11( ) ;
      addRow0B11( ) ;
      scanKeyEnd0B11( ) ;
      if ( RcdFound11 == 0 )
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
      RowToVars11( bcServLotado, 0) ;
      scanKeyStart0B11( ) ;
      if ( RcdFound11 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z37serv_lot_id = A37serv_lot_id ;
      }
      zm0B11( -1) ;
      onLoadActions0B11( ) ;
      addRow0B11( ) ;
      scanKeyEnd0B11( ) ;
      if ( RcdFound11 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      getKey0B11( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert0B11( ) ;
      }
      else
      {
         if ( RcdFound11 == 1 )
         {
            if ( A37serv_lot_id != Z37serv_lot_id )
            {
               A37serv_lot_id = Z37serv_lot_id ;
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
               update0B11( ) ;
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
               if ( A37serv_lot_id != Z37serv_lot_id )
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
                     insert0B11( ) ;
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
                     insert0B11( ) ;
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
      RowToVars11( bcServLotado, 1) ;
      saveImpl( ) ;
      VarsToRow11( bcServLotado) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars11( bcServLotado, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0B11( ) ;
      afterTrn( ) ;
      VarsToRow11( bcServLotado) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
         VarsToRow11( bcServLotado) ;
      }
      else
      {
         com.treinamento2.SdtServLotado auxBC = new com.treinamento2.SdtServLotado( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A37serv_lot_id);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcServLotado);
            auxBC.Save();
            bcServLotado.copy(auxBC);
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
      RowToVars11( bcServLotado, 1) ;
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
      RowToVars11( bcServLotado, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert0B11( ) ;
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
            VarsToRow11( bcServLotado) ;
         }
      }
      else
      {
         afterTrn( ) ;
         VarsToRow11( bcServLotado) ;
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
      RowToVars11( bcServLotado, 0) ;
      getKey0B11( ) ;
      if ( RcdFound11 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A37serv_lot_id != Z37serv_lot_id )
         {
            A37serv_lot_id = Z37serv_lot_id ;
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
         if ( A37serv_lot_id != Z37serv_lot_id )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "servlotado_bc");
      VarsToRow11( bcServLotado) ;
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
      Gx_mode = bcServLotado.getgxTv_SdtServLotado_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcServLotado.setgxTv_SdtServLotado_Mode( Gx_mode );
   }

   public void SetSDT( com.treinamento2.SdtServLotado sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcServLotado )
      {
         bcServLotado = sdt ;
         if ( GXutil.strcmp(bcServLotado.getgxTv_SdtServLotado_Mode(), "") == 0 )
         {
            bcServLotado.setgxTv_SdtServLotado_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow11( bcServLotado) ;
         }
         else
         {
            RowToVars11( bcServLotado, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcServLotado.getgxTv_SdtServLotado_Mode(), "") == 0 )
         {
            bcServLotado.setgxTv_SdtServLotado_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars11( bcServLotado, 1) ;
   }

   public void ForceCommitOnExit( )
   {
   }

   public SdtServLotado getServLotado_BC( )
   {
      return bcServLotado ;
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
      Z40serv_lot_unid = "" ;
      A40serv_lot_unid = "" ;
      Z41serv_lot_foto = "" ;
      A41serv_lot_foto = "" ;
      Z7unid_nome = "" ;
      A7unid_nome = "" ;
      BC000B5_A37serv_lot_id = new int[1] ;
      BC000B5_A39serv_lot_idade = new short[1] ;
      BC000B5_n39serv_lot_idade = new boolean[] {false} ;
      BC000B5_A40serv_lot_unid = new String[] {""} ;
      BC000B5_n40serv_lot_unid = new boolean[] {false} ;
      BC000B5_A41serv_lot_foto = new String[] {""} ;
      BC000B5_n41serv_lot_foto = new boolean[] {false} ;
      BC000B5_A7unid_nome = new String[] {""} ;
      BC000B5_n7unid_nome = new boolean[] {false} ;
      BC000B5_A6unid_id = new int[1] ;
      BC000B6_A7unid_nome = new String[] {""} ;
      BC000B6_n7unid_nome = new boolean[] {false} ;
      BC000B7_A37serv_lot_id = new int[1] ;
      BC000B8_A37serv_lot_id = new int[1] ;
      BC000B8_A39serv_lot_idade = new short[1] ;
      BC000B8_n39serv_lot_idade = new boolean[] {false} ;
      BC000B8_A40serv_lot_unid = new String[] {""} ;
      BC000B8_n40serv_lot_unid = new boolean[] {false} ;
      BC000B8_A41serv_lot_foto = new String[] {""} ;
      BC000B8_n41serv_lot_foto = new boolean[] {false} ;
      BC000B8_A6unid_id = new int[1] ;
      sMode11 = "" ;
      BC000B9_A37serv_lot_id = new int[1] ;
      BC000B9_A39serv_lot_idade = new short[1] ;
      BC000B9_n39serv_lot_idade = new boolean[] {false} ;
      BC000B9_A40serv_lot_unid = new String[] {""} ;
      BC000B9_n40serv_lot_unid = new boolean[] {false} ;
      BC000B9_A41serv_lot_foto = new String[] {""} ;
      BC000B9_n41serv_lot_foto = new boolean[] {false} ;
      BC000B9_A6unid_id = new int[1] ;
      BC000B11_A37serv_lot_id = new int[1] ;
      BC000B14_A7unid_nome = new String[] {""} ;
      BC000B14_n7unid_nome = new boolean[] {false} ;
      BC000B15_A37serv_lot_id = new int[1] ;
      BC000B15_A39serv_lot_idade = new short[1] ;
      BC000B15_n39serv_lot_idade = new boolean[] {false} ;
      BC000B15_A40serv_lot_unid = new String[] {""} ;
      BC000B15_n40serv_lot_unid = new boolean[] {false} ;
      BC000B15_A41serv_lot_foto = new String[] {""} ;
      BC000B15_n41serv_lot_foto = new boolean[] {false} ;
      BC000B15_A7unid_nome = new String[] {""} ;
      BC000B15_n7unid_nome = new boolean[] {false} ;
      BC000B15_A6unid_id = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.servlotado_bc__default(),
         new Object[] {
             new Object[] {
            BC000B2_A37serv_lot_id, BC000B2_A39serv_lot_idade, BC000B2_n39serv_lot_idade, BC000B2_A40serv_lot_unid, BC000B2_n40serv_lot_unid, BC000B2_A41serv_lot_foto, BC000B2_n41serv_lot_foto, BC000B2_A6unid_id
            }
            , new Object[] {
            BC000B3_A37serv_lot_id, BC000B3_A39serv_lot_idade, BC000B3_n39serv_lot_idade, BC000B3_A40serv_lot_unid, BC000B3_n40serv_lot_unid, BC000B3_A41serv_lot_foto, BC000B3_n41serv_lot_foto, BC000B3_A6unid_id
            }
            , new Object[] {
            BC000B4_A7unid_nome, BC000B4_n7unid_nome
            }
            , new Object[] {
            BC000B5_A37serv_lot_id, BC000B5_A39serv_lot_idade, BC000B5_n39serv_lot_idade, BC000B5_A40serv_lot_unid, BC000B5_n40serv_lot_unid, BC000B5_A41serv_lot_foto, BC000B5_n41serv_lot_foto, BC000B5_A7unid_nome, BC000B5_n7unid_nome, BC000B5_A6unid_id
            }
            , new Object[] {
            BC000B6_A7unid_nome, BC000B6_n7unid_nome
            }
            , new Object[] {
            BC000B7_A37serv_lot_id
            }
            , new Object[] {
            BC000B8_A37serv_lot_id, BC000B8_A39serv_lot_idade, BC000B8_n39serv_lot_idade, BC000B8_A40serv_lot_unid, BC000B8_n40serv_lot_unid, BC000B8_A41serv_lot_foto, BC000B8_n41serv_lot_foto, BC000B8_A6unid_id
            }
            , new Object[] {
            BC000B9_A37serv_lot_id, BC000B9_A39serv_lot_idade, BC000B9_n39serv_lot_idade, BC000B9_A40serv_lot_unid, BC000B9_n40serv_lot_unid, BC000B9_A41serv_lot_foto, BC000B9_n41serv_lot_foto, BC000B9_A6unid_id
            }
            , new Object[] {
            }
            , new Object[] {
            BC000B11_A37serv_lot_id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000B14_A7unid_nome, BC000B14_n7unid_nome
            }
            , new Object[] {
            BC000B15_A37serv_lot_id, BC000B15_A39serv_lot_idade, BC000B15_n39serv_lot_idade, BC000B15_A40serv_lot_unid, BC000B15_n40serv_lot_unid, BC000B15_A41serv_lot_foto, BC000B15_n41serv_lot_foto, BC000B15_A7unid_nome, BC000B15_n7unid_nome, BC000B15_A6unid_id
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private short AnyError ;
   private short Z39serv_lot_idade ;
   private short A39serv_lot_idade ;
   private short RcdFound11 ;
   private int trnEnded ;
   private int Z37serv_lot_id ;
   private int A37serv_lot_id ;
   private int GX_JID ;
   private int Z6unid_id ;
   private int A6unid_id ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode11 ;
   private boolean n39serv_lot_idade ;
   private boolean n40serv_lot_unid ;
   private boolean n41serv_lot_foto ;
   private boolean n7unid_nome ;
   private String Z40serv_lot_unid ;
   private String A40serv_lot_unid ;
   private String Z41serv_lot_foto ;
   private String A41serv_lot_foto ;
   private String Z7unid_nome ;
   private String A7unid_nome ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private int[] BC000B5_A37serv_lot_id ;
   private short[] BC000B5_A39serv_lot_idade ;
   private boolean[] BC000B5_n39serv_lot_idade ;
   private String[] BC000B5_A40serv_lot_unid ;
   private boolean[] BC000B5_n40serv_lot_unid ;
   private String[] BC000B5_A41serv_lot_foto ;
   private boolean[] BC000B5_n41serv_lot_foto ;
   private String[] BC000B5_A7unid_nome ;
   private boolean[] BC000B5_n7unid_nome ;
   private int[] BC000B5_A6unid_id ;
   private String[] BC000B6_A7unid_nome ;
   private boolean[] BC000B6_n7unid_nome ;
   private int[] BC000B7_A37serv_lot_id ;
   private int[] BC000B8_A37serv_lot_id ;
   private short[] BC000B8_A39serv_lot_idade ;
   private boolean[] BC000B8_n39serv_lot_idade ;
   private String[] BC000B8_A40serv_lot_unid ;
   private boolean[] BC000B8_n40serv_lot_unid ;
   private String[] BC000B8_A41serv_lot_foto ;
   private boolean[] BC000B8_n41serv_lot_foto ;
   private int[] BC000B8_A6unid_id ;
   private int[] BC000B9_A37serv_lot_id ;
   private short[] BC000B9_A39serv_lot_idade ;
   private boolean[] BC000B9_n39serv_lot_idade ;
   private String[] BC000B9_A40serv_lot_unid ;
   private boolean[] BC000B9_n40serv_lot_unid ;
   private String[] BC000B9_A41serv_lot_foto ;
   private boolean[] BC000B9_n41serv_lot_foto ;
   private int[] BC000B9_A6unid_id ;
   private int[] BC000B11_A37serv_lot_id ;
   private String[] BC000B14_A7unid_nome ;
   private boolean[] BC000B14_n7unid_nome ;
   private int[] BC000B15_A37serv_lot_id ;
   private short[] BC000B15_A39serv_lot_idade ;
   private boolean[] BC000B15_n39serv_lot_idade ;
   private String[] BC000B15_A40serv_lot_unid ;
   private boolean[] BC000B15_n40serv_lot_unid ;
   private String[] BC000B15_A41serv_lot_foto ;
   private boolean[] BC000B15_n41serv_lot_foto ;
   private String[] BC000B15_A7unid_nome ;
   private boolean[] BC000B15_n7unid_nome ;
   private int[] BC000B15_A6unid_id ;
   private com.treinamento2.SdtServLotado bcServLotado ;
   private int[] BC000B2_A37serv_lot_id ;
   private short[] BC000B2_A39serv_lot_idade ;
   private String[] BC000B2_A40serv_lot_unid ;
   private String[] BC000B2_A41serv_lot_foto ;
   private int[] BC000B2_A6unid_id ;
   private int[] BC000B3_A37serv_lot_id ;
   private short[] BC000B3_A39serv_lot_idade ;
   private String[] BC000B3_A40serv_lot_unid ;
   private String[] BC000B3_A41serv_lot_foto ;
   private int[] BC000B3_A6unid_id ;
   private String[] BC000B4_A7unid_nome ;
   private boolean[] BC000B2_n39serv_lot_idade ;
   private boolean[] BC000B2_n40serv_lot_unid ;
   private boolean[] BC000B2_n41serv_lot_foto ;
   private boolean[] BC000B3_n39serv_lot_idade ;
   private boolean[] BC000B3_n40serv_lot_unid ;
   private boolean[] BC000B3_n41serv_lot_foto ;
   private boolean[] BC000B4_n7unid_nome ;
}

final  class servlotado_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000B2", "SELECT serv_lot_id, serv_lot_idade, serv_lot_unid, serv_lot_foto, unid_id FROM ServLotado WHERE serv_lot_id = ?  FOR UPDATE OF ServLotado",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B3", "SELECT serv_lot_id, serv_lot_idade, serv_lot_unid, serv_lot_foto, unid_id FROM ServLotado WHERE serv_lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B4", "SELECT unid_nome FROM Unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B5", "SELECT TM1.serv_lot_id, TM1.serv_lot_idade, TM1.serv_lot_unid, TM1.serv_lot_foto, T2.unid_nome, TM1.unid_id FROM (ServLotado TM1 INNER JOIN Unidade T2 ON T2.unid_id = TM1.unid_id) WHERE TM1.serv_lot_id = ? ORDER BY TM1.serv_lot_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B6", "SELECT unid_nome FROM Unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B7", "SELECT serv_lot_id FROM ServLotado WHERE serv_lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B8", "SELECT serv_lot_id, serv_lot_idade, serv_lot_unid, serv_lot_foto, unid_id FROM ServLotado WHERE serv_lot_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B9", "SELECT serv_lot_id, serv_lot_idade, serv_lot_unid, serv_lot_foto, unid_id FROM ServLotado WHERE serv_lot_id = ?  FOR UPDATE OF ServLotado",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000B10", "SAVEPOINT gxupdate;INSERT INTO ServLotado(serv_lot_idade, serv_lot_unid, serv_lot_foto, unid_id) VALUES(?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000B11", "SELECT currval('serv_lot_id') ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC000B12", "SAVEPOINT gxupdate;UPDATE ServLotado SET serv_lot_idade=?, serv_lot_unid=?, serv_lot_foto=?, unid_id=?  WHERE serv_lot_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("BC000B13", "SAVEPOINT gxupdate;DELETE FROM ServLotado  WHERE serv_lot_id = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("BC000B14", "SELECT unid_nome FROM Unidade WHERE unid_id = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC000B15", "SELECT TM1.serv_lot_id, TM1.serv_lot_idade, TM1.serv_lot_unid, TM1.serv_lot_foto, T2.unid_nome, TM1.unid_id FROM (ServLotado TM1 INNER JOIN Unidade T2 ON T2.unid_id = TM1.unid_id) WHERE TM1.serv_lot_id = ? ORDER BY TM1.serv_lot_id ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
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
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

