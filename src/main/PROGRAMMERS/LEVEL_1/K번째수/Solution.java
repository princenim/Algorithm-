package main.PROGRAMMERS.LEVEL_1.K번째수;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * k번째수,https://school.programmers.co.kr/learn/courses/30/lessons/42748 ,정렬
 *
 * @author hazel
 */
public class Solution {

    public ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            int[] arr = getArr(array, commands[i]);
            //System.out.println(Arrays.toString(arr));
            int value = commands[i][2] - 1;
            answer.add(arr[value]);
        }

        return answer;
    }

    public int[] getArr(int[] array, int[] command) {
        int[] ints = Arrays.copyOfRange(array, command[0] - 1, command[1]);
        Arrays.sort(ints);
        return ints;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        ArrayList<Integer> solution1 = solution.solution(array, commands);
        System.out.println(solution1);
    }
}
