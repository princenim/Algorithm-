package INFLEARN.DFS.Permutation;

import java.util.Scanner;

/**
 * @author hazel
 */
public class PermutationWithRepetition {
    //8-4 . 중복 순열 (DFS)

    static int n;
    static int m;
    static int[] arr;

    public static void DFS(int l){
        if(l == m){
            for(int x : arr){
                System.out.print(x + " ");

            }
            System.out.println();
        }else {
            for(int i =1; i <= n; i++){
                arr[l] = i;
                DFS(l+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];

        DFS(0);

    }
}
