package main.BOJ.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ2444 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) { //0

            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); //뒤에 공백은 신경쓰지 않아도됨
        }

        for (int i = n - 1; i >= 0; i--) { // 4~ 0

            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

