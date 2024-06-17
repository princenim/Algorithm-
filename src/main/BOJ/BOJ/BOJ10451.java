package main.BOJ.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 순열 사이클, https://www.acmicpc.net/problem/10451, DFS/BFS
 *
 * @author hazel
 */
public class BOJ10451 {

    static int[] arr;
    static boolean[] visited;

    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int test = 0; test < t; test++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n + 1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i < n + 1; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            visited = new boolean[n + 1]; //1부터 시작
            //System.out.println(Arrays.toString(arr));

            int cnt = 0;
            for (int i = 1; i < n + 1; i++) {
                if (!visited[i]) {
                    dfs(i);
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

    public static void dfs(int start) {
        visited[start] = true;
        int next = arr[start];
        if (!visited[next]) {
            dfs(next);
        }
    }
}
