spec_i([ svcgrp,1,'API','API',0,por,'18_0_11-185416' ]).
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
rule_i(0,datastore(1,'DS_LAST_CHANGE','')).
rule_i(0,datastore(1,'LOCK_RETRY','10')).
rule_i(0,datastore(1,'WAIT_RECORD','0')).
rule_i(0,datastore(1,'POSTGRESQL_EXTENSIONS','')).
rule_i(0,datastore(1,'POSTGRESQL_VERSION','8_3')).
rule_i(0,datastore(1,'COMMENT_ON','No')).
rule_i(0,datastore(1,'DCL_REF_INT_DB','Yes')).
rule_i(0,datastore(1,'PRIMARY_KEY_TYPE','PK')).
rule_i(0,datastore(1,'CS_SCHEMA','')).
rule_i(0,datastore(1,'RecycleRWMin','30')).
rule_i(0,datastore(1,'RecycleRWType','1')).
rule_i(0,datastore(1,'RecycleRW','-1')).
rule_i(0,datastore(1,'POOL_STARTUP','No')).
rule_i(0,datastore(1,'POOLSIZE_RW','10')).
rule_i(0,datastore(1,'UnlimitedRWPool','-1')).
rule_i(0,datastore(1,'PoolRWEnabled','-1')).
rule_i(0,datastore(1,'CS_RPCPGML','')).
rule_i(0,datastore(1,'DS_READ_REPLICA','No')).
rule_i(0,datastore(1,'JDBC_DATASOURCE','java:/jdbc/treinamento')).
rule_i(0,datastore(1,'USE_JDBC_DATASOURCE','-1')).
rule_i(0,datastore(1,'DS_DBMS_ADDINFO','')).
rule_i(0,datastore(1,'USER_PASSWORD',admin)).
rule_i(0,datastore(1,'USER_ID',postgres)).
rule_i(0,datastore(1,'CS_CNTDLG','2')).
rule_i(0,datastore(1,'CS_CONNECT','First')).
rule_i(0,datastore(1,'DBMS_PORT','5432')).
rule_i(0,datastore(1,'CS_SERVER',localhost)).
rule_i(0,datastore(1,'CS_DBNAME',treinamento)).
rule_i(0,datastore(1,'CS_FLEDSNAME','')).
rule_i(0,datastore(1,'CS_DRVNAME','')).
rule_i(0,datastore(1,'CS_DSNAME','')).
rule_i(0,datastore(1,'DB_URL','')).
rule_i(0,datastore(1,'JDBC_CUSTOM_URL','0')).
rule_i(0,datastore(1,'JDBC_CUSTOM_DRIVER','')).
rule_i(0,datastore(1,'JDBC_DRIVER','org.postgresql.Driver')).
rule_i(0,datastore(1,'CONNECT_METHOD','OPSYS')).
rule_i(0,datastore(1,'ACCESS_TECHNO','JDBC')).
rule_i(0,datastore(1,'MAIN_DS','-1')).
rule_i(0,datastore(1,'REORG_GEN','8')).
rule_i(0,datastore(1,'HelpKeyword','15')).
rule_i(0,datastore(1,'DBMS',15)).
rule_i(0,datastore(1,'NAME','Default')).
rule_i(0,prop(idNULLS_BEHAVIOR,idNB_Current)).
rule_i(0,prop('ObjectVisibility','KnowledgeBase')).
rule_i(0,prop('FullyQualifiedName','API')).
rule_i(0,prop('Folder',o(120,'Root Module'))).
rule_i(0,prop('GenerateObject','-1')).
rule_i(0,prop('SERVICES_BASE_PATH','API')).
rule_i(0,prop('GENERATE_GRPC_API','0')).
rule_i(0,prop('GENERATE_REST_API','-1')).
rule_i(0,prop('IsMain','-1')).
rule_i(0,prop('ObjDesc','API')).
rule_i(0,prop('ObjName','API')).
rule_i(0,rule([ a(22,[ 'Rfr','"Atualizar"','5' ]) ],[],[],[])).
rule_i(0,maingen(12)).
rule_i(0,prop('PGMTYPE',main)).
 
 
 
 
 
 
 
 
attri_i('Sdt_endfuncional',[ 'SDT_EndFuncional',o(objectcollection('SDT_EndFuncional.SDT_EndFuncionalItem')),0,0,'',0,'SDT_End Funcional','',55 ]).
attri_i('Endereco_id',[ endereco_id,int,8,0,'ZZZZZZZ9',0,endereco_id,'',54 ]).
attri_i('Unidade_id',[ unidade_id,int,8,0,'ZZZZZZZ9',0,unidade_id,'',53 ]).
attri_i('End_funcional_id',[ end_funcional_id,int,4,0,'ZZZ9',0,end_funcional_id,'',52 ]).
attri_i('Pagesize',[ 'PageSize',int,4,0,'ZZZ9',0,'Page Size','',51 ]).
attri_i('Pagenumber',[ 'PageNumber',int,4,0,'ZZZ9',0,'Page Number','',50 ]).
attri_i('Serv_lot_unid',[ serv_lot_unid,svchar,40,0,'',0,serv_lot_unid,'',49 ]).
attri_i('Serv_lot_idade',[ serv_lot_idade,int,4,0,'ZZZ9',0,serv_lot_idade,'',48 ]).
attri_i('Serv_lot_id',[ serv_lot_id,int,8,0,'ZZZZZZZ9',0,serv_lot_id,'',47 ]).
attri_i('Unid_sigla',[ unid_sigla,svchar,20,0,'',0,'Unidade sigla','',41 ]).
attri_i('Unid_nome',[ unid_nome,svchar,200,0,'',0,'Unidade Nome','',40 ]).
attri_i('Unid_id',[ unid_id,int,8,0,'ZZZZZZZ9',0,unid_id,'',14 ]).
attri_i('St_pes_id',[ st_pes_id,int,8,0,'ZZZZZZZ9',0,st_pes_id,'',31 ]).
attri_i('St_data_demissao',[ st_data_demissao,date,8,0,'99/99/99',0,'Data de Demissao','',44 ]).
attri_i('St_data_admissao',[ st_data_admissao,date,8,0,'99/99/99',0,'Data de Admissao ','',45 ]).
attri_i('Se_pes_id',[ se_pes_id,int,8,0,'ZZZZZZZ9',0,se_pes_id,'',30 ]).
attri_i('Se_matricula',[ se_matricula,svchar,20,0,'',0,se_matricula,'',34 ]).
attri_i('Sdt_unidade',[ 'Sdt_Unidade',o('Sdt_unidade.Sdt_unidadeItem'),0,0,'',0,'Sdt_Unidade','',11 ]).
attri_i('Sdt_servlotado',[ 'SDT_ServLotado',o('SDT_ServLotado.SDT_ServLotadoItem'),0,0,'',0,'SDT_Serv Lotado','',46 ]).
attri_i('Sdt_serv_temp',[ 'Sdt_Serv_Temp',o('Sdt_serv_temp.Sdt_serv_tempItem'),0,0,'',0,'Sdt_Serv_Temp','',12 ]).
attri_i('Sdt_serv_efet',[ 'Sdt_Serv_Efet',o('Sdt_serv_efet.Sdt_serv_efetItem'),0,0,'',0,'Sdt_Serv_Efet','',13 ]).
attri_i('Sdt_lotacao',[ sdt_lotacao,o('Sdt_Lotacao.Sdt_LotacaoItem'),0,0,'',0,sdt_lotacao,'',10 ]).
attri_i('Pes_id',[ pes_id,int,8,0,'ZZZZZZZ9',0,pes_id,'',26 ]).
attri_i('Messages',[ 'Messages',o(objectcollection('GeneXus\Common\Messages.Message')),0,0,'',0,'Messages','',5 ]).
attri_i('Lot_portaria',[ lot_portaria,svchar,100,0,'',0,lot_portaria,'',28 ]).
attri_i('Lot_id',[ lot_id,int,8,0,'ZZZZZZZ9',0,lot_id,'',29 ]).
attri_i('Lot_data_remocao',[ lot_data_remocao,date,8,0,'99/99/99',0,lot_data_remocao,'',25 ]).
attri_i('Lot_data_lotacao',[ lot_data_lotacao,date,8,0,'99/99/99',0,lot_data_lotacao,'',27 ]).
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
dom_info_i(78,[ 'GeneXus\HttpMethod' ]).
 
 
break_i(2,rpt,0,[],[ [],[],[] ]).
break_i(1,rpt,0,[],[ [],[],[] ]).
 
b_group_i(2,1,lit,0,1,0).
b_group_i(1,1,lit,0,1,0).
 
