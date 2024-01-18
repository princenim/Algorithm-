package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ27866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();

        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i));
            if (i == n - 1) {
                System.out.println(str.charAt(i));
            }
        }


    }
}
