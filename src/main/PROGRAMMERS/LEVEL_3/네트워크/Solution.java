package main.PROGRAMMERS.LEVEL_3.네트워크;

import java.util.Arrays;

/**
 * 네트워크, https://school.programmers.co.kr/learn/courses/30/lessons/43162, DFS/BFS
 *
 * @author hazel
 */
public class Solution {


    boolean[] visited;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {

            System.out.println(Arrays.toString(visited));
            if (!visited[i]) {
                answer++;
                dfs(i, n, computers);
            }
        }
        return answer;
    }

    public void dfs(int x, int n, int[][] computers) {
        visited[x] = true;//방문 처리

        for (int i = 0; i < n; i++) {
            if (computers[x][i] == 1) {
                if (!visited[i]) { //방문안 했고
                    dfs(i, n, computers);
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int answer = solution.solution(3, arr);
        System.out.println(answer);
    }
}
