import{r as t,c as e,h as s,H as i,g as a}from"./p-7af91c05.js";const h="@layer ch-grid {\n  ch-grid-action-refresh[disabled] {\n    pointer-events: none;\n  }\n}";const n=h;const r=class{constructor(s){t(this,s);this.refreshClicked=e(this,"refreshClicked",7);this.disabled=undefined}refreshClicked;pressedHandler(t){if(!t.key||t.key==="Enter"||t.key===" "){this.refreshClicked.emit();t.stopPropagation()}}render(){return s(i,{key:"8043bb2303e7076f25b103b3ae85aff2d22043fe",role:"button",tabindex:"0",disabled:this.disabled})}};r.style=n;const c="@layer ch-grid {\n  ch-grid-action-settings[disabled] {\n    pointer-events: none;\n  }\n}";const l=c;const d=class{constructor(s){t(this,s);this.settingsShowClicked=e(this,"settingsShowClicked",7);this.disabled=undefined}settingsShowClicked;pressedHandler(t){if(!t.key||t.key==="Enter"||t.key===" "){this.settingsShowClicked.emit();t.stopPropagation()}}render(){return s(i,{key:"8a2772c5ba5e4a2a4169376b0e5089420041dd45",role:"button",tabindex:"0",disabled:this.disabled})}};d.style=l;const o="";const u=o;const f=class{constructor(e){t(this,e)}get el(){return a(this)}};f.style=u;const g=":host{display:-ms-flexbox;display:flex}";const p=g;const b=class{constructor(s){t(this,s);this.activePageChanged=e(this,"activePageChanged",7);this.pageNavigationRequested=e(this,"pageNavigationRequested",7);this.activePage=1;this.totalPages=1;this.hasNextPage=false}elPages;elFirst;elPrevious;elNext;elLast;get el(){return a(this)}activePageHandler(){this.activePageChanged.emit({activePage:this.activePage})}activePageChanged;pageNavigationRequested;componentWillLoad(){this.loadElements()}navigateClickedHandler(t){t.stopPropagation();this.navigate(t.detail.type)}pageChangedHandler(t){t.stopPropagation();this.navigate("goto",t.detail.page)}keyDownHandler(t){switch(t.key){case"Home":this.navigate("first");break;case"PageUp":this.navigate("previous");break;case"PageDown":this.navigate("next");break;case"End":this.navigate("last");break}}navigate(t,e){const s=!e||e!==this.activePage;switch(t){case"first":this.first();this.elFirst?.focus();break;case"previous":this.previous();this.elPrevious?.focus();break;case"next":this.next();this.elNext?.focus();break;case"last":this.last();this.elLast?.focus();break;case"goto":this.goto(e);break}if(s){this.pageNavigationRequested.emit({type:t,page:e})}}first(){this.activePage=1}previous(){this.activePage=Math.max(this.activePage-1,1)}next(){this.activePage=this.totalPages<0?this.activePage+1:Math.min(this.activePage+1,this.totalPages)}last(){this.activePage=this.totalPages}goto(t){this.activePage=Math.max(Math.min(t,this.totalPages),1)}loadElements(){this.elPages=this.el.querySelector("ch-paginator-pages");this.el.querySelectorAll("ch-paginator-navigate").forEach((t=>{switch(t.type){case"first":this.elFirst=t;break;case"previous":this.elPrevious=t;break;case"next":this.elNext=t;break;case"last":this.elLast=t;break}}))}render(){if(this.elPages){this.elPages.totalPages=this.totalPages;this.elPages.page=this.activePage}if(this.elFirst){this.elFirst.disabled=this.activePage===1}if(this.elPrevious){this.elPrevious.disabled=this.activePage===1}if(this.elNext){this.elNext.disabled=this.activePage===this.totalPages||this.totalPages<0&&!this.hasNextPage}if(this.elLast){this.elLast.disabled=this.activePage===this.totalPages||this.totalPages<0&&!this.hasNextPage}}static get watchers(){return{activePage:["activePageHandler"]}}};b.style=p;const k="ch-paginator-navigate[disabled]{pointer-events:none}";const v=k;const m=class{constructor(s){t(this,s);this.navigateClicked=e(this,"navigateClicked",7);this.type=undefined;this.disabled=undefined}navigateClicked;pressedHandler(t){if(!t.key||t.key==="Enter"||t.key===" "){this.navigateClicked.emit({type:this.type});t.stopPropagation()}}render(){return s(i,{key:"de804083d50f2aaed503cc8b5ed50ba1a3f799f9",role:"button",tabindex:"0",disabled:this.disabled})}};m.style=v;const x="button{all:unset}.pages{display:-ms-flexbox;display:flex;-ms-flex-align:center;align-items:center;list-style-type:none;margin:0;padding:0}";const y=x;const C=class{constructor(s){t(this,s);this.pageChanged=e(this,"pageChanged",7);this.page=1;this.totalPages=1;this.maxSize=9;this.renderFirstLastPages=true;this.textDots="..."}buttonActive;get el(){return a(this)}pageHandler(){this.pageChanged.emit({page:this.page})}maxSizeHandler(){this.validateMaxSize()}renderFirstLastPagesHandler(){this.validateMaxSize()}pageChanged;componentDidUpdate(){if(document.activeElement===this.el){this.buttonActive.focus()}}keyDownHandler(t){switch(t.key){case"ArrowLeft":this.page=Math.max(this.page-1,1);break;case"ArrowRight":this.page=Math.min(this.page+1,this.totalPages);break}}focusHandler(){this.buttonActive.focus()}clickHandler=t=>{const e=t.target;this.page=parseInt(e.value)};getItems(){const t=Math.ceil((this.maxSize-1)/2);const e=Math.floor((this.maxSize-1)/2);let s,i;let a,h;if(this.maxSize===0||this.maxSize>=this.totalPages){i=this.fillStart(false);s=this.page-1;a=this.totalPages-this.page;h=this.fillEnd(false)}else if(this.page<=t&&this.page<this.totalPages-e){i=this.fillStart(false);s=this.page-1;h=this.fillEnd(true);a=e-h.length+(t-s)}else if(this.page>t&&this.page<this.totalPages-e){i=this.fillStart(true);s=t-i.length;h=this.fillEnd(true);a=e-h.length}else if(this.page>t&&this.page>=this.totalPages-e){h=this.fillEnd(false);a=this.totalPages-this.page;i=this.fillStart(true);s=t-i.length+e-a}const n=i.concat(this.getRangeItems(this.page-s,this.page-1)).concat([this.page]).concat(this.getRangeItems(this.page+1,this.page+a)).concat(h);return{items:n,activeIndex:i.length+s}}fillStart(t){if(t){return this.renderFirstLastPages?[1,this.textDots]:[this.textDots]}return[]}fillEnd(t){if(t){return this.renderFirstLastPages?[this.textDots,this.totalPages]:[this.textDots]}return[]}getRangeItems(t,e){return Array.from({length:e-t+1},((e,s)=>t+s))}validateMaxSize(){if(this.maxSize>0){if(!this.renderFirstLastPages&&this.maxSize<3){this.maxSize=3}else if(this.renderFirstLastPages&&this.maxSize<5){this.maxSize=5}}}render(){const{items:t,activeIndex:e}=this.getItems();return s("ol",{key:"32c76fb8d13de418f768de418bcd9cedf515f529",part:"pages",class:"pages"},t.map(((t,i)=>{if(typeof t==="number"){return s("li",null,s("button",{part:`page button ${i===e?"active":""}`,value:t,onClick:this.clickHandler,ref:t=>this.buttonActive=i===e?t:this.buttonActive},t))}return s("li",null,s("button",{part:"page button dots",disabled:true},t))})))}static get watchers(){return{page:["pageHandler"],maxSize:["maxSizeHandler"],renderFirstLastPages:["renderFirstLastPagesHandler"]}}};C.style=y;var H;(function(t){t[t["EDIT"]=1]="EDIT";t[t["RADIO"]=4]="RADIO";t[t["COMBO"]=5]="COMBO";t[t["CHECK"]=7]="CHECK"})(H||(H={}));var w;(function(t){t[t["NUMBER"]=0]="NUMBER";t[t["CHAR"]=1]="CHAR";t[t["DATE"]=2]="DATE";t[t["DATETIME"]=3]="DATETIME";t[t["VARCHAR"]=5]="VARCHAR";t[t["LONGVARCHAR"]=6]="LONGVARCHAR";t[t["BOOLEAN"]=7]="BOOLEAN"})(w||(w={}));const _="";const E=_;const A=class{constructor(s){t(this,s);this.columnSettingsChanged=e(this,"columnSettingsChanged",7);this.column=undefined;this.buttonApplyText=undefined;this.buttonResetText=undefined;this.equal=undefined;this.less=undefined;this.greater=undefined}filterEnum=[];inputEqual;inputLess;inputGreater;get el(){return a(this)}columnSettingsChanged;componentWillLoad(){if(Array.isArray(this.column.FilterEnum)&&this.column.FilterEnum.length>0){this.filterEnum=this.column.FilterEnum}}applyClickHandler=()=>{this.equal=this.getControlValue(this.inputEqual);this.less=this.getControlValue(this.inputLess);this.greater=this.getControlValue(this.inputGreater);this.columnSettingsChanged.emit({column:this.column,equal:this.equal,less:this.less,greater:this.greater})};resetClickHandler=()=>{this.equal="";this.less="";this.greater="";this.columnSettingsChanged.emit({column:this.column,equal:this.equal,less:this.less,greater:this.greater})};getControlValue(t){const e=t?.value??"";let s=this.column.gxControl.dataType;if(s===w.DATETIME&&this.column.FilterDateTimeAsDate===-1){s=w.DATE}switch(s){case w.DATE:return gx.date.ctod(e,"Y4MD").toString();case w.DATETIME:return gx.date.ctot(e,"Y4MD").toString();default:return e}}toControlValue(t){let e=this.column.gxControl.dataType;if(!t){return""}if(e===w.DATETIME&&this.column.FilterDateTimeAsDate===-1){e=w.DATE}switch(e){case w.DATE:return this.convertGxDateToISO(gx.date.ctod(t),false);case w.DATETIME:return this.convertGxDateToISO(gx.date.ctot(t),true);default:return t}}convertGxDateToISO(t,e){const s=t=>t.toString().padStart(2,"0");const i=t.Value;if(gx.date.isNullDate(i)){return""}if(e){return`${i.getFullYear()}-${s(i.getMonth()+1)}-${s(i.getDate())}T${s(i.getHours())}:${s(i.getMinutes())}`}return`${i.getFullYear()}-${s(i.getMonth()+1)}-${s(i.getDate())}`}getFilterInputType(t){switch(t){case w.BOOLEAN:return"checkbox";case w.CHAR:case w.VARCHAR:case w.LONGVARCHAR:return"text";case w.DATE:return"date";case w.DATETIME:return"datetime-local";case w.NUMBER:return"number";default:return"text"}}renderColumnFilterControl(t,e,i,a,h,n){const r=t.replace("input","").toLowerCase();if(this.filterEnum.length>0){e=H.COMBO;a=this.filterEnum.map((t=>[t.Value,t.Description]))}if(i===w.DATETIME&&this.column.FilterDateTimeAsDate===-1){i=w.DATE}switch(e){case H.EDIT:case H.CHECK:return s("label",{part:`label ${r}`},h,s("input",{type:this.getFilterInputType(i),value:this.toControlValue(n),ref:e=>this[t]=e,part:`field ${r}`}));case H.COMBO:return s("label",{part:`label ${r}`},h,s("select",{ref:e=>this[t]=e,part:`field ${r}`},a.map((([t,e])=>s("option",{value:t,selected:t===n},e)))))}}render(){return s(i,{key:"482e664a2aa0de33c2cf83495b00e08c561b08ba"},s("fieldset",{key:"a07451805f9f8dd71696827e94332111ae864461",part:"main"},s("caption",{key:"475bc9996ee82b7b839fd895dfbe45d6bfab7cd5",part:"caption"},this.column.FilterCaption),this.column.FilterMode==="single"&&this.renderColumnFilterControl("inputEqual",this.column.gxControl.type,this.column.gxControl.dataType,this.column.gxControl.possibleValues,this.column.FilterLabelEqual,this.equal),this.column.FilterMode==="range"&&this.renderColumnFilterControl("inputGreater",this.column.gxControl.type,this.column.gxControl.dataType,this.column.gxControl.possibleValues,this.column.FilterLabelGreater,this.greater),this.column.FilterMode==="range"&&this.renderColumnFilterControl("inputLess",this.column.gxControl.type,this.column.gxControl.dataType,this.column.gxControl.possibleValues,this.column.FilterLabelLess,this.less)),s("section",{key:"9b8de11ed80b1d919592a7444e7dd390ec1a2c88",part:"footer"},s("button",{key:"c598f2e6d7577331b26714b8c26d1a52e719ebf4",part:"button reset",onClick:this.resetClickHandler},this.buttonResetText),s("button",{key:"b75db53870a0564d99c2f0bdfd433e16b5225b67",part:"button apply",onClick:this.applyClickHandler},this.buttonApplyText)))}};A.style=E;export{r as ch_grid_action_refresh,d as ch_grid_action_settings,f as ch_grid_actionbar,b as ch_paginator,m as ch_paginator_navigate,C as ch_paginator_pages,A as gx_grid_chameleon_column_filter};
//# sourceMappingURL=p-c156d5e1.entry.js.map