gx.evt.autoSkip=!1;gx.define("gx00a0",!1,function(){var n,t;this.ServerClass="gx00a0";this.PackageName="com.treinamento2";this.ServerFullClass="com.treinamento2.gx00a0";this.setObjectType("web");this.anyGridBaseTable=!0;this.hasEnterEvent=!0;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.DSO="Treinamento2";this.SetStandaloneVars=function(){this.AV8punidade_id=gx.fn.getIntegerValue("vPUNIDADE_ID",".")};this.e130c1_client=function(){return this.executeClientEvent(function(){this.clearMessages();gx.text.compare(gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class"),"AdvancedContainer")==0?(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer AdvancedContainerVisible"),gx.fn.setCtrlProperty("BTNTOGGLE","Class",gx.fn.getCtrlProperty("BTNTOGGLE","Class")+" BtnToggleActive")):(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer"),gx.fn.setCtrlProperty("BTNTOGGLE","Class","BtnToggle"));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}]);this.OnClientEventEnd()},arguments)};this.e110c1_client=function(){return this.executeClientEvent(function(){this.clearMessages();gx.text.compare(gx.fn.getCtrlProperty("UNIDADE_IDFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?(gx.fn.setCtrlProperty("UNIDADE_IDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCUNIDADE_ID","Visible",!0)):(gx.fn.setCtrlProperty("UNIDADE_IDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCUNIDADE_ID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("UNIDADE_IDFILTERCONTAINER","Class")',ctrl:"UNIDADE_IDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCUNIDADE_ID","Visible")',ctrl:"vCUNIDADE_ID",prop:"Visible"}]);this.OnClientEventEnd()},arguments)};this.e120c1_client=function(){return this.executeClientEvent(function(){this.clearMessages();gx.text.compare(gx.fn.getCtrlProperty("ENDERECO_IDFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?(gx.fn.setCtrlProperty("ENDERECO_IDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCENDERECO_ID","Visible",!0)):(gx.fn.setCtrlProperty("ENDERECO_IDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCENDERECO_ID","Visible",!1));this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ENDERECO_IDFILTERCONTAINER","Class")',ctrl:"ENDERECO_IDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENDERECO_ID","Visible")',ctrl:"vCENDERECO_ID",prop:"Visible"}]);this.OnClientEventEnd()},arguments)};this.e160c2_client=function(){return this.executeServerEvent("ENTER",!0,arguments[0],!1,!1)};this.e170c1_client=function(){return this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,35,36,37,38,39,40];this.GXLastCtrlId=40;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",34,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"gx00a0",[],!1,1,!1,!0,10,!0,!1,!1,"",0,"px",0,"px","Novo registro",!0,!1,!1,null,null,!1,"",!1,[1,1,1,1],!1,0,!0,!1);t=this.Grid1Container;t.addBitmap("&Linkselection","vLINKSELECTION",35,0,"px",17,"px",null,"","","SelectionAttribute","WWActionColumn");t.addSingleLineEdit(33,36,"UNIDADE_ID","unidade_id","","unidade_id","int",0,"px",8,8,"end",null,[],33,"unidade_id",!0,0,!1,!1,"Attribute",0,"WWColumn");t.addSingleLineEdit(30,37,"ENDERECO_ID","endereco_id","","endereco_id","int",0,"px",8,8,"end",null,[],30,"endereco_id",!0,0,!1,!1,"Attribute",0,"WWColumn OptionalColumn");this.Grid1Container.emptyText="";this.setGrid(t);n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAIN",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[6]={id:6,fld:"ADVANCEDCONTAINER",grid:0};n[7]={id:7,fld:"",grid:0};n[8]={id:8,fld:"",grid:0};n[9]={id:9,fld:"UNIDADE_IDFILTERCONTAINER",grid:0};n[10]={id:10,fld:"",grid:0};n[11]={id:11,fld:"",grid:0};n[12]={id:12,fld:"LBLUNIDADE_IDFILTER",format:1,grid:0,evt:"e110c1_client",ctrltype:"textblock"};n[13]={id:13,fld:"",grid:0};n[14]={id:14,fld:"",grid:0};n[15]={id:15,fld:"",grid:0};n[16]={id:16,lvl:0,type:"int",len:8,dec:0,sign:!1,pic:"ZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCUNIDADE_ID",fmt:0,gxz:"ZV6cunidade_id",gxold:"OV6cunidade_id",gxvar:"AV6cunidade_id",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV6cunidade_id=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.ZV6cunidade_id=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("vCUNIDADE_ID",gx.O.AV6cunidade_id,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV6cunidade_id=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("vCUNIDADE_ID",".")},nac:gx.falseFn};n[17]={id:17,fld:"",grid:0};n[18]={id:18,fld:"",grid:0};n[19]={id:19,fld:"ENDERECO_IDFILTERCONTAINER",grid:0};n[20]={id:20,fld:"",grid:0};n[21]={id:21,fld:"",grid:0};n[22]={id:22,fld:"LBLENDERECO_IDFILTER",format:1,grid:0,evt:"e120c1_client",ctrltype:"textblock"};n[23]={id:23,fld:"",grid:0};n[24]={id:24,fld:"",grid:0};n[25]={id:25,fld:"",grid:0};n[26]={id:26,lvl:0,type:"int",len:8,dec:0,sign:!1,pic:"ZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCENDERECO_ID",fmt:0,gxz:"ZV7cendereco_id",gxold:"OV7cendereco_id",gxvar:"AV7cendereco_id",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV7cendereco_id=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.ZV7cendereco_id=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("vCENDERECO_ID",gx.O.AV7cendereco_id,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV7cendereco_id=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("vCENDERECO_ID",".")},nac:gx.falseFn};n[27]={id:27,fld:"",grid:0};n[28]={id:28,fld:"GRIDTABLE",grid:0};n[29]={id:29,fld:"",grid:0};n[30]={id:30,fld:"",grid:0};n[31]={id:31,fld:"BTNTOGGLE",grid:0,evt:"e130c1_client"};n[32]={id:32,fld:"",grid:0};n[33]={id:33,fld:"",grid:0};n[35]={id:35,lvl:2,type:"bits",len:1024,dec:0,sign:!1,ro:1,isacc:0,grid:34,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vLINKSELECTION",fmt:0,gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV5LinkSelection=n)},v2z:function(n){n!==undefined&&(gx.O.ZV5LinkSelection=n)},v2c:function(n){gx.fn.setGridMultimediaValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(34),gx.O.AV5LinkSelection,gx.O.AV10Linkselection_GXI)},c2v:function(n){gx.O.AV10Linkselection_GXI=this.val_GXI();this.val(n)!==undefined&&(gx.O.AV5LinkSelection=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(34))},val_GXI:function(n){return gx.fn.getGridControlValue("vLINKSELECTION_GXI",n||gx.fn.currentGridRowImpl(34))},gxvar_GXI:"AV10Linkselection_GXI",nac:gx.falseFn};n[36]={id:36,lvl:2,type:"int",len:8,dec:0,sign:!1,pic:"ZZZZZZZ9",ro:1,isacc:0,grid:34,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"UNIDADE_ID",fmt:0,gxz:"Z33unidade_id",gxold:"O33unidade_id",gxvar:"A33unidade_id",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A33unidade_id=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z33unidade_id=gx.num.intval(n))},v2c:function(n){gx.fn.setGridControlValue("UNIDADE_ID",n||gx.fn.currentGridRowImpl(34),gx.O.A33unidade_id,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A33unidade_id=gx.num.intval(this.val(n)))},val:function(n){return gx.fn.getGridIntegerValue("UNIDADE_ID",n||gx.fn.currentGridRowImpl(34),".")},nac:gx.falseFn};n[37]={id:37,lvl:2,type:"int",len:8,dec:0,sign:!1,pic:"ZZZZZZZ9",ro:1,isacc:0,grid:34,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"ENDERECO_ID",fmt:0,gxz:"Z30endereco_id",gxold:"O30endereco_id",gxvar:"A30endereco_id",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A30endereco_id=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z30endereco_id=gx.num.intval(n))},v2c:function(n){gx.fn.setGridControlValue("ENDERECO_ID",n||gx.fn.currentGridRowImpl(34),gx.O.A30endereco_id,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A30endereco_id=gx.num.intval(this.val(n)))},val:function(n){return gx.fn.getGridIntegerValue("ENDERECO_ID",n||gx.fn.currentGridRowImpl(34),".")},nac:gx.falseFn};n[38]={id:38,fld:"",grid:0};n[39]={id:39,fld:"",grid:0};n[40]={id:40,fld:"BTN_CANCEL",grid:0,evt:"e170c1_client"};this.AV6cunidade_id=0;this.ZV6cunidade_id=0;this.OV6cunidade_id=0;this.AV7cendereco_id=0;this.ZV7cendereco_id=0;this.OV7cendereco_id=0;this.ZV5LinkSelection="";this.OV5LinkSelection="";this.Z33unidade_id=0;this.O33unidade_id=0;this.Z30endereco_id=0;this.O30endereco_id=0;this.AV6cunidade_id=0;this.AV7cendereco_id=0;this.AV8punidade_id=0;this.AV5LinkSelection="";this.A33unidade_id=0;this.A30endereco_id=0;this.Events={e160c2_client:["ENTER",!0],e170c1_client:["CANCEL",!0],e130c1_client:["'TOGGLE'",!1],e110c1_client:["LBLUNIDADE_IDFILTER.CLICK",!1],e120c1_client:["LBLENDERECO_IDFILTER.CLICK",!1]};this.EvtParms.REFRESH=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cunidade_id",fld:"vCUNIDADE_ID",pic:"ZZZZZZZ9"},{av:"AV7cendereco_id",fld:"vCENDERECO_ID",pic:"ZZZZZZZ9"}],[]];this.EvtParms["'TOGGLE'"]=[[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}]];this.EvtParms["LBLUNIDADE_IDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("UNIDADE_IDFILTERCONTAINER","Class")',ctrl:"UNIDADE_IDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("UNIDADE_IDFILTERCONTAINER","Class")',ctrl:"UNIDADE_IDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCUNIDADE_ID","Visible")',ctrl:"vCUNIDADE_ID",prop:"Visible"}]];this.EvtParms["LBLENDERECO_IDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("ENDERECO_IDFILTERCONTAINER","Class")',ctrl:"ENDERECO_IDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ENDERECO_IDFILTERCONTAINER","Class")',ctrl:"ENDERECO_IDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCENDERECO_ID","Visible")',ctrl:"vCENDERECO_ID",prop:"Visible"}]];this.EvtParms.ENTER=[[{av:"A33unidade_id",fld:"UNIDADE_ID",pic:"ZZZZZZZ9",hsh:!0}],[{av:"AV8punidade_id",fld:"vPUNIDADE_ID",pic:"ZZZZZZZ9"}]];this.EvtParms.GRID1_FIRSTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cunidade_id",fld:"vCUNIDADE_ID",pic:"ZZZZZZZ9"},{av:"AV7cendereco_id",fld:"vCENDERECO_ID",pic:"ZZZZZZZ9"}],[]];this.EvtParms.GRID1_PREVPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cunidade_id",fld:"vCUNIDADE_ID",pic:"ZZZZZZZ9"},{av:"AV7cendereco_id",fld:"vCENDERECO_ID",pic:"ZZZZZZZ9"}],[]];this.EvtParms.GRID1_NEXTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cunidade_id",fld:"vCUNIDADE_ID",pic:"ZZZZZZZ9"},{av:"AV7cendereco_id",fld:"vCENDERECO_ID",pic:"ZZZZZZZ9"}],[]];this.EvtParms.GRID1_LASTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cunidade_id",fld:"vCUNIDADE_ID",pic:"ZZZZZZZ9"},{av:"AV7cendereco_id",fld:"vCENDERECO_ID",pic:"ZZZZZZZ9"}],[]];this.setVCMap("AV8punidade_id","vPUNIDADE_ID",0,"int",8,0);t.addRefreshingParm({rfrProp:"Rows",gxGrid:"Grid1"});t.addRefreshingVar(this.GXValidFnc[16]);t.addRefreshingVar(this.GXValidFnc[26]);t.addRefreshingParm(this.GXValidFnc[16]);t.addRefreshingParm(this.GXValidFnc[26]);this.Initialize()});gx.wi(function(){gx.createParentObj(this.gx00a0)})