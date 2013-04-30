(ns amifat.server
  (:use ring.adapter.jetty
        amifat.handler)
  (:require [compojure.handler :as handler]))

(def app
  (handler/site app-routes))

(defn -main [& args]
  (let [port (Integer/parseInt (get (System/getenv) "PORT" "8080"))]
    (run-jetty app {:port port})))
