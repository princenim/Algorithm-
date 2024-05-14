package main.PROGRAMMERS.LEVEL_1.같은숫자는싫어;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 같은 숫자는 싫어,https://school.programmers.co.kr/learn/courses/30/lessons/12906, 스택/큐
 *
 * @author hazel
 */
public class Solution {

    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int j : arr) {
            q.add(j);

        }

        int tmp = -1;
        while (!q.isEmpty()) {
            int num = q.poll();
            if (tmp != num) {
                tmp = num;
                answer.add(num);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {4, 4, 4, 4, 3, 3};
        ArrayList<Integer> answer = solution.solution(arr);
        System.out.println(answer);
    }
}
