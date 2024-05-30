package main.LEETCODE.EASY.N832;

import java.util.Arrays;

/**
 * 832. Flipping an Image,https://leetcode.com/problems/flipping-an-image/, 구현
 *
 * @author hazel
 */
public class Solution {

    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) { //그냥 앞에서 하나씩 차례대로 돌아도 ㄱㅊ
                if (image[i][j] == 1) {
                    answer[i][n - 1 - j] = 0;
                } else {
                    answer[i][n - 1 - j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] ints = solution.flipAndInvertImage(arr);
        System.out.println(Arrays.deepToString(ints));
    }
}
