package main.TEST.BZV.B1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 슬라이딩 윈도우
 *
 * @author hazel
 */
class Solution {
    /*
    다음과 같이 주어질때 최대 k개의 연속된 배열의 합 중 최대합을 구하라
    n = 6, arr[-3,4,3,-2,2,5], k = 4

    제약조건
    1. 1<= n <= 2 * 10^5
    2. -10^9 <= pnl[i] <= 10^9
    3. 1 <= k <= n

     */

    public static long getMaxProfit(List<Integer> pnl, int k) {
        int n = pnl.size();
        long maxSum = Long.MIN_VALUE;

        //각 길이 별로 슬라이딩 윈도우 수행
        for (int length = 1; length <= k; length++) {
            long windowSum = 0;
            //초기 윈도우 합 계산
            for (int i = 0; i < length; i++) {
                windowSum += pnl.get(i);
            }
            maxSum = Math.max(maxSum, windowSum);

            //슬라이딩 윈도우 수행
            for (int i = length; i < n; i++) {
                windowSum = windowSum - pnl.get(i - length) + pnl.get(i);
                maxSum = Math.max(maxSum, windowSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        //일반 배열을 arraylist로 변환
        ArrayList<Integer> pnl = new ArrayList<>(Arrays.asList(-3, 4, 3, -2, 2, 5));

        long maxProfit = getMaxProfit(pnl, 4);
        System.out.println(maxProfit);
    }
}

