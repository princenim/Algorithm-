package INFLEARN.Recursive;

/**
 * @author hazel
 */
public class Factorial {
    //7-3 . 팩토리얼
    //재귀를 이용해 구하기

    public static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            //누적
            return n * DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(DFS(5));

    }
}