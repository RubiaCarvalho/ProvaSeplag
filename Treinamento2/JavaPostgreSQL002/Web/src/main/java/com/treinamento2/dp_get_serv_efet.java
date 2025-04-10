package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dp_get_serv_efet extends GXProcedure
{
   public dp_get_serv_efet( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dp_get_serv_efet.class ), "" );
   }

   public dp_get_serv_efet( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem> executeUdp( int aP0 ,
                                                                                            String aP1 ,
                                                                                            short aP2 ,
                                                                                            short aP3 )
   {
      dp_get_serv_efet.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( int aP0 ,
                        String aP1 ,
                        short aP2 ,
                        short aP3 ,
                        GXBaseCollection<com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( int aP0 ,
                             String aP1 ,
                             short aP2 ,
                             short aP3 ,
                             GXBaseCollection<com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem>[] aP4 )
   {
      dp_get_serv_efet.this.AV10se_pes_id = aP0;
      dp_get_serv_efet.this.AV11se_matricula = aP1;
      dp_get_serv_efet.this.AV9PageNumber = aP2;
      dp_get_serv_efet.this.AV8PageSize = aP3;
      dp_get_serv_efet.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV15Ds_get_serv_efet_3_se_pes_id = AV10se_pes_id ;
      AV16Ds_get_serv_efet_4_se_matricula = AV11se_matricula ;
      GXPagingFrom2 = AV9PageNumber ;
      GXPagingTo2 = AV8PageSize ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV15Ds_get_serv_efet_3_se_pes_id) ,
                                           AV16Ds_get_serv_efet_4_se_matricula ,
                                           Integer.valueOf(A32se_pes_id) ,
                                           A27se_matricula } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor P00032 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV15Ds_get_serv_efet_3_se_pes_id), AV16Ds_get_serv_efet_4_se_matricula, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A27se_matricula = P00032_A27se_matricula[0] ;
         n27se_matricula = P00032_n27se_matricula[0] ;
         A32se_pes_id = P00032_A32se_pes_id[0] ;
         Gxm1sdt_serv_efet = (com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem)new com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdt_serv_efet, 0);
         Gxm1sdt_serv_efet.setgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id( A32se_pes_id );
         Gxm1sdt_serv_efet.setgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula( A27se_matricula );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = dp_get_serv_efet.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem>(com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem.class, "Sdt_serv_efetItem", "Treinamento2", remoteHandle);
      AV16Ds_get_serv_efet_4_se_matricula = "" ;
      A27se_matricula = "" ;
      P00032_A27se_matricula = new String[] {""} ;
      P00032_n27se_matricula = new boolean[] {false} ;
      P00032_A32se_pes_id = new int[1] ;
      Gxm1sdt_serv_efet = new com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.dp_get_serv_efet__default(),
         new Object[] {
             new Object[] {
            P00032_A27se_matricula, P00032_n27se_matricula, P00032_A32se_pes_id
            }
         }
      );
      /* GeneXus formulas. */
   }

   private short AV9PageNumber ;
   private short AV8PageSize ;
   private int AV10se_pes_id ;
   private int AV15Ds_get_serv_efet_3_se_pes_id ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A32se_pes_id ;
   private boolean n27se_matricula ;
   private String AV11se_matricula ;
   private String AV16Ds_get_serv_efet_4_se_matricula ;
   private String A27se_matricula ;
   private GXBaseCollection<com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem>[] aP4 ;
   private GXBaseCollection<com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem> Gxm2rootcol ;
   private IDataStoreProvider pr_default ;
   private String[] P00032_A27se_matricula ;
   private boolean[] P00032_n27se_matricula ;
   private int[] P00032_A32se_pes_id ;
   private com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem Gxm1sdt_serv_efet ;
}

final  class dp_get_serv_efet__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00032( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV15Ds_get_serv_efet_3_se_pes_id ,
                                          String AV16Ds_get_serv_efet_4_se_matricula ,
                                          int A32se_pes_id ,
                                          String A27se_matricula )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[5];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " se_matricula, se_pes_id" ;
      sFromString = " FROM servidor_efetivo" ;
      sOrderString = "" ;
      if ( ! (0==AV15Ds_get_serv_efet_3_se_pes_id) )
      {
         addWhere(sWhereString, "(se_pes_id = ?)");
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16Ds_get_serv_efet_4_se_matricula)==0) )
      {
         addWhere(sWhereString, "(se_matricula = ( ?))");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      sOrderString += " ORDER BY se_pes_id DESC" ;
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
                  return conditional_P00032(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00032", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 20);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               return;
      }
   }

}

