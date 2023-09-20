package Inflearn.Sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hazel
 */
public class Stall {
    //6-10. 마구간 정하기 (결정 알고리즘)
    //결정 알고리즘은 유효한것을 확인하는 과정 제일 마지막에 유효한 답을 답으로 한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, c, arr));


    }

    private static int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        int lt = 1;
        int rt = Arrays.stream(arr).max().getAsInt();

        //두 말의 최대거리를 mid라고 가정
        //내가 가정한 mid값을 줄이거나 늘리면서 유효한 값을 찾는것

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            //유효할때
            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                //유효햐지 않을때
                rt = mid - 1;
            }


        }


        return answer;
    }

    public static int count(int[] arr, int mid) {
        //현재 마굿간에 배치한 말의 개수
        int cnt = 1;
        //말이 할당된 마지막 마굿간
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= mid) {
                //내가 정한 두 말의 최대거리보다 크거나 같을때 = 즉 말을 배치할수있을때
                cnt++;
                ep = arr[i];
            } else {
                //i가 하나 커짐 그냥 지나가기
            }
        }

        return cnt;
    }

}
