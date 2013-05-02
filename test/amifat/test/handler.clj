(ns amifat.test.handler
  (:use clojure.test
        ring.mock.request
        amifat.server))

(deftest test-app
  (testing "main route"
    (let [response (app (request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) "<!DOCTYPE html>\n<html><head><title>Am I fat?</title><link href=\"/css/basic.css\" rel=\"stylesheet\" type=\"text/css\"></head><body><div id=\"exuberant\"><h1 id=\"exuberant\">NO</h1></div></body></html>"))))

  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= (:status response) 404))
      (is (= (:body response) "<!DOCTYPE html>\n<html><head><title>Am I fat?</title><link href=\"/css/basic.css\" rel=\"stylesheet\" type=\"text/css\"></head><body><div id=\"exuberant\"><h1 id=\"exuberant\">404</h1><h2 id=\"subexuberant\">maybe your fingers are like sausages</h2></div></body></html>"))))
  )