b_line_i(1,1,1,cmd,1,[ t('',207,1,0) ]).
b_line_i(4,1,1,cmd,1,[ t('',211,4,0),t('RestMethod(POST)',3,1,40) ]).
b_line_i(5,1,1,cmd,1,[ t('',209,5,0),t('Insert_Lotacao(',3,1,57),t('Sdt_lotacao',23,1,72),t(',',7,1,84),t('Messages',23,1,85),t(')',4,1,94) ]).
b_line_i(6,1,1,cmd,1,[ t('',104,6,0),t(o(1,'PInsert_Lotacao'),28,1,94),t('Sdt_lotacao',23,1,111),t(',',7,1,0),t('Messages',23,1,124) ]).
b_line_i(7,1,1,cmd,1,[ t('',210,6,133) ]).
b_line_i(8,1,1,cmd,1,[ t('',211,8,0),t('RestMethod(PUT)',3,1,154) ]).
b_line_i(9,1,1,cmd,1,[ t('',209,9,0),t('Update_Lotacao(',3,1,171),t('Sdt_lotacao',23,1,186),t(',',7,1,198),t('Messages',23,1,199),t(')',4,1,208) ]).
b_line_i(10,1,1,cmd,1,[ t('',104,10,0),t(o(1,'PUpdate_Lotacao'),28,1,208),t('Sdt_lotacao',23,1,225),t(',',7,1,0),t('Messages',23,1,238) ]).
b_line_i(11,1,1,cmd,1,[ t('',210,10,247) ]).
b_line_i(12,1,1,cmd,1,[ t('',211,12,0),t('RestMethod(DELETE)',3,1,271) ]).
b_line_i(13,1,1,cmd,1,[ t('',209,13,0),t('Delete_Lotacao(',3,1,288),t('Sdt_lotacao',23,1,303),t(',',7,1,315),t('Messages',23,1,316),t(')',4,1,325) ]).
b_line_i(14,1,1,cmd,1,[ t('',104,14,0),t(o(1,'PDelete_Lotacao'),28,1,325),t('Lot_id',23,1,342),t(',',7,1,0),t('Messages',23,1,350) ]).
b_line_i(15,1,1,cmd,1,[ t('',210,14,359) ]).
b_line_i(16,1,1,cmd,1,[ t('',211,16,0),t('RestMethod(GET)',3,1,380) ]).
b_line_i(17,1,1,cmd,1,[ t('',209,17,0),t('Get_Lotacao(',3,1,394),t('Sdt_lotacao',23,1,406),t(')',4,1,418) ]).
b_line_i(18,1,1,cmd,1,[ t('',104,18,0),t(o(33,'DP_Get_Lotacao'),28,1,414),t('Lot_id',23,1,430),t(',',7,1,0),t('Pes_id',23,1,438),t(',',7,1,0),t('Unid_id',23,1,446),t(',',7,1,0),t('Lot_data_lotacao',23,1,455),t(',',7,1,0),t('Lot_data_remocao',23,1,473),t(',',7,1,0),t('Lot_portaria',23,1,491),t(',',7,1,0),t('Pagenumber',23,1,505),t(',',7,1,0),t('Pagesize',23,1,517) ]).
b_line_i(19,1,1,cmd,1,[ t('',210,18,526) ]).
b_line_i(22,1,1,cmd,1,[ t('',211,22,0),t('RestMethod(POST)',3,1,575) ]).
b_line_i(23,1,1,cmd,1,[ t('',209,23,0),t('Insert_Servidor_Efetivo(',3,1,601),t('Sdt_serv_efet',23,1,625),t(',',7,1,639),t('Messages',23,1,640),t(')',4,1,649) ]).
b_line_i(24,1,1,cmd,1,[ t('',104,24,0),t(o(1,'PInsert_Serv_Efet'),28,1,640),t('Sdt_serv_efet',23,1,659),t(',',7,1,0),t('Messages',23,1,674) ]).
b_line_i(25,1,1,cmd,1,[ t('',210,24,683) ]).
b_line_i(26,1,1,cmd,1,[ t('',211,26,0),t('RestMethod(PUT)',3,1,704) ]).
b_line_i(27,1,1,cmd,1,[ t('',209,27,0),t('Update_Servidor_Efetivo(',3,1,730),t('Sdt_serv_efet',23,1,754),t(',',7,1,768),t('Messages',23,1,769),t(')',4,1,778) ]).
b_line_i(28,1,1,cmd,1,[ t('',104,28,0),t(o(1,'PUpdate_Serv_Efet'),28,1,769),t('Sdt_serv_efet',23,1,788),t(',',7,1,0),t('Messages',23,1,803) ]).
b_line_i(29,1,1,cmd,1,[ t('',210,28,812) ]).
b_line_i(30,1,1,cmd,1,[ t('',211,30,0),t('RestMethod(DELETE)',3,1,836) ]).
b_line_i(31,1,1,cmd,1,[ t('',209,31,0),t('Delete_Servidor_Efetivo(',3,1,862),t('Sdt_serv_efet',23,1,886),t(')',4,1,900) ]).
b_line_i(32,1,1,cmd,1,[ t('',104,32,0),t(o(1,'PDelete_Serv_Efet'),28,1,884),t('Se_pes_id',23,1,903),t(',',7,1,0),t('Messages',23,1,914) ]).
b_line_i(33,1,1,cmd,1,[ t('',210,32,923) ]).
b_line_i(34,1,1,cmd,1,[ t('',211,34,0),t('RestMethod(GET)',3,1,944) ]).
b_line_i(35,1,1,cmd,1,[ t('',209,35,0),t('Get_Servidor_Efetivo(',3,1,967),t('Sdt_serv_efet',23,1,988),t(')',4,1,1002) ]).
b_line_i(36,1,1,cmd,1,[ t('',104,36,0),t(o(33,'DP_Get_Serv_Efet'),28,1,989),t('Se_pes_id',23,1,1007),t(',',7,1,0),t('Se_matricula',23,1,1018),t(',',7,1,0),t('Pagenumber',23,1,1032),t(',',7,1,0),t('Pagesize',23,1,1044) ]).
b_line_i(37,1,1,cmd,1,[ t('',210,36,1053) ]).
b_line_i(40,1,1,cmd,1,[ t('',211,40,0),t('RestMethod(POST)',3,1,1105) ]).
b_line_i(41,1,1,cmd,1,[ t('',209,41,0),t('Insert_Servidor_Temporario(',3,1,1134),t('Sdt_serv_temp',23,1,1161),t(',',7,1,1175),t('Messages',23,1,1176),t(')',4,1,1185) ]).
b_line_i(42,1,1,cmd,1,[ t('',104,42,0),t(o(1,'PInsert_Serv_Temp'),28,1,1173),t('Sdt_serv_temp',23,1,1192),t(',',7,1,0),t('Messages',23,1,1207) ]).
b_line_i(43,1,1,cmd,1,[ t('',210,42,1216) ]).
b_line_i(44,1,1,cmd,1,[ t('',211,44,0),t('RestMethod(PUT)',3,1,1237) ]).
b_line_i(45,1,1,cmd,1,[ t('',209,45,0),t('Update_Servidor_Temporario(',3,1,1266),t('Sdt_serv_temp',23,1,1293),t(',',7,1,1307),t('Messages',23,1,1308),t(')',4,1,1317) ]).
b_line_i(46,1,1,cmd,1,[ t('',104,46,0),t(o(1,'PUpdate_Serv_Temp'),28,1,1305),t('Sdt_serv_temp',23,1,1324),t(',',7,1,0),t('Messages',23,1,1339) ]).
b_line_i(47,1,1,cmd,1,[ t('',210,46,1348) ]).
b_line_i(48,1,1,cmd,1,[ t('',211,48,0),t('RestMethod(DELETE)',3,1,1372) ]).
b_line_i(49,1,1,cmd,1,[ t('',209,49,0),t('Delete_Servidor_Temporario(',3,1,1401),t('Sdt_serv_temp',23,1,1428),t(',',7,1,1442),t('Messages',23,1,1443),t(')',4,1,1452) ]).
b_line_i(50,1,1,cmd,1,[ t('',104,50,0),t(o(1,'PDelete_Serv_Temp'),28,1,1440),t('St_pes_id',23,1,1459),t(',',7,1,0),t('Messages',23,1,1470) ]).
b_line_i(51,1,1,cmd,1,[ t('',210,50,1479) ]).
b_line_i(52,1,1,cmd,1,[ t('',211,52,0),t('RestMethod(GET)',3,1,1500) ]).
b_line_i(53,1,1,cmd,1,[ t('',209,53,0),t('Get_Serv_Temp(',3,1,1516),t('Sdt_serv_temp',23,1,1530),t(')',4,1,1544) ]).
b_line_i(54,1,1,cmd,1,[ t('',104,54,0),t(o(33,'DP_Get_Serv_Temp'),28,1,1538),t('St_pes_id',23,1,1556),t(',',7,1,0),t('St_data_admissao',23,1,1567),t(',',7,1,0),t('St_data_demissao',23,1,1585),t(',',7,1,0),t('Pagenumber',23,1,1603),t(',',7,1,0),t('Pagesize',23,1,1615) ]).
b_line_i(55,1,1,cmd,1,[ t('',210,54,1624) ]).
b_line_i(58,1,1,cmd,1,[ t('',211,58,0),t('RestMethod(POST)',3,1,1664) ]).
b_line_i(59,1,1,cmd,1,[ t('',209,59,0),t('Insert_Unidade(',3,1,1681),t('Sdt_unidade',23,1,1696),t(',',7,1,1708),t('Messages',23,1,1709),t(')',4,1,1718) ]).
b_line_i(60,1,1,cmd,1,[ t('',104,60,0),t(o(1,'PInsert_Unidade'),28,1,1718),t('Sdt_unidade',23,1,1735),t(',',7,1,0),t('Messages',23,1,1748) ]).
b_line_i(61,1,1,cmd,1,[ t('',210,60,1757) ]).
b_line_i(62,1,1,cmd,1,[ t('',211,62,0),t('RestMethod(PUT)',3,1,1778) ]).
b_line_i(63,1,1,cmd,1,[ t('',209,63,0),t('Update_Unidade(',3,1,1795),t('Sdt_unidade',23,1,1810),t(',',7,1,1822),t('Messages',23,1,1823),t(')',4,1,1832) ]).
b_line_i(64,1,1,cmd,1,[ t('',104,64,0),t(o(1,'Pupdate_Unidade'),28,1,1832),t('Sdt_unidade',23,1,1849),t(',',7,1,0),t('Messages',23,1,1862) ]).
b_line_i(65,1,1,cmd,1,[ t('',210,64,1871) ]).
b_line_i(66,1,1,cmd,1,[ t('',211,66,0),t('RestMethod(DELETE)',3,1,1895) ]).
b_line_i(67,1,1,cmd,1,[ t('',209,67,0),t('Delete_Unidade(',3,1,1912),t('Unid_id',23,1,1927),t(',',7,1,1935),t('Messages',23,1,1936),t(')',4,1,1945) ]).
b_line_i(68,1,1,cmd,1,[ t('',104,68,0),t(o(1,'PDelete_Unidade'),28,1,1945),t('Unid_id',23,1,1962),t(',',7,1,0),t('Messages',23,1,1971) ]).
b_line_i(69,1,1,cmd,1,[ t('',210,68,1980) ]).
b_line_i(70,1,1,cmd,1,[ t('',211,70,0),t('RestMethod(GET)',3,1,2001) ]).
b_line_i(71,1,1,cmd,1,[ t('',209,71,0),t('Get_Unidade(',3,1,2015),t('Sdt_unidade',23,1,2027),t(')',4,1,2039) ]).
b_line_i(72,1,1,cmd,1,[ t('',104,72,0),t(o(33,'DP_Get_Unidade'),28,1,2035),t('Unid_id',23,1,2051),t(',',7,1,0),t('Unid_nome',23,1,2060),t(',',7,1,0),t('Unid_sigla',23,1,2071),t(',',7,1,0),t('Pagenumber',23,1,2083),t(',',7,1,0),t('Pagesize',23,1,2095) ]).
b_line_i(73,1,1,cmd,1,[ t('',210,72,2104) ]).
b_line_i(75,1,1,cmd,1,[ t('',211,75,0),t('RestMethod(GET)',3,1,2152) ]).
b_line_i(76,1,1,cmd,1,[ t('',209,76,0),t('Get_ServLotado(',3,1,2169),t('Unid_id',23,1,2184),t(',',7,1,2192),t('Sdt_servlotado',23,1,2193),t(')',4,1,2208) ]).
b_line_i(77,1,1,cmd,1,[ t('',104,77,0),t(o(33,'DP_ServidoresLotados'),28,1,2209),t('Serv_lot_id',23,1,2231),t(',',7,1,0),t('Serv_lot_idade',23,1,2244),t(',',7,1,0),t('Serv_lot_unid',23,1,2260),t(',',7,1,0),t('Unid_id',23,1,2275),t(',',7,1,0),t('Unid_nome',23,1,2284),t(',',7,1,0),t('Pagenumber',23,1,2295),t(',',7,1,0),t('Pagesize',23,1,2307) ]).
b_line_i(78,1,1,cmd,1,[ t('',210,77,2316) ]).
b_line_i(80,1,1,cmd,1,[ t('',211,80,0),t('RestMethod(GET)',3,1,2359) ]).
b_line_i(81,1,1,cmd,1,[ t('',209,81,0),t('Get_EnderecoFuncional(',3,1,2383),t('Unidade_id',23,1,2405),t(',',7,1,2416),t('Sdt_endfuncional',23,1,2417),t(')',4,1,2434) ]).
b_line_i(82,1,1,cmd,1,[ t('',104,82,0),t(o(33,'DP_GetEnderecoFuncional'),28,1,2428),t('End_funcional_id',23,1,2453),t(',',7,1,0),t('Unidade_id',23,1,2471),t(',',7,1,0),t('Endereco_id',23,1,2483),t(',',7,1,0),t('Pagenumber',23,1,2496),t(',',7,1,0),t('Pagesize',23,1,2511) ]).
b_line_i(83,1,1,cmd,1,[ t('',210,82,2523) ]).
b_line_i(84,1,1,cmd,1,[ t('',208,83,0) ]).
 
 
 
 
 
 
page_layout_i([ 66,0,6 ]).
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
warn_gen_i(msg(layout(18,[]),spc0024,[ 'Not enough parameters ',calling,' ','DP_Get_Lotacao','.' ])).
warn_gen_i(msg(layout(36,[]),spc0024,[ 'Not enough parameters ',calling,' ','DP_Get_Serv_Efet','.' ])).
warn_gen_i(msg(layout(54,[]),spc0024,[ 'Not enough parameters ',calling,' ','DP_Get_Serv_Temp','.' ])).
warn_gen_i(msg(layout(72,[]),spc0024,[ 'Not enough parameters ',calling,' ','DP_Get_Unidade','.' ])).
warn_gen_i(msg(layout(77,[]),spc0024,[ 'Not enough parameters ',calling,' ','DP_ServidoresLotados','.' ])).
warn_gen_i(msg(layout(82,[]),spc0024,[ 'Not enough parameters ',calling,' ','DP_GetEnderecoFuncional','.' ])).
 
 
 
 
 
 
 
 
 
 
 
