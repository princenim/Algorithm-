package main.BOJ.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * 연결 요소의 개수 ,https://www.acmicpc.net/problem/11724 , 유니온파인드
 *
 * @author hazel
 */
public class BOJ11724_2 {

    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine()
                        .split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        parent = new int[n + 1]; //v는 n보다 작음 따라서 n+1만큼의 부모 테이블 생성
        for (int i = 1; i < parent.length; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < m; i++) {
            String[] uv = br.readLine()
                            .split(" ");

            int u = Integer.parseInt(uv[0]);
            int v = Integer.parseInt(uv[1]);

            union(u, v);
        }

        //System.out.println(Arrays.toString(parent));

        HashSet<Integer> set = new HashSet<>(); //중복 불가
        //요소의 개수 찾기
        for (int i = 1; i < parent.length; i++) {
            set.add(find(parent[i])); //부모 노드를 찾아서 넣기
        }

        System.out.println(set.size());
    }

    //두 노드를 합치는 연산
    public static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a < b) { //번호가 큰 노드가 작은 노드를 가리키도록
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }


    //부모 노드를 찾는 연산
    public static int find(int a) { //매개변수로 받은 원소 a의 부모 노드를 찾는 함수
        if (parent[a] == a) { //a의 부모노드가 a라면 그대로 리턴
            return a;
        } else { //아니라면 부모 노드를 찾음 -> 경로압축
            return parent[a] = find(parent[a]); //
        }
    }
}
