System.register(["./p-62fc4e49.system.js","./p-bb05958c.system.js"],(function(t){"use strict";var i,n,e,s,a,o;return{setters:[function(t){i=t.r;n=t.c;e=t.g;s=t.h;a=t.H},function(t){o=t.b}],execute:function(){var d=":host{--ch-window-offset-x:0px;--ch-window-offset-y:0px;--ch-window-separation-x:0px;--ch-window-separation-y:0px;--ch-window-x-outside:0px;--ch-window-y-outside:0px}:host(:not([hidden])){display:contents}:host(:is(:not([modal]),[modal=false])) .mask{pointer-events:none}.window{pointer-events:all}.mask{display:-ms-flexbox;display:flex;position:fixed;inset:0;left:calc(var(--ch-window-inset-inline-start) + var(--ch-window-offset-x) + var(--ch-window-separation-x));inset-block-start:calc(var(--ch-window-inset-block-start) + var(--ch-window-offset-y) + var(--ch-window-separation-y));width:var(--ch-window-mask-width);height:var(--ch-window-mask-height);z-index:var(--ch-window-mask-z-index, 1000)}:host(:is([x-align=outside-start],[x-align=inside-start])) .mask{-ms-flex-pack:start;justify-content:flex-start}:host([x-align=center]) .mask{-ms-flex-pack:center;justify-content:center}:host(:is([x-align=outside-end],[x-align=inside-end])) .mask{-ms-flex-pack:end;justify-content:flex-end}:host(:is([y-align=outside-start],[y-align=inside-start])) .mask{-ms-flex-align:start;align-items:flex-start}:host([y-align=center]) .mask{-ms-flex-align:center;align-items:center}:host(:is([y-align=outside-end],[y-align=inside-end])) .mask{-ms-flex-align:end;align-items:flex-end}.window{display:-ms-flexbox;display:flex;-ms-flex-direction:column;flex-direction:column;-webkit-transform:translate(var(--ch-window-x-outside), var(--ch-window-y-outside)) translate(var(--ch-window-x-drag, 0px), var(--ch-window-y-drag, 0px));transform:translate(var(--ch-window-x-outside), var(--ch-window-y-outside)) translate(var(--ch-window-x-drag, 0px), var(--ch-window-y-drag, 0px));z-index:inherit}:host([x-align=outside-start]) .window{--ch-window-x-outside:-100%}:host([x-align=outside-end]) .window{--ch-window-x-outside:100%}:host([y-align=outside-start]) .window{--ch-window-y-outside:-100%}:host([y-align=outside-end]) .window{--ch-window-y-outside:100%}.separation{position:fixed;inset:0;pointer-events:all}.separation--x{top:var(--ch-window-inset-block-start);width:var(--ch-window-separation);height:var(--ch-window-mask-height)}.separation--y{left:var(--ch-window-inset-inline-start);width:var(--ch-window-mask-width);height:var(--ch-window-separation)}.separation--both{width:calc(var(--ch-window-separation) * 4);height:calc(var(--ch-window-separation) * 4)}:host([x-align=outside-start]) .separation{left:calc(var(--ch-window-inset-inline-start) - var(--ch-window-separation))}:host([x-align=outside-start]) .separation--both{left:calc(var(--ch-window-inset-inline-start) - var(--ch-window-separation) * 3)}:host([x-align=outside-end]) .separation{left:calc(var(--ch-window-inset-inline-start) + var(--ch-window-mask-width))}:host([x-align=outside-end]) .separation--both{left:calc(var(--ch-window-inset-inline-start) + var(--ch-window-mask-width) - var(--ch-window-separation))}:host([y-align=outside-start]) .separation{top:calc(var(--ch-window-inset-block-start) - var(--ch-window-separation))}:host([y-align=outside-start]) .separation--both{top:calc(var(--ch-window-inset-block-start) - var(--ch-window-separation) * 3)}:host([y-align=outside-end]) .separation{top:calc(var(--ch-window-inset-block-start) + var(--ch-window-mask-height))}:host([y-align=outside-end]) .separation--both{top:calc(var(--ch-window-inset-block-start) + var(--ch-window-mask-height) - var(--ch-window-separation))}";var r=d;var h="--ch-window-relative-position";var c=t("ch_window",function(){function t(t){var e=this;this.isContainerCssOverride=false;this.relativeWindow=false;this.validCssAligns=["outside-start","inside-start","center","inside-end","outside-end"];this.draggedX=0;this.draggedY=0;this.mousemoveHandler=function(t){var i=e.draggedX+t.clientX-e.dragStartX;var n=e.draggedY+t.clientY-e.dragStartY;e.window.style.setProperty("--ch-window-x-drag","".concat(i,"px"));e.window.style.setProperty("--ch-window-y-drag","".concat(n,"px"))};this.mouseupHandler=function(){document.removeEventListener("mousemove",e.mousemoveHandler);e.draggedX=parseInt(e.window.style.getPropertyValue("--ch-window-x-drag"));e.draggedY=parseInt(e.window.style.getPropertyValue("--ch-window-y-drag"))};this.maskClickHandler=function(t){t.stopPropagation()};this.updatePosition=function(){if(!e.isContainerCssOverride&&e.container&&e.mask){var t=e.container.getBoundingClientRect();e.el.style.setProperty("--ch-window-mask-width","".concat(t.width,"px"));e.el.style.setProperty("--ch-window-mask-height","".concat(t.height,"px"));if(e.relativeWindow){return}e.el.style.setProperty("--ch-window-inset-inline-start","".concat(t.left,"px"));e.el.style.setProperty("--ch-window-inset-block-start","".concat(t.top,"px"))}else if(e.isContainerCssOverride||!e.container){e.el.style.removeProperty("--ch-window-mask-width");e.el.style.removeProperty("--ch-window-mask-height");if(e.relativeWindow){return}e.el.style.removeProperty("--ch-window-inset-inline-start");e.el.style.removeProperty("--ch-window-inset-block-start")}};this.windowResizeHandler=function(){e.updatePosition();e.watchCSSAlign()};this.windowScrollHandler=function(){e.updatePosition()};this.closeOnOutsideClickHandler=function(t){if(!t.composedPath().includes(e.window)){e.hidden=true}};this.closeOnEscapeHandler=function(t){if(t.key==="Escape"){e.hidden=true}};i(this,t);this.windowOpened=n(this,"windowOpened",7);this.windowClosed=n(this,"windowClosed",7);this.container=undefined;this.xAlign="center";this.yAlign="center";this.hidden=true;this.modal=true;this.caption="";this.closeText=undefined;this.closeTooltip=undefined;this.closeOnOutsideClick=undefined;this.closeOnEscape=undefined;this.allowDrag="no";this.showFooter=true;this.showHeader=true;this.showMain=true;this.showSeparation=false}Object.defineProperty(t.prototype,"el",{get:function(){return e(this)},enumerable:false,configurable:true});t.prototype.containerHandler=function(t,i){this.checkRelativePosition();this.containerResizeObserverHandler(t,i);this.updatePosition()};t.prototype.hiddenHandler=function(){if(this.hidden){this.resetDrag();this.removeListeners();this.windowClosed.emit()}else{this.checkRelativePosition();this.updatePosition();this.watchCSSAlign();this.addListeners();this.windowOpened.emit()}};t.prototype.componentWillLoad=function(){this.containerResizeObserver=new ResizeObserver(this.updatePosition);this.containerResizeObserverHandler(this.container);this.watchCSSAlign();this.loadGlobalStyleSheet()};t.prototype.componentDidLoad=function(){if(!this.hidden){this.addListeners()}};t.prototype.mousedownHandler=function(t){if(this.isDraggable(t.composedPath())){this.dragStartX=t.clientX;this.dragStartY=t.clientY;document.addEventListener("mousemove",this.mousemoveHandler,{passive:true});document.addEventListener("mouseup",this.mouseupHandler,{once:true})}};t.prototype.windowCloseClickedHandler=function(){this.hidden=true};t.prototype.checkRelativePosition=function(){var t=getComputedStyle(this.el);this.relativeWindow=!!t.getPropertyValue(h)};t.prototype.resetDrag=function(){this.dragStartX=undefined;this.dragStartY=undefined;this.draggedX=0;this.draggedY=0;this.window.style.removeProperty("--ch-window-x-drag");this.window.style.removeProperty("--ch-window-y-drag")};t.prototype.isDraggable=function(t){return this.allowDrag!=="no"&&(this.allowDrag==="header"&&t.includes(this.header)||this.allowDrag==="box"&&t.includes(this.window))};t.prototype.watchCSSAlign=function(){var t=getComputedStyle(this.el);var i=t.getPropertyValue("--ch-window-container").trim();var n=t.getPropertyValue("--ch-window-align-x").trim();var e=t.getPropertyValue("--ch-window-align-y").trim();this.isContainerCssOverride=i.includes("window");if(this.validCssAligns.includes(n)){this.xAlign=n}if(this.validCssAligns.includes(e)){this.yAlign=e}};t.prototype.containerResizeObserverHandler=function(t,i){if(t){this.containerResizeObserver.observe(t)}if(i){this.containerResizeObserver.unobserve(i)}};t.prototype.addListeners=function(){window.addEventListener("resize",this.windowResizeHandler,{passive:true});if(this.container){document.addEventListener("scroll",this.windowScrollHandler,{capture:true,passive:true})}if(this.closeOnOutsideClick){document.addEventListener("click",this.closeOnOutsideClickHandler,{capture:true})}if(this.closeOnEscape){document.addEventListener("keydown",this.closeOnEscapeHandler,{capture:true})}};t.prototype.removeListeners=function(){window.removeEventListener("resize",this.windowResizeHandler);document.removeEventListener("scroll",this.windowScrollHandler,{capture:true});document.removeEventListener("click",this.closeOnOutsideClickHandler,{capture:true});document.removeEventListener("keydown",this.closeOnEscapeHandler,{capture:true})};t.prototype.loadGlobalStyleSheet=function(){o(this.el.shadowRoot.adoptedStyleSheets)};t.prototype.render=function(){var t=this;var i=this.yAlign==="outside-start"||this.yAlign==="outside-end";var n=this.xAlign==="outside-start"||this.xAlign==="outside-end";return s(a,{key:"982821f7de3dde03801407d39c553762148f8696",style:this.relativeWindow&&{"--ch-window-inset-inline-start":"0px","--ch-window-inset-block-start":"0px"}},s("div",{key:"f9faf2ee86d8f8ebd0baf5f47e3b651f44edae61",class:"mask",part:"mask",ref:function(i){return t.mask=i},onClick:this.maskClickHandler},s("section",{key:"38fefaa8e6a952c32c52388ae5572af0a785324f",class:"window",part:"window",ref:function(i){return t.window=i}},this.showHeader&&s("header",{key:"040c9feecc3f7d6f2c8677106adfa24010d03e09",part:"header",ref:function(i){return t.header=i}},s("slot",{key:"8d9c3e14ba5f68f3bf005fefd8697af6c08fb4df",name:"header"},s("span",{key:"d27f55b3906940af188051e45a359d11040b8563",part:"caption"},this.caption),s("ch-window-close",{key:"65a02494cb2d705959263b10b85539f765148664",part:"close",title:this.closeTooltip},this.closeText))),this.showMain?s("div",{part:"main"},s("slot",null)):s("slot",null),this.showFooter&&s("footer",{key:"60755221bba784464cd9d53ad128f2970f2f7f3c",part:"footer"},s("slot",{key:"df6d84ce1a344d371a9c044597701247f8d7c501",name:"footer"}))),this.showSeparation&&s("div",{key:"bb988462dcd11347dd74d3bfcdbcf7b0c13d3fa5",class:{separation:true,"separation--x":n&&!i,"separation--y":i&&!n,"separation--both":n&&i},part:"separation"})))};Object.defineProperty(t,"watchers",{get:function(){return{container:["containerHandler"],hidden:["hiddenHandler"]}},enumerable:false,configurable:true});return t}());c.style=r;var w="";var f=w;var u=t("ch_window_close",function(){function t(t){i(this,t);this.windowCloseClicked=n(this,"windowCloseClicked",7);this.disabled=undefined}t.prototype.pressedHandler=function(t){if(!t.key||t.key==="Enter"||t.key===" "){this.windowCloseClicked.emit();t.stopPropagation()}};t.prototype.render=function(){return s(a,{key:"a56855995f62d9ee2d2e56b6f5f69081a64f2f8b",role:"button",tabindex:"0",disabled:this.disabled})};return t}());u.style=f}}}));
//# sourceMappingURL=p-2ee9e77b.system.entry.js.map