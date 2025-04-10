package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class api_client_rest extends GXProcedure
{
   public api_client_rest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( api_client_rest.class ), "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public api_client_rest( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
      initialize();
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public api_client_rest( int remoteHandle ,
                           ModelContext context ,
                           com.genexus.properties.GXObjectProperties objectProperties )
   {
      super( remoteHandle , context, "" );
      initialize();
      this.setObjProperties(objectProperties);
      restLocation = gxProperties.getLocation();
   }

   public void execute( )
   {
      cleanup();
   }

   public void InitLocation( )
   {
      restLocation = new com.genexus.internet.Location() ;
      restLocation.setHost( "localhost" );
      restLocation.setPort( 8080 );
      restLocation.setBaseURL( "Treinamento2JavaPostgreSQL/API" );
      gxProperties = new com.genexus.properties.GXObjectProperties() ;
   }

   public com.genexus.properties.GXObjectProperties getObjProperties( )
   {
      return gxProperties ;
   }

   public void setObjProperties(  com.genexus.properties.GXObjectProperties Value )
   {
      gxProperties = Value ;
   }


   public void gxep_insert_lotacao( com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem in_AV10sdt_lotacao ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliInsert_Lotacao = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Insert_Lotacao" );
      restCliInsert_Lotacao.setLocation( restLocation );
      restCliInsert_Lotacao.setHttpMethod( "POST" );
      restCliInsert_Lotacao.addBodyVar("sdt_lotacao", in_AV10sdt_lotacao);
      restCliInsert_Lotacao.RestExecute();
      if ( restCliInsert_Lotacao.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliInsert_Lotacao.getErrorCode() );
         gxProperties.setErrorMessage( restCliInsert_Lotacao.getErrorMessage() );
         gxProperties.setStatusCode( restCliInsert_Lotacao.getStatusCode() );
      }
      else
      {
         arr_AV5Messages[0] = restCliInsert_Lotacao.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Insert_Lotacao Constructor */
   }

   public void gxep_update_lotacao( com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem in_AV10sdt_lotacao ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliUpdate_Lotacao = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Update_Lotacao" );
      restCliUpdate_Lotacao.setLocation( restLocation );
      restCliUpdate_Lotacao.setHttpMethod( "PUT" );
      restCliUpdate_Lotacao.addBodyVar("sdt_lotacao", in_AV10sdt_lotacao);
      restCliUpdate_Lotacao.RestExecute();
      if ( restCliUpdate_Lotacao.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliUpdate_Lotacao.getErrorCode() );
         gxProperties.setErrorMessage( restCliUpdate_Lotacao.getErrorMessage() );
         gxProperties.setStatusCode( restCliUpdate_Lotacao.getStatusCode() );
      }
      else
      {
         arr_AV5Messages[0] = restCliUpdate_Lotacao.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Update_Lotacao Constructor */
   }

   public void gxep_delete_lotacao( com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem in_AV10sdt_lotacao ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliDelete_Lotacao = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Delete_Lotacao" );
      restCliDelete_Lotacao.setLocation( restLocation );
      restCliDelete_Lotacao.setHttpMethod( "DELETE" );
      restCliDelete_Lotacao.addQueryVar("Sdt_lotacao", in_AV10sdt_lotacao);
      restCliDelete_Lotacao.RestExecute();
      if ( restCliDelete_Lotacao.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliDelete_Lotacao.getErrorCode() );
         gxProperties.setErrorMessage( restCliDelete_Lotacao.getErrorMessage() );
         gxProperties.setStatusCode( restCliDelete_Lotacao.getStatusCode() );
      }
      else
      {
         arr_AV5Messages[0] = restCliDelete_Lotacao.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Delete_Lotacao Constructor */
   }

   public void gxep_get_lotacao( com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem in_AV10sdt_lotacao )
   {
      restCliGet_Lotacao = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Get_Lotacao" );
      restCliGet_Lotacao.setLocation( restLocation );
      restCliGet_Lotacao.setHttpMethod( "GET" );
      restCliGet_Lotacao.addQueryVar("Sdt_lotacao", in_AV10sdt_lotacao);
      restCliGet_Lotacao.RestExecute();
      if ( restCliGet_Lotacao.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliGet_Lotacao.getErrorCode() );
         gxProperties.setErrorMessage( restCliGet_Lotacao.getErrorMessage() );
         gxProperties.setStatusCode( restCliGet_Lotacao.getStatusCode() );
      }
      else
      {
      }
      /* Get_Lotacao Constructor */
   }

   public void gxep_insert_servidor_efetivo( com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem in_AV13Sdt_Serv_Efet ,
                                             GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliInsert_Servidor_Efetivo = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Insert_Servidor_Efetivo" );
      restCliInsert_Servidor_Efetivo.setLocation( restLocation );
      restCliInsert_Servidor_Efetivo.setHttpMethod( "POST" );
      restCliInsert_Servidor_Efetivo.addBodyVar("Sdt_Serv_Efet", in_AV13Sdt_Serv_Efet);
      restCliInsert_Servidor_Efetivo.RestExecute();
      if ( restCliInsert_Servidor_Efetivo.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliInsert_Servidor_Efetivo.getErrorCode() );
         gxProperties.setErrorMessage( restCliInsert_Servidor_Efetivo.getErrorMessage() );
         gxProperties.setStatusCode( restCliInsert_Servidor_Efetivo.getStatusCode() );
      }
      else
      {
         arr_AV5Messages[0] = restCliInsert_Servidor_Efetivo.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Insert_Servidor_Efetivo Constructor */
   }

   public void gxep_update_servidor_efetivo( com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem in_AV13Sdt_Serv_Efet ,
                                             GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliUpdate_Servidor_Efetivo = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Update_Servidor_Efetivo" );
      restCliUpdate_Servidor_Efetivo.setLocation( restLocation );
      restCliUpdate_Servidor_Efetivo.setHttpMethod( "PUT" );
      restCliUpdate_Servidor_Efetivo.addBodyVar("Sdt_Serv_Efet", in_AV13Sdt_Serv_Efet);
      restCliUpdate_Servidor_Efetivo.RestExecute();
      if ( restCliUpdate_Servidor_Efetivo.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliUpdate_Servidor_Efetivo.getErrorCode() );
         gxProperties.setErrorMessage( restCliUpdate_Servidor_Efetivo.getErrorMessage() );
         gxProperties.setStatusCode( restCliUpdate_Servidor_Efetivo.getStatusCode() );
      }
      else
      {
         arr_AV5Messages[0] = restCliUpdate_Servidor_Efetivo.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Update_Servidor_Efetivo Constructor */
   }

   public void gxep_delete_servidor_efetivo( com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem in_AV13Sdt_Serv_Efet )
   {
      restCliDelete_Servidor_Efetivo = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Delete_Servidor_Efetivo" );
      restCliDelete_Servidor_Efetivo.setLocation( restLocation );
      restCliDelete_Servidor_Efetivo.setHttpMethod( "DELETE" );
      restCliDelete_Servidor_Efetivo.addQueryVar("Sdt_serv_efet", in_AV13Sdt_Serv_Efet);
      restCliDelete_Servidor_Efetivo.RestExecute();
      if ( restCliDelete_Servidor_Efetivo.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliDelete_Servidor_Efetivo.getErrorCode() );
         gxProperties.setErrorMessage( restCliDelete_Servidor_Efetivo.getErrorMessage() );
         gxProperties.setStatusCode( restCliDelete_Servidor_Efetivo.getStatusCode() );
      }
      else
      {
      }
      /* Delete_Servidor_Efetivo Constructor */
   }

   public void gxep_get_servidor_efetivo( com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem in_AV13Sdt_Serv_Efet )
   {
      restCliGet_Servidor_Efetivo = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Get_Servidor_Efetivo" );
      restCliGet_Servidor_Efetivo.setLocation( restLocation );
      restCliGet_Servidor_Efetivo.setHttpMethod( "GET" );
      restCliGet_Servidor_Efetivo.addQueryVar("Sdt_serv_efet", in_AV13Sdt_Serv_Efet);
      restCliGet_Servidor_Efetivo.RestExecute();
      if ( restCliGet_Servidor_Efetivo.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliGet_Servidor_Efetivo.getErrorCode() );
         gxProperties.setErrorMessage( restCliGet_Servidor_Efetivo.getErrorMessage() );
         gxProperties.setStatusCode( restCliGet_Servidor_Efetivo.getStatusCode() );
      }
      else
      {
      }
      /* Get_Servidor_Efetivo Constructor */
   }

   public void gxep_insert_servidor_temporario( com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem in_AV12Sdt_Serv_Temp ,
                                                GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliInsert_Servidor_Temporario = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Insert_Servidor_Temporario" );
      restCliInsert_Servidor_Temporario.setLocation( restLocation );
      restCliInsert_Servidor_Temporario.setHttpMethod( "POST" );
      restCliInsert_Servidor_Temporario.addBodyVar("Sdt_Serv_Temp", in_AV12Sdt_Serv_Temp);
      restCliInsert_Servidor_Temporario.RestExecute();
      if ( restCliInsert_Servidor_Temporario.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliInsert_Servidor_Temporario.getErrorCode() );
         gxProperties.setErrorMessage( restCliInsert_Servidor_Temporario.getErrorMessage() );
         gxProperties.setStatusCode( restCliInsert_Servidor_Temporario.getStatusCode() );
      }
      else
      {
         arr_AV5Messages[0] = restCliInsert_Servidor_Temporario.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Insert_Servidor_Temporario Constructor */
   }

   public void gxep_update_servidor_temporario( com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem in_AV12Sdt_Serv_Temp ,
                                                GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliUpdate_Servidor_Temporario = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Update_Servidor_Temporario" );
      restCliUpdate_Servidor_Temporario.setLocation( restLocation );
      restCliUpdate_Servidor_Temporario.setHttpMethod( "PUT" );
      restCliUpdate_Servidor_Temporario.addBodyVar("Sdt_Serv_Temp", in_AV12Sdt_Serv_Temp);
      restCliUpdate_Servidor_Temporario.RestExecute();
      if ( restCliUpdate_Servidor_Temporario.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliUpdate_Servidor_Temporario.getErrorCode() );
         gxProperties.setErrorMessage( restCliUpdate_Servidor_Temporario.getErrorMessage() );
         gxProperties.setStatusCode( restCliUpdate_Servidor_Temporario.getStatusCode() );
      }
      else
      {
         arr_AV5Messages[0] = restCliUpdate_Servidor_Temporario.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Update_Servidor_Temporario Constructor */
   }

   public void gxep_delete_servidor_temporario( com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem in_AV12Sdt_Serv_Temp ,
                                                GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliDelete_Servidor_Temporario = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Delete_Servidor_Temporario" );
      restCliDelete_Servidor_Temporario.setLocation( restLocation );
      restCliDelete_Servidor_Temporario.setHttpMethod( "DELETE" );
      restCliDelete_Servidor_Temporario.addQueryVar("Sdt_serv_temp", in_AV12Sdt_Serv_Temp);
      restCliDelete_Servidor_Temporario.RestExecute();
      if ( restCliDelete_Servidor_Temporario.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliDelete_Servidor_Temporario.getErrorCode() );
         gxProperties.setErrorMessage( restCliDelete_Servidor_Temporario.getErrorMessage() );
         gxProperties.setStatusCode( restCliDelete_Servidor_Temporario.getStatusCode() );
      }
      else
      {
         arr_AV5Messages[0] = restCliDelete_Servidor_Temporario.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Delete_Servidor_Temporario Constructor */
   }

   public void gxep_get_serv_temp( com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem in_AV12Sdt_Serv_Temp )
   {
      restCliGet_Serv_Temp = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Get_Serv_Temp" );
      restCliGet_Serv_Temp.setLocation( restLocation );
      restCliGet_Serv_Temp.setHttpMethod( "GET" );
      restCliGet_Serv_Temp.addQueryVar("Sdt_serv_temp", in_AV12Sdt_Serv_Temp);
      restCliGet_Serv_Temp.RestExecute();
      if ( restCliGet_Serv_Temp.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliGet_Serv_Temp.getErrorCode() );
         gxProperties.setErrorMessage( restCliGet_Serv_Temp.getErrorMessage() );
         gxProperties.setStatusCode( restCliGet_Serv_Temp.getStatusCode() );
      }
      else
      {
      }
      /* Get_Serv_Temp Constructor */
   }

   public void gxep_insert_unidade( com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem in_AV11Sdt_Unidade ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliInsert_Unidade = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Insert_Unidade" );
      restCliInsert_Unidade.setLocation( restLocation );
      restCliInsert_Unidade.setHttpMethod( "POST" );
      restCliInsert_Unidade.addBodyVar("Sdt_Unidade", in_AV11Sdt_Unidade);
      restCliInsert_Unidade.RestExecute();
      if ( restCliInsert_Unidade.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliInsert_Unidade.getErrorCode() );
         gxProperties.setErrorMessage( restCliInsert_Unidade.getErrorMessage() );
         gxProperties.setStatusCode( restCliInsert_Unidade.getStatusCode() );
      }
      else
      {
         arr_AV5Messages[0] = restCliInsert_Unidade.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Insert_Unidade Constructor */
   }

   public void gxep_update_unidade( com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem in_AV11Sdt_Unidade ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliUpdate_Unidade = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Update_Unidade" );
      restCliUpdate_Unidade.setLocation( restLocation );
      restCliUpdate_Unidade.setHttpMethod( "PUT" );
      restCliUpdate_Unidade.addBodyVar("Sdt_Unidade", in_AV11Sdt_Unidade);
      restCliUpdate_Unidade.RestExecute();
      if ( restCliUpdate_Unidade.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliUpdate_Unidade.getErrorCode() );
         gxProperties.setErrorMessage( restCliUpdate_Unidade.getErrorMessage() );
         gxProperties.setStatusCode( restCliUpdate_Unidade.getStatusCode() );
      }
      else
      {
         arr_AV5Messages[0] = restCliUpdate_Unidade.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Update_Unidade Constructor */
   }

   public void gxep_delete_unidade( int in_AV14unid_id ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      restCliDelete_Unidade = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Delete_Unidade" );
      restCliDelete_Unidade.setLocation( restLocation );
      restCliDelete_Unidade.setHttpMethod( "DELETE" );
      restCliDelete_Unidade.addQueryVar("Unid_id", in_AV14unid_id);
      restCliDelete_Unidade.RestExecute();
      if ( restCliDelete_Unidade.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliDelete_Unidade.getErrorCode() );
         gxProperties.setErrorMessage( restCliDelete_Unidade.getErrorMessage() );
         gxProperties.setStatusCode( restCliDelete_Unidade.getStatusCode() );
      }
      else
      {
         arr_AV5Messages[0] = restCliDelete_Unidade.getBodyObjCollection("Messages",com.genexus.SdtMessages_Message.class );
      }
      /* Delete_Unidade Constructor */
   }

   public void gxep_get_unidade( com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem in_AV11Sdt_Unidade )
   {
      restCliGet_Unidade = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Get_Unidade" );
      restCliGet_Unidade.setLocation( restLocation );
      restCliGet_Unidade.setHttpMethod( "GET" );
      restCliGet_Unidade.addQueryVar("Sdt_unidade", in_AV11Sdt_Unidade);
      restCliGet_Unidade.RestExecute();
      if ( restCliGet_Unidade.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliGet_Unidade.getErrorCode() );
         gxProperties.setErrorMessage( restCliGet_Unidade.getErrorMessage() );
         gxProperties.setStatusCode( restCliGet_Unidade.getStatusCode() );
      }
      else
      {
      }
      /* Get_Unidade Constructor */
   }

   public void gxep_get_servlotado( int in_AV14unid_id ,
                                    com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem [] arr_AV46SDT_ServLotado )
   {
      restCliGet_ServLotado = new GXRestAPIClient() ;
      if ( restLocation == null )
      {
         InitLocation();
      }
      restLocation.setResourceName( "Get_ServLotado" );
      restCliGet_ServLotado.setLocation( restLocation );
      restCliGet_ServLotado.setHttpMethod( "GET" );
      restCliGet_ServLotado.addQueryVar("Unid_id", in_AV14unid_id);
      restCliGet_ServLotado.RestExecute();
      if ( restCliGet_ServLotado.getErrorCode() != 0 )
      {
         gxProperties.setErrorCode( restCliGet_ServLotado.getErrorCode() );
         gxProperties.setErrorMessage( restCliGet_ServLotado.getErrorMessage() );
         gxProperties.setStatusCode( restCliGet_ServLotado.getStatusCode() );
      }
      else
      {
         arr_AV46SDT_ServLotado[0] = restCliGet_ServLotado.getBodyObj("SDT_ServLotado",com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem.class );
      }
      /* Get_ServLotado Constructor */
   }

   protected void cleanup( )
   {
      if ( initialized != 1 )
      {
      }
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      gxProperties = new com.genexus.properties.GXObjectProperties();
      restCliInsert_Lotacao = new com.genexus.internet.GXRestAPIClient();
      restCliUpdate_Lotacao = new com.genexus.internet.GXRestAPIClient();
      restCliDelete_Lotacao = new com.genexus.internet.GXRestAPIClient();
      restCliGet_Lotacao = new com.genexus.internet.GXRestAPIClient();
      restCliInsert_Servidor_Efetivo = new com.genexus.internet.GXRestAPIClient();
      restCliUpdate_Servidor_Efetivo = new com.genexus.internet.GXRestAPIClient();
      restCliDelete_Servidor_Efetivo = new com.genexus.internet.GXRestAPIClient();
      restCliGet_Servidor_Efetivo = new com.genexus.internet.GXRestAPIClient();
      restCliInsert_Servidor_Temporario = new com.genexus.internet.GXRestAPIClient();
      restCliUpdate_Servidor_Temporario = new com.genexus.internet.GXRestAPIClient();
      restCliDelete_Servidor_Temporario = new com.genexus.internet.GXRestAPIClient();
      restCliGet_Serv_Temp = new com.genexus.internet.GXRestAPIClient();
      restCliInsert_Unidade = new com.genexus.internet.GXRestAPIClient();
      restCliUpdate_Unidade = new com.genexus.internet.GXRestAPIClient();
      restCliDelete_Unidade = new com.genexus.internet.GXRestAPIClient();
      restCliGet_Unidade = new com.genexus.internet.GXRestAPIClient();
      restCliGet_ServLotado = new com.genexus.internet.GXRestAPIClient();
   }

   protected short initialized ;
   protected com.genexus.internet.Location restLocation ;
   protected com.genexus.internet.GXRestAPIClient restCliInsert_Lotacao ;
   protected com.genexus.internet.GXRestAPIClient restCliUpdate_Lotacao ;
   protected com.genexus.internet.GXRestAPIClient restCliDelete_Lotacao ;
   protected com.genexus.internet.GXRestAPIClient restCliGet_Lotacao ;
   protected com.genexus.internet.GXRestAPIClient restCliInsert_Servidor_Efetivo ;
   protected com.genexus.internet.GXRestAPIClient restCliUpdate_Servidor_Efetivo ;
   protected com.genexus.internet.GXRestAPIClient restCliDelete_Servidor_Efetivo ;
   protected com.genexus.internet.GXRestAPIClient restCliGet_Servidor_Efetivo ;
   protected com.genexus.internet.GXRestAPIClient restCliInsert_Servidor_Temporario ;
   protected com.genexus.internet.GXRestAPIClient restCliUpdate_Servidor_Temporario ;
   protected com.genexus.internet.GXRestAPIClient restCliDelete_Servidor_Temporario ;
   protected com.genexus.internet.GXRestAPIClient restCliGet_Serv_Temp ;
   protected com.genexus.internet.GXRestAPIClient restCliInsert_Unidade ;
   protected com.genexus.internet.GXRestAPIClient restCliUpdate_Unidade ;
   protected com.genexus.internet.GXRestAPIClient restCliDelete_Unidade ;
   protected com.genexus.internet.GXRestAPIClient restCliGet_Unidade ;
   protected com.genexus.internet.GXRestAPIClient restCliGet_ServLotado ;
   protected com.genexus.properties.GXObjectProperties gxProperties ;
}

