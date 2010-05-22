# postgres-pool

Set up a connection pool for a Postgres server.

## Usage

    (def db (postgres-pool {:host "localhost" :port 5432
                            :username "foo" :password "bar"
                            :database "mydb"}))
    (clojure.contrib.sql/with-connection db ...)

## Installation

Available at Clojars, add this to `project.clj` and use `lein`:

    [postgres-pool "1.1.0"]

## License

Eclipse Public License 1.0, see http://opensource.org/licenses/eclipse-1.0.php.
