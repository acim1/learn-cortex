;; gorilla-repl.fileformat = 1

;; **
;;; # Gorilla REPL
;;; 
;;; Welcome to gorilla :-)
;;; 
;;; Shift + enter evaluates code. Hit alt+g twice in quick succession or click the menu icon (upper-right corner) for more commands ...
;;; 
;;; It's a good habit to run each worksheet in its own namespace: feel free to use the declaration we've provided below if you'd like.
;; **

;; @@
(ns frightened-resonance

 (:require   

  [cortex.experiment.train :as train]  

  [cortex.nn.execute :as execute]  

  [cortex.nn.layers :as layers]  

  [cortex.nn.network :as network]  

  [learn-cortex.tutorial :as tut] :reload))



;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>3</span>","value":"3"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[3 0]"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>1</span>","value":"1"},{"type":"html","content":"<span class='clj-unkown'>7</span>","value":"7"}],"value":"[1 7]"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>7</span>","value":"7"},{"type":"html","content":"<span class='clj-unkown'>4</span>","value":"4"}],"value":"[7 4]"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>4</span>","value":"4"},{"type":"html","content":"<span class='clj-unkown'>6</span>","value":"6"}],"value":"[4 6]"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>4</span>","value":"4"},{"type":"html","content":"<span class='clj-unkown'>8</span>","value":"8"}],"value":"[4 8]"}],"value":"[[3 0] [1 7] [7 4] [4 6] [4 8]]"}
;; <=

;; @@
(into [] (take 5 (tut/gen-random-seq-input)))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"},{"type":"html","content":"<span class='clj-unkown'>5</span>","value":"5"}],"value":"[0 5]"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>5</span>","value":"5"},{"type":"html","content":"<span class='clj-unkown'>5</span>","value":"5"}],"value":"[5 5]"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>1</span>","value":"1"},{"type":"html","content":"<span class='clj-unkown'>4</span>","value":"4"}],"value":"[1 4]"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"},{"type":"html","content":"<span class='clj-unkown'>1</span>","value":"1"}],"value":"[0 1]"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>3</span>","value":"3"},{"type":"html","content":"<span class='clj-unkown'>5</span>","value":"5"}],"value":"[3 5]"}],"value":"[[0 5] [5 5] [1 4] [0 1] [3 5]]"}
;; <=

;; @@
(into [] (take 5 (tut/gen-random-seq)))
;; @@
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:y</span>","value":":y"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-long'>0</span>","value":"0"}],"value":"[0]"}],"value":"[:y [0]]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:x</span>","value":":x"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>3</span>","value":"3"},{"type":"html","content":"<span class='clj-unkown'>0</span>","value":"0"}],"value":"[3 0]"}],"value":"[:x [3 0]]"}],"value":"{:y [0], :x [3 0]}"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:y</span>","value":":y"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-long'>14</span>","value":"14"}],"value":"[14]"}],"value":"[:y [14]]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:x</span>","value":":x"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>2</span>","value":"2"},{"type":"html","content":"<span class='clj-unkown'>7</span>","value":"7"}],"value":"[2 7]"}],"value":"[:x [2 7]]"}],"value":"{:y [14], :x [2 7]}"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:y</span>","value":":y"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-long'>56</span>","value":"56"}],"value":"[56]"}],"value":"[:y [56]]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:x</span>","value":":x"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>7</span>","value":"7"},{"type":"html","content":"<span class='clj-unkown'>8</span>","value":"8"}],"value":"[7 8]"}],"value":"[:x [7 8]]"}],"value":"{:y [56], :x [7 8]}"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:y</span>","value":":y"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-long'>48</span>","value":"48"}],"value":"[48]"}],"value":"[:y [48]]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:x</span>","value":":x"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>6</span>","value":"6"},{"type":"html","content":"<span class='clj-unkown'>8</span>","value":"8"}],"value":"[6 8]"}],"value":"[:x [6 8]]"}],"value":"{:y [48], :x [6 8]}"},{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:y</span>","value":":y"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-long'>40</span>","value":"40"}],"value":"[40]"}],"value":"[:y [40]]"},{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:x</span>","value":":x"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-unkown'>5</span>","value":"5"},{"type":"html","content":"<span class='clj-unkown'>8</span>","value":"8"}],"value":"[5 8]"}],"value":"[:x [5 8]]"}],"value":"{:y [40], :x [5 8]}"}],"value":"[{:y [0], :x [3 0]} {:y [14], :x [2 7]} {:y [56], :x [7 8]} {:y [48], :x [6 8]} {:y [40], :x [5 8]}]"}
;; <=

