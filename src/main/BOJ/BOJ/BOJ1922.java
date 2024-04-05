package main.BOJ.BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 네트워크 연결 ,https://www.acmicpc.net/problem/1922, 최소 신장트리
 *
 * @author hazel
 */
public class BOJ1922 {

    static int[] parent;
    //간선을 담을 리스트
    static ArrayList<Edge> edges = new ArrayList<>();
    static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //컴퓨터의 개수
        int m = sc.nextInt(); //간선의 개수

        parent = new int[n + 1];// 1부터 추가
        //초기화~~
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            Edge edge = new Edge(a, b, c);
            edges.add(edge);
        }

        //cost 오름차순으로 정렬
        Collections.sort(edges);

        for (int i = 0; i < edges.size(); i++) {
            int from = edges.get(i).from;
            int to = edges.get(i).to;
            int cost = edges.get(i).cost;

            //사이클이 발생하지 않을때 두 노드를 결합 즉 부모 노드가 달라야함!
            if (find(from) != find(to)) {
                union(from, to); // 두 노드 연결
                result += cost;
            }
        }

        //System.out.println(Arrays.toString(parent));
        System.out.println(result);
    }


    //두 노드를 연결
    public static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (y > x) {
            parent[y] = x;
        } else {
            parent[x] = y;
        }
    }

    //부모 노드를 찾음
    public static int find(int x) {
        if (x == parent[x]) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }


    static class Edge implements Comparable<Edge> {

        int from;
        int to;
        int cost;

        Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        //오름차순 정렬로 만들어야함
        @Override
        public int compareTo(Edge o) {
            if (this.cost > o.cost) {
                return 1;
            } else if (this.cost == o.cost) {
                return 0;
            } else {
                return -1;
            }
        }
    }

}
