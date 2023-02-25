package Inflearn.Array;

import java.time.Period;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 * @author hazel
 */
public class ReversedNum {
    //2-6, 뒤집은 소수
    public static ArrayList<Integer> solution(int n, ArrayList<Integer> arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {

            //숫자 뒤집기
            int num = reverseNum(arr.get(i));
            //소수일때만 배열에 추가
            if (checkPrime(num)) {
                answer.add(num);
            }
        }
        return answer;
    }


    public static boolean checkPrime(int num) {

        //1은 소수가 아님
        if (num == 1) {
            return false;
        }
        //소수 체크하기
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                return false;
                //소수가 아니면 바로 나가버림 (= 약수가 존재할때)
            }
        }

        return true;
    }

    public static int reverseNum(int num) {
        //숫자 뒤집기
        int tmp = 0;
        while (num > 0) {
            tmp = tmp * 10 + (num % 10);
            num = num / 10;
        }
        return tmp;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }


        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

}
