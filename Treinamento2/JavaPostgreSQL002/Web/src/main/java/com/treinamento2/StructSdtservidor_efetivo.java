package com.treinamento2 ;
import com.genexus.*;

public final  class StructSdtservidor_efetivo implements Cloneable, java.io.Serializable
{
   public StructSdtservidor_efetivo( )
   {
      this( -1, new ModelContext( StructSdtservidor_efetivo.class ));
   }

   public StructSdtservidor_efetivo( int remoteHandle ,
                                     ModelContext context )
   {
      gxTv_Sdtservidor_efetivo_Se_matricula = "" ;
      gxTv_Sdtservidor_efetivo_Mode = "" ;
      gxTv_Sdtservidor_efetivo_Se_matricula_Z = "" ;
      gxTv_Sdtservidor_efetivo_Se_matricula_N = (byte)(1) ;
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

   public int getSe_pes_id( )
   {
      return gxTv_Sdtservidor_efetivo_Se_pes_id ;
   }

   public void setSe_pes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_efetivo_Se_pes_id = value ;
   }

   public String getSe_matricula( )
   {
      return gxTv_Sdtservidor_efetivo_Se_matricula ;
   }

   public void setSe_matricula( String value )
   {
      gxTv_Sdtservidor_efetivo_Se_matricula_N = (byte)(0) ;
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_efetivo_Se_matricula = value ;
   }

   public String getMode( )
   {
      return gxTv_Sdtservidor_efetivo_Mode ;
   }

   public void setMode( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_efetivo_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_Sdtservidor_efetivo_Initialized ;
   }

   public void setInitialized( short value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_efetivo_Initialized = value ;
   }

   public int getSe_pes_id_Z( )
   {
      return gxTv_Sdtservidor_efetivo_Se_pes_id_Z ;
   }

   public void setSe_pes_id_Z( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_efetivo_Se_pes_id_Z = value ;
   }

   public String getSe_matricula_Z( )
   {
      return gxTv_Sdtservidor_efetivo_Se_matricula_Z ;
   }

   public void setSe_matricula_Z( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_efetivo_Se_matricula_Z = value ;
   }

   public byte getSe_matricula_N( )
   {
      return gxTv_Sdtservidor_efetivo_Se_matricula_N ;
   }

   public void setSe_matricula_N( byte value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_Sdtservidor_efetivo_Se_matricula_N = value ;
   }

   protected byte gxTv_Sdtservidor_efetivo_Se_matricula_N ;
   private byte sdtIsNull ;
   protected short gxTv_Sdtservidor_efetivo_Initialized ;
   protected int gxTv_Sdtservidor_efetivo_Se_pes_id ;
   protected int gxTv_Sdtservidor_efetivo_Se_pes_id_Z ;
   protected String gxTv_Sdtservidor_efetivo_Mode ;
   protected String gxTv_Sdtservidor_efetivo_Se_matricula ;
   protected String gxTv_Sdtservidor_efetivo_Se_matricula_Z ;
}

