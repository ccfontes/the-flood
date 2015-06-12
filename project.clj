(defproject the-flood "0.1.1"

  :description "Clojure Library for the Flood Fill Algorithm"

  :url "https://github.com/ccfontes/the-flood"

  :license {:name "Apache License, Version 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"}

  :scm {:name "git"
        :url "https://github.com/ccfontes/the-flood"}

  :repl-options {:init-ns the-flood.core}

  :dependencies [[org.clojure/clojure "1.5.1"]]

  :profiles {:dev {:dependencies [[midje "1.6.3"]]}})

