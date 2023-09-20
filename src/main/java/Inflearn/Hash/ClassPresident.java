package Inflearn.Hash;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author hazel
 */
public class ClassPresident {
    //4-1. 학급회장
    public static char solution(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> hash = new HashMap<>();
        for (char x : str.toCharArray()) {
            //찾는 키가 존재하면 value 값을 반환, 없으면 디폴트 값  반환
            hash.put(x, hash.getOrDefault(x, 0) + 1);

        }


        int max = 0;
        for (char key : hash.keySet()) {
            if (hash.get(key) > max) {
                max = hash.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(solution(n, str));

    }
}
