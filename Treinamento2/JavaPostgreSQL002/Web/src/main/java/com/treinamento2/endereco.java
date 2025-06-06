package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.treinamento2.endereco", "/com.treinamento2.endereco"})
public final  class endereco extends GXWebPanelStub
{
   public endereco( )
   {
   }

   public endereco( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( endereco.class ));
   }

   public endereco( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new endereco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new endereco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Endereco";
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

