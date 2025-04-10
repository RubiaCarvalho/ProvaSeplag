package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;

@javax.xml.bind.annotation.XmlType(name = "Sdt_serv_temp.Sdt_serv_tempItem", namespace ="Treinamento2", propOrder={"st_pes_id", "st_data_admissao", "st_data_demissao"})
@JsonPropertyOrder(alphabetic=true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.NONE, getterVisibility=JsonAutoDetect.Visibility.NONE, isGetterVisibility=JsonAutoDetect.Visibility.NONE)
public final  class SdtSdt_serv_temp_Sdt_serv_tempItem_RESTInterface extends GxGenericCollectionItem<com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem>
{
   public SdtSdt_serv_temp_Sdt_serv_tempItem_RESTInterface( )
   {
      super(new com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem ());
   }

   public SdtSdt_serv_temp_Sdt_serv_tempItem_RESTInterface( com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem psdt )
   {
      super(psdt);
   }

   @JsonProperty("st_pes_id")
   public String getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id( )
   {
      return GXutil.ltrim( GXutil.str( sdt.getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id(), 8, 0)) ;
   }

   @JsonProperty("st_pes_id")
   public void setgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id(  String Value )
   {
      sdt.setgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_pes_id( (int)(GXutil.lval( Value)) );
   }


   @JsonProperty("st_data_admissao")
   public String getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao()) ;
   }

   @JsonProperty("st_data_admissao")
   public void setgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao(  String Value )
   {
      sdt.setgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_admissao( GXutil.charToDateREST( Value) );
   }


   @JsonProperty("st_data_demissao")
   public String getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao( )
   {
      return GXutil.dateToCharREST( sdt.getgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao()) ;
   }

   @JsonProperty("st_data_demissao")
   public void setgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao(  String Value )
   {
      sdt.setgxTv_SdtSdt_serv_temp_Sdt_serv_tempItem_St_data_demissao( GXutil.charToDateREST( Value) );
   }


   int remoteHandle = -1;
}

