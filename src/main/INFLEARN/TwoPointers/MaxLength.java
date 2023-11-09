package main.INFLEARN.TwoPointers;

import java.util.Scanner;

/**
 * @author hazel
 */
public class MaxLength {
    //3-6.  최대 길이 연속부분수열
    public static int solution(int n1, int n2, int[] arr){
        //최대 수열 길이
        int answer = 1;
        //변경 횟수 체크
        int cnt = 0;
        int lt = 0;

        for(int rt = 0; rt < n1 ; rt ++){
            if(arr[rt] ==0 ){
                cnt ++;
                while(cnt > n2){
                    if(arr[lt] == 0){
                        cnt --;
                    }
                    lt ++;
                }
            }
            answer = Math.max(answer, rt- lt +1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr = new int[n1];
        for(int i =0; i< n1; i ++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n1,n2,arr));

    }

}
