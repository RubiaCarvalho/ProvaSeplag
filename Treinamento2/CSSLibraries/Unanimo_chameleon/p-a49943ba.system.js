System.register(["./p-62fc4e49.system.js"],(function(t){"use strict";var n;return{setters:[function(t){n=t.g}],execute:function(){t("C",r);var i={triggerEvents:"click",exclude:""};function r(t){if(t===void 0){t=i}return function(i,r){var c=i.connectedCallback,f=i.disconnectedCallback;i.connectedCallback=function(){var i=n(this);var u=this[r];e(this,i,u,t);return c&&c.call(this)};i.disconnectedCallback=function(){var i=n(this);var e=this[r];u(this,i,e,t);return f&&f.call(this)}}}function e(t,n,r,e){if(e===void 0){e=i}var u=o(e);f(e).forEach((function(i){window.addEventListener(i,(function(i){c(i,t,n,r,u)}),false)}))}function u(t,n,r,e){if(e===void 0){e=i}f(e).forEach((function(i){window.removeEventListener(i,(function(i){c(i,t,n,r)}),false)}))}function c(t,n,i,r,e){var u=t.target;if(!i.contains(u)&&!s(u,e)){r.call(n)}}function f(t){if(t.triggerEvents){return t.triggerEvents.split(",").map((function(t){return t.trim()}))}return["click"]}function o(t){if(t.exclude){try{return Array.from(document.querySelectorAll(t.exclude))}catch(n){console.warn("@ClickOutside: Exclude: '".concat(t.exclude,"' will not be evaluated. Check your exclude selector syntax."),n)}}return}function s(t,n){if(t&&n){for(var i=0,r=n;i<r.length;i++){var e=r[i];if(e.contains(t)){return true}}}return false}}}}));
//# sourceMappingURL=p-a49943ba.system.js.map