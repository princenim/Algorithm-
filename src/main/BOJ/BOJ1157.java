package main.BOJ;


import java.util.*;

/**
 * @author hazel
 */
public class BOJ1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        str = str.toUpperCase();


        //밑의 코드를 getOrdefault 사용 가능
        HashMap<Character, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            if (hashMap.containsKey(str.charAt(i))) {
//                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
//            } else {
//                hashMap.put(str.charAt(i), 1);
//            }
//        }

        for (int i = 0; i < str.length(); i++) {
            Character key = str.charAt(i);
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
            //getOrDefault : 값이 있으면 가져오고 없으면 디폴트 값으로 가져옴

        }

        System.out.println(hashMap);
        //value에서 가장 큰 값 찾기

        int max = 0;
        String answer = "";
        for (Character x : hashMap.keySet()) {
            if (hashMap.get(x) > max) {
                max = hashMap.get(x);
                answer = String.valueOf(x);
            } else if (hashMap.get(x) == max) {
                //max 값이 동일하게 존재하면 ? 출력
                answer = "?";
            }
        }

        System.out.println(answer);
    }

}
