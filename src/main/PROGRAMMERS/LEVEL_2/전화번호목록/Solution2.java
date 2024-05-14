package main.PROGRAMMERS.LEVEL_2.전화번호목록;

import java.util.HashMap;
import java.util.Map;

/**
 * 전화번호목록,https://school.programmers.co.kr/learn/courses/30/lessons/4257 , 해시
 *
 * @author hazel
 */
public class Solution2 {

    public boolean solution(String[] phone_book) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i); //key유무가 중요하기 때문에 Value는 중요X
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                String prefix = phone_book[i].substring(0, j);
                //System.out.println(prefix);

                if (map.containsKey(
                    prefix)) { //119 -> 1195524421가 아니라 1195524421의 substring 119 -> 119를 확인함.
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        String[] arr = {"119", "97674223", "1195524421"};
        boolean answer = solution2.solution(arr);
        System.out.println(answer);
    }
}
