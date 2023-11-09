package main.INFLEARN.TwoPointers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class TwoArrays {
    //3-1 두 배열 합치기 (투포인터 방법으로)
    public static ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        //배열 하나라도 끝나면 멈추기
        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) {
                arr.add(arr1[p1]);
                p1++;
            } else {
                arr.add(arr2[p2]);
                p2++;
            }
        }

        //남아있는 애들 넣어주기
        while (p1 < n) {
            arr.add(arr1[p1]);
            p1++;
        }

        while ((p2 < m)) {
            arr.add(arr2[p2]);
            p2++;

        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int x : solution(n1, arr1, n2, arr2)) {
            System.out.print(x + " ");
        }
    }
}
