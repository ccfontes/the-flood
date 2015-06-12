(ns the-flood.core
  (:require [clojure.string :as str]))

(defn next-frontier [img [w h] [x y] source-char fill-char]
  (for [i [(dec y) y (inc y)]
        j [(dec x) x (inc x)]
        :when (and (>= i 0)
                   (>= j 0)
                   (< i h)
                   (< j w)
                   (or (= x j) (= y i))
                   (not (and (= x j) (= y i)))
                   (= source-char (get-in img [i j])))]
    [[j i] source-char fill-char]))

(defn next-frontier-wrap [img [w h] [x y] source-char fill-char]
  (for [i [(if (>= (dec y) 0) (dec y) (dec h))
           y
           (if (< (inc y) h) (inc y) 0)]
        j [(if (>= (dec x) 0) (dec x) (dec w))
           x
           (if (< (inc x) w) (inc x) 0)]
        :when (and (or (= x j) (= y i))
                   (not (and (= x j) (= y i)))
                   (= source-char (get-in img [i j])))]
    [[j i] source-char fill-char]))

(defn flood-fill [img [x y] fill-char & [wrap]]
  (let [source-char (get-in img [y x])]
    (loop [img img
           frontier [[[x y] source-char fill-char]]]
      (if (-> frontier count zero?)
        img
        (let [front (first frontier)
              x (ffirst front)
              y (-> front first second)
              source-char (second front)
              fill-char (last front)
              w (-> img first count)
              h (count img)]
          (recur
            (assoc-in img [y x] fill-char)
            (if wrap
              (concat (next frontier)
                      (next-frontier-wrap img [w h] [x y] source-char fill-char))
              (concat (next frontier)
                      (next-frontier img [w h] [x y] source-char fill-char)))))))))