package main.PROGRAMMERS.LEVEL_0;

public class Pizza2 {
    public static int solution(int n) {
        int pizzaCnt = 1;
        if (n > 7) {
            pizzaCnt = n / 7;
            if (n % 7 != 0) {
                pizzaCnt += 1;
            }
        }


        return pizzaCnt;

    }

    public static void main(String[] args) {
        System.out.println(solution(100));

    }
}
