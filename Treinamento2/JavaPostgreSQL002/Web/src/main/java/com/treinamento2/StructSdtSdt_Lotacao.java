package com.treinamento2 ;
import com.genexus.*;

@javax.xml.bind.annotation.XmlType(name = "Sdt_Lotacao", namespace ="Treinamento2")
public final  class StructSdtSdt_Lotacao implements Cloneable, java.io.Serializable
{
   public StructSdtSdt_Lotacao( )
   {
      this( -1, new ModelContext( StructSdtSdt_Lotacao.class ));
   }

   public StructSdtSdt_Lotacao( int remoteHandle ,
                                ModelContext context )
   {
   }

   public  StructSdtSdt_Lotacao( java.util.Vector<StructSdtSdt_Lotacao_Sdt_LotacaoItem> value )
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

   @javax.xml.bind.annotation.XmlElement(name="Sdt_LotacaoItem",namespace="Treinamento2")
   public java.util.Vector<StructSdtSdt_Lotacao_Sdt_LotacaoItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdt_Lotacao_Sdt_LotacaoItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdt_Lotacao_Sdt_LotacaoItem> item = new java.util.Vector<>();
}

