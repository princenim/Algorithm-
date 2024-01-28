package main.BOJ.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for(int i =1; i<=n; i ++){
            sum += i;
        }

        System.out.println(sum);

    }
}
