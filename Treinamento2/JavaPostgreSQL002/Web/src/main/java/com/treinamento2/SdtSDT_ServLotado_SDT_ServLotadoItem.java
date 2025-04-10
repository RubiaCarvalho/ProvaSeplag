package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ServLotado_SDT_ServLotadoItem extends GxUserType
{
   public SdtSDT_ServLotado_SDT_ServLotadoItem( )
   {
      this(  new ModelContext(SdtSDT_ServLotado_SDT_ServLotadoItem.class));
   }

   public SdtSDT_ServLotado_SDT_ServLotadoItem( ModelContext context )
   {
      super( context, "SdtSDT_ServLotado_SDT_ServLotadoItem");
   }

   public SdtSDT_ServLotado_SDT_ServLotadoItem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ServLotado_SDT_ServLotadoItem");
   }

   public SdtSDT_ServLotado_SDT_ServLotadoItem( StructSdtSDT_ServLotado_SDT_ServLotadoItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_lot_id") )
            {
               gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_lot_idade") )
            {
               gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_lot_unid") )
            {
               gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "serv_lot_foto") )
            {
               gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id") )
            {
               gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_nome") )
            {
               gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome = oReader.getValue() ;
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
         sName = "SDT_ServLotado.SDT_ServLotadoItem" ;
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
      oWriter.writeElement("serv_lot_id", GXutil.trim( GXutil.str( gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("serv_lot_idade", GXutil.trim( GXutil.str( gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("serv_lot_unid", gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid);
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("serv_lot_foto", gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto);
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("unid_id", GXutil.trim( GXutil.str( gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("unid_nome", gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome);
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
      AddObjectProperty("serv_lot_id", gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id, false, false);
      AddObjectProperty("serv_lot_idade", gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade, false, false);
      AddObjectProperty("serv_lot_unid", gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid, false, false);
      AddObjectProperty("serv_lot_foto", gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto, false, false);
      AddObjectProperty("unid_id", gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id, false, false);
      AddObjectProperty("unid_nome", gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome, false, false);
   }

   public int getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id( )
   {
      return gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id ;
   }

   public void setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id = value ;
   }

   public short getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade( )
   {
      return gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade ;
   }

   public void setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade = value ;
   }

   public String getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid( )
   {
      return gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid ;
   }

   public void setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid = value ;
   }

   public String getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto( )
   {
      return gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto ;
   }

   public void setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto = value ;
   }

   public int getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id( )
   {
      return gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id ;
   }

   public void setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id = value ;
   }

   public String getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome( )
   {
      return gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome ;
   }

   public void setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid = "" ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto = "" ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem Clone( )
   {
      return (com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem)(clone()) ;
   }

   public void setStruct( com.treinamento2.StructSdtSDT_ServLotado_SDT_ServLotadoItem struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id(struct.getServ_lot_id());
         setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade(struct.getServ_lot_idade());
         setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid(struct.getServ_lot_unid());
         setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto(struct.getServ_lot_foto());
         setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id(struct.getUnid_id());
         setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome(struct.getUnid_nome());
      }
   }

   @SuppressWarnings("unchecked")
   public com.treinamento2.StructSdtSDT_ServLotado_SDT_ServLotadoItem getStruct( )
   {
      com.treinamento2.StructSdtSDT_ServLotado_SDT_ServLotadoItem struct = new com.treinamento2.StructSdtSDT_ServLotado_SDT_ServLotadoItem ();
      struct.setServ_lot_id(getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id());
      struct.setServ_lot_idade(getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade());
      struct.setServ_lot_unid(getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid());
      struct.setServ_lot_foto(getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto());
      struct.setUnid_id(getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id());
      struct.setUnid_nome(getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected short gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id ;
   protected int gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid ;
   protected String gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto ;
   protected String gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome ;
}

