(ns amifat.views
  (:use [hiccup core page]))

; html layout
(defn exuberantlayout [message]
  (html5
    [:head [:title "Am I fat?"]
     (include-css "/css/basic.css")]
    [:body [:div#exuberant [:h1#exuberant
                            (if (instance? clojure.lang.PersistentVector message)
                              (first message)
                              message)]
            (if (instance? clojure.lang.PersistentVector message)
              [:h2#subexuberant (second message)])]]))

(defn nofatresponse [] "NO")

(defn fatfingersresponse [] ["404" "maybe your fingers are like sausages"])

(defn indexpage []
  (exuberantlayout (nofatresponse)))

(defn notfound []
  (exuberantlayout (fatfingersresponse)))
