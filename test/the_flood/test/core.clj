(ns the-flood.test.core
  (:require [midje.sweet :refer [fact]]
            [the-flood.core :refer [flood-fill]]))

(fact
  (flood-fill [["O" "O" "O"] ["O" "O" "O"]] [2 2] "G")
    => [["G" "G" "G"] ["G" "G" "G"]])