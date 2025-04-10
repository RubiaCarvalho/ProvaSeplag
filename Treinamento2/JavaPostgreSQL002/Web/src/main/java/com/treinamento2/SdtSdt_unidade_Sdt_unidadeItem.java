package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdt_unidade_Sdt_unidadeItem extends GxUserType
{
   public SdtSdt_unidade_Sdt_unidadeItem( )
   {
      this(  new ModelContext(SdtSdt_unidade_Sdt_unidadeItem.class));
   }

   public SdtSdt_unidade_Sdt_unidadeItem( ModelContext context )
   {
      super( context, "SdtSdt_unidade_Sdt_unidadeItem");
   }

   public SdtSdt_unidade_Sdt_unidadeItem( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSdt_unidade_Sdt_unidadeItem");
   }

   public SdtSdt_unidade_Sdt_unidadeItem( StructSdtSdt_unidade_Sdt_unidadeItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id") )
            {
               gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome") )
            {
               gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_sigla") )
            {
               gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla = oReader.getValue() ;
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
         sName = "Sdt_unidade.Sdt_unidadeItem" ;
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
      oWriter.writeElement("unid_id", GXutil.trim( GXutil.str( gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("unid_nome", gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome);
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("unid_sigla", gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla);
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
      AddObjectProperty("unid_id", gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id, false, false);
      AddObjectProperty("unid_nome", gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome, false, false);
      AddObjectProperty("unid_sigla", gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla, false, false);
   }

   public int getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id( )
   {
      return gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id ;
   }

   public void setgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id = value ;
   }

   public String getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome( )
   {
      return gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome ;
   }

   public void setgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome = value ;
   }

   public String getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla( )
   {
      return gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla ;
   }

   public void setgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome = "" ;
      gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem Clone( )
   {
      return (com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem)(clone()) ;
   }

   public void setStruct( com.treinamento2.StructSdtSdt_unidade_Sdt_unidadeItem struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id(struct.getUnid_id());
         setgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome(struct.getUnid_nome());
         setgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla(struct.getUnid_sigla());
      }
   }

   @SuppressWarnings("unchecked")
   public com.treinamento2.StructSdtSdt_unidade_Sdt_unidadeItem getStruct( )
   {
      com.treinamento2.StructSdtSdt_unidade_Sdt_unidadeItem struct = new com.treinamento2.StructSdtSdt_unidade_Sdt_unidadeItem ();
      struct.setUnid_id(getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id());
      struct.setUnid_nome(getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome());
      struct.setUnid_sigla(getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome ;
   protected String gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla ;
}

