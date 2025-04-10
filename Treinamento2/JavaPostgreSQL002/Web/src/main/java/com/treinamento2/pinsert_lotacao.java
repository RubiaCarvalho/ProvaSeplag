package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsert_lotacao extends GXProcedure
{
   public pinsert_lotacao( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsert_lotacao.class ), "" );
   }

   public pinsert_lotacao( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem aP0 )
   {
      pinsert_lotacao.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      pinsert_lotacao.this.AV18sdt_Lotacao = aP0;
      pinsert_lotacao.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV8bc_Lotacao = (com.treinamento2.Sdtlotacao)new com.treinamento2.Sdtlotacao( remoteHandle, context);
      AV8bc_Lotacao.setgxTv_Sdtlotacao_Pes_id( AV18sdt_Lotacao.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id() );
      AV8bc_Lotacao.setgxTv_Sdtlotacao_Unid_id( AV18sdt_Lotacao.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id() );
      AV8bc_Lotacao.setgxTv_Sdtlotacao_Lot_data_lotacao( AV18sdt_Lotacao.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao() );
      AV8bc_Lotacao.setgxTv_Sdtlotacao_Lot_data_remocao( AV18sdt_Lotacao.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao() );
      AV8bc_Lotacao.setgxTv_Sdtlotacao_Lot_portaria( AV18sdt_Lotacao.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria() );
      AV8bc_Lotacao.Save();
      if ( AV8bc_Lotacao.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pinsert_lotacao");
      }
      else
      {
         AV9Messages = AV8bc_Lotacao.GetMessages() ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pinsert_lotacao.this.AV9Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV8bc_Lotacao = new com.treinamento2.Sdtlotacao(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.pinsert_lotacao__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem AV18sdt_Lotacao ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private com.treinamento2.Sdtlotacao AV8bc_Lotacao ;
   private IDataStoreProvider pr_default ;
}

final  class pinsert_lotacao__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

