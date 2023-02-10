package programmers.Level_0;

import java.util.HashMap;

/**
 * @author hazel
 */
public class HateEnglish {
    public static long solution(String numbers) {

        HashMap<String, String> num = new HashMap<>();
        num.put("zero", "0");
        num.put("one", "1");
        num.put("two", "2");
        num.put("three", "3");
        num.put("four", "4");
        num.put("five", "5");
        num.put("six", "6");
        num.put("seven", "7");
        num.put("eight", "8");
        num.put("nine", "9");


        for (String key : num.keySet()) {
            //System.out.println(key);
            //System.out.println(num.get(key));
            numbers = numbers.replace(key, num.get(key));
        }

        //System.out.println(numbers);
        return Long.parseLong(numbers);
    }

    public static void main(String[] args) {
        solution("onefourzerosixseven");
    }

}


