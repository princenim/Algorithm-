package main.PROGRAMMERS.TEST.문자열;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * C사 1번문제 다시 풀이
 *
 * @author hazel
 */
public class Solution {

    static String dest = "";

    public String solution(String start) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < start.length(); i++) {
            char c = start.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        while (!map.isEmpty()) {
            Iterator<Entry<Character, Integer>> iterator = map.entrySet()
                                                              .iterator();

            while (iterator.hasNext()) {
                Map.Entry<Character, Integer> entry = iterator.next();
                int value = entry.getValue();
                dest += entry.getKey();
                int afterValue = value - 1;
                if (afterValue == 0) {
                    iterator.remove();
                } else {
                    map.put(entry.getKey(), afterValue);
                }
            }
        }
        return dest;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String answer = solution.solution("execute");
        System.out.println(answer);
    }
}
