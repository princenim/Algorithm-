package main.LEETCODE.EASY.N682;

import java.util.Stack;

/**
 * Baseball Game,https://leetcode.com/problems/baseball-game/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            String value = operations[i];
            if (value.equals("+")) { //""주의하기 ''는 Char에서 사용
                int pre1 = stack.pop();
                int pre2 = stack.peek();
                stack.push(pre1);
                stack.push(pre1 + pre2);
            } else if (value.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (value.equals("C")) {  //제거
                stack.pop();
            } else {
                stack.push(Integer.parseInt(value)); // string to int
            }
        }

        int answer = 0;
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }
        return answer;
    }
}
