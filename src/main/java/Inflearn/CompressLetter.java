package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class CompressLetter {

    public static ArrayList<Character> solution(String str) {
        int cnt = 1;
        int strLen = str.length();
        ArrayList<Character> returnArr = new ArrayList<>();
        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length - 1; i++) {
            if (charArr[i] == charArr[i + 1]) {
                cnt++;
            } else {
                if (cnt > 1) {
                    //int to char
                    returnArr.add((char) (cnt + '0'));
                }
                cnt = 1;
            }
        }


        //System.out.println(returnArr);
        return returnArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();

        for (char x : solution(inputStr)) {
            System.out.print(x);
        }


    }
}
