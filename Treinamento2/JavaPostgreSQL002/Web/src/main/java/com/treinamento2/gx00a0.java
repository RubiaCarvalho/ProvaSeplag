package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.treinamento2.gx00a0", "/com.treinamento2.gx00a0"})
public final  class gx00a0 extends GXWebPanelStub
{
   public gx00a0( )
   {
   }

   public gx00a0( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( gx00a0.class ));
   }

   public gx00a0( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gx00a0_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gx00a0_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selection List unidade_endereco";
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

