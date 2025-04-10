package com.treinamento2 ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "Sdt_serv_efet", namespace ="Treinamento2")
public final  class StructSdtSdt_serv_efet implements Cloneable, java.io.Serializable
{
   public StructSdtSdt_serv_efet( )
   {
      this( -1, new ModelContext( StructSdtSdt_serv_efet.class ));
   }

   public StructSdtSdt_serv_efet( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtSdt_serv_efet( java.util.Vector<StructSdtSdt_serv_efet_Sdt_serv_efetItem> value )
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

   @javax.xml.bind.annotation.XmlElement(name="Sdt_serv_efetItem",namespace="Treinamento2")
   public java.util.Vector<StructSdtSdt_serv_efet_Sdt_serv_efetItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdt_serv_efet_Sdt_serv_efetItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdt_serv_efet_Sdt_serv_efetItem> item = new java.util.Vector<>();
}

