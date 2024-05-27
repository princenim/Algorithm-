package main.LEETCODE.EASY.N1608;

/**
 * 1608. Special Array With X Elements Greater Than or Equal X ,
 * https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/,
 * 구현
 *
 * @author hazel
 */

public class Solution {

    public int specialArray(int[] nums) {
        int cnt = 0;
        for (int i = 0; i <= nums.length; i++) {
            cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i <= nums[j]) {
                    cnt += 1;
                }
            }
            if (cnt == i) {
                return cnt;
            }


        }//for문 종료
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3, 5};
        int answer = solution.specialArray(arr);
        System.out.println(answer);
    }
}