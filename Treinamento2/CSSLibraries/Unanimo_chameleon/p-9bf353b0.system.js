System.register([],(function(e){"use strict";return{execute:function(){e("default",a);function a(e){var a={className:"string",variants:[e.inherit(e.QUOTE_STRING_MODE,{begin:'((u8?|U)|L)?"'}),{begin:'(u8?|U)?R"',end:'"',contains:[e.BACKSLASH_ESCAPE]},{begin:"'\\\\?.",end:"'",illegal:"."}]},n={className:"number",variants:[{begin:"\\b(\\d+(\\.\\d*)?|\\.\\d+)(u|U|l|L|ul|UL|f|F)"},{begin:e.C_NUMBER_RE}],relevance:0},s={className:"meta",begin:"#",end:"$",keywords:{keyword:"if else elif endif define undef ifdef ifndef"},contains:[{begin:/\\\n/,relevance:0},{beginKeywords:"include",end:"$",keywords:{keyword:"include"},contains:[e.inherit(a,{className:"string"}),{className:"string",begin:"<",end:">",illegal:"\\n"}]},a,e.C_LINE_COMMENT_MODE,e.C_BLOCK_COMMENT_MODE]},i={className:"variable",begin:/&[a-z\d_]*\b/},c={className:"keyword",begin:"/[a-z][a-z\\d-]*/"},l={className:"symbol",begin:"^\\s*[a-zA-Z_][a-zA-Z\\d_]*:"},t={className:"params",relevance:0,begin:"<",end:">",contains:[n,i]},r={className:"title.class",begin:/[a-zA-Z_][a-zA-Z\d_@-]*(?=\s\{)/,relevance:.2},d={className:"title.class",begin:/^\/(?=\s*\{)/,relevance:10},o={match:/[a-z][a-z-,]+(?=;)/,relevance:0,scope:"attr"},b={relevance:0,match:[/[a-z][a-z-,]+/,/\s*/,/=/],scope:{1:"attr",3:"operator"}},g={scope:"punctuation",relevance:0,match:/\};|[;{}]/};return{name:"Device Tree",contains:[d,i,c,l,r,b,o,t,e.C_LINE_COMMENT_MODE,e.C_BLOCK_COMMENT_MODE,n,a,s,g,{begin:e.IDENT_RE+"::",keywords:""}]}}}}}));
//# sourceMappingURL=p-9bf353b0.system.js.map