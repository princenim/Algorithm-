package main.LEETCODE.EASY.N509;

/**
 * 509. Fibonacci Number, https://leetcode.com/problems/fibonacci-number/description/, 구현(재귀)
 *
 * @author hazel
 */
public class Solution {

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
