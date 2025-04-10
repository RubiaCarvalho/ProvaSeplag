package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dp_get_lotacao extends GXProcedure
{
   public dp_get_lotacao( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dp_get_lotacao.class ), "" );
   }

   public dp_get_lotacao( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem> executeUdp( int aP0 ,
                                                                                        int aP1 ,
                                                                                        int aP2 ,
                                                                                        java.util.Date aP3 ,
                                                                                        java.util.Date aP4 ,
                                                                                        String aP5 ,
                                                                                        short aP6 ,
                                                                                        short aP7 )
   {
      dp_get_lotacao.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( int aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        String aP5 ,
                        short aP6 ,
                        short aP7 ,
                        GXBaseCollection<com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem>[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( int aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             short aP6 ,
                             short aP7 ,
                             GXBaseCollection<com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem>[] aP8 )
   {
      dp_get_lotacao.this.AV5lot_id = aP0;
      dp_get_lotacao.this.AV9pes_id = aP1;
      dp_get_lotacao.this.AV10unid_id = aP2;
      dp_get_lotacao.this.AV11lot_data_lotacao = aP3;
      dp_get_lotacao.this.AV12lot_data_remocao = aP4;
      dp_get_lotacao.this.AV13lot_portaria = aP5;
      dp_get_lotacao.this.AV8PageNumber = aP6;
      dp_get_lotacao.this.AV7PageSize = aP7;
      dp_get_lotacao.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV17Ds_get_lotacao_3_lot_id = AV5lot_id ;
      AV18Ds_get_lotacao_4_pes_id = AV9pes_id ;
      AV19Ds_get_lotacao_5_unid_id = AV10unid_id ;
      AV20Ds_get_lotacao_6_lot_data_lotacao = AV11lot_data_lotacao ;
      AV21Ds_get_lotacao_7_lot_data_remocao = AV12lot_data_remocao ;
      AV22Ds_get_lotacao_8_lot_portaria = AV13lot_portaria ;
      GXPagingFrom2 = AV8PageNumber ;
      GXPagingTo2 = AV7PageSize ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV17Ds_get_lotacao_3_lot_id) ,
                                           Integer.valueOf(AV18Ds_get_lotacao_4_pes_id) ,
                                           Integer.valueOf(AV19Ds_get_lotacao_5_unid_id) ,
                                           AV20Ds_get_lotacao_6_lot_data_lotacao ,
                                           AV22Ds_get_lotacao_8_lot_portaria ,
                                           Integer.valueOf(A5lot_id) ,
                                           Integer.valueOf(A4pes_id) ,
                                           Integer.valueOf(A6unid_id) ,
                                           A17lot_data_lotacao ,
                                           A19lot_portaria } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor P00022 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV17Ds_get_lotacao_3_lot_id), Integer.valueOf(AV18Ds_get_lotacao_4_pes_id), Integer.valueOf(AV19Ds_get_lotacao_5_unid_id), AV20Ds_get_lotacao_6_lot_data_lotacao, AV22Ds_get_lotacao_8_lot_portaria, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A19lot_portaria = P00022_A19lot_portaria[0] ;
         n19lot_portaria = P00022_n19lot_portaria[0] ;
         A17lot_data_lotacao = P00022_A17lot_data_lotacao[0] ;
         n17lot_data_lotacao = P00022_n17lot_data_lotacao[0] ;
         A6unid_id = P00022_A6unid_id[0] ;
         A4pes_id = P00022_A4pes_id[0] ;
         A5lot_id = P00022_A5lot_id[0] ;
         A18lot_data_remocao = P00022_A18lot_data_remocao[0] ;
         n18lot_data_remocao = P00022_n18lot_data_remocao[0] ;
         Gxm1sdt_lotacao = (com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem)new com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdt_lotacao, 0);
         Gxm1sdt_lotacao.setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id( A5lot_id );
         Gxm1sdt_lotacao.setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id( A4pes_id );
         Gxm1sdt_lotacao.setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id( A6unid_id );
         Gxm1sdt_lotacao.setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao( A17lot_data_lotacao );
         Gxm1sdt_lotacao.setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao( A18lot_data_remocao );
         Gxm1sdt_lotacao.setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria( A19lot_portaria );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = dp_get_lotacao.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem>(com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem.class, "Sdt_LotacaoItem", "Treinamento2", remoteHandle);
      AV20Ds_get_lotacao_6_lot_data_lotacao = GXutil.nullDate() ;
      AV21Ds_get_lotacao_7_lot_data_remocao = GXutil.nullDate() ;
      AV22Ds_get_lotacao_8_lot_portaria = "" ;
      A17lot_data_lotacao = GXutil.nullDate() ;
      A19lot_portaria = "" ;
      P00022_A19lot_portaria = new String[] {""} ;
      P00022_n19lot_portaria = new boolean[] {false} ;
      P00022_A17lot_data_lotacao = new java.util.Date[] {GXutil.nullDate()} ;
      P00022_n17lot_data_lotacao = new boolean[] {false} ;
      P00022_A6unid_id = new int[1] ;
      P00022_A4pes_id = new int[1] ;
      P00022_A5lot_id = new int[1] ;
      P00022_A18lot_data_remocao = new java.util.Date[] {GXutil.nullDate()} ;
      P00022_n18lot_data_remocao = new boolean[] {false} ;
      A18lot_data_remocao = GXutil.nullDate() ;
      Gxm1sdt_lotacao = new com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.dp_get_lotacao__default(),
         new Object[] {
             new Object[] {
            P00022_A19lot_portaria, P00022_n19lot_portaria, P00022_A17lot_data_lotacao, P00022_n17lot_data_lotacao, P00022_A6unid_id, P00022_A4pes_id, P00022_A5lot_id, P00022_A18lot_data_remocao, P00022_n18lot_data_remocao
            }
         }
      );
      /* GeneXus formulas. */
   }

   private short AV8PageNumber ;
   private short AV7PageSize ;
   private int AV5lot_id ;
   private int AV9pes_id ;
   private int AV10unid_id ;
   private int AV17Ds_get_lotacao_3_lot_id ;
   private int AV18Ds_get_lotacao_4_pes_id ;
   private int AV19Ds_get_lotacao_5_unid_id ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A5lot_id ;
   private int A4pes_id ;
   private int A6unid_id ;
   private java.util.Date AV11lot_data_lotacao ;
   private java.util.Date AV12lot_data_remocao ;
   private java.util.Date AV20Ds_get_lotacao_6_lot_data_lotacao ;
   private java.util.Date AV21Ds_get_lotacao_7_lot_data_remocao ;
   private java.util.Date A17lot_data_lotacao ;
   private java.util.Date A18lot_data_remocao ;
   private boolean n19lot_portaria ;
   private boolean n17lot_data_lotacao ;
   private boolean n18lot_data_remocao ;
   private String AV13lot_portaria ;
   private String AV22Ds_get_lotacao_8_lot_portaria ;
   private String A19lot_portaria ;
   private GXBaseCollection<com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem>[] aP8 ;
   private GXBaseCollection<com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem> Gxm2rootcol ;
   private IDataStoreProvider pr_default ;
   private String[] P00022_A19lot_portaria ;
   private boolean[] P00022_n19lot_portaria ;
   private java.util.Date[] P00022_A17lot_data_lotacao ;
   private boolean[] P00022_n17lot_data_lotacao ;
   private int[] P00022_A6unid_id ;
   private int[] P00022_A4pes_id ;
   private int[] P00022_A5lot_id ;
   private java.util.Date[] P00022_A18lot_data_remocao ;
   private boolean[] P00022_n18lot_data_remocao ;
   private com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem Gxm1sdt_lotacao ;
}

