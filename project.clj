(defproject postgres-pool "1.0.0"
  :description "A pool of postgres connections"
  :dependencies [[org.clojure/clojure "1.2.0-master-SNAPSHOT"]
                 [org.clojure/clojure-contrib "1.2.0-SNAPSHOT"]
                 [commons-dbcp/commons-dbcp "1.4"]
                 [postgresql/postgresql "8.4-701.jdbc4"]])
