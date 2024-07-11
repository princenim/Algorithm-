package main.PROGRAMMERS.LEVEL_2.행렬의곱셈;

/**
 * 행렬의 곱셈, https://school.programmers.co.kr/learn/courses/30/lessons/12949, 구현
 *
 * @author hazel
 */
public class Solution {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int n1 = arr1.length;
        int m1 = arr1[0].length;
        int n2 = arr2.length;
        int m2 = arr2[0].length;

        int[][] answer = new int[n1][m2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < m1; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}
