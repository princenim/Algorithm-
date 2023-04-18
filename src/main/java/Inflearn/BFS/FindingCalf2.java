package Inflearn.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author hazel
 */
public class FindingCalf2 {
    //7-8 . 송아지 찾기 (BFS, 상태 트리 탐색) -> 최단 거리 구하기

    public int solution(int s, int e) {

        int[] arr = {1, -1, 5};

        //체크 배열
        int[] ch = new int[10001];
        //시작하는 숫자는 이미 확인
        ch[s] = 1;

        Queue<Integer> q = new LinkedList<>();

        int level = 0;
        q.offer(s);

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                //하나 꺼내서
                int num = q.poll();
                //정답이면 바로 리턴
                if (num == e) {
                    return level;
                }

                for (int j = 0; j < 3; j++) {
                    int nx = num + arr[j];

                    //체크 배열 업데이트
                    if (nx >= 1 && nx <= 100000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        //스택에 넣고
                        q.add(nx);
                    }
                }


            }
            level++;
        }
        return level;
    }

    public static void main(String[] args) {
        FindingCalf2 FindingCalf2 = new FindingCalf2();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(FindingCalf2.solution(s, e));


    }
}
