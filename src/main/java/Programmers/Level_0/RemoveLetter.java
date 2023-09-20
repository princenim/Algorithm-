package Programmers.Level_0;

/**
 * @author hazel
 */
public class RemoveLetter {
    public static String solution(String my_string, String letter) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcde", "e"));

    }
}
