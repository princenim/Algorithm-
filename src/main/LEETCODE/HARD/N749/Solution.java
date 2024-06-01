package main.LEETCODE.HARD.N749;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 749. Contain Virus, https://leetcode.com/problems/contain-virus/description/, 구현/DFS
 * <p>
 * 1. 확산한다면 피해가 가장 클 곳을 찾기 2. 벽 세우기 3. 바이러스 확산
 * <p>
 *
 * @author hazel
 */
public class Solution {
    //todo 다시 풀기

    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};
    int n, m;

    public int containVirus(int[][] isInfected) {
        n = isInfected.length; //가로의 개수
        m = isInfected[0].length; //세로
        boolean[][] visited = new boolean[n][m];

        while (true) {

            List<Set<Integer>> regions = new ArrayList<>();
            List<Set<Integer>> threats = new ArrayList<>();
            List<Integer> walls = new ArrayList<>();

            for (int i = 0; i < n; i++) { //for문을 돌면서
                for (int j = 0; j < m; j++) {
                    if (!visited[i][j] && isInfected[i][j] == 1) { //방문하지 않았거나 1일떄
                        Set<Integer> region = new HashSet<>();
                        Set<Integer> threat = new HashSet<>();
                        int[] wall = new int[1];
                        dfs(isInfected, visited, i, j, region, threat, wall);
                    }
                }
            }
        }
    }

    public void dfs(int[][] isInfected, boolean[][] visited, int y, int x, Set<Integer> region,
        Set<Integer> threat, int[] wall) {

        visited[y][x] = true;
        region.add(y * m + x); //2차원 배열을 1차원으로 표현
    }
}
