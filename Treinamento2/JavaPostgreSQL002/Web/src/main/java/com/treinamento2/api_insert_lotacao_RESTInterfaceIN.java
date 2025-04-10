package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "api_insert_lotacao_RESTInterfaceIN", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class api_insert_lotacao_RESTInterfaceIN
{
   com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem_RESTInterface AV10sdt_lotacao;
   @JsonProperty("sdt_lotacao")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem_RESTInterface getsdt_lotacao( )
   {
      return AV10sdt_lotacao ;
   }

   @JsonProperty("sdt_lotacao")
   public void setsdt_lotacao(  com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem_RESTInterface Value )
   {
      AV10sdt_lotacao= Value;
   }


}

