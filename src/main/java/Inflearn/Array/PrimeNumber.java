package Inflearn.Array;

import java.util.Scanner;

/**
 * @author hazel
 */
public class PrimeNumber {
    //3-5.소수(에라토스테네스)
    public static int solution(int n) {
        int cnt = 0;
        int[] arr = new int[n + 1];

        for (int i = 2; i < n; i++) {
            if (arr[i] == 0) {
                cnt++;
                for (int j = i; j < n; j = j + i) {
                    arr[j]= 1;
                }
            }
        }
        return cnt;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(solution(num));
    }
}
