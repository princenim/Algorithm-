package ETC;

import java.util.Scanner;

/**
 * @author hazel
 */
public class M2 {
    public static int solution(int[][] A) {
        int tmp = 0;

        int[] dx = {-1,-2,-2,-1,1,1,2,2,1,2,2,1,-1,-2,-2,-1};
        int[] dy = {1,1,2,2,1,2,1,2,-1,-1,-2,-2,-1,-1,-2,-2};

        int row = A.length;
        int col = A[0].length;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                //boolean flag= true;
                for (int k = 0; k < dx.length; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];
                    if (x >= 0 && x < row && y >= 0 && y < col) {
                        if (tmp < A[i][j] + A[x][y]) {
//                            System.out.println(A[i][j]);
//                            System.out.println(A[x][y]);
                            tmp = A[i][j] + A[x][y];
                        }

                    }
                }
            }
        }


        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int jn = sc.nextInt();

        int[][] arr = new int[in][jn];

        for (int i = 0; i < in; i++) {
            for (int j = 0; j < jn; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr));


    }
}
