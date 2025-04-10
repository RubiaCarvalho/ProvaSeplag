package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupdate_serv_temp extends GXProcedure
{
   public pupdate_serv_temp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupdate_serv_temp.class ), "" );
   }

   public pupdate_serv_temp( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem aP0 )
   {
      pupdate_serv_temp.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      pupdate_serv_temp.this.AV13sdt_serv_temp = aP0;
      pupdate_serv_temp.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV12bc_servidor_temp.Load(AV13sdt_serv_temp.getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id());
      AV12bc_servidor_temp.setgxTv_Sdtservidor_temporario_St_data_admissao( AV13sdt_serv_temp.getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao() );
      AV12bc_servidor_temp.setgxTv_Sdtservidor_temporario_St_data_demissao( AV13sdt_serv_temp.getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao() );
      AV12bc_servidor_temp.Save();
      if ( AV12bc_servidor_temp.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pupdate_serv_temp");
      }
      else
      {
         AV8Messages = AV12bc_servidor_temp.GetMessages() ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pupdate_serv_temp.this.AV8Messages;
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
      AV12bc_servidor_temp = new com.treinamento2.Sdtservidor_temporario(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.pupdate_serv_temp__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem AV13sdt_serv_temp ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private com.treinamento2.Sdtservidor_temporario AV12bc_servidor_temp ;
   private IDataStoreProvider pr_default ;
}

final  class pupdate_serv_temp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

