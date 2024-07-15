package main.LEETCODE.MEDIUM.N1503;

/**
 * 1503. Last Moment Before All Ants Fall Out of a Plank ,
 * https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    //1. 부딪혔을때 서로의 방향이 바꿔서 움직이는 것처럼 보이지만
    // 개미들이 동시에 서로 바꾸어서 진행하는 것이므로 원래 방향으로 이동하는것과 동일하다.
    //  | 2 -> | <- 3  |
    //  | 3 -> | <- 2  |
    //2. 따라서 왼쪽으로 이동하는 개미의 최대 시간, 오른쪽으로 이동하는 개미 최대 시간 중 가장 큰 시간을 고른다.

    public int getLastMoment(int n, int[] left, int[] right) {
        int maxTime = 0;
        //왼쪽으로 이동하는 개미들의 최대 시간
        for (int leftTime : left) {
            maxTime = Math.max(leftTime, maxTime);
        }

        //오른쪽으로 이동하는 개미들의 최대 시간
        for (int rightTime : right) {
            maxTime = Math.max(n - rightTime, maxTime);
        }
        return maxTime;
    }
}
