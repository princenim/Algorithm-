package programmers.Level_0;

import java.util.Arrays;

/**
 * @author hazel
 */
public class CloseNum {
    public static int solution(int[] array, int n) {
        int answer = 0;
        int tmp = 0;

        //버블정렬
        for(int i = 0; i < array.length; i ++){
            for(int j =0; j < array.length -1; j ++){
                if(array[j] >array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

        for(int i = 0; i <array.length -1; i++){
            if( n > array[i] && n <array[i+1]){
                int n1  = n - array[i];
                int n2 = n - array[i +1];
                if(n1 > n2){
                    answer =array[i +1];
                }else {
                    answer =array[i ];
                }
            }else {
                answer = array[array.length -1];
            }
        }

        //System.out.println(array[array.length -1]);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 11, 12};
        System.out.println(solution(arr1, 13));
    }
}
