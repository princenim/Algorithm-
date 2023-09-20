package INFLEARN.Sorting;

import java.util.Scanner;

/**
 * @author hazel
 */
public class SelectSort {

    //6-1 .선택 정렬 (Selection sort)
    //첫번쨰 자료를 두번째 자료부터 마지막 자료까지 차례대로 비교해 가장 작은 값을 찾아 첫번째와 교체
    //첫번째 자료를 제외하고, 두번째 자료부터 마지막 자료까지 차레대로 비교해 가장 작은 값을 찾아 두번째와 교체
    public static int[] solution(int n, int[] arr) {


        for (int i = 0; i < n; i++) {
            //최소값을 찾을 idx
            int minIdx = i;
            //최소값 찾기
            for (int j = i + 1; j < n; j++) {
                //minIdx를 교체하려면 j 의 값이 더 작아야함.
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
