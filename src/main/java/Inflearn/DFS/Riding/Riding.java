package Inflearn.DFS.Riding;


import java.util.Scanner;

/**
 * @author hazel
 */
public class Riding {
    //8-2 . 바득이 승차 (DFS) - 부분집합개념이라고 생각하기

    static int n;
    static int c;
    static int[] arr;
    static int answer = 0;


    public static void DFS(int l, int sum) {
        if (sum > c) {
            return;
        }
        //l은 레벨
        if (l == n) {
            //가장 큰 값으로 계속 갱신
            answer = Math.max(answer, sum);
        } else {
            DFS(l + 1, sum + arr[l]);
            DFS(l + 1, sum);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        DFS(0, 0);
        System.out.println(answer);


    }
}
