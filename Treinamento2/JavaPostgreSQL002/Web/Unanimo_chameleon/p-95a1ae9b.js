const t=true;let n;let e;const o=(t,e)=>{n??=new Map;n.set(t,e)};const s=t=>{n.delete(t)};const c=o=>{if(!n){return}const s=e.get(o);if(!s){return}let c=s.getSubscriberRef();while(c!==document.body&&!n.has(c.id)){let t=c.parentElement;if(t===null&&c.parentNode instanceof ShadowRoot){t=c.parentNode.host}c=t}s.observerCallback(n.get(c.id)??t)};const a=(t,n)=>{let e=n;while(e!==document.body&&e.id!==t){let t=e.parentElement;if(t===null&&e.parentNode instanceof ShadowRoot){t=e.parentNode.host}e=t}return e!==document.body};const l=(t,n)=>{e??=new Map;e.set(t,n)};const r=t=>{e.delete(t)};const i=(t,o)=>{n??=new Map;n.set(t,o);if(!e){return}e.forEach((n=>{const e=n.getSubscriberRef();if(a(t,e)){n.observerCallback(o)}}))};export{c as a,o as b,s as c,i as n,r,l as s};
//# sourceMappingURL=p-95a1ae9b.js.map