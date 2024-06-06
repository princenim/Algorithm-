package main.LEETCODE.MEDIUM.N885;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 885. Spiral Matrix III, https://leetcode.com/problems/spiral-matrix-iii/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0}; //방향 : 동쪽, 남쪽, 서쪽, 북쪽으로 이동 ,
    //dir 방향도 순서대로 0,1,2,3으로 표현

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        //시작 지점을 배열에 추가
        ArrayList<int[]> result = new ArrayList<>();
        int x = rStart;
        int y = cStart;
        result.add(new int[]{x, y});

        int dir = 0; //방향 0:동쪽, 1:남쪽, 2:서쪽, 3:북쪽
        int step = 1;
        int cnt = 0;  //방향전환 횟수
        while (result.size() < rows * cols) { //총 30개일때까지
            for (int i = 0; i < step; i++) { //step은 총 몇번 이동할지. 규칙 보면 1,1,2,2,3,3,4,4 씩 이동
                x += dx[dir];
                y += dy[dir];
                if (x >= 0 && x < rows && y >= 0 && y < cols) { //범위를 벗어나지 않았다면 추가
                    result.add(new int[]{x, y});
                }
            }
            //이동 후 방향 전환 필수
            dir = (dir + 1) % 4;//동쪽 방향에서 남쪽방향으로 ex) 0-> 1
            cnt++;

            if (cnt == 2) {//규칙이 1,1,2,2,3,3 이므로 2번이동후 방향전환
                step++; //2번 이동 후 step 추가
                cnt = 0; //다시 0
            }
        }
        return result.toArray(new int[rows * cols][2]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] ints = solution.spiralMatrixIII(5, 6, 1, 4);
        System.out.println(Arrays.deepToString(ints));
    }
}
