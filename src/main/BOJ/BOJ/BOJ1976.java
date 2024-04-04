package main.BOJ.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

/**
 * 여행가자 ,https://www.acmicpc.net/problem/1976 , 유니온파인드
 *
 * @author hazel
 */
public class BOJ1976 {

    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st;

        parent = new int[n + 1]; //4
        for (int i = 1; i <= n; i++) {
            parent[i] = i; //초기화 잊지말기
        }

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                int value = Integer.parseInt(st.nextToken());
                if (value == 1) {
                    union(i, j);
                }
            }
        }
        //System.out.println(Arrays.toString(parent));
        //[0,1,1,1]

        st = new StringTokenizer(br.readLine());
        int start = find(Integer.parseInt(st.nextToken()));
        for (int i = 1; i < m; i++) {
            int now = Integer.parseInt(st.nextToken());
            if (start != find(now)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x < y) { //번호가 큰 노드가 작은 노드를 가리키도록
            parent[y] = x;
        } else {
            parent[x] = y;
        }
    }

    public static int find(int x) { //x의 부모 노드를 찾기
        if (parent[x] == x) { //x의 부모노드가 x라면 그대로 리턴
            return x;
        } else { //아니라면 부모 노드를 찾음 -> 경로압축
            return parent[x] = find(parent[x]);
        }
    }
}
