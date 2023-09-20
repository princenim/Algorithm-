package INFLEARN.BFS.GraphShortestDistance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author hazel
 */

public class GraphShortestDistance {
    //7-14. 그래프 최단거리 (BFS)
    //1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요. -> 레벨이 아닌 배열로 풀었을때

    static ArrayList<ArrayList<Integer>> graph;
    static int n, m = 0;
    //dis은 출력할 배열
    static int[] ch, dis;


    public void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        q.add(v);

        while (!q.isEmpty()) {
            //cv= current vertex
            int cv = q.poll();
            //인접 리스트
            //nv = next vertex
            for (int nv : graph.get(cv)) {
                //방문 안했을 때
                if (ch[nv] == 0) {
                    //체크해주고
                    ch[nv] = 1;
                    //큐에 넣어주고
                    q.add(nv);

                    //nv(next vertex)의 값은 cv(current vertex)에서 왔으니 +1
                    dis[nv] = dis[cv] + 1;
                    //cv가 1일 때 nv는 3,4
                }
            }
        }
    }


    public static void main(String[] args) {
        //인접리스트로 받기
        GraphShortestDistance t = new GraphShortestDistance();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[n + 1];
        dis = new int[n + 1];

        //초기화
        graph = new ArrayList<ArrayList<Integer>>();
        //인덱스가 n까지의 배열을 만들어야함.
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        //출력
        t.BFS(1);
        for(int i = 2; i<=n; i++){
            System.out.print(i + ": " +dis[i]);
            System.out.println();
        }

    }
}
