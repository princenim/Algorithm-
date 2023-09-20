package INFLEARN.Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class Ranking {
    //2-8 . 등수구하기
    public static ArrayList<Integer> solution(int n, ArrayList<Integer> arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr.get(i) < arr.get(j)) {
                    cnt ++;
                }
            }
            answer.add(cnt);
            cnt = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }


        for(int x : solution(n, arr)){
            System.out.print(x + " ");
        }


    }
}
