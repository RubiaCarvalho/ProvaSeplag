package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupdate_lotacao extends GXProcedure
{
   public pupdate_lotacao( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupdate_lotacao.class ), "" );
   }

   public pupdate_lotacao( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem aP0 )
   {
      pupdate_lotacao.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      pupdate_lotacao.this.AV11sdt_lotacao = aP0;
      pupdate_lotacao.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV10bc_lotacao.Load(AV11sdt_lotacao.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id());
      AV10bc_lotacao.setgxTv_Sdtlotacao_Pes_id( AV11sdt_lotacao.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id() );
      AV10bc_lotacao.setgxTv_Sdtlotacao_Unid_id( AV11sdt_lotacao.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id() );
      AV10bc_lotacao.setgxTv_Sdtlotacao_Lot_data_lotacao( AV11sdt_lotacao.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao() );
      AV10bc_lotacao.setgxTv_Sdtlotacao_Lot_data_remocao( AV11sdt_lotacao.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao() );
      AV10bc_lotacao.setgxTv_Sdtlotacao_Lot_portaria( AV11sdt_lotacao.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria() );
      AV10bc_lotacao.Save();
      if ( AV10bc_lotacao.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pupdate_lotacao");
      }
      else
      {
         AV12Messages = AV10bc_lotacao.GetMessages() ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pupdate_lotacao.this.AV12Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV10bc_lotacao = new com.treinamento2.Sdtlotacao(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.pupdate_lotacao__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem AV11sdt_lotacao ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV12Messages ;
   private com.treinamento2.Sdtlotacao AV10bc_lotacao ;
   private IDataStoreProvider pr_default ;
}

final  class pupdate_lotacao__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

