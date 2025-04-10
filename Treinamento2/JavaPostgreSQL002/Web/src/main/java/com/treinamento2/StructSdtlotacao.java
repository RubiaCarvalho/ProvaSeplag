package com.treinamento2 ;
import com.genexus.*;

public final  class StructSdtlotacao implements Cloneable, java.io.Serializable
{
   public StructSdtlotacao( )
   {
      this( -1, new ModelContext( StructSdtlotacao.class ));
   }

   public StructSdtlotacao( int remoteHandle ,
                            ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_Sdtlotacao_Lot_data_lotacao = cal.getTime() ;
      gxTv_Sdtlotacao_Lot_data_remocao = cal.getTime() ;
      gxTv_Sdtlotacao_Lot_portaria = "" ;
      gxTv_Sdtlotacao_Mode = "" ;
      gxTv_Sdtlotacao_Lot_data_lotacao_Z = cal.getTime() ;
      gxTv_Sdtlotacao_Lot_data_remocao_Z = cal.getTime() ;
      gxTv_Sdtlotacao_Lot_portaria_Z = "" ;
      gxTv_Sdtlotacao_Lot_data_lotacao_N = (byte)(1) ;
      gxTv_Sdtlotacao_Lot_data_remocao_N = (byte)(1) ;
      gxTv_Sdtlotacao_Lot_portaria_N = (byte)(1) ;
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

   public int getLot_id( )
   {
      return gxTv_Sdtlotacao_Lot_id ;
   }

   public void setLot_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_id = value ;
   }

   public int getPes_id( )
   {
      return gxTv_Sdtlotacao_Pes_id ;
   }

   public void setPes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Pes_id = value ;
   }

   public int getUnid_id( )
   {
      return gxTv_Sdtlotacao_Unid_id ;
   }

   public void setUnid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Unid_id = value ;
   }

   public java.util.Date getLot_data_lotacao( )
   {
      return gxTv_Sdtlotacao_Lot_data_lotacao ;
   }

   public void setLot_data_lotacao( java.util.Date value )
   {
      gxTv_Sdtlotacao_Lot_data_lotacao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_data_lotacao = value ;
   }

   public java.util.Date getLot_data_remocao( )
   {
      return gxTv_Sdtlotacao_Lot_data_remocao ;
   }

   public void setLot_data_remocao( java.util.Date value )
   {
      gxTv_Sdtlotacao_Lot_data_remocao_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_data_remocao = value ;
   }

   public String getLot_portaria( )
   {
      return gxTv_Sdtlotacao_Lot_portaria ;
   }

   public void setLot_portaria( String value )
   {
      gxTv_Sdtlotacao_Lot_portaria_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_portaria = value ;
   }

   public String getMode( )
   {
      return gxTv_Sdtlotacao_Mode ;
   }

   public void setMode( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_Sdtlotacao_Initialized ;
   }

   public void setInitialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Initialized = value ;
   }

   public int getLot_id_Z( )
   {
      return gxTv_Sdtlotacao_Lot_id_Z ;
   }

   public void setLot_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_id_Z = value ;
   }

   public int getPes_id_Z( )
   {
      return gxTv_Sdtlotacao_Pes_id_Z ;
   }

   public void setPes_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Pes_id_Z = value ;
   }

   public int getUnid_id_Z( )
   {
      return gxTv_Sdtlotacao_Unid_id_Z ;
   }

   public void setUnid_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Unid_id_Z = value ;
   }

   public java.util.Date getLot_data_lotacao_Z( )
   {
      return gxTv_Sdtlotacao_Lot_data_lotacao_Z ;
   }

   public void setLot_data_lotacao_Z( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_data_lotacao_Z = value ;
   }

   public java.util.Date getLot_data_remocao_Z( )
   {
      return gxTv_Sdtlotacao_Lot_data_remocao_Z ;
   }

   public void setLot_data_remocao_Z( java.util.Date value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_data_remocao_Z = value ;
   }

   public String getLot_portaria_Z( )
   {
      return gxTv_Sdtlotacao_Lot_portaria_Z ;
   }

   public void setLot_portaria_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_portaria_Z = value ;
   }

   public byte getLot_data_lotacao_N( )
   {
      return gxTv_Sdtlotacao_Lot_data_lotacao_N ;
   }

   public void setLot_data_lotacao_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_data_lotacao_N = value ;
   }

   public byte getLot_data_remocao_N( )
   {
      return gxTv_Sdtlotacao_Lot_data_remocao_N ;
   }

   public void setLot_data_remocao_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_data_remocao_N = value ;
   }

   public byte getLot_portaria_N( )
   {
      return gxTv_Sdtlotacao_Lot_portaria_N ;
   }

   public void setLot_portaria_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtlotacao_Lot_portaria_N = value ;
   }

   protected byte gxTv_Sdtlotacao_Lot_data_lotacao_N ;
   protected byte gxTv_Sdtlotacao_Lot_data_remocao_N ;
   protected byte gxTv_Sdtlotacao_Lot_portaria_N ;
   private byte sdtIsNull ;
   protected short gxTv_Sdtlotacao_Initialized ;
   protected int gxTv_Sdtlotacao_Lot_id ;
   protected int gxTv_Sdtlotacao_Pes_id ;
   protected int gxTv_Sdtlotacao_Unid_id ;
   protected int gxTv_Sdtlotacao_Lot_id_Z ;
   protected int gxTv_Sdtlotacao_Pes_id_Z ;
   protected int gxTv_Sdtlotacao_Unid_id_Z ;
   protected String gxTv_Sdtlotacao_Mode ;
   protected String gxTv_Sdtlotacao_Lot_portaria ;
   protected String gxTv_Sdtlotacao_Lot_portaria_Z ;
   protected java.util.Date gxTv_Sdtlotacao_Lot_data_lotacao ;
   protected java.util.Date gxTv_Sdtlotacao_Lot_data_remocao ;
   protected java.util.Date gxTv_Sdtlotacao_Lot_data_lotacao_Z ;
   protected java.util.Date gxTv_Sdtlotacao_Lot_data_remocao_Z ;
}

