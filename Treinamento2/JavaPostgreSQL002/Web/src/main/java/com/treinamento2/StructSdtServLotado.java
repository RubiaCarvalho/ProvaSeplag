package com.treinamento2 ;
import com.genexus.*;

public final  class StructSdtServLotado implements Cloneable, java.io.Serializable
{
   public StructSdtServLotado( )
   {
      this( -1, new ModelContext( StructSdtServLotado.class ));
   }

   public StructSdtServLotado( int remoteHandle ,
                               ModelContext context )
   {
      gxTv_SdtServLotado_Serv_lot_unid = "" ;
      gxTv_SdtServLotado_Serv_lot_foto = "" ;
      gxTv_SdtServLotado_Unid_nome = "" ;
      gxTv_SdtServLotado_Mode = "" ;
      gxTv_SdtServLotado_Serv_lot_unid_Z = "" ;
      gxTv_SdtServLotado_Serv_lot_foto_Z = "" ;
      gxTv_SdtServLotado_Unid_nome_Z = "" ;
      gxTv_SdtServLotado_Serv_lot_idade_N = (byte)(1) ;
      gxTv_SdtServLotado_Serv_lot_unid_N = (byte)(1) ;
      gxTv_SdtServLotado_Serv_lot_foto_N = (byte)(1) ;
      gxTv_SdtServLotado_Unid_nome_N = (byte)(1) ;
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
      return gxTv_SdtServLotado_Serv_lot_id ;
   }

   public void setServ_lot_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Serv_lot_id = value ;
   }

   public short getServ_lot_idade( )
   {
      return gxTv_SdtServLotado_Serv_lot_idade ;
   }

   public void setServ_lot_idade( short value )
   {
      gxTv_SdtServLotado_Serv_lot_idade_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Serv_lot_idade = value ;
   }

   public String getServ_lot_unid( )
   {
      return gxTv_SdtServLotado_Serv_lot_unid ;
   }

   public void setServ_lot_unid( String value )
   {
      gxTv_SdtServLotado_Serv_lot_unid_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Serv_lot_unid = value ;
   }

   public String getServ_lot_foto( )
   {
      return gxTv_SdtServLotado_Serv_lot_foto ;
   }

   public void setServ_lot_foto( String value )
   {
      gxTv_SdtServLotado_Serv_lot_foto_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Serv_lot_foto = value ;
   }

   public int getUnid_id( )
   {
      return gxTv_SdtServLotado_Unid_id ;
   }

   public void setUnid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Unid_id = value ;
   }

   public String getUnid_nome( )
   {
      return gxTv_SdtServLotado_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      gxTv_SdtServLotado_Unid_nome_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Unid_nome = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtServLotado_Mode ;
   }

   public void setMode( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtServLotado_Initialized ;
   }

   public void setInitialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Initialized = value ;
   }

   public int getServ_lot_id_Z( )
   {
      return gxTv_SdtServLotado_Serv_lot_id_Z ;
   }

   public void setServ_lot_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Serv_lot_id_Z = value ;
   }

   public short getServ_lot_idade_Z( )
   {
      return gxTv_SdtServLotado_Serv_lot_idade_Z ;
   }

   public void setServ_lot_idade_Z( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Serv_lot_idade_Z = value ;
   }

   public String getServ_lot_unid_Z( )
   {
      return gxTv_SdtServLotado_Serv_lot_unid_Z ;
   }

   public void setServ_lot_unid_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Serv_lot_unid_Z = value ;
   }

   public String getServ_lot_foto_Z( )
   {
      return gxTv_SdtServLotado_Serv_lot_foto_Z ;
   }

   public void setServ_lot_foto_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Serv_lot_foto_Z = value ;
   }

   public int getUnid_id_Z( )
   {
      return gxTv_SdtServLotado_Unid_id_Z ;
   }

   public void setUnid_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Unid_id_Z = value ;
   }

   public String getUnid_nome_Z( )
   {
      return gxTv_SdtServLotado_Unid_nome_Z ;
   }

   public void setUnid_nome_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Unid_nome_Z = value ;
   }

   public byte getServ_lot_idade_N( )
   {
      return gxTv_SdtServLotado_Serv_lot_idade_N ;
   }

   public void setServ_lot_idade_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Serv_lot_idade_N = value ;
   }

   public byte getServ_lot_unid_N( )
   {
      return gxTv_SdtServLotado_Serv_lot_unid_N ;
   }

   public void setServ_lot_unid_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Serv_lot_unid_N = value ;
   }

   public byte getServ_lot_foto_N( )
   {
      return gxTv_SdtServLotado_Serv_lot_foto_N ;
   }

   public void setServ_lot_foto_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Serv_lot_foto_N = value ;
   }

   public byte getUnid_nome_N( )
   {
      return gxTv_SdtServLotado_Unid_nome_N ;
   }

   public void setUnid_nome_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtServLotado_Unid_nome_N = value ;
   }

   protected byte gxTv_SdtServLotado_Serv_lot_idade_N ;
   protected byte gxTv_SdtServLotado_Serv_lot_unid_N ;
   protected byte gxTv_SdtServLotado_Serv_lot_foto_N ;
   protected byte gxTv_SdtServLotado_Unid_nome_N ;
   private byte sdtIsNull ;
   protected short gxTv_SdtServLotado_Serv_lot_idade ;
   protected short gxTv_SdtServLotado_Initialized ;
   protected short gxTv_SdtServLotado_Serv_lot_idade_Z ;
   protected int gxTv_SdtServLotado_Serv_lot_id ;
   protected int gxTv_SdtServLotado_Unid_id ;
   protected int gxTv_SdtServLotado_Serv_lot_id_Z ;
   protected int gxTv_SdtServLotado_Unid_id_Z ;
   protected String gxTv_SdtServLotado_Mode ;
   protected String gxTv_SdtServLotado_Serv_lot_unid ;
   protected String gxTv_SdtServLotado_Serv_lot_foto ;
   protected String gxTv_SdtServLotado_Unid_nome ;
   protected String gxTv_SdtServLotado_Serv_lot_unid_Z ;
   protected String gxTv_SdtServLotado_Serv_lot_foto_Z ;
   protected String gxTv_SdtServLotado_Unid_nome_Z ;
}

