package com.treinamento2 ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "SDT_EndFuncional", namespace ="Treinamento2")
public final  class StructSdtSDT_EndFuncional implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_EndFuncional( )
   {
      this( -1, new ModelContext( StructSdtSDT_EndFuncional.class ));
   }

   public StructSdtSDT_EndFuncional( int remoteHandle ,
                                     ModelContext context )
   {
   }

   public  StructSdtSDT_EndFuncional( java.util.Vector<StructSdtSDT_EndFuncional_SDT_EndFuncionalItem> value )
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

   @javax.xml.bind.annotation.XmlElement(name="SDT_EndFuncionalItem",namespace="Treinamento2")
   public java.util.Vector<StructSdtSDT_EndFuncional_SDT_EndFuncionalItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDT_EndFuncional_SDT_EndFuncionalItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDT_EndFuncional_SDT_EndFuncionalItem> item = new java.util.Vector<>();
}

