package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "api_insert_lotacao_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class api_insert_lotacao_RESTInterfaceOUT
{
   Vector<com.genexus.SdtMessages_Message_RESTInterface> AV5Messages ;
   @JsonProperty("Messages")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.genexus.SdtMessages_Message_RESTInterface> getMessages( )
   {
      return AV5Messages ;
   }

   @JsonProperty("Messages")
   public void setMessages(  Vector<com.genexus.SdtMessages_Message_RESTInterface> Value )
   {
      AV5Messages= Value;
   }


}

