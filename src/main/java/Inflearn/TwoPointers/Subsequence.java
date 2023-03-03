package Inflearn.TwoPointers;

import java.util.Scanner;

/**
 * @author hazel
 */
public class Subsequence {
    //3-4 .연속 부분 수열
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < arr.length; rt++) {
            //m보다 클거나 같을 때 까지 계속 더하기
            sum = sum + arr[rt];

            //총합이 클때
            while (sum > m) {
                sum = sum - arr[lt];
                lt++;
            }

            //같으면
            if (sum == m) {
                answer++;
            }
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
