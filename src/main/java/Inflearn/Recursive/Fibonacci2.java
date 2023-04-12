package Inflearn.Recursive;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hazel
 */
public class Fibonacci2 {
    //7-4.피보나치 수열 : 앞의 2개의 수를 합해 다음 숫자가 되는 숫자
    //방법 2 & 3(메모이제시연)

    //답을 넣을 배열
    static int[] fibo;

    private static int DFS(int n) {

        //이미 구한 값이라면 즉, fibo에 있는 값이라면 구하지않고 바로 리턴
        if(fibo[n]> 0){
            return fibo[n];
        }

        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            //배열에 기록하고 리턴하는 형태
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //예를 들어 num이 10일때 10번 인덱스가 나와야 하므로 num +1
        fibo = new int[num + 1];
        //한번만 호출하기
        DFS(num);

        //배열을 하나씩 출력하기 (1부터 출력함 )
        for (int i = 1; i <= num; i++) {
            System.out.print(DFS(i) + " ");
        }

    }


}
