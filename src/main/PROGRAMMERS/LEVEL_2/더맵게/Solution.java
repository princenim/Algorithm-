package main.PROGRAMMERS.LEVEL_2.더맵게;

import java.util.PriorityQueue;

/**
 * 더 맵게, https://school.programmers.co.kr/learn/courses/30/lessons/42626,힙
 *
 * @author hazel
 */
public class Solution {

    public int solution(int[] scoville, int k) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>(); //우선순위큐 -> 힙
        for (int j : scoville) {
            heap.add(j);
        }

        while (heap.peek() < k) {
            int min1 = heap.poll();
            int min2 = heap.poll();
            int num = min1 + (min2 * 2);

            heap.add(num);
            answer++;

            //모든 스코빌 지수를 k 이상으로 만들 수 없는 경우
            if (heap.size() == 1) {
                if (heap.peek() < k) {
                    return -1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 9, 10, 12};
        int k = 7;
        int answer = solution.solution(arr, k);
        System.out.println(answer);
    }
}
