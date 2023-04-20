package Inflearn.Practice.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author hazel
 */
public class GraphShortestDistance {
    //7-14 . 그래프 최단거리 (BFS - 레벨로 푼 버전)
    static int n, m = 0;

    static int[] ch;

    //출력할 배열
    static int[] pr;


    //인접 리스트 배열
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();


    public void BFS(int v) {
        int level = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(v);

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int num = q.poll();
                pr[num] = level;
                for (int x : graph.get(num)) {
                    if (ch[x] == 0) {
                        ch[x] = 1;
                        q.add(x);
                    }
                }
            }
            level++;
        }


    }

    public static void main(String[] args) {
        GraphShortestDistance t = new GraphShortestDistance();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        ch = new int[n + 1];
        pr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        //System.out.println(graph);

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }


        ch[1] = 1;
        t.BFS(1);


        //2부터 출력
        for (int i = 2; i <=n; i++) {
            System.out.print(pr[i]);
        }

    }
}
