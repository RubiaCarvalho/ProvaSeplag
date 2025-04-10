package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "SDT_EndFuncional.SDT_EndFuncionalItem", namespace ="Treinamento2", propOrder={"end_funcional_id", "unidade_id", "endereco_id"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDT_EndFuncional_SDT_EndFuncionalItem_RESTInterface extends GxGenericCollectionItem<com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem>
{
   public SdtSDT_EndFuncional_SDT_EndFuncionalItem_RESTInterface( )
   {
      super(new com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem ());
   }

   public SdtSDT_EndFuncional_SDT_EndFuncionalItem_RESTInterface( com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("end_funcional_id")
   public Short getgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id( )
   {
      return ((com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem)getSdt()).getgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id() ;
   }

   @JsonProperty("end_funcional_id")
   public void setgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id(  Short Value )
   {
      ((com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem)getSdt()).setgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_End_funcional_id(Value);
   }


   @JsonProperty("unidade_id")
   public String getgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id(), 8, 0)) ;
   }

   @JsonProperty("unidade_id")
   public void setgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id(  String Value )
   {
      sdt.setgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Unidade_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("endereco_id")
   public String getgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id(), 8, 0)) ;
   }

   @JsonProperty("endereco_id")
   public void setgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id(  String Value )
   {
      sdt.setgxTv_SdtSDT_EndFuncional_SDT_EndFuncionalItem_Endereco_id( (int)(GXutil.lval( Value)) );
   }


   int remoteHandle = -1;
}

