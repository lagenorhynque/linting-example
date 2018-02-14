(defproject linting-example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :profiles {:dev {:plugins [[jonase/eastwood "0.2.5"]
                             [lein-cljfmt "0.5.7"]
                             [lein-kibit "0.1.6"]]
                   :aliases {"lint" ^{:doc "Execute cljfmt check, eastwood and kibit."}
                             ["do" ["cljfmt" "check"]
                              ["eastwood" "{:source-paths [\"src\"]}"]
                              ["kibit"]]}}})
