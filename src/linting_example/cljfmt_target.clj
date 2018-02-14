(ns linting-example.cljfmt-target)

(def something true)

(def something-else (constantly 42))

(def ala 1)

(def bala 2)

(def portokala 3)

(when something
  (something-else)
)

(when something
    something-else)

(filter even?
  (range 1 10))

(if something
    ala
    bala)

(or
  ala
  bala
  portokala)
