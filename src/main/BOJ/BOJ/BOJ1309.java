package main.BOJ.BOJ;


import java.util.Scanner;

/**
 * @author hazel
 * 동물원
 */
public class BOJ1309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] zoo = new int[n + 1][3]; //2차원 배열에서 경우의 수를 기록

        //1로 기저
        zoo[1][0] = 1;
        zoo[1][1] = 1;
        zoo[1][2] = 1;

        for (int i = 2; i <= n; i++) {
            zoo[i][0] = (zoo[i - 1][0] + zoo[i - 1][1] + zoo[i - 1][2]) % 9901;
            zoo[i][1] = (zoo[i - 1][0] + zoo[i - 1][2]) % 9901;
            zoo[i][2] = (zoo[i - 1][0] + zoo[i - 1][1]) % 9901;
        }

        System.out.println((zoo[n][0] + zoo[n][1] + zoo[n][2]) % 9901);
    }
}

