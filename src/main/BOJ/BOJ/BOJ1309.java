package main.BOJ.BOJ;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 동물원
 * DP
 * @author hazel
 */
public class BOJ1309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] dp = new int[n + 1][3]; //동물원이라고 생각하면 안되고 동물을 놓을 수 있는 경우의 수를 넣는 배열
        System.out.println(Arrays.deepToString(dp));

        //1로 기저 - 아무것도 놓지않을떄, 왼쪽에 놓을때 , 오른쪽에 놓을 때 모두 경우의 수가 1개이다.
        dp[1][0] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;

        //dp[i][j] =n 즉 i번째 줄에서 j번째 칸에 동물을 놓을 수 있는 경우는
        //j가 0은 아무것도 안 놓을때
        //j가 1은 왼쪽에 있을때 즉, 무리에 사자가 두번째행의 왼쪽에 있다면 전 행에서는 없거나, 오른쪽에 있어야한다.
        //j가 2는 오른쪽에 있을때 즉 , 무리에 사자가 두번째 행의 오른쪽에 있다면 전 행에서는 없거나 왼쪽에 있어야한다.
        for (int i = 2; i <= n; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % 9901;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % 9901;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % 9901;
        }

        System.out.println((dp[n][0] + dp[n][1] + dp[n][2]) % 9901);
    }
}

