(defproject helloworld "0.1.0-SNAPSHOT"
  :description "I know if you're fat"
  :url "http://amifat.herokuapp.com"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.0"]]
  :plugins [[lein-ring "0.8.3"]]
  :ring {:handler amifat.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.3"]]}})
