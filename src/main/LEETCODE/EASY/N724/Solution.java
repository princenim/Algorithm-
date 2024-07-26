package main.LEETCODE.EASY.N724;

/**
 * 724. Find Pivot Index, https://leetcode.com/problems/find-pivot-index/description/ , 구현
 *
 * @author hazel
 */
public class Solution {
    //1.left, right 초기값을 만든다.
    //2.인덱스 1부터 인덱스 마지막까지 돌면서 left와 right의 값을 확인한다.
    //3. 두 값이 같으면 return index.  돌 때 까지 같지 않으면 -1

    public int pivotIndex(int[] nums) {
        int answer = -1;
        int left = 0;
        int right = 0;
        //인덱스가 0일때
        for (int i = 1; i < nums.length; i++) {
            right += nums[i];
        }

        if (left == right) {
            answer = 0;
            return answer;
        }

        //돌면서 확인
        for (int i = 1; i < nums.length; i++) {
            left = left + nums[i - 1];
            right = right - nums[i];

            if (left == right) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
