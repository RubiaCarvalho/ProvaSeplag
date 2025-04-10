package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsert_serv_efet extends GXProcedure
{
   public pinsert_serv_efet( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsert_serv_efet.class ), "" );
   }

   public pinsert_serv_efet( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem aP0 )
   {
      pinsert_serv_efet.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      pinsert_serv_efet.this.AV14sdt_serv_efet = aP0;
      pinsert_serv_efet.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle) ;
      AV13bc_servidor_efetivo = (com.treinamento2.Sdtservidor_efetivo)new com.treinamento2.Sdtservidor_efetivo( remoteHandle, context);
      AV13bc_servidor_efetivo.setgxTv_Sdtservidor_efetivo_Se_pes_id( AV14sdt_serv_efet.getgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id() );
      AV13bc_servidor_efetivo.setgxTv_Sdtservidor_efetivo_Se_matricula( AV14sdt_serv_efet.getgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula() );
      AV13bc_servidor_efetivo.Save();
      if ( AV13bc_servidor_efetivo.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pinsert_serv_efet");
      }
      else
      {
         AV8Messages = AV13bc_servidor_efetivo.GetMessages() ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pinsert_serv_efet.this.AV8Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV13bc_servidor_efetivo = new com.treinamento2.Sdtservidor_efetivo(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.pinsert_serv_efet__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem AV14sdt_serv_efet ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private com.treinamento2.Sdtservidor_efetivo AV13bc_servidor_efetivo ;
   private IDataStoreProvider pr_default ;
}

final  class pinsert_serv_efet__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

