package main.LEETCODE.MEDIUM.N36;

import java.util.HashSet;

/**
 * 36. Valid Sudoku, https://leetcode.com/problems/valid-sudoku/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    //1. Set을 이용해서 값이 있는지 확인
    //2. 가로 확인
    //3. 세로 확인
    //4. 서브 박스 확인
    public boolean isValidSudoku(char[][] board) {
        //1. 가로
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                int value = board[i][j];
                if (value != '.') {
                    if (set.contains(value)) {
                        return false;
                    } else {
                        set.add(value);
                    }
                }
            }
        }

        //2. 세로
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> set2 = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                int value2 = board[j][i];
                if (value2 != '.') {
                    if (set2.contains(value2)) {
                        return false;
                    } else {
                        set2.add(value2);
                    }
                }

            }
        }

        //3. 서브 박스 (박스 단위로 움직임)
        for (int box = 0; box < 9; box++) {
            HashSet<Integer> boxSet = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                int row = 3 * (box / 3) + i / 3;
                int col = 3 * (box % 3) + i % 3;
                int value3 = board[row][col];
                if (value3 != '.') {
                    if (boxSet.contains(value3)) {
                        return false;
                    } else {
                        boxSet.add(value3);
                    }
                }
            }
        }
        return true;
    }
}
