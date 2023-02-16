package Inflearn;

import java.util.Scanner;

/**
 * @author hazel
 */
public class FlipSomeWord {
    //1-5 .특정문자 뒤집기

    public static String solution(String str) {
        String answer = "";
        char[] charArr = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            //lt가 특수문자가 아닐때++
            if (!Character.isAlphabetic(charArr[lt])) {
                lt++;
                //rt가 툭수문자 아닐때 --
            } else if (!Character.isAlphabetic(charArr[rt])) {
                rt--;
            } else {
                //둘다 문자이면 --, ++
                char tmp = charArr[rt];
                charArr[rt] = charArr[lt];
                charArr[lt] = tmp;
                lt ++;
                rt --;
            }
        }
        //char[] to string
        answer = String.valueOf(charArr);
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();

        System.out.println(solution(input1));
    }
}
