package main.BOJ.RE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 미로탐색 , https://www.acmicpc.net/problem/2178, BFS
 *
 * @author hazel
 */
public class BOJ2178 {


    static int n, m, cnt;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0'; //char to int
            }
        }

        //System.out.println(Arrays.deepToString(graph));
        bfs(0, 0);
        //System.out.println(Arrays.deepToString(graph));
        System.out.println(graph[n - 1][m - 1]);

    }

    public static void bfs(int x, int y) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x, y));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Pair current = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                if (graph[nx][ny] == 1) {
                    if (!visited[nx][ny]) {
                        q.add(new Pair(nx, ny));
                        visited[nx][ny] = true;
                        //이동수를 구하기위해
                        graph[nx][ny] = graph[current.x][current.y] + 1;
                    }
                }
            }
        }
    }

    static class Pair {

        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
