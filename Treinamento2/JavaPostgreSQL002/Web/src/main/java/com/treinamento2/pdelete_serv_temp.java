package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelete_serv_temp extends GXProcedure
{
   public pdelete_serv_temp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelete_serv_temp.class ), "" );
   }

   public pdelete_serv_temp( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 )
   {
      pdelete_serv_temp.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      pdelete_serv_temp.this.AV11st_pes_id = aP0;
      pdelete_serv_temp.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV9bc_serv_temp.Load(AV11st_pes_id);
      AV9bc_serv_temp.Delete();
      if ( AV9bc_serv_temp.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pdelete_serv_temp");
      }
      else
      {
         AV8Messages = AV9bc_serv_temp.GetMessages() ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pdelete_serv_temp.this.AV8Messages;
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
      AV9bc_serv_temp = new com.treinamento2.Sdtservidor_temporario(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.pdelete_serv_temp__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private int AV11st_pes_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private com.treinamento2.Sdtservidor_temporario AV9bc_serv_temp ;
   private IDataStoreProvider pr_default ;
}

final  class pdelete_serv_temp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

