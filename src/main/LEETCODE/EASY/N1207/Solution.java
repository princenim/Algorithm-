package main.LEETCODE.EASY.N1207;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 1207. Unique Number of Occurrences, https://leetcode.com/problems/unique-number-of-occurrences/,
 * 구현
 *
 * @author hazel
 */
public class Solution {

    //1. arr 배열을 돌면서 hashmap에 넣는다.
    //2. hashmap의 value를 set에 넣는다.
    //3. hashmap의 길이와 set의 길이를 비교한다.
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>(map.values());
        if (map.size() == set.size()) { //크기가 같다면 빈도가 같음.
            return true;
        }
        return false;
    }
}
