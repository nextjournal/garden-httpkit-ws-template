import * as squint_core from 'squint-cljs/core.js';
import * as squint_html from 'squint-cljs/src/squint/html.js';
import * as str from 'squint-cljs/src/squint/string.js';
import * as rng from './random_name_generator.mjs';
var $ = function (sel) {
return document.querySelector(sel);
};
var sender_name = rng.new$();
var socket = new WebSocket(str.replace(document.location.href, /^http/, "ws"));
socket.addEventListener("message", (function (msg) {
const map__12 = JSON.parse(squint_core.get(msg, "data"));
const from3 = squint_core.get(map__12, "from");
const message4 = squint_core.get(map__12, "message");
return $("#messages").prepend((() => {
const G__795 = document.createElement("div");
G__795.innerHTML = squint_html.tag`<div class="msg"><em>${squint_core.str(from3, ":")}</em><span>${message4}</span></div>`;
return G__795;
})());
}));
var send_input_BANG_ = function () {
const input1 = $("input");
if (squint_core.truth_(squint_core.seq(squint_core.get(input1, "value")))) {
socket.send(JSON.stringify(({ "message": squint_core.get(input1, "value"), "from": sender_name })));
return input1.value = "";
;}
};
$("button").addEventListener("click", send_input_BANG_);
$("input").addEventListener("keydown", (function (e) {
if (("Enter") === (squint_core.get(e, "key"))) {
return send_input_BANG_();}
}));

export { $, sender_name, socket, send_input_BANG_ }
