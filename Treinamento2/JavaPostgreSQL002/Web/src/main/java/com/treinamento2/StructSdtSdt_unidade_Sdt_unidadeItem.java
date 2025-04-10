package com.treinamento2 ;
import com.genexus.*;

public final  class StructSdtSdt_unidade_Sdt_unidadeItem implements Cloneable, java.io.Serializable
{
   public StructSdtSdt_unidade_Sdt_unidadeItem( )
   {
      this( -1, new ModelContext( StructSdtSdt_unidade_Sdt_unidadeItem.class ));
   }

   public StructSdtSdt_unidade_Sdt_unidadeItem( int remoteHandle ,
                                                ModelContext context )
   {
      gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome = "" ;
      gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla = "" ;
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

   public int getUnid_id( )
   {
      return gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id ;
   }

   public void setUnid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id = value ;
   }

   public String getUnid_nome( )
   {
      return gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome = value ;
   }

   public String getUnid_sigla( )
   {
      return gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla ;
   }

   public void setUnid_sigla( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla = value ;
   }

   protected byte sdtIsNull ;
   protected int gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id ;
   protected String gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome ;
   protected String gxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla ;
}

