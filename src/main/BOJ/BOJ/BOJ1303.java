package main.BOJ.BOJ;

import java.util.Scanner;

/**
 * 전쟁-전투, https://www.acmicpc.net/problem/1303, DFS
 *
 * @author hazel
 */
public class BOJ1303 {

    static Character[][] graph;
    static boolean[][] visited;

    static int[] nx = {0, -1, 0, 1};
    static int[] ny = {-1, 0, 1, 0};

    static int n, m, white, blue; //아군, 적군의 합.
    static int cnt;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        m = Integer.parseInt(scanner.next()); //세로의 크기 m
        n = Integer.parseInt(scanner.next()); //가로의 크기 n

        graph = new Character[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            for (int j = 0; j < m; j++) {
                char value = str.charAt(j);
                graph[i][j] = value;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cnt = 0; //dfs 한번 끝날때마다 초기화

                if (!visited[i][j]) {
                    if (graph[i][j] == 'W') {
                        dfs(i, j, 'W'); //white 아군
                        white += cnt * cnt;
                    } else {
                        dfs(i, j, 'B'); //blue 적군
                        blue += cnt * cnt;
                    }
                }
            }
        }
        System.out.println(white + " " + blue);
    }

    public static void dfs(int x, int y, int color) {
        cnt++; //호출할때마다 +1
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int dx = x + nx[i];
            int dy = y + ny[i];

            if (dx < 0 || dy < 0 || dx >= n || dy >= m) {
                continue;
            }

            if (!visited[dx][dy]) {
                if (graph[dx][dy] == color) {
                    dfs(dx, dy, color);
                }
            }
        }
    }
}
