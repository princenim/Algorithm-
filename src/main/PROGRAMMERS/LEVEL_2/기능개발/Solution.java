package main.PROGRAMMERS.LEVEL_2.기능개발;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 기능 개발,https://school.programmers.co.kr/learn/courses/30/lessons/42586, 스택/큐
 *
 * @author hazel
 */
public class Solution {

    public LinkedList<Integer> solution(int[] progresses, int[] speeds) {
        LinkedList<Integer> answer = new LinkedList<>();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int daysNeeded = (int) Math.ceil((double) remain / speeds[i]); //올림하기. 배포에 걸리는 시간
            q.add(daysNeeded);
        }

        int tmp = q.peek(); //큐에서 값 확인. 삭제 X
        int cnt = 0;

        while (!q.isEmpty()) {
            if (tmp >= q.peek()) {
                q.poll(); //값 삭제
                cnt++;
            } else {
                answer.add(cnt);
                cnt = 1;
                tmp = q.poll(); //값 초기화
            }
        }

        answer.add(cnt); //마지막 배포 추가
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        LinkedList<Integer> answer = solution.solution(progresses, speeds);
        System.out.println(answer);
    }
}