;; @@
(def teach-dataset  

  (into [] (take 20000 (tut/gen-random-seq))))

(def test-dataset  

  (into [] (take 20000 (tut/gen-random-seq))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;frightened-resonance/test-dataset</span>","value":"#'frightened-resonance/test-dataset"}
;; <=

;; @@
(def my-network (network/linear-network 

  [(layers/input 2 1 1 :id :x)  

   (layers/linear->tanh 10)  

   (layers/tanh)  

   (layers/linear 1 :id :y)]))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;frightened-resonance/my-network</span>","value":"#'frightened-resonance/my-network"}
;; <=

;; @@
(def trained  (binding [*out* (clojure.java.io/writer "my-training.log")]  

  (train/train-n my-network teach-dataset test-dataset    

    :batch-size 1000    

    :network-filestem "my-fn"    

    :epoch-count 3000)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;frightened-resonance/trained</span>","value":"#'frightened-resonance/trained"}
;; <=

;; @@
(use 'clojure.repl)
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(doc layers/input)
;; @@
;; ->
;;; -------------------------
;;; cortex.nn.layers/input
;;; ([arg] [width height channels &amp; args])
;;;   nil
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(execute/run trained [{:x [0 1]}])
;; @@
;; ->
;;; CUDA backend creation failed, reverting to CPU
;;; 
;; <-
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:y</span>","value":":y"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>-0.12111949920654297</span>","value":"-0.12111949920654297"}],"value":"[-0.12111949920654297]"}],"value":"[:y [-0.12111949920654297]]"}],"value":"{:y [-0.12111949920654297]}"}],"value":"[{:y [-0.12111949920654297]}]"}
;; <=

