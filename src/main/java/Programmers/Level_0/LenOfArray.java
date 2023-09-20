package Programmers.Level_0;

import java.util.Arrays;

/**
 * @author hazel
 */
public class LenOfArray {
    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] arr1 = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(solution(arr1)));
    }

}
