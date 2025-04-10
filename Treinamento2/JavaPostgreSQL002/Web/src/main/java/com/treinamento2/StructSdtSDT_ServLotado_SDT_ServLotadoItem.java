package com.treinamento2 ;
import com.genexus.*;

public final  class StructSdtSDT_ServLotado_SDT_ServLotadoItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_ServLotado_SDT_ServLotadoItem( )
   {
      this( -1, new ModelContext( StructSdtSDT_ServLotado_SDT_ServLotadoItem.class ));
   }

   public StructSdtSDT_ServLotado_SDT_ServLotadoItem( int remoteHandle ,
                                                      ModelContext context )
   {
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid = "" ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto = "" ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome = "" ;
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

   public int getServ_lot_id( )
   {
      return gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id ;
   }

   public void setServ_lot_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id = value ;
   }

   public short getServ_lot_idade( )
   {
      return gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade ;
   }

   public void setServ_lot_idade( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade = value ;
   }

   public String getServ_lot_unid( )
   {
      return gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid ;
   }

   public void setServ_lot_unid( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid = value ;
   }

   public String getServ_lot_foto( )
   {
      return gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto ;
   }

   public void setServ_lot_foto( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto = value ;
   }

   public int getUnid_id( )
   {
      return gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id ;
   }

   public void setUnid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id = value ;
   }

   public String getUnid_nome( )
   {
      return gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome = value ;
   }

   protected byte sdtIsNull ;
   protected short gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade ;
   protected int gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id ;
   protected int gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id ;
   protected String gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid ;
   protected String gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto ;
   protected String gxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome ;
}

