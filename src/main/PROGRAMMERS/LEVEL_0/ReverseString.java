package main.PROGRAMMERS.LEVEL_0;

/**
 * @author hazel
 */
public class ReverseString {

    public static String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i > -1; i--) {
            answer = answer + my_string.charAt(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution("jaron"));
    }


}
