package com.treinamento2 ;
import com.genexus.*;

public final  class StructSdtSdt_serv_temp_Sdt_serv_tempItem implements Cloneable, java.io.Serializable
{
   public StructSdtSdt_serv_temp_Sdt_serv_tempItem( )
   {
      this( -1, new ModelContext( StructSdtSdt_serv_temp_Sdt_serv_tempItem.class ));
   }

   public StructSdtSdt_serv_temp_Sdt_serv_tempItem( int remoteHandle ,
                                                    ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao = cal.getTime() ;
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao = cal.getTime() ;
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao_N = (byte)(1) ;
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao_N = (byte)(1) ;
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

   public int getSt_pes_id( )
   {
      return gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id ;
   }

   public void setSt_pes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id = value ;
   }

   public java.util.Date getSt_data_admissao( )
   {
      return gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao ;
   }

   public void setSt_data_admissao( java.util.Date value )
   {
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao = value ;
   }

   public java.util.Date getSt_data_demissao( )
   {
      return gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao ;
   }

   public void setSt_data_demissao( java.util.Date value )
   {
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao = value ;
   }

   protected byte gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao_N ;
   protected byte gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao_N ;
   protected byte sdtIsNull ;
   protected int gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id ;
   protected java.util.Date gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao ;
   protected java.util.Date gxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao ;
}

