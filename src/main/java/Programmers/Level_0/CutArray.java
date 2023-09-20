package Programmers.Level_0;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author hazel
 */
public class CutArray {

    //풀이 1
    public static ArrayList solution(int[] numbers, int num1, int num2) {
        //int[] answer = new int[numbers.length];
        ArrayList arr1 = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (i >= num1 && i <= num2) {
                arr1.add(numbers[i]);
            }
        }
        return arr1;
    }

    //풀이2
    public static int[] solution2(int[] numbers, int num1, int num2) {
        int[] answers = new int[num2 - num1 + 1];

        //i, j 같이
        for (int i = num1, j =0; i <= num2; i++, j++) {
            answers[j] = numbers[i];
        }
        return answers;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        //System.out.println(solution(arr1, 1,2));
        System.out.println(Arrays.toString(solution2(arr1, 1, 2)));

    }
}
