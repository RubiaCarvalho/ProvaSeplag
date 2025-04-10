package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "Sdt_unidade.Sdt_unidadeItem", namespace ="Treinamento2", propOrder={"unid_id", "unid_nome", "unid_sigla"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSdt_unidade_Sdt_unidadeItem_RESTInterface extends GxGenericCollectionItem<com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem>
{
   public SdtSdt_unidade_Sdt_unidadeItem_RESTInterface( )
   {
      super(new com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem ());
   }

   public SdtSdt_unidade_Sdt_unidadeItem_RESTInterface( com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("unid_id")
   public String getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id(), 8, 0)) ;
   }

   @JsonProperty("unid_id")
   public void setgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id(  String Value )
   {
      sdt.setgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("unid_nome")
   public String getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome( )
   {
      return GXutil.rtrim(((com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem)getSdt()).getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome()) ;
   }

   @JsonProperty("unid_nome")
   public void setgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome(  String Value )
   {
      ((com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem)getSdt()).setgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_nome(Value);
   }


   @JsonProperty("unid_sigla")
   public String getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla( )
   {
      return GXutil.rtrim(((com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem)getSdt()).getgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla()) ;
   }

   @JsonProperty("unid_sigla")
   public void setgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla(  String Value )
   {
      ((com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem)getSdt()).setgxTv_SdtSdt_unidade_Sdt_unidadeItem_Unid_sigla(Value);
   }


   int remoteHandle = -1;
}

