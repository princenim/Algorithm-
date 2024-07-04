package main.LEETCODE.EASY.N1275;

/**
 * 1275. Find Winner on a Tic Tac Toe Game,
 * https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/description/, 구현
 *
 * @author hazel
 */
class Solution {

    public String tictactoe(int[][] moves) {
        //초기화
        char[][] arr = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = '.';
            }
        }

        for (int i = 0; i < moves.length; i++) {
            int[] cur = moves[i];
            int x = cur[0];
            int y = cur[1];

            if (i % 2 == 0) {
                arr[x][y] = 'X';
            } else {
                arr[x][y] = 'O';
            }
        }

        //가로로 확인
        for (int i = 0; i < 3; i++) {
            int cntA = 0;
            int cntB = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 'X') {
                    cntA++;
                }
                if (arr[i][j] == 'O') {
                    cntB++;
                }
            }

            if (cntA == 3) {
                return "A";
            }
            if (cntB == 3) {
                return "B";
            }
        }

        //세로로 확인
        for (int i = 0; i < 3; i++) {
            int cntA = 0;
            int cntB = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[j][i] == 'X') {
                    cntA++;
                }
                if (arr[j][i] == 'O') {
                    cntB++;
                }
            }
            if (cntA == 3) {
                return "A";
            }
            if (cntB == 3) {
                return "B";
            }

        }
        //대각선 확인
        if (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') {
            return "A";
        }
        if (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O') {
            return "B";
        }

        if (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X') {
            return "A";
        }
        if (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O') {
            return "B";
        }

        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 'X' || arr[i][j] == 'O') {
                    cnt++;
                }
            }
        }

        if (cnt != 9) {
            return "Pending"; //진행중
        }

        return "Draw"; //무승부
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] move = {{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}};
        String tictactoe = solution.tictactoe(move);
        System.out.println(tictactoe);
    }
}

