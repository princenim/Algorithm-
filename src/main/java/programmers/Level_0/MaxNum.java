package programmers.Level_0;

import java.util.Arrays;

/**
 * @author hazel
 */
public class MaxNum {
    public static int solution(int[] numbers) {

        int tmp;
        //버블정렬
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 ; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }

            System.out.println(Arrays.toString(numbers));
        }
        return numbers[numbers.length -2] * numbers[numbers.length -1];
    }

    public static void main(String[] args) {
        int[] arr1= {0, 31, 24, 10, 1, 9};
        System.out.println(solution(arr1));

    }

}
