(defproject deployable-b "0.1.2-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [deployable-a "0.2.0-18-2085df1"]]
  :main ^:skip-aot deployable-b.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
