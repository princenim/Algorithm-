package main.INFLEARN.TwoPointers;

import java.util.Scanner;

/**
 * @author hazel
 */
public class SlidingWindow {
    //3-3 . 최대매출(sliding window)
    //2중 for문 X
    public static int solution(int n, int m, int[] arr) {
         int answer = 0;
        int tmp = 0;
        //처음 m개의 총 합 먼저 구하기
        for (int i = 0; i < m; i++) {
            tmp = tmp + arr[i];
        }
        //처음 경우의 수도 포함
        answer = tmp;

        for (int j = 0; j < n - m; j++) {
            tmp = tmp - arr[j] + arr[j + m];
            answer = Math.max(tmp, answer);
//            if (tmp > answer) {
//                answer = tmp;
//            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }
}
