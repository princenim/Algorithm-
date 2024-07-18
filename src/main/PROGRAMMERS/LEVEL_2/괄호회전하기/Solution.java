package main.PROGRAMMERS.LEVEL_2.괄호회전하기;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 괄호 회전하기, https://school.programmers.co.kr/learn/courses/30/lessons/76502, 스택
 *
 * @author hazel
 */
public class Solution {

    //1. 문자열을 먼저 linkedlist로 수정(삽입, 삭제에 유리)
    //2. 왼쪽으로 회전시킬때마다해당 문자열이 올바른 괄호 문자열인지 확인한다.
    // (1000 * 1000 번으로 시간복잡도는 괜찮을것이라 예상)
    public int solution(String s) {
        LinkedList<Character> arr = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            arr.add(s.charAt(i));
        }

        int answer = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            boolean result = isValid(arr);
            if (result) {
                answer += 1;
            }

            arr.addLast(arr.get(0));
            arr.remove(0);
        }

        return answer;
    }

    public boolean isValid(LinkedList<Character> arr) {
        Stack<Character> stack = new Stack<>();

        if (arr.size() % 2 == 1) {
            return false;
        }
        if (arr.get(0) == '}' || arr.get(0) == ']' || arr.get(0) == ')') {
            return false;
        }

        Character value = ' ';
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == '{' || arr.get(i) == '[' || arr.get(i) == '(') {
                stack.push(arr.get(i));
            } else {
                if (!stack.isEmpty()) { //peek도 빈 스택에서 가져올때는 확인해야함!
                    value = stack.peek();
                }

                if (value == '{') {
                    if (arr.get(i) == '}') {
                        if (!stack.isEmpty()) {
                            stack.pop();
                        }
                    }
                } else if (value == '[') {
                    if (arr.get(i) == ']') {
                        if (!stack.isEmpty()) {
                            stack.pop();
                        }
                    }
                } else if (value == '(') {
                    if (arr.get(i) == ')') {
                        if (!stack.isEmpty()) {
                            stack.pop();
                        }
                    }
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution("()(()(()())())");
        System.out.println(solution1);
    }
}
