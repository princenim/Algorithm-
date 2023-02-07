package programmers.Level_0;

/**
 * @author hazel
 */
public class OrderedPair {

    //순서쌍의 개수
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                answer ++;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        solution(solution(100));
    }
}
