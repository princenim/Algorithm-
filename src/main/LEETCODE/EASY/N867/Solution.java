package main.LEETCODE.EASY.N867;

/**
 * 867. Transpose Matrix,https://leetcode.com/problems/transpose-matrix/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] newMatrix = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }
        return newMatrix;
    }
}
