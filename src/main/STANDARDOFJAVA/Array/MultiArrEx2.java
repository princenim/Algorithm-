package main.STANDARDOFJAVA.Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hazel
 */
public class MultiArrEx2 {
    //자바의 정석 5-21. 빙고 게임

    /**
     * 5X5 크기의 빙고판에 1~ 25의 숫자를 차례로 저장한 다음에, Math.random()을 이용해서 저장된 값의 위치를 섞은 후 , 숫자를 입력해 입력한 숫자가 빙고배열의 숫자와 같으면 0으로 바꾸는 게임
     */
    public static void main(String[] args) {
        int SIZE = 5;
        int tmp, x, y, num = 0;

        int[][] bingo = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        //배열의 요소를 1~ 25로 초기화
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bingo[i][j] = i * SIZE + j + 1;
            }
        }

        for (int[] arr : bingo) {
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("===============================");

        //bingo 배열을 랜덤 숫자를 이용해서 섞기
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x = (int) (Math.random() * SIZE); //Math.random()은 0.0~ 1.0사이의 double형 숫자를 만들어줌.
                y = (int) (Math.random() * SIZE);

                //25개의 요소를 모두 바꾸기
                tmp = bingo[x][y];
                bingo[x][y] = bingo[i][j];
                bingo[i][j] = tmp;
            }
        }

        //do - while : do를 먼저 실행한 후 while의 조건문이 맞으면 다시 실행문을 수행하고, 조건이 맞지않으면 빠져나온다.
        do {
            //현재 빙고 먼저 출력
            for (int i = 0; i < SIZE; i++) {
                System.out.println(Arrays.toString(bingo[i]));
            }
            System.out.println("===============================");
            //숫자 입력 받기
            System.out.printf("숫자를 입력하세요 : ");
            num = scanner.nextInt();

            outer:
            //outer는 라벨. 다중반복문에 이름을 붙인 것
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (bingo[i][j] == num) {
                        bingo[i][j] = 0;
                        break outer; //다중반복문을 빠져나가기
                    }
                }
            }
        } while (num != 0);
    }
}
