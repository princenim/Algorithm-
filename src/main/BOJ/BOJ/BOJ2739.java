package main.BOJ.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <=9; i++) {
            System.out.printf("%d * %d = %d", n, i, n*i);
            System.out.println();

        }

    }
}
