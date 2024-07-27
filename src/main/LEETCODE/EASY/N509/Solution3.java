package main.LEETCODE.EASY.N509;

/**
 * 509. Fibonacci Number, https://leetcode.com/problems/fibonacci-number/description/, 메모이제이션
 *
 * @author hazel
 */
public class Solution3 {

    int[] memo;

    public int fib(int n) {
        memo = new int[n + 1];
        recursion(n);

        return memo[n];

    }

    public int recursion(int n) {
        //이미 값이 존재하면 리턴
        if (memo[n] < 0) {
            return memo[n];
        }

        if (n == 0) {
            return memo[0] = 0;
        }
        if (n == 1) {
            return memo[1] = 1;
        }

        return memo[n] = recursion(n - 1) + recursion(n - 2);
    }
}
