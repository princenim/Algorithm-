package main.BOJ.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * DFS와 BFS, https://www.acmicpc.net/problem/1260
 *
 * @author hazel
 */
public class BOJ1260 {

    //방문처리할 배열
    static boolean[] visited_dfs;
    static boolean[] visited_bfs;


    //그래프를 담을 연결 리스트
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); //문자열을 쪼개줌

        int n = Integer.parseInt(st.nextToken()); //정점
        int m = Integer.parseInt(st.nextToken()); //간선
        int v = Integer.parseInt(st.nextToken()); //시작 번호

        visited_dfs = new boolean[n + 1];
        visited_bfs = new boolean[n + 1];

        //입력값을 통해 그래프를 만들기 - 무방향 인접리스트
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 1; i <= m; i++) { //간선의 갯수만큼
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a)
                 .add(b);
            graph.get(b)
                 .add(a);
        }
        //자식이 많을때 번호가 작은 것부터 방문하기 위해 오름차순 정렬!!
        for (int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i)); //안의 배열을 하나하나 정렬
        }

        //1번 노드부터 시작
        dfs(v);
        System.out.println();
        bfs(v);

    }

    public static void dfs(int x) {
        visited_dfs[x] = true; //방문처리

        System.out.print(x + " ");
        for (int i = 0; i < graph.get(x)
                                 .size(); i++) {
            int y = graph.get(x)
                         .get(i);
            if (!visited_dfs[y]) { //방문처리 안한 노드만
                dfs(y);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited_bfs[start] = true;

        while (!q.isEmpty()) {
            int x = q.poll();
            System.out.print(x + " ");
            for (int i = 0; i < graph.get(x)
                                     .size(); i++) {
                int y = graph.get(x)
                             .get(i);
                if (!visited_bfs[y]) {
                    q.add(y);
                    visited_bfs[y] = true;
                }
            }
        }
    }
}
