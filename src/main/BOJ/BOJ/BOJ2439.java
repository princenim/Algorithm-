package main.BOJ.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            //공백 출력
            for (int j = 0; j < n - i-1 ; j++) { //0부터 시작하니까 -1
                System.out.print(" ");
            }

            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
