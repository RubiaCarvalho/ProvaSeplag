package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "SDT_ServLotado.SDT_ServLotadoItem", namespace ="Treinamento2", propOrder={"serv_lot_id", "serv_lot_idade", "serv_lot_unid", "serv_lot_foto", "unid_id", "unid_nome"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSDT_ServLotado_SDT_ServLotadoItem_RESTInterface extends GxGenericCollectionItem<com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem>
{
   public SdtSDT_ServLotado_SDT_ServLotadoItem_RESTInterface( )
   {
      super(new com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem ());
   }

   public SdtSDT_ServLotado_SDT_ServLotadoItem_RESTInterface( com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("serv_lot_id")
   public String getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id(), 8, 0)) ;
   }

   @JsonProperty("serv_lot_id")
   public void setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id(  String Value )
   {
      sdt.setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("serv_lot_idade")
   public Short getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade( )
   {
      return ((com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem)getSdt()).getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade() ;
   }

   @JsonProperty("serv_lot_idade")
   public void setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade(  Short Value )
   {
      ((com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem)getSdt()).setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_idade(Value);
   }


   @JsonProperty("serv_lot_unid")
   public String getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid( )
   {
      return GXutil.rtrim(((com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem)getSdt()).getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid()) ;
   }

   @JsonProperty("serv_lot_unid")
   public void setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid(  String Value )
   {
      ((com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem)getSdt()).setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_unid(Value);
   }


   @JsonProperty("serv_lot_foto")
   public String getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto( )
   {
      return GXutil.rtrim(((com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem)getSdt()).getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto()) ;
   }

   @JsonProperty("serv_lot_foto")
   public void setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto(  String Value )
   {
      ((com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem)getSdt()).setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Serv_lot_foto(Value);
   }


   @JsonProperty("unid_id")
   public String getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id(), 8, 0)) ;
   }

   @JsonProperty("unid_id")
   public void setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id(  String Value )
   {
      sdt.setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("unid_nome")
   public String getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome( )
   {
      return GXutil.rtrim(((com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem)getSdt()).getgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome()) ;
   }

   @JsonProperty("unid_nome")
   public void setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome(  String Value )
   {
      ((com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem)getSdt()).setgxTv_SdtSDT_ServLotado_SDT_ServLotadoItem_Unid_nome(Value);
   }


   int remoteHandle = -1;
}

