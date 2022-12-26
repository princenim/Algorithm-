package programmers.Level_0;

/**
 * @author hazel
 */
public class Ant {

    public static int solution(int hp) {
        int cnt;

        if (hp >= 3){
            cnt = hp / 5;
            int spare = hp % 5;
            if (spare != 0) {
                if (spare > 3){
                    cnt += 1;
                    int spare2 = spare / 3;
                    cnt = spare2 + cnt;
                }else {
                    cnt +=1;
                }
            }
        }else {
            cnt = hp;
        }

        return cnt;

    }
    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
