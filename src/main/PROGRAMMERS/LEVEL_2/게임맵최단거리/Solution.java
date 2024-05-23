package main.PROGRAMMERS.LEVEL_2.게임맵최단거리;

import java.util.LinkedList;

/**
 * 게임 맵 최단거리,https://school.programmers.co.kr/learn/courses/30/lessons/1844, DFS/BFS, BFS
 *
 * @author hazel
 */
public class Solution {


    boolean[][] visited;
    int[] nx = {0, -1, 0, 1};
    int[] ny = {-1, 0, 1, 0};
    int row;
    int column;

    public int solution(int[][] maps) {
        row = maps.length; //행
        column = maps[0].length; //열
        visited = new boolean[row][column];

        int answer = bfs(maps);
        return answer;
    }

    public int bfs(int[][] maps) {

        LinkedList<Node> q = new LinkedList<>();
        q.add(new Node(0, 0));
        visited[0][0] = true;

        while (!q.isEmpty()) {

            Node current = q.poll();
            int x = current.x;
            int y = current.y;

            if (x == row - 1 && y == column - 1) {
                return maps[x][y];
            }

            for (int i = 0; i < 4; i++) {
                int dx = x + nx[i];
                int dy = y + ny[i];

                if (dx < 0 || dy < 0 || dx >= row || dy >= column) {
                    continue;
                }

                if (!visited[dx][dy]) { //방문하지 않았을 때
                    if (maps[dx][dy] == 1) {
                        q.add(new Node(dx, dy));
                        visited[dx][dy] = true;
                        maps[dx][dy] = maps[x][y] + 1;
                    }
                }
            }


        }

        return -1;
    }


    class Node {

        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[][] arr = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int[][] arr = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0},
            {0, 0, 0, 0, 1}};
        int answer = solution.solution(arr);
        System.out.println(answer);
    }
}

