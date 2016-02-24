(defproject me.arrdem/clojarr (slurp "VERSION")
  :source-paths      ["src/clj"]
  :java-source-paths ["src/jvm" "test/java"]
  :test-paths        ["test/clojure"]
  :resource-paths    ["src/resources"]
  :profiles {:dev {:plugins [[me.arrdem/lein-cljfmt "0.4.5"]]
                   :cljfmt  {:indents {fn*                 [[:inner 0]]
                                       as->                [[:inner 0]]
                                       with-debug-bindings [[:inner 0]]
                                       merge-meta          [[:inner 0]]
                                       add-doc-and-meta    [[:inner 0]]}}}})

