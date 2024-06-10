package main.LEETCODE.MEDIUM.N946;

import java.util.Stack;

/**
 * 946. Validate Stack
 * Sequences,https://leetcode.com/problems/validate-stack-sequences/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();

        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);

            while (!stack.isEmpty()) {
                if (stack.peek() == popped[j]) { //같으면
                    stack.pop();
                    j++;
                } else {
                    break;
                }
            }
        }
        return stack.isEmpty();
    }
}