final  class dp_get_lotacao__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00022( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV17Ds_get_lotacao_3_lot_id ,
                                          int AV18Ds_get_lotacao_4_pes_id ,
                                          int AV19Ds_get_lotacao_5_unid_id ,
                                          java.util.Date AV20Ds_get_lotacao_6_lot_data_lotacao ,
                                          String AV22Ds_get_lotacao_8_lot_portaria ,
                                          int A5lot_id ,
                                          int A4pes_id ,
                                          int A6unid_id ,
                                          java.util.Date A17lot_data_lotacao ,
                                          String A19lot_portaria )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[8];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " lot_portaria, lot_data_lotacao, unid_id, pes_id, lot_id, lot_data_remocao" ;
      sFromString = " FROM lotacao" ;
      sOrderString = "" ;
      if ( ! (0==AV17Ds_get_lotacao_3_lot_id) )
      {
         addWhere(sWhereString, "(lot_id = ?)");
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! (0==AV18Ds_get_lotacao_4_pes_id) )
      {
         addWhere(sWhereString, "(pes_id = ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV19Ds_get_lotacao_5_unid_id) )
      {
         addWhere(sWhereString, "(unid_id = ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20Ds_get_lotacao_6_lot_data_lotacao)) )
      {
         addWhere(sWhereString, "(lot_data_lotacao = ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22Ds_get_lotacao_8_lot_portaria)==0) )
      {
         addWhere(sWhereString, "(lot_portaria = ( ?))");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      sOrderString += " ORDER BY lot_id DESC" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " OFFSET " + "?" + " LIMIT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
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
                  return conditional_P00022(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00022", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
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
      }
   }

}

