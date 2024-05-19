package main.PROGRAMMERS.LEVEL_2.올바른괄호;

import java.util.Stack;

/**
 * 올바른 괄호,https://school.programmers.co.kr/learn/courses/30/lessons/12909, 스택/큐
 *
 * @author hazel
 */
public class Solution {

    boolean solution(String s) {

        if (s.length() % 2 == 1) {
            return false;
        }

        if (s.charAt(0) == ')') {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        String str = ")()(";
        boolean answer = solution.solution(str);
        System.out.println(answer);
    }
}
