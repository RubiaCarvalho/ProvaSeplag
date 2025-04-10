package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdt_serv_efet_Sdt_serv_efetItem extends GxUserType
{
   public SdtSdt_serv_efet_Sdt_serv_efetItem( )
   {
      this(  new ModelContext(SdtSdt_serv_efet_Sdt_serv_efetItem.class));
   }

   public SdtSdt_serv_efet_Sdt_serv_efetItem( ModelContext context )
   {
      super( context, "SdtSdt_serv_efet_Sdt_serv_efetItem");
   }

   public SdtSdt_serv_efet_Sdt_serv_efetItem( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSdt_serv_efet_Sdt_serv_efetItem");
   }

   public SdtSdt_serv_efet_Sdt_serv_efetItem( StructSdtSdt_serv_efet_Sdt_serv_efetItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "se_pes_id") )
            {
               gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "se_matricula") )
            {
               gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula = oReader.getValue() ;
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
         sName = "Sdt_serv_efet.Sdt_serv_efetItem" ;
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
      oWriter.writeElement("se_pes_id", GXutil.trim( GXutil.str( gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("se_matricula", gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula);
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
      AddObjectProperty("se_pes_id", gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id, false, false);
      AddObjectProperty("se_matricula", gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula, false, false);
   }

   public int getgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id( )
   {
      return gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id ;
   }

   public void setgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id = value ;
   }

   public String getgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula( )
   {
      return gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula ;
   }

   public void setgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem Clone( )
   {
      return (com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem)(clone()) ;
   }

   public void setStruct( com.treinamento2.StructSdtSdt_serv_efet_Sdt_serv_efetItem struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id(struct.getSe_pes_id());
         setgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula(struct.getSe_matricula());
      }
   }

   @SuppressWarnings("unchecked")
   public com.treinamento2.StructSdtSdt_serv_efet_Sdt_serv_efetItem getStruct( )
   {
      com.treinamento2.StructSdtSdt_serv_efet_Sdt_serv_efetItem struct = new com.treinamento2.StructSdtSdt_serv_efet_Sdt_serv_efetItem ();
      struct.setSe_pes_id(getgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id());
      struct.setSe_matricula(getgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula ;
}

