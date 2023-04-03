package Inflearn.Sorting;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class LeastRecentlyUsed {

    // 6-4 . Least Recently Used

    public static int solution(int s, int n, int[] arr) {
        int answer = 0;

        //기본 세팅
        ArrayList<Integer> cache = new ArrayList<>();
        for (int i = 0; i < s; i++) {
            cache.add(0);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < cache.size(); j++) {
                //1,해당 배열에 없을 때
                if (cache.get(j) != arr[i]) {
                    //1-1. 하나씩 뒤로 밀기
//                    for (int k = s - 2; k >= 0; k--) {
//
//                        //cache.add(k+1,cache.get(k));
//                    }
//                    System.out.println("=======");
//                    cache.set(0, arr[i]);
                } else {
                    //해당 배열에 존재할때

                }


            }


        }

        System.out.println(cache);
        System.out.println("==========");

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[9];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(s, n, arr));


    }

}
