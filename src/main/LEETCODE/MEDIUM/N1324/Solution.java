package main.LEETCODE.MEDIUM.N1324;

import java.util.ArrayList;
import java.util.List;

/**
 * 1324. Print Words Vertically, https://leetcode.com/problems/print-words-vertically/, 구현
 *
 * @author hazel
 */
public class Solution {

    //1. string을 배열로 바꾼다.
    //2. for문을 돌면서 가장 긴 단어를 찾는다.
    //3. 긴 단어의 인덱스 만큼 돈다. 안에서 배열만큼 돈다.
    //  3-1. 그렇지 않다면 단어의 값을 추가
    //  3-2. 만약 각 단어의 길이보다 인덱스가 큰다면 공백을 추가
    //4. 뒤의 공백을 지운다.
    public List<String> printVertically(String s) {
        ArrayList<String> answer = new ArrayList<>();

        String[] arr = s.split(" ");
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            maxLen = Math.max(maxLen, arr[i].length());
        }

        for (int i = 0; i < maxLen; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < arr.length; j++) {
                if (i < arr[j].length()) {
                    sb.append(arr[j].charAt(i));
                } else {
                    sb.append(" ");
                }
            }

            answer.add(sb.toString()
                         .stripTrailing());
        }
        return answer;
    }
}
