the-flood
-------
A Clojure Library for the Flood Fill algorithm.

<img height=320 src="http://upload.wikimedia.org/wikipedia/commons/2/23/Noahs_Ark.jpg"></img>

[The code was copied from a reddit challenge](http://www.reddit.com/r/dailyprogrammer/comments/2ug3hx/20150202_challenge_200_easy_floodfill/co8wj5s) and only minor changes were made.

### Installing the Arkifact
-------
Add the following entry to the `:dependencies` vector of your `project.clj` file:
[![clojars version](https://clojars.org/the-flood/latest-version.svg?raw=true)]
(https://clojars.org/the-flood)

### Flooding the Earth
-------
```clj
user=> (require '[the-flood.core :refer [flood-fill]])
nil
user=> (flood-fill [["O" "O" "O" "O" "O"]
                    ["O" "O" "O" "O" "O"]
                    ["O" "A" "O" "O" "O"]
                    ["O" "O" "O" "O" "O"]
                    ["O" "O" "O" "O" "O"]
                    ["O" "O" "O" "O" "O"]]
          [1 1] "R" nil)
;=>          
[["R" "R" "R" "R" "R"]
 ["R" "R" "R" "R" "R"]
 ["R" "A" "R" "R" "R"]
 ["R" "R" "R" "R" "R"]
 ["R" "R" "R" "R" "R"]
 ["R" "R" "R" "R" "R"]]
```
