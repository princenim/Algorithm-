package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ2908 {

//    /**
//     * 풀이 1
//     */
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int ra = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
//        int rb = Integer.parseInt(new StringBuilder().append(b).reverse().toString());
//        System.out.println(Math.max(ra, rb));
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int answer = Math.max(flip(a), flip(b));
        System.out.println(answer);
    }


    /**
     * 풀이2
     */
    public static int flip(int n) {
        int answer = 0;


        while (n != 0) {
            answer = answer * 10 + n % 10; // 4-> 40 + 3 -> 430 + 7
            n = n / 10; //10단위로 자르기

        }
        return answer;
    }
}



