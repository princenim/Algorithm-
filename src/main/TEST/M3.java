package main.TEST;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author hazel
 */
public class M3 {
    public static int solution(String S, String T) {
        int answer = 0;

        String[] arr1 = S.split(":");
        String[] arr2 = T.split(":");


        int start = Integer.parseInt(arr1[2]);
        int end = Integer.parseInt(arr2[2]);


        for (int i = start; i < end + 1; i++) {
            if (i < 10) {
                arr1[2] = "0" + i;
            } else {
                arr1[2] = String.valueOf(i);
            }

            //System.out.println(i);

            //arr -> str
            String tmp = "";
            for (int j = 0; j < arr1.length; j++) {
                tmp += arr1[j];
            }

            System.out.println(tmp);

            //str의 개수 확인
            HashSet<Character> set = new HashSet<>();
            for (int k = 0; k < tmp.length(); k++) {
                set.add(tmp.charAt(k));
            }

            System.out.println(set);
            //System.out.println(set.size());
            if (set.size() <= 2) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String t1 = in.next();
        String t2 = in.next();
        System.out.println(solution(t1, t2));
    }

}
