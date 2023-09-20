package Inflearn.Sorting;

import java.util.Scanner;

/**
 * @author hazel
 */
public class LeastRecentlyUsed {
    // 6-4 . Least Recently Used - 풀이 2 (정답)

    private static int[] solution(int s, int[] arr) {
        int[] cache = new int[s];

        for (int x : arr) {
            //배열의 인덱스 저장
            int pos = -1;
            //배열 돌면서 //캐시에 이미 존재할 때 인덱스값 저장
            for (int i = 0; i < s; i++) {
                if (x == cache[i]) {
                    pos = i;
                }
            }

            //다 돌고 만약에

            //배열에 값이 없을 때(miss)
            if (pos == -1) {
                //하나씩 뒤로 밀기
                for (int i = s - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                //있을때 (hit)
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }

            //뒤로 밀때 hit와 peak의 차이점은 i 시작 시점
            cache[0] = x;
        }


        return cache;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(s,arr)) {
            System.out.print(x + " ");
        }

    }

}
