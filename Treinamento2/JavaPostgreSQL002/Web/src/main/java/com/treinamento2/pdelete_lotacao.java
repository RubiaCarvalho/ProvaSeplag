package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelete_lotacao extends GXProcedure
{
   public pdelete_lotacao( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelete_lotacao.class ), "" );
   }

   public pdelete_lotacao( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( int aP0 )
   {
      pdelete_lotacao.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
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
      pdelete_lotacao.this.AV11lot_id = aP0;
      pdelete_lotacao.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      AV8bc_lotacao.Load(AV11lot_id);
      AV8bc_lotacao.Delete();
      if ( AV8bc_lotacao.Success() )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pdelete_lotacao");
      }
      else
      {
         AV10Messages = AV8bc_lotacao.GetMessages() ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pdelete_lotacao.this.AV10Messages;
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
      AV8bc_lotacao = new com.treinamento2.Sdtlotacao(remoteHandle);
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.pdelete_lotacao__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
   }

   private int AV11lot_id ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Messages ;
   private com.treinamento2.Sdtlotacao AV8bc_lotacao ;
   private IDataStoreProvider pr_default ;
}

final  class pdelete_lotacao__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

