package INFLEARN.Array;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author hazel
 */
public class RockPaperScissors {
    public static ArrayList<Character> solution(int n, ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (Objects.equals(arr1.get(i), arr2.get(i))) {
                answer.add('D');
            } else if (arr1.get(i) == 1) {
                if (arr2.get(i) == 3) {
                    answer.add('A');
                }
            } else if (arr1.get(i) == 2) {
                if (arr2.get(i) == 1) {
                    answer.add('A');
                }
            } else if (arr1.get(i) == 3) {
                if (arr2.get(i) == 2) {
                    answer.add('A');
                }
            }else {
                answer.add('B');
            }

        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr1.add(in.nextInt());
        }
        for (int i = 0; i < n; i++) {
            arr2.add(in.nextInt());
        }

        //출력w
        for (char x : solution(n, arr1, arr2)) {
            System.out.println(x);
        }

    }
}
