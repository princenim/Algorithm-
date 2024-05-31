package main.BOJ.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 아기 상어 2, https://www.acmicpc.net/problem/17086, BFS
 *
 * @author hazel
 */
public class BOJ17086 {

    static int row = 0;
    static int column = 0;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, -1, -1, 1, 1, 0, -1, 0};
    static int[] dy = {1, 1, -1, -1, 0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        column = Integer.parseInt(st.nextToken());
        arr = new int[row][column];
        visited = new boolean[row][column];

        Queue<Node> q = new LinkedList<>();

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < column; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    q.add(new Node(i, j, 0)); //1인 원소 큐에 먼저 다 넣기
                    visited[i][j] = true;
                }
            }
        }

        while (!q.isEmpty()) {
            Node current = q.poll();
            bfs(q, current);
            if (q.isEmpty()) {
                System.out.println(current.len);
            }
        }
    }

    public static void bfs(Queue<Node> q, Node current) {
        for (int i = 0; i < 8; i++) {
            int nx = current.x + dx[i];
            int ny = current.y + dy[i];
            if (nx < 0 || ny < 0 || nx >= row || ny >= column) {
                continue;
            }
            if (!visited[nx][ny]) {
                q.offer(new Node(nx, ny, current.len + 1));
                visited[nx][ny] = true;
            }
        }
    }

    static class Node {

        int x;
        int y;
        int len;

        Node(int x, int y, int len) {
            this.x = x;
            this.y = y;
            this.len = len;
        }
    }
}
