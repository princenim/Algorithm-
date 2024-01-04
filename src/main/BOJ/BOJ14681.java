package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0) {
            if (y > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else {
            //음수일떄
            if (y > 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }

    }

}

