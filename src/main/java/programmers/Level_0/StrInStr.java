package programmers.Level_0;

import java.time.Period;

/**
 * @author hazel
 */
public class StrInStr {
    public static int solution(String str1, String str2) {
        int searchIdx = 0;
        for (int i = 0; i < str1.length(); i++) {
            //삼항 연산자
            //searchIdx += str2.charAt(searchIdx) == str1.charAt(i) ? 1 : 0;

            if (str2.charAt(searchIdx) == str1.charAt(i)) {
                searchIdx += 1;
            } else {
                searchIdx = 0;
            }

            if (searchIdx == str2.length()) {
                return 1;
            }
        }
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(solution("1ab6jCDE443fgh22iJKlmn1o", "6C"));
    }
}
