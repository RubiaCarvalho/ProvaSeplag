package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@javax.ws.rs.Path("/{api :(?i)api}")
public final  class api_services_rest extends GxRestService
{
   public static  class Gxep_insert_lotacaoparm
   {
      public String  sdt_lotacao ;
   }

   @javax.ws.rs.Path("/{insert_lotacao :(?i)insert_lotacao}")
   @javax.ws.rs.POST
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_insert_lotacao( com.treinamento2.api_insert_lotacao_RESTInterfaceIN gxep_insert_lotacaoparm ) throws Exception
   {
      super.init( "POST" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem AV10sdt_lotacao = new com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem(remoteHandle, context);
      AV10sdt_lotacao = (com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem)gxep_insert_lotacaoparm.getsdt_lotacao().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_insert_lotacao(AV10sdt_lotacao,AV5Messages );
         com.treinamento2.api_insert_lotacao_RESTInterfaceOUT data = new com.treinamento2.api_insert_lotacao_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV5Messages[0]));
         builder = Response.okWrapped(data);
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{insert_lotacao :(?i)insert_lotacao}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsInsert_Lotacao( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,POST");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   private Vector<com.genexus.SdtMessages_Message_RESTInterface> SdtMessages_Message_RESTInterfacefromGXObjectCollection( GXBaseCollection<com.genexus.SdtMessages_Message> collection )
   {
      Vector<com.genexus.SdtMessages_Message_RESTInterface> result = new Vector<com.genexus.SdtMessages_Message_RESTInterface>();
      for (int i = 0; collection != null && i < collection.size(); i++)
      {
         result.addElement(new com.genexus.SdtMessages_Message_RESTInterface((com.genexus.SdtMessages_Message)collection.elementAt(i)));
      }
      return result ;
   }

   public static  class Gxep_update_lotacaoparm
   {
      public String  sdt_lotacao ;
   }

   @javax.ws.rs.Path("/{update_lotacao :(?i)update_lotacao}")
   @javax.ws.rs.PUT
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_update_lotacao( com.treinamento2.api_update_lotacao_RESTInterfaceIN gxep_update_lotacaoparm ) throws Exception
   {
      super.init( "PUT" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem AV10sdt_lotacao = new com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem(remoteHandle, context);
      AV10sdt_lotacao = (com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem)gxep_update_lotacaoparm.getsdt_lotacao().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_update_lotacao(AV10sdt_lotacao,AV5Messages );
         com.treinamento2.api_update_lotacao_RESTInterfaceOUT data = new com.treinamento2.api_update_lotacao_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV5Messages[0]));
         builder = Response.okWrapped(data);
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{update_lotacao :(?i)update_lotacao}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsUpdate_Lotacao( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,PUT");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   @javax.ws.rs.Path("/{delete_lotacao :(?i)delete_lotacao}")
   @javax.ws.rs.DELETE
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_delete_lotacao( @javax.ws.rs.QueryParam("Sdt_lotacao") @javax.ws.rs.DefaultValue("") String sAV10sdt_lotacao ) throws Exception
   {
      super.init( "DELETE" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem AV10sdt_lotacao = new com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem(remoteHandle, context);
      AV10sdt_lotacao.fromJSonString(sAV10sdt_lotacao, null);
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_delete_lotacao(AV10sdt_lotacao,AV5Messages );
         com.treinamento2.api_delete_lotacao_RESTInterfaceOUT data = new com.treinamento2.api_delete_lotacao_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV5Messages[0]));
         builder = Response.okWrapped(data);
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{delete_lotacao :(?i)delete_lotacao}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsDelete_Lotacao( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,DELETE");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   @javax.ws.rs.Path("/{get_lotacao :(?i)get_lotacao}")
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_get_lotacao( @javax.ws.rs.QueryParam("Sdt_lotacao") @javax.ws.rs.DefaultValue("") String sAV10sdt_lotacao ) throws Exception
   {
      super.init( "GET" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem AV10sdt_lotacao = new com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem(remoteHandle, context);
      AV10sdt_lotacao.fromJSonString(sAV10sdt_lotacao, null);
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_get_lotacao(AV10sdt_lotacao );
         builder = Response.okWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{get_lotacao :(?i)get_lotacao}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsGet_Lotacao( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,GET");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   public static  class Gxep_insert_servidor_efetivoparm
   {
      public String  Sdt_Serv_Efet ;
   }

   @javax.ws.rs.Path("/{insert_servidor_efetivo :(?i)insert_servidor_efetivo}")
   @javax.ws.rs.POST
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_insert_servidor_efetivo( com.treinamento2.api_insert_servidor_efetivo_RESTInterfaceIN gxep_insert_servidor_efetivoparm ) throws Exception
   {
      super.init( "POST" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem AV13Sdt_Serv_Efet = new com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem(remoteHandle, context);
      AV13Sdt_Serv_Efet = (com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem)gxep_insert_servidor_efetivoparm.getSdt_Serv_Efet().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_insert_servidor_efetivo(AV13Sdt_Serv_Efet,AV5Messages );
         com.treinamento2.api_insert_servidor_efetivo_RESTInterfaceOUT data = new com.treinamento2.api_insert_servidor_efetivo_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV5Messages[0]));
         builder = Response.okWrapped(data);
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{insert_servidor_efetivo :(?i)insert_servidor_efetivo}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsInsert_Servidor_Efetivo( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,POST");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   public static  class Gxep_update_servidor_efetivoparm
   {
      public String  Sdt_Serv_Efet ;
   }

   @javax.ws.rs.Path("/{update_servidor_efetivo :(?i)update_servidor_efetivo}")
   @javax.ws.rs.PUT
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_update_servidor_efetivo( com.treinamento2.api_update_servidor_efetivo_RESTInterfaceIN gxep_update_servidor_efetivoparm ) throws Exception
   {
      super.init( "PUT" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem AV13Sdt_Serv_Efet = new com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem(remoteHandle, context);
      AV13Sdt_Serv_Efet = (com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem)gxep_update_servidor_efetivoparm.getSdt_Serv_Efet().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_update_servidor_efetivo(AV13Sdt_Serv_Efet,AV5Messages );
         com.treinamento2.api_update_servidor_efetivo_RESTInterfaceOUT data = new com.treinamento2.api_update_servidor_efetivo_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV5Messages[0]));
         builder = Response.okWrapped(data);
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{update_servidor_efetivo :(?i)update_servidor_efetivo}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsUpdate_Servidor_Efetivo( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,PUT");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   @javax.ws.rs.Path("/{delete_servidor_efetivo :(?i)delete_servidor_efetivo}")
   @javax.ws.rs.DELETE
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_delete_servidor_efetivo( @javax.ws.rs.QueryParam("Sdt_serv_efet") @javax.ws.rs.DefaultValue("") String sAV13Sdt_Serv_Efet ) throws Exception
   {
      super.init( "DELETE" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem AV13Sdt_Serv_Efet = new com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem(remoteHandle, context);
      AV13Sdt_Serv_Efet.fromJSonString(sAV13Sdt_Serv_Efet, null);
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_delete_servidor_efetivo(AV13Sdt_Serv_Efet );
         builder = Response.okWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{delete_servidor_efetivo :(?i)delete_servidor_efetivo}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsDelete_Servidor_Efetivo( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,DELETE");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   @javax.ws.rs.Path("/{get_servidor_efetivo :(?i)get_servidor_efetivo}")
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_get_servidor_efetivo( @javax.ws.rs.QueryParam("Sdt_serv_efet") @javax.ws.rs.DefaultValue("") String sAV13Sdt_Serv_Efet ) throws Exception
   {
      super.init( "GET" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem AV13Sdt_Serv_Efet = new com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem(remoteHandle, context);
      AV13Sdt_Serv_Efet.fromJSonString(sAV13Sdt_Serv_Efet, null);
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_get_servidor_efetivo(AV13Sdt_Serv_Efet );
         builder = Response.okWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{get_servidor_efetivo :(?i)get_servidor_efetivo}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsGet_Servidor_Efetivo( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,GET");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   public static  class Gxep_insert_servidor_temporarioparm
   {
      public String  Sdt_Serv_Temp ;
   }

   @javax.ws.rs.Path("/{insert_servidor_temporario :(?i)insert_servidor_temporario}")
   @javax.ws.rs.POST
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_insert_servidor_temporario( com.treinamento2.api_insert_servidor_temporario_RESTInterfaceIN gxep_insert_servidor_temporarioparm ) throws Exception
   {
      super.init( "POST" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem AV12Sdt_Serv_Temp = new com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem(remoteHandle, context);
      AV12Sdt_Serv_Temp = (com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem)gxep_insert_servidor_temporarioparm.getSdt_Serv_Temp().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_insert_servidor_temporario(AV12Sdt_Serv_Temp,AV5Messages );
         com.treinamento2.api_insert_servidor_temporario_RESTInterfaceOUT data = new com.treinamento2.api_insert_servidor_temporario_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV5Messages[0]));
         builder = Response.okWrapped(data);
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{insert_servidor_temporario :(?i)insert_servidor_temporario}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsInsert_Servidor_Temporario( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,POST");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   public static  class Gxep_update_servidor_temporarioparm
   {
      public String  Sdt_Serv_Temp ;
   }

   @javax.ws.rs.Path("/{update_servidor_temporario :(?i)update_servidor_temporario}")
   @javax.ws.rs.PUT
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_update_servidor_temporario( com.treinamento2.api_update_servidor_temporario_RESTInterfaceIN gxep_update_servidor_temporarioparm ) throws Exception
   {
      super.init( "PUT" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem AV12Sdt_Serv_Temp = new com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem(remoteHandle, context);
      AV12Sdt_Serv_Temp = (com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem)gxep_update_servidor_temporarioparm.getSdt_Serv_Temp().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_update_servidor_temporario(AV12Sdt_Serv_Temp,AV5Messages );
         com.treinamento2.api_update_servidor_temporario_RESTInterfaceOUT data = new com.treinamento2.api_update_servidor_temporario_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV5Messages[0]));
         builder = Response.okWrapped(data);
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{update_servidor_temporario :(?i)update_servidor_temporario}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsUpdate_Servidor_Temporario( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,PUT");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   @javax.ws.rs.Path("/{delete_servidor_temporario :(?i)delete_servidor_temporario}")
   @javax.ws.rs.DELETE
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_delete_servidor_temporario( @javax.ws.rs.QueryParam("Sdt_serv_temp") @javax.ws.rs.DefaultValue("") String sAV12Sdt_Serv_Temp ) throws Exception
   {
      super.init( "DELETE" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem AV12Sdt_Serv_Temp = new com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem(remoteHandle, context);
      AV12Sdt_Serv_Temp.fromJSonString(sAV12Sdt_Serv_Temp, null);
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_delete_servidor_temporario(AV12Sdt_Serv_Temp,AV5Messages );
         com.treinamento2.api_delete_servidor_temporario_RESTInterfaceOUT data = new com.treinamento2.api_delete_servidor_temporario_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV5Messages[0]));
         builder = Response.okWrapped(data);
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{delete_servidor_temporario :(?i)delete_servidor_temporario}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsDelete_Servidor_Temporario( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,DELETE");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   @javax.ws.rs.Path("/{get_serv_temp :(?i)get_serv_temp}")
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_get_serv_temp( @javax.ws.rs.QueryParam("Sdt_serv_temp") @javax.ws.rs.DefaultValue("") String sAV12Sdt_Serv_Temp ) throws Exception
   {
      super.init( "GET" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem AV12Sdt_Serv_Temp = new com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem(remoteHandle, context);
      AV12Sdt_Serv_Temp.fromJSonString(sAV12Sdt_Serv_Temp, null);
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_get_serv_temp(AV12Sdt_Serv_Temp );
         builder = Response.okWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{get_serv_temp :(?i)get_serv_temp}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsGet_Serv_Temp( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,GET");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   public static  class Gxep_insert_unidadeparm
   {
      public String  Sdt_Unidade ;
   }

   @javax.ws.rs.Path("/{insert_unidade :(?i)insert_unidade}")
   @javax.ws.rs.POST
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_insert_unidade( com.treinamento2.api_insert_unidade_RESTInterfaceIN gxep_insert_unidadeparm ) throws Exception
   {
      super.init( "POST" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem AV11Sdt_Unidade = new com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem(remoteHandle, context);
      AV11Sdt_Unidade = (com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem)gxep_insert_unidadeparm.getSdt_Unidade().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_insert_unidade(AV11Sdt_Unidade,AV5Messages );
         com.treinamento2.api_insert_unidade_RESTInterfaceOUT data = new com.treinamento2.api_insert_unidade_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV5Messages[0]));
         builder = Response.okWrapped(data);
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{insert_unidade :(?i)insert_unidade}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsInsert_Unidade( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,POST");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   public static  class Gxep_update_unidadeparm
   {
      public String  Sdt_Unidade ;
   }

   @javax.ws.rs.Path("/{update_unidade :(?i)update_unidade}")
   @javax.ws.rs.PUT
   @javax.ws.rs.Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_update_unidade( com.treinamento2.api_update_unidade_RESTInterfaceIN gxep_update_unidadeparm ) throws Exception
   {
      super.init( "PUT" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem AV11Sdt_Unidade = new com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem(remoteHandle, context);
      AV11Sdt_Unidade = (com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem)gxep_update_unidadeparm.getSdt_Unidade().getSdt();
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_update_unidade(AV11Sdt_Unidade,AV5Messages );
         com.treinamento2.api_update_unidade_RESTInterfaceOUT data = new com.treinamento2.api_update_unidade_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV5Messages[0]));
         builder = Response.okWrapped(data);
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{update_unidade :(?i)update_unidade}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsUpdate_Unidade( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,PUT");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   @javax.ws.rs.Path("/{delete_unidade :(?i)delete_unidade}")
   @javax.ws.rs.DELETE
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_delete_unidade( @javax.ws.rs.QueryParam("Unid_id") @javax.ws.rs.DefaultValue("") String sAV14unid_id ) throws Exception
   {
      super.init( "DELETE" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      int AV14unid_id;
      AV14unid_id = (int)(GXutil.lval( sAV14unid_id)) ;
      @SuppressWarnings("unchecked")
      GXBaseCollection<com.genexus.SdtMessages_Message> [] AV5Messages = new GXBaseCollection[] { new GXBaseCollection<com.genexus.SdtMessages_Message>() };
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_delete_unidade(AV14unid_id,AV5Messages );
         com.treinamento2.api_delete_unidade_RESTInterfaceOUT data = new com.treinamento2.api_delete_unidade_RESTInterfaceOUT();
         data.setMessages(SdtMessages_Message_RESTInterfacefromGXObjectCollection(AV5Messages[0]));
         builder = Response.okWrapped(data);
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{delete_unidade :(?i)delete_unidade}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsDelete_Unidade( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,DELETE");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   @javax.ws.rs.Path("/{get_unidade :(?i)get_unidade}")
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_get_unidade( @javax.ws.rs.QueryParam("Sdt_unidade") @javax.ws.rs.DefaultValue("") String sAV11Sdt_Unidade ) throws Exception
   {
      super.init( "GET" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem AV11Sdt_Unidade = new com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem(remoteHandle, context);
      AV11Sdt_Unidade.fromJSonString(sAV11Sdt_Unidade, null);
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_get_unidade(AV11Sdt_Unidade );
         builder = Response.okWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{get_unidade :(?i)get_unidade}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsGet_Unidade( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,GET");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   @javax.ws.rs.Path("/{get_servlotado :(?i)get_servlotado}")
   @javax.ws.rs.GET
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response gxep_get_servlotado( @javax.ws.rs.QueryParam("Unid_id") @javax.ws.rs.DefaultValue("") String sAV14unid_id ) throws Exception
   {
      super.init( "GET" );
      permissionPrefix = "";
      if ( ! isAuthenticated(myServletRequestWrapper) )
      {
         if ( forbidden )
         {
            builder = Response.forbidden();
         }
         else
         {
            setWWWAuthHeader(myServletRequestWrapper, myServletResponseWrapper);
            builder = Response.unauthorized();
         }
         builder.type("application/json");
         builder.entity(errorJson.toString());
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      if ( ! processHeaders("api",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      int AV14unid_id;
      AV14unid_id = (int)(GXutil.lval( sAV14unid_id)) ;
      com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem [] AV46SDT_ServLotado = new com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem[] { new com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem() };
      com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem data;
      try
      {
         com.treinamento2.api worker = new com.treinamento2.api(remoteHandle, context);
         worker.gxep_get_servlotado(AV14unid_id,AV46SDT_ServLotado );
         data = AV46SDT_ServLotado[0] ;
         builder = Response.okWrapped(new com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem_RESTInterface(data));
         cleanup();
         return (javax.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   @javax.ws.rs.Path("/{get_servlotado :(?i)get_servlotado}")
   @javax.ws.rs.OPTIONS
   @javax.ws.rs.Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public javax.ws.rs.core.Response GetOptionsGet_ServLotado( ) throws Exception
   {
      super.init( "OPTIONS" );
      builder = Response.options("OPTIONS,HEAD,GET");
      return (javax.ws.rs.core.Response) builder.build() ;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