calling_main_i(42,1).
 
att_prop_i(1,'Lot_data_lotacao','VarServiceExtName','',d).
att_prop_i(1,'Lot_data_remocao','VarServiceExtName','',d).
att_prop_i(1,'Lot_id','VarServiceExtName','',d).
att_prop_i(1,'Lot_portaria','VarServiceExtName','',d).
att_prop_i(1,'Messages','VarServiceExtName','',d).
att_prop_i(1,'Pes_id','VarServiceExtName','',d).
att_prop_i(1,'Sdt_lotacao','VarServiceExtName','',d).
att_prop_i(1,'Sdt_serv_efet','VarServiceExtName','',d).
att_prop_i(1,'Sdt_serv_temp','VarServiceExtName','',d).
att_prop_i(1,'Sdt_servlotado','VarServiceExtName','',d).
att_prop_i(1,'Sdt_unidade','VarServiceExtName','',d).
att_prop_i(1,'Se_matricula','VarServiceExtName','',d).
att_prop_i(1,'Se_pes_id','VarServiceExtName','',d).
att_prop_i(1,'St_data_admissao','VarServiceExtName','',d).
att_prop_i(1,'St_data_demissao','VarServiceExtName','',d).
att_prop_i(1,'St_pes_id','VarServiceExtName','',d).
att_prop_i(1,'Unid_id','VarServiceExtName','',d).
att_prop_i(1,'Unid_nome','VarServiceExtName','',d).
att_prop_i(1,'Unid_sigla','VarServiceExtName','',d).
att_prop_i(1,'Serv_lot_id','VarServiceExtName','',d).
att_prop_i(1,'Serv_lot_idade','VarServiceExtName','',d).
att_prop_i(1,'Serv_lot_unid','VarServiceExtName','',d).
att_prop_i(1,'Pagenumber','VarServiceExtName','',d).
att_prop_i(1,'Pagesize','VarServiceExtName','',d).
att_prop_i(1,'End_funcional_id','VarServiceExtName','',d).
att_prop_i(1,'Unidade_id','VarServiceExtName','',d).
att_prop_i(1,'Endereco_id','VarServiceExtName','',d).
att_prop_i(1,'Sdt_endfuncional','VarServiceExtName','',d).
 
 
 
var_prop_i(2,'Lot_data_lotacao',idBasedOn,'',v).
var_prop_i(2,'Lot_data_remocao',idBasedOn,'',v).
var_prop_i(2,'Lot_id',idBasedOn,'',v).
var_prop_i(2,'Lot_portaria',idBasedOn,'',v).
var_prop_i(2,'Pes_id',idBasedOn,'',v).
var_prop_i(2,'Se_matricula',idBasedOn,'',v).
var_prop_i(2,'Se_pes_id',idBasedOn,'',v).
var_prop_i(2,'St_data_admissao',idBasedOn,'',v).
var_prop_i(2,'St_data_demissao',idBasedOn,'',v).
var_prop_i(2,'St_pes_id',idBasedOn,'',v).
var_prop_i(2,'Unid_id',idBasedOn,'',v).
var_prop_i(2,'Unid_nome',idBasedOn,'',v).
var_prop_i(2,'Unid_sigla',idBasedOn,'',v).
var_prop_i(2,'Serv_lot_id',idBasedOn,'',v).
var_prop_i(2,'Serv_lot_idade',idBasedOn,'',v).
var_prop_i(2,'Serv_lot_unid',idBasedOn,'',v).
var_prop_i(2,'End_funcional_id',idBasedOn,'',v).
var_prop_i(2,'Unidade_id',idBasedOn,'',v).
var_prop_i(2,'Endereco_id',idBasedOn,'',v).
var_prop_i(2,'Restmethod',idBasedOn,78,v).
var_prop_i(2,'Restmethod','AttValidationFailedMsg','GXSPC_OutOfRange',d).
 
 
 
 
 
