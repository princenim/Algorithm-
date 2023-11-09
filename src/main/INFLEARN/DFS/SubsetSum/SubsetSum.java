package main.INFLEARN.DFS.SubsetSum;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author hazel
 */
public class SubsetSum {
    // 8-1. 합이 같은 부분 집합 (DFS)

    static int[] arr;
    static int n;

    static boolean flag = false;
    static  String answer = "NO";


    private static void  DFS(int l, int sum, int sumArr) {
        if(flag){
            return ;
        }

        if(l == n){
            if((sumArr -sum) == sum){
                answer = "YES";
                //해당 재귀가 더 돌 필요가 없어서
                flag = true;
            }
        } else {
            DFS(l +1, sum + arr[l], sumArr);
            DFS(l +1, sum, sumArr);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sumArr = Arrays.stream(arr).sum();


        DFS(0, 0, sumArr);
        System.out.println(answer);

    }
}
