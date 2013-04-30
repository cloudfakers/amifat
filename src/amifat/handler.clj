(ns amifat.handler
  (:use compojure.core
        amifat.views)
  (:require [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] (indexpage))
  (route/resources "/")
  (route/not-found "Not Found"))
