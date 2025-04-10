package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.treinamento2.foto_pessoa", "/com.treinamento2.foto_pessoa"})
public final  class foto_pessoa extends GXWebPanelStub
{
   public foto_pessoa( )
   {
   }

   public foto_pessoa( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( foto_pessoa.class ));
   }

   public foto_pessoa( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new foto_pessoa_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new foto_pessoa_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "foto_pessoa";
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

