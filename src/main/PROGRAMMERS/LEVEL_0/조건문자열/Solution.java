package main.PROGRAMMERS.LEVEL_0.조건문자열;

/**
 * 조건 문자열, https://school.programmers.co.kr/learn/courses/30/lessons/18193, 연습 문제
 *
 * @author hazel
 */
class Solution {

    public int solution(String ineq, String eq, int n, int m) {
        boolean answer = false;

        if (ineq.equals(">")) {
            if (eq.equals("=")) { //== 아님!
                answer = n >= m;
            } else {
                answer = n > m;
            }

        } else {//<일때
            if (eq.equals("=")) {
                answer = n <= m;
            } else {
                answer = n < m;
            }
        }

        if (answer) {
            return 1; //조건에 맞으면 1
        } else {
            return 0; //조건에 안 맞으면 0
        }
    }
}