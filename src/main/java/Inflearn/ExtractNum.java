package Inflearn;

import java.util.Scanner;

/**
 * @author hazel
 */
public class ExtractNum {
    //  1- 9 . 숫자만 추출
//    public static int solution(String str) {
//        StringBuilder answer = new StringBuilder();
//        int intAnswer = 0;
//
//        for (char x : str.toCharArray()) {
//            //아스키코드말고 Character.isDigit() 사용가능
//
//            if (x >= 48 && 57 >= x) {
//
//                answer.append(x);
//                //String to int
//                intAnswer = Integer.parseInt(String.valueOf(answer));
//            }
//        }
//        return intAnswer;
//    }


    //방법 2
    public static int solution(String str){
        return Integer.parseInt(str.replaceAll("[^0-9]",""));

    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        System.out.println(solution(inputStr));

    }

}
