package Programmers.Level_0;

public class Game {
    public static int solution(int order) {
        int answer = 0;
        //int to String
        String strOrder = String.valueOf(order);

        for (int i = 0; i < strOrder.length(); i++) {
            if (strOrder.charAt(i) != '0') {
                if (strOrder.charAt(i) % 3 == 0) {
                    answer += 1;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(1000000));

    }
}
