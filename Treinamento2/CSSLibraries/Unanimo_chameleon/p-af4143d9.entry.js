import{h as e,f as t,r as a,H as o}from"./p-7af91c05.js";import{k as n,l as i,p as s,c as l,d as c,i as r,f as p,a as d,s as u,b as m,e as v,g as h}from"./p-e2e330ff.js";const g={};const b=()=>e("div",{class:"checkbox-test-main-wrapper"},e("fieldset",null,e("legend",{class:"heading-4 field-legend-test"},"No label"),e("ch-checkbox",{accessibleName:g.accessibleName,caption:g.caption,class:"checkbox",checkedValue:g.checkedValue,unCheckedValue:g.unCheckedValue,disabled:g.disabled,indeterminate:g.indeterminate,readonly:g.readonly,value:g.value})),e("fieldset",null,e("legend",{class:"heading-4 field-legend-test"},"Label with HTML for"),e("label",{class:"form-input__label",htmlFor:"checkbox-2"},"Label for checkbox 2"),e("ch-checkbox",{id:"checkbox-2",accessibleName:g.accessibleName,caption:g.caption,class:"checkbox",checkedValue:g.checkedValue,unCheckedValue:g.unCheckedValue,disabled:g.disabled,indeterminate:g.indeterminate,readonly:g.readonly,value:g.value})),e("fieldset",null,e("legend",{class:"heading-4 field-legend-test"},"Component inside label"),e("label",{class:"form-input__label",htmlFor:"checkbox-3"},"Label for checkbox 3",e("ch-checkbox",{id:"checkbox-3",accessibleName:g.accessibleName,caption:g.caption,class:"checkbox",checkedValue:g.checkedValue,unCheckedValue:g.unCheckedValue,disabled:g.disabled,indeterminate:g.indeterminate,readonly:g.readonly,value:g.value}))));const f=[{caption:"Properties",properties:[{id:"accessibleName",caption:"Accessible Name",value:"Option",type:"string"},{id:"caption",caption:"Caption",value:"Option",type:"string"},{id:"checkedValue",caption:"Checked Value",value:"true",type:"string"},{id:"unCheckedValue",caption:"Unchecked Value",value:"false",type:"string"},{id:"disabled",caption:"Disabled",value:false,type:"boolean"},{id:"indeterminate",caption:"Indeterminate",value:false,type:"boolean"},{id:"readonly",caption:"Readonly",value:false,type:"boolean"}]}];const y={properties:f,render:b,state:g};const S=[{value:"Value 1",caption:"Label for the value 1"},{value:"Value 2",caption:"Label for the value 222",items:[{value:"Value 2.1",caption:"Label for the value 2.1"},{value:"Value 2.2",caption:"Label for the value 2.2"}]},{value:"Value 3",caption:"Label for the value 3",disabled:true},{value:"Value 4",caption:"Label for the value 4"},{value:"Value 5",caption:"Label for the value 5",disabled:true,expandable:true,items:[{value:"Value 5.1",caption:"Label for the value 5.1"},{value:"Value 5.2",caption:"Label for the value 5.2"},{value:"Value 5.3",caption:"Label for the value 5.3",disabled:false},{value:"Value 5.4",caption:"Label for the value 5.4"}]},{value:"Value 6",caption:"Label for the value 6",expandable:true,expanded:true,items:[{value:"Value 6.1",caption:"Label for the value 6.1",disabled:true},{value:"Value 6.2",caption:"Label for the value 6.2",disabled:true},{value:"Value 6.3",caption:"Label for the value 6.3",disabled:false},{value:"Value 6.4",caption:"Label for the value 6.4"}]},{value:"Value 7",caption:"Label for the value 7",disabled:true},{value:"Value 8",caption:"Label for the value 8"},{value:"Value 9",caption:"Label for the value 9",expandable:true,items:[{value:"Value 9.1",caption:"Label for the value 9.1"},{value:"Value 9.2",caption:"Label for the value 9.2"},{value:"Value 9.3",caption:"Label for the value 9.3",disabled:false},{value:"Value 9.4",caption:"Label for the value 9.4"}]}];const I=[{value:"chocolate",caption:"Chocolate"},{value:"coconut",caption:"Coconut"},{value:"mint",caption:"Mint"},{value:"strawberry",caption:"Strawberry"},{value:"vanilla",caption:"Vanilla"}];const C=[{value:"Basics",caption:"Basics",expandable:true,expanded:true,items:[{value:"Audio",caption:"Audio"},{value:"Blob",caption:"Blob"},{value:"BlobFile",caption:"BlobFile"},{value:"Boolean",caption:"Boolean"},{value:"Character",caption:"Character"},{value:"Date",caption:"Date"},{value:"DateTime",caption:"DateTime"},{value:"Geography",caption:"Geography"},{value:"GeoLine",caption:"GeoLine"},{value:"GeoPoint",caption:"GeoPoint"},{value:"GeoPolygon",caption:"GeoPolygon"},{value:"GUID",caption:"GUID"},{value:"Image",caption:"Image"},{value:"LongVarChar",caption:"LongVarChar"},{value:"Numeric",caption:"Numeric"},{value:"VarChar",caption:"VarChar"},{value:"Video",caption:"Video"}]},{value:"Extended Types",caption:"Extended Types",expandable:true,items:[{value:"Cache",caption:"Cache"},{value:"ContentInfo",caption:"ContentInfo"},{value:"Cookie",caption:"Cookie"},{value:"CryptoAsymmetricEncrypt",caption:"CryptoAsymmetricEncrypt"},{value:"CryptoCertificate",caption:"CryptoCertificate"},{value:"CryptoHash",caption:"CryptoHash"},{value:"CryptoSign",caption:"CryptoSign"},{value:"CryptoSignXml",caption:"CryptoSignXml"},{value:"CryptoSymmetricEncrypt",caption:"CryptoSymmetricEncrypt"},{value:"DBConnection",caption:"DBConnection"},{value:"Directory",caption:"Directory"},{value:"ExcelDocument",caption:"ExcelDocument"},{value:"Expression",caption:"Expression"},{value:"File",caption:"File"},{value:"HttpClient",caption:"HttpClient"},{value:"HttpRequest",caption:"HttpRequest"},{value:"HttpResponse",caption:"HttpResponse"}]},{value:"Structured Data Types",caption:"Structured Data Types",expandable:true,items:[{value:"GeneXus.Common.AnalyticsKeyValue",caption:"AnalyticsKeyValue, GeneXus.Common"},{value:"GeneXus.Common.AnalyticsKeyPurchase",caption:"AnalyticsKeyPurchase, GeneXus.Common"},{value:"GeneXus.Common.AnalyticsKeyPurchase.Item",caption:"AnalyticsKeyPurchase.Item, GeneXus.Common"},{value:"GeneXus.SD.Media.AudioPlayerCustomAction",caption:"AudioPlayerCustomAction, GeneXus.SD.Media"},{value:"GeneXus.SD.Media.AudioPlayerSettings",caption:"AudioPlayerSettings, GeneXus.SD.Media"},{value:"GeneXus.SD.BeaconInfo",caption:"BeaconInfo, GeneXus.SD"},{value:"GeneXus.SD.BeaconProximityAlert",caption:"BeaconProximityAlert, GeneXus.SD"},{value:"GeneXus.SD.BeaconRegion",caption:"BeaconRegion, GeneXus.SD"},{value:"GeneXus.SD.BeaconState",caption:"BeaconState, GeneXus.SD"},{value:"GeneXus.SD.CardInformation",caption:"CardInformation, GeneXus.SD"},{value:"GeneXus.Common.Notifications.Configuration",caption:"Configuration, GeneXus.Common.Notifications"},{value:"GeneXus.Common.Notifications.ConfigurationProperty",caption:"ConfigurationProperty, GeneXus.Common.Notifications"}]},{value:"External Objects",caption:"External Objects",expandable:true,startImgSrc:"./assets/icons/external-object.svg",items:[{value:"GeneXus.SD.Actions",caption:"Actions, GeneXus.SD",startImgSrc:"./assets/icons/external-object.svg",endImgSrc:"./assets/icons/external-object.svg"},{value:"GeneXus.SD.Ads",caption:"Ads, GeneXus.SD",startImgSrc:"./assets/icons/external-object.svg",endImgSrc:"./assets/icons/external-object.svg"},{value:"GeneXus.Common.Analytics",caption:"Analytics, GeneXus.Common",startImgSrc:"./assets/icons/external-object.svg",endImgSrc:"./assets/icons/external-object.svg"},{value:"GeneXus.Common.AnyObject",caption:"AnyObject, GeneXus.Common",startImgSrc:"./assets/icons/external-object.svg",endImgSrc:"./assets/icons/external-object.svg"},{value:"GeneXus.Common.UI.Appearance",caption:"Appearance, GeneXus.Common.UI",startImgSrc:"./assets/icons/external-object.svg",endImgSrc:"./assets/icons/external-object.svg"}]}];const w=(e,t,a)=>a?e.includes(t):e.toLowerCase().includes(t.toLowerCase());const x=(e,t,a)=>a?.regularExpression?e.match(t)!==null:w(e,t,a?.matchCase);const k={caption:(e,t)=>t.filter?x(e.caption??"",t.filter,t.filterOptions):true,value:(e,t)=>t.filter?x(e.value,t.filter,t.filterOptions):true,none:()=>true};const L=(e,t,a)=>a.filterOptions?.hideMatchesAndShowNonMatches===true?!k[e](t,a):k[e](t,a);const O=(e,t,a,o)=>{let n=false;const i=e.items;const s=[];if(i!=null){for(let e=0;e<i.length;e++){const o=i[e];const l=O(o,t,a,s);n||=l}}const l=n||L(t,e,a);if(l){o.push({...e,items:n?s:undefined})}return l};const z=(e,t)=>{const a=[];for(let o=0;o<C.length;o++){const n=C[o];O(n,e,t,a)}return a};const A={};let _=[];const D=e=>{if(A.filterOptions.alreadyProcessed!==true){return}_=z(A.filterType,{filter:e.detail,filterOptions:A.filterOptions});console.log(A.model);const a=e.target.closest("ch-showcase");if(a){t(a)}};const E=()=>e("div",{class:"checkbox-test-main-wrapper"},e("fieldset",null,e("legend",{class:"heading-4 field-legend-test"},"No label"),e("ch-combo-box",{accessibleName:A.accessibleName,placeholder:A.placeholder,class:"combo-box",disabled:A.disabled,destroyItemsOnClose:A.destroyItemsOnClose,filter:A.filter,filterDebounce:A.filterDebounce,filterOptions:A.filterOptions,filterType:A.filterType,model:A.filterOptions.alreadyProcessed===true&&A.filterType!=="none"?_:A.model,readonly:A.readonly,value:A.value,onFilterChange:D})),e("fieldset",null,e("legend",{class:"heading-4 field-legend-test"},"Label with HTML for"),e("label",{class:"form-input__label",htmlFor:"checkbox-2"},"Label for combo-box 2"),e("ch-combo-box",{id:"checkbox-2",accessibleName:A.accessibleName,placeholder:A.placeholder,class:"combo-box",disabled:A.disabled,destroyItemsOnClose:A.destroyItemsOnClose,model:A.filterOptions.alreadyProcessed===true&&A.filterType!=="none"?_:A.model,readonly:A.readonly,value:A.value})),e("fieldset",null,e("legend",{class:"heading-4 field-legend-test"},"Component inside label"),e("label",{class:"form-input__label",htmlFor:"checkbox-3"},"Label for combo-box 3",e("ch-combo-box",{id:"checkbox-3",accessibleName:A.accessibleName,placeholder:A.placeholder,class:"combo-box",disabled:A.disabled,destroyItemsOnClose:A.destroyItemsOnClose,model:A.filterOptions.alreadyProcessed===true&&A.filterType!=="none"?_:A.model,readonly:A.readonly,value:A.value}))));const G=[{caption:"Models",properties:[{id:"model",accessibleName:"Model",type:"enum",values:[{caption:"Simple Model",value:S},{caption:"Small Model",value:I},{caption:"Data Type Model in GeneXus",value:C}],value:S}]},{caption:"Properties",properties:[{id:"accessibleName",caption:"Accessible Name",value:"Option",type:"string"},{id:"placeholder",caption:"Placeholder",value:"Option",type:"string"},{id:"destroyItemsOnClose",caption:"Destroy Items On Close",value:false,type:"boolean"},{id:"disabled",caption:"Disabled",value:false,type:"boolean"},{id:"readonly",caption:"Readonly",value:false,type:"boolean"}]},{caption:"Filters",columns:2,properties:[{id:"filterType",caption:"Filter Type",value:"none",type:"enum",values:[{caption:"None",value:"none"},{caption:"Caption",value:"caption"},{caption:"Value",value:"value"},{caption:"List",value:"list"}]},{id:"filterDebounce",caption:"Filter Debounce",value:250,type:"number"},{id:"filter",columnSpan:2,caption:"Filter",value:"",type:"string"},{id:"filterOptions",type:"object",render:"independent-properties",properties:[{id:"alreadyProcessed",columnSpan:2,caption:"Items are already filtered / Server filters",value:false,type:"boolean"},{id:"matchCase",columnSpan:2,caption:"Apply camel casing",value:false,type:"boolean"},{id:"hideMatchesAndShowNonMatches",columnSpan:2,caption:"Hide matches and show non-matches",value:false,type:"boolean"}]}]}];const T={properties:G,render:E,state:A};const N="background";const B="background";const V="showcase/pages/assets/icons/";const M=[{id:"item-1",startImgSrc:`${V}patterns.svg"`,startImgType:N,endImgSrc:`${V}knowledge-base.svg`,endImgType:B,items:[{id:"item-2-2",startImgSrc:`${V}patterns.svg"`,startImgType:N,items:[],link:{url:"https://www.google.com.uy"},caption:"Google",showSeparator:false},{id:"item-1-3",startImgSrc:`${V}file.svg`,startImgType:N,items:[],caption:"Item 1-3",showSeparator:false}],caption:"Item 1",showSeparator:false},{id:"item-2",startImgSrc:`${V}patterns.svg"`,startImgType:N,items:[],link:{url:"https://www.google.com.uy"},caption:"Google",showSeparator:false},{id:"item-3",startImgSrc:`${V}file.svg`,startImgType:N,items:[{id:"item-3-1",startImgSrc:`${V}patterns.svg"`,startImgType:N,endImgSrc:`${V}knowledge-base.svg`,endImgType:B,items:[{id:"item-3-1-1",startImgSrc:`${V}patterns.svg"`,startImgType:N,endImgSrc:`${V}knowledge-base.svg`,endImgType:B,items:[],caption:"Item 3-1-1",showSeparator:false},{id:"item-3-1-2",startImgSrc:`${V}patterns.svg"`,startImgType:N,items:[],link:{url:"https://www.google.com.uy"},caption:"Google",showSeparator:false},{id:"item-3-1-3",startImgSrc:`${V}file.svg`,startImgType:N,items:[],caption:"Item 3-1-3",showSeparator:false}],caption:"Item 1-1",showSeparator:false},{id:"item-3-2",startImgSrc:`${V}patterns.svg"`,startImgType:N,items:[],link:{url:"https://www.google.com.uy"},caption:"Google",showSeparator:false},{id:"item-3-3",startImgSrc:`${V}file.svg`,startImgType:N,items:[],caption:"Item 3-3",showSeparator:false}],itemsPosition:"OutsideStart_InsideStart",caption:"Item 3",showSeparator:false}];const $=[{id:"item-1",startImgSrc:`${V}patterns.svg"`,startImgType:N,endImgSrc:`${V}knowledge-base.svg`,endImgType:B,link:{url:"https://github.com"},caption:"GitHub",showSeparator:false},{id:"item-2",startImgSrc:`${V}patterns.svg"`,startImgType:N,items:[{id:"item-2-1",startImgSrc:`${V}patterns.svg"`,startImgType:N,endImgSrc:`${V}knowledge-base.svg`,endImgType:B,items:[],caption:"Item 1-1",showSeparator:false},{id:"item-2-2",startImgSrc:`${V}patterns.svg"`,startImgType:N,items:[],link:{url:"https://www.google.com.uy"},caption:"Google",showSeparator:false},{id:"item-2-3",startImgSrc:`${V}file.svg`,startImgType:N,items:[],caption:"Item 3-3",showSeparator:false}],itemsPosition:"InsideStart_OutsideEnd",caption:"More Actionsssssss",showSeparator:false},{id:"item-3",startImgSrc:`${V}file.svg`,startImgType:N,link:{url:"https://www.google.com.uy"},caption:"Googleeeeeeee",showSeparator:true},{id:"item-4",startImgSrc:`${V}file.svg`,startImgType:N,link:{url:"https://www.google.com.uy"},caption:"Google",showSeparator:false}];const P=10;const X=10;const F=50;const j=[];for(let e=0;e<P;e++){const t=[];const a="item-"+e;for(let e=0;e<X;e++){const o=a+"-"+e;const n=[];for(let e=0;e<F;e++){const t=o+"-"+e;n.push({id:t,startImgSrc:`${V}patterns.svg"`,startImgType:N,endImgSrc:`${V}knowledge-base.svg`,endImgType:B,link:"",caption:t,showSeparator:false})}t.push({id:o,startImgSrc:`${V}patterns.svg"`,startImgType:N,endImgSrc:`${V}knowledge-base.svg`,endImgType:B,items:n,link:"",caption:o,showSeparator:e%4===0})}j.push({startImgSrc:`${V}patterns.svg"`,startImgType:N,endImgSrc:`${V}knowledge-base.svg`,endImgType:B,items:t,link:"",caption:a,showSeparator:e%3===0})}const R=[{caption:"File",itemsPosition:"InsideStart_OutsideEnd",items:[{caption:"New",items:[{caption:"New Knowledge Base",startImgSrc:`${V}knowledge-base.svg`},{caption:"New Object",shortcut:"Ctrl+Alt+N",showSeparator:true},{caption:"Knowledge Base from GeneXus Server"}]},{caption:"Open Object",shortcut:"Ctrl+O",showSeparator:true},{caption:"Close",shortcut:"Ctrl+Alt+W"},{caption:"Close Knowledge Base",showSeparator:true},{caption:"Save",shortcut:"Ctrl+S",startImgSrc:`${V}save.svg`},{caption:"Save All",shortcut:"Ctrl+Shift+S",startImgSrc:`${V}save-all.svg`}]},{caption:"View",itemsPosition:"InsideStart_OutsideEnd",items:[{caption:"Domains"},{caption:"Launchpad"},{caption:"Start Page",showSeparator:true},{caption:"Last Impact"},{caption:"Last Navigation"}]},{caption:"Knowledge Manager",itemsPosition:"InsideStart_OutsideEnd",items:[{caption:"Export"},{caption:"Import"},{caption:"Team Development"}]},{caption:"Selection",itemsPosition:"InsideStart_OutsideEnd",items:[{caption:"Select All",shortcut:"Ctrl+A"},{caption:"Expand Selection",shortcut:"Alt+Shift+Right"},{caption:"Shrink Selection",shortcut:"Alt+Shift+Left",showSeparator:true},{caption:"Copy Line Up",shortcut:"Alt+Shift+Up"},{caption:"Copy Line Up",shortcut:"Alt+Shift+Down"},{caption:"Move Line Up",shortcut:"Alt+Up"},{caption:"Move Line Down",shortcut:"Alt+Down"},{caption:"Duplicate Selection",showSeparator:true},{caption:"Add Cursor Above",shortcut:"Ctrl+Alt+Up"},{caption:"Add Cursor Below",shortcut:"Ctrl+Alt+Down"},{caption:"Add Cursors to Line Ends",shortcut:"Alt+Shift+I"},{caption:"Add Next Occurrence",shortcut:"Ctrl+D"},{caption:"Add Previous Occurrence"},{caption:"Select All Occurrences",shortcut:"Ctrl+Shift+L"}]},{caption:"Build",itemsPosition:"InsideStart_OutsideEnd",items:[{caption:"Build All"},{caption:"Rebuild All",showSeparator:true},{caption:"Run",shortcut:"F5"},{caption:"Run Without Building",showSeparator:true},{caption:"Create Database Tables"},{caption:"Impact Database Tables",showSeparator:true},{caption:"Cancel Build",showSeparator:true},{caption:"Show Live Inspector"},{caption:"Toggle Live Editing"}]},{caption:"Tools",itemsPosition:"InsideStart_OutsideEnd",items:[{caption:"Sketch Import"}]}];const H={};const U=()=>e("div",{class:"dropdown-test-main-wrapper"},e("fieldset",null,e("legend",{class:"form-input__label field-legend-test"},"Primary"),e("ch-dropdown-render",{cssClass:"dropdown-primary",buttonAccessibleName:H.buttonAccessibleName,position:H.position,model:H.model},e("div",{slot:"action"},"Action"))),e("fieldset",null,e("legend",{class:"form-input__label field-legend-test"},"Secondary"),e("ch-dropdown-render",{cssClass:"dropdown-secondary",buttonAccessibleName:H.buttonAccessibleName,position:H.position,model:H.model},e("div",{slot:"action"},"John Doe"))));const K=[{caption:"Models",properties:[{id:"model",accessibleName:"Model",type:"enum",values:[{caption:"Simple model 1",value:M},{caption:"Simple model 2",value:$},{caption:"GX Web Model",value:R},{caption:"Eager Large Tree (10x20x20)",value:j}],value:M}]},{caption:"Properties",properties:[{id:"buttonAccessibleName",caption:"Button Accessible Name",value:"Action",type:"string"},{id:"position",caption:"Position",value:"Center_OutsideEnd",type:"enum",values:[{value:"OutsideStart_OutsideStart",caption:"OutsideStart_OutsideStart"},{value:"InsideStart_OutsideStart",caption:"InsideStart_OutsideStart"},{value:"Center_OutsideStart",caption:"Center_OutsideStart"},{value:"InsideEnd_OutsideStart",caption:"InsideEnd_OutsideStart"},{value:"OutsideEnd_OutsideStart",caption:"OutsideEnd_OutsideStart"},{value:"OutsideStart_InsideStart",caption:"OutsideStart_InsideStart"},{value:"OutsideEnd_InsideStart",caption:"OutsideEnd_InsideStart"},{value:"OutsideStart_Center",caption:"OutsideStart_Center"},{value:"OutsideEnd_Center",caption:"OutsideEnd_Center"},{value:"OutsideStart_InsideEnd",caption:"OutsideStart_InsideEnd"},{value:"OutsideEnd_InsideEnd",caption:"OutsideEnd_InsideEnd"},{value:"OutsideStart_OutsideEnd",caption:"OutsideStart_OutsideEnd"},{value:"InsideStart_OutsideEnd",caption:"InsideStart_OutsideEnd"},{value:"Center_OutsideEnd",caption:"Center_OutsideEnd"},{value:"InsideEnd_OutsideEnd",caption:"InsideEnd_OutsideEnd"},{value:"OutsideEnd_OutsideEnd",caption:"OutsideEnd_OutsideEnd"}]}]}];const q={properties:K,render:U,state:H};const W={id:"root",direction:"columns",items:[{id:"start-component",size:"3fr"},{id:"end-end-component",size:"2fr"},{id:"center-component",size:"200px"},{id:"end-component",size:"180px"}]};const Q={id:"root",direction:"rows",items:[{id:"sub-group-1",size:"1fr",minSize:"100px",direction:"columns",items:[{id:"start-component",size:"100px",minSize:"200px",dragBar:{hidden:true}},{id:"center-component",size:"1fr",minSize:"250px"},{id:"end-component",size:"270px",minSize:"400px"}]},{id:"end-end-component",size:"250px",minSize:"249px"},{id:"center-2-component",size:"250px",minSize:"251px"}]};const J={id:"root",direction:"columns",items:[{id:"start-component",size:"300px"},{id:"sub-group-1",size:"1fr",direction:"rows",items:[{id:"center-component",size:"1fr"},{id:"end-end-component",size:"300px"}]},{id:"end-component",size:"270px"}]};const Z={id:"root",direction:"columns",items:[{id:"start-component",size:"300px"},{id:"sub-group-1",size:"1fr",direction:"rows",items:[{id:"sub-group-1-1",size:"1fr",direction:"columns",items:[{id:"center-component",size:"1fr"},{id:"center-2-component",size:"1fr"}]},{id:"end-end-component",size:"300px"}]},{id:"end-component",size:"270px"}]};const Y={id:"root",direction:"columns",items:[{id:"start-component",size:"3fr"},{id:"center-2-component",size:"100px"},{id:"end-end-component",size:"2fr"},{id:"center-component",size:"200px"},{id:"end-component",size:"180px"}]};const ee={id:"root",direction:"columns",items:[{id:"start-component",size:"3fr"},{id:"end-end-component",size:"2fr"},{id:"center-2-component",size:"1fr"},{id:"center-component",size:"0.5fr"},{id:"end-component",size:"180px"}]};const te={id:"root",direction:"columns",items:[{id:"start-component",size:"300px",dragBar:{size:1}},{id:"sub-group-1",dragBar:{size:1},size:"1fr",direction:"rows",items:[{id:"sub-group-1-1",dragBar:{size:1},size:"1fr",direction:"columns",items:[{id:"center-component",size:"1fr",dragBar:{size:1}},{id:"center-2-component",size:"1fr"}]},{id:"end-end-component",size:"300px"}]},{id:"end-component",size:"270px"}]};const ae={id:"root",direction:"columns",items:[{id:"start-component",size:"300px",dragBar:{size:5}},{id:"sub-group-1",dragBar:{size:4},size:"1fr",direction:"rows",items:[{id:"sub-group-1-1",dragBar:{size:3},size:"1fr",direction:"columns",items:[{id:"center-component",size:"1fr",dragBar:{size:2}},{id:"center-2-component",size:"1fr"}]},{id:"end-end-component",size:"300px"}]},{id:"end-component",size:"270px"}]};const oe={};const ne=()=>e("ch-layout-splitter",{model:oe.model},e("div",{slot:"start-component",class:"components",style:{"background-color":"var(--colors-foundation-un-color__purple--10)"}},"Start",e("input",{class:"form-input",type:"text"})),e("div",{slot:"end-component",class:"components",style:{"background-color":"var(--colors-foundation-un-color__orange--200)"}},"End",e("input",{class:"form-input",type:"text"})),e("div",{slot:"end-end-component",class:"components",style:{"background-color":"color-mix(in srgb, var(--icons-un-icon__error),transparent 60%)"}},"End End",e("input",{class:"form-input",type:"text"})),e("div",{slot:"center-2-component",class:"components",style:{"background-color":"var(--accents-un-accent__disabled)"}},"Center 2",e("input",{class:"form-input",type:"text"})),e("div",{slot:"center-component",class:"components",style:{"background-color":"var(--un-alert-warning__background-color)"}},"Center",e("input",{class:"form-input",type:"text"})));const ie=[{caption:"Models",properties:[{id:"model",accessibleName:"Model",type:"enum",values:[{caption:"Layout 1",value:W},{caption:"Layout 2",value:Q},{caption:"Layout 3",value:J},{caption:"Layout 4",value:Z},{caption:"Layout 5",value:Y},{caption:"Layout 6",value:ee},{caption:"Layout 7",value:te},{caption:"Layout 8",value:ae}],value:Q}]}];const se={properties:ie,render:ne,state:oe};const le={};const ce=()=>e("ch-qr",{class:"qr",accessibleName:le.accessibleName,background:le.background,errorCorrectionLevel:le.errorCorrectionLevel,fill:le.fill,radius:le.radius,value:le.value,size:le.size});const re=[{caption:"Model",properties:[{id:"value",caption:"Value",value:"https://gx-chameleon.netlify.app",type:"string"},{id:"accessibleName",caption:"Accessible Name",value:"",type:"string"},{id:"errorCorrectionLevel",caption:"Error Correction Level",value:"H",values:[{caption:"L",value:"L"},{caption:"M",value:"M"},{caption:"H",value:"H"},{caption:"Q",value:"Q"}],type:"enum"}]},{caption:"Customization",properties:[{id:"background",caption:"Background",value:"transparent",type:"string"},{id:"fill",caption:"Fill",value:"black",type:"string"},{id:"radius",caption:"Radius",value:0,type:"number"},{id:"size",caption:"Size",value:128,type:"number"}]}];const pe={properties:re,render:ce,state:le};const de="showcase/pages/assets/icons/";const ue=[{id:"item1",name:"Item 1"},{id:"item2",name:"Item 2"},{id:"item3",name:"Item 3"},{id:"item4",name:"Item 4"}];const me=[{id:"item1",name:"Item 1",startImageSrc:`${de}/angular.svg`},{id:"item2",name:"Item 2",startImageSrc:`${de}/api.svg`},{id:"item3",name:"Item 3"},{id:"item4",name:"",startImageSrc:`${de}/dso.svg`}];const ve={};const he=new Set(["item1"]);const ge=e=>{he.add(e.detail.newSelectedId);ve.selectedId=e.detail.newSelectedId;const a=e.target.closest("ch-showcase");if(a){t(a)}};const be=()=>e("div",{class:"tab-test-main-wrapper"},e("fieldset",null,e("legend",{class:"heading-4 field-legend-test"},"Simple pages"),e("ch-list",{class:"tab",accessibleName:ve.accessibleName,closeButtonAccessibleName:ve.closeButtonAccessibleName,closeButtonHidden:ve.closeButtonHidden,direction:ve.direction,dragOutsideDisabled:ve.dragOutsideDisabled,expanded:ve.expanded,model:ve.model,selectedId:ve.selectedId,showCaptions:ve.showCaptions,sortable:ve.sortable,onSelectedItemChange:ge},he.has("item1")&&e("div",{slot:"item1"},"Content of the item 1",e("label",null,"Any text",e("input",{type:"text"}))),he.has("item2")&&e("div",{slot:"item2"},"Content of the item 2"),he.has("item3")&&e("div",{slot:"item3"},"Content of the item 3"),he.has("item4")&&e("div",{slot:"item4"},"Content of the item 4"))),e("fieldset",null,e("legend",{class:"heading-4 field-legend-test"},"Heavy pages"),e("ch-list",{class:"tab",accessibleName:ve.accessibleName,closeButtonAccessibleName:ve.closeButtonAccessibleName,closeButtonHidden:ve.closeButtonHidden,direction:ve.direction,dragOutsideDisabled:ve.dragOutsideDisabled,expanded:ve.expanded,model:ve.model,selectedId:ve.selectedId,showCaptions:ve.showCaptions,sortable:ve.sortable,onSelectedItemChange:ge},he.has("item1")&&e("ch-tree-view-render",{slot:"item1",showLines:"last",model:n,lazyLoadTreeItemsCallback:i}),he.has("item2")&&e("ch-tree-view-render",{slot:"item2",showLines:"last",model:s,lazyLoadTreeItemsCallback:i}),he.has("item3")&&e("div",{slot:"item3"},"Content of the item 3"),he.has("item4")&&e("div",{slot:"item4"},"Content of the item 4"))));const fe=[{caption:"Models",properties:[{id:"model",accessibleName:"Model",type:"enum",values:[{caption:"Simple Model 1",value:ue},{caption:"Simple Model 2",value:me}],value:ue},{id:"selectedId",caption:"Selected Id",value:"item1",type:"string"}]},{caption:"Properties",properties:[{id:"direction",caption:"Direction",value:"block",values:[{caption:"Block",value:"block"},{caption:"Inline",value:"inline"}],render:"radio-group",type:"enum"},{id:"accessibleName",caption:"Accessible Name",value:"",type:"string"},{id:"closeButtonAccessibleName",caption:"Close Button Accessible Name",value:"Close",type:"string"},{id:"closeButtonHidden",caption:"Close Button Hidden",value:true,type:"boolean"},{id:"dragOutsideDisabled",caption:"Drag Outside Disabled",value:false,type:"boolean"},{id:"expanded",caption:"Expanded",value:true,type:"boolean"},{id:"showCaptions",caption:"Show Captions",value:true,type:"boolean"},{id:"sortable",caption:"Sortable",value:false,type:"boolean"}]}];const ye={properties:fe,render:be,state:ve};const Se={};const Ie=()=>e("ch-tree-view-render",{class:"tree-view-secondary",checkbox:Se.checkbox,checked:Se.checked,checkDroppableZoneCallback:l,dragDisabled:Se.dragDisabled,dropDisabled:Se.dropDisabled,dropItemsCallback:c,dropMode:Se.dropMode,editableItems:Se.editableItems,expandOnClick:Se.expandOnClick,expandableButton:Se.expandableButton,filter:Se.filter,filterDebounce:Se.filterDebounce,filterList:Se.filterList,filterOptions:Se.filterOptions,filterType:Se.filterType,getImagePathCallback:Se.getImagePathCallback,lazyLoadTreeItemsCallback:i,model:Se.model,modifyItemCaptionCallback:Se.modifyItemCaptionCallback,multiSelection:Se.multiSelection,showLines:Se.showLines,sortItemsCallback:Se.sortItemsCallback,toggleCheckboxes:Se.toggleCheckboxes});const Ce=[{caption:"Models",properties:[{id:"model",accessibleName:"Model",type:"enum",values:[{caption:"KB Explorer",value:n},{caption:"Import Objects",value:r},{caption:"File System",value:p},{caption:"Disabled items",value:d},{caption:"Simple model 1",value:u},{caption:"Simple model 2",value:m},{caption:"Lazy Large Tree (10x20x20)",value:v},{caption:"Eager Large Tree (10x20x20)",value:h}],value:n}]},{caption:"Properties",columns:2,properties:[{id:"checkbox",caption:"Checkbox",value:false,type:"boolean"},{id:"checked",caption:"Checked",value:false,type:"boolean"},{id:"dragDisabled",caption:"Drag Disabled",value:false,type:"boolean"},{id:"dropDisabled",caption:"Drop Disabled",value:false,type:"boolean"},{id:"editableItems",caption:"Editable Items",value:true,type:"boolean"},{id:"multiSelection",caption:"Multi Selection",value:true,type:"boolean"},{id:"toggleCheckboxes",columnSpan:2,caption:"Toggle Checkboxes",value:false,type:"boolean"},{id:"expandableButton",caption:"Expandable Button",value:"decorative",type:"enum",values:[{caption:"Action",value:"action"},{caption:"Decorative",value:"decorative"},{caption:"No",value:"no"}]},{id:"dropMode",caption:"Drop Mode",value:"above",type:"enum",values:[{caption:"Above",value:"above"},{caption:"Before and After",value:"before-and-after"},{caption:"All",value:"all"}]},{id:"showLines",columnSpan:2,caption:"Lines",value:"all",render:"radio-group",type:"enum",values:[{caption:"All",value:"all"},{caption:"Last",value:"last"},{caption:"None",value:"none"}]}]},{caption:"Filters",columns:2,properties:[{id:"filterType",caption:"Filter Type",value:"none",type:"enum",values:[{caption:"None",value:"none"},{caption:"Caption",value:"caption"},{caption:"Metadata",value:"metadata"},{caption:"Checked",value:"checked"},{caption:"Unchecked",value:"unchecked"},{caption:"List",value:"list"}]},{id:"filterDebounce",caption:"Filter Debounce",value:250,type:"number"},{id:"filter",columnSpan:2,caption:"Filter",value:"",type:"string"}]}];const we={properties:Ce,render:Ie,state:Se};const xe={checkbox:y,"combo-box":T,dropdown:q,"layout-splitter":se,qr:pe,tab:ye,"tree-view-in-development":we};const ke="ch-showcase{display:grid;grid-template-rows:-webkit-max-content 1fr;grid-template-rows:max-content 1fr;margin:var(--spacing-un-spacing--l);gap:var(--spacing-un-spacing--l)}ch-showcase>iframe{display:grid;block-size:100%;inline-size:100%}";const Le=ke;const Oe="main";const ze="configuration";const Ae={id:"root",direction:"columns",items:[{id:Oe,size:"1fr",minSize:"220px",type:"single-content",widget:{id:Oe,name:null}},{id:ze,size:"320px",minSize:"250px",type:"single-content",widget:{id:ze,name:null}}]};const _e={boolean:"checkbox",enum:"combo-box",number:"input-number",string:"input",object:"independent-properties"};const De=class{constructor(e){a(this,e);this.componentName=undefined;this.pageName=undefined;this.pageSrc=undefined;this.status=undefined;this.theme=undefined}#e;#t;#a;#o;#n;#i;#s={boolean:(e,a)=>{const o=this.#e.state;const n=this.#l(e,a);o[n]=e.value;if(e.render==="switch");else{this.#t??=new Map;this.#t.set(n,(()=>{const i=o[n];o[n]=!i;if(a){const t=o[a.id];o[a.id]={...t,[e.id]:!i}}t(this)}))}},enum:(e,a)=>{const o=this.#e.state;const n=this.#l(e,a);o[n]=e.value;const i=i=>{o[n]=i.detail;if(a){const t=o[a.id];o[a.id]={...t,[e.id]:i.detail}}t(this)};if(e.render==="radio-group"){this.#i??=new Map;this.#i.set(n,{handler:i,model:e.values})}else{this.#a??=new Map;this.#a.set(n,{handler:i,model:e.values})}},number:(e,a)=>{const o=this.#e.state;const n=this.#l(e,a);o[n]=e.value;this.#n??=new Map;this.#n.set(n,(i=>{const s=i.target.value;o[n]=s;if(a){const t=o[a.id];o[a.id]={...t,[e.id]:s}}t(this)}))},object:e=>{const t=this.#e.state;t[e.id]={}},string:(e,a)=>{const o=this.#e.state;const n=this.#l(e,a);o[n]=e.value;this.#o??=new Map;if(e.render==="textarea");else{this.#o.set(n,(i=>{const s=i.target.value;o[n]=s;if(a){const t=o[a.id];o[a.id]={...t,[e.id]:s}}t(this)}))}}};#l=(e,t)=>t?`${t.id}_${e.id}`:e.id;#c={[Oe]:()=>e("div",{key:Oe,slot:Oe,class:"card"},this.#e.render()),[ze]:()=>e("div",{key:ze,slot:ze,class:"card card-properties"},this.#e.properties.map(this.#r))};#p;#d;componentNameChange(e){this.#u(e)}themeChange(e){if(this.#e){return}this.#p.contentWindow.postMessage(e,`${window.location.origin}/${this.pageSrc}`)}#u=e=>{this.#t=undefined;this.#a=undefined;this.#o=undefined;this.#n=undefined;this.#i=undefined;this.#e=e?xe[e]:undefined;if(this.#e){const e=this.#e.properties;e.forEach((e=>{e.properties.forEach((e=>this.#m(e)))}))}};#m=(e,t)=>{if(e.type==="object"){this.#s[e.type](e);e.properties.forEach((t=>this.#m(t,e)))}else{this.#s[e.type](e,t)}};#v=()=>e("ch-flexible-layout-render",{model:Ae,renders:this.#c,ref:e=>this.#d=e});#r=(t,a)=>[a!==0&&e("hr",null),e("fieldset",{style:t.columns?{"grid-template-columns":`repeat(${t.columns}, 1fr)`}:null},e("legend",{class:"heading-4"},t.caption),this.#h(t.properties))];#h=(e,t)=>e.map((e=>this.#g[e.render??_e[e.type]](e,t)));#b=(t,a)=>e("div",{class:"form-field",style:t.columnSpan?{"grid-column":`1 / ${t.columnSpan+1}`}:null},a);#g={checkbox:(t,a)=>e("ch-checkbox",{accessibleName:t.accessibleName,caption:t.caption,class:"checkbox",style:t.columnSpan?{"grid-column":`1 / ${t.columnSpan+1}`}:null,checkedValue:"true",unCheckedValue:"false",value:t.value.toString(),onInput:this.#t.get(this.#l(t,a))}),"combo-box":(t,a)=>{const o=this.#l(t,a);return this.#b(t,[t.caption&&e("label",{class:"form-input__label",htmlFor:o},t.caption),e("ch-combo-box",{id:o,accessibleName:t.accessibleName,class:"combo-box",model:this.#a.get(o).model,value:t.value.toString(),onInput:this.#a.get(o).handler})])},input:(t,a)=>{const o=this.#l(t,a);return this.#b(t,[t.caption&&e("label",{class:"form-input__label",htmlFor:o},t.caption),e("input",{id:o,"aria-label":t.accessibleName??null,class:"form-input",type:"text",value:t.value.toString(),onInput:this.#o.get(o)})])},"input-number":(t,a)=>{const o=this.#l(t,a);return this.#b(t,[t.caption&&e("label",{class:"form-input__label",htmlFor:o},t.caption),e("input",{id:o,"aria-label":t.accessibleName??null,class:"form-input",type:"number",value:t.value.toString(),onInput:this.#n.get(o)})])},"independent-properties":e=>this.#h(e.properties,e),"radio-group":(t,a)=>{const o=this.#l(t,a);return this.#b(t,[t.caption&&e("label",{class:"form-input__label",htmlFor:o},t.caption),e("ch-radio-group-render",{id:o,"aria-label":t.accessibleName??null,class:"radio-group",model:this.#i.get(o).model,value:t.value.toString(),onChange:this.#i.get(o).handler})])}};#f=()=>e("iframe",{src:this.pageSrc,frameborder:"0",ref:e=>this.#p=e});connectedCallback(){this.#u(this.componentName)}componentDidUpdate(){if(this.#d){t(this.#d)}}render(){if(!this.pageSrc||!this.componentName){return""}return e(o,null,e("h1",{class:"heading-1"},this.pageName," ",this.status),this.#e?this.#v():this.#f())}static get watchers(){return{componentName:["componentNameChange"],theme:["themeChange"]}}};De.style=Le;export{De as ch_showcase};
//# sourceMappingURL=p-af4143d9.entry.js.map