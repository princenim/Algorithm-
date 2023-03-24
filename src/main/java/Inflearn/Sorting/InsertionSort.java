package Inflearn.Sorting;

import java.util.Scanner;

/**
 * @author hazel
 */
public class InsertionSort {
    //6-3 .삽입정렬
    //처음 key는 두번째부터 시작
    //key를 기준으로 앞을 확인하는 정렬

    public static int[] solution(int n, int[] arr) {
        //무조건 2번째 부터 시작

        for (int i = 1; i < n; i++) {
            int tmp = arr[i];
            int j;
            //j는 0까지
            for (j = i - 1; j >= 0; j--) {
                //처음 j는 0
                if (arr[j] > tmp) {
                    //뒤쪽으로 밀기!!!!!!!
                    arr[j + 1] = arr[j];
                } else {
                    //크지 않으면 (정상적인 오름차순이면 )
                    //이미 앞에서 정렬이 되었기 때문에 j문을 빠져나와도 상관 X
                    break;
                }

            }
            //j문을 다 돌았을 때 tmp넣기
            //처음 턴에서 j가 0으로 시작할때, j--로 j가 -1되므로 arr[0]임
            arr[j + 1] = tmp;

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
