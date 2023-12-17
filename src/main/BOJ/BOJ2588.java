package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ2588 {
    public static void solve1(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int total = n1 * n2;

        while (n2 > 0) {
            System.out.println(n1 * (n2 % 10)); // 나머지
            n2 = n2 / 10;
        }
        System.out.println(total);
    }

    public static void solve2(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        String n2 = sc.next();

        System.out.println(n1 * (n2.charAt(2) - '0'));
        System.out.println(n1 * (n2.charAt(1) - '0'));
        System.out.println(n1 * (n2.charAt(0) - '0'));
        System.out.println(n1 * Integer.parseInt(n2));

        /**
         * String n2가 385일떄
         * n2.charAt(2)는 5인데 이때 5는 숫자 5가 아니라 문자 '5'이다.
         * 따라서 -'0' (- 48)을 통해 우리가 보는 10진수 5로바꾼것.
         */
        System.out.println(n2.charAt(2)); //문자 '5'
        System.out.println((int)n2.charAt(2)); //숫자 53
        System.out.println(n2.charAt(2) - 48); //숫자 5
    }
}
