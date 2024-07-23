package main.LEETCODE.MEDIUM.N1562;

/**
 * 1562. Find Latest Group of Size M
 * https://leetcode.com/problems/find-latest-group-of-size-m/description/, 구현
 *
 * @author hazel
 */
public class Solution {
    //단순 탐색으로 구현하면 O(n^2)으로 시간초과 따라서 O(N)으로 구현해야함
    //배열에 해당 인덱스 가속한 1의 길이를 저장

    public int findLatestStep(int[] arr, int m) {
        //배열의 길이와 m의 길이가 같을때는 마지막 경우이므로 바로 리턴

        if (arr.length == m) {
            return m;
        }

        int[] lenArr = new int[arr.length + 2]; //앞뒤로 인덱스를 확인하기위해 크기 2추가
        int answer = -1;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int left = lenArr[num - 1]; //현재 위치의 왼쪽 그룹 1의 길이
            int right = lenArr[num + 1]; //현재 위치의 오른쪽 그룹 1의 길이

            // 그룹 길이 업데이트 (왼쪽 길이 + 오른쪽 길이 + 나)
            lenArr[num - left] = left + right + 1;
            lenArr[num + right] = left + right + 1;

            if (left == m || right == m) {
                answer = i;
            }
        }
        return answer;
    }
}
