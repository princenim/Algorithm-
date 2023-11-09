package main.INFLEARN.Sorting;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hazel
 */
public class BinarySearch {
    //6-8. 이분검색 - 검색할 번위를 반으로 줄여가며 찾는 방법
    //단, 정렬되어 있는 데이터에서만 사용할 수 있다.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));

    }

    //이분검색
    private static int solution(int n, int m, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);

        int lt = 0;
        int rt = n - 1;

        //mid는 인덱스 번호
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            System.out.println("mid ::" + mid);
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }

            //큰쪽을 날리기
            if (arr[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }


        return answer;
    }

    //순차검색 - 모든 자료형을 다 검색함 O(n)
//    private static int solution(int n, int m, int[] arr) {
//        int answer = 0;
//
//        Arrays.sort(arr);
//        //System.out.println(Arrays.toString(arr));
//
//        for(int i = 0; i < n;i ++){
//            if(arr[i] == m){
//                return i+1;
//            }
//        }
//
//
//        return answer;
//    }

}
