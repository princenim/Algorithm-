package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine().trim(); //next로 받으면 공백 기준으로 받아짐, trim은 앞뒤 공백제거

        if (next.equals("")) { //공백의 경우 split을 할 경우 개수가 1이 나옴. 따라서 0으로 처리
            System.out.println(0);
            return;
        }

        String[] arr = next.split(" ");
        System.out.println(arr.length);

    }
}
