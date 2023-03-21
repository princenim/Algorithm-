package Inflearn.Hash;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author hazel
 */
public class BigNum {
    //3-5.k번째 큰수
    public static int solution(int n, int k, int[] arr) {


        int answer = -1;

        //중복값을 허용X, 오른차순으로
        TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());

        //3중 for문 돌면서 값 받기
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int x : tset) {
            cnt++;
            if (cnt == k) {
                return x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }
}
