package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }

        int v = scanner.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == v) {
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}
