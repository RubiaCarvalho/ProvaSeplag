package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "api_insert_unidade_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class api_insert_unidade_RESTInterfaceIN
{
   com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem_RESTInterface AV11Sdt_Unidade;
   @JsonProperty("Sdt_Unidade")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem_RESTInterface getSdt_Unidade( )
   {
      return AV11Sdt_Unidade ;
   }

   @JsonProperty("Sdt_Unidade")
   public void setSdt_Unidade(  com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem_RESTInterface Value )
   {
      AV11Sdt_Unidade= Value;
   }


}

