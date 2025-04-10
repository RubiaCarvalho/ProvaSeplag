package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "api_get_servlotado_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class api_get_servlotado_RESTInterfaceOUT
{
   com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem_RESTInterface AV46SDT_ServLotado;
   @JsonProperty("SDT_ServLotado")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem_RESTInterface getSDT_ServLotado( )
   {
      return AV46SDT_ServLotado ;
   }

   @JsonProperty("SDT_ServLotado")
   public void setSDT_ServLotado(  com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem_RESTInterface Value )
   {
      AV46SDT_ServLotado= Value;
   }


}

