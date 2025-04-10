package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.NONE)
@javax.xml.bind.annotation.XmlType(name = "api_get_enderecofuncional_RESTInterfaceOUT", namespace ="http://tempuri.org/")
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class api_get_enderecofuncional_RESTInterfaceOUT
{
   Vector<com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem_RESTInterface> AV55SDT_EndFuncional ;
   @JsonProperty("SDT_EndFuncional")
   @JsonInclude(JsonInclude.Include.NON_EMPTY)
   public Vector<com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem_RESTInterface> getSDT_EndFuncional( )
   {
      return AV55SDT_EndFuncional ;
   }

   @JsonProperty("SDT_EndFuncional")
   public void setSDT_EndFuncional(  Vector<com.treinamento2.SdtSDT_EndFuncional_SDT_EndFuncionalItem_RESTInterface> Value )
   {
      AV55SDT_EndFuncional= Value;
   }


}

