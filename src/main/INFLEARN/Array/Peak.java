package main.INFLEARN.Array;

import java.util.Scanner;

/**
 * @author hazel
 */
public class Peak {
    //2-10 봉우리
    public static int solution(int n , int[][] arr){
        int answer = 0;

        int [][] tmp = new int[n+2][n+2];
        //0으로 둘러쌓인 배열 만들기
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j ++){
                tmp[i+1][j+1] = arr[i][j];
            }
        }


        for(int i = 1; i < tmp.length; i++){
            for(int j = 1; j < tmp.length; j ++){
                if(tmp[i][j] > tmp[i][j-1] && tmp[i][j] > tmp[i-1][j] && tmp[i][j] > tmp[i][j+1] &&tmp[i][j] > tmp[i+1][j]){
                    answer ++;
                }

            }
        }



        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int[][] arr= new int [n][n];
        for(int i = 0; i < n; i ++){
            for(int j =0; j < n; j ++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }
}
