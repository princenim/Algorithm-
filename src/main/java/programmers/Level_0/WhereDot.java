package programmers.Level_0;

import java.time.Period;

/**
 * @author hazel
 */
public class WhereDot {
    public static int solution(int[] dot) {


        if (dot[0] > 0) {
            if (dot[1] > 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (dot[1] > 0) {
                return 2;
            } else {
                return 3;
            }
        }


    }

    public static void main(String[] args) {

        int[] arr1 = {-2, -3};
        System.out.println(solution(arr1));

    }

}
