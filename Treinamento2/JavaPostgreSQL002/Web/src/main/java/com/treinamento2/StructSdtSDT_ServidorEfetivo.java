package com.treinamento2 ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "SDT_ServidorEfetivo", namespace ="Treinamento2")
public final  class StructSdtSDT_ServidorEfetivo implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_ServidorEfetivo( )
   {
      this( -1, new ModelContext( StructSdtSDT_ServidorEfetivo.class ));
   }

   public StructSdtSDT_ServidorEfetivo( int remoteHandle ,
                                        ModelContext context )
   {
   }

   public  StructSdtSDT_ServidorEfetivo( java.util.Vector<StructSdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem> value )
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

   @javax.xml.bind.annotation.XmlElement(name="SDT_ServidorEfetivoItem",namespace="Treinamento2")
   public java.util.Vector<StructSdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem> item = new java.util.Vector<>();
}

