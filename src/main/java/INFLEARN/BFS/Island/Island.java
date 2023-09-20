package INFLEARN.BFS.Island;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author hazel
 */



class Point{
    public int x,y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Island {
    //8-13. 섬나라 아일래드 - BFS



    static int[][] arr;
    static int n;

    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int answer = 0;


    public static void BFS(int x, int y) {
        Queue<Point> q= new LinkedList<>();
        q.add(new Point(x,y));

        while (!q.isEmpty()){
            Point tmp =  q.poll();
            for(int i =0; i < 8; i ++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 1) {
                    arr[nx][ny] = 0;
                    q.add(new Point(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //BFS 호출
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if(arr[i][j]==1){

                    answer++;
                    arr[i][j] = 0;
                    BFS(i, j);
                }
            }
        }

        System.out.println(answer);

    }
}
