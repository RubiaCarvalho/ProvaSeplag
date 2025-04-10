package com.treinamento2 ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "Sdt_unidade", namespace ="Treinamento2")
public final  class StructSdtSdt_unidade implements Cloneable, java.io.Serializable
{
   public StructSdtSdt_unidade( )
   {
      this( -1, new ModelContext( StructSdtSdt_unidade.class ));
   }

   public StructSdtSdt_unidade( int remoteHandle ,
                                ModelContext context )
   {
   }

   public  StructSdtSdt_unidade( java.util.Vector<StructSdtSdt_unidade_Sdt_unidadeItem> value )
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

   @javax.xml.bind.annotation.XmlElement(name="Sdt_unidadeItem",namespace="Treinamento2")
   public java.util.Vector<StructSdtSdt_unidade_Sdt_unidadeItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdt_unidade_Sdt_unidadeItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdt_unidade_Sdt_unidadeItem> item = new java.util.Vector<>();
}

