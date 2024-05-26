package main.PROGRAMMERS.LEVEL_2.카펫;

import java.util.ArrayList;

/**
 * 카펫,https://school.programmers.co.kr/learn/courses/30/lessons/42842,완전탐색
 *
 * @author hazel
 */
public class Solution {

    public ArrayList<Integer> solution(int brown, int yellow) {

        int row = 0;
        int column = 0;
        ArrayList<Integer> answer = new ArrayList<>();

        int num = (brown - 4) / 2;
        int half = (int) Math.ceil(num / 2.0); //가로 기준 , 올림
        System.out.println(num);
        System.out.println(half);
        for (int i = half; i <= num; i++) {
            row = i;
            column = num - row;

            System.out.println(row);
            System.out.println(column);
            if (row * column == yellow) {
                break;
            }
        }

        answer.add(row + 2);
        answer.add(column + 2);

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Integer> answer = solution.solution(10, 2);
        System.out.println(answer);
    }

}
