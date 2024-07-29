package main.LEETCODE.EASY.N217;

import java.util.HashMap;
import java.util.Map;

/**
 * 217. Contains Duplicate, https://leetcode.com/problems/contains-duplicate/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    //배열을 돌면서 Hashmap에 값을 추가
    //Hashmap을 돌면서 value가 2이상이면 true
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
            if (entrySet.getValue() >= 2) {
                return true;
            }
        }
        return false;
    }
}
