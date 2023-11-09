package main.INFLEARN.BFS.FindingCalf;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author hazel
 */
public class FindingCalf {
    //7-8 . 송아지 찾기 (BFS, 상태 트리 탐색) -> 최단 거리 구하기

    int[] ids = {1, -1, 5};

    //이미 체크한 숫자인지 확인하기 위한 체크 배열 ,
    // 한번 확인한 숫자는 안 넣기
    int[] ch;

    //구현할 q
    Queue<Integer> q = new LinkedList<>();

    public int BFS(int s, int e) {
        ch = new int[10001];
        //1은 이미 확인했다는 의미
        ch[s] = 1;

        q.offer(s);
        //레벨
        int L = 0;

        while (!q.isEmpty()) {
            //레벨의 길이
            int len = q.size();

            for (int i = 0; i < len; i++) {
                int x = q.poll();
                //답이면 리턴
                if (x == e) {
                    return L;
                }

                for (int j = 0; j < 3; j++) {
                    //x의 자식 노드 , 만약 x가 5라면 6,4,10
                    int nx = x + ids[j];
                    if (nx >= 1 && nx <= 100000 && ch[nx] == 0) {
                        //아직 해당 숫자를 확인 하지 않았을 때,
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            L++;
        }
        return L;
    }


    public static void main(String[] args) {
        FindingCalf T = new FindingCalf();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); //현수 위치
        int e = sc.nextInt(); // 송아지 위치
        System.out.println(T.BFS(s, e));


    }
}
