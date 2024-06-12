package main.LEETCODE.MEDIUM.N985;


/**
 * 985. Sum of Even Numbers After Queries,
 * https://leetcode.com/problems/sum-of-even-numbers-after-queries/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int index = queries[i][1];
            int value = queries[i][0];
            nums[index] = nums[index] + value;

            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % 2 == 0) {
                    sum += nums[j];
                }
            }

            answer[i] = sum;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int[] ints = solution.sumEvenAfterQueries(arr, queries);
        System.out.println(ints);
    }
}