package main.PROGRAMMERS.LEVEL_2.의상;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * 의상, https://school.programmers.co.kr/learn/courses/30/lessons/42578?language=java, 해시
 *
 * @author hazel
 */
public class Solution {

    public int solution(String[][] clothes) {
        int answer = 1;

        //해시
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            if (hashMap.containsKey(type)) {
                //키가 있으면 추가
                hashMap.put(type, hashMap.get(type) + 1);
            } else {
                //키가 없으면 +1
                hashMap.put(type, 1);
            }
        }

        for (Entry<String, Integer> entry : hashMap.entrySet()) {
            answer *= entry.getValue() + 1;
        }

        return answer - 1; //아무것도 고르지 않았을 때 제외
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] arr = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
            {"green_turban", "headgear"}};
        int answer = solution.solution(arr);
        System.out.println(answer);
    }
}
