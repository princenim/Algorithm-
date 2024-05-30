package main.LEETCODE.EASY.N832;

import java.util.Arrays;

/**
 * * 832. Flipping an Image,https://leetcode.com/problems/flipping-an-image/, 구현
 * <p>
 * xor 사용 : 비트연산으로 두 비트가 같으면 0 , 다르면 1 즉 0과 1을 1로 xor 1 과 0이 나오는 특성을 이용
 *
 * @author hazel
 */
public class Solution2 {

    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int tmp = image[i][j] ^ 1; // xor 연산하면 1 -> 0 , 0-> 1
                image[i][j] = image[i][n - 1 - j] ^ 1;
                image[i][n - 1 - j] = tmp;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[][] arr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] ints = solution2.flipAndInvertImage(arr);
        System.out.println(Arrays.deepToString(ints));
    }
}
