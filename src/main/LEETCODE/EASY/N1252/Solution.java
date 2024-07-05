package main.LEETCODE.EASY.N1252;

/**
 * 1252. Cells with Odd Values in a Matrix,
 * https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            int[] indice = indices[i];
            int r = indice[0];
            int c = indice[1];

            //x좌표
            for (int k = 0; k < n; k++) {
                arr[r][k]++;
            }
            //y좌표
            for (int l = 0; l < m; l++) {
                arr[l][c]++;
            }
        }

        int answer = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 1) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
