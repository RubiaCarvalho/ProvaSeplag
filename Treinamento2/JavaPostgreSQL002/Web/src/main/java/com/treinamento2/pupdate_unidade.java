package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupdate_unidade extends GXProcedure
{
   public pupdate_unidade( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupdate_unidade.class ), "" );
   }

   public pupdate_unidade( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem aP0 )
   {
      pupdate_unidade.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      pupdate_unidade.this.AV14Sdt_unidade = aP0;
      pupdate_unidade.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV13bc_Unidade.Load(AV13bc_Unidade.getgxTv_SdtUnidade_Unid_id());
      AV13bc_Unidade.setgxTv_SdtUnidade_Unid_nome( AV14Sdt_unidade.getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome() );
      AV13bc_Unidade.setgxTv_SdtUnidade_Unid_sigla( AV14Sdt_unidade.getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla() );
      AV13bc_Unidade.Save();
      if ( AV13bc_Unidade.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pupdate_unidade");
      }
      else
      {
         AV12Messages = AV13bc_Unidade.GetMessages() ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pupdate_unidade.this.AV12Messages;
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
      AV13bc_Unidade = new com.treinamento2.SdtUnidade(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.pupdate_unidade__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem AV14Sdt_unidade ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV12Messages ;
   private com.treinamento2.SdtUnidade AV13bc_Unidade ;
   private IDataStoreProvider pr_default ;
}

final  class pupdate_unidade__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

