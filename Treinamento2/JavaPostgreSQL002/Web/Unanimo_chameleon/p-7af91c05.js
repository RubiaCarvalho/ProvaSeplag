const e="chameleon";const t={allRenderFn:false,appendChildSlotFix:false,asyncLoading:true,asyncQueue:false,attachStyles:true,cloneNodeFix:false,cmpDidLoad:true,cmpDidRender:true,cmpDidUnload:false,cmpDidUpdate:true,cmpShouldUpdate:true,cmpWillLoad:true,cmpWillRender:true,cmpWillUpdate:true,connectedCallback:true,constructableCSS:true,cssAnnotations:true,devTools:false,disconnectedCallback:true,element:false,event:true,experimentalScopedSlotChanges:false,experimentalSlotFixes:false,formAssociated:true,hasRenderFn:true,hostListener:true,hostListenerTarget:true,hostListenerTargetBody:false,hostListenerTargetDocument:false,hostListenerTargetParent:false,hostListenerTargetWindow:true,hotModuleReplacement:false,hydrateClientSide:false,hydrateServerSide:false,hydratedAttribute:false,hydratedClass:true,initializeNextTick:false,invisiblePrehydration:true,isDebug:false,isDev:false,isTesting:false,lazyLoad:true,lifecycle:true,lifecycleDOMEvents:false,member:true,method:true,mode:false,observeAttribute:true,profile:false,prop:true,propBoolean:true,propMutable:true,propNumber:true,propString:true,reflect:true,scoped:false,scopedSlotTextContentFix:false,scriptDataOpts:false,shadowDelegatesFocus:true,shadowDom:true,slot:true,slotChildNodesFix:false,slotRelocation:true,state:true,style:true,svg:true,taskQueue:true,transformTagName:false,updatable:true,vdomAttribute:true,vdomClass:true,vdomFunctional:false,vdomKey:true,vdomListener:true,vdomPropOrAttr:true,vdomRef:true,vdomRender:true,vdomStyle:true,vdomText:true,vdomXlink:true,watchCallback:true};let n;let s;let l;let o=false;let i=false;let c=false;let f=false;let r=false;const a=e=>{const t=new URL(e,He.t);return t.origin!==ze.location.origin?t.href:t.pathname};const u=(e,t="")=>{{return()=>{}}};const d=(e,t)=>{{return()=>{}}};const p="{visibility:hidden}.hydrated{visibility:inherit}";const v="slot-fb{display:contents}slot-fb[hidden]{display:none}";const m="http://www.w3.org/1999/xlink";const h=["formAssociatedCallback","formResetCallback","formDisabledCallback","formStateRestoreCallback"];const b={};const y="http://www.w3.org/2000/svg";const w="http://www.w3.org/1999/xhtml";const g=e=>e!=null;const $=e=>{e=typeof e;return e==="object"||e==="function"};function S(e){var t,n,s;return(s=(n=(t=e.head)===null||t===void 0?void 0:t.querySelector('meta[name="csp-nonce"]'))===null||n===void 0?void 0:n.getAttribute("content"))!==null&&s!==void 0?s:undefined}const k=(e,t,...n)=>{let s=null;let l=null;let o=null;let i=false;let c=false;const f=[];const r=t=>{for(let n=0;n<t.length;n++){s=t[n];if(Array.isArray(s)){r(s)}else if(s!=null&&typeof s!=="boolean"){if(i=typeof e!=="function"&&!$(s)){s=String(s)}if(i&&c){f[f.length-1].l+=s}else{f.push(i?C(null,s):s)}c=i}}};r(n);if(t){if(t.key){l=t.key}if(t.name){o=t.name}{const e=t.className||t.class;if(e){t.class=typeof e!=="object"?e:Object.keys(e).filter((t=>e[t])).join(" ")}}}const a=C(e,null);a.o=t;if(f.length>0){a.i=f}{a.u=l}{a.p=o}return a};const C=(e,t)=>{const n={v:0,m:e,l:t,h:null,i:null};{n.o=null}{n.u=null}{n.p=null}return n};const j={};const O=e=>e&&e.m===j;const R=(e,t)=>{if(e!=null&&!$(e)){if(t&4){return e==="false"?false:e===""||!!e}if(t&2){return parseFloat(e)}if(t&1){return String(e)}return e}return e};const x=e=>Fe(e).$hostElement$;const L=(e,t,n)=>{const s=x(e);return{emit:e=>T(s,t,{bubbles:!!(n&4),composed:!!(n&2),cancelable:!!(n&1),detail:e})}};const T=(e,t,n)=>{const s=He.ce(t,n);e.dispatchEvent(s);return s};const D=new WeakMap;const F=(e,t,n)=>{let s=Ee.get(e);if(Ie&&n){s=s||new CSSStyleSheet;if(typeof s==="string"){s=t}else{s.replaceSync(t)}}else{s=t}Ee.set(e,s)};const A=(e,t,n)=>{var s;const l=U(t);const o=Ee.get(l);e=e.nodeType===11?e:Be;if(o){if(typeof o==="string"){e=e.head||e;let n=D.get(e);let i;if(!n){D.set(e,n=new Set)}if(!n.has(l)){{i=Be.createElement("style");i.innerHTML=o;const t=(s=He.$)!==null&&s!==void 0?s:S(Be);if(t!=null){i.setAttribute("nonce",t)}e.insertBefore(i,e.querySelector("link"))}if(t.v&4){i.innerHTML+=v}if(n){n.add(l)}}}else if(!e.adoptedStyleSheets.includes(o)){e.adoptedStyleSheets=[...e.adoptedStyleSheets,o]}}return l};const M=e=>{const t=e.S;const n=e.$hostElement$;const s=t.v;const l=u("attachStyles",t.k);const o=A(n.shadowRoot?n.shadowRoot:n.getRootNode(),t);if(s&10){n["s-sc"]=o;n.classList.add(o+"-h")}l()};const U=(e,t)=>"sc-"+e.k;const N=(e,t,n,s,l,o)=>{if(n!==s){let i=Ue(e,t);let c=t.toLowerCase();if(t==="class"){const t=e.classList;const l=W(n);const o=W(s);t.remove(...l.filter((e=>e&&!o.includes(e))));t.add(...o.filter((e=>e&&!l.includes(e))))}else if(t==="style"){{for(const t in n){if(!s||s[t]==null){if(t.includes("-")){e.style.removeProperty(t)}else{e.style[t]=""}}}}for(const t in s){if(!n||s[t]!==n[t]){if(t.includes("-")){e.style.setProperty(t,s[t])}else{e.style[t]=s[t]}}}}else if(t==="key");else if(t==="ref"){if(s){s(e)}}else if(!i&&t[0]==="o"&&t[1]==="n"){if(t[2]==="-"){t=t.slice(3)}else if(Ue(ze,c)){t=c.slice(2)}else{t=c[2]+t.slice(3)}if(n||s){const l=t.endsWith(E);t=t.replace(z,"");if(n){He.rel(e,t,n,l)}if(s){He.ael(e,t,s,l)}}}else{const f=$(s);if((i||f&&s!==null)&&!l){try{if(!e.tagName.includes("-")){const l=s==null?"":s;if(t==="list"){i=false}else if(n==null||e[t]!=l){e[t]=l}}else{e[t]=s}}catch(e){}}let r=false;{if(c!==(c=c.replace(/^xlink\:?/,""))){t=c;r=true}}if(s==null||s===false){if(s!==false||e.getAttribute(t)===""){if(r){e.removeAttributeNS(m,t)}else{e.removeAttribute(t)}}}else if((!i||o&4||l)&&!f){s=s===true?"":s;if(r){e.setAttributeNS(m,t,s)}else{e.setAttribute(t,s)}}}}};const P=/\s/;const W=e=>!e?[]:e.split(P);const E="Capture";const z=new RegExp(E+"$");const B=(e,t,n,s)=>{const l=t.h.nodeType===11&&t.h.host?t.h.host:t.h;const o=e&&e.o||b;const i=t.o||b;{for(s of H(Object.keys(o))){if(!(s in i)){N(l,s,o[s],undefined,n,t.v)}}}for(s of H(Object.keys(i))){N(l,s,o[s],i[s],n,t.v)}};function H(e){return e.includes("ref")?[...e.filter((e=>e!=="ref")),"ref"]:e}const Q=(e,t,i,r)=>{var a;const u=t.i[i];let d=0;let p;let v;let m;if(!o){c=true;if(u.m==="slot"){if(n){r.classList.add(n+"-s")}u.v|=u.i?2:1}}if(u.l!==null){p=u.h=Be.createTextNode(u.l)}else if(u.v&1){p=u.h=Be.createTextNode("")}else{if(!f){f=u.m==="svg"}p=u.h=Be.createElementNS(f?y:w,u.v&2?"slot-fb":u.m);if(f&&u.m==="foreignObject"){f=false}{B(null,u,f)}if(g(n)&&p["s-si"]!==n){p.classList.add(p["s-si"]=n)}if(u.i){for(d=0;d<u.i.length;++d){v=Q(e,u,d,p);if(v){p.appendChild(v)}}}{if(u.m==="svg"){f=false}else if(p.tagName==="foreignObject"){f=true}}}p["s-hn"]=l;{if(u.v&(2|1)){p["s-sr"]=true;p["s-cr"]=s;p["s-sn"]=u.p||"";p["s-rf"]=(a=u.o)===null||a===void 0?void 0:a.ref;m=e&&e.i&&e.i[i];if(m&&m.m===u.m&&e.h){{q(e.h,false)}}}}return p};const q=(e,n)=>{He.v|=1;const s=Array.from(e.childNodes);if(e["s-sr"]&&t.experimentalSlotFixes){let t=e;while(t=t.nextSibling){if(t&&t["s-sn"]===e["s-sn"]&&t["s-sh"]===l){s.push(t)}}}for(let e=s.length-1;e>=0;e--){const t=s[e];if(t["s-hn"]!==l&&t["s-ol"]){G(t).insertBefore(t,_(t));t["s-ol"].remove();t["s-ol"]=undefined;t["s-sh"]=undefined;c=true}if(n){q(t,n)}}He.v&=~1};const I=(e,t,n,s,o,i)=>{let c=e["s-cr"]&&e["s-cr"].parentNode||e;let f;if(c.shadowRoot&&c.tagName===l){c=c.shadowRoot}for(;o<=i;++o){if(s[o]){f=Q(null,n,o,e);if(f){s[o].h=f;c.insertBefore(f,_(t))}}}};const K=(e,t,n)=>{for(let s=t;s<=n;++s){const t=e[s];if(t){const e=t.h;ne(t);if(e){{i=true;if(e["s-ol"]){e["s-ol"].remove()}else{q(e,true)}}e.remove()}}}};const V=(e,t,n,s,l=false)=>{let o=0;let i=0;let c=0;let f=0;let r=t.length-1;let a=t[0];let u=t[r];let d=s.length-1;let p=s[0];let v=s[d];let m;let h;while(o<=r&&i<=d){if(a==null){a=t[++o]}else if(u==null){u=t[--r]}else if(p==null){p=s[++i]}else if(v==null){v=s[--d]}else if(X(a,p,l)){J(a,p,l);a=t[++o];p=s[++i]}else if(X(u,v,l)){J(u,v,l);u=t[--r];v=s[--d]}else if(X(a,v,l)){if(a.m==="slot"||v.m==="slot"){q(a.h.parentNode,false)}J(a,v,l);e.insertBefore(a.h,u.h.nextSibling);a=t[++o];v=s[--d]}else if(X(u,p,l)){if(a.m==="slot"||v.m==="slot"){q(u.h.parentNode,false)}J(u,p,l);e.insertBefore(u.h,a.h);u=t[--r];p=s[++i]}else{c=-1;{for(f=o;f<=r;++f){if(t[f]&&t[f].u!==null&&t[f].u===p.u){c=f;break}}}if(c>=0){h=t[c];if(h.m!==p.m){m=Q(t&&t[i],n,c,e)}else{J(h,p,l);t[c]=undefined;m=h.h}p=s[++i]}else{m=Q(t&&t[i],n,i,e);p=s[++i]}if(m){{G(a.h).insertBefore(m,_(a.h))}}}}if(o>r){I(e,s[d+1]==null?null:s[d+1].h,n,s,i,d)}else if(i>d){K(t,o,r)}};const X=(e,t,n=false)=>{if(e.m===t.m){if(e.m==="slot"){return e.p===t.p}if(!n){return e.u===t.u}return true}return false};const _=e=>e&&e["s-ol"]||e;const G=e=>(e["s-ol"]?e["s-ol"]:e).parentNode;const J=(e,t,n=false)=>{const s=t.h=e.h;const l=e.i;const i=t.i;const c=t.m;const r=t.l;let a;if(r===null){{f=c==="svg"?true:c==="foreignObject"?false:f}{if(c==="slot"&&!o);else{B(e,t,f)}}if(l!==null&&i!==null){V(s,l,t,i,n)}else if(i!==null){if(e.l!==null){s.textContent=""}I(s,null,t,i,0,i.length-1)}else if(l!==null){K(l,0,l.length-1)}if(f&&c==="svg"){f=false}}else if(a=s["s-cr"]){a.parentNode.textContent=r}else if(e.l!==r){s.data=r}};const Y=e=>{const t=e.childNodes;for(const e of t){if(e.nodeType===1){if(e["s-sr"]){const n=e["s-sn"];e.hidden=false;for(const s of t){if(s!==e){if(s["s-hn"]!==e["s-hn"]||n!==""){if(s.nodeType===1&&(n===s.getAttribute("slot")||n===s["s-sn"])){e.hidden=true;break}}else{if(s.nodeType===1||s.nodeType===3&&s.textContent.trim()!==""){e.hidden=true;break}}}}}Y(e)}}};const Z=[];const ee=e=>{let n;let s;let l;for(const o of e.childNodes){if(o["s-sr"]&&(n=o["s-cr"])&&n.parentNode){s=n.parentNode.childNodes;const e=o["s-sn"];for(l=s.length-1;l>=0;l--){n=s[l];if(!n["s-cn"]&&!n["s-nr"]&&n["s-hn"]!==o["s-hn"]&&!t.experimentalSlotFixes){if(te(n,e)){let t=Z.find((e=>e.C===n));i=true;n["s-sn"]=n["s-sn"]||e;if(t){t.C["s-sh"]=o["s-hn"];t.j=o}else{n["s-sh"]=o["s-hn"];Z.push({j:o,C:n})}if(n["s-sr"]){Z.map((e=>{if(te(e.C,n["s-sn"])){t=Z.find((e=>e.C===n));if(t&&!e.j){e.j=t.j}}}))}}else if(!Z.some((e=>e.C===n))){Z.push({C:n})}}}}if(o.nodeType===1){ee(o)}}};const te=(e,t)=>{if(e.nodeType===1){if(e.getAttribute("slot")===null&&t===""){return true}if(e.getAttribute("slot")===t){return true}return false}if(e["s-sn"]===t){return true}return t===""};const ne=e=>{{e.o&&e.o.ref&&e.o.ref(null);e.i&&e.i.map(ne)}};const se=(e,t,f=false)=>{var r,a,u,d;const p=e.$hostElement$;const v=e.S;const m=e.O||C(null,null);const h=O(t)?t:k(null,null,t);l=p.tagName;if(v.R){h.o=h.o||{};v.R.map((([e,t])=>h.o[t]=p[e]))}if(f&&h.o){for(const e of Object.keys(h.o)){if(p.hasAttribute(e)&&!["key","ref","style","class"].includes(e)){h.o[e]=p[e]}}}h.m=null;h.v|=4;e.O=h;h.h=m.h=p.shadowRoot||p;{n=p["s-sc"]}o=(v.v&1)!==0;{s=p["s-cr"];i=false}J(m,h,f);{He.v|=1;if(c){ee(h.h);for(const e of Z){const t=e.C;if(!t["s-ol"]){const e=Be.createTextNode("");e["s-nr"]=t;t.parentNode.insertBefore(t["s-ol"]=e,t)}}for(const e of Z){const t=e.C;const n=e.j;if(n){const e=n.parentNode;let s=n.nextSibling;{let n=(r=t["s-ol"])===null||r===void 0?void 0:r.previousSibling;while(n){let l=(a=n["s-nr"])!==null&&a!==void 0?a:null;if(l&&l["s-sn"]===t["s-sn"]&&e===l.parentNode){l=l.nextSibling;while(l===t||(l===null||l===void 0?void 0:l["s-sr"])){l=l===null||l===void 0?void 0:l.nextSibling}if(!l||!l["s-nr"]){s=l;break}}n=n.previousSibling}}if(!s&&e!==t.parentNode||t.nextSibling!==s){if(t!==s){if(!t["s-hn"]&&t["s-ol"]){t["s-hn"]=t["s-ol"].parentNode.nodeName}e.insertBefore(t,s);if(t.nodeType===1){t.hidden=(u=t["s-ih"])!==null&&u!==void 0?u:false}}}t&&typeof n["s-rf"]==="function"&&n["s-rf"](t)}else{if(t.nodeType===1){if(f){t["s-ih"]=(d=t.hidden)!==null&&d!==void 0?d:false}t.hidden=true}}}}if(i){Y(h.h)}He.v&=~1;Z.length=0}s=undefined};const le=(e,t)=>{if(t&&!e.L&&t["s-p"]){t["s-p"].push(new Promise((t=>e.L=t)))}};const oe=(e,t)=>{{e.v|=16}if(e.v&4){e.v|=512;return}le(e,e.T);const n=()=>ie(e,t);return Ze(n)};const ie=(e,t)=>{const n=u("scheduleUpdate",e.S.k);const s=e.D;let l;if(t){{e.v|=256;if(e.F){e.F.map((([e,t])=>ve(s,e,t)));e.F=undefined}}{l=ve(s,"componentWillLoad")}}else{{l=ve(s,"componentWillUpdate")}}{l=ce(l,(()=>ve(s,"componentWillRender")))}n();return ce(l,(()=>re(e,s,t)))};const ce=(e,t)=>fe(e)?e.then(t):t();const fe=e=>e instanceof Promise||e&&e.then&&typeof e.then==="function";const re=async(e,t,n)=>{var s;const l=e.$hostElement$;const o=u("update",e.S.k);const i=l["s-rc"];if(n){M(e)}const c=u("render",e.S.k);{ae(e,t,l,n)}if(i){i.map((e=>e()));l["s-rc"]=undefined}c();o();{const t=(s=l["s-p"])!==null&&s!==void 0?s:[];const n=()=>ue(e);if(t.length===0){n()}else{Promise.all(t).then(n);e.v|=4;t.length=0}}};const ae=(e,t,n,s)=>{try{t=t.render&&t.render();{e.v&=~16}{e.v|=2}{{{se(e,t,s)}}}}catch(t){Ne(t,e.$hostElement$)}return null};const ue=e=>{const t=e.S.k;const n=e.$hostElement$;const s=u("postUpdate",t);const l=e.D;const o=e.T;{ve(l,"componentDidRender")}if(!(e.v&64)){e.v|=64;{me(n)}{ve(l,"componentDidLoad")}s();{e.A(n);if(!o){pe()}}}else{{ve(l,"componentDidUpdate")}s()}{e.M(n)}{if(e.L){e.L();e.L=undefined}if(e.v&512){Je((()=>oe(e,false)))}e.v&=~(4|512)}};const de=e=>{{const t=Fe(e);const n=t.$hostElement$.isConnected;if(n&&(t.v&(2|16))===2){oe(t,false)}return n}};const pe=t=>{{me(Be.documentElement)}Je((()=>T(ze,"appload",{detail:{namespace:e}})))};const ve=(e,t,n)=>{if(e&&e[t]){try{return e[t](n)}catch(e){Ne(e)}}return undefined};const me=e=>e.classList.add("hydrated");const he=(e,t)=>Fe(e).U.get(t);const be=(e,t,n,s)=>{const l=Fe(e);const o=l.$hostElement$;const i=l.U.get(t);const c=l.v;const f=l.D;n=R(n,s.N[t][0]);const r=Number.isNaN(i)&&Number.isNaN(n);const a=n!==i&&!r;if((!(c&8)||i===undefined)&&a){l.U.set(t,n);if(f){if(s.P&&c&128){const e=s.P[t];if(e){e.map((e=>{try{f[e](n,i,t)}catch(e){Ne(e,o)}}))}}if((c&(2|16))===2){if(f.componentShouldUpdate){if(f.componentShouldUpdate(n,i,t)===false){return}}oe(l,false)}}}};const ye=(e,t,n)=>{var s;const l=e.prototype;if(t.v&64&&n&1){h.forEach((e=>Object.defineProperty(l,e,{value(...t){const n=Fe(this);const s=n.D;if(!s){n.W.then((n=>{const s=n[e];typeof s==="function"&&s.call(n,...t)}))}else{const n=s[e];typeof n==="function"&&n.call(s,...t)}}})))}if(t.N){if(e.watchers){t.P=e.watchers}const o=Object.entries(t.N);o.map((([e,[s]])=>{if(s&31||n&2&&s&32){Object.defineProperty(l,e,{get(){return he(this,e)},set(n){be(this,e,n,t)},configurable:true,enumerable:true})}else if(n&1&&s&64){Object.defineProperty(l,e,{value(...t){var n;const s=Fe(this);return(n=s===null||s===void 0?void 0:s.B)===null||n===void 0?void 0:n.then((()=>{var n;return(n=s.D)===null||n===void 0?void 0:n[e](...t)}))}})}}));if(n&1){const n=new Map;l.attributeChangedCallback=function(e,s,o){He.jmp((()=>{var i;const c=n.get(e);if(this.hasOwnProperty(c)){o=this[c];delete this[c]}else if(l.hasOwnProperty(c)&&typeof this[c]==="number"&&this[c]==o){return}else if(c==null){const n=Fe(this);const l=n===null||n===void 0?void 0:n.v;if(l&&!(l&8)&&l&128&&o!==s){const l=n.D;const c=(i=t.P)===null||i===void 0?void 0:i[e];c===null||c===void 0?void 0:c.forEach((t=>{if(l[t]!=null){l[t].call(l,o,s,e)}}))}return}this[c]=o===null&&typeof this[c]==="boolean"?false:o}))};e.observedAttributes=Array.from(new Set([...Object.keys((s=t.P)!==null&&s!==void 0?s:{}),...o.filter((([e,t])=>t[0]&15)).map((([e,s])=>{var l;const o=s[1]||e;n.set(o,e);if(s[0]&512){(l=t.R)===null||l===void 0?void 0:l.push([e,o])}return o}))]))}}return e};const we=async(e,t,n,s)=>{let l;if((t.v&32)===0){t.v|=32;const s=n.H;if(s){l=We(n);if(l.then){const e=d();l=await l;e()}if(!l.isProxied){{n.P=l.watchers}ye(l,n,2);l.isProxied=true}const e=u("createInstance",n.k);{t.v|=8}try{new l(t)}catch(e){Ne(e)}{t.v&=~8}{t.v|=128}e();ge(t.D)}else{l=e.constructor;customElements.whenDefined(n.k).then((()=>t.v|=128))}if(l.style){let e=l.style;const t=U(n);if(!Ee.has(t)){const s=u("registerStyles",n.k);F(t,e,!!(n.v&1));s()}}}const o=t.T;const i=()=>oe(t,true);if(o&&o["s-rc"]){o["s-rc"].push(i)}else{i()}};const ge=e=>{{ve(e,"connectedCallback")}};const $e=e=>{if((He.v&1)===0){const t=Fe(e);const n=t.S;const s=u("connectedCallback",n.k);if(!(t.v&1)){t.v|=1;{if(n.v&(4|8)){Se(e)}}{let n=e;while(n=n.parentNode||n.host){if(n["s-p"]){le(t,t.T=n);break}}}if(n.N){Object.entries(n.N).map((([t,[n]])=>{if(n&31&&e.hasOwnProperty(t)){const n=e[t];delete e[t];e[t]=n}}))}{we(e,t,n)}}else{Oe(e,t,n.q);if(t===null||t===void 0?void 0:t.D){ge(t.D)}else if(t===null||t===void 0?void 0:t.W){t.W.then((()=>ge(t.D)))}}s()}};const Se=e=>{const t=e["s-cr"]=Be.createComment("");t["s-cn"]=true;e.insertBefore(t,e.firstChild)};const ke=e=>{{ve(e,"disconnectedCallback")}};const Ce=async e=>{if((He.v&1)===0){const t=Fe(e);{if(t.I){t.I.map((e=>e()));t.I=undefined}}if(t===null||t===void 0?void 0:t.D){ke(t.D)}else if(t===null||t===void 0?void 0:t.W){t.W.then((()=>ke(t.D)))}}};const je=(e,t={})=>{var n;const s=u();const l=[];const o=t.exclude||[];const i=ze.customElements;const c=Be.head;const f=c.querySelector("meta[charset]");const r=Be.createElement("style");const a=[];let d;let m=true;Object.assign(He,t);He.t=new URL(t.resourcesUrl||"./",Be.baseURI).href;let h=false;e.map((e=>{e[1].map((t=>{var n;const s={v:t[0],k:t[1],N:t[2],q:t[3]};if(s.v&4){h=true}{s.N=t[2]}{s.q=t[3]}{s.R=[]}{s.P=(n=t[4])!==null&&n!==void 0?n:{}}const c=s.k;const f=class extends HTMLElement{constructor(e){super(e);e=this;Me(e,s);if(s.v&1){{{e.attachShadow({mode:"open",delegatesFocus:!!(s.v&16)})}}}}connectedCallback(){if(d){clearTimeout(d);d=null}if(m){a.push(this)}else{He.jmp((()=>$e(this)))}}disconnectedCallback(){He.jmp((()=>Ce(this)))}componentOnReady(){return Fe(this).W}};if(s.v&64){f.formAssociated=true}s.H=e[0];if(!o.includes(c)&&!i.get(c)){l.push(c);i.define(c,ye(f,s,1))}}))}));if(l.length>0){if(h){r.textContent+=v}{r.textContent+=l+p}if(r.innerHTML.length){r.setAttribute("data-styles","");const e=(n=He.$)!==null&&n!==void 0?n:S(Be);if(e!=null){r.setAttribute("nonce",e)}c.insertBefore(r,f?f.nextSibling:c.firstChild)}}m=false;if(a.length){a.map((e=>e.connectedCallback()))}else{{He.jmp((()=>d=setTimeout(pe,30)))}}s()};const Oe=(e,t,n,s)=>{if(n){n.map((([n,s,l])=>{const o=xe(e,n);const i=Re(t,l);const c=Le(n);He.ael(o,s,i,c);(t.I=t.I||[]).push((()=>He.rel(o,s,i,c)))}))}};const Re=(e,t)=>n=>{try{{if(e.v&256){e.D[t](n)}else{(e.F=e.F||[]).push([t,n])}}}catch(e){Ne(e)}};const xe=(e,t)=>{if(t&8)return ze;return e};const Le=e=>Qe?{passive:(e&1)!==0,capture:(e&2)!==0}:(e&2)!==0;const Te=e=>He.$=e;const De=new WeakMap;const Fe=e=>De.get(e);const Ae=(e,t)=>De.set(t.D=e,t);const Me=(e,t)=>{const n={v:0,$hostElement$:e,S:t,U:new Map};{n.B=new Promise((e=>n.M=e))}{n.W=new Promise((e=>n.A=e));e["s-p"]=[];e["s-rc"]=[]}Oe(e,n,t.q);return De.set(e,n)};const Ue=(e,t)=>t in e;const Ne=(e,t)=>(0,console.error)(e,t);const Pe=new Map;const We=(e,t,n)=>{const s=e.k.replace(/-/g,"_");const l=e.H;const o=Pe.get(l);if(o){return o[s]}
/*!__STENCIL_STATIC_IMPORT_SWITCH__*/return import(`./${l}.entry.js${""}`).then((e=>{{Pe.set(l,e)}return e[s]}),Ne)};const Ee=new Map;const ze=typeof window!=="undefined"?window:{};const Be=ze.document||{head:{}};const He={v:0,t:"",jmp:e=>e(),raf:e=>requestAnimationFrame(e),ael:(e,t,n,s)=>e.addEventListener(t,n,s),rel:(e,t,n,s)=>e.removeEventListener(t,n,s),ce:(e,t)=>new CustomEvent(e,t)};const Qe=(()=>{let e=false;try{Be.addEventListener("e",null,Object.defineProperty({},"passive",{get(){e=true}}))}catch(e){}return e})();const qe=e=>Promise.resolve(e);const Ie=(()=>{try{new CSSStyleSheet;return typeof(new CSSStyleSheet).replaceSync==="function"}catch(e){}return false})();const Ke=[];const Ve=[];const Xe=(e,t)=>n=>{e.push(n);if(!r){r=true;if(t&&He.v&4){Je(Ge)}else{He.raf(Ge)}}};const _e=e=>{for(let t=0;t<e.length;t++){try{e[t](performance.now())}catch(e){Ne(e)}}e.length=0};const Ge=()=>{_e(Ke);{_e(Ve);if(r=Ke.length>0){He.raf(Ge)}}};const Je=e=>qe().then(e);const Ye=Xe(Ke,false);const Ze=Xe(Ve,true);export{j as H,Ye as a,je as b,L as c,a as d,de as f,x as g,k as h,qe as p,Ae as r,Te as s,Ze as w};
//# sourceMappingURL=p-7af91c05.js.map