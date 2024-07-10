package main.PROGRAMMERS.LEVEL_1.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 두 개 뽑아서 더하기, https://school.programmers.co.kr/learn/courses/30/lessons/68644, 구현
 *
 * @author hazel
 */
public class Solution {

    public int[] solution(int[] numbers) {
        //set에 넣고 배열 정렬하기

        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int len = numbers.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            answer.add(it.next());
        }
        Collections.sort(answer);

        return set.stream() //stram으로 변환
                  .sorted()  //정렬
                  .mapToInt(Integer::intValue) //Integer -> int
                  .toArray(); //배열로 변환
    }
}
