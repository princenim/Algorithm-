package main.LEETCODE.MEDIUM.N1409;

import java.util.ArrayList;

/**
 * 1409. Queries on a Permutation With Key,
 * https://leetcode.com/problems/queries-on-a-permutation-with-key/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    public int[] processQueries(int[] queries, int m) {
        int[] answer = new int[queries.length];

        //p 배열 생성
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            arr.add(i);
        }

        for (int i = 0; i < queries.length; i++) {
            int value = queries[i];
            int idx = arr.indexOf(value); //index 리턴

            arr.remove(idx);
            arr.add(0, value);
            answer[i] = idx;
        }
        return answer;
    }
}
