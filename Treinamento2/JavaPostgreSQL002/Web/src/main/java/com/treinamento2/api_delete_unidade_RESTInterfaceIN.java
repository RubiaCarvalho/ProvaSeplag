package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "api_delete_unidade_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class api_delete_unidade_RESTInterfaceIN
{
   String AV14unid_id;
   @JsonProperty("unid_id")
   public String getunid_id( )
   {
      return AV14unid_id ;
   }

   @JsonProperty("unid_id")
   public void setunid_id(  String Value )
   {
      AV14unid_id= Value;
   }


}

