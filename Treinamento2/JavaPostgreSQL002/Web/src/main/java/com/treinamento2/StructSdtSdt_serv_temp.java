package com.treinamento2 ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "Sdt_serv_temp", namespace ="Treinamento2")
public final  class StructSdtSdt_serv_temp implements Cloneable, java.io.Serializable
{
   public StructSdtSdt_serv_temp( )
   {
      this( -1, new ModelContext( StructSdtSdt_serv_temp.class ));
   }

   public StructSdtSdt_serv_temp( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtSdt_serv_temp( java.util.Vector<StructSdtSdt_serv_temp_Sdt_serv_tempItem> value )
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

   @javax.xml.bind.annotation.XmlElement(name="Sdt_serv_tempItem",namespace="Treinamento2")
   public java.util.Vector<StructSdtSdt_serv_temp_Sdt_serv_tempItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdt_serv_temp_Sdt_serv_tempItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdt_serv_temp_Sdt_serv_tempItem> item = new java.util.Vector<>();
}

