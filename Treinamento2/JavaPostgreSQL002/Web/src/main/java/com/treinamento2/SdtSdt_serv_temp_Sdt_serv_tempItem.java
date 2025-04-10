package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdt_serv_temp_Sdt_serv_tempItem extends GxUserType
{
   public SdtSdt_serv_temp_Sdt_serv_tempItem( )
   {
      this(  new ModelContext(SdtSdt_serv_temp_Sdt_serv_tempItem.class));
   }

   public SdtSdt_serv_temp_Sdt_serv_tempItem( ModelContext context )
   {
      super( context, "SdtSdt_serv_temp_Sdt_serv_tempItem");
   }

   public SdtSdt_serv_temp_Sdt_serv_tempItem( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSdt_serv_temp_Sdt_serv_tempItem");
   }

   public SdtSdt_serv_temp_Sdt_serv_tempItem( StructSdtSdt_serv_temp_Sdt_serv_tempItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "st_pes_id") )
            {
               gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "st_data_admissao") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao = GXutil.nullDate() ;
                  gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao_N = (byte)(0) ;
                  gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "st_data_demissao") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao = GXutil.nullDate() ;
                  gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao_N = (byte)(0) ;
                  gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
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
         sName = "Sdt_serv_temp.Sdt_serv_tempItem" ;
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
      oWriter.writeElement("st_pes_id", GXutil.trim( GXutil.str( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao)) && ( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao_N == 1 ) )
      {
         oWriter.writeElement("st_data_admissao", "");
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("st_data_admissao", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao)) && ( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao_N == 1 ) )
      {
         oWriter.writeElement("st_data_demissao", "");
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("st_data_demissao", sDateCnv);
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
      AddObjectProperty("st_pes_id", gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("st_data_admissao", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("st_data_demissao", sDateCnv, false, false);
   }

   public int getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id( )
   {
      return gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id ;
   }

   public void setgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id = value ;
   }

   public java.util.Date getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao( )
   {
      return gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao ;
   }

   public void setgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao( java.util.Date value )
   {
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao = value ;
   }

   public java.util.Date getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao( )
   {
      return gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao ;
   }

   public void setgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao( java.util.Date value )
   {
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao = GXutil.nullDate() ;
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao_N = (byte)(1) ;
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao = GXutil.nullDate() ;
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem Clone( )
   {
      return (com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem)(clone()) ;
   }

   public void setStruct( com.treinamento2.StructSdtSdt_serv_temp_Sdt_serv_tempItem struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id(struct.getSt_pes_id());
         if ( struct.gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao_N == 0 )
         {
            setgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao(struct.getSt_data_admissao());
         }
         if ( struct.gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao_N == 0 )
         {
            setgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao(struct.getSt_data_demissao());
         }
      }
   }

   @SuppressWarnings("unchecked")
   public com.treinamento2.StructSdtSdt_serv_temp_Sdt_serv_tempItem getStruct( )
   {
      com.treinamento2.StructSdtSdt_serv_temp_Sdt_serv_tempItem struct = new com.treinamento2.StructSdtSdt_serv_temp_Sdt_serv_tempItem ();
      struct.setSt_pes_id(getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id());
      if ( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao_N == 0 )
      {
         struct.setSt_data_admissao(getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao());
      }
      if ( gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao_N == 0 )
      {
         struct.setSt_data_demissao(getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao());
      }
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao_N ;
   protected byte gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao ;
   protected java.util.Date gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao ;
   protected boolean readElement ;
   protected boolean formatError ;
}

