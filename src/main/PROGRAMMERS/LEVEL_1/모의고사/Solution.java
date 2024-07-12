package main.PROGRAMMERS.LEVEL_1.모의고사;

import java.util.ArrayList;

/**
 * 모의고사, https://school.programmers.co.kr/learn/courses/30/lessons/42840, 완전탐색
 *
 * @author hazel
 */
public class Solution {
    //1. 문제를 한번 돌면서 각각 수포자가 정답을 맞췄는지 확인한다. -> O(N)
    //2. 정답을 맞출때마다 각각의 정답 맞춘 횟수를 증가시킨다.
    //   (이때 인덱스 범위를 넘지 않도록 나머지 연산을 해준다)
    //3. 횟수 중에서 가장 높은 숫자를 찾고 그 숫자와 같은 수포자의 번호만 정답 배열에 추가한다.

    public int[] solution(int[] answers) {
        int[] answerCnt = new int[3];
        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] n3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {

            if (n1[i % n1.length] == answers[i]) {
                answerCnt[0] += 1;
            }
            if (n2[i % n2.length] == answers[i]) {
                answerCnt[1] += 1;
            }
            if (n3[i % n3.length] == answers[i]) {
                answerCnt[2] += 1;
            }
        }

        int max = Math.max(answerCnt[0], Math.max(answerCnt[1], answerCnt[2]));

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (max == answerCnt[i]) {
                answer.add(i + 1);
            }
        }

        return answer.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}