struct_dt_i([ 26,1,0 ],name,'GeneXus\Common\Messages').
struct_dt_i([ 26,1,0 ],namespace,'GeneXus').
struct_dt_i([ 26,1,0 ],'ObjName','Messages').
struct_dt_i([ 26,1,0 ],'ObjDesc','Messages').
struct_dt_i([ 26,1,0 ],'ExternalName','Messages').
struct_dt_i([ 26,1,0 ],'ExternalNamespace','GeneXus').
struct_dt_i([ 26,1,0 ],'JsonInputFormat','JsonInputWrapped').
struct_dt_i([ 26,1,0 ],collection,'True').
struct_dt_i([ 26,1,0 ],datatype,[ 26,1,1 ]).
struct_dt_i([ 26,1,0 ],'CollectionItemName','Message').
struct_dt_i([ 26,1,0 ],'XmlName','').
struct_dt_i([ 26,1,0 ],'XmlCollectionItemName','').
struct_dt_i([ 26,1,0 ],'XmlNamespace','').
struct_dt_i([ 26,1,0 ],'CollectionSerialization',idXmlCollectionWrapped).
struct_dt_i([ 26,1,0 ],'XmlInclude',idXmlIncludeAlways).
struct_dt_i([ 26,1,0 ],'JsonName','').
struct_dt_i([ 26,1,0 ],'JsonInclude',idJsonNoProperty).
struct_dt_i([ 26,1,0 ],'JsonCollectionSerialization',idXmlCollectionWrapped).
struct_dt_i([ 26,1,0 ],isexternal,'True').
struct_dt_i([ 26,1,1 ],name,'Message').
struct_dt_i([ 26,1,1 ],namespace,'GeneXus.Messages').
struct_dt_i([ 26,62,0 ],name,'Sdt_Lotacao').
struct_dt_i([ 26,62,0 ],namespace,'Treinamento2').
struct_dt_i([ 26,62,0 ],'ObjName','Sdt_Lotacao').
struct_dt_i([ 26,62,0 ],'ObjDesc','Sdt_Lotacao').
struct_dt_i([ 26,62,0 ],'ExternalName','Sdt_Lotacao').
struct_dt_i([ 26,62,0 ],'ExternalNamespace','Treinamento2').
struct_dt_i([ 26,62,0 ],'JsonInputFormat','JsonInputWrapped').
struct_dt_i([ 26,62,0 ],collection,'True').
struct_dt_i([ 26,62,0 ],datatype,[ 26,62,92 ]).
struct_dt_i([ 26,62,0 ],'CollectionItemName','Sdt_LotacaoItem').
struct_dt_i([ 26,62,0 ],'XmlName','').
struct_dt_i([ 26,62,0 ],'XmlCollectionItemName','').
struct_dt_i([ 26,62,0 ],'XmlNamespace','').
struct_dt_i([ 26,62,0 ],'CollectionSerialization',idXmlCollectionWrapped).
struct_dt_i([ 26,62,0 ],'XmlInclude',idXmlIncludeAlways).
struct_dt_i([ 26,62,0 ],'JsonName','').
struct_dt_i([ 26,62,0 ],'JsonInclude',idJsonNoProperty).
struct_dt_i([ 26,62,0 ],'JsonCollectionSerialization',idXmlCollectionWrapped).
struct_dt_i([ 26,62,92 ],name,'Sdt_LotacaoItem').
struct_dt_i([ 26,62,92 ],namespace,'Treinamento2.Sdt_Lotacao').
struct_dt_i([ 26,63,0 ],name,'Sdt_serv_efet').
struct_dt_i([ 26,63,0 ],namespace,'Treinamento2').
struct_dt_i([ 26,63,0 ],'ObjName','Sdt_serv_efet').
struct_dt_i([ 26,63,0 ],'ObjDesc','Sdt_serv_efet').
struct_dt_i([ 26,63,0 ],'ExternalName','Sdt_serv_efet').
struct_dt_i([ 26,63,0 ],'ExternalNamespace','Treinamento2').
struct_dt_i([ 26,63,0 ],'JsonInputFormat','JsonInputWrapped').
struct_dt_i([ 26,63,0 ],collection,'True').
struct_dt_i([ 26,63,0 ],datatype,[ 26,63,93 ]).
struct_dt_i([ 26,63,0 ],'CollectionItemName','Sdt_serv_efetItem').
struct_dt_i([ 26,63,0 ],'XmlName','').
struct_dt_i([ 26,63,0 ],'XmlCollectionItemName','').
struct_dt_i([ 26,63,0 ],'XmlNamespace','').
struct_dt_i([ 26,63,0 ],'CollectionSerialization',idXmlCollectionWrapped).
struct_dt_i([ 26,63,0 ],'XmlInclude',idXmlIncludeAlways).
struct_dt_i([ 26,63,0 ],'JsonName','').
struct_dt_i([ 26,63,0 ],'JsonInclude',idJsonNoProperty).
struct_dt_i([ 26,63,0 ],'JsonCollectionSerialization',idXmlCollectionWrapped).
struct_dt_i([ 26,63,93 ],name,'Sdt_serv_efetItem').
struct_dt_i([ 26,63,93 ],namespace,'Treinamento2.Sdt_serv_efet').
struct_dt_i([ 26,64,0 ],name,'Sdt_serv_temp').
struct_dt_i([ 26,64,0 ],namespace,'Treinamento2').
struct_dt_i([ 26,64,0 ],'ObjName','Sdt_serv_temp').
struct_dt_i([ 26,64,0 ],'ObjDesc','Sdt_serv_temp').
struct_dt_i([ 26,64,0 ],'ExternalName','Sdt_serv_temp').
struct_dt_i([ 26,64,0 ],'ExternalNamespace','Treinamento2').
struct_dt_i([ 26,64,0 ],'JsonInputFormat','JsonInputWrapped').
struct_dt_i([ 26,64,0 ],collection,'True').
struct_dt_i([ 26,64,0 ],datatype,[ 26,64,94 ]).
struct_dt_i([ 26,64,0 ],'CollectionItemName','Sdt_serv_tempItem').
struct_dt_i([ 26,64,0 ],'XmlName','').
struct_dt_i([ 26,64,0 ],'XmlCollectionItemName','').
struct_dt_i([ 26,64,0 ],'XmlNamespace','').
struct_dt_i([ 26,64,0 ],'CollectionSerialization',idXmlCollectionWrapped).
struct_dt_i([ 26,64,0 ],'XmlInclude',idXmlIncludeAlways).
struct_dt_i([ 26,64,0 ],'JsonName','').
struct_dt_i([ 26,64,0 ],'JsonInclude',idJsonNoProperty).
struct_dt_i([ 26,64,0 ],'JsonCollectionSerialization',idXmlCollectionWrapped).
struct_dt_i([ 26,64,94 ],name,'Sdt_serv_tempItem').
struct_dt_i([ 26,64,94 ],namespace,'Treinamento2.Sdt_serv_temp').
struct_dt_i([ 26,66,0 ],name,'SDT_ServLotado').
struct_dt_i([ 26,66,0 ],namespace,'Treinamento2').
struct_dt_i([ 26,66,0 ],'ObjName','SDT_ServLotado').
struct_dt_i([ 26,66,0 ],'ObjDesc','SDT_Serv Lotado').
struct_dt_i([ 26,66,0 ],'ExternalName','SDT_ServLotado').
struct_dt_i([ 26,66,0 ],'ExternalNamespace','Treinamento2').
struct_dt_i([ 26,66,0 ],'JsonInputFormat','JsonInputWrapped').
struct_dt_i([ 26,66,0 ],collection,'True').
struct_dt_i([ 26,66,0 ],datatype,[ 26,66,96 ]).
struct_dt_i([ 26,66,0 ],'CollectionItemName','SDT_ServLotadoItem').
struct_dt_i([ 26,66,0 ],'XmlName','').
struct_dt_i([ 26,66,0 ],'XmlCollectionItemName','').
struct_dt_i([ 26,66,0 ],'XmlNamespace','').
struct_dt_i([ 26,66,0 ],'CollectionSerialization',idXmlCollectionWrapped).
struct_dt_i([ 26,66,0 ],'XmlInclude',idXmlIncludeAlways).
struct_dt_i([ 26,66,0 ],'JsonName','').
struct_dt_i([ 26,66,0 ],'JsonInclude',idJsonNoProperty).
struct_dt_i([ 26,66,0 ],'JsonCollectionSerialization',idXmlCollectionWrapped).
struct_dt_i([ 26,66,96 ],name,'SDT_ServLotadoItem').
struct_dt_i([ 26,66,96 ],namespace,'Treinamento2.SDT_ServLotado').
struct_dt_i([ 26,65,0 ],name,'Sdt_unidade').
struct_dt_i([ 26,65,0 ],namespace,'Treinamento2').
struct_dt_i([ 26,65,0 ],'ObjName','Sdt_unidade').
struct_dt_i([ 26,65,0 ],'ObjDesc','').
struct_dt_i([ 26,65,0 ],'ExternalName','Sdt_unidade').
struct_dt_i([ 26,65,0 ],'ExternalNamespace','Treinamento2').
struct_dt_i([ 26,65,0 ],'JsonInputFormat','JsonInputWrapped').
struct_dt_i([ 26,65,0 ],collection,'True').
struct_dt_i([ 26,65,0 ],datatype,[ 26,65,95 ]).
struct_dt_i([ 26,65,0 ],'CollectionItemName','Sdt_unidadeItem').
struct_dt_i([ 26,65,0 ],'XmlName','').
struct_dt_i([ 26,65,0 ],'XmlCollectionItemName','').
struct_dt_i([ 26,65,0 ],'XmlNamespace','').
struct_dt_i([ 26,65,0 ],'CollectionSerialization',idXmlCollectionWrapped).
struct_dt_i([ 26,65,0 ],'XmlInclude',idXmlIncludeAlways).
struct_dt_i([ 26,65,0 ],'JsonName','').
struct_dt_i([ 26,65,0 ],'JsonInclude',idJsonNoProperty).
struct_dt_i([ 26,65,0 ],'JsonCollectionSerialization',idXmlCollectionWrapped).
struct_dt_i([ 26,65,95 ],name,'Sdt_unidadeItem').
struct_dt_i([ 26,65,95 ],namespace,'Treinamento2.Sdt_unidade').
struct_dt_i([ 26,67,0 ],name,'SDT_EndFuncional').
struct_dt_i([ 26,67,0 ],namespace,'Treinamento2').
struct_dt_i([ 26,67,0 ],'ObjName','SDT_EndFuncional').
struct_dt_i([ 26,67,0 ],'ObjDesc','SDT_End Funcional').
struct_dt_i([ 26,67,0 ],'ExternalName','SDT_EndFuncional').
struct_dt_i([ 26,67,0 ],'ExternalNamespace','Treinamento2').
struct_dt_i([ 26,67,0 ],'JsonInputFormat','JsonInputWrapped').
struct_dt_i([ 26,67,0 ],collection,'True').
struct_dt_i([ 26,67,0 ],datatype,[ 26,67,97 ]).
struct_dt_i([ 26,67,0 ],'CollectionItemName','SDT_EndFuncionalItem').
struct_dt_i([ 26,67,0 ],'XmlName','').
struct_dt_i([ 26,67,0 ],'XmlCollectionItemName','').
struct_dt_i([ 26,67,0 ],'XmlNamespace','').
struct_dt_i([ 26,67,0 ],'CollectionSerialization',idXmlCollectionWrapped).
struct_dt_i([ 26,67,0 ],'XmlInclude',idXmlIncludeAlways).
struct_dt_i([ 26,67,0 ],'JsonName','').
struct_dt_i([ 26,67,0 ],'JsonInclude',idJsonNoProperty).
struct_dt_i([ 26,67,0 ],'JsonCollectionSerialization',idXmlCollectionWrapped).
struct_dt_i([ 26,67,97 ],name,'SDT_EndFuncionalItem').
struct_dt_i([ 26,67,97 ],namespace,'Treinamento2.SDT_EndFuncional').
struct_dt_i([ 26,1,0 ],fullname,'GeneXus\Common\Messages').
struct_dt_i([ 26,1,1 ],fullname,'GeneXus\Common\Messages.Message').
struct_dt_i([ 26,62,0 ],fullname,'Sdt_Lotacao').
struct_dt_i([ 26,62,92 ],fullname,'Sdt_Lotacao.Sdt_LotacaoItem').
struct_dt_i([ 26,63,0 ],fullname,'Sdt_serv_efet').
struct_dt_i([ 26,63,93 ],fullname,'Sdt_serv_efet.Sdt_serv_efetItem').
struct_dt_i([ 26,64,0 ],fullname,'Sdt_serv_temp').
struct_dt_i([ 26,64,94 ],fullname,'Sdt_serv_temp.Sdt_serv_tempItem').
struct_dt_i([ 26,66,0 ],fullname,'SDT_ServLotado').
struct_dt_i([ 26,66,96 ],fullname,'SDT_ServLotado.SDT_ServLotadoItem').
struct_dt_i([ 26,65,0 ],fullname,'Sdt_unidade').
struct_dt_i([ 26,65,95 ],fullname,'Sdt_unidade.Sdt_unidadeItem').
struct_dt_i([ 26,67,0 ],fullname,'SDT_EndFuncional').
struct_dt_i([ 26,67,97 ],fullname,'SDT_EndFuncional.SDT_EndFuncionalItem').
 
