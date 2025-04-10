package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "api_get_enderecofuncional_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class api_get_enderecofuncional_RESTInterfaceIN
{
   String AV53unidade_id;
   @JsonProperty("unidade_id")
   public String getunidade_id( )
   {
      return AV53unidade_id ;
   }

   @JsonProperty("unidade_id")
   public void setunidade_id(  String Value )
   {
      AV53unidade_id= Value;
   }


}

