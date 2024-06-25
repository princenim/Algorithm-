package main.SOFTEER.LEVEL_3.성적평균;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 성적 평균, https://softeer.ai/practice/6294, 구현
 *
 * @author hazel
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine()
                        .split(" ");
        int n = Integer.parseInt(nm[0]); //4
        int m = Integer.parseInt(nm[1]); //5

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //System.out.println(Arrays.toString(arr));

        for (int i = 0; i < m; i++) {
            double sum = 0;
            String[] range = br.readLine()
                               .split(" ");
            int from = Integer.parseInt(range[0]);
            int to = Integer.parseInt(range[1]);
            int cnt = to - from + 1;
            for (int j = 0; j < cnt; j++) {
                sum += arr[from - 1];
                from++;
            }

            double answer = sum / cnt;
            System.out.println(String.format("%.2f", answer)); //소수점 세번째 자리에서 반올림해서 출력
        }
    }
}
