(ns clj.problem1)

; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
; The sum of these multiples is 23.
; Find the sum of all the multiples of 3 or 5 below 1000.

(defn multiple-of-3-or-5?
  [num]
  (or (= (rem num 3) 0)
      (= (rem num 5) 0)))

(defn filter-multiple-of-3-or-5
  [collection]
  (filter
    multiple-of-3-or-5?
    collection))

(reduce +
  (filter-multiple-of-3-or-5
    (range 1 1000)))
