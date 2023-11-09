package main.PROGRAMMERS.LEVEL_0;


public class Average {
    public static double solution(int[] numbers) {
        double answer = 0;
        int cnt = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            cnt = i + 1;
        }

        return answer / cnt;
    }

    public static void main(String[] args) {

        //배열 선언 및 초기화
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution(arr1));
    }
}
