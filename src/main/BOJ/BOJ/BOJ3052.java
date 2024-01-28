package main.BOJ.BOJ;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ3052 {

    /**
     * 풀이 1
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int[] arr = new int[10]; //입력배열
//        int[] checkArr = new int[42]; //체크 배열 - 0으로 초기화
//
//        for (int i = 0; i < 10; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            int num = arr[i] % 42;
//            checkArr[num]++;
//        }
//
//        int cnt = 0;
//        for (int tmp : checkArr) {
//            if (tmp != 0) {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//
//    }

    /**
     * 풀이 2 : HashSet을 이용 - 중복을 허용하지 않기 때문에.,..
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            h.add(num % 42);
        }

        System.out.println(h.size());

    }
}
