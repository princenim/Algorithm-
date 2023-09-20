package INFLEARN.Sorting;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class LeastRecentlyUsed1{

    // 6-4 . Least Recently Used - 풀이 1 (시도)

    public static ArrayList<Integer> solution(int s, int n, int[] arr) {
        //기본 세팅
        ArrayList<Integer> cache = new ArrayList<>();
        for (int i = 0; i < s; i++) {
            cache.add(0);
        }
        //System.out.println(cache);


        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;

            for (int j = 0; j < cache.size(); j++) {
                //1,해당 배열이 존재할때
                if (cache.get(j) == arr[i]) {

                    //뒤로 밀기
                    for (int k = j - 1; k >= 0; k--) {
                        cache.set(k + 1, cache.get(k));
                    }
                    cache.set(0, arr[j]);
                    flag = false;
                }
            }

            //flag로 판별
            if (flag) {
                //2. 해당 배열에 존재하지 않을때
                for (int k = s - 2; k >= 0; k--) {
                    cache.set(k + 1, cache.get(k));
                }
                cache.set(0, arr[i]);
            }
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
        for (int x : solution(s, n, arr)) {
            System.out.print(x + " ");
        }

    }
}