;; @@
(execute/run trained [{:x [5 1.5]}])
;; @@
;; ->
;;; CUDA backend creation failed, reverting to CPU
;;; 
;; <-
;; =>
;;; {"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"list-like","open":"<span class='clj-map'>{</span>","close":"<span class='clj-map'>}</span>","separator":", ","items":[{"type":"list-like","open":"","close":"","separator":" ","items":[{"type":"html","content":"<span class='clj-keyword'>:y</span>","value":":y"},{"type":"list-like","open":"<span class='clj-vector'>[</span>","close":"<span class='clj-vector'>]</span>","separator":" ","items":[{"type":"html","content":"<span class='clj-double'>7.524399757385254</span>","value":"7.524399757385254"}],"value":"[7.524399757385254]"}],"value":"[:y [7.524399757385254]]"}],"value":"{:y [7.524399757385254]}"}],"value":"[{:y [7.524399757385254]}]"}
;; <=

;; @@
(def input 

  (into [] (take 30 (tut/gen-random-seq))))

(def results (execute/run trained input))
;; @@
;; ->
;;; CUDA backend creation failed, reverting to CPU
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;frightened-resonance/results</span>","value":"#'frightened-resonance/results"}
;; <=

;; @@
(clojure.pprint/pprint (take 3 results))
;; @@
;; ->
;;; ({:y [32.2270393371582]}
;;;  {:y [0.11355781555175781]}
;;;  {:y [-0.08882713317871094]})
;;; 
;; <-
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(require '[gorilla-plot.core :as plot])
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(plot/list-plot (flatten (map :y results)) :color "#ffcc77" :joined true)
;; @@
;; =>
;;; {"type":"vega","content":{"width":400,"height":247.2187957763672,"padding":{"top":10,"left":55,"bottom":40,"right":10},"data":[{"name":"c831660d-24df-4cba-b78f-eb38713057dc","values":[{"x":0,"y":32.2270393371582},{"x":1,"y":0.11355781555175781},{"x":2,"y":-0.08882713317871094},{"x":3,"y":44.99349594116211},{"x":4,"y":47.9461784362793},{"x":5,"y":14.033418655395508},{"x":6,"y":53.9570426940918},{"x":7,"y":3.0519514083862305},{"x":8,"y":55.82101058959961},{"x":9,"y":0.02042388916015625},{"x":10,"y":63.08921432495117},{"x":11,"y":5.026350021362305},{"x":12,"y":16.184036254882812},{"x":13,"y":35.00353240966797},{"x":14,"y":0.013704299926757812},{"x":15,"y":23.90774154663086},{"x":16,"y":9.709062576293945},{"x":17,"y":-0.013348579406738281},{"x":18,"y":35.06547546386719},{"x":19,"y":0.13965129852294922},{"x":20,"y":40.30485534667969},{"x":21,"y":1.3574676513671875},{"x":22,"y":18.01355743408203},{"x":23,"y":48.99831771850586},{"x":24,"y":35.97220993041992},{"x":25,"y":8.785130500793457},{"x":26,"y":27.01892852783203},{"x":27,"y":18.14027214050293},{"x":28,"y":12.19281005859375},{"x":29,"y":44.99349594116211}]}],"marks":[{"type":"line","from":{"data":"c831660d-24df-4cba-b78f-eb38713057dc"},"properties":{"enter":{"x":{"scale":"x","field":"data.x"},"y":{"scale":"y","field":"data.y"},"stroke":{"value":"#ffcc77"},"strokeWidth":{"value":2},"strokeOpacity":{"value":1}}}}],"scales":[{"name":"x","type":"linear","range":"width","zero":false,"domain":{"data":"c831660d-24df-4cba-b78f-eb38713057dc","field":"data.x"}},{"name":"y","type":"linear","range":"height","nice":true,"zero":false,"domain":{"data":"c831660d-24df-4cba-b78f-eb38713057dc","field":"data.y"}}],"axes":[{"type":"x","scale":"x"},{"type":"y","scale":"y"}]},"value":"#gorilla_repl.vega.VegaView{:content {:width 400, :height 247.2188, :padding {:top 10, :left 55, :bottom 40, :right 10}, :data [{:name \"c831660d-24df-4cba-b78f-eb38713057dc\", :values ({:x 0, :y 32.2270393371582} {:x 1, :y 0.11355781555175781} {:x 2, :y -0.08882713317871094} {:x 3, :y 44.99349594116211} {:x 4, :y 47.9461784362793} {:x 5, :y 14.033418655395508} {:x 6, :y 53.9570426940918} {:x 7, :y 3.0519514083862305} {:x 8, :y 55.82101058959961} {:x 9, :y 0.02042388916015625} {:x 10, :y 63.08921432495117} {:x 11, :y 5.026350021362305} {:x 12, :y 16.184036254882812} {:x 13, :y 35.00353240966797} {:x 14, :y 0.013704299926757812} {:x 15, :y 23.90774154663086} {:x 16, :y 9.709062576293945} {:x 17, :y -0.013348579406738281} {:x 18, :y 35.06547546386719} {:x 19, :y 0.13965129852294922} {:x 20, :y 40.30485534667969} {:x 21, :y 1.3574676513671875} {:x 22, :y 18.01355743408203} {:x 23, :y 48.99831771850586} {:x 24, :y 35.97220993041992} {:x 25, :y 8.785130500793457} {:x 26, :y 27.01892852783203} {:x 27, :y 18.14027214050293} {:x 28, :y 12.19281005859375} {:x 29, :y 44.99349594116211})}], :marks [{:type \"line\", :from {:data \"c831660d-24df-4cba-b78f-eb38713057dc\"}, :properties {:enter {:x {:scale \"x\", :field \"data.x\"}, :y {:scale \"y\", :field \"data.y\"}, :stroke {:value \"#ffcc77\"}, :strokeWidth {:value 2}, :strokeOpacity {:value 1}}}}], :scales [{:name \"x\", :type \"linear\", :range \"width\", :zero false, :domain {:data \"c831660d-24df-4cba-b78f-eb38713057dc\", :field \"data.x\"}} {:name \"y\", :type \"linear\", :range \"height\", :nice true, :zero false, :domain {:data \"c831660d-24df-4cba-b78f-eb38713057dc\", :field \"data.y\"}}], :axes [{:type \"x\", :scale \"x\"} {:type \"y\", :scale \"y\"}]}}"}
;; <=

;; @@
(plot/compose  

  (plot/list-plot   

    (flatten (map :y results))   

      :color "blue"   

      :opacity 0.3   

      :joined true)  

  (plot/list-plot   

    (flatten (map #(let [v (% :x)] (* (first v) (second v))) input))   

      :color "blue"   

      :opacity 0.3   

      :joined true))
;; @@
;; =>
;;; {"type":"vega","content":{"width":400,"height":247.2187957763672,"padding":{"top":10,"left":55,"bottom":40,"right":10},"scales":[{"name":"x","type":"linear","range":"width","zero":false,"domain":{"data":"02794ddf-2cdb-4058-a53f-1fe41893ba30","field":"data.x"}},{"name":"y","type":"linear","range":"height","nice":true,"zero":false,"domain":{"data":"02794ddf-2cdb-4058-a53f-1fe41893ba30","field":"data.y"}}],"axes":[{"type":"x","scale":"x"},{"type":"y","scale":"y"}],"data":[{"name":"02794ddf-2cdb-4058-a53f-1fe41893ba30","values":[{"x":0,"y":32.2270393371582},{"x":1,"y":0.11355781555175781},{"x":2,"y":-0.08882713317871094},{"x":3,"y":44.99349594116211},{"x":4,"y":47.9461784362793},{"x":5,"y":14.033418655395508},{"x":6,"y":53.9570426940918},{"x":7,"y":3.0519514083862305},{"x":8,"y":55.82101058959961},{"x":9,"y":0.02042388916015625},{"x":10,"y":63.08921432495117},{"x":11,"y":5.026350021362305},{"x":12,"y":16.184036254882812},{"x":13,"y":35.00353240966797},{"x":14,"y":0.013704299926757812},{"x":15,"y":23.90774154663086},{"x":16,"y":9.709062576293945},{"x":17,"y":-0.013348579406738281},{"x":18,"y":35.06547546386719},{"x":19,"y":0.13965129852294922},{"x":20,"y":40.30485534667969},{"x":21,"y":1.3574676513671875},{"x":22,"y":18.01355743408203},{"x":23,"y":48.99831771850586},{"x":24,"y":35.97220993041992},{"x":25,"y":8.785130500793457},{"x":26,"y":27.01892852783203},{"x":27,"y":18.14027214050293},{"x":28,"y":12.19281005859375},{"x":29,"y":44.99349594116211}]},{"name":"b3037bc6-0eac-4abb-81f0-906d1be0ea2d","values":[{"x":0,"y":32},{"x":1,"y":0},{"x":2,"y":0},{"x":3,"y":45},{"x":4,"y":48},{"x":5,"y":14},{"x":6,"y":54},{"x":7,"y":3},{"x":8,"y":56},{"x":9,"y":0},{"x":10,"y":63},{"x":11,"y":5},{"x":12,"y":16},{"x":13,"y":35},{"x":14,"y":0},{"x":15,"y":24},{"x":16,"y":10},{"x":17,"y":0},{"x":18,"y":35},{"x":19,"y":0},{"x":20,"y":40},{"x":21,"y":1},{"x":22,"y":18},{"x":23,"y":49},{"x":24,"y":36},{"x":25,"y":9},{"x":26,"y":27},{"x":27,"y":18},{"x":28,"y":12},{"x":29,"y":45}]}],"marks":[{"type":"line","from":{"data":"02794ddf-2cdb-4058-a53f-1fe41893ba30"},"properties":{"enter":{"x":{"scale":"x","field":"data.x"},"y":{"scale":"y","field":"data.y"},"stroke":{"value":"blue"},"strokeWidth":{"value":2},"strokeOpacity":{"value":0.3}}}},{"type":"line","from":{"data":"b3037bc6-0eac-4abb-81f0-906d1be0ea2d"},"properties":{"enter":{"x":{"scale":"x","field":"data.x"},"y":{"scale":"y","field":"data.y"},"stroke":{"value":"blue"},"strokeWidth":{"value":2},"strokeOpacity":{"value":0.3}}}}]},"value":"#gorilla_repl.vega.VegaView{:content {:width 400, :height 247.2188, :padding {:top 10, :left 55, :bottom 40, :right 10}, :scales [{:name \"x\", :type \"linear\", :range \"width\", :zero false, :domain {:data \"02794ddf-2cdb-4058-a53f-1fe41893ba30\", :field \"data.x\"}} {:name \"y\", :type \"linear\", :range \"height\", :nice true, :zero false, :domain {:data \"02794ddf-2cdb-4058-a53f-1fe41893ba30\", :field \"data.y\"}}], :axes [{:type \"x\", :scale \"x\"} {:type \"y\", :scale \"y\"}], :data ({:name \"02794ddf-2cdb-4058-a53f-1fe41893ba30\", :values ({:x 0, :y 32.2270393371582} {:x 1, :y 0.11355781555175781} {:x 2, :y -0.08882713317871094} {:x 3, :y 44.99349594116211} {:x 4, :y 47.9461784362793} {:x 5, :y 14.033418655395508} {:x 6, :y 53.9570426940918} {:x 7, :y 3.0519514083862305} {:x 8, :y 55.82101058959961} {:x 9, :y 0.02042388916015625} {:x 10, :y 63.08921432495117} {:x 11, :y 5.026350021362305} {:x 12, :y 16.184036254882812} {:x 13, :y 35.00353240966797} {:x 14, :y 0.013704299926757812} {:x 15, :y 23.90774154663086} {:x 16, :y 9.709062576293945} {:x 17, :y -0.013348579406738281} {:x 18, :y 35.06547546386719} {:x 19, :y 0.13965129852294922} {:x 20, :y 40.30485534667969} {:x 21, :y 1.3574676513671875} {:x 22, :y 18.01355743408203} {:x 23, :y 48.99831771850586} {:x 24, :y 35.97220993041992} {:x 25, :y 8.785130500793457} {:x 26, :y 27.01892852783203} {:x 27, :y 18.14027214050293} {:x 28, :y 12.19281005859375} {:x 29, :y 44.99349594116211})} {:name \"b3037bc6-0eac-4abb-81f0-906d1be0ea2d\", :values ({:x 0, :y 32} {:x 1, :y 0} {:x 2, :y 0} {:x 3, :y 45} {:x 4, :y 48} {:x 5, :y 14} {:x 6, :y 54} {:x 7, :y 3} {:x 8, :y 56} {:x 9, :y 0} {:x 10, :y 63} {:x 11, :y 5} {:x 12, :y 16} {:x 13, :y 35} {:x 14, :y 0} {:x 15, :y 24} {:x 16, :y 10} {:x 17, :y 0} {:x 18, :y 35} {:x 19, :y 0} {:x 20, :y 40} {:x 21, :y 1} {:x 22, :y 18} {:x 23, :y 49} {:x 24, :y 36} {:x 25, :y 9} {:x 26, :y 27} {:x 27, :y 18} {:x 28, :y 12} {:x 29, :y 45})}), :marks ({:type \"line\", :from {:data \"02794ddf-2cdb-4058-a53f-1fe41893ba30\"}, :properties {:enter {:x {:scale \"x\", :field \"data.x\"}, :y {:scale \"y\", :field \"data.y\"}, :stroke {:value \"blue\"}, :strokeWidth {:value 2}, :strokeOpacity {:value 0.3}}}} {:type \"line\", :from {:data \"b3037bc6-0eac-4abb-81f0-906d1be0ea2d\"}, :properties {:enter {:x {:scale \"x\", :field \"data.x\"}, :y {:scale \"y\", :field \"data.y\"}, :stroke {:value \"blue\"}, :strokeWidth {:value 2}, :strokeOpacity {:value 0.3}}}})}}"}
;; <=

;; @@

;; @@
