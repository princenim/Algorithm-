package Inflearn.BFS.Tomato;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author hazel
 */
class Point {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Tomato {
    //8-12. 토마토 -> 최소일수 구하기 -> BFS

    static int n, m;
    static int[][] arr, dis;
    static Queue<Point> q = new LinkedList<>();
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void BFS() {
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0) {
                    //배열 1로 바꾸고
                    arr[nx][ny] = 1;
                    //큐에 추가
                    q.offer(new Point(nx, ny));
                    //최소일수를 구할 dis라는 배열에 추가
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt(); //열
        n = sc.nextInt(); //행
        int answer = 0;

        //n행 m열
        arr = new int[n][m];
        dis = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int a = sc.nextInt();
                arr[i][j] = a;
                //토마토 시작점을 위해  미리 만든 큐에 넣기
                if (a == 1) {
                    q.add(new Point(i, j));
                }
            }
        }

        BFS();

        //이제 BFS가 다 끝났을떄 검사
        //상자에 익지않은 토마도가 있으면 즉 arr에 0이 존재하면 -1리턴

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    flag = false;
                }
            }
        }


        //즉, 익지않은 토마토가 없고 익은 토마토만 존재할때는 최소일수
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j< m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);

        }
    }
}
//참고로 토마도가 모두 익어있는 상태면 arr이 다 1이라는 의미인데,  이 위,오,아래,왼을 도는 for문 조건을 만족할 수 없으니 dis배열에서 0이 출력된다.
