package main.LEETCODE.EASY.N1;

import java.util.HashMap;

/**
 * 1. Two Sum, https://leetcode.com/problems/two-sum/description/, 구현
 *
 * @author hazel
 */
public class Solution {
    //1. 배열을 돌면서 target-값 의 요소가 있는지 항상 확인한다.
    //1-1.만약 값이 없으면 추가

    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                answer[0] = i;
                answer[1] = map.get(target - nums[i]);
            } else {
                map.put(nums[i], i);
            }
        }
        return answer;
    }
}
