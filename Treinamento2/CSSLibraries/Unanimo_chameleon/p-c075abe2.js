import{q as t}from"./p-edf73e81.js";import"./p-7af91c05.js";var n=Object.defineProperty,r=Object.getOwnPropertyDescriptor,e=Object.getOwnPropertyNames,i=Object.prototype.hasOwnProperty,o=(t,o,u,s)=>{if(o&&typeof o=="object"||typeof o=="function")for(let c of e(o))i.call(t,c)||c===u||n(t,c,{get:()=>o[c],enumerable:!(s=r(o,c))||s.enumerable});return t},u={};o(u,t,"default");var s,c,a,f,d,h,v,l,g,m,p,w,b,j,x,k,D,E,R,y,A,I,O,S,T,C,N,W,F,L,M,_,z,H,P,U,q,$,V,B,G,J,K,Q,X,Y,Z,tt,nt,rt=class{constructor(t){this._defaults=t,this._worker=null,this._client=null,this._idleCheckInterval=window.setInterval((()=>this._checkIfIdle()),3e4),this._lastUsedTime=0,this._configChangeListener=this._defaults.onDidChange((()=>this._stopWorker()))}_stopWorker(){this._worker&&(this._worker.dispose(),this._worker=null),this._client=null}dispose(){clearInterval(this._idleCheckInterval),this._configChangeListener.dispose(),this._stopWorker()}_checkIfIdle(){this._worker&&Date.now()-this._lastUsedTime>12e4&&this._stopWorker()}_getClient(){return this._lastUsedTime=Date.now(),this._client||(this._worker=u.editor.createWebWorker({moduleId:"vs/language/css/cssWorker",label:this._defaults.languageId,createData:{options:this._defaults.options,languageId:this._defaults.languageId}}),this._client=this._worker.getProxy()),this._client}getLanguageServiceWorker(...t){let n;return this._getClient().then((t=>{n=t})).then((n=>{if(this._worker)return this._worker.withSyncedResources(t)})).then((t=>n))}};(c=s||(s={})).MIN_VALUE=-2147483648,c.MAX_VALUE=2147483647,(f=a||(a={})).MIN_VALUE=0,f.MAX_VALUE=2147483647,(h=d||(d={})).create=function(t,n){return t===Number.MAX_VALUE&&(t=a.MAX_VALUE),n===Number.MAX_VALUE&&(n=a.MAX_VALUE),{line:t,character:n}},h.is=function(t){var n=t;return rn.objectLiteral(n)&&rn.uinteger(n.line)&&rn.uinteger(n.character)},(l=v||(v={})).create=function(t,n,r,e){if(rn.uinteger(t)&&rn.uinteger(n)&&rn.uinteger(r)&&rn.uinteger(e))return{start:d.create(t,n),end:d.create(r,e)};if(d.is(t)&&d.is(n))return{start:t,end:n};throw new Error("Range#create called with invalid arguments["+t+", "+n+", "+r+", "+e+"]")},l.is=function(t){var n=t;return rn.objectLiteral(n)&&d.is(n.start)&&d.is(n.end)},(m=g||(g={})).create=function(t,n){return{uri:t,range:n}},m.is=function(t){var n=t;return rn.defined(n)&&v.is(n.range)&&(rn.string(n.uri)||rn.undefined(n.uri))},(w=p||(p={})).create=function(t,n,r,e){return{targetUri:t,targetRange:n,targetSelectionRange:r,originSelectionRange:e}},w.is=function(t){var n=t;return rn.defined(n)&&v.is(n.targetRange)&&rn.string(n.targetUri)&&(v.is(n.targetSelectionRange)||rn.undefined(n.targetSelectionRange))&&(v.is(n.originSelectionRange)||rn.undefined(n.originSelectionRange))},(j=b||(b={})).create=function(t,n,r,e){return{red:t,green:n,blue:r,alpha:e}},j.is=function(t){var n=t;return rn.numberRange(n.red,0,1)&&rn.numberRange(n.green,0,1)&&rn.numberRange(n.blue,0,1)&&rn.numberRange(n.alpha,0,1)},(k=x||(x={})).create=function(t,n){return{range:t,color:n}},k.is=function(t){var n=t;return v.is(n.range)&&b.is(n.color)},(E=D||(D={})).create=function(t,n,r){return{label:t,textEdit:n,additionalTextEdits:r}},E.is=function(t){var n=t;return rn.string(n.label)&&(rn.undefined(n.textEdit)||H.is(n))&&(rn.undefined(n.additionalTextEdits)||rn.typedArray(n.additionalTextEdits,H.is))},(y=R||(R={})).Comment="comment",y.Imports="imports",y.Region="region",(I=A||(A={})).create=function(t,n,r,e,i){var o={startLine:t,endLine:n};return rn.defined(r)&&(o.startCharacter=r),rn.defined(e)&&(o.endCharacter=e),rn.defined(i)&&(o.kind=i),o},I.is=function(t){var n=t;return rn.uinteger(n.startLine)&&rn.uinteger(n.startLine)&&(rn.undefined(n.startCharacter)||rn.uinteger(n.startCharacter))&&(rn.undefined(n.endCharacter)||rn.uinteger(n.endCharacter))&&(rn.undefined(n.kind)||rn.string(n.kind))},(S=O||(O={})).create=function(t,n){return{location:t,message:n}},S.is=function(t){var n=t;return rn.defined(n)&&g.is(n.location)&&rn.string(n.message)},(C=T||(T={})).Error=1,C.Warning=2,C.Information=3,C.Hint=4,(W=N||(N={})).Unnecessary=1,W.Deprecated=2,(F||(F={})).is=function(t){var n=t;return n!=null&&rn.string(n.href)},(M=L||(L={})).create=function(t,n,r,e,i,o){var u={range:t,message:n};return rn.defined(r)&&(u.severity=r),rn.defined(e)&&(u.code=e),rn.defined(i)&&(u.source=i),rn.defined(o)&&(u.relatedInformation=o),u},M.is=function(t){var n,r=t;return rn.defined(r)&&v.is(r.range)&&rn.string(r.message)&&(rn.number(r.severity)||rn.undefined(r.severity))&&(rn.integer(r.code)||rn.string(r.code)||rn.undefined(r.code))&&(rn.undefined(r.codeDescription)||rn.string((n=r.codeDescription)===null||n===void 0?void 0:n.href))&&(rn.string(r.source)||rn.undefined(r.source))&&(rn.undefined(r.relatedInformation)||rn.typedArray(r.relatedInformation,O.is))},(z=_||(_={})).create=function(t,n){for(var r=[],e=2;e<arguments.length;e++)r[e-2]=arguments[e];var i={title:t,command:n};return rn.defined(r)&&r.length>0&&(i.arguments=r),i},z.is=function(t){var n=t;return rn.defined(n)&&rn.string(n.title)&&rn.string(n.command)},(P=H||(H={})).replace=function(t,n){return{range:t,newText:n}},P.insert=function(t,n){return{range:{start:t,end:t},newText:n}},P.del=function(t){return{range:t,newText:""}},P.is=function(t){var n=t;return rn.objectLiteral(n)&&rn.string(n.newText)&&v.is(n.range)},(q=U||(U={})).create=function(t,n,r){var e={label:t};return n!==void 0&&(e.needsConfirmation=n),r!==void 0&&(e.description=r),e},q.is=function(t){var n=t;return n!==void 0&&rn.objectLiteral(n)&&rn.string(n.label)&&(rn.boolean(n.needsConfirmation)||n.needsConfirmation===void 0)&&(rn.string(n.description)||n.description===void 0)},($||($={})).is=function(t){return typeof t=="string"},(B=V||(V={})).replace=function(t,n,r){return{range:t,newText:n,annotationId:r}},B.insert=function(t,n,r){return{range:{start:t,end:t},newText:n,annotationId:r}},B.del=function(t,n){return{range:t,newText:"",annotationId:n}},B.is=function(t){var n=t;return H.is(n)&&(U.is(n.annotationId)||$.is(n.annotationId))},(J=G||(G={})).create=function(t,n){return{textDocument:t,edits:n}},J.is=function(t){var n=t;return rn.defined(n)&&st.is(n.textDocument)&&Array.isArray(n.edits)},(Q=K||(K={})).create=function(t,n,r){var e={kind:"create",uri:t};return n===void 0||n.overwrite===void 0&&n.ignoreIfExists===void 0||(e.options=n),r!==void 0&&(e.annotationId=r),e},Q.is=function(t){var n=t;return n&&n.kind==="create"&&rn.string(n.uri)&&(n.options===void 0||(n.options.overwrite===void 0||rn.boolean(n.options.overwrite))&&(n.options.ignoreIfExists===void 0||rn.boolean(n.options.ignoreIfExists)))&&(n.annotationId===void 0||$.is(n.annotationId))},(Y=X||(X={})).create=function(t,n,r,e){var i={kind:"rename",oldUri:t,newUri:n};return r===void 0||r.overwrite===void 0&&r.ignoreIfExists===void 0||(i.options=r),e!==void 0&&(i.annotationId=e),i},Y.is=function(t){var n=t;return n&&n.kind==="rename"&&rn.string(n.oldUri)&&rn.string(n.newUri)&&(n.options===void 0||(n.options.overwrite===void 0||rn.boolean(n.options.overwrite))&&(n.options.ignoreIfExists===void 0||rn.boolean(n.options.ignoreIfExists)))&&(n.annotationId===void 0||$.is(n.annotationId))},(tt=Z||(Z={})).create=function(t,n,r){var e={kind:"delete",uri:t};return n===void 0||n.recursive===void 0&&n.ignoreIfNotExists===void 0||(e.options=n),r!==void 0&&(e.annotationId=r),e},tt.is=function(t){var n=t;return n&&n.kind==="delete"&&rn.string(n.uri)&&(n.options===void 0||(n.options.recursive===void 0||rn.boolean(n.options.recursive))&&(n.options.ignoreIfNotExists===void 0||rn.boolean(n.options.ignoreIfNotExists)))&&(n.annotationId===void 0||$.is(n.annotationId))},(nt||(nt={})).is=function(t){var n=t;return n&&(n.changes!==void 0||n.documentChanges!==void 0)&&(n.documentChanges===void 0||n.documentChanges.every((function(t){return rn.string(t.kind)?K.is(t)||X.is(t)||Z.is(t):G.is(t)})))};var et,it,ot,ut,st,ct,at,ft,dt,ht,vt,lt,gt,mt,pt,wt,bt,jt,xt,kt,Dt,Et,Rt,yt,At,It,Ot,St,Tt,Ct,Nt,Wt,Ft,Lt,Mt,_t,zt,Ht,Pt,Ut,qt,$t,Vt,Bt,Gt,Jt,Kt,Qt,Xt,Yt,Zt,tn=function(){function t(t,n){this.edits=t,this.changeAnnotations=n}return t.prototype.insert=function(t,n,r){var e,i;if(r===void 0?e=H.insert(t,n):$.is(r)?(i=r,e=V.insert(t,n,r)):(this.assertChangeAnnotations(this.changeAnnotations),i=this.changeAnnotations.manage(r),e=V.insert(t,n,i)),this.edits.push(e),i!==void 0)return i},t.prototype.replace=function(t,n,r){var e,i;if(r===void 0?e=H.replace(t,n):$.is(r)?(i=r,e=V.replace(t,n,r)):(this.assertChangeAnnotations(this.changeAnnotations),i=this.changeAnnotations.manage(r),e=V.replace(t,n,i)),this.edits.push(e),i!==void 0)return i},t.prototype.delete=function(t,n){var r,e;if(n===void 0?r=H.del(t):$.is(n)?(e=n,r=V.del(t,n)):(this.assertChangeAnnotations(this.changeAnnotations),e=this.changeAnnotations.manage(n),r=V.del(t,e)),this.edits.push(r),e!==void 0)return e},t.prototype.add=function(t){this.edits.push(t)},t.prototype.all=function(){return this.edits},t.prototype.clear=function(){this.edits.splice(0,this.edits.length)},t.prototype.assertChangeAnnotations=function(t){if(t===void 0)throw new Error("Text edit change is not configured to manage change annotations.")},t}(),nn=function(){function t(t){this._annotations=t===void 0?Object.create(null):t,this._counter=0,this._size=0}return t.prototype.all=function(){return this._annotations},Object.defineProperty(t.prototype,"size",{get:function(){return this._size},enumerable:!1,configurable:!0}),t.prototype.manage=function(t,n){var r;if($.is(t)?r=t:(r=this.nextId(),n=t),this._annotations[r]!==void 0)throw new Error("Id "+r+" is already in use.");if(n===void 0)throw new Error("No annotation provided for id "+r);return this._annotations[r]=n,this._size++,r},t.prototype.nextId=function(){return this._counter++,this._counter.toString()},t}();(function(){function t(t){var n=this;this._textEditChanges=Object.create(null),t!==void 0?(this._workspaceEdit=t,t.documentChanges?(this._changeAnnotations=new nn(t.changeAnnotations),t.changeAnnotations=this._changeAnnotations.all(),t.documentChanges.forEach((function(t){if(G.is(t)){var r=new tn(t.edits,n._changeAnnotations);n._textEditChanges[t.textDocument.uri]=r}}))):t.changes&&Object.keys(t.changes).forEach((function(r){var e=new tn(t.changes[r]);n._textEditChanges[r]=e}))):this._workspaceEdit={}}Object.defineProperty(t.prototype,"edit",{get:function(){return this.initDocumentChanges(),this._changeAnnotations!==void 0&&(this._changeAnnotations.size===0?this._workspaceEdit.changeAnnotations=void 0:this._workspaceEdit.changeAnnotations=this._changeAnnotations.all()),this._workspaceEdit},enumerable:!1,configurable:!0}),t.prototype.getTextEditChange=function(t){if(st.is(t)){if(this.initDocumentChanges(),this._workspaceEdit.documentChanges===void 0)throw new Error("Workspace edit is not configured for document changes.");var n={uri:t.uri,version:t.version};if(!(e=this._textEditChanges[n.uri])){var r={textDocument:n,edits:i=[]};this._workspaceEdit.documentChanges.push(r),e=new tn(i,this._changeAnnotations),this._textEditChanges[n.uri]=e}return e}if(this.initChanges(),this._workspaceEdit.changes===void 0)throw new Error("Workspace edit is not configured for normal text edit changes.");var e;if(!(e=this._textEditChanges[t])){var i=[];this._workspaceEdit.changes[t]=i,e=new tn(i),this._textEditChanges[t]=e}return e},t.prototype.initDocumentChanges=function(){this._workspaceEdit.documentChanges===void 0&&this._workspaceEdit.changes===void 0&&(this._changeAnnotations=new nn,this._workspaceEdit.documentChanges=[],this._workspaceEdit.changeAnnotations=this._changeAnnotations.all())},t.prototype.initChanges=function(){this._workspaceEdit.documentChanges===void 0&&this._workspaceEdit.changes===void 0&&(this._workspaceEdit.changes=Object.create(null))},t.prototype.createFile=function(t,n,r){if(this.initDocumentChanges(),this._workspaceEdit.documentChanges===void 0)throw new Error("Workspace edit is not configured for document changes.");var e,i,o;if(U.is(n)||$.is(n)?e=n:r=n,e===void 0?i=K.create(t,r):(o=$.is(e)?e:this._changeAnnotations.manage(e),i=K.create(t,r,o)),this._workspaceEdit.documentChanges.push(i),o!==void 0)return o},t.prototype.renameFile=function(t,n,r,e){if(this.initDocumentChanges(),this._workspaceEdit.documentChanges===void 0)throw new Error("Workspace edit is not configured for document changes.");var i,o,u;if(U.is(r)||$.is(r)?i=r:e=r,i===void 0?o=X.create(t,n,e):(u=$.is(i)?i:this._changeAnnotations.manage(i),o=X.create(t,n,e,u)),this._workspaceEdit.documentChanges.push(o),u!==void 0)return u},t.prototype.deleteFile=function(t,n,r){if(this.initDocumentChanges(),this._workspaceEdit.documentChanges===void 0)throw new Error("Workspace edit is not configured for document changes.");var e,i,o;if(U.is(n)||$.is(n)?e=n:r=n,e===void 0?i=Z.create(t,r):(o=$.is(e)?e:this._changeAnnotations.manage(e),i=Z.create(t,r,o)),this._workspaceEdit.documentChanges.push(i),o!==void 0)return o}})(),(it=et||(et={})).create=function(t){return{uri:t}},it.is=function(t){var n=t;return rn.defined(n)&&rn.string(n.uri)},(ut=ot||(ot={})).create=function(t,n){return{uri:t,version:n}},ut.is=function(t){var n=t;return rn.defined(n)&&rn.string(n.uri)&&rn.integer(n.version)},(ct=st||(st={})).create=function(t,n){return{uri:t,version:n}},ct.is=function(t){var n=t;return rn.defined(n)&&rn.string(n.uri)&&(n.version===null||rn.integer(n.version))},(ft=at||(at={})).create=function(t,n,r,e){return{uri:t,languageId:n,version:r,text:e}},ft.is=function(t){var n=t;return rn.defined(n)&&rn.string(n.uri)&&rn.string(n.languageId)&&rn.integer(n.version)&&rn.string(n.text)},(ht=dt||(dt={})).PlainText="plaintext",ht.Markdown="markdown",function(t){t.is=function(n){var r=n;return r===t.PlainText||r===t.Markdown}}(dt||(dt={})),(vt||(vt={})).is=function(t){var n=t;return rn.objectLiteral(t)&&dt.is(n.kind)&&rn.string(n.value)},(gt=lt||(lt={})).Text=1,gt.Method=2,gt.Function=3,gt.Constructor=4,gt.Field=5,gt.Variable=6,gt.Class=7,gt.Interface=8,gt.Module=9,gt.Property=10,gt.Unit=11,gt.Value=12,gt.Enum=13,gt.Keyword=14,gt.Snippet=15,gt.Color=16,gt.File=17,gt.Reference=18,gt.Folder=19,gt.EnumMember=20,gt.Constant=21,gt.Struct=22,gt.Event=23,gt.Operator=24,gt.TypeParameter=25,(pt=mt||(mt={})).PlainText=1,pt.Snippet=2,(wt||(wt={})).Deprecated=1,(jt=bt||(bt={})).create=function(t,n,r){return{newText:t,insert:n,replace:r}},jt.is=function(t){var n=t;return n&&rn.string(n.newText)&&v.is(n.insert)&&v.is(n.replace)},(kt=xt||(xt={})).asIs=1,kt.adjustIndentation=2,(Dt||(Dt={})).create=function(t){return{label:t}},(Et||(Et={})).create=function(t,n){return{items:t||[],isIncomplete:!!n}},(yt=Rt||(Rt={})).fromPlainText=function(t){return t.replace(/[\\`*_{}[\]()#+\-.!]/g,"\\$&")},yt.is=function(t){var n=t;return rn.string(n)||rn.objectLiteral(n)&&rn.string(n.language)&&rn.string(n.value)},(At||(At={})).is=function(t){var n=t;return!!n&&rn.objectLiteral(n)&&(vt.is(n.contents)||Rt.is(n.contents)||rn.typedArray(n.contents,Rt.is))&&(t.range===void 0||v.is(t.range))},(It||(It={})).create=function(t,n){return n?{label:t,documentation:n}:{label:t}},(Ot||(Ot={})).create=function(t,n){for(var r=[],e=2;e<arguments.length;e++)r[e-2]=arguments[e];var i={label:t};return rn.defined(n)&&(i.documentation=n),rn.defined(r)?i.parameters=r:i.parameters=[],i},(Tt=St||(St={})).Text=1,Tt.Read=2,Tt.Write=3,(Ct||(Ct={})).create=function(t,n){var r={range:t};return rn.number(n)&&(r.kind=n),r},(Wt=Nt||(Nt={})).File=1,Wt.Module=2,Wt.Namespace=3,Wt.Package=4,Wt.Class=5,Wt.Method=6,Wt.Property=7,Wt.Field=8,Wt.Constructor=9,Wt.Enum=10,Wt.Interface=11,Wt.Function=12,Wt.Variable=13,Wt.Constant=14,Wt.String=15,Wt.Number=16,Wt.Boolean=17,Wt.Array=18,Wt.Object=19,Wt.Key=20,Wt.Null=21,Wt.EnumMember=22,Wt.Struct=23,Wt.Event=24,Wt.Operator=25,Wt.TypeParameter=26,(Ft||(Ft={})).Deprecated=1,(Lt||(Lt={})).create=function(t,n,r,e,i){var o={name:t,kind:n,location:{uri:e,range:r}};return i&&(o.containerName=i),o},(_t=Mt||(Mt={})).create=function(t,n,r,e,i,o){var u={name:t,detail:n,kind:r,range:e,selectionRange:i};return o!==void 0&&(u.children=o),u},_t.is=function(t){var n=t;return n&&rn.string(n.name)&&rn.number(n.kind)&&v.is(n.range)&&v.is(n.selectionRange)&&(n.detail===void 0||rn.string(n.detail))&&(n.deprecated===void 0||rn.boolean(n.deprecated))&&(n.children===void 0||Array.isArray(n.children))&&(n.tags===void 0||Array.isArray(n.tags))},(Ht=zt||(zt={})).Empty="",Ht.QuickFix="quickfix",Ht.Refactor="refactor",Ht.RefactorExtract="refactor.extract",Ht.RefactorInline="refactor.inline",Ht.RefactorRewrite="refactor.rewrite",Ht.Source="source",Ht.SourceOrganizeImports="source.organizeImports",Ht.SourceFixAll="source.fixAll",(Ut=Pt||(Pt={})).create=function(t,n){var r={diagnostics:t};return n!=null&&(r.only=n),r},Ut.is=function(t){var n=t;return rn.defined(n)&&rn.typedArray(n.diagnostics,L.is)&&(n.only===void 0||rn.typedArray(n.only,rn.string))},($t=qt||(qt={})).create=function(t,n,r){var e={title:t},i=!0;return typeof n=="string"?(i=!1,e.kind=n):_.is(n)?e.command=n:e.edit=n,i&&r!==void 0&&(e.kind=r),e},$t.is=function(t){var n=t;return n&&rn.string(n.title)&&(n.diagnostics===void 0||rn.typedArray(n.diagnostics,L.is))&&(n.kind===void 0||rn.string(n.kind))&&(n.edit!==void 0||n.command!==void 0)&&(n.command===void 0||_.is(n.command))&&(n.isPreferred===void 0||rn.boolean(n.isPreferred))&&(n.edit===void 0||nt.is(n.edit))},(Bt=Vt||(Vt={})).create=function(t,n){var r={range:t};return rn.defined(n)&&(r.data=n),r},Bt.is=function(t){var n=t;return rn.defined(n)&&v.is(n.range)&&(rn.undefined(n.command)||_.is(n.command))},(Jt=Gt||(Gt={})).create=function(t,n){return{tabSize:t,insertSpaces:n}},Jt.is=function(t){var n=t;return rn.defined(n)&&rn.uinteger(n.tabSize)&&rn.boolean(n.insertSpaces)},(Qt=Kt||(Kt={})).create=function(t,n,r){return{range:t,target:n,data:r}},Qt.is=function(t){var n=t;return rn.defined(n)&&v.is(n.range)&&(rn.undefined(n.target)||rn.string(n.target))},(Yt=Xt||(Xt={})).create=function(t,n){return{range:t,parent:n}},Yt.is=function(t){var n=t;return n!==void 0&&v.is(n.range)&&(n.parent===void 0||Yt.is(n.parent))},function(t){function n(t,r){if(t.length<=1)return t;var e=t.length/2|0,i=t.slice(0,e),o=t.slice(e);n(i,r),n(o,r);for(var u=0,s=0,c=0;u<i.length&&s<o.length;){var a=r(i[u],o[s]);t[c++]=a<=0?i[u++]:o[s++]}for(;u<i.length;)t[c++]=i[u++];for(;s<o.length;)t[c++]=o[s++];return t}t.create=function(t,n,r,e){return new un(t,n,r,e)},t.is=function(t){var n=t;return!!(rn.defined(n)&&rn.string(n.uri)&&(rn.undefined(n.languageId)||rn.string(n.languageId))&&rn.uinteger(n.lineCount)&&rn.func(n.getText)&&rn.func(n.positionAt)&&rn.func(n.offsetAt))},t.applyEdits=function(t,r){for(var e=t.getText(),i=n(r,(function(t,n){var r=t.range.start.line-n.range.start.line;return r===0?t.range.start.character-n.range.start.character:r})),o=e.length,u=i.length-1;u>=0;u--){var s=i[u],c=t.offsetAt(s.range.start),a=t.offsetAt(s.range.end);if(!(a<=o))throw new Error("Overlapping edit");e=e.substring(0,c)+s.newText+e.substring(a,e.length),o=c}return e}}(Zt||(Zt={}));var rn,en,on,un=function(){function t(t,n,r,e){this._uri=t,this._languageId=n,this._version=r,this._content=e,this._lineOffsets=void 0}return Object.defineProperty(t.prototype,"uri",{get:function(){return this._uri},enumerable:!1,configurable:!0}),Object.defineProperty(t.prototype,"languageId",{get:function(){return this._languageId},enumerable:!1,configurable:!0}),Object.defineProperty(t.prototype,"version",{get:function(){return this._version},enumerable:!1,configurable:!0}),t.prototype.getText=function(t){if(t){var n=this.offsetAt(t.start),r=this.offsetAt(t.end);return this._content.substring(n,r)}return this._content},t.prototype.update=function(t,n){this._content=t.text,this._version=n,this._lineOffsets=void 0},t.prototype.getLineOffsets=function(){if(this._lineOffsets===void 0){for(var t=[],n=this._content,r=!0,e=0;e<n.length;e++){r&&(t.push(e),r=!1);var i=n.charAt(e);r=i==="\r"||i===`\n`,i==="\r"&&e+1<n.length&&n.charAt(e+1)===`\n`&&e++}r&&n.length>0&&t.push(n.length),this._lineOffsets=t}return this._lineOffsets},t.prototype.positionAt=function(t){t=Math.max(Math.min(t,this._content.length),0);var n=this.getLineOffsets(),r=0,e=n.length;if(e===0)return d.create(0,t);for(;r<e;){var i=Math.floor((r+e)/2);n[i]>t?e=i:r=i+1}var o=r-1;return d.create(o,t-n[o])},t.prototype.offsetAt=function(t){var n=this.getLineOffsets();if(t.line>=n.length)return this._content.length;if(t.line<0)return 0;var r=n[t.line],e=t.line+1<n.length?n[t.line+1]:this._content.length;return Math.max(Math.min(r+t.character,e),r)},Object.defineProperty(t.prototype,"lineCount",{get:function(){return this.getLineOffsets().length},enumerable:!1,configurable:!0}),t}();en=rn||(rn={}),on=Object.prototype.toString,en.defined=function(t){return t!==void 0},en.undefined=function(t){return t===void 0},en.boolean=function(t){return t===!0||t===!1},en.string=function(t){return on.call(t)==="[object String]"},en.number=function(t){return on.call(t)==="[object Number]"},en.numberRange=function(t,n,r){return on.call(t)==="[object Number]"&&n<=t&&t<=r},en.integer=function(t){return on.call(t)==="[object Number]"&&-2147483648<=t&&t<=2147483647},en.uinteger=function(t){return on.call(t)==="[object Number]"&&0<=t&&t<=2147483647},en.func=function(t){return on.call(t)==="[object Function]"},en.objectLiteral=function(t){return t!==null&&typeof t=="object"},en.typedArray=function(t,n){return Array.isArray(t)&&t.every(n)};var sn=class{constructor(t,n,r){this._languageId=t,this._worker=n,this._disposables=[],this._listener=Object.create(null);const e=t=>{let n,r=t.getLanguageId();r===this._languageId&&(this._listener[t.uri.toString()]=t.onDidChangeContent((()=>{window.clearTimeout(n),n=window.setTimeout((()=>this._doValidate(t.uri,r)),500)})),this._doValidate(t.uri,r))},i=t=>{u.editor.setModelMarkers(t,this._languageId,[]);let n=t.uri.toString(),r=this._listener[n];r&&(r.dispose(),delete this._listener[n])};this._disposables.push(u.editor.onDidCreateModel(e)),this._disposables.push(u.editor.onWillDisposeModel(i)),this._disposables.push(u.editor.onDidChangeModelLanguage((t=>{i(t.model),e(t.model)}))),this._disposables.push(r((t=>{u.editor.getModels().forEach((t=>{t.getLanguageId()===this._languageId&&(i(t),e(t))}))}))),this._disposables.push({dispose:()=>{u.editor.getModels().forEach(i);for(let t in this._listener)this._listener[t].dispose()}}),u.editor.getModels().forEach(e)}dispose(){this._disposables.forEach((t=>t&&t.dispose())),this._disposables.length=0}_doValidate(t,n){this._worker(t).then((n=>n.doValidation(t.toString()))).then((r=>{const e=r.map((t=>function(t,n){let r=typeof n.code=="number"?String(n.code):n.code;return{severity:cn(n.severity),startLineNumber:n.range.start.line+1,startColumn:n.range.start.character+1,endLineNumber:n.range.end.line+1,endColumn:n.range.end.character+1,message:n.message,code:r,source:n.source}}(0,t)));let i=u.editor.getModel(t);i&&i.getLanguageId()===n&&u.editor.setModelMarkers(i,n,e)})).then(void 0,(t=>{console.error(t)}))}};function cn(t){switch(t){case T.Error:return u.MarkerSeverity.Error;case T.Warning:return u.MarkerSeverity.Warning;case T.Information:return u.MarkerSeverity.Info;case T.Hint:return u.MarkerSeverity.Hint;default:return u.MarkerSeverity.Info}}var an=class{constructor(t,n){this._worker=t,this._triggerCharacters=n}get triggerCharacters(){return this._triggerCharacters}provideCompletionItems(t,n,r,e){const i=t.uri;return this._worker(i).then((t=>t.doComplete(i.toString(),fn(n)))).then((r=>{if(!r)return;const e=t.getWordUntilPosition(n),i=new u.Range(n.lineNumber,e.startColumn,n.lineNumber,e.endColumn),o=r.items.map((t=>{const n={label:t.label,insertText:t.insertText||t.label,sortText:t.sortText,filterText:t.filterText,documentation:t.documentation,detail:t.detail,command:(r=t.command,r&&r.command==="editor.action.triggerSuggest"?{id:r.command,title:r.title,arguments:r.arguments}:void 0),range:i,kind:vn(t.kind)};var r,e;return t.textEdit&&((e=t.textEdit).insert!==void 0&&e.replace!==void 0?n.range={insert:hn(t.textEdit.insert),replace:hn(t.textEdit.replace)}:n.range=hn(t.textEdit.range),n.insertText=t.textEdit.newText),t.additionalTextEdits&&(n.additionalTextEdits=t.additionalTextEdits.map(ln)),t.insertTextFormat===mt.Snippet&&(n.insertTextRules=u.languages.CompletionItemInsertTextRule.InsertAsSnippet),n}));return{isIncomplete:r.isIncomplete,suggestions:o}}))}};function fn(t){if(t)return{character:t.column-1,line:t.lineNumber-1}}function dn(t){if(t)return{start:{line:t.startLineNumber-1,character:t.startColumn-1},end:{line:t.endLineNumber-1,character:t.endColumn-1}}}function hn(t){if(t)return new u.Range(t.start.line+1,t.start.character+1,t.end.line+1,t.end.character+1)}function vn(t){const n=u.languages.CompletionItemKind;switch(t){case lt.Text:return n.Text;case lt.Method:return n.Method;case lt.Function:return n.Function;case lt.Constructor:return n.Constructor;case lt.Field:return n.Field;case lt.Variable:return n.Variable;case lt.Class:return n.Class;case lt.Interface:return n.Interface;case lt.Module:return n.Module;case lt.Property:return n.Property;case lt.Unit:return n.Unit;case lt.Value:return n.Value;case lt.Enum:return n.Enum;case lt.Keyword:return n.Keyword;case lt.Snippet:return n.Snippet;case lt.Color:return n.Color;case lt.File:return n.File;case lt.Reference:return n.Reference}return n.Property}function ln(t){if(t)return{range:hn(t.range),text:t.newText}}var gn=class{constructor(t){this._worker=t}provideHover(t,n,r){let e=t.uri;return this._worker(e).then((t=>t.doHover(e.toString(),fn(n)))).then((t=>{if(t)return{range:hn(t.range),contents:pn(t.contents)}}))}};function mn(t){return typeof t=="string"?{value:t}:(n=t)&&typeof n=="object"&&typeof n.kind=="string"?t.kind==="plaintext"?{value:t.value.replace(/[\\`*_{}[\]()#+\-.!]/g,"\\$&")}:{value:t.value}:{value:"```"+t.language+`\n`+t.value+"\n```\n"};var n}function pn(t){if(t)return Array.isArray(t)?t.map(mn):[mn(t)]}var wn=class{constructor(t){this._worker=t}provideDocumentHighlights(t,n,r){const e=t.uri;return this._worker(e).then((t=>t.findDocumentHighlights(e.toString(),fn(n)))).then((t=>{if(t)return t.map((t=>({range:hn(t.range),kind:bn(t.kind)})))}))}};function bn(t){switch(t){case St.Read:return u.languages.DocumentHighlightKind.Read;case St.Write:return u.languages.DocumentHighlightKind.Write;case St.Text:return u.languages.DocumentHighlightKind.Text}return u.languages.DocumentHighlightKind.Text}var jn=class{constructor(t){this._worker=t}provideDefinition(t,n,r){const e=t.uri;return this._worker(e).then((t=>t.findDefinition(e.toString(),fn(n)))).then((t=>{if(t)return[xn(t)]}))}};function xn(t){return{uri:u.Uri.parse(t.uri),range:hn(t.range)}}var kn=class{constructor(t){this._worker=t}provideReferences(t,n,r,e){const i=t.uri;return this._worker(i).then((t=>t.findReferences(i.toString(),fn(n)))).then((t=>{if(t)return t.map(xn)}))}},Dn=class{constructor(t){this._worker=t}provideRenameEdits(t,n,r,e){const i=t.uri;return this._worker(i).then((t=>t.doRename(i.toString(),fn(n),r))).then((t=>function(t){if(!t||!t.changes)return;let n=[];for(let r in t.changes){const e=u.Uri.parse(r);for(let i of t.changes[r])n.push({resource:e,versionId:void 0,textEdit:{range:hn(i.range),text:i.newText}})}return{edits:n}}(t)))}},En=class{constructor(t){this._worker=t}provideDocumentSymbols(t,n){const r=t.uri;return this._worker(r).then((t=>t.findDocumentSymbols(r.toString()))).then((t=>{if(t)return t.map((t=>"children"in t?Rn(t):{name:t.name,detail:"",containerName:t.containerName,kind:yn(t.kind),range:hn(t.location.range),selectionRange:hn(t.location.range),tags:[]}))}))}};function Rn(t){return{name:t.name,detail:t.detail??"",kind:yn(t.kind),range:hn(t.range),selectionRange:hn(t.selectionRange),tags:t.tags??[],children:(t.children??[]).map((t=>Rn(t)))}}function yn(t){let n=u.languages.SymbolKind;switch(t){case Nt.File:return n.File;case Nt.Module:return n.Module;case Nt.Namespace:return n.Namespace;case Nt.Package:return n.Package;case Nt.Class:return n.Class;case Nt.Method:return n.Method;case Nt.Property:return n.Property;case Nt.Field:return n.Field;case Nt.Constructor:return n.Constructor;case Nt.Enum:return n.Enum;case Nt.Interface:return n.Interface;case Nt.Function:return n.Function;case Nt.Variable:return n.Variable;case Nt.Constant:return n.Constant;case Nt.String:return n.String;case Nt.Number:return n.Number;case Nt.Boolean:return n.Boolean;case Nt.Array:return n.Array}return n.Function}var An=class{constructor(t){this._worker=t}provideLinks(t,n){const r=t.uri;return this._worker(r).then((t=>t.findDocumentLinks(r.toString()))).then((t=>{if(t)return{links:t.map((t=>({range:hn(t.range),url:t.target})))}}))}},In=class{constructor(t){this._worker=t}provideDocumentFormattingEdits(t,n,r){const e=t.uri;return this._worker(e).then((t=>t.format(e.toString(),null,Sn(n)).then((t=>{if(t&&t.length!==0)return t.map(ln)}))))}},On=class{constructor(t){this._worker=t,this.canFormatMultipleRanges=!1}provideDocumentRangeFormattingEdits(t,n,r,e){const i=t.uri;return this._worker(i).then((t=>t.format(i.toString(),dn(n),Sn(r)).then((t=>{if(t&&t.length!==0)return t.map(ln)}))))}};function Sn(t){return{tabSize:t.tabSize,insertSpaces:t.insertSpaces}}var Tn=class{constructor(t){this._worker=t}provideDocumentColors(t,n){const r=t.uri;return this._worker(r).then((t=>t.findDocumentColors(r.toString()))).then((t=>{if(t)return t.map((t=>({color:t.color,range:hn(t.range)})))}))}provideColorPresentations(t,n,r){const e=t.uri;return this._worker(e).then((t=>t.getColorPresentations(e.toString(),n.color,dn(n.range)))).then((t=>{if(t)return t.map((t=>{let n={label:t.label};return t.textEdit&&(n.textEdit=ln(t.textEdit)),t.additionalTextEdits&&(n.additionalTextEdits=t.additionalTextEdits.map(ln)),n}))}))}},Cn=class{constructor(t){this._worker=t}provideFoldingRanges(t,n,r){const e=t.uri;return this._worker(e).then((t=>t.getFoldingRanges(e.toString(),n))).then((t=>{if(t)return t.map((t=>{const n={start:t.startLine+1,end:t.endLine+1};return t.kind!==void 0&&(n.kind=function(t){switch(t){case R.Comment:return u.languages.FoldingRangeKind.Comment;case R.Imports:return u.languages.FoldingRangeKind.Imports;case R.Region:return u.languages.FoldingRangeKind.Region}}(t.kind)),n}))}))}},Nn=class{constructor(t){this._worker=t}provideSelectionRanges(t,n,r){const e=t.uri;return this._worker(e).then((t=>t.getSelectionRanges(e.toString(),n.map(fn)))).then((t=>{if(t)return t.map((t=>{const n=[];for(;t;)n.push({range:hn(t.range)}),t=t.parent;return n}))}))}};function Wn(t){const n=[],r=[],e=new rt(t);n.push(e);const i=(...t)=>e.getLanguageServiceWorker(...t);return function(){const{languageId:n,modeConfiguration:e}=t;Ln(r),e.completionItems&&r.push(u.languages.registerCompletionItemProvider(n,new an(i,["/","-",":"]))),e.hovers&&r.push(u.languages.registerHoverProvider(n,new gn(i))),e.documentHighlights&&r.push(u.languages.registerDocumentHighlightProvider(n,new wn(i))),e.definitions&&r.push(u.languages.registerDefinitionProvider(n,new jn(i))),e.references&&r.push(u.languages.registerReferenceProvider(n,new kn(i))),e.documentSymbols&&r.push(u.languages.registerDocumentSymbolProvider(n,new En(i))),e.rename&&r.push(u.languages.registerRenameProvider(n,new Dn(i))),e.colors&&r.push(u.languages.registerColorProvider(n,new Tn(i))),e.foldingRanges&&r.push(u.languages.registerFoldingRangeProvider(n,new Cn(i))),e.diagnostics&&r.push(new sn(n,i,t.onDidChange)),e.selectionRanges&&r.push(u.languages.registerSelectionRangeProvider(n,new Nn(i))),e.documentFormattingEdits&&r.push(u.languages.registerDocumentFormattingEditProvider(n,new In(i))),e.documentRangeFormattingEdits&&r.push(u.languages.registerDocumentRangeFormattingEditProvider(n,new On(i)))}(),n.push(Fn(r)),Fn(n)}function Fn(t){return{dispose:()=>Ln(t)}}function Ln(t){for(;t.length;)t.pop().dispose()}export{an as CompletionAdapter,jn as DefinitionAdapter,sn as DiagnosticsAdapter,Tn as DocumentColorAdapter,In as DocumentFormattingEditProvider,wn as DocumentHighlightAdapter,An as DocumentLinkAdapter,On as DocumentRangeFormattingEditProvider,En as DocumentSymbolAdapter,Cn as FoldingRangeAdapter,gn as HoverAdapter,kn as ReferenceAdapter,Dn as RenameAdapter,Nn as SelectionRangeAdapter,rt as WorkerManager,fn as fromPosition,dn as fromRange,Wn as setupMode,hn as toRange,ln as toTextEdit};
//# sourceMappingURL=p-c075abe2.js.map