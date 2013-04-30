(ns amifat.views
  (:use [hiccup core page]))

(defn fatresponse [] "NO")

(defn indexpage []
  (html5
    [:head [:title "Am I fat?"]
     (include-css "/css/basic.css")]
    [:body [:div#exuberant [:h1#exuberant (fatresponse)]]]))
