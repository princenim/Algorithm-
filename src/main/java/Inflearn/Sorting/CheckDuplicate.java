package Inflearn.Sorting;

import programmers.Level_0.HateEnglish;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author hazel
 */
public class CheckDuplicate {
    //6-5 . 중복 확인


    //방법1 -오름차순 정렬 후 이웃관계 비교
    //O(n log n) 이나 O(n2)으로 해쉬맵보다 성능이 떨어짐
//    private static String solution(int n, int[] arr) {
//        String answer = "D";
//
//        Arrays.sort(arr);
//        for(int i = 0; i < n-1; i ++){
//            if(arr[i] == arr[i+1]){
//                return answer;
//            }
//        }
//
//        return "U";
//    }

    //방법2- 2중 fo문
//    private static String solution(int n, int[] arr) {
//        for(int i =0;i < n-1; i++){
//            for(int j =i +1; j<n; j ++){
//                if(arr[i] == arr[j]){
//
//
//                    return "D";
//                }
//            }
//        }
//
//        return "U";
//
//    }

    //방버 3 - 해쉬맵 - O(N)으로 한번만 탐색 가능
    private static String solution(int n, int[] arr) {

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (Integer x : arr) {
            hash.put(x, hash.getOrDefault(x, 0) + 1);
            if (hash.get(x) == 2) {
                return "D";
            }
        }

        return "U";
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        System.out.println(solution(n, arr));

    }

}
