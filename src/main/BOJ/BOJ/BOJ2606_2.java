package main.BOJ.BOJ;

import java.util.Scanner;

/**
 * 바이러스, https://www.acmicpc.net/problem/2606, 유니온파인드(그래프)
 *
 * @author hazel
 */
public class BOJ2606_2 {

    static int[] parent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //7
        int m = sc.nextInt(); //6
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) { //1부터 7까지
            parent[i] = i;
        }

        for (int i = 1; i <= m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            union(x, y);
        }

        //System.out.println(Arrays.toString(parent));

        int ans = 0;
        //1번 컴퓨터가 걸린 바이러스의 개수를 체크해야하므로 2번부터 시작
        for (int i = 2; i <= n; i++) {
            if (find(i) == find(1)) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    //매개변수로 받은 원소 a의 부모 노드를 찾는 함수
    public static int find(int a) {
        if (parent[a] == a) { //a의 부모노드가 a라면 그대로 리턴
            return a;
        } else { //아니라면 부모 노드를 찾음 -> 경로압축
            return parent[a] = find(parent[a]); //
        }
    }

    public static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a != b) {
            parent[b] = a;
        }
    }
}
