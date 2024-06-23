package main.LEETCODE.MEDIUM.N3185;

/**
 * 3185. Count Pairs That Form a Complete Day II,
 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    public long countCompleteDayPairs(int[] hours) {
        long result = 0;
        int[] cnt = new int[24]; //나머지 값이 몇번 등장하는지 기록
        for (int h : hours) {
            //h를 기준으로 pair찾는다고 생각하기

            result += cnt[(24 - h % 24) % 24]; //h 즉 현재시간의 나머지를 구하기 24-h
            // 처음에 h %24를 하는 이유는 범위가 24이기때문에 24보다 큰 수를 처리해야하기때문
            //마지막에 한번 더 나누는 이유는 결과가 h가 24일때 나머지는 0이어야함. 하지만 24%24=0으로 24-0=24로 잘못되기때문에 한번더 나머지 연산을 해서 0을 구함
            //24가 아닌 다른 숫자들은 사실 24를 넘지 않기때문에 나머지연산을 해도 영향X
            cnt[h % 24]++;
        }
        return result;
    }
    /*
    [1,23,12,12] 라고 가정
    1의 나머지는 23이므로 cnt[23] 확인 없으니까 result =0 그리고 1을 사용했으니 cnt[1] =1
    23의 나머지는 1이므로 cnt[1] 확인 1이 있느니까 result = 1 그리고 cnt[23] =1
    12의 나머지는 12이므로 cnt[12] 확인 없으니까 result =1 그리고 cnt[12] =1
    12의 나머지는 12이므로 cnt[12] 확인 1 있으니까 result =12 그리고 cnt[12] =2
    */


}
