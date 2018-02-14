(ns linting-example.eastwood-target
  (:use [clojure.string]))

(if-let [x []]
  (conj x 42)
  :falsy)

(defn f [x]
  (def y (* x x))
  (+ y 2))

(defn g [x]
  "blah blah blah."
  (* x x))

(defn h [str]
  (str "Hello, " str "!"))
