package main.BOJ.BOJ;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ10811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //바구니
        int m = scanner.nextInt(); //실행 횟수
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        //System.out.println(Arrays.toString(arr));


        for (int i = 0; i < m; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();

            //배열을 부분 복사
            int[] copyArr = Arrays.copyOfRange(arr, left - 1, right); //범위는 인덱스
            //요소 중 인덱스 1에서 3까지 불러오려면 1, 4가 되어야함
            //즉 해당 인덱스부터 마지막인덱스 바로 전까지 불러옴
            //System.out.println("copy Arr :"+ Arrays.toString(copyArr));

            int copyLen = copyArr.length;
            //범위만큼 copy한 배열의 값으로 거꾸로 하나씩 바꿔준다.
            for (int j = left - 1; j < right; j++) {
                arr[j] = copyArr[copyLen - 1];
                copyLen--;
            }

        }

        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
    }

}
