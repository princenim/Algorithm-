package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ11021 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();

            System.out.printf("Case #%d: %d\n", i + 1, n1 + n2);
        }


    }
}