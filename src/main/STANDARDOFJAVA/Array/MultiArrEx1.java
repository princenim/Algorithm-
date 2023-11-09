package main.STANDARDOFJAVA.Array;

import java.util.Scanner;

/**
 * @author hazel
 */
public class MultiArrEx1 {
    //자바의 정석 5-20. 좌표에 x 표하기

    /**
     * 둘이 마주 앉아 다양한 크기의 배를 상대방이 알지 못하게 배치한 다음, 번갈아가며 좌표를 불러가며 상대방의 배의 위치를 알아내는 게임.
     * 0이 바다고 1이 배라고 가정하며, 배의 좌표를 찾을 시 O, 틀릴 시 X를 출력한다.
     */

    public static void main(String[] args) {
        //입력한 2차원 좌표에 위치에 X 표시하기
        final int SIZE = 10;
        int x = 0;
        int y = 0;

        //크키가 10인 문자형 2차원 배열 선언
        char[][] board = new char[SIZE][SIZE];

        //0이 바다 , 1이 배
        byte[][] shipBoard = {
                {0, 0, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 1},
        };

        //배열 board에 좌표를 쉽게 입력 및 확인하기위해 행번호과 엻번호가 미리 입력한다.
        for (int i = 1; i < SIZE; i++) {
            board[0][i] = board[i][0] = (char) (i + '0'); //숫자 1에 '0'을 더하면 문자 '1'이 된다.
        }

        //출력으로 확인가능
//        for (char[] tmp : board) {
//            System.out.println(Arrays.toString(tmp));
//        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("좌표를 입력하세요. (종료는 00)>");
            String input = scanner.nextLine(); // 화면에서 입력받는 내용을 input에 저장

            if (input.length() == 2) {
                x = input.charAt(0) - '0'; //문자 '0'을 숫자 0으로 변환
                y = input.charAt(1) - '0';
                if (x == 0 && y == 0) {
                    break;
                }
            }
            if (input.length() != 2 || x <= 0 || y <= 0 || x >= SIZE || y >= SIZE) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                continue;
            }

            //삼항연산자 ?를 기준으로 앞이 조건
            //1이라면 배, 0이면 바다라는 뜻

            board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';

            //정답인 board 출력
            for (int i = 0; i < SIZE; i++) {
                System.out.println(board[i]);
            }
        }
    }

}
