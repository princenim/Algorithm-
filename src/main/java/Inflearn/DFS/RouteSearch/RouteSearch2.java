package Inflearn.DFS.RouteSearch;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class RouteSearch2 {
    //7-13. 경로탐색(인접리스트, ArrayList)
    //방향 그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하시오.

    //선언만 하고 생성된 상태 X
    static int n, m, answer = 0;

    //선언 및 초기화
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] ch;

    public int DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            //1번 arrayList부터 시작
            for (int nextV : graph.get(v)) {
                if (ch[nextV] == 0) {
                    ch[nextV] = 1;
                    DFS(nextV);
                    ch[nextV] = 0;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        RouteSearch2 T = new RouteSearch2();
        Scanner in = new Scanner(System.in);

        // 정점의 갯수
        n=in.nextInt();
        // 간선의 갯수
        m=in.nextInt();
        // 인접리스트 초기화 - 값을 최초로 할당
        //graph = new ArrayList<ArrayList<Integer>>();


        //n개의 arrayList 객체를 생성해서 graph에 넣어주기
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        //체크 배열
        ch = new int[n+1];

        // 값 넣기
        for(int i=0; i<m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
            //a번 ArrayList에 접근해서 B 값 넣기
            //만약 (1,3) 이라면 1번 arrayList에 3번 원소를 저장.
        }

        //처음에 항상 체크해주기!
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
