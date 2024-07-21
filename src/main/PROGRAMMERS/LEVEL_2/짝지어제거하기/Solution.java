package main.PROGRAMMERS.LEVEL_2.짝지어제거하기;

import java.util.Stack;

/**
 * 짝지어 제거하기, https://school.programmers.co.kr/learn/courses/30/lessons/12973 , 스택
 *
 * @author hazel
 */
public class Solution {

    //1. 문자열을 돌면서
    // 1-1. 스택이 비었으면 값을 push
    // 1-2. 스택이 안 비었으면 값을 peek
    //     1-2-1.값이 같으면 pop
    //     1-2-2.값이 다르면 push
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character value = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(value);
            } else {
                Character peek = stack.peek();
                if (value == peek) {
                    stack.pop();
                } else {
                    stack.push(value);
                }
            }
        }

        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
}
