var __classPrivateFieldGet=this&&this.__classPrivateFieldGet||function(e,t,i,a){if(i==="a"&&!a)throw new TypeError("Private accessor was defined without a getter");if(typeof t==="function"?e!==t||!a:!t.has(e))throw new TypeError("Cannot read private member from an object whose class did not declare it");return i==="m"?a:i==="a"?a.call(e):a?a.value:t.get(e)};var __classPrivateFieldSet=this&&this.__classPrivateFieldSet||function(e,t,i,a,s){if(a==="m")throw new TypeError("Private method is not writable");if(a==="a"&&!s)throw new TypeError("Private accessor was defined without a setter");if(typeof t==="function"?e!==t||!s:!t.has(e))throw new TypeError("Cannot write private member to an object whose class did not declare it");return a==="a"?s.call(e,i):s?s.value=i:t.set(e,i),i};System.register(["./p-62fc4e49.system.js","./p-07d94fab.system.js","./p-f725d3d0.system.js"],(function(e){"use strict";var t,i,a,s,n,r,o,l,c,d,f;return{setters:[function(e){t=e.r;i=e.c;a=e.g;s=e.h;n=e.H;r=e.f},function(e){o=e.A;l=e.D;c=e.b;d=e.c},function(e){f=e.f}],execute:function(){var u,v,p,h,_,m,w,g,b,F,P,k,G,C,x,y,M,S,W,I,E,O,z,R,T;var j='*,::after,::before{-webkit-box-sizing:border-box;box-sizing:border-box}:host{display:grid;position:relative;inline-size:100%;block-size:100%;grid-template:"more-actions actions" 1fr/min-content 1fr;overflow:hidden}.more-actions{grid-area:more-actions}.more-actions::part(action){-ms-flex-pack:center;justify-content:center;-ms-flex-item-align:center;align-self:center;inline-size:1.375em;block-size:1.375em}.more-actions::part(action)::before{content:"";inline-size:100%;block-size:100%;background-color:currentColor;-webkit-mask:url(\'data:image/svg+xml,<svg viewBox="0 0 25 25" xmlns="http://www.w3.org/2000/svg"><path d="M5.26837 10.5625C4.16837 10.5625 3.26837 11.4625 3.26837 12.5625C3.26837 13.6625 4.16837 14.5625 5.26837 14.5625C6.36837 14.5625 7.26837 13.6625 7.26837 12.5625C7.26837 11.4625 6.36837 10.5625 5.26837 10.5625ZM19.2684 10.5625C18.1684 10.5625 17.2684 11.4625 17.2684 12.5625C17.2684 13.6625 18.1684 14.5625 19.2684 14.5625C20.3684 14.5625 21.2684 13.6625 21.2684 12.5625C21.2684 11.4625 20.3684 10.5625 19.2684 10.5625ZM12.2684 10.5625C11.1684 10.5625 10.2684 11.4625 10.2684 12.5625C10.2684 13.6625 11.1684 14.5625 12.2684 14.5625C13.3684 14.5625 14.2684 13.6625 14.2684 12.5625C14.2684 11.4625 13.3684 10.5625 12.2684 10.5625Z"/></svg>\') 50% 50%/1.25em 1.25em no-repeat}.actions{grid-area:actions;display:grid;grid-auto-flow:column;grid-auto-columns:-webkit-max-content;grid-auto-columns:max-content;inline-size:100%;max-inline-size:100%}.actions--responsive{position:absolute;inset:0}.actions--scroll{overflow-x:auto}.actions--multiline{display:-ms-flexbox;display:flex;-ms-flex-wrap:wrap;flex-wrap:wrap}';var A=j;var B=1;var D="".concat(l.EXPANDABLE_BUTTON,":").concat(o.MORE_ACTIONS_BUTTON,",").concat(l.WINDOW,":").concat(o.MORE_ACTIONS_WINDOW);var N=e("ch_action_group",(y=function(){function e(e){var a=this;u.set(this,true);v.set(this,-1);p.set(this,void 0);h.set(this,void 0);_.set(this,void 0);m.set(this,void 0);w.set(this,(function(){var e=__classPrivateFieldGet(a,m,"f").assignedElements();var t=getComputedStyle(__classPrivateFieldGet(a,_,"f")).columnGap;var i=t!=null&&t.endsWith("px")?Number(t.replace("px","")):0;var s=__classPrivateFieldGet(a,_,"f").clientWidth+i-B;var n=0;e.forEach((function(e){var t=e.clientWidth;s-=t+i;if(s>=0){e.floating=false;n++}else{e.floating=true}}));__classPrivateFieldSet(a,v,e.length,"f");a.displayedItems=n;a.displayedItemsCountChange.emit(n)}));g.set(this,(function(){if(!__classPrivateFieldGet(a,u,"f")){return}__classPrivateFieldSet(a,u,false,"f");requestAnimationFrame((function(){__classPrivateFieldSet(a,u,true,"f");__classPrivateFieldGet(a,w,"f").call(a)}))}));b.set(this,(function(){__classPrivateFieldSet(a,h,new ResizeObserver(__classPrivateFieldGet(a,g,"f")),"f");var e=__classPrivateFieldGet(a,m,"f").assignedElements();e.forEach((function(e){__classPrivateFieldGet(a,h,"f").observe(e)}))}));F.set(this,(function(){__classPrivateFieldSet(a,p,new ResizeObserver(__classPrivateFieldGet(a,g,"f")),"f");__classPrivateFieldGet(a,p,"f").observe(__classPrivateFieldGet(a,_,"f"))}));P.set(this,(function(){if(__classPrivateFieldGet(a,h,"f")){__classPrivateFieldGet(a,h,"f").disconnect();__classPrivateFieldSet(a,h,null,"f")}}));k.set(this,(function(){if(__classPrivateFieldGet(a,p,"f")){__classPrivateFieldGet(a,p,"f").disconnect();__classPrivateFieldSet(a,p,null,"f")}}));G.set(this,(function(){__classPrivateFieldGet(a,P,"f").call(a);__classPrivateFieldGet(a,k,"f").call(a);if(a.itemsOverflowBehavior!=="ResponsiveCollapse"){return}__classPrivateFieldGet(a,b,"f").call(a);__classPrivateFieldGet(a,F,"f").call(a)}));C.set(this,(function(){if(a.itemsOverflowBehavior!=="ResponsiveCollapse"){return}__classPrivateFieldGet(a,P,"f").call(a);__classPrivateFieldGet(a,b,"f").call(a)}));x.set(this,(function(e){e.stopPropagation();a.moreActionsButtonExpandedChange.emit(e.detail)}));t(this,e);this.displayedItemsCountChange=i(this,"displayedItemsCountChange",7);this.moreActionsButtonExpandedChange=i(this,"moreActionsButtonExpandedChange",7);this.displayedItems=-1;this.accessibleName=undefined;this.itemsOverflowBehavior="ResponsiveCollapse";this.moreActionsAccessibleName="More actions";this.moreActionsButtonPosition="Start";this.moreActionsDropdownPosition="InsideStart_OutsideEnd";this.openOnFocus=false}Object.defineProperty(e.prototype,"el",{get:function(){return a(this)},enumerable:false,configurable:true});e.prototype.handleOverflowBehaviorChange=function(e){if(e!=="ResponsiveCollapse"){var t=__classPrivateFieldGet(this,m,"f").assignedElements();t.forEach((function(e){e.floating=false}))}__classPrivateFieldGet(this,G,"f").call(this)};e.prototype.componentDidLoad=function(){__classPrivateFieldGet(this,G,"f").call(this)};e.prototype.disconnectedCallback=function(){__classPrivateFieldGet(this,P,"f").call(this);__classPrivateFieldGet(this,k,"f").call(this)};e.prototype.render=function(){var e=this;return s(n,{key:"a938dc7599df6e233fcb4609d69ee862bdc2b847",role:"menubar","aria-label":this.accessibleName},this.itemsOverflowBehavior==="ResponsiveCollapse"&&__classPrivateFieldGet(this,v,"f")!==this.displayedItems&&s("ch-dropdown",{key:"47ab31cfa2a6ee55bc3d4b55bd93c96ed6dfebb4",exportparts:D,class:"more-actions",part:o.MORE_ACTIONS,actionGroupParent:true,buttonAccessibleName:this.moreActionsAccessibleName,leaf:false,level:-1,nestedDropdown:true,openOnFocus:this.openOnFocus,position:this.moreActionsDropdownPosition,onExpandedChange:__classPrivateFieldGet(this,x,"f")},s("slot",{key:"8ac268496266442a98ed57a73c394ca088caafe4",name:"more-items"})),s("div",{key:"188430b71df135d34c5ce659366045cc53dafc45",class:{actions:true,"actions--scroll":this.itemsOverflowBehavior==="AddScroll","actions--multiline":this.itemsOverflowBehavior==="Multiline","actions--responsive":this.itemsOverflowBehavior==="ResponsiveCollapse"},part:o.ACTIONS,ref:function(t){return __classPrivateFieldSet(e,_,t,"f")}},s("slot",{key:"5fa30c57fb3128fa62903246fbddd10db59f026a",name:"items",onSlotchange:__classPrivateFieldGet(this,C,"f"),ref:function(t){return __classPrivateFieldSet(e,m,t,"f")}})))};Object.defineProperty(e,"watchers",{get:function(){return{itemsOverflowBehavior:["handleOverflowBehaviorChange"]}},enumerable:false,configurable:true});return e}(),u=new WeakMap,v=new WeakMap,p=new WeakMap,h=new WeakMap,_=new WeakMap,m=new WeakMap,w=new WeakMap,g=new WeakMap,b=new WeakMap,F=new WeakMap,P=new WeakMap,k=new WeakMap,G=new WeakMap,C=new WeakMap,x=new WeakMap,y));N.style=A;var Z="ch-action-group-item[floating]{visibility:hidden}ch-action-group-item{display:-ms-flexbox;display:flex}";var q=Z;var L=e("ch_action_group_item",function(){function e(e){t(this,e);this.floating=false}Object.defineProperty(e.prototype,"el",{get:function(){return a(this)},enumerable:false,configurable:true});e.prototype.componentWillLoad=function(){var e=this.el.closest("ch-action-group");if(e){this.floating=e.itemsOverflowBehavior==="ResponsiveCollapse"}};e.prototype.render=function(){return s("slot",{key:"522573e67f495e1a2f8f1b00348c74b29c91d089"})};return e}());L.style=q;var H="ch-action-group-render{display:contents}.ch-dropdown-separator{display:grid;block-size:1px;background-color:color-mix(in srgb, currentColor 25%, transparent);pointer-events:none}.ch-action-group-separator--vertical{display:grid;inline-size:1px;background-color:color-mix(in srgb, currentColor 25%, transparent);pointer-events:none}";var J=H;var K="action-group-item";var Q="dropdown-item";var U=e("ch_action_group_render",(T=function(){function e(e){var i=this;M.set(this,(function(e,t){return function(a){if(i.itemClickCallback){i.itemClickCallback(a,e,t)}}}));S.set(this,(function(e){return i.useGxRender?f(e,i.gxSettings,i.gxImageConstructor):e}));W.set(this,(function(e,t){return function(a,n){var r,o,l,c,d;var f=((r=a.items)===null||r===void 0?void 0:r.length)>0;return[s("ch-dropdown",{exportparts:i.dropdownExportParts,key:a.id||a.caption||n,id:a.id,caption:a.caption,class:a.subActionClass||Q,endImgSrc:__classPrivateFieldGet(i,S,"f").call(i,a.endImgSrc),endImgType:(o=a.endImgType)!==null&&o!==void 0?o:"background",href:(l=a.link)===null||l===void 0?void 0:l.url,itemClickCallback:__classPrivateFieldGet(i,M,"f").call(i,(c=a.link)===null||c===void 0?void 0:c.url,a.id),leaf:!f,level:e,openOnFocus:i.openOnFocus,position:(t?a.itemsResponsiveCollapsePosition:a.itemsPosition)||"OutsideEnd_InsideStart",shortcut:a.shortcut,startImgSrc:__classPrivateFieldGet(i,S,"f").call(i,a.startImgSrc),startImgType:(d=a.startImgType)!==null&&d!==void 0?d:"background",onExpandedChange:!a.wasExpanded?__classPrivateFieldGet(i,E,"f").call(i,a,"wasExpanded"):null},f&&a.wasExpanded&&a.items.map(__classPrivateFieldGet(i,W,"f").call(i,e+1,t)),f&&!a.wasExpanded&&s("ch-dropdown",null)),a.showSeparator&&s("div",{"aria-hidden":"true",class:"ch-dropdown-separator "+(a.separatorClass||i.separatorCssClass)})]}}));I.set(this,(function(e,t,a){var n,r,o,l,c;var d=((n=e.items)===null||n===void 0?void 0:n.length)>0;var f=d&&(!e.wasExpandedInFirstLevel||i.itemsOverflowBehavior==="ResponsiveCollapse"&&i.displayedItemsCount!==-1&&t>=i.displayedItemsCount);return[s("ch-dropdown",{exportparts:i.dropdownExportParts,key:e.id||e.caption||t,id:e.id,actionGroupParent:true,caption:e.caption,class:e.actionClass||K,endImgSrc:__classPrivateFieldGet(i,S,"f").call(i,e.endImgSrc),endImgType:(r=e.endImgType)!==null&&r!==void 0?r:"background",href:(o=e.link)===null||o===void 0?void 0:o.url,itemClickCallback:__classPrivateFieldGet(i,M,"f").call(i,(l=e.link)===null||l===void 0?void 0:l.url,e.id),leaf:!d,level:a,openOnFocus:i.openOnFocus,position:e.itemsPosition||"Center_OutsideEnd",startImgSrc:__classPrivateFieldGet(i,S,"f").call(i,e.startImgSrc),startImgType:(c=e.startImgType)!==null&&c!==void 0?c:"background",onExpandedChange:!e.wasExpandedInFirstLevel?__classPrivateFieldGet(i,E,"f").call(i,e,"wasExpandedInFirstLevel"):null},e.wasExpandedInFirstLevel&&i.itemsOverflowBehavior==="ResponsiveCollapse"&&(i.displayedItemsCount===-1||t<i.displayedItemsCount)&&e.items!=null&&e.items.map(__classPrivateFieldGet(i,W,"f").call(i,a+1,false)),f&&s("ch-dropdown",null)),e.showSeparator&&s("div",{"aria-hidden":"true",class:"ch-action-group-separator--vertical "+(e.separatorClass||i.separatorCssClass)})]}));E.set(this,(function(e,t){return function(){e[t]=true;r(i)}}));O.set(this,(function(e){return function(t,a){var n,r,o,l,c;var d=((n=t.items)===null||n===void 0?void 0:n.length)>0;return[s("ch-dropdown",{slot:"more-items",key:t.id||t.caption||a,exportparts:i.dropdownExportParts,id:t.id,caption:t.caption,class:t.subActionClass||Q,endImgSrc:__classPrivateFieldGet(i,S,"f").call(i,t.endImgSrc),endImgType:(r=t.endImgType)!==null&&r!==void 0?r:"background",href:(o=t.link)===null||o===void 0?void 0:o.url,itemClickCallback:__classPrivateFieldGet(i,M,"f").call(i,(l=t.link)===null||l===void 0?void 0:l.url,t.id),leaf:!d,level:e,openOnFocus:i.openOnFocus,position:t.itemsResponsiveCollapsePosition||"OutsideEnd_InsideStart",shortcut:t.shortcut,startImgSrc:__classPrivateFieldGet(i,S,"f").call(i,t.startImgSrc),startImgType:(c=t.startImgType)!==null&&c!==void 0?c:"background",onExpandedChange:!t.wasExpandedInMoreActions?__classPrivateFieldGet(i,E,"f").call(i,t,"wasExpandedInMoreActions"):null},d&&t.wasExpandedInMoreActions&&t.items.map(__classPrivateFieldGet(i,W,"f").call(i,e+1,true)),d&&!t.wasExpandedInMoreActions&&s("ch-dropdown",null)),t.showSeparator&&s("div",{slot:"more-items","aria-hidden":"true",class:"ch-dropdown-separator "+(t.separatorClass||i.separatorCssClass)})]}}));z.set(this,(function(e){i.displayedItemsCount=e.detail}));R.set(this,(function(){i.moreActionsButtonWasExpanded=true}));t(this,e);this.displayedItemsCount=-1;this.moreActionsButtonWasExpanded=false;this.actionGroupExportParts=c;this.cssClass="action-group";this.dropdownExportParts=d;this.gxImageConstructor=undefined;this.gxSettings=undefined;this.itemClickCallback=undefined;this.itemsOverflowBehavior="ResponsiveCollapse";this.model=undefined;this.moreActionsAccessibleName="Show options";this.moreActionsDropdownPosition="InsideStart_OutsideEnd";this.openOnFocus=false;this.separatorCssClass="action-group-separator-horizontal";this.useGxRender=false}e.prototype.render=function(){var e=this;var t=this.itemsOverflowBehavior==="ResponsiveCollapse"&&this.moreActionsButtonWasExpanded&&this.model!=null&&this.displayedItemsCount!==-1;return s("ch-action-group",{key:"b2f53a52c632ca0cfaec8b91922ea80ad4c12a2f",exportparts:this.actionGroupExportParts,class:this.cssClass||null,itemsOverflowBehavior:this.itemsOverflowBehavior,moreActionsAccessibleName:this.moreActionsAccessibleName,moreActionsDropdownPosition:this.moreActionsDropdownPosition,openOnFocus:this.openOnFocus,onDisplayedItemsCountChange:__classPrivateFieldGet(this,z,"f"),onMoreActionsButtonExpandedChange:!this.moreActionsButtonWasExpanded?__classPrivateFieldGet(this,R,"f"):null},this.model!=null&&this.model.map((function(t,i){return s("ch-action-group-item",{slot:"items",key:t.id||t.caption||i},__classPrivateFieldGet(e,I,"f").call(e,t,i,0))})),t&&this.model.filter((function(t,i){return i>=e.displayedItemsCount})).map(__classPrivateFieldGet(this,O,"f").call(this,0)))};return e}(),M=new WeakMap,S=new WeakMap,W=new WeakMap,I=new WeakMap,E=new WeakMap,O=new WeakMap,z=new WeakMap,R=new WeakMap,T));U.style=J}}}));
//# sourceMappingURL=p-7cdb4906.system.entry.js.map