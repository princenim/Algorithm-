package main.PROGRAMMERS.LEVEL_3.네트워크;

/**
 * 네트워크, https://school.programmers.co.kr/learn/courses/30/lessons/43162, DFS/BFS
 *
 * @author hazel
 */
public class Solution {
    //모든 요소를 탐색해야하므로 DFS로 풀이

    boolean[] visited;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        //방문하지 않았을때
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, i, n);
                answer++;
            }
        }
        return answer;
    }

    public void dfs(int[][] computers, int x, int n) {
        //방문 처리
        visited[x] = true;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) { //방문하지 않았고,
                if (computers[x][i] == 1) {//1일때
                    dfs(computers, i, n);
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