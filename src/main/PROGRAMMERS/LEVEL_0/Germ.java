package main.PROGRAMMERS.LEVEL_0;

public class Germ {
    public static int solution(int n, int t) {
        int answer = n;

        for(int i = 0; i<t; i++){
            answer = answer * 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(7, 15));
    }

}
