package main.BOJ.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 유기농 배추
 * DFS
 * @author hazel
 */
public class BOJ1012 {
    static int[][] graph;
    static boolean[][] visit;
    static int[] dx = {0, -1, 0, 1}; //좌상우하로 시계방향
    static int[] dy = {-1, 0, 1, 0};
    static int M, N, K;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] str = br.readLine().split(" ");
            M = Integer.parseInt(str[0]); //가로 길이 - 열 - low
            N = Integer.parseInt(str[1]); //세로 길이 - 행 - column
            K = Integer.parseInt(str[2]); //배추 개수
            graph = new int[N][M];
            visit = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                String[] xy = br.readLine().split(" ");
                int x = Integer.parseInt(xy[0]); // M
                int y = Integer.parseInt(xy[1]); //N
                //arr[low][column]
                graph[y][x] = 1; // 주의
            }

//            for (int[] tmp : graph) {
//                System.out.println(Arrays.toString(tmp));
//            }

            cnt = 0; //지렁이 마리수
            for (int j = 0; j < N; j++) { //행
                for (int k = 0; k < M; k++) { //열
                    if (graph[j][k] == 1 && !visit[j][k]) {
                        dfs(k,j); //주의!

                        //인접한 곳을 모두 파악하면 지렁이 추가
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    public static void dfs(int x, int y) {
        visit[y][x] = true; //방문처리
        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];
            if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
                if (!visit[cy][cx] && graph[cy][cx] == 1) {
                    dfs(cx, cy);
                }
            }
        }
    }
}
