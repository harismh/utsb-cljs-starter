(ns app.main
  (:require [app.components :refer [app]]
            [cljs.reader :as reader]
            [shadow.resource :as resource]
            [uix.dom]
            [uix.core :refer [$]]))

(def site-meta
  (reader/read-string (resource/inline "meta.edn")))

(defonce root
  (uix.dom/create-root (js/document.getElementById "root")))

(defn ^:export ^:dev/after-load init []
  (uix.dom/render-root ($ app site-meta) root))
