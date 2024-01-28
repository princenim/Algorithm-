package main.BOJ.BOJ;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ2012 {

    /*
        처음에 sum의 자료형을 int로 해서 틀렸다.
        n의 범위가 500000인데 만약에 모든 학생이 예상등수를 1등으로 예상했다면,
        1+ 2+ ......+ 499999 = 12,499,997,500,000로 int의 범위  2,147,483,647를 넘는다.
        따라서 sum의 자료형을 long으로 해야한다.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        long sum = 0; //
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        //System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); //내림차순 정렬

        for (int i = 0; i < n; i++) {
            int num = arr[i] - (i + 1);
            sum += Math.abs(num);
        }
        System.out.println(sum);
    }

}

