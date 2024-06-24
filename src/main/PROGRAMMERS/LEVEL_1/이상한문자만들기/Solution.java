package main.PROGRAMMERS.LEVEL_1.이상한문자만들기;


/**
 * 이상한 문자 만들기, https://school.programmers.co.kr/learn/courses/30/lessons/12930, 구현 조건1. 모든 문자가 소문자인지
 * 대문자인지 모름 조건2. 공백이 1개 이상!
 *
 * @author hazel
 */

class Solution {

    public String solution(String s) {
        String answer = "";
        //먼저 소문자로 변경
        s = s.toLowerCase();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                cnt = 0;
                answer += ch;
                continue;
            }
            if (cnt % 2 == 0) {//짝수
                answer += Character.toUpperCase(ch); //짝수일때는 대문자로 변경
                cnt++;
            } else { //홀수
                answer += ch;
                cnt++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String tryHelloWorld = solution.solution("try hello world");
        System.out.println(tryHelloWorld);
    }
}
