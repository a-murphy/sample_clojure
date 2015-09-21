(ns sample.core-test
  (:require [clojure.test :refer :all]
            [sample.core :refer :all]))

(deftest a-test
  (testing "Simple addition"
    (is (= 15 (-main 5)))))

(deftest add-1-to-1
  (is (= 2 (+ 1 1))))
