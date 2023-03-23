package Inflearn.Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author hazel
 */
public class Crane {
    //5-3 . 크레인(카카오)
    private static int solution(int[][] board, int[] move) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        //8번씩 5번
        for (int pos : move) {
            for (int j = 0; j < board.length; j++) {
                //인형을찾음
                if (board[j][pos -1]  != 0) {
                    int tmp = board[j][pos -1];
                    // 0으로 바꾸기
                    board[j][pos -1]  = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        //stack에 마지막 값과 같을 떄
                        answer += 2;
                        stack.pop();
                    } else {
                        //stack에 넣기
                        stack.push(tmp);
                    }
                    //인형을 찾으면 for문 나가기
                    break;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int moveLen = sc.nextInt();
        int[] move = new int[moveLen];
        for (int i = 0; i < moveLen; i++) {
            move[i] = sc.nextInt();
        }

        int solution = solution(board, move);
        System.out.println(solution);

    }


}
