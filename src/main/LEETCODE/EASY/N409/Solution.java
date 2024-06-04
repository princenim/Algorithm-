package main.LEETCODE.EASY.N409;

import java.util.HashMap;
import java.util.Map;

/**
 * 409. Longest Palindrome , https://leetcode.com/problems/longest-palindrome/description/ ,
 * 구현(펠린드롬)
 *
 * @author hazel
 */
public class Solution {

    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char value = s.charAt(i);
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }

        boolean isOdd = false;//홀수인지 아닌지
        int cnt = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                cnt += entry.getValue();
            } else {
                //홀수일때 예를 들어  aaa 는 aa로 만들 수있음. 따라서 -1
                cnt += entry.getValue() - 1;
                isOdd = true;
            }
        }

        if (isOdd) {
            return cnt + 1;
        } else {
            return cnt;
        }
    }

}
