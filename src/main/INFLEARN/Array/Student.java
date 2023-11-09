package main.INFLEARN.Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class Student {
    //2-2 . 보이는 학생
    public static int solution(int n, ArrayList<Integer> arr) {
        //무조건 한명은 보이므로
        int answer = 1;
        int tmp = arr.get(0);

        for (int i = 1; i < n; i ++) {
            if (arr.get(i)> tmp) {
                answer++;
                tmp = arr.get(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }
        System.out.println(solution(n, arr));
    }
}
