package main.LEETCODE.MEDIUM.N1545;

/**
 * 1545. Find Kth Bit in Nth Binary String,
 * https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/description/, 구현(재귀)
 *
 * @author hazel
 */
public class Solution {

    //1. 재귀로 풀이
    public char findKthBit(int n, int k) {
        String s1 = "0";
        String answer = recursion(s1, n);
        //System.out.println(answer);
        return answer.charAt(k - 1);
    }

    int cnt = 0;

    public String recursion(String str, int n) {
        cnt += 1;
        //종료조건
        if (cnt == n) {
            return str;
        }

        str = str + "1" + invertReverse(str);
        return recursion(str, n);
    }

    public String invertReverse(String str) {
        StringBuilder newStr = new StringBuilder();

        //invert (0 -> 1, 1 ->0)
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                newStr.append('1');
            } else {
                newStr.append('0');
            }
        }

        //reverse
        return newStr.reverse()
                     .toString();
    }
}
