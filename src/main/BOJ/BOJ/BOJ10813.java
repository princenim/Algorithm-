package main.BOJ.BOJ;


import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ10813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }


        for (int i = 0; i < n; i++) {
            int valI = scanner.nextInt();
            int valJ = scanner.nextInt();

            int tmp;
            tmp = arr[valJ - 1];
            arr[valJ - 1] = arr[valI - 1];
            arr[valI - 1] = tmp;
        }

        for (int tmp : arr) {
            System.out.print(tmp);
            System.out.print(" ");
        }

    }
}
