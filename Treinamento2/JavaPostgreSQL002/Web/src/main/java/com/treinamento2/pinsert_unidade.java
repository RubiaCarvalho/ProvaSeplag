package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsert_unidade extends GXProcedure
{
   public pinsert_unidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsert_unidade.class ), "" );
   }

   public pinsert_unidade( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem aP0 )
   {
      pinsert_unidade.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      pinsert_unidade.this.AV20Sdt_unidade = aP0;
      pinsert_unidade.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV19bc_Unidade = (com.treinamento2.SdtUnidade)new com.treinamento2.SdtUnidade( remoteHandle, context);
      AV19bc_Unidade.setgxTv_SdtUnidade_Unid_id( AV20Sdt_unidade.getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id() );
      AV19bc_Unidade.setgxTv_SdtUnidade_Unid_nome( AV20Sdt_unidade.getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome() );
      AV19bc_Unidade.setgxTv_SdtUnidade_Unid_sigla( AV20Sdt_unidade.getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla() );
      if ( AV19bc_Unidade.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pinsert_unidade");
      }
      else
      {
         AV13Messages = AV19bc_Unidade.GetMessages() ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pinsert_unidade.this.AV13Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV19bc_Unidade = new com.treinamento2.SdtUnidade(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.pinsert_unidade__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem AV20Sdt_unidade ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV13Messages ;
   private com.treinamento2.SdtUnidade AV19bc_Unidade ;
   private IDataStoreProvider pr_default ;
}

final  class pinsert_unidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

