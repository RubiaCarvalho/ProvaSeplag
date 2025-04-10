package com.treinamento2 ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "Collotacao", namespace ="Treinamento2")
public final  class StructSdtCollotacao implements Cloneable, java.io.Serializable
{
   public StructSdtCollotacao( )
   {
      this( -1, new ModelContext( StructSdtCollotacao.class ));
   }

   public StructSdtCollotacao( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtCollotacao( java.util.Vector<StructSdtlotacao> value )
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

   @javax.xml.bind.annotation.XmlElement(name="lotacao",namespace="Treinamento2")
   public java.util.Vector<StructSdtlotacao> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtlotacao> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtlotacao> item = new java.util.Vector<>();
}

