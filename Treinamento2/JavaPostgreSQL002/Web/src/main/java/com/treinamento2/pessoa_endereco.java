package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.treinamento2.pessoa_endereco", "/com.treinamento2.pessoa_endereco"})
public final  class pessoa_endereco extends GXWebPanelStub
{
   public pessoa_endereco( )
   {
   }

   public pessoa_endereco( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pessoa_endereco.class ));
   }

   public pessoa_endereco( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pessoa_endereco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pessoa_endereco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "pessoa_endereco";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

