package main.PROGRAMMERS.LEVEL_2.프로세스;

import java.util.Collections;
import java.util.PriorityQueue;


/**
 * 프로세스,https://school.programmers.co.kr/learn/courses/30/lessons/42587, 스택/큐
 *
 * @author hazel
 */
public class Solution {

    public int solution(int[] priorities, int location) {

        // 우선순위 큐
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i : priorities) {
            q.add(i);
        }
        while (!q.isEmpty()) {
            // 기존 배열 순회
            for (int i = 0; i < priorities.length; i++) {
                // 현재 작업의 위치 찾기
                if (q.peek() == priorities[i]) {
                    q.poll();
                    answer++;

                    // 현재 작업이 location과 같으면 answer 반환
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2, 1, 3, 2};
        int answer = solution.solution(arr, 1);
        System.out.println(answer);
    }
}
