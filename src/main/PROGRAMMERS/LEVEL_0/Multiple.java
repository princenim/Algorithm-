package main.PROGRAMMERS.LEVEL_0;

import java.util.ArrayList;

/**
 * @author hazel
 */
public class Multiple {

    public static ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i< numlist.length; i++){
            if(numlist[i] % n  == 0){
                answer.add(numlist[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        System.out.println(solution(3, arr1));
    }
}
