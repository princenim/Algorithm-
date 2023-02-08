package programmers.Level_0;

import java.util.HashMap;
import java.util.Map;


/**
 * @author hazel
 */
public class MorseCode {
    //모스부호1
    public static String solution(String letter) {
        StringBuilder answer = new StringBuilder();

        Map<String, String> morse = new HashMap<>();
        String[] letter2 = letter.split(" ");

        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");


        for (String s : letter2) {
            answer.append(morse.get(s));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
    }

}

