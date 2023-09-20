package PROGRAMMERS.LEVEL_0;

public class Lamb {
    public static  int solution(int n, int k) {
        int answer = 0;

        //총가격
        answer =  (n * 12000) + (k * 2000);
        //총가격 - 음료수 값
        answer -= (2000 * (n / 10));

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(64,6));
    }

}
