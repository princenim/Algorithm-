package main.BOJ.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        String str = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            System.out.print(next.indexOf(ch) + " ");


        }

    }


}
