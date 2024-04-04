package main.BOJ.BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 최소 스패닝 트리 (= 최소 신장 트리 ),https://www.acmicpc.net/problem/1197, 크루스칼 알고리즘
 *
 * @author hazel
 */
public class BOJ1197 {

    /*
    최소 신장 트리란? 하나의 그래프가 있을떄 모든 노드를 포함하면서 사이클이 존재하지 않는 부분 그래프

    1. 간선 정보에 대하여 오름차순 정렬
    2. 간선을 하나씩 확인해 사이클이 발생하는지 확인
        2.1 사이클이 발생하지 않는 경우 최소 신장 트리에 포함
        2.2 사이클이 발생하는 경우 최소 신장 트리에 포함시키지 않음.
    3. 반복
     */

    static int[] parent;
    static ArrayList<Edge> edges = new ArrayList<>(); //간선을 담을 리스트
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken()); //정점의 개수
        int e = Integer.parseInt(st.nextToken()); //간선의 개수

        parent = new int[v + 1]; //부모 테이블
        for (int i = 1; i <= v; i++) {
            parent[i] = i;
        }
        //간선에 대한 정보 받기
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken()); //가중치

            Edge edge = new Edge(from, to, cost);
            edges.add(edge);
        }

        //1, 간선을 비용순으로 정렬 -> 객체를 비교하기 위해 comparable 인터페이스를 구현해야함
        Collections.sort(edges);

        for (int i = 0; i < edges.size(); i++) {
            int from = edges.get(i).from;
            int to = edges.get(i).to;
            int cost = edges.get(i).cost;

            //사이클이 발생하지 않을 경우 -> 즉 find로 찾는 부모 노드가 같지 않을때만 두 노드를 결합
            if (find(to) != find(from)) {
                union(from, to); //두 노드 연결
                result += cost; //가중치 추가
            }
        }
        System.out.println(result);
    }


    //두 노드를 연결
    public static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x < y) {
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

    static class Edge implements Comparable<Edge> { //무방향 가중치 그래프

        int from;
        int to;
        int cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        //거리(가중치)가 짧은게 우선순위를 가지도록 해야함. 즉 오름차순. 내림차순은 반대로 하기
        //객체를 비교할 기준을 정의하기
        @Override
        public int compareTo(Edge o) {

            if (this.cost > o.cost) { //현재 객체가 들어오는 객체보다 크다. 즉 현재 객체가 뒤에 위치하게됨
                return 1;
            } else if (this.cost == o.cost) {
                return 0;
            } else { //this.cost < o.cost
                return -1;
            }
        }
    }
}

