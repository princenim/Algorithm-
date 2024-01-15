package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxNum = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            if (maxNum < arr[i]) {
                index = i + 1;
                maxNum = arr[i];
            }
        }

        System.out.println(maxNum);
        System.out.println(index);
    }
}
