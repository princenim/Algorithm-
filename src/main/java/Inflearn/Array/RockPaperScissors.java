package Inflearn.Array;

import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class RockPaperScissors {
    public static ArrayList<Character> solution(int n, ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Character> answer=  new ArrayList<>();






        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr1.add(in.nextInt());
        }
        for (int i = 0; i < n; i++) {
            arr2.add(in.nextInt());
        }


        System.out.println(solution(n, arr1, arr2));
    }
}
