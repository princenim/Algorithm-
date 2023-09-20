package Inflearn.Hash;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author hazel
 */
public class Anagram {
    //4 - 2 .아나그램(해쉬)

    public static HashMap<Character, Integer> toHashMap(String str) {
        //저장순서가 유지 X
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        return map;
    }


    //아나그램(해쉬)
    public static String solution(String str1, String str2) {
        String answer = "YES";

        HashMap<Character, Integer> map = toHashMap(str1);
        System.out.println(map);

        for (Character x : str2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) ==0){
                return "NO";
            }else {
                map.put(x, map.get(x) -1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        System.out.println(solution(str1, str2));


    }
}
