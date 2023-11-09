package main.INFLEARN.Recursive;

import java.util.Scanner;

/**
 * @author hazel
 */
public class Fibonacci1 {
    //7-4.피보나치 수열 : 앞의 2개의 수를 합해 다음 숫자가 되는 숫자
    //방법1 - 하나씩 계속 돌기때문에 비효율적
    public static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return DFS(n - 2) + DFS(n - 1);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //1부터 시작
        for (int i = 1; i <= num; i++) {
            System.out.println(DFS(i));
        }

    }
}
