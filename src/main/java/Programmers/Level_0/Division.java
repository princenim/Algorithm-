package Programmers.Level_0;

class Division {
    public static int solution(int num1, int num2) {
        int answer = 0;

        // 실수형 계산 주의하기
        // int (정수형) 에서는 소수점 계산 불가
        answer = (int) (((float) num1 / (float) num2) * 1000);
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(3, 2));
    }
}