package main.LEETCODE.EASY.N136;

/**
 * 136. Single Number,https://leetcode.com/problems/single-number/description/, 구현, xor
 * <p>
 * xor 연산을 하면 짝이 맞는 숫자는 사라짐 2^1^2 라면 2^2가 0이 되므로 사라지고 1이 남음.
 *
 * @author hazel
 */
public class Solution {

    public int singleNumber(int[] nums) {
        int xor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {4, 1, 2, 1, 2};
        int answer = solution.singleNumber(arr);
        System.out.println(answer);
    }
}
