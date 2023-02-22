package Inflearn.String;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class CompressLetter {

    public static String solution(String str) {
        String answer = "";
        //마지막 문자 넣기 위해 빈공간을 하나 추가하기
        str += " ";

        int cnt = 1;

        // -1을 하는 이유는 문자를 하나 더 추가했기 때문에  , 인덱스 에러를 피하기 위해
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += cnt;
                    cnt = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        System.out.println(solution(inputStr));
    }
}
