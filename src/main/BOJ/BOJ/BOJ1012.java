package main.BOJ.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 유기농 배추
 * @author hazel
 */
public class BOJ1012 {
    //인접리스트
    static int[][] arr;
    static boolean[][] visit;
    static int[] dx = {0, -1, 0, 1}; //좌상우하 시계방향
    static int[] dy = {-1, 0, 1, 0};
    static int M, N, K;

    static int cnt;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] str = br.readLine().split(" ");
            M = Integer.parseInt(str[0]); //가로 길이
            N = Integer.parseInt(str[1]); //세로 길이
            K = Integer.parseInt(str[2]); //배추개수
            arr = new int[M][N];
            visit = new boolean[M][N];


            for (int j = 0; j < K; j++) {
                String[] xy = br.readLine().split(" ");
                int x = Integer.parseInt(xy[0]);
                int y = Integer.parseInt(xy[1]);

                arr[x][y] = 1;
            }

//            for (int[] tmp : arr) {
//                System.out.println(Arrays.toString(tmp));
//            }

            cnt = 0; //테스트 케이스마다 지렁이 개수 필요

            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (arr[j][k] == 1 && !visit[j][k]) {
                        dfs(j, k);

                        //인접한 곳을 모두 파악하면 지렁이 추가
                        cnt++;
                    }

                }
            }
            System.out.println(cnt);

        }

    }

    public static void dfs(int x, int y) {
        visit[x][y] = true; //방문처리
        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];
            if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
                if (!visit[cx][cy] && arr[cx][cy] == 1) {
                    dfs(cx, cy);

                }
            }
        }
    }
}
