const e="[A-Za-z$_][0-9A-Za-z$_]*",n=["as","in","of","if","for","while","finally","var","new","function","do","return","void","else","break","catch","instanceof","with","throw","case","default","try","switch","continue","typeof","delete","let","yield","const","class","debugger","async","await","static","import","from","export","extends"],a=["true","false","null","undefined","NaN","Infinity"],t=["Object","Function","Boolean","Symbol","Math","Date","Number","BigInt","String","RegExp","Array","Float32Array","Float64Array","Int8Array","Uint8Array","Uint8ClampedArray","Int16Array","Int32Array","Uint16Array","Uint32Array","BigInt64Array","BigUint64Array","Set","Map","WeakSet","WeakMap","ArrayBuffer","SharedArrayBuffer","Atomics","DataView","JSON","Promise","Generator","GeneratorFunction","AsyncFunction","Reflect","Proxy","Intl","WebAssembly"],s=["Error","EvalError","InternalError","RangeError","ReferenceError","SyntaxError","TypeError","URIError"],r=["setInterval","setTimeout","clearInterval","clearTimeout","require","exports","eval","isFinite","isNaN","parseFloat","parseInt","decodeURI","decodeURIComponent","encodeURI","encodeURIComponent","escape","unescape"],c=["arguments","this","super","console","window","document","localStorage","sessionStorage","module","global"],i=[].concat(r,t,s);function o(o){const l=o.regex,b=(e,{after:n})=>{const a="</"+e[0].slice(1);return e.input.indexOf(a,n)!==-1},d=e,u={begin:"<>",end:"</>"},g=/<[A-Za-z0-9\\._:-]+\s*\/>/,m={begin:/<[A-Za-z0-9\\._:-]+/,end:/\/[A-Za-z0-9\\._:-]+>|\/>/,isTrulyOpeningTag:(e,n)=>{const a=e[0].length+e.index,t=e.input[a];if(t==="<"||t===","){n.ignoreMatch();return}t===">"&&(b(e,{after:a})||n.ignoreMatch());let s;const r=e.input.substring(a);if(s=r.match(/^\s*=/)){n.ignoreMatch();return}if((s=r.match(/^\s+extends\s+/))&&s.index===0){n.ignoreMatch();return}}},y={$pattern:e,keyword:n,literal:a,built_in:i,"variable.language":c},f="[0-9](_?[0-9])*",p=`\\.(${f})`,v="0|[1-9](_?[0-9])*|0[0-7]*[89][0-9]*",A={className:"number",variants:[{begin:`(\\b(${v})((${p})|\\.)?|(${p}))[eE][+-]?(${f})\\b`},{begin:`\\b(${v})\\b((${p})\\b|\\.)?|(${p})\\b`},{begin:"\\b(0|[1-9](_?[0-9])*)n\\b"},{begin:"\\b0[xX][0-9a-fA-F](_?[0-9a-fA-F])*n?\\b"},{begin:"\\b0[bB][0-1](_?[0-1])*n?\\b"},{begin:"\\b0[oO][0-7](_?[0-7])*n?\\b"},{begin:"\\b0[0-7]+n?\\b"}],relevance:0},w={className:"subst",begin:"\\$\\{",end:"\\}",keywords:y,contains:[]},h={begin:"html`",end:"",starts:{end:"`",returnEnd:!1,contains:[o.BACKSLASH_ESCAPE,w],subLanguage:"xml"}},N={begin:"css`",end:"",starts:{end:"`",returnEnd:!1,contains:[o.BACKSLASH_ESCAPE,w],subLanguage:"css"}},k={begin:"gql`",end:"",starts:{end:"`",returnEnd:!1,contains:[o.BACKSLASH_ESCAPE,w],subLanguage:"graphql"}},x={className:"string",begin:"`",end:"`",contains:[o.BACKSLASH_ESCAPE,w]},E={className:"comment",variants:[o.COMMENT(/\/\*\*(?!\/)/,"\\*/",{relevance:0,contains:[{begin:"(?=@[A-Za-z]+)",relevance:0,contains:[{className:"doctag",begin:"@[A-Za-z]+"},{className:"type",begin:"\\{",end:"\\}",excludeEnd:!0,excludeBegin:!0,relevance:0},{className:"variable",begin:d+"(?=\\s*(-)|$)",endsParent:!0,relevance:0},{begin:/(?=[^\n])\s/,relevance:0}]}]}),o.C_BLOCK_COMMENT_MODE,o.C_LINE_COMMENT_MODE]},_=[o.APOS_STRING_MODE,o.QUOTE_STRING_MODE,h,N,k,x,{match:/\$\d+/},A];w.contains=_.concat({begin:/\{/,end:/\}/,keywords:y,contains:["self"].concat(_)});const $=[].concat(E,w.contains),Z=$.concat([{begin:/\(/,end:/\)/,keywords:y,contains:["self"].concat($)}]),I={className:"params",begin:/\(/,end:/\)/,excludeBegin:!0,excludeEnd:!0,keywords:y,contains:Z},z={variants:[{match:[/class/,/\s+/,d,/\s+/,/extends/,/\s+/,l.concat(d,"(",l.concat(/\./,d),")*")],scope:{1:"keyword",3:"title.class",5:"keyword",7:"title.class.inherited"}},{match:[/class/,/\s+/,d],scope:{1:"keyword",3:"title.class"}}]},S={relevance:0,match:l.either(/\bJSON/,/\b[A-Z][a-z]+([A-Z][a-z]*|\d)*/,/\b[A-Z]{2,}([A-Z][a-z]+|\d)+([A-Z][a-z]*)*/,/\b[A-Z]{2,}[a-z]+([A-Z][a-z]+|\d)*([A-Z][a-z]*)*/),className:"title.class",keywords:{_:[...t,...s]}},B={label:"use_strict",className:"meta",relevance:10,begin:/^\s*['"]use (strict|asm)['"]/},R={variants:[{match:[/function/,/\s+/,d,/(?=\s*\()/]},{match:[/function/,/\s*(?=\()/]}],className:{1:"keyword",3:"title.function"},label:"func.def",contains:[I],illegal:/%/},F={relevance:0,match:/\b[A-Z][A-Z_0-9]+\b/,className:"variable.constant"};function U(e){return l.concat("(?!",e.join("|"),")")}const j={match:l.concat(/\b/,U([...r,"super","import"]),d,l.lookahead(/\(/)),className:"title.function",relevance:0},O={begin:l.concat(/\./,l.lookahead(l.concat(d,/(?![0-9A-Za-z$_(])/))),end:d,excludeBegin:!0,keywords:"prototype",className:"property",relevance:0},T={match:[/get|set/,/\s+/,d,/(?=\()/],className:{1:"keyword",3:"title.function"},contains:[{begin:/\(\)/},I]},C="(\\([^()]*(\\([^()]*(\\([^()]*\\)[^()]*)*\\)[^()]*)*\\)|"+o.UNDERSCORE_IDENT_RE+")\\s*=>",L={match:[/const|var|let/,/\s+/,d,/\s*/,/=\s*/,/(async\s*)?/,l.lookahead(C)],keywords:"async",className:{1:"keyword",3:"title.function"},contains:[I]};return{name:"JavaScript",aliases:["js","jsx","mjs","cjs"],keywords:y,exports:{PARAMS_CONTAINS:Z,CLASS_REFERENCE:S},illegal:/#(?![$_A-z])/,contains:[o.SHEBANG({label:"shebang",binary:"node",relevance:5}),B,o.APOS_STRING_MODE,o.QUOTE_STRING_MODE,h,N,k,x,E,{match:/\$\d+/},A,S,{className:"attr",begin:d+l.lookahead(":"),relevance:0},L,{begin:"("+o.RE_STARTERS_RE+"|\\b(case|return|throw)\\b)\\s*",keywords:"return throw case",relevance:0,contains:[E,o.REGEXP_MODE,{className:"function",begin:C,returnBegin:!0,end:"\\s*=>",contains:[{className:"params",variants:[{begin:o.UNDERSCORE_IDENT_RE,relevance:0},{className:null,begin:/\(\s*\)/,skip:!0},{begin:/\(/,end:/\)/,excludeBegin:!0,excludeEnd:!0,keywords:y,contains:Z}]}]},{begin:/,/,relevance:0},{match:/\s+/,relevance:0},{variants:[{begin:u.begin,end:u.end},{match:g},{begin:m.begin,"on:begin":m.isTrulyOpeningTag,end:m.end}],subLanguage:"xml",contains:[{begin:m.begin,end:m.end,skip:!0,contains:["self"]}]}]},R,{beginKeywords:"while if switch catch for"},{begin:"\\b(?!function)"+o.UNDERSCORE_IDENT_RE+"\\([^()]*(\\([^()]*(\\([^()]*\\)[^()]*)*\\)[^()]*)*\\)\\s*\\{",returnBegin:!0,label:"func.def",contains:[I,o.inherit(o.TITLE_MODE,{begin:d,className:"title.function"})]},{match:/\.\.\./,relevance:0},O,{match:"\\$"+d,relevance:0},{match:[/\bconstructor(?=\s*\()/],className:{1:"title.function"},contains:[I]},j,F,z,T,{match:/\$[(.]/}]}}function l(t){const s=o(t),r=e,l=["any","void","number","boolean","string","object","never","symbol","bigint","unknown"],b={beginKeywords:"namespace",end:/\{/,excludeEnd:!0,contains:[s.exports.CLASS_REFERENCE]},d={beginKeywords:"interface",end:/\{/,excludeEnd:!0,keywords:{keyword:"interface extends",built_in:l},contains:[s.exports.CLASS_REFERENCE]},u={className:"meta",relevance:10,begin:/^\s*['"]use strict['"]/},g=["type","namespace","interface","public","private","protected","implements","declare","abstract","readonly","enum","override"],m={$pattern:e,keyword:n.concat(g),literal:a,built_in:i.concat(l),"variable.language":c},y={className:"meta",begin:"@"+r},f=(e,n,a)=>{const t=e.contains.findIndex((e=>e.label===n));if(t===-1)throw new Error("can not find mode to replace");e.contains.splice(t,1,a)};Object.assign(s.keywords,m),s.exports.PARAMS_CONTAINS.push(y),s.contains=s.contains.concat([y,b,d]),f(s,"shebang",t.SHEBANG()),f(s,"use_strict",u);const p=s.contains.find((e=>e.label==="func.def"));return p.relevance=0,Object.assign(s,{name:"TypeScript",aliases:["ts","tsx","mts","cts"]}),s}export{l as default};
//# sourceMappingURL=p-ec97ed8f.js.map