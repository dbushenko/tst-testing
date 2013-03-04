(ns tst-testing.core-test
  (:use clojure.test
        tst-testing.core))

(deftest a-test1
  (testing "func1"
    (is (= 1 1))))

(deftest a-test2
  (testing "func2"
    (is (= 0 1))))

(deftest a-test3
  (testing "func3"
    (is (= 0 1))))


(deftest a-test4
  (testing "func4"
    (is (= 1 1))))
