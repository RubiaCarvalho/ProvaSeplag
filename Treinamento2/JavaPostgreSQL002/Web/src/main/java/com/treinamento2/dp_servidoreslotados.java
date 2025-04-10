package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dp_servidoreslotados extends GXProcedure
{
   public dp_servidoreslotados( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dp_servidoreslotados.class ), "" );
   }

   public dp_servidoreslotados( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem> executeUdp( int aP0 ,
                                                                                              short aP1 ,
                                                                                              String aP2 ,
                                                                                              int aP3 ,
                                                                                              String aP4 ,
                                                                                              short aP5 ,
                                                                                              short aP6 )
   {
      dp_servidoreslotados.this.aP7 = new GXBaseCollection[] {new GXBaseCollection<com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( int aP0 ,
                        short aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String aP4 ,
                        short aP5 ,
                        short aP6 ,
                        GXBaseCollection<com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem>[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( int aP0 ,
                             short aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             short aP5 ,
                             short aP6 ,
                             GXBaseCollection<com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem>[] aP7 )
   {
      dp_servidoreslotados.this.AV7serv_lot_id = aP0;
      dp_servidoreslotados.this.AV8serv_lot_idade = aP1;
      dp_servidoreslotados.this.AV9serv_lot_unid = aP2;
      dp_servidoreslotados.this.AV10unid_id = aP3;
      dp_servidoreslotados.this.AV11unid_nome = aP4;
      dp_servidoreslotados.this.AV6PageNumber = aP5;
      dp_servidoreslotados.this.AV5PageSize = aP6;
      dp_servidoreslotados.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV16Ds_get_servlotado_3_serv_lot_id = AV7serv_lot_id ;
      AV17Ds_get_servlotado_4_serv_lot_idade = AV8serv_lot_idade ;
      AV18Ds_get_servlotado_5_serv_lot_unid = AV9serv_lot_unid ;
      AV19Ds_get_servlotado_6_unid_id = AV10unid_id ;
      AV20Ds_get_servlotado_7_unid_nome = AV11unid_nome ;
      GXPagingFrom2 = AV6PageNumber ;
      GXPagingTo2 = AV5PageSize ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV16Ds_get_servlotado_3_serv_lot_id) ,
                                           Short.valueOf(AV17Ds_get_servlotado_4_serv_lot_idade) ,
                                           AV18Ds_get_servlotado_5_serv_lot_unid ,
                                           Integer.valueOf(AV19Ds_get_servlotado_6_unid_id) ,
                                           AV20Ds_get_servlotado_7_unid_nome ,
                                           Integer.valueOf(A37serv_lot_id) ,
                                           Short.valueOf(A39serv_lot_idade) ,
                                           A40serv_lot_unid ,
                                           Integer.valueOf(A6unid_id) ,
                                           A7unid_nome } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor P00062 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV16Ds_get_servlotado_3_serv_lot_id), Short.valueOf(AV17Ds_get_servlotado_4_serv_lot_idade), AV18Ds_get_servlotado_5_serv_lot_unid, Integer.valueOf(AV19Ds_get_servlotado_6_unid_id), AV20Ds_get_servlotado_7_unid_nome, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7unid_nome = P00062_A7unid_nome[0] ;
         n7unid_nome = P00062_n7unid_nome[0] ;
         A6unid_id = P00062_A6unid_id[0] ;
         A40serv_lot_unid = P00062_A40serv_lot_unid[0] ;
         n40serv_lot_unid = P00062_n40serv_lot_unid[0] ;
         A39serv_lot_idade = P00062_A39serv_lot_idade[0] ;
         n39serv_lot_idade = P00062_n39serv_lot_idade[0] ;
         A37serv_lot_id = P00062_A37serv_lot_id[0] ;
         A41serv_lot_foto = P00062_A41serv_lot_foto[0] ;
         n41serv_lot_foto = P00062_n41serv_lot_foto[0] ;
         A7unid_nome = P00062_A7unid_nome[0] ;
         n7unid_nome = P00062_n7unid_nome[0] ;
         Gxm1sdt_servlotado = (com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem)new com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdt_servlotado, 0);
         Gxm1sdt_servlotado.setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id( A37serv_lot_id );
         Gxm1sdt_servlotado.setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade( A39serv_lot_idade );
         Gxm1sdt_servlotado.setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid( A40serv_lot_unid );
         Gxm1sdt_servlotado.setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto( A41serv_lot_foto );
         Gxm1sdt_servlotado.setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id( A6unid_id );
         Gxm1sdt_servlotado.setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome( A7unid_nome );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = dp_servidoreslotados.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem>(com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem.class, "SDT_ServLotadoItem", "Treinamento2", remoteHandle);
      AV18Ds_get_servlotado_5_serv_lot_unid = "" ;
      AV20Ds_get_servlotado_7_unid_nome = "" ;
      A40serv_lot_unid = "" ;
      A7unid_nome = "" ;
      P00062_A7unid_nome = new String[] {""} ;
      P00062_n7unid_nome = new boolean[] {false} ;
      P00062_A6unid_id = new int[1] ;
      P00062_A40serv_lot_unid = new String[] {""} ;
      P00062_n40serv_lot_unid = new boolean[] {false} ;
      P00062_A39serv_lot_idade = new short[1] ;
      P00062_n39serv_lot_idade = new boolean[] {false} ;
      P00062_A37serv_lot_id = new int[1] ;
      P00062_A41serv_lot_foto = new String[] {""} ;
      P00062_n41serv_lot_foto = new boolean[] {false} ;
      A41serv_lot_foto = "" ;
      Gxm1sdt_servlotado = new com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.dp_servidoreslotados__default(),
         new Object[] {
             new Object[] {
            P00062_A7unid_nome, P00062_n7unid_nome, P00062_A6unid_id, P00062_A40serv_lot_unid, P00062_n40serv_lot_unid, P00062_A39serv_lot_idade, P00062_n39serv_lot_idade, P00062_A37serv_lot_id, P00062_A41serv_lot_foto, P00062_n41serv_lot_foto
            }
         }
      );
      /* GeneXus formulas. */
   }

   private short AV8serv_lot_idade ;
   private short AV6PageNumber ;
   private short AV5PageSize ;
   private short AV17Ds_get_servlotado_4_serv_lot_idade ;
   private short A39serv_lot_idade ;
   private int AV7serv_lot_id ;
   private int AV10unid_id ;
   private int AV16Ds_get_servlotado_3_serv_lot_id ;
   private int AV19Ds_get_servlotado_6_unid_id ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A37serv_lot_id ;
   private int A6unid_id ;
   private boolean n7unid_nome ;
   private boolean n40serv_lot_unid ;
   private boolean n39serv_lot_idade ;
   private boolean n41serv_lot_foto ;
   private String AV9serv_lot_unid ;
   private String AV11unid_nome ;
   private String AV18Ds_get_servlotado_5_serv_lot_unid ;
   private String AV20Ds_get_servlotado_7_unid_nome ;
   private String A40serv_lot_unid ;
   private String A7unid_nome ;
   private String A41serv_lot_foto ;
   private GXBaseCollection<com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem>[] aP7 ;
   private GXBaseCollection<com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem> Gxm2rootcol ;
   private IDataStoreProvider pr_default ;
   private String[] P00062_A7unid_nome ;
   private boolean[] P00062_n7unid_nome ;
   private int[] P00062_A6unid_id ;
   private String[] P00062_A40serv_lot_unid ;
   private boolean[] P00062_n40serv_lot_unid ;
   private short[] P00062_A39serv_lot_idade ;
   private boolean[] P00062_n39serv_lot_idade ;
   private int[] P00062_A37serv_lot_id ;
   private String[] P00062_A41serv_lot_foto ;
   private boolean[] P00062_n41serv_lot_foto ;
   private com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem Gxm1sdt_servlotado ;
}

