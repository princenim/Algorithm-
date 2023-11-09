package main.INFLEARN.Practice.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author hazel
 */
public class FindingCalf {

    int[] arr = {1, -1, 5};
    int[] ch = new int[10001];

    public int BFS(int n, int e) {
        int level = 0;
        Queue<Integer> q = new LinkedList<>();
        ch[n] = n;
        q.add(n);

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int num = q.poll();
                if (num == e) {
                    return level;
                }
                for (int j = 0; j < 3; j++) {
                    int cnum = num + arr[j];
                    if (ch[cnum] == 0) {
                        q.add(cnum);
                    }
                }
            }
            level++;
        }


        return level;
    }

    public static void main(String[] args) {
        FindingCalf t = new FindingCalf();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();


        //체크배열에 미리 넣어야함

        System.out.println(t.BFS(n, e));


    }
}
