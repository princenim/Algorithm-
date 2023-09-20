package Programmers.Level_0;

import java.util.ArrayList;

/**
 * @author hazel
 */
public class HateEven {

    public static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(10));
    }

}
