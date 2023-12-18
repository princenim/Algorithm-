package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ11382 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /**
         * int가 아닌 long은 주어진 조건이 10^12이므로 int 범위를 초과해버린다.
         * (int의 범위 : –2,147,483,648 ~ 2,147,483,647)
         */
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        System.out.println(A+B+C);
    }

}
