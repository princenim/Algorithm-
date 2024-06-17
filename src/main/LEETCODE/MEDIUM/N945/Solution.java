package main.LEETCODE.MEDIUM.N945;

import java.util.Arrays;

/**
 * 945. Minimum Increment to Make Array Unique,
 * https://leetcode.com/problems/minimum-increment-to-make-array-unique/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int unique = 0;
        int minimum = 0;

        for (int num : nums) {
            unique = Math.max(num, unique);
            minimum += unique - num;
            unique += 1;

        }
        return minimum;
    }
}
