(ns linting-example.kibit-target)

(defn add-one [x]
  (+ x 1))

(defn check-if-zero? [x]
  (== x 0))

(defn zip-with-* [xs ys]
  (map #(* %1 %2) xs ys))

(defn coll->vec [coll]
  (into [] coll))

(defn flat-map [f coll]
  (apply concat (map f coll)))
