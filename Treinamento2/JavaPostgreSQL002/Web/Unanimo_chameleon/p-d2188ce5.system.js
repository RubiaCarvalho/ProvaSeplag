System.register([],(function(e){"use strict";return{execute:function(){e("default",n);function n(e){var n={variants:[e.COMMENT("--","$"),e.COMMENT(/\{-/,/-\}/,{contains:["self"]})]},i={className:"type",begin:"\\b[A-Z][\\w']*",relevance:0},s={begin:"\\(",end:"\\)",illegal:'"',contains:[{className:"type",begin:"\\b[A-Z][\\w]*(\\((\\.\\.|,|\\w+)\\))?"},n]},t={begin:/\{/,end:/\}/,contains:s.contains},o={className:"string",begin:"'\\\\?.",end:"'",illegal:"."};return{name:"Elm",keywords:["let","in","if","then","else","case","of","where","module","import","exposing","type","alias","as","infix","infixl","infixr","port","effect","command","subscription"],contains:[{beginKeywords:"port effect module",end:"exposing",keywords:"port effect module where command subscription exposing",contains:[s,n],illegal:"\\W\\.|;"},{begin:"import",end:"$",keywords:"import as exposing",contains:[s,n],illegal:"\\W\\.|;"},{begin:"type",end:"$",keywords:"type alias",contains:[i,s,t,n]},{beginKeywords:"infix infixl infixr",end:"$",contains:[e.C_NUMBER_MODE,n]},{begin:"port",end:"$",keywords:"port",contains:[n]},o,e.QUOTE_STRING_MODE,e.C_NUMBER_MODE,i,e.inherit(e.TITLE_MODE,{begin:"^[_a-z][\\w']*"}),n,{begin:"->|<-"}],illegal:/;/}}}}}));
//# sourceMappingURL=p-d2188ce5.system.js.map