(ns app.components
  (:require [app.ui :as ui]
            [clojure.string :as str]
            [uix.core :refer [$ use-state defui]]))

(defn libs-to-pretty-string [libs]
  (->> libs
       (map (fn [{:keys [name version]}] (str name " " version)))
       (str/join " * ")))

(defui counter []
  (let [[count set-count!] (use-state 0)]
    ($ :.flex.flex-row.gap-12.items-center.ml-4.mt-2
       ($ :pre.text-3xl.mb-2.w-4.dark:text-white count)
       ($ :.gap-2
          ($ ui/button {:on-click #(set-count! inc)} "+")
          ($ ui/button {:on-click #(set-count! dec)} "-")))))

(defui app [{:keys [libs]}]
  ($ :main.flex.flex-col.gap-8.min-h-screen.justify-center.items-center.dark:bg-neutral-950.px-12.py-12
     ($ ui/heading "ClojureScript Starter"
        ($ ui/p {:class '[my-2]} "Made with "
           ($ ui/a {:href "https://github.com/pitch-io/uix"} "UIx, ")
           ($ ui/a {:href "https://tailwindcss.com"} "TailwindCSS, ")
           ($ ui/a {:href "https://github.com/thheller/shadow-cljs"} "ShadowCLJS, ")
           ($ ui/a {:href "https://bun.sh"} "and BunJS.")))
     ($ :.bg-neutral-100.dark:bg-neutral-900.rounded-xl.py-8.px-12
        ($ counter))
     ($ ui/button {:class '[my-20]
                   :on-click #(js/window.open "https://github.com/harismh/utsb-cljs-starter")}
        "Clone Repo")
     ($ :pre.text-sm.text-gray-600.dark:text-gray-400.text-center.text-wrap
        (libs-to-pretty-string libs))))
