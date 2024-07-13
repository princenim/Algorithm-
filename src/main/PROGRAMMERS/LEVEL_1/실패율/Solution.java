package main.PROGRAMMERS.LEVEL_1.실패율;

import java.util.HashMap;

/**
 * 실패율, https://school.programmers.co.kr/learn/courses/30/lessons/42889, 구현
 *
 * @author hazel
 */
public class Solution {
    //1. stage 배열을 돌면서 배열에 각 스테이지에 멈춰있는 유저의 수를 기록한다.
    //2. 스테이지 개수(N)만큼 돌면서 각 스테이지마다의 실패율을 Map에 기록한다. (스테이지 번호 : 실패율)  -> O(N)
    //3. 이때 map의 value기준으로 내림차순으로 정렬한다. -> O(logN)
    //4. value만 배열로 출력

    public int[] solution(int n, int[] stages) {
        int[] users = new int[n + 2];
        for (int i = 0; i < stages.length; i++) {
            int value = stages[i];
            users[value] = users[value] + 1;
        }

        HashMap<Integer, Double> fails = new HashMap<>();
        double len = stages.length;
        for (int i = 1; i <= n; i++) {
            if (users[i] == 0) { //도전한 사람이 없을때
                // 이렇게 명시적으로 처리해주는 이유는 0을 float나 double로 나누면 NaN이 나온다.
                fails.put(i, 0.);
            } else {
                fails.put(i, users[i] / len);
                len = len - users[i];
            }
        }
        //value를 내림차순 기준으로 정렬
        return fails.entrySet()
                    .stream()
                    .sorted( //내부적으로 timsort시용
                        (o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
                    .mapToInt(HashMap.Entry::getKey)
                    .toArray();
    }
}