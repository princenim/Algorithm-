package main.LEETCODE.MEDIUM.N1442;

import java.util.Arrays;

/**
 * 1442. Count Triplets That Can Form Two Arrays of Equal XOR,
 * https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/description/
 * <p>
 *
 * @author hazel
 */
public class Solution {
    //todo 재연님 도움 요청하기

    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] prefixXor = new int[n + 1];

        // Prefix XOR 계산
        for (int i = 0; i < n; i++) {
            prefixXor[i + 1] = prefixXor[i] ^ arr[i];
            System.out.println(Arrays.toString(prefixXor));
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (prefixXor[i] == prefixXor[k + 1]) {
                    count += (k - i);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2, 3, 1, 6, 7};
        solution.countTriplets(arr);
    }
}
