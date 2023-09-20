package PROGRAMMERS.LEVEL_0;

/**
 * @author hazel
 */
public class Triangle {


    public static int solution(int[] sides) {
        int tmp;
        //버블 정렬
        for (int i = 0; i < sides.length; i++) {
            for (int j = 0; j < sides.length - 1 ; j++) {
                if (sides[j] > sides[j + 1]) {
                    tmp = sides[j];
                    sides[j] = sides[j + 1];
                    sides[j + 1] = tmp;
                }
            }
        }

        int total = sides[0] + sides[1];
        if (sides[2] < total) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {199, 72, 222};
        System.out.println(solution(arr1));

    }
}
