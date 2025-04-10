package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.treinamento2.lotacao", "/com.treinamento2.lotacao"})
public final  class lotacao extends GXWebPanelStub
{
   public lotacao( )
   {
   }

   public lotacao( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lotacao.class ));
   }

   public lotacao( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lotacao_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lotacao_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "lotacao";
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

