package com.treinamento2 ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "Colservidor_temporario", namespace ="Treinamento2")
public final  class StructSdtColservidor_temporario implements Cloneable, java.io.Serializable
{
   public StructSdtColservidor_temporario( )
   {
      this( -1, new ModelContext( StructSdtColservidor_temporario.class ));
   }

   public StructSdtColservidor_temporario( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtColservidor_temporario( java.util.Vector<StructSdtservidor_temporario> value )
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

   @javax.xml.bind.annotation.XmlElement(name="servidor_temporario",namespace="Treinamento2")
   public java.util.Vector<StructSdtservidor_temporario> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtservidor_temporario> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtservidor_temporario> item = new java.util.Vector<>();
}

