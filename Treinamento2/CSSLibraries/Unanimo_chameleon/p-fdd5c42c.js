const n="button";const t="img";const s="page";const e="page-container";const o="page-name";const c="tab-list";const i={BUTTON:n,IMAGE:t,PAGE:s,PAGE_CONTAINER:e,PAGE_NAME:o,TAB_LIST:c};const a={BUTTON:n+" block",IMAGE:t+" block",PAGE:s+" block",PAGE_CONTAINER:e+" block",PAGE_NAME:o+" block",TAB_LIST:c+" block"};const l={BUTTON:n+" inline",IMAGE:t+" inline",PAGE:s+" inline",PAGE_CONTAINER:e+" inline",PAGE_NAME:o+" inline",TAB_LIST:c+" inline"};const b=n=>`caption-${n}`;const A=n=>`page-${n}`;const E="close-button";const r="drag-preview";const T="drag-preview-element";const d="drag-preview--outside-tab-list";const k="drag-preview--inside-tab-list__block";const _="drag-preview--inside-tab-list__inline";const G="selected";const N=[...Object.values(i),E,r,T,d,k,_,G];const g=N.join(",");const p=g+",inline,inline:start";const P=g+",inline,inline:end";const I=g+",block,block:start";const O=g+",block,block:end";const B=n=>n.map((n=>b(n.id))).join(",");const M={"inline-start":n=>p+","+B(n),"inline-end":n=>P+","+B(n),"block-start":n=>I+","+B(n),"block-end":n=>O+","+B(n)};export{b as C,T as D,i as L,A as P,G as S,E as a,a as b,l as c,r as d,d as e,_ as f,k as g,M as t};
//# sourceMappingURL=p-fdd5c42c.js.map