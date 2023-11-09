package main.PROGRAMMERS.LEVEL_0;

import java.util.Arrays;

/**
 * @author hazel
 */
public class IceAmericano {
    public static  int[] solution(int money) {
        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money %  5500;

        return answer;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(15000)));
    }

}
