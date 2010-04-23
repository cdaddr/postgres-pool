(ns net.briancarper.postgres-pool
  (:import [clojure.lang RT]
           [javax.sql DataSource]
           [org.apache.commons.pool ObjectPool]
           [org.apache.commons.pool.impl GenericObjectPool]
           [org.apache.commons.dbcp
            PoolingDataSource
            PoolableConnectionFactory
            DriverManagerConnectionFactory]))


(defn- db-to-uri [db]
  (str "jdbc:postgresql://"
       (or (:host db) "localhost")
       ":" (or (:port db) 5432)
       "/" (:database db)))


(defn postgres-pool [db]
  (let [pool (GenericObjectPool.)
        factory (DriverManagerConnectionFactory.
                 (db-to-uri db) (:username db) (:password db))
        pool-factory (PoolableConnectionFactory. factory pool nil nil false true)
        ds (PoolingDataSource. pool)]
    ds))
