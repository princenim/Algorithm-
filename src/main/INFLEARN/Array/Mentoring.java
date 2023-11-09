package main.INFLEARN.Array;

import java.util.Scanner;

/**
 * @author hazel
 */
public class Mentoring {
    //2-12.멘토링
    public static int solution(int n, int m, int[][] arr){
        int answer = 0;
        //i 와 j는 모든 경우의 수, n x n , i가 멘토 , j가 멘티
        //k 와 j가 실제 예시 배열
        for(int i =1; i <= n; i++){
            for(int j =1; j <= n; j++){
                //cnt 초기화
                int cnt = 0;
                for(int k = 0; k < m; k ++){
                    int pi = 0;
                    int pj = 0;
                    for(int s = 0; s < n; s ++){
                        if(arr[k][s] == i ){
                            //해당 테스트에서 학생번호를 찾았을 때, s등
                            pi = s;
                        }
                        if(arr[k][s] == j){
                            pj = s;
                        }
                    }
                    if( pi < pj){
                        cnt ++;
                    }
                }
                if(cnt==m){
                    answer ++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[m][n];
        for(int i =0; i < m; i ++){
            for(int j =0; j< n; j ++){
                arr[i][j] =  in.nextInt();
            }
        }

        System.out.println(solution(n, m, arr));
    }

}
