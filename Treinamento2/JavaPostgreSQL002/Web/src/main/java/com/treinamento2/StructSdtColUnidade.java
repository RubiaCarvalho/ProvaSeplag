package com.treinamento2 ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColUnidade", namespace ="Treinamento2")
public final  class StructSdtColUnidade implements Cloneable, java.io.Serializable
{
   public StructSdtColUnidade( )
   {
      this( -1, new ModelContext( StructSdtColUnidade.class ));
   }

   public StructSdtColUnidade( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtColUnidade( java.util.Vector<StructSdtUnidade> value )
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

   @javax.xml.bind.annotation.XmlElement(name="Unidade",namespace="Treinamento2")
   public java.util.Vector<StructSdtUnidade> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtUnidade> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtUnidade> item = new java.util.Vector<>();
}

