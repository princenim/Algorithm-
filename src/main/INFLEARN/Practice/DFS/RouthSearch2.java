package main.INFLEARN.Practice.DFS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class RouthSearch2 {
    //경로탐색 (인접리스트 = 즉 arrayList로 받기, DFS)

    static  int n , m , answer = 0;
    static int[] ch;

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public void DFS(int v){
        if(v == n){
            for(int i= 1; i <= n; i ++){
                if(ch[i] == 1){
                    System.out.print(i);
                }
            }
            System.out.println();

            //횟수 카운트
            answer++;
        }else {
            for( int x  :graph.get(v)){
                if(ch[x] ==0){
                    ch[x] = 1;
                    DFS(x);
                    ch[x] =0;
                }
            }
        }
    }

    public static void main(String[] args) {
        RouthSearch2 t =new RouthSearch2();
        Scanner sc = new Scanner(System.in);
        n  = sc.nextInt();
        m  = sc.nextInt();
        ch = new int [n +1];

        //System.out.println(graph);
        //graph객체 생성해서 넣기
        for(int i =0; i<=n; i ++){
            graph.add(new ArrayList<>());
        }

        for(int i =0; i < m; i ++){
            int a = sc.nextInt();
            int b  =sc.nextInt();
            graph.get(a).add(b);
        }

        ch[1] = 1;
        t.DFS(1);
        System.out.println(answer);


    }
}
