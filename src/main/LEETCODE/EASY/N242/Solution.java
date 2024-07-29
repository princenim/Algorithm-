package main.LEETCODE.EASY.N242;

import java.util.HashMap;

/**
 * 242. Valid Anagram, https://leetcode.com/problems/valid-anagram/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    //1.s를 돌면서 hashmap에 추가
    //2. t를 돌면서 hashmap에서 삭제
    //3. hashmap의 길이가 1이상이면 true, 아니면 false
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character value = s.charAt(i);
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            Character value = t.charAt(i);
            if (map.containsKey(value)) {
                if (map.get(value) == 1) {
                    map.remove(value);
                } else {
                    map.put(value, map.get(value) - 1);
                }
            } else {
                return false;
            }
        }

        System.out.println(map.size());

        if (!map.isEmpty()) {
            return false;
        }
        return true;
    }

}
