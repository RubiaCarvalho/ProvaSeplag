package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.treinamento2.servlotado", "/com.treinamento2.servlotado"})
public final  class servlotado extends GXWebPanelStub
{
   public servlotado( )
   {
   }

   public servlotado( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( servlotado.class ));
   }

   public servlotado( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new servlotado_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new servlotado_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Serv Lotado";
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

