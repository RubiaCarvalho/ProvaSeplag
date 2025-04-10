package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "Sdt_Lotacao.Sdt_LotacaoItem", namespace ="Treinamento2", propOrder={"lot_id", "pes_id", "unid_id", "lot_data_lotacao", "lot_data_remocao", "lot_portaria"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSdt_Lotacao_Sdt_LotacaoItem_RESTInterface extends GxGenericCollectionItem<com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem>
{
   public SdtSdt_Lotacao_Sdt_LotacaoItem_RESTInterface( )
   {
      super(new com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem ());
   }

   public SdtSdt_Lotacao_Sdt_LotacaoItem_RESTInterface( com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("lot_id")
   public String getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id(), 8, 0)) ;
   }

   @JsonProperty("lot_id")
   public void setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id(  String Value )
   {
      sdt.setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("pes_id")
   public String getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id(), 8, 0)) ;
   }

   @JsonProperty("pes_id")
   public void setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id(  String Value )
   {
      sdt.setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Pes_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("unid_id")
   public String getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id(), 8, 0)) ;
   }

   @JsonProperty("unid_id")
   public void setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id(  String Value )
   {
      sdt.setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Unid_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("lot_data_lotacao")
   public String getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao()) ;
   }

   @JsonProperty("lot_data_lotacao")
   public void setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao(  String Value )
   {
      sdt.setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_lotacao( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("lot_data_remocao")
   public String getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao()) ;
   }

   @JsonProperty("lot_data_remocao")
   public void setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao(  String Value )
   {
      sdt.setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_data_remocao( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("lot_portaria")
   public String getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria( )
   {
      return GXutil.rtrim(((com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem)getSdt()).getgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria()) ;
   }

   @JsonProperty("lot_portaria")
   public void setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria(  String Value )
   {
      ((com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem)getSdt()).setgxTv_SdtSdt_Lotacao_Sdt_LotacaoItem_Lot_portaria(Value);
   }


   int remoteHandle = -1;
}

