package main.PROGRAMMERS.LEVEL_0;

public class Array {
    public static int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length];

        int len = num_list.length; //배열 개수
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[len - 1];
            len = len - 1;
        }
        //System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(solution(arr1));
    }
}
