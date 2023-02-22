package Inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class BigNum {

    //2-1 . 큰 수 출력하기
    public static ArrayList<Integer> solution(int n, ArrayList<Integer> arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr.get(0));
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                answer.add(arr.get(i));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }

        for (int x : solution(n, arr)) {
            System.out.print(x);
            System.out.print(" ");
        }
    }
}
