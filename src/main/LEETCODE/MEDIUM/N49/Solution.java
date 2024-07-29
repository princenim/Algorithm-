package main.LEETCODE.MEDIUM.N49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * 49. Group Anagrams, https://leetcode.com/problems/group-anagrams/, 구현
 *
 * @author hazel
 */
public class Solution {

    //1. map을 선언 (string: ArrayList<String>)
    //2. 배열을 돌면서 string을 정렬하고 정렬한 문자열을 key에 그리고 정렬하지 않은 문자열을 value에 추가한다.
    //3. value만 따로 배열에 담아서 리턴한다.
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String orderedStr = String.valueOf(charArr);

            if (map.containsKey(orderedStr)) {
                List<String> strings = map.get(orderedStr);
                strings.add(str);
                map.put(orderedStr, strings);
            } else {
                ArrayList<String> arr = new ArrayList<>();
                arr.add(str);
                map.put(orderedStr, arr);
            }
        }
        List<List<String>> answer = new ArrayList<>();

        for (Entry<String, List<String>> entrySet : map.entrySet()) {
            answer.add(entrySet.getValue());
        }
        return answer;
    }
}
