(ns simple.handler
  (:require
   [integrant.core :as ig]))

(defmethod ig/init-key ::simple [_ opts]
  (fn [request]
    {:headers {"Content-Type" "text/html"}
     :body "Hello world!"}))
