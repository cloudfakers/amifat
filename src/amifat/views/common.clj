(ns amifat.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
                [:title "Am I fat?"]
                ;(include-css "/css/reset.css")
	        ;(include-css "/css/noir.css")]
		(include-css "/css/basic.css")]
              [:body
                [:div#wrapper
                content]]))
