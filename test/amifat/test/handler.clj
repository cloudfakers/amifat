(ns amifat.test.handler
  (:use clojure.test
        ring.mock.request  
        amifat.handler))

(deftest test-app
  (testing "main route"
    (let [response (app (request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) "<!DOCTYPE html>\n<html><head><title>Am I fat?</title><link href=\"/css/basic.css\" rel=\"stylesheet\" type=\"text/css\"></head><body><div id=\"exuberant\"><h1 id=\"exuberant\">NO</h1></div></body></html>"))))
  
  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= (:status response) 404)))))
