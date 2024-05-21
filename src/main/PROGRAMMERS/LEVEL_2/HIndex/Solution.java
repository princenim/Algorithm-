package main.PROGRAMMERS.LEVEL_2.HIndex;

import java.util.Arrays;

/**
 * H-Index,https://school.programmers.co.kr/learn/courses/30/lessons/42747, 정렬
 *
 * @author hazel
 */
public class Solution {

    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;

        for (int i = 0; i < citations.length; i++) {
            int cnt = citations.length - i; //인용된 횟수
            if (citations[i] >= cnt) {
                answer = cnt;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3, 0, 6, 1, 5};
        int answer = solution.solution(arr);
        System.out.println(answer);
    }
}
