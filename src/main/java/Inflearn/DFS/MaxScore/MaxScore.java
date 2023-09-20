package Inflearn.DFS.MaxScore;

import java.util.Scanner;

/**
 * @author hazel
 */
public class MaxScore {
    //8-3.최대 점수하기 (DFS)

    static int n;
    static int m;

    static int[] timeArr;
    static int[] scoreArr;
    static int answer =0;

    public static void DFS(int l , int timeSum , int scoreSum){
        //시간 초과하면 리턴
        if(timeSum > m){
            return;
        }

        if(l == n){
            //최대 점수 구하기
            answer = Math.max(answer, scoreSum);

        }else {
            DFS(l +1,timeSum + timeArr[l], scoreSum + scoreArr[l]);
            DFS(l+1, timeSum,scoreSum);

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        timeArr= new int[n];
        scoreArr= new int[n];


        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            scoreArr[i] = score;
            int time = sc.nextInt();
            timeArr[i] = time;
        }

        DFS(0,0,0);
        System.out.println(answer);

    }
}
