package main.BOJ.BOJ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * RGB 거리
 * @author hazel
 */
public class BOJ1149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] dp = new int[n][3]; //4 3

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = scanner.nextInt();
            }
        }

//        for( int[] tmp : dp){
//            System.out.println(Arrays.toString(tmp));
//        }

        //bottom-up
        for (int i = 1; i < n; i++) { //1부터 시작
            dp[i][0] = dp[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = dp[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = dp[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }


//        for( int[] tmp : dp){
//            System.out.println(Arrays.toString(tmp));
//        }

        //바틈 업 풀이
        int answer = Math.min(Math.min(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]);
        System.out.println(answer);


    }
}
