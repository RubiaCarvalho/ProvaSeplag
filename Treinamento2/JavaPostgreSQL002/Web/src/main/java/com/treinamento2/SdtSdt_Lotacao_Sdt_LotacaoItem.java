package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdt_Lotacao_Sdt_LotacaoItem extends GxUserType
{
   public SdtSdt_Lotacao_Sdt_LotacaoItem( )
   {
      this(  new ModelContext(SdtSdt_Lotacao_Sdt_LotacaoItem.class));
   }

   public SdtSdt_Lotacao_Sdt_LotacaoItem( ModelContext context )
   {
      super( context, "SdtSdt_Lotacao_Sdt_LotacaoItem");
   }

   public SdtSdt_Lotacao_Sdt_LotacaoItem( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSdt_Lotacao_Sdt_LotacaoItem");
   }

   public SdtSdt_Lotacao_Sdt_LotacaoItem( StructSdtSdt_Lotacao_Sdt_LotacaoItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_id") )
            {
               gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pes_id") )
            {
               gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unid_id") )
            {
               gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_data_lotacao") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao = GXutil.nullDate() ;
                  gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao_N = (byte)(0) ;
                  gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_data_remocao") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao = GXutil.nullDate() ;
                  gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao_N = (byte)(0) ;
                  gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lot_portaria") )
            {
               gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria = oReader.getValue() ;
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
         sName = "Sdt_Lotacao.Sdt_LotacaoItem" ;
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
      oWriter.writeElement("lot_id", GXutil.trim( GXutil.str( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("pes_id", GXutil.trim( GXutil.str( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("unid_id", GXutil.trim( GXutil.str( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao)) && ( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao_N == 1 ) )
      {
         oWriter.writeElement("lot_data_lotacao", "");
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("lot_data_lotacao", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao)) && ( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao_N == 1 ) )
      {
         oWriter.writeElement("lot_data_remocao", "");
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("lot_data_remocao", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
         {
            oWriter.writeAttribute("xmlns", "Treinamento2");
         }
      }
      oWriter.writeElement("lot_portaria", gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria);
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
      AddObjectProperty("lot_id", gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id, false, false);
      AddObjectProperty("pes_id", gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id, false, false);
      AddObjectProperty("unid_id", gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("lot_data_lotacao", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("lot_data_remocao", sDateCnv, false, false);
      AddObjectProperty("lot_portaria", gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria, false, false);
   }

   public int getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id( )
   {
      return gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id ;
   }

   public void setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id = value ;
   }

   public int getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id( )
   {
      return gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id ;
   }

   public void setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id = value ;
   }

   public int getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id( )
   {
      return gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id ;
   }

   public void setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id = value ;
   }

   public java.util.Date getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao( )
   {
      return gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao ;
   }

   public void setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao( java.util.Date value )
   {
      gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao = value ;
   }

   public java.util.Date getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao( )
   {
      return gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao ;
   }

   public void setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao( java.util.Date value )
   {
      gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao = value ;
   }

   public String getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria( )
   {
      return gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria ;
   }

   public void setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao = GXutil.nullDate() ;
      gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao_N = (byte)(1) ;
      gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao = GXutil.nullDate() ;
      gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao_N = (byte)(1) ;
      gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem Clone( )
   {
      return (com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem)(clone()) ;
   }

   public void setStruct( com.treinamento2.StructSdtSdt_Lotacao_Sdt_LotacaoItem struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id(struct.getLot_id());
         setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id(struct.getPes_id());
         setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id(struct.getUnid_id());
         if ( struct.gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao_N == 0 )
         {
            setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao(struct.getLot_data_lotacao());
         }
         if ( struct.gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao_N == 0 )
         {
            setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao(struct.getLot_data_remocao());
         }
         setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria(struct.getLot_portaria());
      }
   }

   @SuppressWarnings("unchecked")
   public com.treinamento2.StructSdtSdt_Lotacao_Sdt_LotacaoItem getStruct( )
   {
      com.treinamento2.StructSdtSdt_Lotacao_Sdt_LotacaoItem struct = new com.treinamento2.StructSdtSdt_Lotacao_Sdt_LotacaoItem ();
      struct.setLot_id(getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id());
      struct.setPes_id(getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id());
      struct.setUnid_id(getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id());
      if ( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao_N == 0 )
      {
         struct.setLot_data_lotacao(getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao());
      }
      if ( gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao_N == 0 )
      {
         struct.setLot_data_remocao(getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao());
      }
      struct.setLot_portaria(getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected byte gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao_N ;
   protected byte gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id ;
   protected int gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id ;
   protected int gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao ;
   protected java.util.Date gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria ;
}

