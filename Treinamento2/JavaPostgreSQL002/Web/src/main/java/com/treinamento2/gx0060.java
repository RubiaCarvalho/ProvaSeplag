package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.treinamento2.gx0060", "/com.treinamento2.gx0060"})
public final  class gx0060 extends GXWebPanelStub
{
   public gx0060( )
   {
   }

   public gx0060( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( gx0060.class ));
   }

   public gx0060( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gx0060_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gx0060_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selection List Unidade";
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

