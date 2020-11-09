(ns fp.Cwiczenia)

; 1 exercise

(print "What's your name? ")
(let [reader (java.io.BufferedReader. in)
      ln (.readLine reader)]
  (println "Your name is" ln))


(defn greet-me []
  (str "Hello, " (read-line)))

; 2 exercise

1. (read-string (read-line))
2 (doc range)
3.

(map (fn [x] (+ x 1)) [1 2 3 4 5 6 7 8])
(filter even? [1 2 3 4 5 6 7 8 9])
(filter (fn [x] (= (rem x 2)0)) [1 3 4 5 6 7 8 9])
(reduce + (take (read-string (read-line))))
(reduce (fn [acc x] (+ acc x)) [1 2 3 4 5 6 7])
(defn sum-1-to-5 []
  (reduce + (take (read-string (read-line)))))

1. (map #(expr) seq)
2. filter
3. (reduce function seq)

; 3 exercise
(and true false)
(or true false)
(not false)

(defn is-div-3-or-5? [n]
  (or (= (rem n 3) 0) (= (rem n 5) 0)))

(defn sum-1-to-5 []
  (let [n (read-string (read-line))]
    (reduce + (filter is-div-3-or-5 (range n)))
    (sum-1-to-5)

    ; 4 exercise