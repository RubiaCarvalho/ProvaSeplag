package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtUnidade extends GxSilentTrnSdt
{
   public SdtUnidade( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtUnidade.class));
   }

   public SdtUnidade( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtUnidade");
      initialize( remoteHandle) ;
   }

   public SdtUnidade( int remoteHandle ,
                      StructSdtUnidade struct )
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

   public void Load( int AV6unid_id )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Integer.valueOf(AV6unid_id)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"unid_id", int.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Unidade");
      metadata.set("BT", "Unidade");
      metadata.set("PK", "[ \"unid_id\" ]");
      metadata.set("PKAssigned", "[ \"unid_id\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id") )
            {
               gxTv_SdtUnidade_Unid_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome") )
            {
               gxTv_SdtUnidade_Unid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla") )
            {
               gxTv_SdtUnidade_Unid_sigla = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtUnidade_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtUnidade_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id_Z") )
            {
               gxTv_SdtUnidade_Unid_id_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome_Z") )
            {
               gxTv_SdtUnidade_Unid_nome_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla_Z") )
            {
               gxTv_SdtUnidade_Unid_sigla_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome_N") )
            {
               gxTv_SdtUnidade_Unid_nome_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla_N") )
            {
               gxTv_SdtUnidade_Unid_sigla_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "Unidade" ;
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
      oWriter.writeElement("unid_id", GXutil.trim( GXutil.str( gxTv_SdtUnidade_Unid_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("unid_nome", gxTv_SdtUnidade_Unid_nome);
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("unid_sigla", gxTv_SdtUnidade_Unid_sigla);
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtUnidade_Mode);
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtUnidade_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("unid_id_Z", GXutil.trim( GXutil.str( gxTv_SdtUnidade_Unid_id_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("unid_nome_Z", gxTv_SdtUnidade_Unid_nome_Z);
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("unid_sigla_Z", gxTv_SdtUnidade_Unid_sigla_Z);
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("unid_nome_N", GXutil.trim( GXutil.str( gxTv_SdtUnidade_Unid_nome_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
         oWriter.writeElement("unid_sigla_N", GXutil.trim( GXutil.str( gxTv_SdtUnidade_Unid_sigla_N, 1, 0)));
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
      AddObjectProperty("unid_id", gxTv_SdtUnidade_Unid_id, false, includeNonInitialized);
      AddObjectProperty("unid_nome", gxTv_SdtUnidade_Unid_nome, false, includeNonInitialized);
      AddObjectProperty("unid_nome_N", gxTv_SdtUnidade_Unid_nome_N, false, includeNonInitialized);
      AddObjectProperty("unid_sigla", gxTv_SdtUnidade_Unid_sigla, false, includeNonInitialized);
      AddObjectProperty("unid_sigla_N", gxTv_SdtUnidade_Unid_sigla_N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtUnidade_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtUnidade_Initialized, false, includeNonInitialized);
         AddObjectProperty("unid_id_Z", gxTv_SdtUnidade_Unid_id_Z, false, includeNonInitialized);
         AddObjectProperty("unid_nome_Z", gxTv_SdtUnidade_Unid_nome_Z, false, includeNonInitialized);
         AddObjectProperty("unid_sigla_Z", gxTv_SdtUnidade_Unid_sigla_Z, false, includeNonInitialized);
         AddObjectProperty("unid_nome_N", gxTv_SdtUnidade_Unid_nome_N, false, includeNonInitialized);
         AddObjectProperty("unid_sigla_N", gxTv_SdtUnidade_Unid_sigla_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( com.treinamento2.SdtUnidade sdt )
   {
      if ( sdt.IsDirty("unid_id") )
      {
         sdtIsNull = (byte)(0) ;
         gxTv_SdtUnidade_Unid_id = sdt.getgxTv_SdtUnidade_Unid_id() ;
      }
      if ( sdt.IsDirty("unid_nome") )
      {
         gxTv_SdtUnidade_Unid_nome_N = sdt.getgxTv_SdtUnidade_Unid_nome_N() ;
         sdtIsNull = (byte)(0) ;
         gxTv_SdtUnidade_Unid_nome = sdt.getgxTv_SdtUnidade_Unid_nome() ;
      }
      if ( sdt.IsDirty("unid_sigla") )
      {
         gxTv_SdtUnidade_Unid_sigla_N = sdt.getgxTv_SdtUnidade_Unid_sigla_N() ;
         sdtIsNull = (byte)(0) ;
         gxTv_SdtUnidade_Unid_sigla = sdt.getgxTv_SdtUnidade_Unid_sigla() ;
      }
   }

   public int getgxTv_SdtUnidade_Unid_id( )
   {
      return gxTv_SdtUnidade_Unid_id ;
   }

   public void setgxTv_SdtUnidade_Unid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      if ( gxTv_SdtUnidade_Unid_id != value )
      {
         gxTv_SdtUnidade_Mode = "INS" ;
         this.setgxTv_SdtUnidade_Unid_id_Z_SetNull( );
         this.setgxTv_SdtUnidade_Unid_nome_Z_SetNull( );
         this.setgxTv_SdtUnidade_Unid_sigla_Z_SetNull( );
      }
      SetDirty("Unid_id");
      gxTv_SdtUnidade_Unid_id = value ;
   }

   public String getgxTv_SdtUnidade_Unid_nome( )
   {
      return gxTv_SdtUnidade_Unid_nome ;
   }

   public void setgxTv_SdtUnidade_Unid_nome( String value )
   {
      gxTv_SdtUnidade_Unid_nome_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_nome");
      gxTv_SdtUnidade_Unid_nome = value ;
   }

   public void setgxTv_SdtUnidade_Unid_nome_SetNull( )
   {
      gxTv_SdtUnidade_Unid_nome_N = (byte)(1) ;
      gxTv_SdtUnidade_Unid_nome = "" ;
      SetDirty("Unid_nome");
   }

   public boolean getgxTv_SdtUnidade_Unid_nome_IsNull( )
   {
      return (gxTv_SdtUnidade_Unid_nome_N==1) ;
   }

   public String getgxTv_SdtUnidade_Unid_sigla( )
   {
      return gxTv_SdtUnidade_Unid_sigla ;
   }

   public void setgxTv_SdtUnidade_Unid_sigla( String value )
   {
      gxTv_SdtUnidade_Unid_sigla_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_sigla");
      gxTv_SdtUnidade_Unid_sigla = value ;
   }

   public void setgxTv_SdtUnidade_Unid_sigla_SetNull( )
   {
      gxTv_SdtUnidade_Unid_sigla_N = (byte)(1) ;
      gxTv_SdtUnidade_Unid_sigla = "" ;
      SetDirty("Unid_sigla");
   }

   public boolean getgxTv_SdtUnidade_Unid_sigla_IsNull( )
   {
      return (gxTv_SdtUnidade_Unid_sigla_N==1) ;
   }

   public String getgxTv_SdtUnidade_Mode( )
   {
      return gxTv_SdtUnidade_Mode ;
   }

   public void setgxTv_SdtUnidade_Mode( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtUnidade_Mode = value ;
   }

   public void setgxTv_SdtUnidade_Mode_SetNull( )
   {
      gxTv_SdtUnidade_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtUnidade_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtUnidade_Initialized( )
   {
      return gxTv_SdtUnidade_Initialized ;
   }

   public void setgxTv_SdtUnidade_Initialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtUnidade_Initialized = value ;
   }

   public void setgxTv_SdtUnidade_Initialized_SetNull( )
   {
      gxTv_SdtUnidade_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtUnidade_Initialized_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtUnidade_Unid_id_Z( )
   {
      return gxTv_SdtUnidade_Unid_id_Z ;
   }

   public void setgxTv_SdtUnidade_Unid_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_id_Z");
      gxTv_SdtUnidade_Unid_id_Z = value ;
   }

   public void setgxTv_SdtUnidade_Unid_id_Z_SetNull( )
   {
      gxTv_SdtUnidade_Unid_id_Z = 0 ;
      SetDirty("Unid_id_Z");
   }

   public boolean getgxTv_SdtUnidade_Unid_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUnidade_Unid_nome_Z( )
   {
      return gxTv_SdtUnidade_Unid_nome_Z ;
   }

   public void setgxTv_SdtUnidade_Unid_nome_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_nome_Z");
      gxTv_SdtUnidade_Unid_nome_Z = value ;
   }

   public void setgxTv_SdtUnidade_Unid_nome_Z_SetNull( )
   {
      gxTv_SdtUnidade_Unid_nome_Z = "" ;
      SetDirty("Unid_nome_Z");
   }

   public boolean getgxTv_SdtUnidade_Unid_nome_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtUnidade_Unid_sigla_Z( )
   {
      return gxTv_SdtUnidade_Unid_sigla_Z ;
   }

   public void setgxTv_SdtUnidade_Unid_sigla_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_sigla_Z");
      gxTv_SdtUnidade_Unid_sigla_Z = value ;
   }

   public void setgxTv_SdtUnidade_Unid_sigla_Z_SetNull( )
   {
      gxTv_SdtUnidade_Unid_sigla_Z = "" ;
      SetDirty("Unid_sigla_Z");
   }

   public boolean getgxTv_SdtUnidade_Unid_sigla_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUnidade_Unid_nome_N( )
   {
      return gxTv_SdtUnidade_Unid_nome_N ;
   }

   public void setgxTv_SdtUnidade_Unid_nome_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_nome_N");
      gxTv_SdtUnidade_Unid_nome_N = value ;
   }

   public void setgxTv_SdtUnidade_Unid_nome_N_SetNull( )
   {
      gxTv_SdtUnidade_Unid_nome_N = (byte)(0) ;
      SetDirty("Unid_nome_N");
   }

   public boolean getgxTv_SdtUnidade_Unid_nome_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtUnidade_Unid_sigla_N( )
   {
      return gxTv_SdtUnidade_Unid_sigla_N ;
   }

   public void setgxTv_SdtUnidade_Unid_sigla_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      SetDirty("Unid_sigla_N");
      gxTv_SdtUnidade_Unid_sigla_N = value ;
   }

   public void setgxTv_SdtUnidade_Unid_sigla_N_SetNull( )
   {
      gxTv_SdtUnidade_Unid_sigla_N = (byte)(0) ;
      SetDirty("Unid_sigla_N");
   }

   public boolean getgxTv_SdtUnidade_Unid_sigla_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      com.treinamento2.unidade_bc obj;
      obj = new com.treinamento2.unidade_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtUnidade_Unid_nome = "" ;
      gxTv_SdtUnidade_Unid_sigla = "" ;
      gxTv_SdtUnidade_Mode = "" ;
      gxTv_SdtUnidade_Unid_nome_Z = "" ;
      gxTv_SdtUnidade_Unid_sigla_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.treinamento2.SdtUnidade Clone( )
   {
      com.treinamento2.SdtUnidade sdt;
      com.treinamento2.unidade_bc obj;
      sdt = (com.treinamento2.SdtUnidade)(clone()) ;
      obj = (com.treinamento2.unidade_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( com.treinamento2.StructSdtUnidade struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtUnidade_Unid_id(struct.getUnid_id());
         setgxTv_SdtUnidade_Unid_nome(struct.getUnid_nome());
         setgxTv_SdtUnidade_Unid_sigla(struct.getUnid_sigla());
         setgxTv_SdtUnidade_Mode(struct.getMode());
         setgxTv_SdtUnidade_Initialized(struct.getInitialized());
         setgxTv_SdtUnidade_Unid_id_Z(struct.getUnid_id_Z());
         setgxTv_SdtUnidade_Unid_nome_Z(struct.getUnid_nome_Z());
         setgxTv_SdtUnidade_Unid_sigla_Z(struct.getUnid_sigla_Z());
         setgxTv_SdtUnidade_Unid_nome_N(struct.getUnid_nome_N());
         setgxTv_SdtUnidade_Unid_sigla_N(struct.getUnid_sigla_N());
      }
   }

   @SuppressWarnings("unchecked")
   public com.treinamento2.StructSdtUnidade getStruct( )
   {
      com.treinamento2.StructSdtUnidade struct = new com.treinamento2.StructSdtUnidade ();
      struct.setUnid_id(getgxTv_SdtUnidade_Unid_id());
      struct.setUnid_nome(getgxTv_SdtUnidade_Unid_nome());
      struct.setUnid_sigla(getgxTv_SdtUnidade_Unid_sigla());
      struct.setMode(getgxTv_SdtUnidade_Mode());
      struct.setInitialized(getgxTv_SdtUnidade_Initialized());
      struct.setUnid_id_Z(getgxTv_SdtUnidade_Unid_id_Z());
      struct.setUnid_nome_Z(getgxTv_SdtUnidade_Unid_nome_Z());
      struct.setUnid_sigla_Z(getgxTv_SdtUnidade_Unid_sigla_Z());
      struct.setUnid_nome_N(getgxTv_SdtUnidade_Unid_nome_N());
      struct.setUnid_sigla_N(getgxTv_SdtUnidade_Unid_sigla_N());
      return struct ;
   }

   private byte sdtIsNull ;
   private byte gxTv_SdtUnidade_Unid_nome_N ;
   private byte gxTv_SdtUnidade_Unid_sigla_N ;
   private short gxTv_SdtUnidade_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtUnidade_Unid_id ;
   private int gxTv_SdtUnidade_Unid_id_Z ;
   private String gxTv_SdtUnidade_Mode ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtUnidade_Unid_nome ;
   private String gxTv_SdtUnidade_Unid_sigla ;
   private String gxTv_SdtUnidade_Unid_nome_Z ;
   private String gxTv_SdtUnidade_Unid_sigla_Z ;
}

