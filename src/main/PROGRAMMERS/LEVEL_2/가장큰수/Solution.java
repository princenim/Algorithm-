package main.PROGRAMMERS.LEVEL_2.가장큰수;

import java.util.Arrays;

/**
 * 가장큰수 ,https://school.programmers.co.kr/learn/courses/30/lessons/42746, 정렬
 *
 * @author hazel
 */
public class Solution {

    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();

        //3 vs 30이면 int 숫자 비교를 하므로 string으로 바꿔서 앞자리를 비교하도록
        String[] arr = new String[numbers.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        //내림차순해야함
        Arrays.sort(arr, (s1, s2) -> {
            return (s2 + s1).compareTo(s1 + s2); //내림차순. a-b > 0 이면 값을 바꿈, 0이거나 음수면 교환X
        });

        //[0,0]이면 0 리턴하도록
        if (arr[0].equals("0")) {
            return "0";
        }

        System.out.println(Arrays.toString(arr));
        for (String s : arr) {
            answer.append(s);
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] arr = {3, 30, 34, 5, 9};
        String answer = solution.solution(arr);
        System.out.println(answer);
    }
}
