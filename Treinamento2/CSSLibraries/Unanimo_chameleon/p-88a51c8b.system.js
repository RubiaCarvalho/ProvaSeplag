System.register([],(function(e){"use strict";return{execute:function(){e("default",n);function n(e){var n={keyword:["rec","with","let","in","inherit","assert","if","else","then"],literal:["true","false","or","and","null"],built_in:["import","abort","baseNameOf","dirOf","isNull","builtins","map","removeAttrs","throw","toString","derivation"]},t={className:"subst",begin:/\$\{/,end:/\}/,keywords:n},i={className:"char.escape",begin:/''\$/},a={begin:/[a-zA-Z0-9-_]+(\s*=)/,returnBegin:!0,relevance:0,contains:[{className:"attr",begin:/\S+/,relevance:.2}]},s={className:"string",contains:[i,t],variants:[{begin:"''",end:"''"},{begin:'"',end:'"'}]},r=[e.NUMBER_MODE,e.HASH_COMMENT_MODE,e.C_BLOCK_COMMENT_MODE,s,a];return t.contains=r,{name:"Nix",aliases:["nixos"],keywords:n,contains:r}}}}}));
//# sourceMappingURL=p-88a51c8b.system.js.map