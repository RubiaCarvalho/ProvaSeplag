var __spreadArray=this&&this.__spreadArray||function(i,t,n){if(n||arguments.length===2)for(var e=0,o=t.length,s;e<o;e++){if(s||!(e in t)){if(!s)s=Array.prototype.slice.call(t,0,e);s[e]=t[e]}}return i.concat(s||Array.prototype.slice.call(t))};System.register(["./p-62fc4e49.system.js"],(function(i){"use strict";var t,n,e;return{setters:[function(i){t=i.r;n=i.h;e=i.H}],execute:function(){var o="ch-notifications{--ch-notification-item-rtl-initial-X:1;display:-ms-flexbox;display:flex;-ms-flex-direction:column;flex-direction:column;gap:14px;position:fixed;inset-block-end:86px;width:425px;max-width:75vw}ch-notifications.ch-notifications-position--bottom-end{--ch-notification-item-initial-X:var(--ch-notification-item-rtl-initial-X);inset-inline-end:70px}ch-notifications.ch-notifications-position--bottom-start{--ch-notification-item-initial-X:calc(\n    var(--ch-notification-item-rtl-initial-X) * -1\n  );inset-inline-start:70px}";var s=o;var a=i("ch_notifications",function(){function i(i){var n=this;this.didLoad=false;this.lastNotificationID=0;this.currentNotifications=new Map;this.getMessages=function(){return __spreadArray([],n.currentNotifications.values(),true)};this.getTimeToDismiss=function(){return n.timeType==="Seconds"?n.timeToDismissNotifications*1e3:n.timeToDismissNotifications};t(this,i);this.notificationsSize=0;this.delayToAnimateNewNotifications=50;this.notifications=[];this.position="bottom-end";this.timeToDismissNotifications=5e3;this.timeType="Milliseconds"}i.prototype.handleNewNotificationsChange=function(i){if(this.didLoad){this.addNewNotifications(i)}};i.prototype.handleNotificationClick=function(i){var t=this.currentNotifications.get(i.detail);if(!t){return}if(t.closeOnClick){this.currentNotifications.delete(i.detail);this.notificationsSize--}};i.prototype.handleNotificationDismiss=function(i){this.currentNotifications.delete(i.detail);this.notificationsSize--};i.prototype.addNewNotifications=function(i){var t=this;if(!i){return}var n=0;i.forEach((function(i){var e;var o=(e=i.Id)!==null&&e!==void 0?e:t.lastNotificationID;if(!i.Id){t.lastNotificationID++}i.Id=o;i.delayToAnimate=n;t.currentNotifications.set(o,i);n++}))};i.prototype.componentWillLoad=function(){this.addNewNotifications(this.notifications)};i.prototype.componentDidLoad=function(){this.didLoad=true};i.prototype.render=function(){var i=this;var t=this.getMessages();return n(e,{key:"a12d650880f3a2c68a6239b0a0d99ae9cf9214a6",tabindex:t.length>0?"0":undefined,role:"alert","aria-atomic":"true",class:"ch-notifications-position--".concat(this.position)},t.map((function(t){var e=t.Id,o=t.Value,s=t.Class,a=t.delayToAnimate;return n("ch-notifications-item",{id:e.toString(),key:e,class:s,style:{"--delay-to-animate":"".concat(a*i.delayToAnimateNewNotifications,"ms")},"time-to-dismiss":i.getTimeToDismiss()+a*i.delayToAnimateNewNotifications,innerHTML:o})})))};Object.defineProperty(i,"watchers",{get:function(){return{notifications:["handleNewNotificationsChange"]}},enumerable:false,configurable:true});return i}());a.style=s}}}));
//# sourceMappingURL=p-c3632251.system.entry.js.map