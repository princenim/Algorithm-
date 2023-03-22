package Inflearn.Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author hazel
 */
public class Crane {
    private static int solution(int n, int[][] board, int moveLen, int[] move) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        //8번씩 5번
        for (int i = 0; i < moveLen; i++) {
            for (int j = 0; j < n; j++) {
                int i1 = board[j][move[i] - 1];
                System.out.println(i1);
                if (i1 != 0) {
                    //stack에 넣고, 0으로 바꾸기

                    stack.push(i1);
                    board[j][move[i] - 1] = 0;
                    break;
                }

            }
            System.out.println(stack);
            System.out.println("==================");


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

        int solution = solution(n, board, moveLen, move);
        System.out.println(solution);

    }


}
