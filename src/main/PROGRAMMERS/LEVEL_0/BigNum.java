package main.PROGRAMMERS.LEVEL_0;

import java.util.Arrays;

public class BigNum {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];

        int num = 0;
        int idx = 0;
        for(int i = 0; i < array.length; i++){

            if(num < array[i]){
                num = array[i];
                idx = i;
            }
            answer[0] = num;
            answer[1]= idx;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 8, 3};
        System.out.println(Arrays.toString(solution(arr1)));


    }

}
