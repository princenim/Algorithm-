package main.BOJ.BOJ;


import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[]{1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int n = scanner.nextInt();
            arr[i] = arr[i] - n;
        }

        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }


    }

}
