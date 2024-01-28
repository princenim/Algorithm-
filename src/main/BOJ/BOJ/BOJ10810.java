package main.BOJ.BOJ;


import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ10810 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] arr = new int[m];
        for (int i = 1; i <= n; i++) {

            int valI = scanner.nextInt();
            int valJ = scanner.nextInt();
            int valK = scanner.nextInt();

            for (int j = valI; j <= valJ; j++) {
                arr[j - 1] = valK;
            }

        }

        for (int tmp : arr) {
            System.out.print(tmp);
            System.out.print(" ");
        }
    }
}
