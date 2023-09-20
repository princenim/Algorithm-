package INFLEARN.Practice.DFS;

import java.util.Scanner;

/**
 * @author hazel
 */
public class Subset {
    //모든 경우의 수의 부분집합 구하기

    //값을 출력할 체크 배열
    static int[] ch;

    static int n;

    public void DFS(int l) {
        if (l == n + 1) {
            for (int i = 1; i <= n; i++) {
                //체크된 인덱스만 출력
                if (ch[i] == 1)
                    System.out.print(i + " ");
            }
            System.out.println();


        } else {
            //왼쪽일때는 사용한다
            ch[l] = 1;
            DFS(l + 1);
            //오른쪽일때는 사용하지 않음.
            ch[l] = 0;
            DFS(l + 1);
        }
    }
    public static void main(String[] args) {
        Subset t = new Subset();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        //체크배열 길이
        ch = new int[n + 1];
        t.DFS(1);


    }
}
