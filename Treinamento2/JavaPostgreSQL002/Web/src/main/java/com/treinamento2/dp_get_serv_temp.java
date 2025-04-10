package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dp_get_serv_temp extends GXProcedure
{
   public dp_get_serv_temp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dp_get_serv_temp.class ), "" );
   }

   public dp_get_serv_temp( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem> executeUdp( int aP0 ,
                                                                                            java.util.Date aP1 ,
                                                                                            java.util.Date aP2 ,
                                                                                            short aP3 ,
                                                                                            short aP4 )
   {
      dp_get_serv_temp.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( int aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        short aP3 ,
                        short aP4 ,
                        GXBaseCollection<com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( int aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             short aP3 ,
                             short aP4 ,
                             GXBaseCollection<com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem>[] aP5 )
   {
      dp_get_serv_temp.this.AV11st_pes_id = aP0;
      dp_get_serv_temp.this.AV12st_data_admissao = aP1;
      dp_get_serv_temp.this.AV13st_data_demissao = aP2;
      dp_get_serv_temp.this.AV14PageNumber = aP3;
      dp_get_serv_temp.this.AV15PageSize = aP4;
      dp_get_serv_temp.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV19Ds_get_serv_temp_3_st_pes_id = AV11st_pes_id ;
      AV20Ds_get_serv_temp_4_st_data_admissao = AV12st_data_admissao ;
      AV21Ds_get_serv_temp_5_st_data_demissao = AV13st_data_demissao ;
      GXPagingFrom2 = AV14PageNumber ;
      GXPagingTo2 = AV15PageSize ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV19Ds_get_serv_temp_3_st_pes_id) ,
                                           AV20Ds_get_serv_temp_4_st_data_admissao ,
                                           AV21Ds_get_serv_temp_5_st_data_demissao ,
                                           Integer.valueOf(A31st_pes_id) ,
                                           A25st_data_admissao ,
                                           A26st_data_demissao } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      /* Using cursor P00042 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV19Ds_get_serv_temp_3_st_pes_id), AV20Ds_get_serv_temp_4_st_data_admissao, AV21Ds_get_serv_temp_5_st_data_demissao, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A26st_data_demissao = P00042_A26st_data_demissao[0] ;
         A25st_data_admissao = P00042_A25st_data_admissao[0] ;
         A31st_pes_id = P00042_A31st_pes_id[0] ;
         Gxm1sdt_serv_temp = (com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem)new com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdt_serv_temp, 0);
         Gxm1sdt_serv_temp.setgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id( A31st_pes_id );
         Gxm1sdt_serv_temp.setgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao( A25st_data_admissao );
         Gxm1sdt_serv_temp.setgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao( A26st_data_demissao );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = dp_get_serv_temp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem>(com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem.class, "Sdt_serv_tempItem", "Treinamento2", remoteHandle);
      AV20Ds_get_serv_temp_4_st_data_admissao = GXutil.nullDate() ;
      AV21Ds_get_serv_temp_5_st_data_demissao = GXutil.nullDate() ;
      A25st_data_admissao = GXutil.nullDate() ;
      A26st_data_demissao = GXutil.nullDate() ;
      P00042_A26st_data_demissao = new java.util.Date[] {GXutil.nullDate()} ;
      P00042_A25st_data_admissao = new java.util.Date[] {GXutil.nullDate()} ;
      P00042_A31st_pes_id = new int[1] ;
      Gxm1sdt_serv_temp = new com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.dp_get_serv_temp__default(),
         new Object[] {
             new Object[] {
            P00042_A26st_data_demissao, P00042_A25st_data_admissao, P00042_A31st_pes_id
            }
         }
      );
      /* GeneXus formulas. */
   }

   private short AV14PageNumber ;
   private short AV15PageSize ;
   private int AV11st_pes_id ;
   private int AV19Ds_get_serv_temp_3_st_pes_id ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A31st_pes_id ;
   private java.util.Date AV12st_data_admissao ;
   private java.util.Date AV13st_data_demissao ;
   private java.util.Date AV20Ds_get_serv_temp_4_st_data_admissao ;
   private java.util.Date AV21Ds_get_serv_temp_5_st_data_demissao ;
   private java.util.Date A25st_data_admissao ;
   private java.util.Date A26st_data_demissao ;
   private GXBaseCollection<com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem>[] aP5 ;
   private GXBaseCollection<com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem> Gxm2rootcol ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P00042_A26st_data_demissao ;
   private java.util.Date[] P00042_A25st_data_admissao ;
   private int[] P00042_A31st_pes_id ;
   private com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem Gxm1sdt_serv_temp ;
}

final  class dp_get_serv_temp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00042( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV19Ds_get_serv_temp_3_st_pes_id ,
                                          java.util.Date AV20Ds_get_serv_temp_4_st_data_admissao ,
                                          java.util.Date AV21Ds_get_serv_temp_5_st_data_demissao ,
                                          int A31st_pes_id ,
                                          java.util.Date A25st_data_admissao ,
                                          java.util.Date A26st_data_demissao )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[6];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " st_data_demissao, st_data_admissao, st_pes_id" ;
      sFromString = " FROM servidor_temporario" ;
      sOrderString = "" ;
      if ( ! (0==AV19Ds_get_serv_temp_3_st_pes_id) )
      {
         addWhere(sWhereString, "(st_pes_id = ?)");
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20Ds_get_serv_temp_4_st_data_admissao)) )
      {
         addWhere(sWhereString, "(st_data_admissao = ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21Ds_get_serv_temp_5_st_data_demissao)) )
      {
         addWhere(sWhereString, "(st_data_demissao = ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      sOrderString += " ORDER BY st_pes_id DESC" ;
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
                  return conditional_P00042(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00042", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
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

