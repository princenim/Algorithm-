package main.LEETCODE.MEDIUM.N347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 347. Top K Frequent Elements, https://leetcode.com/problems/top-k-frequent-elements/description/,
 * 구현
 *
 * @author hazel
 */
public class Solution {

    //1. 배열을 돌면서 map에 추가
    //2.value 기준으로 오름차순
    //3. k개만큼 배열에 담아서 리턴
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        //HashMap -> list
        List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        //List를 value기준으로 정렬(내림차순)
        list.sort(Map.Entry.<Integer, Integer>comparingByValue()
                           .reversed());

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = list.get(i)
                            .getKey();
        }

        return answer;
    }
}
