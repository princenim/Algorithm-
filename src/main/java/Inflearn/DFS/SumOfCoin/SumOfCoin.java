package Inflearn.DFS.SumOfCoin;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author hazel
 */
public class SumOfCoin {
    //8-5.  동전교환
    static int n;
    static int total;

    static Integer[] arr;

    //최소값을 구할거니까 정수의 최대값으로 설정해놓기
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int l, Integer sum) {
        if (sum > total) {
            return;
        }

        //만약 5개로 sum을 구했을때, 6개로 sym을 구할필요가 없으니 return
        if (answer <= l) {
            return;
        }
        //값을 넘으면 바로 return
        if (sum == total) {
            answer = Math.min(answer, l);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(l + 1, sum + arr[i]);
            }


        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //배열를 내림차순으로 정렬 - 객체형 int 형이어야함. 기본형 X
        Arrays.sort(arr, Collections.reverseOrder());
        total = sc.nextInt();

        DFS(0, 0);
        System.out.println(answer);
    }

}
