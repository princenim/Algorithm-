package main.PROGRAMMERS.KAKAO_BLIND2020.괄호변환;

import java.util.Scanner;
import java.util.Stack;

/**
 * 괄호 변환
 * @author hazel
 */
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder answer = solution.solution(str);
        System.out.println(answer);

    }

    public StringBuilder solution(String p) {
        StringBuilder u = new StringBuilder();
        String v = "";
        int lcnt = 0;
        int rcnt = 0;


        //입력이 빈 문자열인 경우 빈 문자열 반환
        if (p.isEmpty()) {
            return new StringBuilder(p);
        }

        //문자열 P를 균형잡인 괄호 문자열 u,v로 분리
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                lcnt++;
            } else {
                rcnt++;
            }
            u.append(p.charAt(i));
            if (lcnt == rcnt) { //균형 잡힌 문자열 완성
                v = p.substring(i + 1);
                break;
            }
        }


//        System.out.println("u : " + u);
//        System.out.println("v : " + v);


        //3. 올바른 문자열일떄 - 위의 과정을 반복 수행
        if (isCorrect(u.toString())) {
            return new StringBuilder(u.append(solution(v)));
        } else {
            //4. 올바른 문자열이 아니라면
            StringBuilder str = new StringBuilder("(");
            str.append(solution(v));
            str.append(")");
            u = new StringBuilder(u.substring(1, u.length() - 1)); //첫번째와 마지막 문자제거
            //나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙임
            for (int i = 0; i < u.length(); i++) {
                if (u.charAt(i) == '(') {
                    str.append(")");
                } else {
                    str.append("(");
                }
            }
            return str;
        }
    }

    //올바른 문자열인지 확인하는 메소드
    public static boolean isCorrect(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            } else {
                // ')' 일떄
                if (stack.isEmpty() || stack.peek() == ')') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return true;
    }

}
