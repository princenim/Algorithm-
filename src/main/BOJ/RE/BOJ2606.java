package main.BOJ.RE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 바이러스, DFS
 *
 * @author hazel
 */
public class BOJ2606 {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //컴퓨터의 수
        int m = Integer.parseInt(br.readLine()); //컴퓨터 쌍의 개수

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a)
                 .add(b); //인접리스트
            graph.get(b)
                 .add(a);
        }

        //1번 컴퓨터에서 시작
        dfs(1);

        System.out.println(cnt);

    }

    public static void dfs(int x) {
        visited[x] = true; //방문처리

        for (int i = 0; i < graph.get(x)
                                 .size(); i++) {
            int y = graph.get(x)
                         .get(i);
            if (!visited[y]) {
                cnt++;
                dfs(y);
            }
        }
    }
}
