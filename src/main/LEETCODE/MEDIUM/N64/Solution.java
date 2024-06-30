package main.LEETCODE.MEDIUM.N64;

/**
 * 64. Minimum Path Sum, https://leetcode.com/problems/minimum-path-sum/description/, DP
 *
 * @author hazel
 */
public class Solution {

    public int minPathSum(int[][] grid) {
        int n = grid.length; //가로
        int m = grid[0].length; //세로

        for (int i = 1; i < n; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        for (int j = 1; j < m; j++) {
            grid[0][j] += grid[0][j - 1];
        }

        //오른쪽과 밑으로만 이동 가능하니까 점화식로 최솟값을 찾으면서 구하기
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[n - 1][m - 1];
    }
}
