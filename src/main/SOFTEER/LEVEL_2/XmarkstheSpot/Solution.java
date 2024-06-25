package main.SOFTEER.LEVEL_2.XmarkstheSpot;

/**
 * [한양대 HCPC 2023] X marks the Spot,https://softeer.ai/practice/7703, 구현
 *
 * @author hazel
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int index = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " "); //공백 주의
            String first = st.nextToken();
            String second = st.nextToken();
            for (int j = 0; j < first.length(); j++) {
                if (first.charAt(j) == 'x' || first.charAt(j) == 'X') {
                    index = j;
                    break;
                }
            }
            answer.append(Character.toUpperCase(second.charAt(index)));
        }

        System.out.println(answer.toString());
    }
}

