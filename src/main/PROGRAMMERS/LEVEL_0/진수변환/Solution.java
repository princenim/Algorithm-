package main.PROGRAMMERS.LEVEL_0.진수변환;

import java.util.Stack;

/**
 * 10진수를 2진수로 변환하기, https://wikidocs.net/232009, 스택
 *
 * @author hazel
 */
public class Solution {
    //1. 숫자를 2로 나눈 나머지를 stack에 저장(나눌 수 없을때까지 나누기)
    //2, stack를 하나씩 출력

    public static String solution(int decimal) {
        String answer = "";
        Stack<Integer> stack = new Stack<>();
        while (decimal > 0) {
            stack.push(decimal % 2);
            decimal = decimal / 2;
        }
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(27));
        System.out.println(solution(12345));
    }
}