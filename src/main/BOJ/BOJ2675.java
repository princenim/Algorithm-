package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String str = scanner.next();

            String result = "";
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < n; k++) {
                    result += str.charAt(j);
                }
            }

            System.out.println(result);

        }


    }

}
