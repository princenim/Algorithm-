package main.BOJ.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 집합의 표현,https://www.acmicpc.net/problem/1717, 유니온파인드
 *
 * @author hazel
 */
public class BOJ1717 {

    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parent = new int[n + 2];
        for (int i = 1; i <= n + 1; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int check = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (check == 0) {
                union(a, b);
            } else {
                //1일때
                if (find(a) != find(b)) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }

        }
    }

    //두 노드를 합침
    static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (y > x) {
            parent[y] = x;
        } else {
            parent[x] = y;
        }
    }

    static int find(int x) {
        if (x == parent[x]) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

}
