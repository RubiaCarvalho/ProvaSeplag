package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dp_get_unidade extends GXProcedure
{
   public dp_get_unidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dp_get_unidade.class ), "" );
   }

   public dp_get_unidade( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem> executeUdp( int aP0 ,
                                                                                        String aP1 ,
                                                                                        String aP2 ,
                                                                                        short aP3 ,
                                                                                        short aP4 )
   {
      dp_get_unidade.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( int aP0 ,
                        String aP1 ,
                        String aP2 ,
                        short aP3 ,
                        short aP4 ,
                        GXBaseCollection<com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( int aP0 ,
                             String aP1 ,
                             String aP2 ,
                             short aP3 ,
                             short aP4 ,
                             GXBaseCollection<com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem>[] aP5 )
   {
      dp_get_unidade.this.AV8unid_id = aP0;
      dp_get_unidade.this.AV9unid_nome = aP1;
      dp_get_unidade.this.AV10unid_sigla = aP2;
      dp_get_unidade.this.AV11PageNumber = aP3;
      dp_get_unidade.this.AV12PageSize = aP4;
      dp_get_unidade.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV16Ds_get_unidade_3_unid_id = AV8unid_id ;
      AV17Ds_get_unidade_4_unid_nome = AV9unid_nome ;
      AV18Ds_get_unidade_5_unid_sigla = AV10unid_sigla ;
      GXPagingFrom2 = AV11PageNumber ;
      GXPagingTo2 = AV12PageSize ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV16Ds_get_unidade_3_unid_id) ,
                                           AV17Ds_get_unidade_4_unid_nome ,
                                           AV18Ds_get_unidade_5_unid_sigla ,
                                           Integer.valueOf(A6unid_id) ,
                                           A7unid_nome ,
                                           A28unid_sigla } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor P00052 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV16Ds_get_unidade_3_unid_id), AV17Ds_get_unidade_4_unid_nome, AV18Ds_get_unidade_5_unid_sigla, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A28unid_sigla = P00052_A28unid_sigla[0] ;
         n28unid_sigla = P00052_n28unid_sigla[0] ;
         A7unid_nome = P00052_A7unid_nome[0] ;
         n7unid_nome = P00052_n7unid_nome[0] ;
         A6unid_id = P00052_A6unid_id[0] ;
         Gxm1sdt_unidade = (com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem)new com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdt_unidade, 0);
         Gxm1sdt_unidade.setgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id( A6unid_id );
         Gxm1sdt_unidade.setgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome( A7unid_nome );
         Gxm1sdt_unidade.setgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla( A28unid_sigla );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = dp_get_unidade.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem>(com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem.class, "Sdt_unidadeItem", "Treinamento2", remoteHandle);
      AV17Ds_get_unidade_4_unid_nome = "" ;
      AV18Ds_get_unidade_5_unid_sigla = "" ;
      A7unid_nome = "" ;
      A28unid_sigla = "" ;
      P00052_A28unid_sigla = new String[] {""} ;
      P00052_n28unid_sigla = new boolean[] {false} ;
      P00052_A7unid_nome = new String[] {""} ;
      P00052_n7unid_nome = new boolean[] {false} ;
      P00052_A6unid_id = new int[1] ;
      Gxm1sdt_unidade = new com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.dp_get_unidade__default(),
         new Object[] {
             new Object[] {
            P00052_A28unid_sigla, P00052_n28unid_sigla, P00052_A7unid_nome, P00052_n7unid_nome, P00052_A6unid_id
            }
         }
      );
      /* GeneXus formulas. */
   }

   private short AV11PageNumber ;
   private short AV12PageSize ;
   private int AV8unid_id ;
   private int AV16Ds_get_unidade_3_unid_id ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A6unid_id ;
   private boolean n28unid_sigla ;
   private boolean n7unid_nome ;
   private String AV9unid_nome ;
   private String AV10unid_sigla ;
   private String AV17Ds_get_unidade_4_unid_nome ;
   private String AV18Ds_get_unidade_5_unid_sigla ;
   private String A7unid_nome ;
   private String A28unid_sigla ;
   private GXBaseCollection<com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem>[] aP5 ;
   private GXBaseCollection<com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem> Gxm2rootcol ;
   private IDataStoreProvider pr_default ;
   private String[] P00052_A28unid_sigla ;
   private boolean[] P00052_n28unid_sigla ;
   private String[] P00052_A7unid_nome ;
   private boolean[] P00052_n7unid_nome ;
   private int[] P00052_A6unid_id ;
   private com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem Gxm1sdt_unidade ;
}

final  class dp_get_unidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00052( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV16Ds_get_unidade_3_unid_id ,
                                          String AV17Ds_get_unidade_4_unid_nome ,
                                          String AV18Ds_get_unidade_5_unid_sigla ,
                                          int A6unid_id ,
                                          String A7unid_nome ,
                                          String A28unid_sigla )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[6];
      Object[] GXv_Object2 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " unid_sigla, unid_nome, unid_id" ;
      sFromString = " FROM Unidade" ;
      sOrderString = "" ;
      if ( ! (0==AV16Ds_get_unidade_3_unid_id) )
      {
         addWhere(sWhereString, "(unid_id = ?)");
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17Ds_get_unidade_4_unid_nome)==0) )
      {
         addWhere(sWhereString, "(unid_nome = ( ?))");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18Ds_get_unidade_5_unid_sigla)==0) )
      {
         addWhere(sWhereString, "(unid_sigla = ( ?))");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      sOrderString += " ORDER BY unid_id DESC" ;
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
                  return conditional_P00052(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00052", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
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
                  stmt.setVarchar(sIdx, (String)parms[7], 200);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 20);
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

