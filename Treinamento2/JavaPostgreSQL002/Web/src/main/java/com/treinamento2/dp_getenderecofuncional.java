package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dp_getenderecofuncional extends GXProcedure
{
   public dp_getenderecofuncional( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dp_getenderecofuncional.class ), "" );
   }

   public dp_getenderecofuncional( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem> executeUdp( short aP0 ,
                                                                                                  int aP1 ,
                                                                                                  int aP2 ,
                                                                                                  short aP3 ,
                                                                                                  short aP4 )
   {
      dp_getenderecofuncional.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( short aP0 ,
                        int aP1 ,
                        int aP2 ,
                        short aP3 ,
                        short aP4 ,
                        GXBaseCollection<com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( short aP0 ,
                             int aP1 ,
                             int aP2 ,
                             short aP3 ,
                             short aP4 ,
                             GXBaseCollection<com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem>[] aP5 )
   {
      dp_getenderecofuncional.this.AV8end_funcional_id = aP0;
      dp_getenderecofuncional.this.AV9unidade_id = aP1;
      dp_getenderecofuncional.this.AV10endereco_id = aP2;
      dp_getenderecofuncional.this.AV6PageNumber = aP3;
      dp_getenderecofuncional.this.AV5PageSize = aP4;
      dp_getenderecofuncional.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV14Ds_getenderecofuncional_3_end_funcional_id = AV8end_funcional_id ;
      AV15Ds_getenderecofuncional_4_unidade_id = AV9unidade_id ;
      AV16Ds_getenderecofuncional_5_endereco_id = AV10endereco_id ;
      GXPagingFrom2 = AV6PageNumber ;
      GXPagingTo2 = AV5PageSize ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV14Ds_getenderecofuncional_3_end_funcional_id) ,
                                           Integer.valueOf(AV15Ds_getenderecofuncional_4_unidade_id) ,
                                           Integer.valueOf(AV16Ds_getenderecofuncional_5_endereco_id) ,
                                           Short.valueOf(A42end_funcional_id) ,
                                           Integer.valueOf(A33unidade_id) ,
                                           Integer.valueOf(A30endereco_id) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      /* Using cursor P00072 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV14Ds_getenderecofuncional_3_end_funcional_id), Integer.valueOf(AV15Ds_getenderecofuncional_4_unidade_id), Integer.valueOf(AV16Ds_getenderecofuncional_5_endereco_id), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30endereco_id = P00072_A30endereco_id[0] ;
         A33unidade_id = P00072_A33unidade_id[0] ;
         A42end_funcional_id = P00072_A42end_funcional_id[0] ;
         A30endereco_id = P00072_A30endereco_id[0] ;
         Gxm1sdt_endfuncional = (com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem)new com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdt_endfuncional, 0);
         Gxm1sdt_endfuncional.setgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id( A42end_funcional_id );
         Gxm1sdt_endfuncional.setgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id( A33unidade_id );
         Gxm1sdt_endfuncional.setgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id( A30endereco_id );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = dp_getenderecofuncional.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem>(com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem.class, "SDT_EndFuncionalItem", "Treinamento2", remoteHandle);
      P00072_A30endereco_id = new int[1] ;
      P00072_A33unidade_id = new int[1] ;
      P00072_A42end_funcional_id = new short[1] ;
      Gxm1sdt_endfuncional = new com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.dp_getenderecofuncional__default(),
         new Object[] {
             new Object[] {
            P00072_A30endereco_id, P00072_A33unidade_id, P00072_A42end_funcional_id
            }
         }
      );
      /* GeneXus formulas. */
   }

   private short AV8end_funcional_id ;
   private short AV6PageNumber ;
   private short AV5PageSize ;
   private short AV14Ds_getenderecofuncional_3_end_funcional_id ;
   private short A42end_funcional_id ;
   private int AV9unidade_id ;
   private int AV10endereco_id ;
   private int AV15Ds_getenderecofuncional_4_unidade_id ;
   private int AV16Ds_getenderecofuncional_5_endereco_id ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A33unidade_id ;
   private int A30endereco_id ;
   private GXBaseCollection<com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem>[] aP5 ;
   private GXBaseCollection<com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem> Gxm2rootcol ;
   private IDataStoreProvider pr_default ;
   private int[] P00072_A30endereco_id ;
   private int[] P00072_A33unidade_id ;
   private short[] P00072_A42end_funcional_id ;
   private com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem Gxm1sdt_endfuncional ;
}

final  class dp_getenderecofuncional__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00072( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV14Ds_getenderecofuncional_3_end_funcional_id ,
                                          int AV15Ds_getenderecofuncional_4_unidade_id ,
                                          int AV16Ds_getenderecofuncional_5_endereco_id ,
                                          short A42end_funcional_id ,
                                          int A33unidade_id ,
                                          int A30endereco_id )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[6];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T2.endereco_id, T1.unidade_id, T1.end_funcional_id" ;
      sFromString = " FROM (End_Funcional T1 INNER JOIN unidade_endereco T2 ON T2.unidade_id = T1.unidade_id)" ;
      sOrderString = "" ;
      if ( ! (0==AV14Ds_getenderecofuncional_3_end_funcional_id) )
      {
         addWhere(sWhereString, "(T1.end_funcional_id = ?)");
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! (0==AV15Ds_getenderecofuncional_4_unidade_id) )
      {
         addWhere(sWhereString, "(T1.unidade_id = ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV16Ds_getenderecofuncional_5_endereco_id) )
      {
         addWhere(sWhereString, "(T2.endereco_id = ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      sOrderString += " ORDER BY T1.end_funcional_id DESC" ;
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
                  return conditional_P00072(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00072", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
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
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
      }
   }

}

