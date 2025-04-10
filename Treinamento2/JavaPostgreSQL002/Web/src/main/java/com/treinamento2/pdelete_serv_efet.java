package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelete_serv_efet extends GXProcedure
{
   public pdelete_serv_efet( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelete_serv_efet.class ), "" );
   }

   public pdelete_serv_efet( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 )
   {
      pdelete_serv_efet.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( int aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( int aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      pdelete_serv_efet.this.AV12se_pes_id = aP0;
      pdelete_serv_efet.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV8bc_serv_efet.Load(AV12se_pes_id);
      AV8bc_serv_efet.Delete();
      if ( AV8bc_serv_efet.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pdelete_serv_efet");
      }
      else
      {
         AV10Messages = AV8bc_serv_efet.GetMessages() ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pdelete_serv_efet.this.AV10Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV8bc_serv_efet = new com.treinamento2.Sdtservidor_efetivo(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.pdelete_serv_efet__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private int AV12se_pes_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private com.treinamento2.Sdtservidor_efetivo AV8bc_serv_efet ;
   private IDataStoreProvider pr_default ;
}

final  class pdelete_serv_efet__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

