package main.LEETCODE.EASY.N844;

import java.util.Stack;

/**
 * 844. Backspace String Compare,
 * https://leetcode.com/problems/backspace-string-compare/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                stack1.push(s.charAt(i));
            } else {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#') {
                stack2.push(s.charAt(i));
            } else {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            }
        }

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        while (!stack1.isEmpty()) {
            s1.append(stack1.pop());
        }

        while (!stack2.isEmpty()) {
            s2.append(stack2.pop());
        }

        //값을 비교하도록 toString()으로
        return s1.toString()
                 .equals(s2.toString());

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean answer = solution.backspaceCompare("ab#c", "ad#c");
        System.out.println(answer);
    }
}
