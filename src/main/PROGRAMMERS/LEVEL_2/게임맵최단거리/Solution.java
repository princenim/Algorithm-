package main.PROGRAMMERS.LEVEL_2.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 게임 맵 최단거리, https://school.programmers.co.kr/learn/courses/30/lessons/1844, DFS/BFS
 *
 * @author hazel
 */
public class Solution {
    /*
     최단거리를 구하는 문제이므로 bfs(큐)이용

     1. 이동 할 때마다 큐에 노드 추가
     2. 상하좌우로 확인해 이동가능한 노드 추가
     3. 노드를 큐에 추가할때마다 이동거리 +1
     4. 끝에 도착하면 이동거리 리턴, 도착하지못하면 -1 리턴

     */

    int[] dx = {0, -1, 0, 1};
    int[] dy = {-1, 0, 1, 0};
    boolean[][] visited; //방문체크배열
    int n, m;

    public int solution(int[][] maps) {
        n = maps.length; //가로
        m = maps[0].length; //세로
        visited = new boolean[n][m];

        return bfs(maps, 0, 0);
    }

    public int bfs(int[][] maps, int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x, y, 1));
        visited[x][y] = true;

        while (!q.isEmpty()) {

            Node current = q.poll();
            //종료조건
            if (current.x == n - 1 && current.y == m - 1) {
                return current.move;
            }

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                if (!visited[nx][ny]) {
                    if (maps[nx][ny] == 1) {
                        q.add(new Node(nx, ny, current.move + 1));
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return -1;
    } //bfs 끝

    class Node {

        int x;
        int y;
        int move;

        Node(int x, int y, int move) {
            this.x = x;
            this.y = y;
            this.move = move;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[][] arr = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int[][] arr = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0},
            {0, 0, 0, 0, 1}};
        int answer = solution.solution(arr);
        System.out.println(answer);
    }
}

