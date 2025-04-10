package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem extends GxUserType
{
   public SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem( )
   {
      this(  new ModelContext(SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem.class));
   }

   public SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem( ModelContext context )
   {
      super( context, "SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem");
   }

   public SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem");
   }

   public SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem( StructSdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem struct )
   {
      this();
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id") )
            {
               gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Pes_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "se_matricula") )
            {
               gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Se_matricula = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_efet_nome") )
            {
               gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_efet_idade") )
            {
               gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_idade = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_efet_foto") )
            {
               gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_foto = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id") )
            {
               gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Unid_id = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDT_ServidorEfetivo.SDT_ServidorEfetivoItem" ;
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
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Pes_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("se_matricula", gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Se_matricula);
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("serv_efet_nome", gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_nome);
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("serv_efet_idade", GXutil.trim( GXutil.str( gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_idade, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("serv_efet_foto", gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_foto);
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("unid_id", GXutil.trim( GXutil.str( gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Unid_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
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
      AddObjectProperty("pes_id", gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Pes_id, false, false);
      AddObjectProperty("se_matricula", gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Se_matricula, false, false);
      AddObjectProperty("serv_efet_nome", gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_nome, false, false);
      AddObjectProperty("serv_efet_idade", gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_idade, false, false);
      AddObjectProperty("serv_efet_foto", gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_foto, false, false);
      AddObjectProperty("unid_id", gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Unid_id, false, false);
   }

   public int getgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Pes_id( )
   {
      return gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Pes_id ;
   }

   public void setgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Pes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Pes_id = value ;
   }

   public String getgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Se_matricula( )
   {
      return gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Se_matricula ;
   }

   public void setgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Se_matricula( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Se_matricula = value ;
   }

   public String getgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_nome( )
   {
      return gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_nome ;
   }

   public void setgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_nome = value ;
   }

   public short getgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_idade( )
   {
      return gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_idade ;
   }

   public void setgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_idade( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_idade = value ;
   }

   public String getgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_foto( )
   {
      return gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_foto ;
   }

   public void setgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_foto( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_foto = value ;
   }

   public int getgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Unid_id( )
   {
      return gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Unid_id ;
   }

   public void setgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Unid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Unid_id = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Se_matricula = "" ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_nome = "" ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_foto = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.treinamento2.SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem Clone( )
   {
      return (com.treinamento2.SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem)(clone()) ;
   }

   public void setStruct( com.treinamento2.StructSdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Pes_id(struct.getPes_id());
         setgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Se_matricula(struct.getSe_matricula());
         setgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_nome(struct.getServ_efet_nome());
         setgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_idade(struct.getServ_efet_idade());
         setgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_foto(struct.getServ_efet_foto());
         setgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Unid_id(struct.getUnid_id());
      }
   }

   @SuppressWarnings("unchecked")
   public com.treinamento2.StructSdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem getStruct( )
   {
      com.treinamento2.StructSdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem struct = new com.treinamento2.StructSdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem ();
      struct.setPes_id(getgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Pes_id());
      struct.setSe_matricula(getgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Se_matricula());
      struct.setServ_efet_nome(getgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_nome());
      struct.setServ_efet_idade(getgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_idade());
      struct.setServ_efet_foto(getgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_foto());
      struct.setUnid_id(getgxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Unid_id());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected short gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_idade ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Pes_id ;
   protected int gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Unid_id ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Se_matricula ;
   protected String gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_nome ;
   protected String gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_foto ;
}

