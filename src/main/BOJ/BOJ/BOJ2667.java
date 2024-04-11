package main.BOJ.BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 단지번호붙이기,https://www.acmicpc.net/problem/2667, DFS
 *
 * @author hazel
 */
public class BOJ2667 {
    //1. 인접행렬구현
    //2. DFS

    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};//위부터
    static int[] dy = {0, 1, 0, -1};//위부터
    static ArrayList<Integer> arr = new ArrayList<>();

    static int n;

    static int cnt = 0; //단지수
    static int num = 1; //단지내 집의수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        graph = new int[n][n];
        visited = new boolean[n][n];

        //인접행렬
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < n; j++) {
                int num = str.charAt(j) - '0'; //char to int
                graph[i][j] = num;
            }
        }

        //dfs
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (graph[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    cnt++; //한 단지를 찾을때마다 +1

                    arr.add(num);
                    num = 1; //집의 개수 초기화
                }
            }
        }

        //출력
        System.out.println(cnt); //단지수
        Collections.sort(arr);
        for (int tmp : arr) {
            System.out.println(tmp);
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true; //방문처리

        for (int i = 0; i < 4; i++) { //위부터 총 4번 확인
            int nx = x + dx[i];
            int ny = y + dy[i];

            //배열을 벗어난 경우에는 넘어가기
            if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                continue;
            }

            if (graph[nx][ny] == 1) { //집이고,
                if (!visited[nx][ny]) { //방문하지 않았을때
                    dfs(nx, ny);
                    num++; //단지 내 집의 수
                }
            }
        }
    }
}


