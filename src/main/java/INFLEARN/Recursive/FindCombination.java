package INFLEARN.Recursive;

import java.util.Scanner;

/**
 * @author hazel
 */
public class FindCombination {
    //8-9. 조합 구하기


    static int n, m;
    static int[] arr;

    public static void DFS(int l, int s) {
        if (l == m) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            //s즉 1부터 시작해서 하나씩 늘려가서 중복 값을 출력하지 않도록
            //만약 i가 1이라면 1,1 같이 중복해서 출력된
            for (int i = s; i <= n; i++) {
                arr[l] = i;
            DFS(l +1, i  +1);
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];

        DFS(0, 1);


    }
}
