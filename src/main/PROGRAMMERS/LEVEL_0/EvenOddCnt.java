package main.PROGRAMMERS.LEVEL_0;

import java.util.Arrays;

/**
 * @author hazel
 */
public class EvenOddCnt {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int evenCnt= 0;
        int oddCnt = 0;

        for(int i = 0; i < num_list.length; i ++){
            if(num_list[i] % 2 == 0){
                evenCnt += 1;
            }else {
                oddCnt += 1;
            }
        }
        answer[0] = evenCnt;
        answer[1] = oddCnt;
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(arr1)));
    }
}
