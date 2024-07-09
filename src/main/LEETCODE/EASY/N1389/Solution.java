package main.LEETCODE.EASY.N1389;

import java.util.LinkedList;

/**
 * 1389. Create Target Array in the Given Order,
 * https://leetcode.com/problems/create-target-array-in-the-given-order/, 구현
 *
 * @author hazel
 */
public class Solution {

    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> arr = new LinkedList<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            int idx = index[i];
            arr.add(idx, num);
            //System.out.println(Arrays.toString(arr));
        }

        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
