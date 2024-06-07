package main.LEETCODE.MEDIUM.N874;

import java.util.HashSet;

/**
 * 874. Walking Robot Simulation,
 * https://leetcode.com/problems/walking-robot-simulation/description/ , 구현
 *
 * @author hazel
 */
public class Solution {

    public int robotSim(int[] commands, int[][] obstacles) {
        int dir = 0;//방향 북,동,남,서 순서
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < obstacles.length; i++) {
            set.add(obstacles[i][0] + "_" + obstacles[i][1]); //장애물 추가
        }

        int x = 0; //처음시작
        int y = 0;
        int newX;
        int newY;
        int answer = 0;
        for (int tmp : commands) {
            if (tmp == -1) { //오른쪽으로 90
                dir = (dir + 1) % 4;

            } else if (tmp == -2) { //왼쪽으로 90
                dir = (dir + 3) % 4;
            } else {
                for (int i = 0; i < tmp; i++) {
                    newX = x + dx[dir]; //newX를 통해서 이동할 곳 이 장애물인지 확인
                    newY = y + dy[dir];
                    if (set.contains(newX + "_" + newY)) {
                        break;
                    } else {
                        x = newX;
                        y = newY;
                        answer = Math.max(answer, (x * x) + (y * y));
                    }
                }
            }
        }
        return answer;
    }
}
