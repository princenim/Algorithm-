package INFLEARN.Sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hazel
 */
public class MusicVideo {

    //6-9 . 뮤직비디오(결정 알고리즘)
    // 이분검색(반으로 줄여가면서 검색)을 기반으로
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

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;

        //stream 으로 가장 큰 max 값 가져오기
        int lt = Arrays.stream(arr).max().getAsInt();
        //총 합 가져오기
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            //만약에 2장으로곡 곡을 넣을 수 있다면, 3장으로도 가능하기 때문에
            if (count(arr, mid) <= m) {
                //일단 값 저장하고
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }


        return answer;
    }

    //capacity 용량으로 몇개의 dvd를 넣을 수 있을지 계산
    private static int count(int[] arr, int capacity) {
        //DVD 장수
        int cnt = 1;
        //DVD 한장에 넣는 곡들의 합
        int sum = 0;

        for (int x : arr) {
            if (sum + x > capacity) {
                //용량보다 클때는
                //새로운 DVD를 추가
                cnt++;
                //해당 x부터 sum 시작
                sum = x;
            } else {
                //용량보다 작을 때 sum을 계속 추가
                sum += x;
            }
        }
        return cnt;
    }
}
