package com.treinamento2.general.ui ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.treinamento2.general.ui.masterunanimosidebar", "/com.treinamento2.general.ui.masterunanimosidebar"})
public final  class masterunanimosidebar extends GXWebPanelStub
{
   public masterunanimosidebar( )
   {
   }

   public masterunanimosidebar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( masterunanimosidebar.class ));
   }

   public masterunanimosidebar( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new masterunanimosidebar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new masterunanimosidebar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Master Unanimo Sidebar";
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

