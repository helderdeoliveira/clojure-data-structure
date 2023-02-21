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

(defn innerfizzbuzz [n]
  (let [divisible-by?
        (fn [div]
          (= 0 (mod n div)))]
    (cond
      (divisible-by? 15) "FizzBuzz"
      (divisible-by? 3)  "Fizz"
      (divisible-by? 5)  "Buzz"
      :else              n)))

(defn fizzbuzz [ns]
  (map innerfizzbuzz ns))

(fizzbuzz '(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20))