package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String str = scanner.next();

        int sum = 0;
        for(int i =0; i<str.length(); i++){
            int num = str.charAt(i) - 48;
            //System.out.println(num);
            sum += num;
        }
        System.out.println(sum);
    }
}
