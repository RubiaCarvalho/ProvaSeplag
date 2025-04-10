package com.treinamento2 ;
import com.genexus.*;

public final  class StructSdtSDT_EndFuncional_SDT_EndFuncionalItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_EndFuncional_SDT_EndFuncionalItem( )
   {
      this( -1, new ModelContext( StructSdtSDT_EndFuncional_SDT_EndFuncionalItem.class ));
   }

   public StructSdtSDT_EndFuncional_SDT_EndFuncionalItem( int remoteHandle ,
                                                          ModelContext context )
   {
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

   public short getEnd_funcional_id( )
   {
      return gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id ;
   }

   public void setEnd_funcional_id( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id = value ;
   }

   public int getUnidade_id( )
   {
      return gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id ;
   }

   public void setUnidade_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id = value ;
   }

   public int getEndereco_id( )
   {
      return gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id ;
   }

   public void setEndereco_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id = value ;
   }

   protected byte sdtIsNull ;
   protected short gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id ;
   protected int gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id ;
   protected int gxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id ;
}

