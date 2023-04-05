package Inflearn.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hazel
 */
public class Mischief {
    //6-6 . 장난꾸러기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = sc.nextInt();
        }

        for (int x : solution(n, ints)) {
            System.out.print(x + " ");
        }


    }

    private static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        //깊은복사
        int[] originalArr = arr.clone();
        //오름차순 정렬
        Arrays.sort(arr);


        for (int i = 0; i < n; i++) {
            if (arr[i] != originalArr[i]) {
                answer.add(i + 1);
            }
        }

        return answer;


    }
}
