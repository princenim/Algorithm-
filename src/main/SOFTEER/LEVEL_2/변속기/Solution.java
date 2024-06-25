package main.SOFTEER.LEVEL_2.변속기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 8단 변속기, https://softeer.ai/practice/6283, 구현
 *
 * @author hazel
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] ascending = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] descending = {8, 7, 6, 5, 4, 3, 2, 1};

        String[] input = br.readLine()
                           .split(" ");
        int len = input.length;
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        if (Arrays.equals(arr, ascending)) { //두 배열의 동등성 비교
            System.out.println("ascending");
        } else if (Arrays.equals(arr, descending)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
