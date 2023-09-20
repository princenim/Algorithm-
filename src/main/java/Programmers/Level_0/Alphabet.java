package Programmers.Level_0;

public class Alphabet {
    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            int intCh = ch;

            if (65 <= intCh && 90 >= intCh) {
                intCh = intCh + 32;
            } else {
                intCh = intCh - 32;
            }
            char a = (char) intCh;
            answer.append(a);
        }

        return answer.toString();
    }


    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));
    }
}
