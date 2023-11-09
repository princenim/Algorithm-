package main.INFLEARN.Array;
import java.util.Scanner;

/**
 * @author hazel
 */
public class Peak2 {
    public static int solution(int n, int[][] arr) {
        //2-10 . 봉우리
        int answer = 0;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag= true;
                for (int k = 0; k < dx.length; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];
                    if (x>=0 && x < n &&y >= 0 && y <n  && arr[i][j] <= arr[x][y]) {
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answer++;
                };
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }
}
