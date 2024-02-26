package main.BOJ.BOJ.BOJ2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 미로탐색
 * BFS 최단거리구하기
 * @author hazel
 */
public class BOJ2178 {

    static int[] dx = {0, -1, 0, 1}; //좌상우하
    static int[] dy = {-1, 0, 1, 0};

    static int N;
    static int M;

    static int[][] arr;
    static boolean[][] visited;
    static int cnt = 1;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        N = Integer.parseInt(nm[0]); //행
        M = Integer.parseInt(nm[1]); //열
        arr = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }


        //System.out.println(Arrays.deepToString(arr));
        bfs(0, 0);
        //System.out.println(Arrays.deepToString(arr));
        System.out.println(arr[N - 1][M - 1]);


    }

    public static void bfs(int x, int y) {

        Queue<Pair> q = new LinkedList<>();
        visited[x][y] = true;
        q.add(new Pair(x, y));

        while (!q.isEmpty()) {
            Pair current = q.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }

                if (arr[nx][ny] == 1 && !visited[nx][ny]) {
                    q.add(new Pair(nx, ny));
                    visited[nx][ny] = true;
                    arr[nx][ny] = (arr[current.x][current.y] + 1);
                }

            }
        }
    }
}

class Pair {
    int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
