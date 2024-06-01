package main.LEETCODE.EASY.N3110;

/**
 * 3110. Score of a String,https://leetcode.com/problems/score-of-a-string/description/
 *
 * @author hazel
 */
public class Solution {

    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int currentAscii = s.charAt(i);
            int nextAscii = s.charAt(i + 1);
            sum += Math.abs(currentAscii - nextAscii);

        }
        return sum;
    }
}