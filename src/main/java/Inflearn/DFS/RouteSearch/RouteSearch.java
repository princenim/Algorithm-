package Inflearn.DFS.RouteSearch;

import java.util.Scanner;

/**
 * @author hazel
 */
public class RouteSearch {
    //7-12. 그래프 경로 탐색(인접 행렬) DFS
    //방향 그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하시오.
    //그래프에서 한번 방문한 노드는 다시 방문하지 않음.

    //하지만 이 방법은 n의 숫자가 커질수록 이 방법은 불필요



    //전역변수
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;


    public static void main(String[] args) {
        RouteSearch T = new RouteSearch();
        Scanner kb = new Scanner(System.in);
        //만들때 변수 주의하기, 미리 만들어 둔 클래스변수에 값을 넣어야함. !!
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n + 1][n + 1];
        //체크배열
        ch = new int[n + 1]; // 이미 온 경로인지 체크

        // 그래프 정보 입력
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1; // 1부터 시작하므로 1에 체크 -> 여기 중요!!!! 먼저 체크하고 시작 해야함.
        T.DFS(1);
        System.out.println(answer);
    }



    public void DFS(int v) {
        //만약에 n이 5라면 즉 1번노드에서 5번 노드까지 왔기 때문에 answer++;
        if (v == n) {
            answer++;
        } else {
            //1번 노드부터 n번 노드까지
            for (int i = 1; i <= n; i++) {
                //1번 정점에서 갈 수 있는 i번 정점을 갈 수 있어야하고, 방문을 안 했어야함,
                // 1번 정점이라면 ,(1 1),(1 2),(1 3),(1 4),(1 5) 이렇게 방문
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);

                    //다시 백 했을 때 다시 체크 풀어주기
                    ch[i] = 0;
                }
            }
        }
    }
}
