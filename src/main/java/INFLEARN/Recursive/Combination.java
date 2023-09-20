package INFLEARN.Recursive;

import java.util.Scanner;

/**
 * @author hazel
 */
public class Combination {
    // 8 - 7. 조합 수 (메모이제이션 사용)

    //메모이제이션 사용 - 시간을 줄이기 위해
    static int[][] dy = new int[35][35];
    public static int DFS(int n, int r){

        //이미 구한 값이면 바로 해당 값 리턴
        if(dy[n][r] > 0){
            return dy[n][r];
        }

        //값이 1이면 return
        if(n ==r ||r == 0){
            return 1;
        }else {
              return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(DFS(n, r));
    }


}
