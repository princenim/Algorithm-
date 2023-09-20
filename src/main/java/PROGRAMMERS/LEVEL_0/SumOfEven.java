package PROGRAMMERS.LEVEL_0;

public class SumOfEven {

    public static int solution(int n) {
        int answer = 0;

        //1부터 10까지
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(10);
    }

}
