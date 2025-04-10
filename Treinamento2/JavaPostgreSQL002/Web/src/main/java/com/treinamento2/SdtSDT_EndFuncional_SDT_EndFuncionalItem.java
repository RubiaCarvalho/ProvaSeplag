package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_EndFuncional_SDT_EndFuncionalItem extends GxUserType
{
   public SdtSDT_EndFuncional_SDT_EndFuncionalItem( )
   {
      this(  new ModelContext(SdtSDT_EndFuncional_SDT_EndFuncionalItem.class));
   }

   public SdtSDT_EndFuncional_SDT_EndFuncionalItem( ModelContext context )
   {
      super( context, "SdtSDT_EndFuncional_SDT_EndFuncionalItem");
   }

   public SdtSDT_EndFuncional_SDT_EndFuncionalItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_EndFuncional_SDT_EndFuncionalItem");
   }

   public SdtSDT_EndFuncional_SDT_EndFuncionalItem( StructSdtSDT_EndFuncional_SDT_EndFuncionalItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "end_funcional_id") )
            {
               gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unidade_id") )
            {
               gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "endereco_id") )
            {
               gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDT_EndFuncional.SDT_EndFuncionalItem" ;
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
      oWriter.writeElement("end_funcional_id", GXutil.trim( GXutil.str( gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("unidade_id", GXutil.trim( GXutil.str( gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "Treinamento2") != 0 )
      {
         oWriter.writeAttribute("xmlns", "Treinamento2");
      }
      oWriter.writeElement("endereco_id", GXutil.trim( GXutil.str( gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id, 8, 0)));
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
      AddObjectProperty("end_funcional_id", gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id, false, false);
      AddObjectProperty("unidade_id", gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id, false, false);
      AddObjectProperty("endereco_id", gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id, false, false);
   }

   public short getgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id( )
   {
      return gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id ;
   }

   public void setgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id = value ;
   }

   public int getgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id( )
   {
      return gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id ;
   }

   public void setgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id = value ;
   }

   public int getgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id( )
   {
      return gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id ;
   }

   public void setgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sdtIsNull = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return sdtIsNull ;
   }

   public com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem Clone( )
   {
      return (com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem)(clone()) ;
   }

   public void setStruct( com.treinamento2.StructSdtSDT_EndFuncional_SDT_EndFuncionalItem struct )
   {
      if ( struct != null )
      {
         setgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id(struct.getEnd_funcional_id());
         setgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id(struct.getUnidade_id());
         setgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id(struct.getEndereco_id());
      }
   }

   @SuppressWarnings("unchecked")
   public com.treinamento2.StructSdtSDT_EndFuncional_SDT_EndFuncionalItem getStruct( )
   {
      com.treinamento2.StructSdtSDT_EndFuncional_SDT_EndFuncionalItem struct = new com.treinamento2.StructSdtSDT_EndFuncional_SDT_EndFuncionalItem ();
      struct.setEnd_funcional_id(getgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id());
      struct.setUnidade_id(getgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id());
      struct.setEndereco_id(getgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id());
      return struct ;
   }

   protected byte sdtIsNull ;
   protected short gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id ;
   protected int gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

