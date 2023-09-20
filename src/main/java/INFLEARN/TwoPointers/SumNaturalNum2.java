package INFLEARN.TwoPointers;

import java.util.Scanner;

/**
 * @author hazel
 */
public class SumNaturalNum2 {
    //3-5 . 연속된 자연수의 합
    public static int solution(int n){
        int answer = 0;
        int cnt = 1;
        n --;
        while(n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        System.out.println(solution(input1));
    }


}
