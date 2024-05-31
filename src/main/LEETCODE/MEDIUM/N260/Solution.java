package main.LEETCODE.MEDIUM.N260;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 260. Single Number III, https://leetcode.com/problems/single-number-iii/description/, 구현
 * <p>
 * 풀이 1 : 통과했으나 문제 조건에 맞지 않아서 틀림
 *
 * @author hazel
 */
public class Solution {

    public int[] singleNumber(int[] nums) {
        int[] answers = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                arr.add(entry.getKey());
            }
        }
        for (int i = 0; i < answers.length; i++) {
            answers[i] = arr.get(i);
        }
        return answers;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] answer = solution.singleNumber(new int[]{1, 2, 1, 3, 2, 5});
        System.out.println(Arrays.toString(answer));
    }
}
