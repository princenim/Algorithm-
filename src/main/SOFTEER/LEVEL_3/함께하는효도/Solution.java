package main.SOFTEER.LEVEL_3.함께하는효도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 함께하는 효도, https://softeer.ai/practice/7727, 백트래킹 or dfs (모든 경우의 수를 다 확인)
 *
 * @author hazel
 */
public class Solution {
    //todo 다시 풀기

    static int[][] arr; //배열
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, m;
    static List<Node> nodes; //노드 시작 주소를 담을 배열
    static int res = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine()
                        .split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        //초기화
        arr = new int[n][n];
        nodes = new ArrayList<>();

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //2명의 시작 주소
        for (int i = 0; i < m; i++) {
            String[] user = br.readLine()
                              .split(" ");
            int from = Integer.parseInt(user[0]);
            int to = Integer.parseInt(user[1]);
            Node start = new Node(from - 1, to - 1, arr[from - 1][to - 1]);//좌표주소와 값
            nodes.add(start);
            arr[from - 1][to - 1] = 0;
        }

        dfs(nodes.get(0), 1, 0, 0); //첫번째 부터 시작
        System.out.println(res);


    }

    public static void dfs(Node current, int pp, int cnt, int max) {
        if (cnt == 3) {
            if (pp < m) {
                dfs(nodes.get(pp), pp + 1, 0, current.fruit + max);
                return;
            }
            res = Math.max(res, max + current.fruit);
            return;

        }

        for (int i = 0; i < 4; i++) {
            int nx = current.x + dx[i];
            int ny = current.y + dy[i];
            if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                continue;
            }
            Node next = new Node(nx, ny, current.fruit + arr[nx][ny]); //마지막 변수에는 지나온 경로의 최대값을 기록함
            int tmp = arr[nx][ny]; //값을 담아놓고
            arr[nx][ny] = 0;
            dfs(next, pp, cnt + 1, max);
            arr[nx][ny] = tmp;
        }
    }

    static class Node {

        int x;
        int y;
        int fruit;

        Node(int x, int y, int fruit) {
            this.x = x; //좌표
            this.y = y;
            this.fruit = fruit; //열매
        }
    }
}
