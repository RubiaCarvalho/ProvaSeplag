package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "api_update_servidor_efetivo_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class api_update_servidor_efetivo_RESTInterfaceIN
{
   com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem_RESTInterface AV13Sdt_Serv_Efet;
   @JsonProperty("Sdt_Serv_Efet")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem_RESTInterface getSdt_Serv_Efet( )
   {
      return AV13Sdt_Serv_Efet ;
   }

   @JsonProperty("Sdt_Serv_Efet")
   public void setSdt_Serv_Efet(  com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem_RESTInterface Value )
   {
      AV13Sdt_Serv_Efet= Value;
   }


}

