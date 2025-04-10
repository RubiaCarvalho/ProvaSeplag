package com.treinamento2 ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "ColServLotado", namespace ="Treinamento2")
public final  class StructSdtColServLotado implements Cloneable, java.io.Serializable
{
   public StructSdtColServLotado( )
   {
      this( -1, new ModelContext( StructSdtColServLotado.class ));
   }

   public StructSdtColServLotado( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColServLotado( java.util.Vector<StructSdtServLotado> value )
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

   @javax.xml.bind.annotation.XmlElement(name="ServLotado",namespace="Treinamento2")
   public java.util.Vector<StructSdtServLotado> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtServLotado> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtServLotado> item = new java.util.Vector<>();
}

