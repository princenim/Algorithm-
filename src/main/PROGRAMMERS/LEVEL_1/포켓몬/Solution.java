package main.PROGRAMMERS.LEVEL_1.포켓몬;

import java.util.HashMap;

/**
 * 포켓몬,https://school.programmers.co.kr/learn/courses/30/lessons/1845, 해시
 *
 * @author hazel
 */
public class Solution {

    public int solution(int[] nums) {
        int max = nums.length / 2;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                //키가 없으면
                hashMap.put(nums[i], 1);
            }
        }

        if (max > hashMap.size()) {
            return hashMap.size();
        } else {
            return max;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 1, 2, 3};
        int answer = solution.solution(nums);
        System.out.println(answer);
    }
}
