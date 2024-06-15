package main.PROGRAMMERS.LEVEL_2.모음사전;

import java.util.ArrayList;

/**
 * 모음 사전, https://school.programmers.co.kr/learn/courses/30/lessons/84512, 완전탐색
 *
 * @author hazel
 */
public class Solution {

    static ArrayList<String> arr;
    static String[] words = {"A", "E", "I", "O", "U"};

    public int solution(String word) {
        int answer = 0;
        arr = new ArrayList<>();

        dfs("", 0, word);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)
                   .equals(word)) {
                answer = i;
                break;
            }
        }
        return answer;
    }


    public static void dfs(String str, int depth, String word) {
        arr.add(str); //문자열 추가
        //종료조건
        if (depth == 5) {
            return;
        }
        for (int i = 0; i < 5; i++) {
            dfs(str + words[i], depth + 1, word);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.solution("AAAAE");
        System.out.println(answer);
    }
}

