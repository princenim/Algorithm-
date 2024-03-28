package main.BOJ.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 최단경로, https://www.acmicpc.net/problem/1753
 *
 * @author hazel
 */
public class BOJ1753 {

    static class Node {

        int to;
        int weight;

        public Node(int to, int weight) {
            this.to = to; //도착 정점 번호
            this.weight = weight; //가중치
        }
    }


    //각 노드에 연결되어있는 노드에 대한 정보를 담는 리스트
    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();


    //방문한 적이 있는지 체크하는 목적의 리스
    static boolean[] visited;
    //최단거리 테이블
    static int[] distance;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken()); //정점의 개수
        int e = Integer.parseInt(st.nextToken()); //간선의 개수
        int k = Integer.parseInt(br.readLine()); //시작 번호

        //초기화
        visited = new boolean[v + 1];
        distance = new int[v + 1];

        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<>());
            distance[i] = Integer.MAX_VALUE; //최대값으로 초기화
        }

        //u에서 v로 가는 가중치 w. 즉 from 에서 to로 가는 가중치 weight
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            graph.get(from)
                 .add(new Node(to, weight));
        }

        //여기까지 입력 (가중치 있는 방향 그래프)
        dijkstra(k);
        //출력
        for (int i = 1; i < distance.length; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(distance[i]);
            }
        }
    }

    //다익스트라 구현
    static void dijkstra(int start) {
        //우선 순위 큐 사용, 가중치를 기준으로 오름차순.
        PriorityQueue<Node> q = new PriorityQueue<>((o1, o2) -> o1.weight - o2.weight);
        //출발지점의 노드를 큐에 넣음
        q.add(new Node(start, 0));
        distance[start] = 0;

        while (!q.isEmpty()) {
            Node now = q.poll(); //큐에서 꺼낸 노드(to, weight)

            //만약에 방문하지 않았다면 방문처리
            if (!visited[now.to]) {
                visited[now.to] = true;
            }

            ArrayList<Node> nodes = graph.get(now.to); //현재 노드에 연결된 노드 리스트
            //예를 들어 1이라면 [(2,2),(3,3)]

            for (Node next : nodes) {
                int newDistance = distance[now.to] + next.weight; //현재까지의 최단거리 + 가중치

                //방문하지 않았고 , 현재까지의 최단거리와 새로운 거리 비교
                if (!visited[next.to] && distance[next.to] > newDistance) { //기존값이 더 클때
                    distance[next.to] = newDistance; //새로운 최단거리로 갱신
                    q.add(new Node(next.to, newDistance));  //갱신됐을때만 우선순위 큐에 넣음으로써 불필요한 연산을 줄여줌
                }
            }
        }
    }
}
