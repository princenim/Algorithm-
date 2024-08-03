package main.LEETCODE.MEDIUM.N238;

/**
 * 238. Product of Array Except Self ,
 * https://leetcode.com/problems/product-of-array-except-self/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    //1. nums 배열을 왼쪽 뱡향으로 한번, 오른쪽 방향으로 한번 누적 곱을 구한다.
    //2. nums 배열을 돌면서 각각 인덱스-1, 인덱스+1의 의 값을 구해서 곱해서 배열을 업데이트한다.
    //  2-1. 인덱스를 구할때 0보다 작거나 길이-1보다 클때는 계산하지 않도록 한다.
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];

        arr1[0] = nums[0];
        for (int i = 1; i < len; i++) {
            arr1[i] = arr1[i - 1] * nums[i];
        }

        arr2[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            arr2[i] = arr2[i + 1] * nums[i];
        }

        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            int idx1 = i - 1;
            int idx2 = i + 1;

            if (idx1 >= 0) {
                answer[i] = arr1[idx1];
            } else {
                answer[i] = 1;
            }
            if (idx2 < len) {
                answer[i] *= arr2[idx2];
            }
        }
        return answer;
    }
}
