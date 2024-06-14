package main.PROGRAMMERS.LEVEL_2.피로도;

/**
 * 피로도, https://school.programmers.co.kr/learn/courses/30/lessons/87946, 완전탐색(dfs)
 *
 * @author hazel
 */
public class Solution {

    int n;
    boolean[] visited;
    int answer;

    public int solution(int k, int[][] dungeons) {

        n = dungeons.length;// 가로
        visited = new boolean[n]; //방문 체크 배열

        dfs(0, dungeons, k);
        return answer;
    }

    public void dfs(int depth, int[][] dungeons, int k) {
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (k >= dungeons[i][0]) {
                    visited[i] = true; //방문체크
                    dfs(depth + 1, dungeons, k - dungeons[i][1]);
                    visited[i] = false;
                }
            }
        }

        //종료조건이 없음 즉 모든 경우의 수를 살펴봄
        answer = Math.max(answer, depth);
    }
}
