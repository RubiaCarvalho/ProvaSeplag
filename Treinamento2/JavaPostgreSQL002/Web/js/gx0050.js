gx.evt.autoSkip=!1;gx.define("gx0050",!1,function(){var n,t;this.ServerClass="gx0050";this.PackageName="com.treinamento2";this.ServerFullClass="com.treinamento2.gx0050";this.setObjectType("web");this.anyGridBaseTable=!0;this.hasEnterEvent=!0;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.DSO="Treinamento2";this.SetStandaloneVars=function(){this.AV10ppes_id=gx.fn.getIntegerValue("vPPES_ID",".")};this.e13041_client=function(){return this.executeClientEvent(function(){this.clearMessages();gx.text.compare(gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class"),"AdvancedContainer")==0?(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer AdvancedContainerVisible"),gx.fn.setCtrlProperty("BTNTOGGLE","Class",gx.fn.getCtrlProperty("BTNTOGGLE","Class")+" BtnToggleActive")):(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer"),gx.fn.setCtrlProperty("BTNTOGGLE","Class","BtnToggle"));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}]);this.OnClientEventEnd()},arguments)};this.e11041_client=function(){return this.executeClientEvent(function(){this.clearMessages();gx.text.compare(gx.fn.getCtrlProperty("PES_IDFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?(gx.fn.setCtrlProperty("PES_IDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCPES_ID","Visible",!0)):(gx.fn.setCtrlProperty("PES_IDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCPES_ID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("PES_IDFILTERCONTAINER","Class")',ctrl:"PES_IDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCPES_ID","Visible")',ctrl:"vCPES_ID",prop:"Visible"}]);this.OnClientEventEnd()},arguments)};this.e12041_client=function(){return this.executeClientEvent(function(){this.clearMessages();gx.text.compare(gx.fn.getCtrlProperty("PES_SEXOFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?(gx.fn.setCtrlProperty("PES_SEXOFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCPES_SEXO","Visible",!0)):(gx.fn.setCtrlProperty("PES_SEXOFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCPES_SEXO","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("PES_SEXOFILTERCONTAINER","Class")',ctrl:"PES_SEXOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCPES_SEXO","Visible")',ctrl:"vCPES_SEXO",prop:"Visible"}]);this.OnClientEventEnd()},arguments)};this.e16042_client=function(){return this.executeServerEvent("ENTER",!0,arguments[0],!1,!1)};this.e17041_client=function(){return this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,45,46,47,48,49,50,51];this.GXLastCtrlId=51;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",44,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"gx0050",[],!1,1,!1,!0,10,!0,!1,!1,"",0,"px",0,"px","Novo registro",!0,!1,!1,null,null,!1,"",!1,[1,1,1,1],!1,0,!0,!1);t=this.Grid1Container;t.addBitmap("&Linkselection","vLINKSELECTION",45,0,"px",17,"px",null,"","","SelectionAttribute","WWActionColumn");t.addSingleLineEdit(4,46,"PES_ID","pes_id","","pes_id","int",0,"px",8,8,"end",null,[],4,"pes_id",!0,0,!1,!1,"Attribute",0,"WWColumn");t.addSingleLineEdit(21,47,"PES_DATA_NASCIMENTO","de Nascimento","","pes_data_nascimento","date",0,"px",8,8,"end",null,[],21,"pes_data_nascimento",!0,0,!1,!1,"Attribute",0,"WWColumn OptionalColumn");t.addSingleLineEdit(22,48,"PES_SEXO","Sexo","","pes_sexo","svchar",0,"px",9,9,"start",null,[],22,"pes_sexo",!0,0,!1,!1,"Attribute",0,"WWColumn OptionalColumn");this.Grid1Container.emptyText="";this.setGrid(t);n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAIN",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[6]={id:6,fld:"ADVANCEDCONTAINER",grid:0};n[7]={id:7,fld:"",grid:0};n[8]={id:8,fld:"",grid:0};n[9]={id:9,fld:"PES_IDFILTERCONTAINER",grid:0};n[10]={id:10,fld:"",grid:0};n[11]={id:11,fld:"",grid:0};n[12]={id:12,fld:"LBLPES_IDFILTER",format:1,grid:0,evt:"e11041_client",ctrltype:"textblock"};n[13]={id:13,fld:"",grid:0};n[14]={id:14,fld:"",grid:0};n[15]={id:15,fld:"",grid:0};n[16]={id:16,lvl:0,type:"int",len:8,dec:0,sign:!1,pic:"ZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCPES_ID",fmt:0,gxz:"ZV6cpes_id",gxold:"OV6cpes_id",gxvar:"AV6cpes_id",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV6cpes_id=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.ZV6cpes_id=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("vCPES_ID",gx.O.AV6cpes_id,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV6cpes_id=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("vCPES_ID",".")},nac:gx.falseFn};n[17]={id:17,fld:"",grid:0};n[18]={id:18,fld:"",grid:0};n[19]={id:19,fld:"PES_DATA_NASCIMENTOFILTERCONTAINER",grid:0};n[20]={id:20,fld:"",grid:0};n[21]={id:21,fld:"",grid:0};n[22]={id:22,fld:"LBLPES_DATA_NASCIMENTOFILTER",format:1,grid:0,ctrltype:"textblock"};n[23]={id:23,fld:"",grid:0};n[24]={id:24,fld:"",grid:0};n[25]={id:25,fld:"",grid:0};n[26]={id:26,lvl:0,type:"date",len:8,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCPES_DATA_NASCIMENTO",fmt:0,gxz:"ZV7cpes_data_nascimento",gxold:"OV7cpes_data_nascimento",gxvar:"AV7cpes_data_nascimento",dp:{f:-1,st:!1,wn:!1,mf:!1,pic:"99/99/99",dec:0},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV7cpes_data_nascimento=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.ZV7cpes_data_nascimento=gx.fn.toDatetimeValue(n))},v2c:function(){gx.fn.setControlValue("vCPES_DATA_NASCIMENTO",gx.O.AV7cpes_data_nascimento,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV7cpes_data_nascimento=gx.fn.toDatetimeValue(this.val()))},val:function(){return gx.fn.getControlValue("vCPES_DATA_NASCIMENTO")},nac:gx.falseFn};n[27]={id:27,fld:"",grid:0};n[28]={id:28,fld:"",grid:0};n[29]={id:29,fld:"PES_SEXOFILTERCONTAINER",grid:0};n[30]={id:30,fld:"",grid:0};n[31]={id:31,fld:"",grid:0};n[32]={id:32,fld:"LBLPES_SEXOFILTER",format:1,grid:0,evt:"e12041_client",ctrltype:"textblock"};n[33]={id:33,fld:"",grid:0};n[34]={id:34,fld:"",grid:0};n[35]={id:35,fld:"",grid:0};n[36]={id:36,lvl:0,type:"svchar",len:9,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCPES_SEXO",fmt:0,gxz:"ZV8cpes_sexo",gxold:"OV8cpes_sexo",gxvar:"AV8cpes_sexo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV8cpes_sexo=n)},v2z:function(n){n!==undefined&&(gx.O.ZV8cpes_sexo=n)},v2c:function(){gx.fn.setControlValue("vCPES_SEXO",gx.O.AV8cpes_sexo,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV8cpes_sexo=this.val())},val:function(){return gx.fn.getControlValue("vCPES_SEXO")},nac:gx.falseFn};n[37]={id:37,fld:"",grid:0};n[38]={id:38,fld:"GRIDTABLE",grid:0};n[39]={id:39,fld:"",grid:0};n[40]={id:40,fld:"",grid:0};n[41]={id:41,fld:"BTNTOGGLE",grid:0,evt:"e13041_client"};n[42]={id:42,fld:"",grid:0};n[43]={id:43,fld:"",grid:0};n[45]={id:45,lvl:2,type:"bits",len:1024,dec:0,sign:!1,ro:1,isacc:0,grid:44,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vLINKSELECTION",fmt:0,gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV5LinkSelection=n)},v2z:function(n){n!==undefined&&(gx.O.ZV5LinkSelection=n)},v2c:function(n){gx.fn.setGridMultimediaValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(44),gx.O.AV5LinkSelection,gx.O.AV12Linkselection_GXI)},c2v:function(n){gx.O.AV12Linkselection_GXI=this.val_GXI();this.val(n)!==undefined&&(gx.O.AV5LinkSelection=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(44))},val_GXI:function(n){return gx.fn.getGridControlValue("vLINKSELECTION_GXI",n||gx.fn.currentGridRowImpl(44))},gxvar_GXI:"AV12Linkselection_GXI",nac:gx.falseFn};n[46]={id:46,lvl:2,type:"int",len:8,dec:0,sign:!1,pic:"ZZZZZZZ9",ro:1,isacc:0,grid:44,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PES_ID",fmt:0,gxz:"Z4pes_id",gxold:"O4pes_id",gxvar:"A4pes_id",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A4pes_id=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z4pes_id=gx.num.intval(n))},v2c:function(n){gx.fn.setGridControlValue("PES_ID",n||gx.fn.currentGridRowImpl(44),gx.O.A4pes_id,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A4pes_id=gx.num.intval(this.val(n)))},val:function(n){return gx.fn.getGridIntegerValue("PES_ID",n||gx.fn.currentGridRowImpl(44),".")},nac:gx.falseFn};n[47]={id:47,lvl:2,type:"date",len:8,dec:0,sign:!1,ro:1,isacc:0,grid:44,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PES_DATA_NASCIMENTO",fmt:0,gxz:"Z21pes_data_nascimento",gxold:"O21pes_data_nascimento",gxvar:"A21pes_data_nascimento",dp:{f:0,st:!1,wn:!1,mf:!1,pic:"99/99/99",dec:0},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A21pes_data_nascimento=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z21pes_data_nascimento=gx.fn.toDatetimeValue(n))},v2c:function(n){gx.fn.setGridControlValue("PES_DATA_NASCIMENTO",n||gx.fn.currentGridRowImpl(44),gx.O.A21pes_data_nascimento,0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A21pes_data_nascimento=gx.fn.toDatetimeValue(this.val(n)))},val:function(n){return gx.fn.getGridDateTimeValue("PES_DATA_NASCIMENTO",n||gx.fn.currentGridRowImpl(44))},nac:gx.falseFn};n[48]={id:48,lvl:2,type:"svchar",len:9,dec:0,sign:!1,ro:1,isacc:0,grid:44,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PES_SEXO",fmt:0,gxz:"Z22pes_sexo",gxold:"O22pes_sexo",gxvar:"A22pes_sexo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(n){n!==undefined&&(gx.O.A22pes_sexo=n)},v2z:function(n){n!==undefined&&(gx.O.Z22pes_sexo=n)},v2c:function(n){gx.fn.setGridControlValue("PES_SEXO",n||gx.fn.currentGridRowImpl(44),gx.O.A22pes_sexo,0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A22pes_sexo=this.val(n))},val:function(n){return gx.fn.getGridControlValue("PES_SEXO",n||gx.fn.currentGridRowImpl(44))},nac:gx.falseFn};n[49]={id:49,fld:"",grid:0};n[50]={id:50,fld:"",grid:0};n[51]={id:51,fld:"BTN_CANCEL",grid:0,evt:"e17041_client"};this.AV6cpes_id=0;this.ZV6cpes_id=0;this.OV6cpes_id=0;this.AV7cpes_data_nascimento=gx.date.nullDate();this.ZV7cpes_data_nascimento=gx.date.nullDate();this.OV7cpes_data_nascimento=gx.date.nullDate();this.AV8cpes_sexo="";this.ZV8cpes_sexo="";this.OV8cpes_sexo="";this.ZV5LinkSelection="";this.OV5LinkSelection="";this.Z4pes_id=0;this.O4pes_id=0;this.Z21pes_data_nascimento=gx.date.nullDate();this.O21pes_data_nascimento=gx.date.nullDate();this.Z22pes_sexo="";this.O22pes_sexo="";this.AV6cpes_id=0;this.AV7cpes_data_nascimento=gx.date.nullDate();this.AV8cpes_sexo="";this.AV10ppes_id=0;this.AV5LinkSelection="";this.A4pes_id=0;this.A21pes_data_nascimento=gx.date.nullDate();this.A22pes_sexo="";this.Events={e16042_client:["ENTER",!0],e17041_client:["CANCEL",!0],e13041_client:["'TOGGLE'",!1],e11041_client:["LBLPES_IDFILTER.CLICK",!1],e12041_client:["LBLPES_SEXOFILTER.CLICK",!1]};this.EvtParms.REFRESH=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cpes_id",fld:"vCPES_ID",pic:"ZZZZZZZ9"},{av:"AV7cpes_data_nascimento",fld:"vCPES_DATA_NASCIMENTO",pic:""},{av:"AV8cpes_sexo",fld:"vCPES_SEXO",pic:""}],[]];this.EvtParms["'TOGGLE'"]=[[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}]];this.EvtParms["LBLPES_IDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("PES_IDFILTERCONTAINER","Class")',ctrl:"PES_IDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("PES_IDFILTERCONTAINER","Class")',ctrl:"PES_IDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCPES_ID","Visible")',ctrl:"vCPES_ID",prop:"Visible"}]];this.EvtParms["LBLPES_SEXOFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("PES_SEXOFILTERCONTAINER","Class")',ctrl:"PES_SEXOFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("PES_SEXOFILTERCONTAINER","Class")',ctrl:"PES_SEXOFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCPES_SEXO","Visible")',ctrl:"vCPES_SEXO",prop:"Visible"}]];this.EvtParms.ENTER=[[{av:"A4pes_id",fld:"PES_ID",pic:"ZZZZZZZ9",hsh:!0}],[{av:"AV10ppes_id",fld:"vPPES_ID",pic:"ZZZZZZZ9"}]];this.EvtParms.GRID1_FIRSTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cpes_id",fld:"vCPES_ID",pic:"ZZZZZZZ9"},{av:"AV7cpes_data_nascimento",fld:"vCPES_DATA_NASCIMENTO",pic:""},{av:"AV8cpes_sexo",fld:"vCPES_SEXO",pic:""}],[]];this.EvtParms.GRID1_PREVPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cpes_id",fld:"vCPES_ID",pic:"ZZZZZZZ9"},{av:"AV7cpes_data_nascimento",fld:"vCPES_DATA_NASCIMENTO",pic:""},{av:"AV8cpes_sexo",fld:"vCPES_SEXO",pic:""}],[]];this.EvtParms.GRID1_NEXTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cpes_id",fld:"vCPES_ID",pic:"ZZZZZZZ9"},{av:"AV7cpes_data_nascimento",fld:"vCPES_DATA_NASCIMENTO",pic:""},{av:"AV8cpes_sexo",fld:"vCPES_SEXO",pic:""}],[]];this.EvtParms.GRID1_LASTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cpes_id",fld:"vCPES_ID",pic:"ZZZZZZZ9"},{av:"AV7cpes_data_nascimento",fld:"vCPES_DATA_NASCIMENTO",pic:""},{av:"AV8cpes_sexo",fld:"vCPES_SEXO",pic:""}],[]];this.setVCMap("AV10ppes_id","vPPES_ID",0,"int",8,0);t.addRefreshingParm({rfrProp:"Rows",gxGrid:"Grid1"});t.addRefreshingVar(this.GXValidFnc[16]);t.addRefreshingVar(this.GXValidFnc[26]);t.addRefreshingVar(this.GXValidFnc[36]);t.addRefreshingParm(this.GXValidFnc[16]);t.addRefreshingParm(this.GXValidFnc[26]);t.addRefreshingParm(this.GXValidFnc[36]);this.Initialize()});gx.wi(function(){gx.createParentObj(this.gx0050)})