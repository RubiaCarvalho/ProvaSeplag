package com.treinamento2 ;
import com.treinamento2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.util.*;

public final  class reorg extends GXProcedure
{
   public reorg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( reorg.class ), "" );
   }

   public reorg( int remoteHandle ,
                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      if ( previousCheck() )
      {
         executeReorganization( ) ;
      }
   }

   private void FirstActions( )
   {
      /* Load data into tables. */
   }

   public void CreateServLotado( ) throws SQLException
   {
      String cmdBufferCreate = "";
      String cmdBuffer = "";
      /* Indices for table ServLotado */
      try
      {
         cmdBuffer = " CREATE SEQUENCE serv_lot_id MINVALUE 1 INCREMENT 1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         cmdBuffer = " DROP SEQUENCE serv_lot_id CASCADE ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         cmdBuffer = " CREATE SEQUENCE serv_lot_id MINVALUE 1 INCREMENT 1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      try
      {
         cmdBufferCreate = " CREATE TABLE ServLotado (serv_lot_id integer NOT NULL DEFAULT nextval('serv_lot_id'), serv_lot_idade smallint , serv_lot_unid VARCHAR(40) , serv_lot_foto VARCHAR(40) ";
         cmdBufferCreate += "  , unid_id integer NOT NULL , PRIMARY KEY(serv_lot_id))  ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " DROP TABLE ServLotado CASCADE ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
            try
            {
               cmdBuffer = " DROP VIEW ServLotado CASCADE ";
               ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
            }
            catch(SQLException sqlex2)
            {
               try
               {
                  cmdBuffer = " DROP FUNCTION ServLotado CASCADE ";
                  ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
               }
               catch(SQLException sqlex3)
               {
               }
            }
         }
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBufferCreate) ;
      }
      try
      {
         cmdBuffer = " CREATE INDEX ISERVLOTADO1 ON ServLotado (unid_id ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         cmdBuffer = " DROP INDEX ISERVLOTADO1 ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         cmdBuffer = " CREATE INDEX ISERVLOTADO1 ON ServLotado (unid_id ) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   public void RIServLotadoUnidade( ) throws SQLException
   {
      String cmdBuffer;
      try
      {
         cmdBuffer = " ALTER TABLE ServLotado ADD CONSTRAINT ISERVLOTADO1 FOREIGN KEY (unid_id) REFERENCES Unidade (unid_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
      catch(SQLException ex)
      {
         try
         {
            cmdBuffer = " ALTER TABLE ServLotado DROP CONSTRAINT ISERVLOTADO1 ";
            ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
         }
         catch(SQLException sqlex1)
         {
         }
         cmdBuffer = " ALTER TABLE ServLotado ADD CONSTRAINT ISERVLOTADO1 FOREIGN KEY (unid_id) REFERENCES Unidade (unid_id) ";
         ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      }
   }

   private void tablesCount( )
   {
   }

   private boolean previousCheck( )
   {
      if ( ! GXReorganization.mustRunCheck( ) )
      {
         return true ;
      }
      sSchemaVar = context.getUserId( "Server", remoteHandle, pr_default) ;
      if ( tableexist("ServLotado",sSchemaVar) )
      {
         GXReorganization.setCheckError ( localUtil.getMessages().getMessage("GXM_table_exist", new Object[] {"ServLotado"}) ) ;
         return false ;
      }
      return true ;
   }

   private boolean tableexist( String sTableName ,
                               String sMySchemaName )
   {
      boolean result;
      result = false ;
      /* Using cursor P00012 */
      pr_default.execute(0, new Object[] {sTableName, sMySchemaName});
      while ( (pr_default.getStatus(0) != 101) )
      {
         tablename = P00012_Atablename[0] ;
         ntablename = P00012_ntablename[0] ;
         schemaname = P00012_Aschemaname[0] ;
         nschemaname = P00012_nschemaname[0] ;
         result = true ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P00023 */
      pr_default.execute(1, new Object[] {sTableName, sMySchemaName});
      while ( (pr_default.getStatus(1) != 101) )
      {
         tablename = P00023_Atablename[0] ;
         ntablename = P00023_ntablename[0] ;
         schemaname = P00023_Aschemaname[0] ;
         nschemaname = P00023_nschemaname[0] ;
         result = true ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      return result ;
   }

   private void executeOnlyTablesReorganization( )
   {
      callSubmit( "CreateServLotado" ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"ServLotado",""}) ,  1 , new Object[]{ });
   }

   private void executeOnlyRisReorganization( )
   {
      callSubmit( "RIServLotadoUnidade" ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ISERVLOTADO1"}) ,  2 , new Object[]{ });
   }

   private void executeTablesReorganization( )
   {
      executeOnlyTablesReorganization( ) ;
      executeOnlyRisReorganization( ) ;
      ReorgSubmitThreadPool.startProcess();
   }

   private void setPrecedence( )
   {
      setPrecedencetables( ) ;
      setPrecedenceris( ) ;
   }

   private void setPrecedencetables( )
   {
      GXReorganization.addMsg( 1 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"ServLotado",""}) );
      ReorgSubmitThreadPool.addBlock( "CreateServLotado" );
   }

   private void setPrecedenceris( )
   {
      GXReorganization.addMsg( 2 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ISERVLOTADO1"}) );
      ReorgSubmitThreadPool.addBlock( "RIServLotadoUnidade" );
      ReorgSubmitThreadPool.addPrecedence( "RIServLotadoUnidade" ,  "CreateServLotado" );
   }

   private void executeReorganization( )
   {
      if ( ErrCode == 0 )
      {
         tablesCount( ) ;
         if ( ! GXReorganization.getRecordCount( ) )
         {
            FirstActions( ) ;
            setPrecedence( ) ;
            executeTablesReorganization( ) ;
         }
      }
   }

   public void UtilsCleanup( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void submitReorg( int submitId ,
                            Object [] submitParms ) throws SQLException
   {
      UserInformation submitUI = Application.getConnectionManager().createUserInformation(Namespace.getNamespace(context.getNAME_SPACE()));
      switch ( submitId )
      {
            case 1 :
               GXReorganization.replaceMsg( 1 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"ServLotado",""})+" STARTED" );
               CreateServLotado( ) ;
               GXReorganization.replaceMsg( 1 ,  localUtil.getMessages().getMessage("GXM_filecrea", new Object[] {"ServLotado",""})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
            case 2 :
               GXReorganization.replaceMsg( 2 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ISERVLOTADO1"})+" STARTED" );
               RIServLotadoUnidade( ) ;
               GXReorganization.replaceMsg( 2 ,  localUtil.getMessages().getMessage("GXM_refintcrea", new Object[] {"ISERVLOTADO1"})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
      }
   }

   public void initialize( )
   {
      sSchemaVar = "" ;
      sTableName = "" ;
      sMySchemaName = "" ;
      tablename = "" ;
      ntablename = false ;
      schemaname = "" ;
      nschemaname = false ;
      P00012_Atablename = new String[] {""} ;
      P00012_ntablename = new boolean[] {false} ;
      P00012_Aschemaname = new String[] {""} ;
      P00012_nschemaname = new boolean[] {false} ;
      P00023_Atablename = new String[] {""} ;
      P00023_ntablename = new boolean[] {false} ;
      P00023_Aschemaname = new String[] {""} ;
      P00023_nschemaname = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.treinamento2.reorg__default(),
         new Object[] {
             new Object[] {
            P00012_Atablename, P00012_Aschemaname
            }
            , new Object[] {
            P00023_Atablename, P00023_Aschemaname
            }
         }
      );
      /* GeneXus formulas. */
   }

   protected short ErrCode ;
   protected String sSchemaVar ;
   protected String sTableName ;
   protected String sMySchemaName ;
   protected boolean ntablename ;
   protected boolean nschemaname ;
   protected String tablename ;
   protected String schemaname ;
   protected IDataStoreProvider pr_default ;
   protected String[] P00012_Atablename ;
   protected boolean[] P00012_ntablename ;
   protected String[] P00012_Aschemaname ;
   protected boolean[] P00012_nschemaname ;
   protected String[] P00023_Atablename ;
   protected boolean[] P00023_ntablename ;
   protected String[] P00023_Aschemaname ;
   protected boolean[] P00023_nschemaname ;
}

final  class reorg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00012", "SELECT TABLENAME, TABLEOWNER FROM PG_TABLES WHERE (UPPER(TABLENAME) = ( UPPER(?))) AND (UPPER(TABLEOWNER) = ( UPPER(?))) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00023", "SELECT VIEWNAME, VIEWOWNER FROM PG_VIEWS WHERE (UPPER(VIEWNAME) = ( UPPER(?))) AND (UPPER(VIEWOWNER) = ( UPPER(?))) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 255);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 255);
               return;
      }
   }

}

