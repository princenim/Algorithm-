package main.INFLEARN.Sorting;

import java.util.Scanner;

/**
 * The type Bubble sort.
 *
 * @author hazel
 */
public class BubbleSort {

    //6-2 . 버블정렬
    //이웃한 두 수를 비교하는 것
    //오름차순이라면 한번의 턴에서 가장 큰 수가 맨 뒤로감
    public static int[] solution(int n, int[] arr) {

        // i와 j는 항상 0이어야함. 오름차순 기준으로 한턴이 돌때마다 끝이 고정되는것이므로
        //n이 4라는 건 n번 돈다는 것

        //n이 아닌 n-1을 하는건 마지막 턴은 다 오름차순으로 정렬되어서 굳이 돌 필요없어서
        //n-1 이 아닌 n-1-i를 하는건 턴을 돌때마다 가장 큰수가 끝으로 정렬이 이미 되어서 굳이 확인할 필요가 없어서
        for (int i = 0; i < n -1 ; i++) {
            for (int j = 0; j < n-1 -i; j++) {
                //내림차순
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
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

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
