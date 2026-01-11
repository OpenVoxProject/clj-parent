(def clj-version "1.12.4")
(def ks-version "3.5.3")
(def tk-version "4.3.0")
(def tk-jetty-10-version "1.1.0")
(def tk-metrics-version "2.1.0")
(def logback-version "1.3.16")
(def rbac-client-version "1.2.0")
(def dropwizard-metrics-version "3.2.6")
(def jackson-version "2.20.1")

(defproject org.openvoxproject/clj-parent "7.6.7-SNAPSHOT"
  ;; Abort when version ranges or version conflicts are detected in
  ;; dependencies. Also supports :warn to simply emit warnings.
  ;; requires lein 2.2.0+.
  :pedantic? :abort
  :packaging "pom"
  :url "https://github.com/openvoxproject/clj-parent"
  :description "A clojure project that defines version numbers for common dependencies"
  :license {:name "Apache-2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0.txt"}

  :managed-dependencies [[org.clojure/clojure ~clj-version]
                         [org.clojure/clojurescript "1.12.134"]
                         [org.clojure/tools.logging "1.3.1"]
                         [org.clojure/tools.cli "1.3.250"]
                         [org.clojure/tools.nrepl "0.2.13"]
                         [org.clojure/tools.macro "0.2.2"]
                         [org.clojure/java.classpath "1.1.1"]
                         [org.clojure/java.jdbc "0.7.12"]
                         [org.clojure/java.jmx "1.1.1"]
                         [org.clojure/core.async "1.8.741"]
                         [org.clojure/core.cache "1.2.249"]
                         [org.clojure/core.memoize "1.2.273"]
                         [org.clojure/tools.reader "1.6.0"]
                         ;; recent attempts to update this resulted in failures to build
                         ;; Syntax error compiling at (clojure/tools/namespace/file.clj:65:26).
                         ;; No such var: parse/name-from-ns-decl
                         [org.clojure/tools.namespace "0.3.1"]
                         [org.clojure/data.json "2.5.2"]
                         [org.clojure/data.priority-map "1.2.1"]

                         [org.slf4j/log4j-over-slf4j "2.0.17"]
                         [org.slf4j/slf4j-api "2.0.17"]
                         [org.slf4j/jul-to-slf4j "2.0.17"]
                         [ch.qos.logback/logback-classic ~logback-version]
                         [ch.qos.logback/logback-core ~logback-version]
                         [ch.qos.logback/logback-access ~logback-version]
                         [net.logstash.logback/logstash-logback-encoder "7.4"]
                         [com.fasterxml.jackson.core/jackson-core ~jackson-version]
                         [com.fasterxml.jackson.core/jackson-databind ~jackson-version]
                         [com.fasterxml.jackson.module/jackson-module-afterburner ~jackson-version]
                         [org.yaml/snakeyaml "2.5"]

                         [org.apache.maven.wagon/wagon-provider-api "2.12"]
                         [org.apache.commons/commons-exec "1.6.0"]
                         [org.apache.commons/commons-compress "1.28.0"]
                         [org.apache.httpcomponents/httpclient  "4.5.14"]
                         [org.apache.httpcomponents/httpcore  "4.4.16"]
                         [org.apache.httpcomponents/httpasyncclient "4.1.5"]
                         [commons-beanutils "1.11.0"]
                         [commons-codec "1.20.0"]
                         [commons-collections "3.2.2"]
                         [commons-logging "1.3.5"]
                         [commons-io "2.21.0"]
                         [joda-time "2.14.0"]

                         [com.taoensso/nippy "3.6.0"]
                         [com.taoensso/encore "3.159.0"]

                         [nrepl/nrepl "0.9.0"]
                         [bidi "2.1.6"]
                         [clj-time "0.15.2"]
                         [clj-stacktrace "0.2.8"]
                         [com.zaxxer/HikariCP "5.1.0"]
                         [clj-commons/fs "1.6.312"]
                         [instaparse "1.5.0"]
                         [slingshot "0.12.2"]
                         [cheshire "5.13.0"]
                         [compojure "1.7.2"]
                         [quoin "0.1.2"]
                         [ring/ring-servlet "1.15.3"]
                         [ring/ring-core "1.15.3"]
                         [ring/ring-codec "1.3.0"]
                         [ring/ring-json "0.5.1"]
                         [ring-basic-authentication "1.2.0"]
                         [ring/ring-mock "0.4.0"]
                         [stencil "0.5.0"]
                         [beckon "0.1.1"]
                         [hiccup "1.0.5"]
                         [liberator "0.15.3"]
                         [org.tcrawley/dynapath "1.1.0"]
                         [trptcolin/versioneer "0.2.0"]
                         [io.dropwizard.metrics/metrics-core ~dropwizard-metrics-version]
                         [io.dropwizard.metrics/metrics-graphite ~dropwizard-metrics-version]
                         [metrics-clojure "2.10.0"]
                         [org.ow2.asm/asm-all "5.0.3"]
                         ;; Remove once all projects are updated to use honeysql 2.x
                         [honeysql "1.0.461"]
                         [com.github.seancorfield/honeysql "2.7.1364"]
                         [org.postgresql/postgresql "42.7.8"]
                         [dev.weavejester/medley "1.9.0"]
                         [prismatic/plumbing "0.6.0"]
                         [prismatic/schema "1.4.1"]
                         [stylefruits/gniazdo "1.2.2"]

                         [org.openvoxproject/http-client "2.2.0"]
                         [org.openvoxproject/typesafe-config "1.0.0"]
                         [org.openvoxproject/ssl-utils "3.6.1"]
                         [org.openvoxproject/kitchensink ~ks-version]
                         [org.openvoxproject/kitchensink ~ks-version :classifier "test"]
                         [org.openvoxproject/trapperkeeper ~tk-version]
                         [org.openvoxproject/trapperkeeper ~tk-version :classifier "test"]
                         [org.openvoxproject/trapperkeeper-webserver-jetty10 ~tk-jetty-10-version]
                         [org.openvoxproject/trapperkeeper-webserver-jetty10 ~tk-jetty-10-version :classifier "test"]
                         [org.openvoxproject/trapperkeeper-metrics ~tk-metrics-version]
                         [org.openvoxproject/trapperkeeper-metrics ~tk-metrics-version :classifier "test"]
                         [org.openvoxproject/trapperkeeper-scheduler "1.3.0"]
                         [org.openvoxproject/trapperkeeper-authorization "2.1.0"]
                         [org.openvoxproject/trapperkeeper-status "1.3.0"]
                         [org.openvoxproject/trapperkeeper-filesystem-watcher "1.3.0"]
                         [org.openvoxproject/structured-logging "1.0.0"]
                         [org.openvoxproject/ring-middleware "2.1.0"]
                         [org.openvoxproject/dujour-version-check "1.1.0"]
                         [org.openvoxproject/comidi "1.1.1"]
                         [org.openvoxproject/trapperkeeper-comidi-metrics "1.0.0"]
                         [org.openvoxproject/i18n "1.0.2"]
                         [org.openvoxproject/rbac-client ~rbac-client-version]
                         [org.openvoxproject/rbac-client ~rbac-client-version :classifier "test"]
                         [org.openvoxproject/clj-shell-utils "2.1.0"]
                         [org.openvoxproject/jruby-utils "5.3.1"]

                         [org.bouncycastle/bcpkix-fips "1.0.8"]
                         [org.bouncycastle/bc-fips "1.0.2.6"]
                         [org.bouncycastle/bctls-fips "1.0.19"]
                         [org.bouncycastle/bcpkix-jdk18on "1.83"]
                         [org.bouncycastle/bctls-jdk18on "1.83"]
                         [org.bouncycastle/bcprov-jdk18on "1.83"]
                         [org.bouncycastle/bcutil-jdk18on "1.83"]]

  :dependencies [[org.clojure/clojure]]

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/CLOJARS_USERNAME
                                     :password :env/CLOJARS_PASSWORD
                                     :sign-releases false}]])
  ;;:repositories [["github" {:url "https://maven.pkg.github.com/OpenVoxProject/cli-parent"
  ;;                          :username :env/GITHUB_ACTOR
  ;;                          :password :env/GITHUB_TOKEN
  ;;                          :sign-releases false
  ;;                          }]])
