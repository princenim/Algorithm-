package main.LEETCODE.EASY.N999;

/**
 * 999. Available Captures for Rook,
 * https://leetcode.com/problems/available-captures-for-rook/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    public int numRookCaptures(char[][] board) {
        int[] nx = {-1, 0, 1, 0}; //북동남서
        int[] ny = {0, 1, 0, -1};
        int cnt = 0;  //공격한 횟수
        int dir = 0;  //북쪽부터

        int n = board.length;
        int m = board[0].length;
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            int newX = x;
            int newY = y;
            while (true) {
                newX = newX + nx[dir];
                newY = newY + ny[dir];

                if (newX < 0 || newY < 0 || newX >= n || newY >= m) { //범위 벗어나면 끝
                    break;
                }

                if (board[newX][newY] == 'p') { //p일때
                    cnt++;
                    break;
                }
                if (board[newX][newY] == 'B') {
                    break;
                }
            }
            dir += 1; //방향바꾸기
        }
        return cnt;
    }
}
