package main.PROGRAMMERS.LEVEL_1.모의고사;

import java.util.ArrayList;

/**
 * 모의고사,https://school.programmers.co.kr/learn/courses/30/lessons/42840, 완전탐색, 82m
 *
 * @author hazel
 */
public class Solution {

    public ArrayList<Integer> solution(int[] answers) {
        int[] answer = new int[3];
        //리턴할 배열
        ArrayList<Integer> arr = new ArrayList<>();

        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % 5]) {
                answer[0]++;
            }

            if (answers[i] == two[i % 8]) {
                answer[1]++;
            }
            if (answers[i] == three[i % 10]) {
                answer[2]++;
            }
        }

        //가장 많이 맞춘 개수
        int maxNum = Math.max(answer[0], Math.max(answer[1], answer[2]));

        for (int i = 0; i < 3; i++) {
            if (maxNum == answer[i]) { //같을때!
                arr.add(i + 1);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> answer = solution.solution(arr);
        System.out.println(answer);
    }
}
