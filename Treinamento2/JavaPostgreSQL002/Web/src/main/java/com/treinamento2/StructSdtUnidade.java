package com.treinamento2 ;
import com.genexus.*;

public final  class StructSdtUnidade implements Cloneable, java.io.Serializable
{
   public StructSdtUnidade( )
   {
      this( -1, new ModelContext( StructSdtUnidade.class ));
   }

   public StructSdtUnidade( int remoteHandle ,
                            ModelContext context )
   {
      gxTv_SdtUnidade_Unid_nome = "" ;
      gxTv_SdtUnidade_Unid_sigla = "" ;
      gxTv_SdtUnidade_Mode = "" ;
      gxTv_SdtUnidade_Unid_nome_Z = "" ;
      gxTv_SdtUnidade_Unid_sigla_Z = "" ;
      gxTv_SdtUnidade_Unid_nome_N = (byte)(1) ;
      gxTv_SdtUnidade_Unid_sigla_N = (byte)(1) ;
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
      return gxTv_SdtUnidade_Unid_id ;
   }

   public void setUnid_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtUnidade_Unid_id = value ;
   }

   public String getUnid_nome( )
   {
      return gxTv_SdtUnidade_Unid_nome ;
   }

   public void setUnid_nome( String value )
   {
      gxTv_SdtUnidade_Unid_nome_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtUnidade_Unid_nome = value ;
   }

   public String getUnid_sigla( )
   {
      return gxTv_SdtUnidade_Unid_sigla ;
   }

   public void setUnid_sigla( String value )
   {
      gxTv_SdtUnidade_Unid_sigla_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_SdtUnidade_Unid_sigla = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtUnidade_Mode ;
   }

   public void setMode( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtUnidade_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtUnidade_Initialized ;
   }

   public void setInitialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtUnidade_Initialized = value ;
   }

   public int getUnid_id_Z( )
   {
      return gxTv_SdtUnidade_Unid_id_Z ;
   }

   public void setUnid_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtUnidade_Unid_id_Z = value ;
   }

   public String getUnid_nome_Z( )
   {
      return gxTv_SdtUnidade_Unid_nome_Z ;
   }

   public void setUnid_nome_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtUnidade_Unid_nome_Z = value ;
   }

   public String getUnid_sigla_Z( )
   {
      return gxTv_SdtUnidade_Unid_sigla_Z ;
   }

   public void setUnid_sigla_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtUnidade_Unid_sigla_Z = value ;
   }

   public byte getUnid_nome_N( )
   {
      return gxTv_SdtUnidade_Unid_nome_N ;
   }

   public void setUnid_nome_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtUnidade_Unid_nome_N = value ;
   }

   public byte getUnid_sigla_N( )
   {
      return gxTv_SdtUnidade_Unid_sigla_N ;
   }

   public void setUnid_sigla_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtUnidade_Unid_sigla_N = value ;
   }

   protected byte gxTv_SdtUnidade_Unid_nome_N ;
   protected byte gxTv_SdtUnidade_Unid_sigla_N ;
   private byte sdtIsNull ;
   protected short gxTv_SdtUnidade_Initialized ;
   protected int gxTv_SdtUnidade_Unid_id ;
   protected int gxTv_SdtUnidade_Unid_id_Z ;
   protected String gxTv_SdtUnidade_Mode ;
   protected String gxTv_SdtUnidade_Unid_nome ;
   protected String gxTv_SdtUnidade_Unid_sigla ;
   protected String gxTv_SdtUnidade_Unid_nome_Z ;
   protected String gxTv_SdtUnidade_Unid_sigla_Z ;
}

