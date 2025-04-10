package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.treinamento2.gx00b0", "/com.treinamento2.gx00b0"})
public final  class gx00b0 extends GXWebPanelStub
{
   public gx00b0( )
   {
   }

   public gx00b0( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( gx00b0.class ));
   }

   public gx00b0( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gx00b0_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gx00b0_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selection List Serv Lotado";
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

