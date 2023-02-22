package Inflearn.String;

import java.util.Scanner;

/**
 * @author hazel
 */
public class Palindrome {
    //1-8 : 팰린드롬

    //풀이1
//    public static String solution(String str) {
//        String answer = "YES";
//        str = str.toUpperCase();
//
//        int lt = 0;
//        int rt = str.length() - 1;
//
//        while (lt < rt) {
//            if (!Character.isAlphabetic(str.charAt(lt))) {
//                lt++;
//            } else if (!Character.isAlphabetic(str.charAt(rt))) {
//                rt--;
//            } else {
//                if (str.charAt(lt) != str.charAt(rt)) {
//                    return "NO";
//                } else {
//                    lt++;
//                    rt--;
//                }
//            }
//        }
//        return answer;
//    }

    //풀이 2 - 정규식 사용
    public static String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase();
        //대문자 아닌 것들 다 없애기
        str = str.replaceAll("[^A-Z]", "");

        String tmp = new StringBuilder(str).reverse().toString();
        if (tmp.equals(str)) {
            return "YES";
        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        System.out.println(solution(inputStr));

    }
}
