package com.treinamento2 ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "SDT_ServLotado", namespace ="Treinamento2")
public final  class StructSdtSDT_ServLotado implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_ServLotado( )
   {
      this( -1, new ModelContext( StructSdtSDT_ServLotado.class ));
   }

   public StructSdtSDT_ServLotado( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtSDT_ServLotado( java.util.Vector<StructSdtSDT_ServLotado_SDT_ServLotadoItem> value )
   {
      item = value;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   @javax.xml.bind.annotation.XmlElement(name="SDT_ServLotadoItem",namespace="Treinamento2")
   public java.util.Vector<StructSdtSDT_ServLotado_SDT_ServLotadoItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDT_ServLotado_SDT_ServLotadoItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDT_ServLotado_SDT_ServLotadoItem> item = new java.util.Vector<>();
}

