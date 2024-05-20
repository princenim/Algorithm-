package main.PROGRAMMERS.LEVEL_1.최소직사각형;

import java.util.Arrays;

/**
 * 최소직사각형, https://school.programmers.co.kr/learn/courses/30/lessons/86491,완전탐색
 *
 * @author hazel
 */
public class Solution {

    public int solution(int[][] sizes) {
        int raw = Integer.MIN_VALUE; //가로는 가장 긴 길이
        int column = Integer.MIN_VALUE; //세로

        for (int[] size : sizes) {
            Arrays.sort(size);
            int min = size[0]; //작은 값
            int max = size[1]; //큰 값

            raw = Math.max(max, raw); //큰 값중에 가장 큰 값
            column = Math.max(min, column); //작은 값 중에 가장 큰 값

        }

        return raw * column;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int answer = solution.solution(arr);
        System.out.println(answer);
    }
}
