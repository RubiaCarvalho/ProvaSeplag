package com.treinamento2 ;
import com.treinamento2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import com.genexus.internet.*;
import java.sql.*;

public final  class api extends GXProcedure
{
   public api( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( api.class ), "" );
   }

   public api( int remoteHandle ,
               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      cleanup();
   }

   public void gxep_insert_lotacao( com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem in_AV10sdt_lotacao ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV10sdt_lotacao = in_AV10sdt_lotacao;
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      /* Insert_Lotacao Constructor */
      GXv_objcol_SdtMessages_Message1[0] = AV5Messages ;
      new com.treinamento2.pinsert_lotacao(remoteHandle, context).execute( AV10sdt_lotacao, GXv_objcol_SdtMessages_Message1) ;
      AV5Messages = GXv_objcol_SdtMessages_Message1[0] ;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_update_lotacao( com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem in_AV10sdt_lotacao ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV10sdt_lotacao = in_AV10sdt_lotacao;
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      /* Update_Lotacao Constructor */
      GXv_objcol_SdtMessages_Message1[0] = AV5Messages ;
      new com.treinamento2.pupdate_lotacao(remoteHandle, context).execute( AV10sdt_lotacao, GXv_objcol_SdtMessages_Message1) ;
      AV5Messages = GXv_objcol_SdtMessages_Message1[0] ;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_delete_lotacao( com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem in_AV10sdt_lotacao ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV10sdt_lotacao = in_AV10sdt_lotacao;
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      /* Delete_Lotacao Constructor */
      GXv_objcol_SdtMessages_Message1[0] = AV5Messages ;
      new com.treinamento2.pdelete_lotacao(remoteHandle, context).execute( AV29lot_id, GXv_objcol_SdtMessages_Message1) ;
      AV5Messages = GXv_objcol_SdtMessages_Message1[0] ;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_get_lotacao( com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem in_AV10sdt_lotacao )
   {
      this.AV10sdt_lotacao = in_AV10sdt_lotacao;
      initialize();
      initialized = (short)(1) ;
      /* Get_Lotacao Constructor */
      GXv_objcol_SdtSdt_Lotacao_Sdt_LotacaoItem2[0] = new GXBaseCollection<com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem>() ;
      new com.treinamento2.dp_get_lotacao(remoteHandle, context).execute( AV29lot_id, AV26pes_id, AV14unid_id, AV27lot_data_lotacao, AV25lot_data_remocao, AV28lot_portaria, AV50PageNumber, AV51PageSize, GXv_objcol_SdtSdt_Lotacao_Sdt_LotacaoItem2) ;
   }

   public void gxep_insert_servidor_efetivo( com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem in_AV13Sdt_Serv_Efet ,
                                             GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV13Sdt_Serv_Efet = in_AV13Sdt_Serv_Efet;
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      /* Insert_Servidor_Efetivo Constructor */
      GXv_objcol_SdtMessages_Message1[0] = AV5Messages ;
      new com.treinamento2.pinsert_serv_efet(remoteHandle, context).execute( AV13Sdt_Serv_Efet, GXv_objcol_SdtMessages_Message1) ;
      AV5Messages = GXv_objcol_SdtMessages_Message1[0] ;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_update_servidor_efetivo( com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem in_AV13Sdt_Serv_Efet ,
                                             GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV13Sdt_Serv_Efet = in_AV13Sdt_Serv_Efet;
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      /* Update_Servidor_Efetivo Constructor */
      GXv_objcol_SdtMessages_Message1[0] = AV5Messages ;
      new com.treinamento2.pupdate_serv_efet(remoteHandle, context).execute( AV13Sdt_Serv_Efet, GXv_objcol_SdtMessages_Message1) ;
      AV5Messages = GXv_objcol_SdtMessages_Message1[0] ;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_delete_servidor_efetivo( com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem in_AV13Sdt_Serv_Efet )
   {
      this.AV13Sdt_Serv_Efet = in_AV13Sdt_Serv_Efet;
      initialize();
      initialized = (short)(1) ;
      /* Delete_Servidor_Efetivo Constructor */
      GXv_objcol_SdtMessages_Message1[0] = AV5Messages ;
      new com.treinamento2.pdelete_serv_efet(remoteHandle, context).execute( AV30se_pes_id, GXv_objcol_SdtMessages_Message1) ;
      AV5Messages = GXv_objcol_SdtMessages_Message1[0] ;
   }

   public void gxep_get_servidor_efetivo( com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem in_AV13Sdt_Serv_Efet )
   {
      this.AV13Sdt_Serv_Efet = in_AV13Sdt_Serv_Efet;
      initialize();
      initialized = (short)(1) ;
      /* Get_Servidor_Efetivo Constructor */
      GXv_objcol_SdtSdt_serv_efet_Sdt_serv_efetItem3[0] = new GXBaseCollection<com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem>() ;
      new com.treinamento2.dp_get_serv_efet(remoteHandle, context).execute( AV30se_pes_id, AV34se_matricula, AV50PageNumber, AV51PageSize, GXv_objcol_SdtSdt_serv_efet_Sdt_serv_efetItem3) ;
   }

   public void gxep_insert_servidor_temporario( com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem in_AV12Sdt_Serv_Temp ,
                                                GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV12Sdt_Serv_Temp = in_AV12Sdt_Serv_Temp;
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      /* Insert_Servidor_Temporario Constructor */
      GXv_objcol_SdtMessages_Message1[0] = AV5Messages ;
      new com.treinamento2.pinsert_serv_temp(remoteHandle, context).execute( AV12Sdt_Serv_Temp, GXv_objcol_SdtMessages_Message1) ;
      AV5Messages = GXv_objcol_SdtMessages_Message1[0] ;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_update_servidor_temporario( com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem in_AV12Sdt_Serv_Temp ,
                                                GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV12Sdt_Serv_Temp = in_AV12Sdt_Serv_Temp;
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      /* Update_Servidor_Temporario Constructor */
      GXv_objcol_SdtMessages_Message1[0] = AV5Messages ;
      new com.treinamento2.pupdate_serv_temp(remoteHandle, context).execute( AV12Sdt_Serv_Temp, GXv_objcol_SdtMessages_Message1) ;
      AV5Messages = GXv_objcol_SdtMessages_Message1[0] ;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_delete_servidor_temporario( com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem in_AV12Sdt_Serv_Temp ,
                                                GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV12Sdt_Serv_Temp = in_AV12Sdt_Serv_Temp;
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      /* Delete_Servidor_Temporario Constructor */
      GXv_objcol_SdtMessages_Message1[0] = AV5Messages ;
      new com.treinamento2.pdelete_serv_temp(remoteHandle, context).execute( AV31st_pes_id, GXv_objcol_SdtMessages_Message1) ;
      AV5Messages = GXv_objcol_SdtMessages_Message1[0] ;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_get_serv_temp( com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem in_AV12Sdt_Serv_Temp )
   {
      this.AV12Sdt_Serv_Temp = in_AV12Sdt_Serv_Temp;
      initialize();
      initialized = (short)(1) ;
      /* Get_Serv_Temp Constructor */
      GXv_objcol_SdtSdt_serv_temp_Sdt_serv_tempItem4[0] = new GXBaseCollection<com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem>() ;
      new com.treinamento2.dp_get_serv_temp(remoteHandle, context).execute( AV31st_pes_id, AV45st_data_admissao, AV44st_data_demissao, AV50PageNumber, AV51PageSize, GXv_objcol_SdtSdt_serv_temp_Sdt_serv_tempItem4) ;
   }

   public void gxep_insert_unidade( com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem in_AV11Sdt_Unidade ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV11Sdt_Unidade = in_AV11Sdt_Unidade;
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      /* Insert_Unidade Constructor */
      GXv_objcol_SdtMessages_Message1[0] = AV5Messages ;
      new com.treinamento2.pinsert_unidade(remoteHandle, context).execute( AV11Sdt_Unidade, GXv_objcol_SdtMessages_Message1) ;
      AV5Messages = GXv_objcol_SdtMessages_Message1[0] ;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_update_unidade( com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem in_AV11Sdt_Unidade ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV11Sdt_Unidade = in_AV11Sdt_Unidade;
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      /* Update_Unidade Constructor */
      GXv_objcol_SdtMessages_Message1[0] = AV5Messages ;
      new com.treinamento2.pupdate_unidade(remoteHandle, context).execute( AV11Sdt_Unidade, GXv_objcol_SdtMessages_Message1) ;
      AV5Messages = GXv_objcol_SdtMessages_Message1[0] ;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_delete_unidade( int in_AV14unid_id ,
                                    GXBaseCollection<com.genexus.SdtMessages_Message> [] arr_AV5Messages )
   {
      this.AV14unid_id = in_AV14unid_id;
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      initialize();
      initialized = (short)(1) ;
      arr_AV5Messages[0] = this.AV5Messages;
      /* Delete_Unidade Constructor */
      GXv_objcol_SdtMessages_Message1[0] = AV5Messages ;
      new com.treinamento2.pdelete_unidade(remoteHandle, context).execute( AV14unid_id, GXv_objcol_SdtMessages_Message1) ;
      AV5Messages = GXv_objcol_SdtMessages_Message1[0] ;
      arr_AV5Messages[0] = this.AV5Messages;
   }

   public void gxep_get_unidade( com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem in_AV11Sdt_Unidade )
   {
      this.AV11Sdt_Unidade = in_AV11Sdt_Unidade;
      initialize();
      initialized = (short)(1) ;
      /* Get_Unidade Constructor */
      GXv_objcol_SdtSdt_unidade_Sdt_unidadeItem5[0] = new GXBaseCollection<com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem>() ;
      new com.treinamento2.dp_get_unidade(remoteHandle, context).execute( AV14unid_id, AV40unid_nome, AV41unid_sigla, AV50PageNumber, AV51PageSize, GXv_objcol_SdtSdt_unidade_Sdt_unidadeItem5) ;
   }

   public void gxep_get_servlotado( int in_AV14unid_id ,
                                    com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem [] arr_AV46SDT_ServLotado )
   {
      this.AV14unid_id = in_AV14unid_id;
      AV46SDT_ServLotado = new com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem(remoteHandle, context);
      initialize();
      initialized = (short)(1) ;
      arr_AV46SDT_ServLotado[0] = this.AV46SDT_ServLotado;
      /* Get_ServLotado Constructor */
      GXv_objcol_SdtSDT_ServLotado_SDT_ServLotadoItem6[0] = new GXBaseCollection<com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem>() ;
      new com.treinamento2.dp_servidoreslotados(remoteHandle, context).execute( AV47serv_lot_id, AV48serv_lot_idade, AV49serv_lot_unid, AV14unid_id, AV40unid_nome, AV50PageNumber, AV51PageSize, GXv_objcol_SdtSDT_ServLotado_SDT_ServLotadoItem6) ;
      arr_AV46SDT_ServLotado[0] = this.AV46SDT_ServLotado;
   }

   protected void cleanup( )
   {
      if ( initialized != 1 )
      {
      }
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV5Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV27lot_data_lotacao = GXutil.nullDate() ;
      AV25lot_data_remocao = GXutil.nullDate() ;
      AV28lot_portaria = "" ;
      AV34se_matricula = "" ;
      AV45st_data_admissao = GXutil.nullDate() ;
      AV44st_data_demissao = GXutil.nullDate() ;
      AV40unid_nome = "" ;
      AV41unid_sigla = "" ;
      AV46SDT_ServLotado = new com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem(remoteHandle, context);
      AV49serv_lot_unid = "" ;
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtSdt_Lotacao_Sdt_LotacaoItem2 = new GXBaseCollection[1] ;
      GXv_objcol_SdtSdt_serv_efet_Sdt_serv_efetItem3 = new GXBaseCollection[1] ;
      GXv_objcol_SdtSdt_serv_temp_Sdt_serv_tempItem4 = new GXBaseCollection[1] ;
      GXv_objcol_SdtMessages_Message1 = new GXBaseCollection[1] ;
      GXv_objcol_SdtSdt_unidade_Sdt_unidadeItem5 = new GXBaseCollection[1] ;
      GXv_objcol_SdtSDT_ServLotado_SDT_ServLotadoItem6 = new GXBaseCollection[1] ;
   }

   protected short initialized ;
   protected short AV50PageNumber ;
   protected short AV51PageSize ;
   protected short AV48serv_lot_idade ;
   protected int AV29lot_id ;
   protected int AV26pes_id ;
   protected int AV30se_pes_id ;
   protected int AV31st_pes_id ;
   protected int AV14unid_id ;
   protected int AV47serv_lot_id ;
   protected java.util.Date AV27lot_data_lotacao ;
   protected java.util.Date AV25lot_data_remocao ;
   protected java.util.Date AV45st_data_admissao ;
   protected java.util.Date AV44st_data_demissao ;
   protected String AV28lot_portaria ;
   protected String AV34se_matricula ;
   protected String AV40unid_nome ;
   protected String AV41unid_sigla ;
   protected String AV49serv_lot_unid ;
   protected com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem AV10sdt_lotacao ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> AV5Messages ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message>[] arr_AV5Messages ;
   protected GXBaseCollection<com.treinamento2.SdtSdt_Lotacao_Sdt_LotacaoItem> GXv_objcol_SdtSdt_Lotacao_Sdt_LotacaoItem2[] ;
   protected com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem AV13Sdt_Serv_Efet ;
   protected GXBaseCollection<com.treinamento2.SdtSdt_serv_efet_Sdt_serv_efetItem> GXv_objcol_SdtSdt_serv_efet_Sdt_serv_efetItem3[] ;
   protected com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem AV12Sdt_Serv_Temp ;
   protected GXBaseCollection<com.treinamento2.SdtSdt_serv_temp_Sdt_serv_tempItem> GXv_objcol_SdtSdt_serv_temp_Sdt_serv_tempItem4[] ;
   protected com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem AV11Sdt_Unidade ;
   protected GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message1[] ;
   protected GXBaseCollection<com.treinamento2.SdtSdt_unidade_Sdt_unidadeItem> GXv_objcol_SdtSdt_unidade_Sdt_unidadeItem5[] ;
   protected com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem AV46SDT_ServLotado ;
   protected com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem[] arr_AV46SDT_ServLotado ;
   protected GXBaseCollection<com.treinamento2.SdtSDT_ServLotado_SDT_ServLotadoItem> GXv_objcol_SdtSDT_ServLotado_SDT_ServLotadoItem6[] ;
}