final  class dp_servidoreslotados__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00062( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV16Ds_get_servlotado_3_serv_lot_id ,
                                          short AV17Ds_get_servlotado_4_serv_lot_idade ,
                                          String AV18Ds_get_servlotado_5_serv_lot_unid ,
                                          int AV19Ds_get_servlotado_6_unid_id ,
                                          String AV20Ds_get_servlotado_7_unid_nome ,
                                          int A37serv_lot_id ,
                                          short A39serv_lot_idade ,
                                          String A40serv_lot_unid ,
                                          int A6unid_id ,
                                          String A7unid_nome )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[8];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T2.unid_nome, T1.unid_id, T1.serv_lot_unid, T1.serv_lot_idade, T1.serv_lot_id, T1.serv_lot_foto" ;
      sFromString = " FROM (ServLotado T1 INNER JOIN Unidade T2 ON T2.unid_id = T1.unid_id)" ;
      sOrderString = "" ;
      if ( ! (0==AV16Ds_get_servlotado_3_serv_lot_id) )
      {
         addWhere(sWhereString, "(T1.serv_lot_id = ?)");
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! (0==AV17Ds_get_servlotado_4_serv_lot_idade) )
      {
         addWhere(sWhereString, "(T1.serv_lot_idade = ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18Ds_get_servlotado_5_serv_lot_unid)==0) )
      {
         addWhere(sWhereString, "(T1.serv_lot_unid = ( ?))");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV19Ds_get_servlotado_6_unid_id) )
      {
         addWhere(sWhereString, "(T1.unid_id = ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV20Ds_get_servlotado_7_unid_nome)==0) )
      {
         addWhere(sWhereString, "(T2.unid_nome = ( ?))");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      sOrderString += " ORDER BY T1.unid_id DESC, T1.serv_lot_id" ;
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
                  return conditional_P00062(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00062", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((String[]) buf[8])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 200);
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

