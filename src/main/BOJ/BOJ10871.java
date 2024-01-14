package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < x) {
                System.out.print(arr[i]);
                System.out.print(" ");
            }
        }


    }
}
