package main.PROGRAMMERS.LEVEL_2.석유시추;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 석유 시추 , https://school.programmers.co.kr/learn/courses/30/lessons/250136, BFS/DFS
 *
 * @author hazel
 */
public class Solution {

    static int[] nx = {0, -1, 0, 1}; //왼쪽부터
    static int[] ny = {-1, 0, 1, 0};
    static int cnt = 0;
    static int n;
    static int m;
    static boolean[][] visited;
    static int[] oil; // 수직으로 뚫었을때 얻을 수 있는 석유의 총 양

    public int solution(int[][] land) {

        int answer = 0;
        n = land.length;
        m = land[0].length;
        oil = new int[m];//
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1) {
                    if (!visited[i][j]) {
                        cnt = bfs(i, j, land);
                    }
                }

            }
        }

        //System.out.println(Arrays.toString(oil));
        for (int tmp : oil) {
            answer = Math.max(tmp, answer);
        }

        return answer;
    }

    public static int bfs(int x, int y, int[][] land) {
        cnt = 1;
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x, y));
        visited[x][y] = true;
        Set<Integer> set = new HashSet<>(); //석유 덩어리 열 위치 저장

        while (!q.isEmpty()) {
            Node current = q.poll();
            set.add(current.y); //열 위치 저장
            for (int i = 0; i < 4; i++) {
                int dx = current.x + nx[i];
                int dy = current.y + ny[i];

                if (dx < 0 || dx >= n || dy < 0 || dy >= m) {
                    continue;
                }

                if (!visited[dx][dy]) { //방문안했고,
                    if (land[dx][dy] == 1) {
                        q.add(new Node(dx, dy));
                        visited[dx][dy] = true;//DFS아님 방문처리해야함
                        cnt += 1;
                    }
                }
            }
        }

        for (int tmp : set) { //열 위치에 해당하는 양을 oil에 추가
            oil[tmp] += cnt;
        }

        return cnt;
    }

    static class Node {

        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] arr = {{0, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 0, 0, 0, 1, 1, 0},
            {1, 1, 1, 0, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0, 1, 1}};
        int answer = solution.solution(arr);
        System.out.println(answer);
    }

}
