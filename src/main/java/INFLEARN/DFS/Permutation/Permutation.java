package INFLEARN.DFS.Permutation;

import java.util.Scanner;

/**
 * @author hazel
 */
public class Permutation {
    //8-5 . 순열 구하기

    static int n ;
    static int m ;
    static int[]  arr;

    static int[] answer;

    //체크 배열
    static int[] ch;



    public static void DFS(int l){
        if(l == m){
            for(int x : answer){
                System.out.print(x + " ");
            }
            System.out.println(" ");

        }else {
            for(int i = 0 ; i< n; i++){
                if(ch[i] == 0){
                    answer[l]= arr[i];
                    //체크배열에 체크
                    ch[i] =1;
                    DFS(l +1);
                    // 백 헸을 때 다시 0으로 풀기
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];

        for(int i =0; i < n; i ++){
            arr[i] = sc.nextInt();
        }

        answer = new int[m];
        ch = new int[n];

        DFS(0);


    }
}
