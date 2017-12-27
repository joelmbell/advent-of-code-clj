(ns seventeen.day-one)

(defn- charToDigit [char]
  (Character/digit char 10))

(defn main [input ]
  (loop [index 0 sum 0]
    (if (= index (count input))
      sum
      (let [current     (nth input index)
            halfwayItem (nth
                          (cycle input)
                          (+ index (/ (count input) 2)))
            newSum      (if (= current halfwayItem)
                          (+ sum (charToDigit current))
                          sum)]
        (recur (+ 1 index) newSum)))))