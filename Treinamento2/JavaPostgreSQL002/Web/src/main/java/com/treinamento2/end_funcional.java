package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.treinamento2.end_funcional", "/com.treinamento2.end_funcional"})
public final  class end_funcional extends GXWebPanelStub
{
   public end_funcional( )
   {
   }

   public end_funcional( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( end_funcional.class ));
   }

   public end_funcional( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new end_funcional_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new end_funcional_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "End_Funcional";
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

