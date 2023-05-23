package Inflearn.BFS.Maze;

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

public class Maze {
    //8 -11. 미로의 최단거리 통로 (BFS)
    //todo 다시 풀기

    static int[][] arr;
    //거리 저장할 배열
    static int[][] dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void BFS(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        //먼저 하나 넣기
        q.offer(new Point(x, y));
        //출발점 체크
        arr[x][y] = 1;

        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y = dy[i];

                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && arr[nx][ny] == 0) {

                    arr[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[8][8];
        dis = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                arr[i][j] = sc.nextInt();
            }

        }


        BFS(1, 1);

//        System.out.println(Arrays.toString(dis[0]));
//        System.out.println(Arrays.toString(dis[1]));
//        System.out.println(Arrays.toString(dis[2]));
        if(dis[7][7] == 0){
            System.out.println(-1);
        }else {
           System.out.println(dis[7][7]);
        }


    }
}
