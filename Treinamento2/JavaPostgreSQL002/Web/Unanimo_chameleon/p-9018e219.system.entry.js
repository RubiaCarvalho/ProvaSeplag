var __awaiter=this&&this.__awaiter||function(t,i,e,n){function o(t){return t instanceof e?t:new e((function(i){i(t)}))}return new(e||(e=Promise))((function(e,s){function r(t){try{l(n.next(t))}catch(t){s(t)}}function a(t){try{l(n["throw"](t))}catch(t){s(t)}}function l(t){t.done?e(t.value):o(t.value).then(r,a)}l((n=n.apply(t,i||[])).next())}))};var __generator=this&&this.__generator||function(t,i){var e={label:0,sent:function(){if(s[0]&1)throw s[1];return s[1]},trys:[],ops:[]},n,o,s,r;return r={next:a(0),throw:a(1),return:a(2)},typeof Symbol==="function"&&(r[Symbol.iterator]=function(){return this}),r;function a(t){return function(i){return l([t,i])}}function l(a){if(n)throw new TypeError("Generator is already executing.");while(r&&(r=0,a[0]&&(e=0)),e)try{if(n=1,o&&(s=a[0]&2?o["return"]:a[0]?o["throw"]||((s=o["return"])&&s.call(o),0):o.next)&&!(s=s.call(o,a[1])).done)return s;if(o=0,s)a=[a[0]&2,s.value];switch(a[0]){case 0:case 1:s=a;break;case 4:e.label++;return{value:a[1],done:false};case 5:e.label++;o=a[1];a=[0];continue;case 7:a=e.ops.pop();e.trys.pop();continue;default:if(!(s=e.trys,s=s.length>0&&s[s.length-1])&&(a[0]===6||a[0]===2)){e=0;continue}if(a[0]===3&&(!s||a[1]>s[0]&&a[1]<s[3])){e.label=a[1];break}if(a[0]===6&&e.label<s[1]){e.label=s[1];s=a;break}if(s&&e.label<s[2]){e.label=s[2];e.ops.push(a);break}if(s[2])e.ops.pop();e.trys.pop();continue}a=i.call(t,e)}catch(t){a=[6,t];o=0}finally{n=s=0}if(a[0]&5)throw a[1];return{value:a[0]?a[1]:void 0,done:true}}};System.register(["./p-62fc4e49.system.js"],(function(t){"use strict";var i,e,n,o,s;return{setters:[function(t){i=t.r;e=t.c;n=t.g;o=t.h;s=t.H}],execute:function(){var r='/*! normalize.css v8.0.1 | MIT License | github.com/necolas/normalize.css */html{line-height:1.15;-webkit-text-size-adjust:100%;}body{margin:0}main{display:block}h1{font-size:2em;margin:0.67em 0}hr{-webkit-box-sizing:content-box;box-sizing:content-box;height:0;overflow:visible;}pre{font-family:monospace, monospace;font-size:1em;}a{background-color:transparent}abbr[title]{border-bottom:none;text-decoration:underline;-webkit-text-decoration:underline dotted;text-decoration:underline dotted;}b,strong{font-weight:bolder}code,kbd,samp{font-family:monospace, monospace;font-size:1em;}small{font-size:80%}sub,sup{font-size:75%;line-height:0;position:relative;vertical-align:baseline}sub{bottom:-0.25em}sup{top:-0.5em}img{border-style:none}button,input,optgroup,select,textarea{font-family:inherit;font-size:100%;line-height:1.15;margin:0;}button,input{overflow:visible}button,select{text-transform:none}button,[type=button],[type=reset],[type=submit]{-webkit-appearance:button}button::-moz-focus-inner,[type=button]::-moz-focus-inner,[type=reset]::-moz-focus-inner,[type=submit]::-moz-focus-inner{border-style:none;padding:0}button:-moz-focusring,[type=button]:-moz-focusring,[type=reset]:-moz-focusring,[type=submit]:-moz-focusring{outline:1px dotted ButtonText}fieldset{padding:0.35em 0.75em 0.625em}legend{-webkit-box-sizing:border-box;box-sizing:border-box;color:inherit;display:table;max-width:100%;padding:0;white-space:normal;}progress{vertical-align:baseline}textarea{overflow:auto}[type=checkbox],[type=radio]{-webkit-box-sizing:border-box;box-sizing:border-box;padding:0;}[type=number]::-webkit-inner-spin-button,[type=number]::-webkit-outer-spin-button{height:auto}[type=search]{-webkit-appearance:textfield;outline-offset:-2px;}[type=search]::-webkit-search-decoration{-webkit-appearance:none}::-webkit-file-upload-button{-webkit-appearance:button;font:inherit;}details{display:block}summary{display:list-item}template{display:none}[hidden]{display:none}:root{--ui-animaton-speed:0.2s}:host{--text-color:var(--black);--font-family:"Source Sans Pro", sans-serif;--font-weight:normal;--font-size:12px;--guide-color:var(--darkGray);--item-hover-color:var(--lightGray);--item-active-color:var(--silverGray);display:block}:host .text{padding-left:var(--spacing-comp-01)}:host li{list-style:none;font-family:var(--font-family);font-size:var(--font-size);font-weight:var(--font-weight);color:var(--text-color);height:20px;overflow:hidden}:host li.tree-open{height:auto}:host li .li-text{height:100%;padding:0 var(--spacing-comp-02);cursor:pointer;display:-ms-flexbox;display:flex;-ms-flex-align:center;align-items:center;position:relative}:host li .li-text:hover{background-color:var(--item-hover-color)}:host li .li-text:active{background-color:var(--item-active-color)}:host li .li-text:focus{outline:none;-webkit-box-shadow:inset 0px 0px 0px 2px var(--color-primary-active);box-shadow:inset 0px 0px 0px 2px var(--color-primary-active)}:host li .li-text--selected{background-color:var(--item-active-color)}:host li .li-text--selected:hover{background-color:var(--item-hover-color)}:host li .vertical-line{position:absolute;width:1px;height:0;top:21px;left:15px;z-index:1;background-image:-webkit-gradient(linear, left top, left bottom, color-stop(28%, var(--guide-color)), color-stop(0%, rgba(255, 255, 255, 0)));background-image:linear-gradient(var(--guide-color) 28%, rgba(255, 255, 255, 0) 0%);background-position:right;background-size:1px 4px;background-repeat:repeat-y}:host li .horizontal-line{position:absolute;width:16px;height:1px;top:11px;z-index:1;margin-left:-23px;top:10px;background-image:-webkit-gradient(linear, left top, right top, color-stop(33%, var(--guide-color)), color-stop(0%, rgba(255, 255, 255, 0)));background-image:linear-gradient(to right, var(--guide-color) 33%, rgba(255, 255, 255, 0) 0%);background-position:bottom;background-size:3px 1px;background-repeat:repeat-x}:host li .horizontal-line.display-none{display:none}:host li .closed-opened-icons{position:relative;display:-ms-flexbox;display:flex;margin-left:-2px}:host li .toggle-icon{position:relative;z-index:2;padding-left:3px;padding-right:3px;-webkit-transition-property:opacity;transition-property:opacity;-webkit-transition-duration:0.5s;transition-duration:0.5s;-webkit-transition-timing-function:ease;transition-timing-function:ease}:host .checkbox{margin-right:var(--spacing-comp-01)}:host .icon{height:20px;-ms-flex-pack:center;justify-content:center;-ms-flex-align:center;align-items:center;padding-left:2px;padding-right:2px}:host .right-icon{-webkit-margin-start:auto;margin-inline-start:auto;position:relative;top:0;-webkit-transition-property:top;transition-property:top;-webkit-transition-duration:0.5s;transition-duration:0.5s;-webkit-transition-timing-function:ease;transition-timing-function:ease}:host .loading{opacity:1;display:inline;right:11px;top:-20px;position:absolute;z-index:1;-webkit-transition-property:all;transition-property:all;-webkit-transition-duration:0.5s;transition-duration:0.5s;-webkit-transition-timing-function:ease;transition-timing-function:ease;border-radius:50%;width:8px;height:8px;border:0.18rem solid var(--gray-04);border-top-color:var(--gray-01);-webkit-animation:spin 1s infinite linear;animation:spin 1s infinite linear}:host .loading--double{border-style:double;border-width:0.5rem}@-webkit-keyframes spin{0%{-webkit-transform:rotate(0deg);transform:rotate(0deg)}100%{-webkit-transform:rotate(360deg);transform:rotate(360deg)}}@keyframes spin{0%{-webkit-transform:rotate(0deg);transform:rotate(0deg)}100%{-webkit-transform:rotate(360deg);transform:rotate(360deg)}}.label input[disabled]{color:red}:host([disabled]) li .text{color:var(--darkGray)}:host([disabled]) .toggle-icon{pointer-events:none}:host([downloading]){pointer-events:none}:host([downloading]) .right-icon{top:20px}:host([downloading]) .loading{top:3px}:host([downloaded]) .loading,:host([downloaded]) .right-icon{opacity:0}';var a=r;var l;var h=t("ch_tree_item",function(){function t(t){i(this,t);this.liItemClicked=e(this,"liItemClicked",7);this.toggleIconClicked=e(this,"toggleIconClicked",7);this.checkboxClickedEvent=e(this,"checkboxClickedEvent",7);this.checkbox=false;this.checked=false;this.download=false;this.downloading=false;this.downloaded=false;this.leftIcon=undefined;this.rightIcon=undefined;this.opened=false;this.selected=false;this.isLeaf=undefined;this.hasChildTree=false;this.firstTreeItem=false;this.indeterminate=undefined;this.disabled=false;this.numberOfParentTrees=1;this.itemPaddingLeft=undefined;this.horizontalLinePaddingLeft=0;this.lastTreeItem=false;this.firstTreeItemOfParentTree=false;this.lastTreeItemOfParentTree=false;this.rightIconColor="auto";this.numberOfDirectTreeItemsDescendants=0}Object.defineProperty(t.prototype,"el",{get:function(){return n(this)},enumerable:false,configurable:true});t.prototype.componentWillLoad=function(){l||(l=this.el.parentElement);this.numberOfParentTrees=this.getParents(this.el);var t=this.el.querySelector('[slot="tree"]');if(this.isLeaf===undefined){if(t===null){this.isLeaf=true}else{this.hasChildTree=true}}var i=this.el.previousElementSibling;if(i===null){this.firstTreeItem=true}var e=this.el.nextElementSibling;if(e===null){this.lastTreeItem=true}if(this.numberOfParentTrees===1){var n=this.el.previousElementSibling;if(n===null){this.firstTreeItemOfParentTree=true}}if(this.numberOfParentTrees===1){var o=this.el.nextElementSibling;if(o===null){this.lastTreeItemOfParentTree=true}}if(this.download&&this.rightIcon.includes("download")){this.rightIconColor="primary-enabled"}else if(this.disabled){this.rightIconColor="disabled"}if(this.download){this.hasChildTree=true;this.isLeaf=false;this.opened=false}if(l.checkbox){this.checkbox=true;this.checked=l.checked}};t.prototype.getNumberOfVisibleDescendants=function(){var t=this.el.querySelector(":scope > ch-tree");if(t!==null&&this.opened){var i=t.querySelectorAll("ch-tree-item.visible");var e=t.querySelectorAll(":scope > ch-tree-item.visible");var n=e[e.length-1];var o=n.opened;var s=0;if(o){var r=n.querySelector(":scope > ch-tree");s=r.querySelectorAll(":scope > ch-tree-item").length}if(i.length>0){this.numberOfDirectTreeItemsDescendants=i.length-s}}};t.prototype.setVisibleTreeItems=function(){var t=this.el.querySelector(":scope > ch-tree");if(t!==null){var i=t.querySelectorAll(":scope > ch-tree-item");if(this.opened){i.forEach((function(t){t.classList.remove("not-visible");t.classList.add("visible")}))}else{i.forEach((function(t){t.classList.remove("visible");t.classList.add("not-visible")}))}}};t.prototype.componentDidLoad=function(){this.setVisibleTreeItems();this.getNumberOfVisibleDescendants()};t.prototype.watchHandler=function(t){};t.prototype.getParents=function(t){var i=[];for(;t&&t!==document;t=t.parentNode){var e=t.tagName;if(e==="CH-TREE"){i.push(t)}}return i.length};t.prototype.toggleTreeIconClicked=function(){if(this.opened){this.opened=false}else{this.opened=true}this.setVisibleTreeItems();var t=this.toggleIconClicked.emit();t.stopPropagation();t.preventDefault()};t.prototype.updateTreeVerticalLineHeight=function(){return __awaiter(this,void 0,void 0,(function(){return __generator(this,(function(t){this.getNumberOfVisibleDescendants();return[2]}))}))};t.prototype.liTextClicked=function(){this.liItemClicked.emit();this.selected=true};t.prototype.liTextDoubleClicked=function(){this.toggleTreeIconClicked()};t.prototype.liTextKeyDownPressed=function(t){if(t.key==="ArrowDown"||t.key==="ArrowUp"){t.preventDefault()}if(t.key==="Enter"){this.checkboxClicked();if(this.download){this.el.click()}}if(t.key==="ArrowRight"&&!this.isLeaf){if(!this.opened){this.opened=true}else{var i=this.el.querySelector("ch-tree");var e=i.querySelector("ch-tree-item");var n=e.shadowRoot.querySelector(".li-text");n.focus()}this.setVisibleTreeItems();this.toggleIconClicked.emit()}if(t.key==="ArrowLeft"){var o=false;var s=this.el.parentElement.parentElement;var r=null;if(s.tagName==="CH-TREE-ITEM"){o=true;r=s.shadowRoot.querySelector(".li-text")}if(this.isLeaf){if(o){r.focus()}}else{var a=this.el.shadowRoot.querySelector("li");if(a.classList.contains("tree-open")){this.opened=false}else if(o){r.focus()}}this.setVisibleTreeItems();this.toggleIconClicked.emit()}if(t.key==="ArrowUp"||t.key==="Tab"&&t.shiftKey){t.preventDefault();if(!this.firstTreeItemOfParentTree){var l=void 0;var h=this.el.previousElementSibling;if(t.shiftKey&&t.key!=="Tab"){if(h!==null){l=h.shadowRoot.querySelector("li .li-text")}}else if(h===null){var c=this.el.parentElement;var f=c.parentElement;l=f.shadowRoot.querySelector("li .li-text")}else{l=h.shadowRoot.querySelector("li .li-text");if(h!==null){var u=h.hasChildTree;if(u){var d=h.opened;if(d&&!this.download){var p=this.el.previousElementSibling;var b=p.querySelector("ch-tree");if(b.lastElementChild.hasChildTree){if(b.lastElementChild.shadowRoot.querySelector("li").classList.contains("tree-open")){l=b.lastElementChild.querySelector("ch-tree").lastElementChild.shadowRoot.querySelector("li .li-text")}else{l=b.lastElementChild.shadowRoot.querySelector("li .li-text")}}else{l=b.lastElementChild.shadowRoot.querySelector("li .li-text")}}else{l=this.el.previousElementSibling.shadowRoot.querySelector("li .li-text")}}}}if(l!==null&&l!==undefined){l.focus()}}}if(t.key==="ArrowDown"||t.key==="Tab"&&!t.shiftKey){t.preventDefault();if(!this.lastTreeItemOfParentTree){var g=void 0;if(t.shiftKey){if(this.el.nextElementSibling!==null){g=this.el.nextElementSibling.shadowRoot.querySelector("li .li-text")}}else if(this.lastTreeItem){if(this.hasChildTree&&this.opened){g=this.el.firstElementChild.firstElementChild.shadowRoot.querySelector(".li-text")}else{var m=this.el.parentElement;var x=m.parentElement;var v=x.nextElementSibling;if(v===null){if(x.parentElement.parentElement.nextElementSibling!==null){g=x.parentElement.parentElement.nextElementSibling.shadowRoot.querySelector(".li-text")}}else{g=v.shadowRoot.querySelector(".li-text")}}}else if(this.hasChildTree&&this.opened&&!this.download){g=this.el.querySelector("ch-tree ch-tree-item").shadowRoot.querySelector("li .li-text")}else{g=this.el.nextElementSibling.shadowRoot.querySelector(".li-text")}if(g!==null&&g!==undefined){g.focus()}}else{if(this.el.classList.contains("not-leaf")&&this.el.shadowRoot.querySelector("li").classList.contains("tree-open")){var y=this.el.firstElementChild.firstElementChild.shadowRoot.querySelector("li .li-text");y.focus()}}}};t.prototype.returnToggleIconType=function(){if(!this.opened||this.download){return"expand-icon"}return"collapse-icon"};t.prototype.returnPaddingLeft=function(){var t=0;if(this.numberOfParentTrees!==1){t=(this.numberOfParentTrees-1)*31+5}else{t=5}this.itemPaddingLeft=t;return t+"px"};t.prototype.returnVerticalLineLeftPosition=function(){if(this.numberOfParentTrees!==1){return this.itemPaddingLeft+5+"px"}return this.itemPaddingLeft+5+"px"};t.prototype.checkboxTabIndex=function(){return-1};t.prototype.liTextTabIndex=function(){return 1};t.prototype.setIndeterminate=function(){if(this.indeterminate){return true}return false};t.prototype.checkboxClicked=function(){if(this.checkbox){this.checked=!this.checked;this.toggleTreeItemsCheckboxes(this.checked);this.checkboxClickedEvent.emit({checked:this.checked,id:this.el.id})}if(l.toggleCheckboxes){var t=this.el.querySelectorAll("ch-tree-item");t.forEach((function(t){if(t.checkbox){t.checked=!t.checked}}))}};t.prototype.toggleTreeItemsCheckboxes=function(t){var i=this.el.parentElement;if(i.toggleCheckboxes){this.indeterminate=false;var e=this.el.querySelector("ch-tree");if(e!==null){var n=e.querySelectorAll("ch-tree-item");n.forEach((function(i){if(t){i.checked=true}else{i.checked=false}}))}}};t.prototype.resolveLeftIcon=function(){if(this.leftIcon!==undefined){return this.leftIcon}return""};t.prototype.resolveRightIcon=function(){if(this.rightIcon!==undefined){return this.rightIcon}return""};t.prototype.render=function(){return o(s,{key:"2f189f9d104247511c8d359b9fd5a61c2cae5d54",class:{leaf:this.isLeaf,"not-leaf":!this.isLeaf}},o("li",{key:"55320518a8811d31bf64af5d131f16223ed683cc",class:{"tree-open":this.opened,disabled:this.disabled}},o("div",{key:"7475df0eccba1f570643c8cb76a059999c37fad8",class:{"li-text":true,"li-text--not-leaf":!this.isLeaf,"li-text--leaf":this.isLeaf,"li-text--first-tree-item":this.firstTreeItem,"li-text--has-child-tree":this.hasChildTree,"li-text--selected":this.selected},style:{paddingLeft:this.returnPaddingLeft()},onClick:this.liTextClicked.bind(this),onDblClick:this.liTextDoubleClicked.bind(this),onKeyDown:this.liTextKeyDownPressed.bind(this),tabIndex:this.liTextTabIndex(),part:"list-item"},!this.isLeaf||this.download?[o("span",{class:{"vertical-line":true},style:{height:this.numberOfDirectTreeItemsDescendants*20-10+"px",left:this.returnVerticalLineLeftPosition()}}),o("div",{class:{"closed-opened-icons":true}},o("div",{part:this.returnToggleIconType(),class:"icon toggle-icon",onClick:this.toggleTreeIconClicked.bind(this)}))]:null,o("span",{key:"588b62415138c7670cbd1927e39c1f0f3b28ca42",class:{"horizontal-line":true,"display-none":this.numberOfParentTrees===1},style:{left:this.itemPaddingLeft+"px"}}),this.checkbox?o("ch-form-checkbox",{part:"checkbox",checked:this.checked,class:{checkbox:true},tabIndex:this.checkboxTabIndex(),indeterminate:this.setIndeterminate(),disabled:this.disabled,onClick:this.checkboxClicked.bind(this)}):null,o("span",{key:"639d0f62a7f1cf2932083d8c12216f18f8a3a042",part:"left-icon"}),this.leftIcon?o("ch-icon",{src:this.resolveLeftIcon(),"auto-color":this.disabled?"disabled":"auto",class:"icon",style:{"--icon-size":"14px"}}):null,o("span",{key:"4e1d3d0f170f5848d9aa76b813dd016156719dd8",class:"text"},o("slot",{key:"049897afc5707cbbc80d5dd31a8ffb910ced6c58"})),this.rightIcon?o("ch-icon",{src:this.resolveRightIcon(),color:this.rightIconColor,class:{"right-icon":true},style:{"--icon-size":"14px"}}):null,o("span",{key:"81e4456e736a78f49efc7c1a7234ff64ccd592c4",part:"right-icon"}),this.download?o("span",{class:{loading:true}}):null),o("slot",{key:"74119d3f32ce35a5360b9e97b3c343e55e82f707",name:"tree"})))};Object.defineProperty(t,"assetsDirs",{get:function(){return["tree-item-assets"]},enumerable:false,configurable:true});Object.defineProperty(t,"watchers",{get:function(){return{downloaded:["watchHandler"]}},enumerable:false,configurable:true});return t}());h.style=a}}}));
//# sourceMappingURL=p-9018e219.system.entry.js.map