package main.BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr.add(num);
        }


        Collections.sort(arr); //오름차순
        System.out.print(arr.get(0) + " " + arr.get(n - 1));
    }


}
