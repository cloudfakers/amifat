(ns amifat.views.welcome
  (:require [amifat.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/" []
  (common/layout
   [:body [:div#exuberant [:h1#exuberant "NO"]]]))