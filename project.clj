(def clj-version "1.11.2")
(def ks-version "3.4.3")
(def tk-version "4.1.2")
(def tk-jetty-10-version "1.0.19")
(def tk-metrics-version "2.0.5")
(def logback-version "1.3.14")
(def rbac-client-version "1.1.8")
(def dropwizard-metrics-version "3.2.2")

(defproject org.openvoxproject/clj-parent "7.5.2-SNAPSHOT"
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
                         [org.clojure/clojurescript "1.10.866"]
                         [org.clojure/tools.logging "1.2.4"]
                         [org.clojure/tools.cli "1.0.206"]
                         [org.clojure/tools.nrepl "0.2.13"]
                         [org.clojure/tools.macro "0.1.5"]
                         [org.clojure/java.classpath "1.0.0"]
                         [org.clojure/java.jdbc "0.7.12"]
                         [org.clojure/java.jmx "1.0.0"]
                         [org.clojure/core.async "1.5.648"]
                         [org.clojure/core.cache "1.0.225"]
                         [org.clojure/core.memoize "1.0.257"]
                         [org.clojure/tools.reader "1.3.6"]
                         ;; recent attempts to update this resulted in failures to build
                         ;; Syntax error compiling at (clojure/tools/namespace/file.clj:65:26).
                         ;; No such var: parse/name-from-ns-decl
                         [org.clojure/tools.namespace "0.2.11"]
                         [org.clojure/data.json "2.4.0"]
                         [org.clojure/data.priority-map "1.1.0"]

                         [org.slf4j/log4j-over-slf4j "2.0.17"]
                         [org.slf4j/slf4j-api "2.0.17"]
                         [org.slf4j/jul-to-slf4j "2.0.17"]
                         [ch.qos.logback/logback-classic ~logback-version]
                         [ch.qos.logback/logback-core ~logback-version]
                         [ch.qos.logback/logback-access ~logback-version]
                         [net.logstash.logback/logstash-logback-encoder "7.3"]
                         [org.codehaus.janino/janino "3.0.8"]
                         [com.fasterxml.jackson.core/jackson-core "2.14.0"]
                         [com.fasterxml.jackson.core/jackson-databind "2.14.0"]
                         [com.fasterxml.jackson.module/jackson-module-afterburner "2.14.0"]
                         [org.yaml/snakeyaml "2.0"]

                         [org.apache.maven.wagon/wagon-provider-api "2.10"]
                         [org.apache.commons/commons-exec "1.4.0"]
                         [org.apache.commons/commons-compress "1.26.0"]
                         [org.apache.commons/commons-lang3 "3.14.0"]
                         [org.apache.httpcomponents/httpclient  "4.5.14"]
                         [org.apache.httpcomponents/httpcore  "4.4.16"]
                         [org.apache.httpcomponents/httpasyncclient "4.1.5"]
                         [commons-beanutils "1.9.4"]
                         [commons-codec "1.15"]
                         [commons-collections "3.2.2"]
                         [commons-lang "2.6"]
                         [commons-logging "1.2"]
                         [commons-io "2.15.1"]
                         [joda-time "2.12.5"]

                         [com.taoensso/nippy "3.1.1"]
                         [com.taoensso/encore "3.9.2"]

                         [nrepl/nrepl "0.6.0"]
                         [bidi "2.1.6"]
                         [clj-time "0.11.0"]
                         [clj-stacktrace "0.2.8"]
                         [com.zaxxer/HikariCP "5.0.1"]
                         [clj-commons/fs "1.6.312"]
                         [instaparse "1.4.1"]
                         [slingshot "0.12.2"]
                         [cheshire "5.10.2"]
                         [compojure "1.7.1"]
                         [quoin "0.1.2"]
                         [ring/ring-servlet "1.8.2"]
                         [ring/ring-core "1.8.2"]
                         [ring/ring-codec "1.1.2"]
                         [ring/ring-json "0.5.1"]
                         [ring-basic-authentication "1.1.0"]
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
                         [com.github.seancorfield/honeysql "2.3.911"]
                         [org.postgresql/postgresql "42.7.7"]
                         [dev.weavejester/medley "1.7.0"]
                         [prismatic/plumbing "0.4.2"]
                         [prismatic/schema "1.1.12"]
                         [stylefruits/gniazdo "1.2.1"]

                         [org.openvoxproject/http-client "2.1.6"]
                         [org.openvoxproject/typesafe-config "0.2.2"]
                         [org.openvoxproject/ssl-utils "3.5.5"]
                         [org.openvoxproject/kitchensink ~ks-version]
                         [org.openvoxproject/kitchensink ~ks-version :classifier "test"]
                         [org.openvoxproject/trapperkeeper ~tk-version]
                         [org.openvoxproject/trapperkeeper ~tk-version :classifier "test"]
                         [org.openvoxproject/trapperkeeper-webserver-jetty10 ~tk-jetty-10-version]
                         [org.openvoxproject/trapperkeeper-webserver-jetty10 ~tk-jetty-10-version :classifier "test"]
                         [org.openvoxproject/trapperkeeper-metrics ~tk-metrics-version]
                         [org.openvoxproject/trapperkeeper-metrics ~tk-metrics-version :classifier "test"]
                         [org.openvoxproject/trapperkeeper-scheduler "1.2.4"]
                         [org.openvoxproject/trapperkeeper-authorization "2.0.2"]
                         [org.openvoxproject/trapperkeeper-status "1.2.1"]
                         [org.openvoxproject/trapperkeeper-filesystem-watcher "1.2.8"]
                         [org.openvoxproject/structured-logging "0.2.1"]
                         [org.openvoxproject/ring-middleware "2.0.5"]
                         [org.openvoxproject/dujour-version-check "1.0.1"]
                         [org.openvoxproject/comidi "1.0.2"]
                         [org.openvoxproject/trapperkeeper-comidi-metrics "0.1.3"]
                         [org.openvoxproject/i18n "0.9.4"]
                         [org.openvoxproject/rbac-client ~rbac-client-version]
                         [org.openvoxproject/rbac-client ~rbac-client-version :classifier "test"]
                         [org.openvoxproject/clj-shell-utils "2.0.2"]
                         [org.openvoxproject/jruby-utils "5.2.1"]

                         ;; When these versions change we need to also
                         ;; promote the changes into the PE packaging repo
                         ;; for BC (ie, clj-parent manages these versions for
                         ;; dev and FOSS, PE is managed via packages):
                         ;; https://github.com/puppetlabs/bouncy-castle-vanagon
                         [org.bouncycastle/bcpkix-fips "1.0.7"]
                         [org.bouncycastle/bc-fips "1.0.2.5"]
                         [org.bouncycastle/bctls-fips "1.0.19"]
                         [org.bouncycastle/bcpkix-jdk18on "1.78.1"]
                         [org.bouncycastle/bctls-jdk18on "1.78.1"]
                         [org.bouncycastle/bcprov-jdk18on "1.78.1"]
                         [org.bouncycastle/bcutil-jdk18on "1.78.1"]]

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
