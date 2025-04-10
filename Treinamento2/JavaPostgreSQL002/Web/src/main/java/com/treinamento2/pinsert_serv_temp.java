package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsert_serv_temp extends GXProcedure
{
   public pinsert_serv_temp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsert_serv_temp.class ), "" );
   }

   public pinsert_serv_temp( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem aP0 )
   {
      pinsert_serv_temp.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      pinsert_serv_temp.this.AV8sdt_serv_temp = aP0;
      pinsert_serv_temp.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV9Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle) ;
      AV10bc_servidor_temp = (com.treinamento2.Sdtservidor_temporario)new com.treinamento2.Sdtservidor_temporario( remoteHandle, context);
      AV10bc_servidor_temp.setgxTv_Sdtservidor_temporario_St_pes_id( AV8sdt_serv_temp.getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id() );
      AV10bc_servidor_temp.setgxTv_Sdtservidor_temporario_St_data_admissao( AV8sdt_serv_temp.getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao() );
      AV10bc_servidor_temp.setgxTv_Sdtservidor_temporario_St_data_demissao( AV8sdt_serv_temp.getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao() );
      AV10bc_servidor_temp.Save();
      if ( AV10bc_servidor_temp.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pinsert_serv_temp");
      }
      else
      {
         AV9Messages = AV10bc_servidor_temp.GetMessages() ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pinsert_serv_temp.this.AV9Messages;
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
      AV10bc_servidor_temp = new com.treinamento2.Sdtservidor_temporario(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.pinsert_serv_temp__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem AV8sdt_serv_temp ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private com.treinamento2.Sdtservidor_temporario AV10bc_servidor_temp ;
   private IDataStoreProvider pr_default ;
}

final  class pinsert_serv_temp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