struct_dt_elem_i([ 26,1,1 ],1,name,'Id').
struct_dt_elem_i([ 26,1,1 ],1,camelname,'Id').
struct_dt_elem_i([ 26,1,1 ],1,length,128).
struct_dt_elem_i([ 26,1,1 ],1,decimals,0).
struct_dt_elem_i([ 26,1,1 ],1,type,[ 13,128,0 ]).
struct_dt_elem_i([ 26,1,1 ],1,pic,'').
struct_dt_elem_i([ 26,1,1 ],1,collection,'False').
struct_dt_elem_i([ 26,1,1 ],1,'ExternalName','Id').
struct_dt_elem_i([ 26,1,1 ],1,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,1,1 ],1,'XmlType','Element').
struct_dt_elem_i([ 26,1,1 ],1,'XmlName','').
struct_dt_elem_i([ 26,1,1 ],1,'XmlNamespace','').
struct_dt_elem_i([ 26,1,1 ],1,soaptype,'').
struct_dt_elem_i([ 26,1,1 ],1,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,1,1 ],1,'JsonName','').
struct_dt_elem_i([ 26,1,1 ],1,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,1,1 ],2,name,'Type').
struct_dt_elem_i([ 26,1,1 ],2,camelname,'Type').
struct_dt_elem_i([ 26,1,1 ],2,basedon,7).
struct_dt_elem_i([ 26,1,1 ],2,length,2).
struct_dt_elem_i([ 26,1,1 ],2,decimals,0).
struct_dt_elem_i([ 26,1,1 ],2,sign,0).
struct_dt_elem_i([ 26,1,1 ],2,type,[ 4,2,0 ]).
struct_dt_elem_i([ 26,1,1 ],2,pic,'Z9').
struct_dt_elem_i([ 26,1,1 ],2,collection,'False').
struct_dt_elem_i([ 26,1,1 ],2,'ExternalName','Type').
struct_dt_elem_i([ 26,1,1 ],2,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,1,1 ],2,'XmlType','Element').
struct_dt_elem_i([ 26,1,1 ],2,'XmlName','').
struct_dt_elem_i([ 26,1,1 ],2,'XmlNamespace','').
struct_dt_elem_i([ 26,1,1 ],2,soaptype,'').
struct_dt_elem_i([ 26,1,1 ],2,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,1,1 ],2,'JsonName','').
struct_dt_elem_i([ 26,1,1 ],2,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,1,1 ],3,name,'Description').
struct_dt_elem_i([ 26,1,1 ],3,camelname,'Description').
struct_dt_elem_i([ 26,1,1 ],3,length,256).
struct_dt_elem_i([ 26,1,1 ],3,decimals,0).
struct_dt_elem_i([ 26,1,1 ],3,type,[ 13,256,0 ]).
struct_dt_elem_i([ 26,1,1 ],3,pic,'').
struct_dt_elem_i([ 26,1,1 ],3,collection,'False').
struct_dt_elem_i([ 26,1,1 ],3,'ExternalName','Description').
struct_dt_elem_i([ 26,1,1 ],3,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,1,1 ],3,'XmlType','Element').
struct_dt_elem_i([ 26,1,1 ],3,'XmlName','').
struct_dt_elem_i([ 26,1,1 ],3,'XmlNamespace','').
struct_dt_elem_i([ 26,1,1 ],3,soaptype,'').
struct_dt_elem_i([ 26,1,1 ],3,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,1,1 ],3,'JsonName','').
struct_dt_elem_i([ 26,1,1 ],3,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,62,92 ],1,name,'Lot_id').
struct_dt_elem_i([ 26,62,92 ],1,camelname,lot_id).
struct_dt_elem_i([ 26,62,92 ],1,basedon,96).
struct_dt_elem_i([ 26,62,92 ],1,length,8).
struct_dt_elem_i([ 26,62,92 ],1,decimals,0).
struct_dt_elem_i([ 26,62,92 ],1,sign,0).
struct_dt_elem_i([ 26,62,92 ],1,type,[ 4,8,0 ]).
struct_dt_elem_i([ 26,62,92 ],1,pic,'ZZZZZZZ9').
struct_dt_elem_i([ 26,62,92 ],1,collection,'False').
struct_dt_elem_i([ 26,62,92 ],1,'ExternalName',lot_id).
struct_dt_elem_i([ 26,62,92 ],1,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,62,92 ],1,'XmlType','Element').
struct_dt_elem_i([ 26,62,92 ],1,'XmlName','').
struct_dt_elem_i([ 26,62,92 ],1,'XmlNamespace','').
struct_dt_elem_i([ 26,62,92 ],1,soaptype,'').
struct_dt_elem_i([ 26,62,92 ],1,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,62,92 ],1,'JsonName','').
struct_dt_elem_i([ 26,62,92 ],1,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,62,92 ],2,name,'Pes_id').
struct_dt_elem_i([ 26,62,92 ],2,camelname,pes_id).
struct_dt_elem_i([ 26,62,92 ],2,basedon,96).
struct_dt_elem_i([ 26,62,92 ],2,length,8).
struct_dt_elem_i([ 26,62,92 ],2,decimals,0).
struct_dt_elem_i([ 26,62,92 ],2,sign,0).
struct_dt_elem_i([ 26,62,92 ],2,type,[ 4,8,0 ]).
struct_dt_elem_i([ 26,62,92 ],2,pic,'ZZZZZZZ9').
struct_dt_elem_i([ 26,62,92 ],2,collection,'False').
struct_dt_elem_i([ 26,62,92 ],2,'ExternalName',pes_id).
struct_dt_elem_i([ 26,62,92 ],2,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,62,92 ],2,'XmlType','Element').
struct_dt_elem_i([ 26,62,92 ],2,'XmlName','').
struct_dt_elem_i([ 26,62,92 ],2,'XmlNamespace','').
struct_dt_elem_i([ 26,62,92 ],2,soaptype,'').
struct_dt_elem_i([ 26,62,92 ],2,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,62,92 ],2,'JsonName','').
struct_dt_elem_i([ 26,62,92 ],2,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,62,92 ],3,name,'Unid_id').
struct_dt_elem_i([ 26,62,92 ],3,camelname,unid_id).
struct_dt_elem_i([ 26,62,92 ],3,basedon,96).
struct_dt_elem_i([ 26,62,92 ],3,length,8).
struct_dt_elem_i([ 26,62,92 ],3,decimals,0).
struct_dt_elem_i([ 26,62,92 ],3,sign,0).
struct_dt_elem_i([ 26,62,92 ],3,type,[ 4,8,0 ]).
struct_dt_elem_i([ 26,62,92 ],3,pic,'ZZZZZZZ9').
struct_dt_elem_i([ 26,62,92 ],3,collection,'False').
struct_dt_elem_i([ 26,62,92 ],3,'ExternalName',unid_id).
struct_dt_elem_i([ 26,62,92 ],3,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,62,92 ],3,'XmlType','Element').
struct_dt_elem_i([ 26,62,92 ],3,'XmlName','').
struct_dt_elem_i([ 26,62,92 ],3,'XmlNamespace','').
struct_dt_elem_i([ 26,62,92 ],3,soaptype,'').
struct_dt_elem_i([ 26,62,92 ],3,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,62,92 ],3,'JsonName','').
struct_dt_elem_i([ 26,62,92 ],3,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,62,92 ],4,name,'Lot_data_lotacao').
struct_dt_elem_i([ 26,62,92 ],4,camelname,lot_data_lotacao).
struct_dt_elem_i([ 26,62,92 ],4,length,8).
struct_dt_elem_i([ 26,62,92 ],4,decimals,0).
struct_dt_elem_i([ 26,62,92 ],4,type,[ 6,8,0 ]).
struct_dt_elem_i([ 26,62,92 ],4,pic,'99/99/99').
struct_dt_elem_i([ 26,62,92 ],4,collection,'False').
struct_dt_elem_i([ 26,62,92 ],4,'ExternalName',lot_data_lotacao).
struct_dt_elem_i([ 26,62,92 ],4,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,62,92 ],4,'XmlType','Element').
struct_dt_elem_i([ 26,62,92 ],4,'XmlName','').
struct_dt_elem_i([ 26,62,92 ],4,'XmlNamespace','').
struct_dt_elem_i([ 26,62,92 ],4,soaptype,'').
struct_dt_elem_i([ 26,62,92 ],4,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,62,92 ],4,'JsonName','').
struct_dt_elem_i([ 26,62,92 ],4,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,62,92 ],5,name,'Lot_data_remocao').
struct_dt_elem_i([ 26,62,92 ],5,camelname,lot_data_remocao).
struct_dt_elem_i([ 26,62,92 ],5,length,8).
struct_dt_elem_i([ 26,62,92 ],5,decimals,0).
struct_dt_elem_i([ 26,62,92 ],5,type,[ 6,8,0 ]).
struct_dt_elem_i([ 26,62,92 ],5,pic,'99/99/99').
struct_dt_elem_i([ 26,62,92 ],5,collection,'False').
struct_dt_elem_i([ 26,62,92 ],5,'ExternalName',lot_data_remocao).
struct_dt_elem_i([ 26,62,92 ],5,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,62,92 ],5,'XmlType','Element').
struct_dt_elem_i([ 26,62,92 ],5,'XmlName','').
struct_dt_elem_i([ 26,62,92 ],5,'XmlNamespace','').
struct_dt_elem_i([ 26,62,92 ],5,soaptype,'').
struct_dt_elem_i([ 26,62,92 ],5,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,62,92 ],5,'JsonName','').
struct_dt_elem_i([ 26,62,92 ],5,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,62,92 ],6,name,'Lot_portaria').
struct_dt_elem_i([ 26,62,92 ],6,camelname,lot_portaria).
struct_dt_elem_i([ 26,62,92 ],6,length,100).
struct_dt_elem_i([ 26,62,92 ],6,decimals,0).
struct_dt_elem_i([ 26,62,92 ],6,type,[ 13,100,0 ]).
struct_dt_elem_i([ 26,62,92 ],6,pic,'').
struct_dt_elem_i([ 26,62,92 ],6,collection,'False').
struct_dt_elem_i([ 26,62,92 ],6,'ExternalName',lot_portaria).
struct_dt_elem_i([ 26,62,92 ],6,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,62,92 ],6,'XmlType','Element').
struct_dt_elem_i([ 26,62,92 ],6,'XmlName','').
struct_dt_elem_i([ 26,62,92 ],6,'XmlNamespace','').
struct_dt_elem_i([ 26,62,92 ],6,soaptype,'').
struct_dt_elem_i([ 26,62,92 ],6,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,62,92 ],6,'JsonName','').
struct_dt_elem_i([ 26,62,92 ],6,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,63,93 ],1,name,'Se_pes_id').
struct_dt_elem_i([ 26,63,93 ],1,camelname,se_pes_id).
struct_dt_elem_i([ 26,63,93 ],1,basedon,96).
struct_dt_elem_i([ 26,63,93 ],1,length,8).
struct_dt_elem_i([ 26,63,93 ],1,decimals,0).
struct_dt_elem_i([ 26,63,93 ],1,sign,0).
struct_dt_elem_i([ 26,63,93 ],1,type,[ 4,8,0 ]).
struct_dt_elem_i([ 26,63,93 ],1,pic,'ZZZZZZZ9').
struct_dt_elem_i([ 26,63,93 ],1,collection,'False').
struct_dt_elem_i([ 26,63,93 ],1,'ExternalName',se_pes_id).
struct_dt_elem_i([ 26,63,93 ],1,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,63,93 ],1,'XmlType','Element').
struct_dt_elem_i([ 26,63,93 ],1,'XmlName','').
struct_dt_elem_i([ 26,63,93 ],1,'XmlNamespace','').
struct_dt_elem_i([ 26,63,93 ],1,soaptype,'').
struct_dt_elem_i([ 26,63,93 ],1,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,63,93 ],1,'JsonName','').
struct_dt_elem_i([ 26,63,93 ],1,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,63,93 ],2,name,'Se_matricula').
struct_dt_elem_i([ 26,63,93 ],2,camelname,se_matricula).
struct_dt_elem_i([ 26,63,93 ],2,length,20).
struct_dt_elem_i([ 26,63,93 ],2,decimals,0).
struct_dt_elem_i([ 26,63,93 ],2,type,[ 13,20,0 ]).
struct_dt_elem_i([ 26,63,93 ],2,pic,'').
struct_dt_elem_i([ 26,63,93 ],2,collection,'False').
struct_dt_elem_i([ 26,63,93 ],2,'ExternalName',se_matricula).
struct_dt_elem_i([ 26,63,93 ],2,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,63,93 ],2,'XmlType','Element').
struct_dt_elem_i([ 26,63,93 ],2,'XmlName','').
struct_dt_elem_i([ 26,63,93 ],2,'XmlNamespace','').
struct_dt_elem_i([ 26,63,93 ],2,soaptype,'').
struct_dt_elem_i([ 26,63,93 ],2,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,63,93 ],2,'JsonName','').
struct_dt_elem_i([ 26,63,93 ],2,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,64,94 ],1,name,'St_pes_id').
struct_dt_elem_i([ 26,64,94 ],1,camelname,st_pes_id).
struct_dt_elem_i([ 26,64,94 ],1,basedon,96).
struct_dt_elem_i([ 26,64,94 ],1,length,8).
struct_dt_elem_i([ 26,64,94 ],1,decimals,0).
struct_dt_elem_i([ 26,64,94 ],1,sign,0).
struct_dt_elem_i([ 26,64,94 ],1,type,[ 4,8,0 ]).
struct_dt_elem_i([ 26,64,94 ],1,pic,'ZZZZZZZ9').
struct_dt_elem_i([ 26,64,94 ],1,collection,'False').
struct_dt_elem_i([ 26,64,94 ],1,'ExternalName',st_pes_id).
struct_dt_elem_i([ 26,64,94 ],1,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,64,94 ],1,'XmlType','Element').
struct_dt_elem_i([ 26,64,94 ],1,'XmlName','').
struct_dt_elem_i([ 26,64,94 ],1,'XmlNamespace','').
struct_dt_elem_i([ 26,64,94 ],1,soaptype,'').
struct_dt_elem_i([ 26,64,94 ],1,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,64,94 ],1,'JsonName','').
struct_dt_elem_i([ 26,64,94 ],1,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,64,94 ],2,name,'St_data_admissao').
struct_dt_elem_i([ 26,64,94 ],2,camelname,st_data_admissao).
struct_dt_elem_i([ 26,64,94 ],2,length,8).
struct_dt_elem_i([ 26,64,94 ],2,decimals,0).
struct_dt_elem_i([ 26,64,94 ],2,type,[ 6,8,0 ]).
struct_dt_elem_i([ 26,64,94 ],2,pic,'99/99/99').
struct_dt_elem_i([ 26,64,94 ],2,collection,'False').
struct_dt_elem_i([ 26,64,94 ],2,'ExternalName',st_data_admissao).
struct_dt_elem_i([ 26,64,94 ],2,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,64,94 ],2,'XmlType','Element').
struct_dt_elem_i([ 26,64,94 ],2,'XmlName','').
struct_dt_elem_i([ 26,64,94 ],2,'XmlNamespace','').
struct_dt_elem_i([ 26,64,94 ],2,soaptype,'').
struct_dt_elem_i([ 26,64,94 ],2,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,64,94 ],2,'JsonName','').
struct_dt_elem_i([ 26,64,94 ],2,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,64,94 ],3,name,'St_data_demissao').
struct_dt_elem_i([ 26,64,94 ],3,camelname,st_data_demissao).
struct_dt_elem_i([ 26,64,94 ],3,length,8).
struct_dt_elem_i([ 26,64,94 ],3,decimals,0).
struct_dt_elem_i([ 26,64,94 ],3,type,[ 6,8,0 ]).
struct_dt_elem_i([ 26,64,94 ],3,pic,'99/99/99').
struct_dt_elem_i([ 26,64,94 ],3,collection,'False').
struct_dt_elem_i([ 26,64,94 ],3,'ExternalName',st_data_demissao).
struct_dt_elem_i([ 26,64,94 ],3,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,64,94 ],3,'XmlType','Element').
struct_dt_elem_i([ 26,64,94 ],3,'XmlName','').
struct_dt_elem_i([ 26,64,94 ],3,'XmlNamespace','').
struct_dt_elem_i([ 26,64,94 ],3,soaptype,'').
struct_dt_elem_i([ 26,64,94 ],3,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,64,94 ],3,'JsonName','').
struct_dt_elem_i([ 26,64,94 ],3,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,66,96 ],1,name,'Serv_lot_id').
struct_dt_elem_i([ 26,66,96 ],1,camelname,serv_lot_id).
struct_dt_elem_i([ 26,66,96 ],1,basedon,96).
struct_dt_elem_i([ 26,66,96 ],1,length,8).
struct_dt_elem_i([ 26,66,96 ],1,decimals,0).
struct_dt_elem_i([ 26,66,96 ],1,sign,0).
struct_dt_elem_i([ 26,66,96 ],1,type,[ 4,8,0 ]).
struct_dt_elem_i([ 26,66,96 ],1,pic,'ZZZZZZZ9').
struct_dt_elem_i([ 26,66,96 ],1,collection,'False').
struct_dt_elem_i([ 26,66,96 ],1,'ExternalName',serv_lot_id).
struct_dt_elem_i([ 26,66,96 ],1,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,66,96 ],1,'XmlType','Element').
struct_dt_elem_i([ 26,66,96 ],1,'XmlName','').
struct_dt_elem_i([ 26,66,96 ],1,'XmlNamespace','').
struct_dt_elem_i([ 26,66,96 ],1,soaptype,'').
struct_dt_elem_i([ 26,66,96 ],1,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,66,96 ],1,'JsonName','').
struct_dt_elem_i([ 26,66,96 ],1,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,66,96 ],2,name,'Serv_lot_idade').
struct_dt_elem_i([ 26,66,96 ],2,camelname,serv_lot_idade).
struct_dt_elem_i([ 26,66,96 ],2,length,4).
struct_dt_elem_i([ 26,66,96 ],2,decimals,0).
struct_dt_elem_i([ 26,66,96 ],2,sign,0).
struct_dt_elem_i([ 26,66,96 ],2,type,[ 4,4,0 ]).
struct_dt_elem_i([ 26,66,96 ],2,pic,'ZZZ9').
struct_dt_elem_i([ 26,66,96 ],2,collection,'False').
struct_dt_elem_i([ 26,66,96 ],2,'ExternalName',serv_lot_idade).
struct_dt_elem_i([ 26,66,96 ],2,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,66,96 ],2,'XmlType','Element').
struct_dt_elem_i([ 26,66,96 ],2,'XmlName','').
struct_dt_elem_i([ 26,66,96 ],2,'XmlNamespace','').
struct_dt_elem_i([ 26,66,96 ],2,soaptype,'').
struct_dt_elem_i([ 26,66,96 ],2,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,66,96 ],2,'JsonName','').
struct_dt_elem_i([ 26,66,96 ],2,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,66,96 ],3,name,'Serv_lot_unid').
struct_dt_elem_i([ 26,66,96 ],3,camelname,serv_lot_unid).
struct_dt_elem_i([ 26,66,96 ],3,length,40).
struct_dt_elem_i([ 26,66,96 ],3,decimals,0).
struct_dt_elem_i([ 26,66,96 ],3,type,[ 13,40,0 ]).
struct_dt_elem_i([ 26,66,96 ],3,pic,'').
struct_dt_elem_i([ 26,66,96 ],3,collection,'False').
struct_dt_elem_i([ 26,66,96 ],3,'ExternalName',serv_lot_unid).
struct_dt_elem_i([ 26,66,96 ],3,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,66,96 ],3,'XmlType','Element').
struct_dt_elem_i([ 26,66,96 ],3,'XmlName','').
struct_dt_elem_i([ 26,66,96 ],3,'XmlNamespace','').
struct_dt_elem_i([ 26,66,96 ],3,soaptype,'').
struct_dt_elem_i([ 26,66,96 ],3,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,66,96 ],3,'JsonName','').
struct_dt_elem_i([ 26,66,96 ],3,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,66,96 ],4,name,'Serv_lot_foto').
struct_dt_elem_i([ 26,66,96 ],4,camelname,serv_lot_foto).
struct_dt_elem_i([ 26,66,96 ],4,length,40).
struct_dt_elem_i([ 26,66,96 ],4,decimals,0).
struct_dt_elem_i([ 26,66,96 ],4,type,[ 13,40,0 ]).
struct_dt_elem_i([ 26,66,96 ],4,pic,'').
struct_dt_elem_i([ 26,66,96 ],4,collection,'False').
struct_dt_elem_i([ 26,66,96 ],4,'ExternalName',serv_lot_foto).
struct_dt_elem_i([ 26,66,96 ],4,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,66,96 ],4,'XmlType','Element').
struct_dt_elem_i([ 26,66,96 ],4,'XmlName','').
struct_dt_elem_i([ 26,66,96 ],4,'XmlNamespace','').
struct_dt_elem_i([ 26,66,96 ],4,soaptype,'').
struct_dt_elem_i([ 26,66,96 ],4,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,66,96 ],4,'JsonName','').
struct_dt_elem_i([ 26,66,96 ],4,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,66,96 ],5,name,'Unid_id').
struct_dt_elem_i([ 26,66,96 ],5,camelname,unid_id).
struct_dt_elem_i([ 26,66,96 ],5,basedon,96).
struct_dt_elem_i([ 26,66,96 ],5,length,8).
struct_dt_elem_i([ 26,66,96 ],5,decimals,0).
struct_dt_elem_i([ 26,66,96 ],5,sign,0).
struct_dt_elem_i([ 26,66,96 ],5,type,[ 4,8,0 ]).
struct_dt_elem_i([ 26,66,96 ],5,pic,'ZZZZZZZ9').
struct_dt_elem_i([ 26,66,96 ],5,collection,'False').
struct_dt_elem_i([ 26,66,96 ],5,'ExternalName',unid_id).
struct_dt_elem_i([ 26,66,96 ],5,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,66,96 ],5,'XmlType','Element').
struct_dt_elem_i([ 26,66,96 ],5,'XmlName','').
struct_dt_elem_i([ 26,66,96 ],5,'XmlNamespace','').
struct_dt_elem_i([ 26,66,96 ],5,soaptype,'').
struct_dt_elem_i([ 26,66,96 ],5,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,66,96 ],5,'JsonName','').
struct_dt_elem_i([ 26,66,96 ],5,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,66,96 ],6,name,'Unid_nome').
struct_dt_elem_i([ 26,66,96 ],6,camelname,unid_nome).
struct_dt_elem_i([ 26,66,96 ],6,length,200).
struct_dt_elem_i([ 26,66,96 ],6,decimals,0).
struct_dt_elem_i([ 26,66,96 ],6,type,[ 13,200,0 ]).
struct_dt_elem_i([ 26,66,96 ],6,pic,'').
struct_dt_elem_i([ 26,66,96 ],6,collection,'False').
struct_dt_elem_i([ 26,66,96 ],6,'ExternalName',unid_nome).
struct_dt_elem_i([ 26,66,96 ],6,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,66,96 ],6,'XmlType','Element').
struct_dt_elem_i([ 26,66,96 ],6,'XmlName','').
struct_dt_elem_i([ 26,66,96 ],6,'XmlNamespace','').
struct_dt_elem_i([ 26,66,96 ],6,soaptype,'').
struct_dt_elem_i([ 26,66,96 ],6,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,66,96 ],6,'JsonName','').
struct_dt_elem_i([ 26,66,96 ],6,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,65,95 ],1,name,'Unid_id').
struct_dt_elem_i([ 26,65,95 ],1,camelname,unid_id).
struct_dt_elem_i([ 26,65,95 ],1,basedon,96).
struct_dt_elem_i([ 26,65,95 ],1,length,8).
struct_dt_elem_i([ 26,65,95 ],1,decimals,0).
struct_dt_elem_i([ 26,65,95 ],1,sign,0).
struct_dt_elem_i([ 26,65,95 ],1,type,[ 4,8,0 ]).
struct_dt_elem_i([ 26,65,95 ],1,pic,'ZZZZZZZ9').
struct_dt_elem_i([ 26,65,95 ],1,collection,'False').
struct_dt_elem_i([ 26,65,95 ],1,'ExternalName',unid_id).
struct_dt_elem_i([ 26,65,95 ],1,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,65,95 ],1,'XmlType','Element').
struct_dt_elem_i([ 26,65,95 ],1,'XmlName','').
struct_dt_elem_i([ 26,65,95 ],1,'XmlNamespace','').
struct_dt_elem_i([ 26,65,95 ],1,soaptype,'').
struct_dt_elem_i([ 26,65,95 ],1,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,65,95 ],1,'JsonName','').
struct_dt_elem_i([ 26,65,95 ],1,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,65,95 ],2,name,'Unid_nome').
struct_dt_elem_i([ 26,65,95 ],2,camelname,unid_nome).
struct_dt_elem_i([ 26,65,95 ],2,length,200).
struct_dt_elem_i([ 26,65,95 ],2,decimals,0).
struct_dt_elem_i([ 26,65,95 ],2,type,[ 13,200,0 ]).
struct_dt_elem_i([ 26,65,95 ],2,pic,'').
struct_dt_elem_i([ 26,65,95 ],2,collection,'False').
struct_dt_elem_i([ 26,65,95 ],2,'ExternalName',unid_nome).
struct_dt_elem_i([ 26,65,95 ],2,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,65,95 ],2,'XmlType','Element').
struct_dt_elem_i([ 26,65,95 ],2,'XmlName','').
struct_dt_elem_i([ 26,65,95 ],2,'XmlNamespace','').
struct_dt_elem_i([ 26,65,95 ],2,soaptype,'').
struct_dt_elem_i([ 26,65,95 ],2,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,65,95 ],2,'JsonName','').
struct_dt_elem_i([ 26,65,95 ],2,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,65,95 ],3,name,'Unid_sigla').
struct_dt_elem_i([ 26,65,95 ],3,camelname,unid_sigla).
struct_dt_elem_i([ 26,65,95 ],3,length,20).
struct_dt_elem_i([ 26,65,95 ],3,decimals,0).
struct_dt_elem_i([ 26,65,95 ],3,type,[ 13,20,0 ]).
struct_dt_elem_i([ 26,65,95 ],3,pic,'').
struct_dt_elem_i([ 26,65,95 ],3,collection,'False').
struct_dt_elem_i([ 26,65,95 ],3,'ExternalName',unid_sigla).
struct_dt_elem_i([ 26,65,95 ],3,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,65,95 ],3,'XmlType','Element').
struct_dt_elem_i([ 26,65,95 ],3,'XmlName','').
struct_dt_elem_i([ 26,65,95 ],3,'XmlNamespace','').
struct_dt_elem_i([ 26,65,95 ],3,soaptype,'').
struct_dt_elem_i([ 26,65,95 ],3,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,65,95 ],3,'JsonName','').
struct_dt_elem_i([ 26,65,95 ],3,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,67,97 ],1,name,'End_funcional_id').
struct_dt_elem_i([ 26,67,97 ],1,camelname,end_funcional_id).
struct_dt_elem_i([ 26,67,97 ],1,length,4).
struct_dt_elem_i([ 26,67,97 ],1,decimals,0).
struct_dt_elem_i([ 26,67,97 ],1,sign,0).
struct_dt_elem_i([ 26,67,97 ],1,type,[ 4,4,0 ]).
struct_dt_elem_i([ 26,67,97 ],1,pic,'ZZZ9').
struct_dt_elem_i([ 26,67,97 ],1,collection,'False').
struct_dt_elem_i([ 26,67,97 ],1,'ExternalName',end_funcional_id).
struct_dt_elem_i([ 26,67,97 ],1,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,67,97 ],1,'XmlType','Element').
struct_dt_elem_i([ 26,67,97 ],1,'XmlName','').
struct_dt_elem_i([ 26,67,97 ],1,'XmlNamespace','').
struct_dt_elem_i([ 26,67,97 ],1,soaptype,'').
struct_dt_elem_i([ 26,67,97 ],1,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,67,97 ],1,'JsonName','').
struct_dt_elem_i([ 26,67,97 ],1,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,67,97 ],2,name,'Unidade_id').
struct_dt_elem_i([ 26,67,97 ],2,camelname,unidade_id).
struct_dt_elem_i([ 26,67,97 ],2,basedon,96).
struct_dt_elem_i([ 26,67,97 ],2,length,8).
struct_dt_elem_i([ 26,67,97 ],2,decimals,0).
struct_dt_elem_i([ 26,67,97 ],2,sign,0).
struct_dt_elem_i([ 26,67,97 ],2,type,[ 4,8,0 ]).
struct_dt_elem_i([ 26,67,97 ],2,pic,'ZZZZZZZ9').
struct_dt_elem_i([ 26,67,97 ],2,collection,'False').
struct_dt_elem_i([ 26,67,97 ],2,'ExternalName',unidade_id).
struct_dt_elem_i([ 26,67,97 ],2,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,67,97 ],2,'XmlType','Element').
struct_dt_elem_i([ 26,67,97 ],2,'XmlName','').
struct_dt_elem_i([ 26,67,97 ],2,'XmlNamespace','').
struct_dt_elem_i([ 26,67,97 ],2,soaptype,'').
struct_dt_elem_i([ 26,67,97 ],2,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,67,97 ],2,'JsonName','').
struct_dt_elem_i([ 26,67,97 ],2,'JsonInclude',idJsonEmpty).
struct_dt_elem_i([ 26,67,97 ],3,name,'Endereco_id').
struct_dt_elem_i([ 26,67,97 ],3,camelname,endereco_id).
struct_dt_elem_i([ 26,67,97 ],3,basedon,96).
struct_dt_elem_i([ 26,67,97 ],3,length,8).
struct_dt_elem_i([ 26,67,97 ],3,decimals,0).
struct_dt_elem_i([ 26,67,97 ],3,sign,0).
struct_dt_elem_i([ 26,67,97 ],3,type,[ 4,8,0 ]).
struct_dt_elem_i([ 26,67,97 ],3,pic,'ZZZZZZZ9').
struct_dt_elem_i([ 26,67,97 ],3,collection,'False').
struct_dt_elem_i([ 26,67,97 ],3,'ExternalName',endereco_id).
struct_dt_elem_i([ 26,67,97 ],3,'ExternalNamespace','Treinamento2').
struct_dt_elem_i([ 26,67,97 ],3,'XmlType','Element').
struct_dt_elem_i([ 26,67,97 ],3,'XmlName','').
struct_dt_elem_i([ 26,67,97 ],3,'XmlNamespace','').
struct_dt_elem_i([ 26,67,97 ],3,soaptype,'').
struct_dt_elem_i([ 26,67,97 ],3,'XmlInclude',idXmlIncludeAlways).
struct_dt_elem_i([ 26,67,97 ],3,'JsonName','').
struct_dt_elem_i([ 26,67,97 ],3,'JsonInclude',idJsonEmpty).
 
 
 
 
 
 
pgm_parm_i(mnproc,7,'DP_GETENDERECOFUNCIONAL',[ [ int,4,0,0 ],[ int,8,0,0 ],[ int,8,0,0 ],[ int,4,0,0 ],[ int,4,0,0 ],[ o(objectcollection('SDT_EndFuncional.SDT_EndFuncionalItem')),0,0,0 ] ],[ [ end_funcional_id,in,[] ],[ unidade_id,in,[] ],[ endereco_id,in,[] ],[ 'PageNumber',in,[] ],[ 'PageSize',in,[] ],[ 'ReturnValue',out,[] ] ]).
pgm_parm_i(mnproc,6,'DP_SERVIDORESLOTADOS',[ [ int,8,0,0 ],[ int,4,0,0 ],[ svchar,40,0,0 ],[ int,8,0,0 ],[ svchar,200,0,0 ],[ int,4,0,0 ],[ int,4,0,0 ],[ o(objectcollection('SDT_ServLotado.SDT_ServLotadoItem')),0,0,0 ] ],[ [ serv_lot_id,in,[] ],[ serv_lot_idade,in,[] ],[ serv_lot_unid,in,[] ],[ unid_id,in,[] ],[ unid_nome,in,[] ],[ 'PageNumber',in,[] ],[ 'PageSize',in,[] ],[ 'ReturnValue',out,[] ] ]).
pgm_parm_i(mnproc,5,'DP_GET_UNIDADE',[ [ int,8,0,0 ],[ svchar,200,0,0 ],[ svchar,20,0,0 ],[ int,4,0,0 ],[ int,4,0,0 ],[ o(objectcollection('Sdt_unidade.Sdt_unidadeItem')),0,0,0 ] ],[ [ unid_id,in,[] ],[ unid_nome,in,[] ],[ unid_sigla,in,[] ],[ 'PageNumber',in,[] ],[ 'PageSize',in,[] ],[ 'ReturnValue',out,[] ] ]).
pgm_parm_i(proc,25,'PDELETE_UNIDADE',[ [ int,8,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ unid_id,in,[] ],[ 'Messages',out,[] ] ]).
pgm_parm_i(proc,21,'PUPDATE_UNIDADE',[ [ o('Sdt_unidade.Sdt_unidadeItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ 'Sdt_unidade',in,[] ],[ 'Messages',out,[] ] ]).
pgm_parm_i(proc,20,'PINSERT_UNIDADE',[ [ o('Sdt_unidade.Sdt_unidadeItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ 'Sdt_unidade',in,[] ],[ 'Messages',out,[] ] ]).
pgm_parm_i(mnproc,4,'DP_GET_SERV_TEMP',[ [ int,8,0,0 ],[ date,8,0,0 ],[ date,8,0,0 ],[ int,4,0,0 ],[ int,4,0,0 ],[ o(objectcollection('Sdt_serv_temp.Sdt_serv_tempItem')),0,0,0 ] ],[ [ st_pes_id,in,[] ],[ st_data_admissao,in,[] ],[ st_data_demissao,in,[] ],[ 'PageNumber',in,[] ],[ 'PageSize',in,[] ],[ 'ReturnValue',out,[] ] ]).
pgm_parm_i(proc,23,'PDELETE_SERV_TEMP',[ [ int,8,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ st_pes_id,in,[] ],[ 'Messages',out,[] ] ]).
pgm_parm_i(proc,19,'PUPDATE_SERV_TEMP',[ [ o('Sdt_serv_temp.Sdt_serv_tempItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ sdt_serv_temp,in,[] ],[ 'Messages',out,[] ] ]).
pgm_parm_i(proc,16,'PINSERT_SERV_TEMP',[ [ o('Sdt_serv_temp.Sdt_serv_tempItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ sdt_serv_temp,in,[] ],[ 'Messages',out,[] ] ]).
pgm_parm_i(mnproc,3,'DP_GET_SERV_EFET',[ [ int,8,0,0 ],[ svchar,20,0,0 ],[ int,4,0,0 ],[ int,4,0,0 ],[ o(objectcollection('Sdt_serv_efet.Sdt_serv_efetItem')),0,0,0 ] ],[ [ se_pes_id,in,[] ],[ se_matricula,in,[] ],[ 'PageNumber',in,[] ],[ 'PageSize',in,[] ],[ 'ReturnValue',out,[] ] ]).
pgm_parm_i(proc,24,'PDELETE_SERV_EFET',[ [ int,8,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ se_pes_id,in,[] ],[ 'Messages',out,[] ] ]).
pgm_parm_i(proc,17,'PUPDATE_SERV_EFET',[ [ o('Sdt_serv_efet.Sdt_serv_efetItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ sdt_serv_efet,in,[] ],[ 'Messages',out,[] ] ]).
pgm_parm_i(proc,15,'PINSERT_SERV_EFET',[ [ o('Sdt_serv_efet.Sdt_serv_efetItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ sdt_serv_efet,in,[] ],[ 'Messages',out,[] ] ]).
pgm_parm_i(mnproc,2,'DP_GET_LOTACAO',[ [ int,8,0,0 ],[ int,8,0,0 ],[ int,8,0,0 ],[ date,8,0,0 ],[ date,8,0,0 ],[ svchar,100,0,0 ],[ int,4,0,0 ],[ int,4,0,0 ],[ o(objectcollection('Sdt_Lotacao.Sdt_LotacaoItem')),0,0,0 ] ],[ [ lot_id,in,[] ],[ pes_id,in,[] ],[ unid_id,in,[] ],[ lot_data_lotacao,in,[] ],[ lot_data_remocao,in,[] ],[ lot_portaria,in,[] ],[ 'PageNumber',in,[] ],[ 'PageSize',in,[] ],[ 'ReturnValue',out,[] ] ]).
pgm_parm_i(proc,22,'PDELETE_LOTACAO',[ [ int,8,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ lot_id,in,[] ],[ 'Messages',out,[] ] ]).
pgm_parm_i(proc,18,'PUPDATE_LOTACAO',[ [ o('Sdt_Lotacao.Sdt_LotacaoItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ sdt_lotacao,in,[] ],[ 'Messages',out,[] ] ]).
pgm_parm_i(proc,14,'PINSERT_LOTACAO',[ [ o('Sdt_Lotacao.Sdt_LotacaoItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ sdt_Lotacao,in,[] ],[ 'Messages',out,[] ] ]).
 
pgm_callprotocol_i(svcgrp,1,'API','INTERNAL','').
pgm_callprotocol_i(mnproc,7,'DP_GETENDERECOFUNCIONAL','INTERNAL','').
pgm_callprotocol_i(mnproc,6,'DP_SERVIDORESLOTADOS','INTERNAL','').
pgm_callprotocol_i(mnproc,5,'DP_GET_UNIDADE','INTERNAL','').
pgm_callprotocol_i(proc,25,'PDELETE_UNIDADE','INTERNAL','Unsecure').
pgm_callprotocol_i(proc,21,'PUPDATE_UNIDADE','INTERNAL','Unsecure').
pgm_callprotocol_i(proc,20,'PINSERT_UNIDADE','INTERNAL','Unsecure').
pgm_callprotocol_i(mnproc,4,'DP_GET_SERV_TEMP','INTERNAL','').
pgm_callprotocol_i(proc,23,'PDELETE_SERV_TEMP','INTERNAL','Unsecure').
pgm_callprotocol_i(proc,19,'PUPDATE_SERV_TEMP','INTERNAL','Unsecure').
pgm_callprotocol_i(proc,16,'PINSERT_SERV_TEMP','INTERNAL','Unsecure').
pgm_callprotocol_i(mnproc,3,'DP_GET_SERV_EFET','INTERNAL','').
pgm_callprotocol_i(proc,24,'PDELETE_SERV_EFET','INTERNAL','Unsecure').
pgm_callprotocol_i(proc,17,'PUPDATE_SERV_EFET','INTERNAL','Unsecure').
pgm_callprotocol_i(proc,15,'PINSERT_SERV_EFET','INTERNAL','Unsecure').
pgm_callprotocol_i(mnproc,2,'DP_GET_LOTACAO','INTERNAL','').
pgm_callprotocol_i(proc,22,'PDELETE_LOTACAO','INTERNAL','Unsecure').
pgm_callprotocol_i(proc,18,'PUPDATE_LOTACAO','INTERNAL','Unsecure').
pgm_callprotocol_i(proc,14,'PINSERT_LOTACAO','INTERNAL','Unsecure').
 
 
pgm_main_info_i(svcgrp,1,'API',[ 12,'API','API','','','','' ]).
 
pgm_sub_parm_i(svcgrp,1,'API','Insert_Lotacao',[ [ o('Sdt_Lotacao.Sdt_LotacaoItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ sdt_lotacao,in,[] ],[ 'Messages',out,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Update_Lotacao',[ [ o('Sdt_Lotacao.Sdt_LotacaoItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ sdt_lotacao,in,[] ],[ 'Messages',out,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Delete_Lotacao',[ [ o('Sdt_Lotacao.Sdt_LotacaoItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ sdt_lotacao,in,[] ],[ 'Messages',out,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Get_Lotacao',[ [ o('Sdt_Lotacao.Sdt_LotacaoItem'),0,0,0 ] ],[ [ sdt_lotacao,in,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Insert_Servidor_Efetivo',[ [ o('Sdt_serv_efet.Sdt_serv_efetItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ 'Sdt_Serv_Efet',in,[] ],[ 'Messages',out,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Update_Servidor_Efetivo',[ [ o('Sdt_serv_efet.Sdt_serv_efetItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ 'Sdt_Serv_Efet',in,[] ],[ 'Messages',out,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Delete_Servidor_Efetivo',[ [ o('Sdt_serv_efet.Sdt_serv_efetItem'),0,0,0 ] ],[ [ 'Sdt_Serv_Efet',in,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Get_Servidor_Efetivo',[ [ o('Sdt_serv_efet.Sdt_serv_efetItem'),0,0,0 ] ],[ [ 'Sdt_Serv_Efet',in,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Insert_Servidor_Temporario',[ [ o('Sdt_serv_temp.Sdt_serv_tempItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ 'Sdt_Serv_Temp',in,[] ],[ 'Messages',out,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Update_Servidor_Temporario',[ [ o('Sdt_serv_temp.Sdt_serv_tempItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ 'Sdt_Serv_Temp',in,[] ],[ 'Messages',out,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Delete_Servidor_Temporario',[ [ o('Sdt_serv_temp.Sdt_serv_tempItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ 'Sdt_Serv_Temp',in,[] ],[ 'Messages',out,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Get_Serv_Temp',[ [ o('Sdt_serv_temp.Sdt_serv_tempItem'),0,0,0 ] ],[ [ 'Sdt_Serv_Temp',in,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Insert_Unidade',[ [ o('Sdt_unidade.Sdt_unidadeItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ 'Sdt_Unidade',in,[] ],[ 'Messages',out,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Update_Unidade',[ [ o('Sdt_unidade.Sdt_unidadeItem'),0,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ 'Sdt_Unidade',in,[] ],[ 'Messages',out,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Delete_Unidade',[ [ int,8,0,0 ],[ o(objectcollection('GeneXus\Common\Messages.Message')),0,0,0 ] ],[ [ unid_id,in,[] ],[ 'Messages',out,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Get_Unidade',[ [ o('Sdt_unidade.Sdt_unidadeItem'),0,0,0 ] ],[ [ 'Sdt_Unidade',in,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Get_ServLotado',[ [ int,8,0,0 ],[ o('SDT_ServLotado.SDT_ServLotadoItem'),0,0,0 ] ],[ [ unid_id,in,[] ],[ 'SDT_ServLotado',out,[] ] ]).
pgm_sub_parm_i(svcgrp,1,'API','Get_EnderecoFuncional',[ [ int,8,0,0 ],[ o(objectcollection('SDT_EndFuncional.SDT_EndFuncionalItem')),0,0,0 ] ],[ [ unidade_id,in,[] ],[ 'SDT_EndFuncional',out,[] ] ]).
 
 
module_info_i('GeneXus\Common','PACKAGE','com.genexuscore').
module_info_i('GeneXus\Common','PackageName','GeneXus.jar').
module_info_i('GeneXus','PACKAGE','com.genexuscore').
module_info_i('GeneXus','PackageName','GeneXus.jar').
 
 
 
 
 
 
 
 
 
 
