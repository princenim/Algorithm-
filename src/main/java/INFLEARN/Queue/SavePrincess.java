package INFLEARN.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author hazel
 */
public class SavePrincess {

    //6-6. 공주구하기
    //큐 - FIFO
    public static int solution(int n, int k) {
        int answer = 0;

        //자바에서 큐는 linkedlist를 활용해 생성해야 한다.
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            //offer - 값 넣어주기
            q.offer(i);
        }

        //큐가 비어있으면 멈춤
        while (!q.isEmpty()) {
            for (int i = 1; i < k; i++) {
                //poll - 값을 꺼내고 리턴받아 다시 넣음
                q.offer(q.poll());
            }
            //해당 숫자 꺼내기
            q.poll();

            //하나 남아있을 때 꺼내기
            if (q.size() == 1) {
                answer = q.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(n, k));

    }
}
