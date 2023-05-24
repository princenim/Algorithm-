package Inflearn.DFS.Island;

import java.util.Scanner;

/**
 * @author hazel
 */
public class Island {
    //8-13.섬나라 아일랜드
    static int[][] arr;
    static int answer = 0;
    static int n;

    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void DFS(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 1) {

                //호출하기전에 0으로 바꾸기
                arr[nx][ny] = 0;
                DFS(nx, ny);
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        //2중 for문을 돌면서 DFS 호출
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    answer++;
                    //처음시작을 0으로 바꿔주기
                    arr[i][j] = 0;
                    DFS(i, j);
                }


            }

        }


        System.out.println(answer);
    }
}
