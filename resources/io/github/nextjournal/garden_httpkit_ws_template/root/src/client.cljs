(ns client
  (:require [clojure.string :as str]
            [random-name-generator :as rng]))

(defn $ [sel] (js/document.querySelector sel))

(def sender-name (rng/new))

(def socket
  (new WebSocket (str/replace (.. js/document -location -href) #"^http" "ws")))

(.addEventListener
 socket "message"
 (fn [msg]
   (let [{:keys [from message]} (js/JSON.parse (:data msg))]
     (.prepend ($ "#messages")
               (doto (js/document.createElement "div")
                 (set! -innerHTML
                       #html [:div {:class "msg"}
                              [:em (str from ":")]
                              [:span message]]))))))

(defn send-input! []
  (let [input ($ "input")]
    (when (seq (:value input))
      (.send socket (js/JSON.stringify {:message (:value input) :from sender-name}))
      (set! input -value ""))))

(.addEventListener ($ "button") "click" send-input!)

(.addEventListener ($ "input") "keydown"
 (fn [e]
   (when (and (= "Enter" (:key e)) )
     (send-input!))))
