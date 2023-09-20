package Inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class Score {
    public static int solution(int n, ArrayList<Integer> arr){
        int answer= 0;
        int cnt = 0;
        for(int i = 0; i< arr.size(); i++){
            if(arr.get(i) == 1 ){
                cnt ++;
            }else {
                //0일 때
                cnt = 0;
            }
            answer +=cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0; i <n ; i ++){
            arr.add(sc.nextInt());
        }
        System.out.println(solution(n, arr));
    }
}
