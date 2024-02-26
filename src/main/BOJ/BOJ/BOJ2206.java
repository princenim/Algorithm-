package main.BOJ.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 벽 부수고 이동하기
 * 최단거리 이므로 BFS
 * @author hazel
 */
public class BOJ2206 {

    static int N;
    static int M;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};// 좌상우하 시계방향
    static int[][] map;
    static boolean[][][] visited;
    //visited[0][N][M] - 벽을 한번도 부수지 않은 경로의 방문처리할 배열
    //visited[1][N][M] - 벽을 한번 부수고 온 경로의 방문처리할 배열

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        N = Integer.parseInt(nm[0]); //행
        M = Integer.parseInt(nm[1]); //열

        //초기화
        map = new int[N][M];
        visited = new boolean[2][N][M];

        //입력
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0'; //형변환 주의하기

            }
        }
        //System.out.println(Arrays.deepToString(map));
        int answer = bfs(0, 0);
        System.out.println(answer);
    }

    public static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        //시작점을 큐에 넣기
        visited[0][0][0] = true;
        q.offer(new Node(x, y, 1, false));

        while (!q.isEmpty()) {
            Node current = q.poll();
            // 도착하면 지나간 타일 수를 반환 - 가장먼저 도달하면 return
            if (current.x == N - 1 && current.y == M - 1) {
                return current.distance;
            }

            for (int i = 0; i < 4; i++) { //좌상우하
                int nx = dx[i] + current.x;
                int ny = dy[i] + current.y;

                //배열을 벗어난 경우에는 넘어가기
                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }

                //1) 벽을 부순적이 있을경우 - 벽을 더 이상 부술수 없으므로
                if (current.broken) {
                    // 1-1) 벽이 아니고 , 방문한 적이 없을떄 큐에 정보를 넣는다.
                    if (map[nx][ny] == 0 && !visited[1][nx][ny]) {
                        visited[1][nx][ny] = true;
                        q.add(new Node(nx, ny, current.distance + 1, true));
                    }
                } else {
                    // 2) 벽을 부순적이 없을 경우 벽을 부술 수 있다.
                    //  2-1) 벽이라면 벽을 부수고 큐에 값을 넣는다.
                    //  2-2) 벽이 아니고, 방문한 적이 없다면 큐에 값을 넣는다.(벽이 아니까 부술 필요 x)
                    if (map[nx][ny] == 1) {
                        visited[1][nx][ny] = true;
                        q.offer(new Node(nx, ny, current.distance + 1, true));
                    } else if (!visited[0][nx][ny]) { //벽이 아니고 방문한 적이 없을때
                        visited[0][nx][ny] = true;
                        q.offer(new Node(nx, ny, current.distance + 1, false));
                    }
                }
            }
        }
        return -1;
    }

    static class Node {
        int x;
        int y;
        boolean broken; //벽을 부셨는지 안 부셨는지 여부
        int distance; //거리

        public Node(int x, int y, int distance, boolean broken) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.broken = broken;
        }
    }

}



