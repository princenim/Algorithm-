package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ9086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();

        for(int i = 0; i <n; i++){
            String str = scanner.next();
            System.out.print(str.charAt(0));
            System.out.print(str.charAt(str.length()-1));
            System.out.println( );
        }

    }
}
