package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "Sdt_serv_efet.Sdt_serv_efetItem", namespace ="Treinamento2", propOrder={"se_pes_id", "se_matricula"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSdt_serv_efet_Sdt_serv_efetItem_RESTInterface extends GxGenericCollectionItem<com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem>
{
   public SdtSdt_serv_efet_Sdt_serv_efetItem_RESTInterface( )
   {
      super(new com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem ());
   }

   public SdtSdt_serv_efet_Sdt_serv_efetItem_RESTInterface( com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("se_pes_id")
   public String getgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id(), 8, 0)) ;
   }

   @JsonProperty("se_pes_id")
   public void setgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id(  String Value )
   {
      sdt.setgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_pes_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("se_matricula")
   public String getgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula( )
   {
      return GXutil.rtrim(((com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem)getSdt()).getgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula()) ;
   }

   @JsonProperty("se_matricula")
   public void setgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula(  String Value )
   {
      ((com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem)getSdt()).setgxTv_SdtSdt_serv_efet_Sdt_serv_efetItem_Se_matricula(Value);
   }


   int remoteHandle = -1;
}

