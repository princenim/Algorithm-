package main.BOJ.BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * 수 정렬하기3
 * @author hazel
 */

/*
    출력할때 for문으로 배열의 요소를 하나씩 System.out.println로 출력하면 시간초과가 떴는데
    그 이유는 개별적으로 콘솔에 출력하기 때문이다. 출력 작업은 I/O 작업으로 출력을 할때마다 리소스를 사용해 성능에 영향을 준다.
    하지만 StringBuilder를 사용하면 내부적으로 문자열을 버퍼에 추가하여 한번만 출력하기 때문에 성능이 더 빠르다.
 */
public class BOJ10989 {

    /**
     * 풀이1
     * Array.sort() 이용
     */
//    public static void main(String[] args) throws IOException {
//
//        //성능을 위해 Scanner가 아닌 BufferedReader 사용
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//
//        // 배열 정렬
//        Arrays.sort(arr); //내부적으로 dual-pivot quick sort 알고리즘을 사용
//        for (int num : arr) { //통과
//            sb.append(num).append('\n');
//        }
//        System.out.println(sb);
//    }

    /**
     * 풀이2
     * 카운팅 정렬
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //최대값
        int max = Integer.MIN_VALUE;
        for (int tmp : arr) {
            max = Math.max(tmp, max);
        }

        int[] cntArr = new int[max + 1];
        // 입력 배열의 각 원소 빈도수 세기
        for (int num : arr) {
            cntArr[num]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cntArr.length; i++) {
            for (int j = 0; j < cntArr[i]; j++) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);

    }

}
