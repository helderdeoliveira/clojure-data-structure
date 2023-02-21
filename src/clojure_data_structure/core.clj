(ns clojure-data-structure.core
  (:require [clojure.set :as s]
            [clojure.string :as st]))


(defn say-hello []
  (println "hello world!"))

(println "hello")

(say-hello)

(def x '(1 2 3 4))
(def y [1 2 3 4])
(def z #{1 2 3 4})
(def p {:name "Helder" :surname "De oliveira"})
(map inc y)
(s/union #{2 3} #{1 2})