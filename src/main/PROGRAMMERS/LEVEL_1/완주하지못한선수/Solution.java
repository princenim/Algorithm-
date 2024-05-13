package main.PROGRAMMERS.LEVEL_1.완주하지못한선수;

import java.util.HashMap;

/**
 * 완주하지 못한 선수 ,https://school.programmers.co.kr/learn/courses/30/lessons/42576, 해시
 *
 * @author hazel
 */
public class Solution {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String string : completion) {
            if (hashMap.containsKey(string)) {
                hashMap.put(string, hashMap.get(string) + 1);
            } else {
                hashMap.put(string, 1);
            }
        }

        for (String s : participant) {
            if (hashMap.containsKey(s)) {
                if (hashMap.get(s) != 0) {
                    hashMap.put(s, hashMap.get(s) - 1);
                } else {
                    return s;
                }
            } else {
                return s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "mislav", "ana"};

        String answer = solution.solution(participant, completion);
        System.out.println(answer);
    }
}

