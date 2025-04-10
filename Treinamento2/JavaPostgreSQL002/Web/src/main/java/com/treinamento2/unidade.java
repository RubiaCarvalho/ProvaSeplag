package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.treinamento2.unidade", "/com.treinamento2.unidade"})
public final  class unidade extends GXWebPanelStub
{
   public unidade( )
   {
   }

   public unidade( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( unidade.class ));
   }

   public unidade( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new unidade_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new unidade_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Unidade";
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

