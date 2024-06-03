package main.LEETCODE.EASY.N344;

/**
 * 344. Reverse String,https://leetcode.com/problems/reverse-string/description/,two-pointers
 *
 * @author hazel
 */
public class Solution {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char tmp = 0;

        while (left < right) {
            tmp = s[right];
            s[right] = s[left];
            s[left] = tmp;

            left++;
            right--;
        }
    }
}
