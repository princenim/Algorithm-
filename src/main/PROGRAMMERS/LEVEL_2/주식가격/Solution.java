package main.PROGRAMMERS.LEVEL_2.주식가격;

import java.util.Stack;

/**
 * 주식 가격 ,https://school.programmers.co.kr/learn/courses/30/lessons/42584, 스택
 *
 * @author hazel
 */
public class Solution {
    //단순 2중 for문으로 풀면 O(N^2)이므로 10000 * 10000 일때 시간초과 가능성 존재
    //주식이 4,3 이면 4 기준일때 3으로 바로 가격이 떨어졌으므로 길이는 1이된다.
    //가격이 떨어졌을때 이전 주식들을 확인하면서 떨어진 가격보다 크면 가격을 확정할 수 있음.

    public int[] solution(int[] prices) {

        int n = prices.length;
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int pop = stack.pop();
                answer[pop] = i - pop; //가격이 떨어졌을 때 길이 확정
            }
            stack.push(i);
        }

        //이제 남은 스택의 값들은 더 이상 안 떨어진 주식들
        while (!stack.isEmpty()) {
            int pop = stack.pop();
            answer[pop] = n - 1 - pop;
        }

        return answer;
    }
}
