package com.test.groovy

/**
 * Created by wudeng on 17/6/4.
 */
class ClosureTest {
    def test(int n, closure) {
        for (i in 0..n) {
            closure(i)
        }
    }


    def sum = {
        def total = 0;
        total += it;
        total;
    }
}
