package main.PROGRAMMERS.LEVEL_0;

/**
 * @author hazel
 */
public class LetterRepeat {
    public static String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }

}
