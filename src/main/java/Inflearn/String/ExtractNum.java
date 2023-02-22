package Inflearn.String;

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
//    public static int solution(String str){
//        return Integer.parseInt(str.replaceAll("[^0-9]",""));
//
//    }

    public static int solution(String str) {
        int answer = 0;
        for (char x : str.toCharArray()) {
            //문자형 정수 ex) '10'를 10진수화 하는 방법
            if(x >= 48 && x <= 57 ){
                answer = answer * 10 + (x - 48);
                // 0 = 0 + 0
                // 2   =  0 * 2  + (2)
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        System.out.println(solution(inputStr));

    }

}
