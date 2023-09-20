package INFLEARN.Recursive;

import java.util.Scanner;

/**
 * @author hazel
 */
public class Sequence {
    // 8-8 . 수열 추측하기

    //pArr은 수열을 넣을 배열
    static int[] combArr, pArr, ch;
    static int[][] memo = new int[11][11];
    static int n, f;
    static boolean flag;

    public static int combination(int n, int r) {

        if (memo[n][r] > 0) {
            return memo[n][r];
        }
        //값이 1일때 리턴
        if (r == 0 || n == r) {
            return 1;
        } else {
            return memo[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
        }
    }


    public static void DFS(int l, int sum) {

        if(flag){
            //이미 값을 찾으면 더 이상 확인할 필요없이 리턴
            return;
        }

        //레벨은 끝가지 확인해야함
        if (l == n) {
            if(sum == f){
                for(int x : pArr){
                    System.out.print(x + " ");
                }
                System.out.println( );
                flag = true;
            }

        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    //체크배열 바꾸고
                    ch[i] = 1;
                    //진짜 배열 값 바꾸기
                    pArr[l] = i;
                    DFS(l + 1, sum + combArr[l] * pArr[l]);
                    //체크배열 다시 돌려놓기
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();

        //조합을 저항할 배열
        combArr = new int[n];
        pArr = new int[n];
        //체크배열은 인덱스 값을 사용하므로 1부터 시작
        ch = new int[n +1];

        //조합을 구해 미리 배열에 넣기
        for (int i = 0; i < n; i++) {
            int a = combination(n - 1, i);
            //System.out.println(a);
            combArr[i] = a;
        }

        DFS(0, 0);


    }
}
