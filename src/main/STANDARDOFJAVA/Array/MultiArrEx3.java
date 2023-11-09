package main.STANDARDOFJAVA.Array;

import java.util.Arrays;

/**
 * @author hazel
 */
public class MultiArrEx3 {
    public static void main(String[] args) {
        //자바의 정석 5-22. 행렬의 곱셈

        //m1 x m2 = m3 으로 정한다면
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] m2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        int ROW = m1.length; // m1의 행 길이 2
        int COL = m2[0].length; //m2의 열 길이 2
        int M2_ROW = m2.length; // m2의 행 길이 2

        int[][] m3 = new int[ROW][COL];

        //방법 1
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                m3[i][j] = m1[i][0] * m2[0][j]
                        + m1[i][1] * m2[1][j]
                        + m1[i][2] * m2[2][j];
            }
        }

        //방법1을 확장시켜서 m1의 열 인덱스와 m2의 행 인덱스가 동일하게 증가하므로 이 부분을 for문으로 수정한다면!
        for (int i = 0; i < ROW; i++) { //0.1
            for (int j = 0; j < COL; j++) {//0.1
                for (int k = 0; k < M2_ROW; k++) { //0,1,2
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        //행렬 곱셈의 결과를 출력
        for (int[] tmp : m3) {
            System.out.println(Arrays.toString(tmp));
        }
    }
}
