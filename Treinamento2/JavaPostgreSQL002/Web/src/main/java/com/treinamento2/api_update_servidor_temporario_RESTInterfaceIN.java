package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "api_update_servidor_temporario_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class api_update_servidor_temporario_RESTInterfaceIN
{
   com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem_RESTInterface AV12Sdt_Serv_Temp;
   @JsonProperty("Sdt_Serv_Temp")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem_RESTInterface getSdt_Serv_Temp( )
   {
      return AV12Sdt_Serv_Temp ;
   }

   @JsonProperty("Sdt_Serv_Temp")
   public void setSdt_Serv_Temp(  com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem_RESTInterface Value )
   {
      AV12Sdt_Serv_Temp= Value;
   }


}

