package main.BOJ.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ2480 {
    public static int n1;
    public static int n2;
    public static int n3;


    /**
     * 풀이1
     */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n1 = sc.nextInt();
//        n2 = sc.nextInt();
//        n3 = sc.nextInt();
//        int res;
//
//        if (n1 == n2) {
//            if (n1 == n3) {
//                //3개다 같음
//                res = 10000 + (n1 * 1000);
//            } else {
//                //2개만 같음
//                res = 1000 + (n1 * 100);
//            }
//        } else if (n2 == n3) {
//            if (n2 == n1) {
//                //다 같음
//                res = 10000 + (n2 * 1000);
//            } else {//2개만 같음
//                res = 1000 + (n2 * 100);
//            }
//
//        } else if (n3 == n1) {
//            if (n3 == n2) {
//                //다 같음
//                res = 10000 + (n3 * 1000);
//            } else {//2개만 같음
//                res = 1000 + (n3 * 100);
//            }
//        } else {
//            //다 다를때
//            int maxNum = getMaxNum();
//            res = maxNum * 100;
//        }
//
//        System.out.println(res);
//
//    }
//
//    public static int getMaxNum() {
//        int[] arr = new int[3];
//        arr[0] = n1;
//        arr[1] = n2;
//        arr[2] = n3;
//
//        int maxNum = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            maxNum = Math.max(maxNum, arr[i]);
//
//        }
//        return maxNum;
//    }

    /**
     * 풀이2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int res;

        if (n1 == n2 && n2 == n3) { // 3개다 똑같을때
            res = 10000 + (n1 * 1000);
        } else if ((n1 == n2 && n1 != n3) || (n1 == n3 && n1 != n2)) { //2개만 같은 경우 n1을 기준으로
            res = 1000 + (n1 * 100);
        } else if (n2 == n3 && n2 != n1) { //2개만 같은 경우 n2을 기준으로
            res = 1000 + (n2 * 100);
        } else {
            //다 다를 때 - 풀이 1처럼 굳이 배열에 넣고 max로 값을 찾을 필요 없음 단순비교가능
            int max = n1;
            if (max < n2) {
                max = n2;
            }
            if (max < n3) {
                max = n3;
            }
            res = max * 100;
        }
        System.out.println(res);

    }

}
