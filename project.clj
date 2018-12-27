(defproject learn-cortex "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-gorilla "0.4.0"]]
  :aliases {"notebook" ["gorilla" ":ip" "0.0.0.0" ":port" "10001"]}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [thinktopic/experiment "0.9.22"]])
