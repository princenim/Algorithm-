package main.INFLEARN.Array;

import java.util.Scanner;

/**
 * @author hazel
 */
public class ClassMonitor {
    //2-11.임시반장 정하기
    public static int solution(int n , int[][] arr){
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i ++){
            int cnt = 0;
            for(int j = 1; j <= n; j ++){
                //1학년부터 5학년까지
                for(int k = 1; k <= 5; k ++){
                    //i번 학생의 k학년 과 j번 학생의 k학년을 비교
                    if(arr[i][k] == arr[j][k]){
                        cnt ++;
                        //같은 반 여러 번한 학생은 1번만 카운트해야함.
                        break;
                    }
                }
            }
            //System.out.println(cnt);
            if(cnt > max){
                max = cnt;
                answer= i;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //1부터 시작이라고 가정
        int[][] arr = new int[n+1][6];
        for(int i =1; i <= n; i ++){
            for(int j =1; j<= 5; j ++){
                arr[i][j] =  in.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }
}
