package main.PROGRAMMERS.LEVEL_2.전화번호목록;

import java.util.Arrays;

/**
 * 전화번호목록, https://school.programmers.co.kr/learn/courses/30/lessons/4257
 *
 * @author hazel
 */
public class Solution {

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = {"12", "11", "789"};
        boolean answer = solution.solution(arr);
        System.out.println(answer);
    }
}
