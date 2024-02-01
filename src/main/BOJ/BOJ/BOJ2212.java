package main.BOJ.BOJ;

import java.util.*;

/**
 * 센서
 * @author hazel
 */
public class BOJ2212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //센서의 개수
        int k = sc.nextInt(); //집중국의 개수


        //센서
        int[] arr = new int[n];
        //센서 거리
        int[] distance = new int[n - 1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //오름차순
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        //두 센서 사이의 거리 구하기
        for (int i = 0; i < n - 1; i++) {
            distance[i] = arr[i + 1] - arr[i];
        }

        Arrays.sort(distance);
        //System.out.println(Arrays.toString(distance));

        //k-1개의 사이 빼고 합 구하기
        int sum = 0;
        for (int i = 0; i < n - k; i++) {
            sum += distance[i];
        }

        System.out.println(sum);


    }

}
