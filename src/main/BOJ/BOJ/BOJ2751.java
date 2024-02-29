package main.BOJ.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 수 정렬하기 2
 * 계수정렬(counting sort)
 * @author hazel
 */
public class BOJ2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //boolean으로 하는 이유는 중복값이 없기때문에
        boolean[] cntArr = new boolean[2000001]; //범위 : -1000000 ~ 1000000

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            cntArr[num + 1000000] = true; //예를들어 num이 5라면 cntArr의 인덱스 5에 저장되는게 아니라 10000005에 저장
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cntArr.length; i++) {
            if (cntArr[i]) {
                sb.append(i - 1000000).append("\n");
            }
        }
        System.out.println(sb);
    }
}
