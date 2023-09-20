package INFLEARN.String;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class Password {
    public static String solution(int num, String str) {
        // 1-12 . 암호
        String answer = "";
        ArrayList<String> arr = new ArrayList<>();
        str += " ";

        str = str.replace("*", "0");
        str = str.replace("#", "1");

        for (int i = 0; i < num; i++) {
            int end = 7 * (i + 1);
            arr.add(str.substring(7 * i, end));
        }

        for (String x : arr) {
            //2진법을 10진법으로
            int ascii = Integer.parseInt(x, 2);

            //문자 -> 숫자
            char ch = (char) ascii;
            answer += ch;
        }
        return answer;
    }

    public static String solution2(int num , String str){
        String answer = "";

        for(int i = 0; i < num; i ++){

            //기준 문자열을 잘라버리는 방법도 존재
            String tmp = str.substring(0,7).replace("*", "0").replace("#", "1");
            int ascii = Integer.parseInt(tmp, 2);
            answer += (char)ascii;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String str = in.next();

        System.out.println(solution(num, str));
        System.out.println(solution2(num, str));
    }
}
