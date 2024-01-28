package main.BOJ.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ2525 {
    /**
     * 풀이1
     */
//        public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//
//        int C = sc.nextInt();
//
//        int res = B + C;
//        if (res > 60) {
//            //60분 넘으면
//            A = A + res / 60; // 몫만큼 시간에 더하기
//            if (A >= 24) { //24가 더하면 나머지로
//                A = A %24;
//            }
//            System.out.println(A + " " + (res % 60));
//        } else if(res <60){
//            //60보다 작을 떄
//            System.out.println(A + " " + (B + C));
//        }else {
//            //60일때
//            if(A == 23){
//              A =-1;
//            }
//            System.out.println((A+1) + " " + 0);
//        }
//    }

    /**
     * 풀이2
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        int min = 60 * A + B; //현재시간을 분으로
        min += C; // 현재시간 + 요리하는데 필요한 시간

        int hour = (min / 60) % 24; //25시일떄 1시로 포현해야하기 떄문에 %24
        int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}

