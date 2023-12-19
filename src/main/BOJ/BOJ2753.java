package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if((n % 4 == 0) && !(n % 100==0)){ //4의 배수이나 100의 배수가 아니어야함.
            System.out.println(1);
        }else if (n % 400 == 0 ) { //400의 배수일떄
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
