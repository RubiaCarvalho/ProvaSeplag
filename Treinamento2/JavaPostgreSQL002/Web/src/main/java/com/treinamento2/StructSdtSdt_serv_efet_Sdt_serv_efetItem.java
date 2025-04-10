package com.treinamento2 ;
import com.genexus.*;

public final  class StructSdtSdt_serv_efet_Sdt_serv_efetItem implements Cloneable, java.io.Serializable
{
   public StructSdtSdt_serv_efet_Sdt_serv_efetItem( )
   {
      this( -1, new ModelContext( StructSdtSdt_serv_efet_Sdt_serv_efetItem.class ));
   }

   public StructSdtSdt_serv_efet_Sdt_serv_efetItem( int remoteHandle ,
                                                    ModelContext context )
   {
      gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula = "" ;
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
      return gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id ;
   }

   public void setSe_pes_id( int value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id = value ;
   }

   public String getSe_matricula( )
   {
      return gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula ;
   }

   public void setSe_matricula( String value )
   {
      sdtIsNull = (byte)(0) ;
      gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula = value ;
   }

   protected byte sdtIsNull ;
   protected int gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id ;
   protected String gxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula ;
}

