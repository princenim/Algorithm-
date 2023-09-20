package INFLEARN.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author hazel
 */
public class Curriculum {
    //6-7. 교육과정설계

    public static String solution(String str1, String str2) {
        String answer = "YES";

        Queue<Character> q = new LinkedList<>();
        //1.먼저 필수과목을 큐에 넣기
        for (Character x : str1.toCharArray()) {
            q.offer(x);
        }

        for (Character x : str2.toCharArray()) {
            //2,x가  q안에 있는지 확인
            if (q.contains(x)) {
                //3.있을 떄 x랑 q에서 나온 값이랑 다르면 no
                if (x != q.poll()) {
                    return "NO";
                }
            }
        }

        //필수과목이 남아있을 경우
        if (!q.isEmpty()) {
            return "NO";
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(solution(str1, str2));


    }
}
