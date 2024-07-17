package main.LEETCODE.MEDIUM.N1535;

/**
 * 1535. Find the Winner of an Array Game
 * https://leetcode.com/problems/find-the-winner-of-an-array-game/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    //1. 배열을 돌면서 가장 큰 값을 current에 저장 그리고 값이 업데이트될때마다 cnt =1로 다시 초기화
    // (k가 아닌 배열만큼 돌아도 되는 이유는 배열의 길이가 k보다 작을때 배열의 가장 큰 값이 답이기 때문)
    public int getWinner(int[] arr, int k) {
        int current = arr[0]; // Initialize with the first element
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (current > arr[i]) {
                count++;
            } else {
                current = arr[i];
                count = 1;
            }

            if (count == k) {
                return current;
            }
        }
        return current;
    }
}