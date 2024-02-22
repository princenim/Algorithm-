package main.BOJ.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 촌수계산 - DFS
 * @author hazel
 */
public class BOJ2644 {
    //전체가 아니라 특정 지점으로 도달하는 문제이므로 DFS
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); ////양방향 인접 리스트
    static int n, m; //전체사람의수, 부모 자식간의 관계
    static int num1, num2;
    static boolean[] visited;

    static int cnt;
    static int answer = -1; //기본은 -1

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); //전체 사람의 수
        visited = new boolean[n + 1];

        //초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        visited = new boolean[n + 1]; // 0부터시작하니까 +1

        String[] str = br.readLine().split(" ");
        num1 = Integer.parseInt(str[0]);
        num2 = Integer.parseInt(str[1]);
        m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            String[] xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            graph.get(x).add(y);
            graph.get(y).add(x); //양방향

        }

        //System.out.println(graph);
        dfs(num1, num2, cnt);
        System.out.println(answer);

    }

    public static void dfs(int start, int end, int cnt) {
        //종료
        if (start == end) { // 7에서 시작해 3이랑 같아지면
            answer = cnt;
            return;
        }

        visited[start] = true;
        for (int i = 0; i < graph.get(start).size(); i++) {
            int next = graph.get(start).get(i);
            if (!visited[next]) {

                dfs(next, end, cnt + 1);
            }
        }
    }
}
