package main.BOJ.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ5597 {
    public static void main(String[] args) {
        int[] arr = new int[30];

        //초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 28; i++) {
            int n = scanner.nextInt();
            arr[n - 1] = 0;

        }


        for (int tmp : arr) {
            if (tmp != 0) {
                System.out.println(tmp);
            }
        }


    }
}
