package main.INFLEARN.String;


import java.util.Scanner;

/**
 * @author hazel
 */
public class ChangeLetter {

    //1-2 대소문자 변환
    //방법 1
//    public static String solution(String letter) {
//        String answer = "";
//
//        for (int i = 0; i < letter.length(); i++) {
//            if (Character.isUpperCase(letter.charAt(i))) {
//
//                answer = answer + Character.toLowerCase(letter.charAt(i));
//            } else {
//                answer = answer + Character.toUpperCase(letter.charAt(i));
//            }
//        }
//        return answer;
//    }

    //방법 2 : 아스키 코드로 풀기 - 65~ 90 대문자, 97~122 소문자
    public static String solution(String letter){
        StringBuilder answer = new StringBuilder();

        for (char x : letter.toCharArray()){
            if(x >= 65 && x <=90){
                // int to char
                x= (char) (x + 32);
                answer.append(x);
            }else {
                x = (char)(x -32);
                answer.append(x);
            }
        }
        return answer.toString();

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        System.out.println(solution(input1));

    }
}
