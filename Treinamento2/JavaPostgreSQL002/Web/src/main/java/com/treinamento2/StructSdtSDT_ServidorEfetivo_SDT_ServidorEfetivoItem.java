package com.treinamento2 ;
import com.genexus.*;

public final  class StructSdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem( )
   {
      this( -1, new ModelContext( StructSdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem.class ));
   }

   public StructSdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem( int remoteHandle ,
                                                                ModelContext context )
   {
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Se_matricula = "" ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_nome = "" ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_foto = "" ;
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

   public int getPes_id( )
   {
      return gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Pes_id ;
   }

   public void setPes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Pes_id = value ;
   }

   public String getSe_matricula( )
   {
      return gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Se_matricula ;
   }

   public void setSe_matricula( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Se_matricula = value ;
   }

   public String getServ_efet_nome( )
   {
      return gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_nome ;
   }

   public void setServ_efet_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_nome = value ;
   }

   public short getServ_efet_idade( )
   {
      return gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_idade ;
   }

   public void setServ_efet_idade( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_idade = value ;
   }

   public String getServ_efet_foto( )
   {
      return gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_foto ;
   }

   public void setServ_efet_foto( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_foto = value ;
   }

   public int getUnid_id( )
   {
      return gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Unid_id ;
   }

   public void setUnid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Unid_id = value ;
   }

   protected byte sdtIsNull ;
   protected short gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_idade ;
   protected int gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Pes_id ;
   protected int gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Unid_id ;
   protected String gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Se_matricula ;
   protected String gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_nome ;
   protected String gxTv_SdtSDT_ServidorEfetivo_SDT_ServidorEfetivoItem_Serv_efet_foto ;
}

