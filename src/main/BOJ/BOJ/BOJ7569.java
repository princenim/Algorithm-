package main.BOJ.BOJ;


import java.io.IOException;
import java.util.*;

/**
 * 토마토
 * 최소 며칠이 걸리는지를 찾아야하므로 BFS
 * @author hazel
 */
public class BOJ7569 {
    static int[][][] tomato; //토마토
    static int M, N, H;

    static int[] dx = {0, -1, 0, 1, 0, 0}; //좌부터 시계방향, 위 아래
    static int[] dy = {-1, 0, 1, 0, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    static Queue<Location> redTomato = new LinkedList<>(); //큐
    static int cnt = 0;
    static int days = 0;


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        M = sc.nextInt(); //가로 칸의 수 - 열
        N = sc.nextInt(); //세로 칸의 수 - 행
        H = sc.nextInt(); //면

        //3차원 배열- 면, 행 열 !! 초기화
        tomato = new int[H][N][M];

        for (int z = 0; z < H; z++) { //면
            for (int x = 0; x < N; x++) { //행
                for (int y = 0; y < M; y++) {//열
                    tomato[z][x][y] = sc.nextInt();
                    if (tomato[z][x][y] == 0) //익지 않은 토마토
                        cnt++;
                    else if (tomato[z][x][y] == 1) //토마토가 익었으면 큐에 위치를 추가
                        redTomato.add(new Location(z, x, y));
                }
            }
        }

        System.out.println("=====================");
        System.out.println(Arrays.deepToString(tomato)); //토마토
        System.out.println(cnt); //-1의 개수
        System.out.println("=====================");


        //큐를 하나씩 꺼내면서 검사
        while (!redTomato.isEmpty() && cnt > 0) { //큐가 안 비어있고, cnt가 0보다 클때
            int size = redTomato.size();
            for (int i = 0; i < size; i++) {
                Location current = redTomato.remove(); //큐를 하나 빼서 하나씩 확인
                int x = current.x;
                int y = current.y;
                int z = current.z;

                for (int j = 0; j < 6; j++) {//상하좌우 위아래
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    int nz = z + dz[j];

                    //벽에 부딪히거나 범위를 벗어나는 좌표는 pass
                    if (nx < 0 || ny < 0 || nz < 0 || nx >= M || ny >= N || nz >= H) {
                        continue;
                    }
                    if (tomato[nz][ny][nx] != 0) { //덜익은 토마토가 아니면
                        continue;
                    }
                    //덜익은 토마토라면
                    tomato[nz][ny][nx] = 1;// 0 -> 1 즉 익은 토마토로 변경
                    cnt--; //덜 익은 토마토 개수 감소
                    redTomato.add(new Location(nz, ny, nx)); //새롭게 익은 토마토 위치를 큐에 저장
                }
            }
            days++; //날짜++
        }

        //System.out.println(cnt);
        if (cnt == 0) { //토마토가 다 익었으면
            System.out.println(days);
        } else {
            System.out.println(-1); //익지 않은 토마토가 존재한다면
        }
    }
}

class Location { //익은 토마토의 위치정보를 저장
    int z;
    int y;
    int x;

    Location(int z, int y, int x) {
        this.z = z;
        this.y = y;
        this.x = x;
    }
}
