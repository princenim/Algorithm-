package main.BOJ.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ2884 {

    /**
     * 풀이1
     */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int H = sc.nextInt();
//        int M = sc.nextInt();
//
//        if (M >= 45) {
//            System.out.println(H + " " + (M - 45));
//        } else {
//            if (H == 0) {
//                System.out.println(23 + " " + (M + 15));
//            } else {
//                System.out.println((H - 1) + " " + (M + 15));
//            }
//        }
//    }

    /**
     * 풀이2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if (M < 45) {
            H--;
            M = 60 - (45 - M);
            if (H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " +(M -45));
        }

    }
}
