package main.PROGRAMMERS.LEVEL_0;

public class Pizza {

    public  static int solution(int slice, int n) {
        int answer = 0;
        answer=  n / slice;
        if (n % slice != 0){
            answer +=1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(4, 12));
    }
}
