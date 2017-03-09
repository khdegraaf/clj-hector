(defproject org.clojars.paul/clj-hector "0.4.0"
  :dependencies [[org.hectorclient/hector-core "2.0-0"]
                 [org.slf4j/slf4j-api "1.7.5"]
                 [org.clojure/clojure "1.8.0"]
                 [joda-time/joda-time "2.0"]]
  :repositories {"releases" {:url "s3p://draker-maven/releases/"
                             :username :env/LEIN_USERNAME
                             :passphrase :env/LEIN_PASSPHRASE}}
  :profiles {:dev {:dependencies [[org.slf4j/slf4j-simple "1.7.5"]
                                  [org.apache.cassandra/cassandra-all "2.0.16"]
                                  [com.google.guava/guava "15.0"]
                                  ]}}
  :plugins [[s3-wagon-private "1.2.0"]]
  :deploy-app {:s3-bucket "s3p://draker-releases" :creds :env}
  :exclusions [org.slf4j/slf4j-log4j12]
  :resource-paths ["test/resources"]
  :min-lein-version "2.0.0"
  :description "Wrapper for Hector Cassandra client")
