package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtServLotado extends GxSilentTrnSdt
{
   public SdtServLotado( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtServLotado.class));
   }

   public SdtServLotado( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtServLotado");
      initialize( remoteHandle) ;
   }

   public SdtServLotado( int remoteHandle ,
                         StructSdtServLotado struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public void Load( int AV37serv_lot_id )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Integer.valueOf(AV37serv_lot_id)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"serv_lot_id", int.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "ServLotado");
      metadata.set("BT", "ServLotado");
      metadata.set("PK", "[ \"serv_lot_id\" ]");
      metadata.set("PKAssigned", "[ \"serv_lot_id\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"unid_id\" ],\"FKMap\":[  ] } ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1;
      formatError = false ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            readElement = false ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_lot_id") )
            {
               gxTv_SdtServLotado_Serv_lot_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_lot_idade") )
            {
               gxTv_SdtServLotado_Serv_lot_idade = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_lot_unid") )
            {
               gxTv_SdtServLotado_Serv_lot_unid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_lot_foto") )
            {
               gxTv_SdtServLotado_Serv_lot_foto = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id") )
            {
               gxTv_SdtServLotado_Unid_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome") )
            {
               gxTv_SdtServLotado_Unid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtServLotado_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtServLotado_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_lot_id_Z") )
            {
               gxTv_SdtServLotado_Serv_lot_id_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_lot_idade_Z") )
            {
               gxTv_SdtServLotado_Serv_lot_idade_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_lot_unid_Z") )
            {
               gxTv_SdtServLotado_Serv_lot_unid_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_lot_foto_Z") )
            {
               gxTv_SdtServLotado_Serv_lot_foto_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id_Z") )
            {
               gxTv_SdtServLotado_Unid_id_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome_Z") )
            {
               gxTv_SdtServLotado_Unid_nome_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_lot_idade_N") )
            {
               gxTv_SdtServLotado_Serv_lot_idade_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_lot_unid_N") )
            {
               gxTv_SdtServLotado_Serv_lot_unid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_lot_foto_N") )
            {
               gxTv_SdtServLotado_Serv_lot_foto_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome_N") )
            {
               gxTv_SdtServLotado_Unid_nome_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( ! readElement )
            {
               readOk = (short)(1) ;
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( ( readOk == 0 ) || formatError )
            {
               context.globals.sSOAPErrMsg += "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg += "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "ServLotado" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "Treinamento2" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("serv_lot_id", GXutil.trim( GXutil.str( gxTv_SdtServLotado_Serv_lot_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("serv_lot_idade", GXutil.trim( GXutil.str( gxTv_SdtServLotado_Serv_lot_idade, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("serv_lot_unid", gxTv_SdtServLotado_Serv_lot_unid);
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("serv_lot_foto", gxTv_SdtServLotado_Serv_lot_foto);
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("unid_id", GXutil.trim( GXutil.str( gxTv_SdtServLotado_Unid_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("unid_nome", gxTv_SdtServLotado_Unid_nome);
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtServLotado_Mode);
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtServLotado_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("serv_lot_id_Z", GXutil.trim( GXutil.str( gxTv_SdtServLotado_Serv_lot_id_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("serv_lot_idade_Z", GXutil.trim( GXutil.str( gxTv_SdtServLotado_Serv_lot_idade_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("serv_lot_unid_Z", gxTv_SdtServLotado_Serv_lot_unid_Z);
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("serv_lot_foto_Z", gxTv_SdtServLotado_Serv_lot_foto_Z);
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("unid_id_Z", GXutil.trim( GXutil.str( gxTv_SdtServLotado_Unid_id_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("unid_nome_Z", gxTv_SdtServLotado_Unid_nome_Z);
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("serv_lot_idade_N", GXutil.trim( GXutil.str( gxTv_SdtServLotado_Serv_lot_idade_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("serv_lot_unid_N", GXutil.trim( GXutil.str( gxTv_SdtServLotado_Serv_lot_unid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("serv_lot_foto_N", GXutil.trim( GXutil.str( gxTv_SdtServLotado_Serv_lot_foto_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("unid_nome_N", GXutil.trim( GXutil.str( gxTv_SdtServLotado_Unid_nome_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
      }
      oWriter.writeEndElement();
   }

   public long getnumericvalue( String value )
   {
      if ( GXutil.notNumeric( value) )
      {
         formatError = true ;
      }
      return GXutil.lval( value) ;
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      tojson( includeState, true) ;
   }

   public void tojson( boolean includeState ,
                       boolean includeNonInitialized )
   {
      AddObjectProperty("serv_lot_id", gxTv_SdtServLotado_Serv_lot_id, false, includeNonInitialized);
      AddObjectProperty("serv_lot_idade", gxTv_SdtServLotado_Serv_lot_idade, false, includeNonInitialized);
      AddObjectProperty("serv_lot_idade_N", gxTv_SdtServLotado_Serv_lot_idade_N, false, includeNonInitialized);
      AddObjectProperty("serv_lot_unid", gxTv_SdtServLotado_Serv_lot_unid, false, includeNonInitialized);
      AddObjectProperty("serv_lot_unid_N", gxTv_SdtServLotado_Serv_lot_unid_N, false, includeNonInitialized);
      AddObjectProperty("serv_lot_foto", gxTv_SdtServLotado_Serv_lot_foto, false, includeNonInitialized);
      AddObjectProperty("serv_lot_foto_N", gxTv_SdtServLotado_Serv_lot_foto_N, false, includeNonInitialized);
      AddObjectProperty("unid_id", gxTv_SdtServLotado_Unid_id, false, includeNonInitialized);
      AddObjectProperty("unid_nome", gxTv_SdtServLotado_Unid_nome, false, includeNonInitialized);
      AddObjectProperty("unid_nome_N", gxTv_SdtServLotado_Unid_nome_N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtServLotado_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtServLotado_Initialized, false, includeNonInitialized);
         AddObjectProperty("serv_lot_id_Z", gxTv_SdtServLotado_Serv_lot_id_Z, false, includeNonInitialized);
         AddObjectProperty("serv_lot_idade_Z", gxTv_SdtServLotado_Serv_lot_idade_Z, false, includeNonInitialized);
         AddObjectProperty("serv_lot_unid_Z", gxTv_SdtServLotado_Serv_lot_unid_Z, false, includeNonInitialized);
         AddObjectProperty("serv_lot_foto_Z", gxTv_SdtServLotado_Serv_lot_foto_Z, false, includeNonInitialized);
         AddObjectProperty("unid_id_Z", gxTv_SdtServLotado_Unid_id_Z, false, includeNonInitialized);
         AddObjectProperty("unid_nome_Z", gxTv_SdtServLotado_Unid_nome_Z, false, includeNonInitialized);
         AddObjectProperty("serv_lot_idade_N", gxTv_SdtServLotado_Serv_lot_idade_N, false, includeNonInitialized);
         AddObjectProperty("serv_lot_unid_N", gxTv_SdtServLotado_Serv_lot_unid_N, false, includeNonInitialized);
         AddObjectProperty("serv_lot_foto_N", gxTv_SdtServLotado_Serv_lot_foto_N, false, includeNonInitialized);
         AddObjectProperty("unid_nome_N", gxTv_SdtServLotado_Unid_nome_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( com.treinamento2.SdtServLotado sdt )
   {
      if ( sdt.IsDirty("serv_lot_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_SdtServLotado_Serv_lot_id = sdt.getgxTv_SdtServLotado_Serv_lot_id() ;
      }
      if ( sdt.IsDirty("serv_lot_idade") )
      {
         gxTv_SdtServLotado_Serv_lot_idade_N = sdt.getgxTv_SdtServLotado_Serv_lot_idade_N() ;
         sdtIsNull = (byte)(0) ;
         gxTv_SdtServLotado_Serv_lot_idade = sdt.getgxTv_SdtServLotado_Serv_lot_idade() ;
      }
      if ( sdt.IsDirty("serv_lot_unid") )
      {
         gxTv_SdtServLotado_Serv_lot_unid_N = sdt.getgxTv_SdtServLotado_Serv_lot_unid_N() ;
         sdtIsNull = (byte)(0) ;
         gxTv_SdtServLotado_Serv_lot_unid = sdt.getgxTv_SdtServLotado_Serv_lot_unid() ;
      }
      if ( sdt.IsDirty("serv_lot_foto") )
      {
         gxTv_SdtServLotado_Serv_lot_foto_N = sdt.getgxTv_SdtServLotado_Serv_lot_foto_N() ;
         sdtIsNull = (byte)(0) ;
         gxTv_SdtServLotado_Serv_lot_foto = sdt.getgxTv_SdtServLotado_Serv_lot_foto() ;
      }
      if ( sdt.IsDirty("unid_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_SdtServLotado_Unid_id = sdt.getgxTv_SdtServLotado_Unid_id() ;
      }
      if ( sdt.IsDirty("unid_nome") )
      {
         gxTv_SdtServLotado_Unid_nome_N = sdt.getgxTv_SdtServLotado_Unid_nome_N() ;
         sdtIsNull = (byte)(0) ;
         gxTv_SdtServLotado_Unid_nome = sdt.getgxTv_SdtServLotado_Unid_nome() ;
      }
   }

   public int getgxTv_SdtServLotado_Serv_lot_id( )
   {
      return gxTv_SdtServLotado_Serv_lot_id ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      if ( gxTv_SdtServLotado_Serv_lot_id != value )
      {
         gxTv_SdtServLotado_Mode = "INS" ;
         this.setgxTv_SdtServLotado_Serv_lot_id_Z_SetNull( );
         this.setgxTv_SdtServLotado_Serv_lot_idade_Z_SetNull( );
         this.setgxTv_SdtServLotado_Serv_lot_unid_Z_SetNull( );
         this.setgxTv_SdtServLotado_Serv_lot_foto_Z_SetNull( );
         this.setgxTv_SdtServLotado_Unid_id_Z_SetNull( );
         this.setgxTv_SdtServLotado_Unid_nome_Z_SetNull( );
      }
      SetDirty("Serv_lot_id");
      gxTv_SdtServLotado_Serv_lot_id = value ;
   }

   public short getgxTv_SdtServLotado_Serv_lot_idade( )
   {
      return gxTv_SdtServLotado_Serv_lot_idade ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_idade( short value )
   {
      gxTv_SdtServLotado_Serv_lot_idade_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      SetDirty("Serv_lot_idade");
      gxTv_SdtServLotado_Serv_lot_idade = value ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_idade_SetNull( )
   {
      gxTv_SdtServLotado_Serv_lot_idade_N = (byte)(1) ;
      gxTv_SdtServLotado_Serv_lot_idade = (short)(0) ;
      SetDirty("Serv_lot_idade");
   }

   public boolean getgxTv_SdtServLotado_Serv_lot_idade_IsNull( )
   {
      return (gxTv_SdtServLotado_Serv_lot_idade_N==1) ;
   }

   public String getgxTv_SdtServLotado_Serv_lot_unid( )
   {
      return gxTv_SdtServLotado_Serv_lot_unid ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_unid( String value )
   {
      gxTv_SdtServLotado_Serv_lot_unid_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      SetDirty("Serv_lot_unid");
      gxTv_SdtServLotado_Serv_lot_unid = value ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_unid_SetNull( )
   {
      gxTv_SdtServLotado_Serv_lot_unid_N = (byte)(1) ;
      gxTv_SdtServLotado_Serv_lot_unid = "" ;
      SetDirty("Serv_lot_unid");
   }

   public boolean getgxTv_SdtServLotado_Serv_lot_unid_IsNull( )
   {
      return (gxTv_SdtServLotado_Serv_lot_unid_N==1) ;
   }

   public String getgxTv_SdtServLotado_Serv_lot_foto( )
   {
      return gxTv_SdtServLotado_Serv_lot_foto ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_foto( String value )
   {
      gxTv_SdtServLotado_Serv_lot_foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      SetDirty("Serv_lot_foto");
      gxTv_SdtServLotado_Serv_lot_foto = value ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_foto_SetNull( )
   {
      gxTv_SdtServLotado_Serv_lot_foto_N = (byte)(1) ;
      gxTv_SdtServLotado_Serv_lot_foto = "" ;
      SetDirty("Serv_lot_foto");
   }

   public boolean getgxTv_SdtServLotado_Serv_lot_foto_IsNull( )
   {
      return (gxTv_SdtServLotado_Serv_lot_foto_N==1) ;
   }

   public int getgxTv_SdtServLotado_Unid_id( )
   {
      return gxTv_SdtServLotado_Unid_id ;
   }

   public void setgxTv_SdtServLotado_Unid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_id");
      gxTv_SdtServLotado_Unid_id = value ;
   }

   public String getgxTv_SdtServLotado_Unid_nome( )
   {
      return gxTv_SdtServLotado_Unid_nome ;
   }

   public void setgxTv_SdtServLotado_Unid_nome( String value )
   {
      gxTv_SdtServLotado_Unid_nome_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_nome");
      gxTv_SdtServLotado_Unid_nome = value ;
   }

   public void setgxTv_SdtServLotado_Unid_nome_SetNull( )
   {
      gxTv_SdtServLotado_Unid_nome_N = (byte)(1) ;
      gxTv_SdtServLotado_Unid_nome = "" ;
      SetDirty("Unid_nome");
   }

   public boolean getgxTv_SdtServLotado_Unid_nome_IsNull( )
   {
      return (gxTv_SdtServLotado_Unid_nome_N==1) ;
   }

   public String getgxTv_SdtServLotado_Mode( )
   {
      return gxTv_SdtServLotado_Mode ;
   }

   public void setgxTv_SdtServLotado_Mode( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtServLotado_Mode = value ;
   }

   public void setgxTv_SdtServLotado_Mode_SetNull( )
   {
      gxTv_SdtServLotado_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtServLotado_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtServLotado_Initialized( )
   {
      return gxTv_SdtServLotado_Initialized ;
   }

   public void setgxTv_SdtServLotado_Initialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtServLotado_Initialized = value ;
   }

   public void setgxTv_SdtServLotado_Initialized_SetNull( )
   {
      gxTv_SdtServLotado_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtServLotado_Initialized_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtServLotado_Serv_lot_id_Z( )
   {
      return gxTv_SdtServLotado_Serv_lot_id_Z ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Serv_lot_id_Z");
      gxTv_SdtServLotado_Serv_lot_id_Z = value ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_id_Z_SetNull( )
   {
      gxTv_SdtServLotado_Serv_lot_id_Z = 0 ;
      SetDirty("Serv_lot_id_Z");
   }

   public boolean getgxTv_SdtServLotado_Serv_lot_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtServLotado_Serv_lot_idade_Z( )
   {
      return gxTv_SdtServLotado_Serv_lot_idade_Z ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_idade_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Serv_lot_idade_Z");
      gxTv_SdtServLotado_Serv_lot_idade_Z = value ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_idade_Z_SetNull( )
   {
      gxTv_SdtServLotado_Serv_lot_idade_Z = (short)(0) ;
      SetDirty("Serv_lot_idade_Z");
   }

   public boolean getgxTv_SdtServLotado_Serv_lot_idade_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtServLotado_Serv_lot_unid_Z( )
   {
      return gxTv_SdtServLotado_Serv_lot_unid_Z ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_unid_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Serv_lot_unid_Z");
      gxTv_SdtServLotado_Serv_lot_unid_Z = value ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_unid_Z_SetNull( )
   {
      gxTv_SdtServLotado_Serv_lot_unid_Z = "" ;
      SetDirty("Serv_lot_unid_Z");
   }

   public boolean getgxTv_SdtServLotado_Serv_lot_unid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtServLotado_Serv_lot_foto_Z( )
   {
      return gxTv_SdtServLotado_Serv_lot_foto_Z ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_foto_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Serv_lot_foto_Z");
      gxTv_SdtServLotado_Serv_lot_foto_Z = value ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_foto_Z_SetNull( )
   {
      gxTv_SdtServLotado_Serv_lot_foto_Z = "" ;
      SetDirty("Serv_lot_foto_Z");
   }

   public boolean getgxTv_SdtServLotado_Serv_lot_foto_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtServLotado_Unid_id_Z( )
   {
      return gxTv_SdtServLotado_Unid_id_Z ;
   }

   public void setgxTv_SdtServLotado_Unid_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_id_Z");
      gxTv_SdtServLotado_Unid_id_Z = value ;
   }

   public void setgxTv_SdtServLotado_Unid_id_Z_SetNull( )
   {
      gxTv_SdtServLotado_Unid_id_Z = 0 ;
      SetDirty("Unid_id_Z");
   }

   public boolean getgxTv_SdtServLotado_Unid_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtServLotado_Unid_nome_Z( )
   {
      return gxTv_SdtServLotado_Unid_nome_Z ;
   }

   public void setgxTv_SdtServLotado_Unid_nome_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_nome_Z");
      gxTv_SdtServLotado_Unid_nome_Z = value ;
   }

   public void setgxTv_SdtServLotado_Unid_nome_Z_SetNull( )
   {
      gxTv_SdtServLotado_Unid_nome_Z = "" ;
      SetDirty("Unid_nome_Z");
   }

   public boolean getgxTv_SdtServLotado_Unid_nome_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtServLotado_Serv_lot_idade_N( )
   {
      return gxTv_SdtServLotado_Serv_lot_idade_N ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_idade_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Serv_lot_idade_N");
      gxTv_SdtServLotado_Serv_lot_idade_N = value ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_idade_N_SetNull( )
   {
      gxTv_SdtServLotado_Serv_lot_idade_N = (byte)(0) ;
      SetDirty("Serv_lot_idade_N");
   }

   public boolean getgxTv_SdtServLotado_Serv_lot_idade_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtServLotado_Serv_lot_unid_N( )
   {
      return gxTv_SdtServLotado_Serv_lot_unid_N ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_unid_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Serv_lot_unid_N");
      gxTv_SdtServLotado_Serv_lot_unid_N = value ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_unid_N_SetNull( )
   {
      gxTv_SdtServLotado_Serv_lot_unid_N = (byte)(0) ;
      SetDirty("Serv_lot_unid_N");
   }

   public boolean getgxTv_SdtServLotado_Serv_lot_unid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtServLotado_Serv_lot_foto_N( )
   {
      return gxTv_SdtServLotado_Serv_lot_foto_N ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_foto_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Serv_lot_foto_N");
      gxTv_SdtServLotado_Serv_lot_foto_N = value ;
   }

   public void setgxTv_SdtServLotado_Serv_lot_foto_N_SetNull( )
   {
      gxTv_SdtServLotado_Serv_lot_foto_N = (byte)(0) ;
      SetDirty("Serv_lot_foto_N");
   }

   public boolean getgxTv_SdtServLotado_Serv_lot_foto_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtServLotado_Unid_nome_N( )
   {
      return gxTv_SdtServLotado_Unid_nome_N ;
   }

   public void setgxTv_SdtServLotado_Unid_nome_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_nome_N");
      gxTv_SdtServLotado_Unid_nome_N = value ;
   }

   public void setgxTv_SdtServLotado_Unid_nome_N_SetNull( )
   {
      gxTv_SdtServLotado_Unid_nome_N = (byte)(0) ;
      SetDirty("Unid_nome_N");
   }

   public boolean getgxTv_SdtServLotado_Unid_nome_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.treinamento2.servlotado_bc obj;
      obj = new com.treinamento2.servlotado_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtServLotado_Serv_lot_unid = "" ;
      gxTv_SdtServLotado_Serv_lot_foto = "" ;
      gxTv_SdtServLotado_Unid_nome = "" ;
      gxTv_SdtServLotado_Mode = "" ;
      gxTv_SdtServLotado_Serv_lot_unid_Z = "" ;
      gxTv_SdtServLotado_Serv_lot_foto_Z = "" ;
      gxTv_SdtServLotado_Unid_nome_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.treinamento2.SdtServLotado Clone( )
   {
      com.treinamento2.SdtServLotado sdt;
      com.treinamento2.servlotado_bc obj;
      sdt = (com.treinamento2.SdtServLotado)(clone()) ;
      obj = (com.treinamento2.servlotado_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.treinamento2.StructSdtServLotado struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtServLotado_Serv_lot_id(struct.getServ_lot_id());
         setgxTv_SdtServLotado_Serv_lot_idade(struct.getServ_lot_idade());
         setgxTv_SdtServLotado_Serv_lot_unid(struct.getServ_lot_unid());
         setgxTv_SdtServLotado_Serv_lot_foto(struct.getServ_lot_foto());
         setgxTv_SdtServLotado_Unid_id(struct.getUnid_id());
         setgxTv_SdtServLotado_Unid_nome(struct.getUnid_nome());
         setgxTv_SdtServLotado_Mode(struct.getMode());
         setgxTv_SdtServLotado_Initialized(struct.getInitialized());
         setgxTv_SdtServLotado_Serv_lot_id_Z(struct.getServ_lot_id_Z());
         setgxTv_SdtServLotado_Serv_lot_idade_Z(struct.getServ_lot_idade_Z());
         setgxTv_SdtServLotado_Serv_lot_unid_Z(struct.getServ_lot_unid_Z());
         setgxTv_SdtServLotado_Serv_lot_foto_Z(struct.getServ_lot_foto_Z());
         setgxTv_SdtServLotado_Unid_id_Z(struct.getUnid_id_Z());
         setgxTv_SdtServLotado_Unid_nome_Z(struct.getUnid_nome_Z());
         setgxTv_SdtServLotado_Serv_lot_idade_N(struct.getServ_lot_idade_N());
         setgxTv_SdtServLotado_Serv_lot_unid_N(struct.getServ_lot_unid_N());
         setgxTv_SdtServLotado_Serv_lot_foto_N(struct.getServ_lot_foto_N());
         setgxTv_SdtServLotado_Unid_nome_N(struct.getUnid_nome_N());
      }
   }

   @SuppressWarnings("unchecked")
   public com.treinamento2.StructSdtServLotado getStruct( )
   {
      com.treinamento2.StructSdtServLotado struct = new com.treinamento2.StructSdtServLotado ();
      struct.setServ_lot_id(getgxTv_SdtServLotado_Serv_lot_id());
      struct.setServ_lot_idade(getgxTv_SdtServLotado_Serv_lot_idade());
      struct.setServ_lot_unid(getgxTv_SdtServLotado_Serv_lot_unid());
      struct.setServ_lot_foto(getgxTv_SdtServLotado_Serv_lot_foto());
      struct.setUnid_id(getgxTv_SdtServLotado_Unid_id());
      struct.setUnid_nome(getgxTv_SdtServLotado_Unid_nome());
      struct.setMode(getgxTv_SdtServLotado_Mode());
      struct.setInitialized(getgxTv_SdtServLotado_Initialized());
      struct.setServ_lot_id_Z(getgxTv_SdtServLotado_Serv_lot_id_Z());
      struct.setServ_lot_idade_Z(getgxTv_SdtServLotado_Serv_lot_idade_Z());
      struct.setServ_lot_unid_Z(getgxTv_SdtServLotado_Serv_lot_unid_Z());
      struct.setServ_lot_foto_Z(getgxTv_SdtServLotado_Serv_lot_foto_Z());
      struct.setUnid_id_Z(getgxTv_SdtServLotado_Unid_id_Z());
      struct.setUnid_nome_Z(getgxTv_SdtServLotado_Unid_nome_Z());
      struct.setServ_lot_idade_N(getgxTv_SdtServLotado_Serv_lot_idade_N());
      struct.setServ_lot_unid_N(getgxTv_SdtServLotado_Serv_lot_unid_N());
      struct.setServ_lot_foto_N(getgxTv_SdtServLotado_Serv_lot_foto_N());
      struct.setUnid_nome_N(getgxTv_SdtServLotado_Unid_nome_N());
      return struct ;
   }

   private byte sdtIsNull ;
   private byte gxTv_SdtServLotado_Serv_lot_idade_N ;
   private byte gxTv_SdtServLotado_Serv_lot_unid_N ;
   private byte gxTv_SdtServLotado_Serv_lot_foto_N ;
   private byte gxTv_SdtServLotado_Unid_nome_N ;
   private short gxTv_SdtServLotado_Serv_lot_idade ;
   private short gxTv_SdtServLotado_Initialized ;
   private short gxTv_SdtServLotado_Serv_lot_idade_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtServLotado_Serv_lot_id ;
   private int gxTv_SdtServLotado_Unid_id ;
   private int gxTv_SdtServLotado_Serv_lot_id_Z ;
   private int gxTv_SdtServLotado_Unid_id_Z ;
   private String gxTv_SdtServLotado_Mode ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtServLotado_Serv_lot_unid ;
   private String gxTv_SdtServLotado_Serv_lot_foto ;
   private String gxTv_SdtServLotado_Unid_nome ;
   private String gxTv_SdtServLotado_Serv_lot_unid_Z ;
   private String gxTv_SdtServLotado_Serv_lot_foto_Z ;
   private String gxTv_SdtServLotado_Unid_nome_Z ;
}

