package main.BOJ.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = n / 4;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            answer.append("long" + " ");
        }

        System.out.println(answer + "int");


    }
}
