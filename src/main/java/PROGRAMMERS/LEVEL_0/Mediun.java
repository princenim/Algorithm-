package PROGRAMMERS.LEVEL_0;

/**
 * @author hazel
 */
public class Mediun {
    public static int solution(int[] array) {
        int tmp;
        //버블정렬
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        int mid = array.length / 2;
        return array[mid];
    }

    public static void main(String[] args) {
        int[] arr1 = {9, -1, 0};
        System.out.println(solution(arr1));

    }

}
