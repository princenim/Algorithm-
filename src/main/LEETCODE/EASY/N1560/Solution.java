package main.LEETCODE.EASY.N1560;

import java.util.ArrayList;
import java.util.List;

/**
 * 1560. Most Visited Sector in a Circular Track
 * https://leetcode.com/problems/most-visited-sector-in-a-circular-track/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    //한바퀴 돌면 방문 횟수는 동일 즉 출발라운드에서 마지막라운드만 비교
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> ans = new ArrayList<>();
        int start = rounds[0]; //출발 라운드
        int end = rounds[rounds.length - 1]; //마지막 라운드

        if (start <= end) { //[1,3,1,2], n=1
            for (int i = start; i <= end; i++) {
                ans.add(i);
            }
        } else { //마지막보다 출발이 더 크면 e.g [2,3,4,1], n =1
            for (int i = 1; i <= end; i++) {
                ans.add(i);
            }

            for (int i = start; i <= n; i++) {
                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 4;
        int[] arr = {1, 2, 3, 4, 1};
        List<Integer> integers = solution.mostVisited(4, arr);
        System.out.println(integers);
    }
}
