package programmers.Level_0;

import java.util.HashMap;

/**
 * @author hazel
 */
public class HateEnglish {

    //영어가 싫어요
    public static long solution(String numbers) {
        String answer = "";

        HashMap<String, Integer> num = new HashMap<>();
        num.put("zero", 0);
        num.put("one", 1);
        num.put("two", 2);
        num.put("three",3);
        num.put("four", 4);
        num.put("five", 5);
        num.put("six", 6);
        num.put("seven", 7);
        num.put("eight", 8);
        num.put("nine", 9);

        //hashmap key값 가져오기
        for(String key : num.keySet()){
            if (numbers.contains(key)){
                answer += num.get(key);
            }

        }
        return Long.parseLong(answer);
    }
    public static void main(String[] args) {

     System.out.println(solution("onetwothreefourfivesixseveneightnine"));

    }
}
