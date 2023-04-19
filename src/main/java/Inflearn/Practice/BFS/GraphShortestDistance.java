package Inflearn.Practice.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author hazel
 */
public class GraphShortestDistance{
    static int n , m, answer = 0;
    static int[] ch;

    static int[][] graph;

    public void BFS(int v){
        int level =0;
        Queue<Integer> q = new LinkedList<>();
        q.add(v);

        while (!q.isEmpty()){
            int len = q.size();
            for(int i =1; i <= n; i ++){
                for(int j =1; j  <= n; j ++){
                    if(graph[v][i] ==1){
                        q.add(i);
                    }
                }
            }
        }

    }


    public static void main(String[] args) {
        //입력 받기
        GraphShortestDistance t = new GraphShortestDistance();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        graph =new int[n+1][n+1];
        ch = new int[n+1];

        for(int i =0; i < m; i ++){
            int a =  sc.nextInt();
            int b =  sc.nextInt();
            graph[a][b] = 1;
        }

        t.BFS(1);

    }
}
