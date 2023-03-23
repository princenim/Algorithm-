package Inflearn;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hazel
 */
public class Sorting {

    //6-1 .선택 정렬 (Selection sort)
    //
    public static int[] solution(int n, int[] arr) {


        for (int i = 0; i < n; i++) {
            //최소값을 찾을 idx
            int minIdx = i;
            //최소값 찾기
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    //최소값으로 교체
                    minIdx = j;
                }
            }

            //교체
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;

        }


        return arr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int x :solution(n, arr)){
            System.out.print(x + " ");
        }



    }


}
