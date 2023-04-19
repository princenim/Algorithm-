package Inflearn.Practice.DFS;

import java.util.Scanner;

/**
 * @author hazel
 */
public class RouteSearch1 {
    //경로 탐색 (인접행렬 = 행렬로 받기, DFS)

    // 체크 배열
    static int[] ch;

    static int n, m, answer = 0;

    //인접 행렬
    static int[][] graph;
    public void DFS(int v){

        if(v == n){
            answer ++;
        }else {
            for(int i = 1; i <=n; i++){
                if(graph[v][i] ==1 && ch[i] == 0 ){
                    ch[i] = 1;
                    DFS(i);
                    //백 했을때
                    ch[i] =0;
                }
            }
        }
    }

    public static void main(String[] args) {
        //입력 만들기
        RouteSearch1 t = new RouteSearch1();
        Scanner sc = new Scanner(System.in);
        //만들때 변수 주의하기, 미리 만들어 둔 클래스 변수에 값을 넣어야함. !!
        n =  sc.nextInt();
        m =  sc.nextInt();

        graph = new int[n + 1][n + 1];
        //체크배열
        ch = new int[n + 1]; // 이미 온 경로인지 체크

        for(int i =0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }

        ch[1] = 1;
        t.DFS(1);
        System.out.println(answer);

    }
}
