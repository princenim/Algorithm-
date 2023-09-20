package Inflearn.Array;

import java.util.Scanner;

/**
 * @author hazel
 */
public class SumMax {
    //2-9 . 격자판 최대합

    public static int solution(int n, int[][] arr) {
        int answer = 0;

        int sum1 = 0;
        int sum2 = 0;
        //각 행의 합
        for (int i = 0; i < n; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        //여기까지 행과 열의 합 중에서 가장 큰 값이 anwwer에 들어감
        sum1 =0;
        sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

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
