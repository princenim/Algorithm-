package Inflearn.Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author hazel
 */
public class AllAnagram {
    // 4-4.모든 아나그램 찾기

    public static int solution(String str1, String str2) {
        int answer = 0;

        //비교할 아나그램
        HashMap<Character, Integer> cmp = new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            cmp.put(str2.charAt(i), cmp.getOrDefault(str2.charAt(i), 0) + 1);
        }

        //비교할 map을 미리 세팅
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str2.length() - 1; i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
        }

        //투포인터 알고리즘, sliding window
        int lt = 0;
        for (int rt = str2.length() - 1; rt < str1.length(); rt++) {
            map.put(str1.charAt(rt), map.getOrDefault(str1.charAt(rt), 0) + 1);
            //같으면 추가
            if (map.equals(cmp)) {
                System.out.println(cmp);
                System.out.println(map);
                answer++;
            }
            map.put(str1.charAt(lt), map.get(str1.charAt(lt)) - 1);
            System.out.println(map);
            //만약 hash 의 value  값이 0이라면 지우기
            if (map.get(str1.charAt(lt)) == 0) {
                map.remove(str1.charAt(lt));
            }

            System.out.println(map);
            lt++;
        }


        return answer;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(solution(str1, str2));
    }
}
