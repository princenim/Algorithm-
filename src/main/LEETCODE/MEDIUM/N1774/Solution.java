package main.LEETCODE.MEDIUM.N1774;

/**
 * 1774. Closest Dessert Cost, https://leetcode.com/problems/closest-dessert-cost/description/, 백트래킹
 * 범위가 너무 작으면 백트래킹 유추 (보통 10이하) ,종료 조건 주의하기 , 그림으로 먼저 경우의 수를 파악해보기(퍼져나가는 그림)
 *
 * @author hazel
 */
public class Solution {

    int result; //target보다 작으면 가장 큰 값

    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        result = baseCosts[0];

        for (int base : baseCosts) {
            //베이스를 기본으로 시작
            find(base, toppingCosts, 0, target);
        }

        return result;
    }

    //cur은 현재 값
    public void find(int cur, int[] toppingCosts, int idx, int target) {

        //cur이 target에 더 가까울때 업데이트 즉 둘 중 하나라면 업데이트 (A || B)
        if (Math.abs(target - cur) < Math.abs(target - result) //1. cur이 target에 가까울때 참
            || (Math.abs(target - cur) == Math.abs(target - result) && cur < result)) {
            //2. 거리가 같을때는 더 작은 비용을 선택함
            result = cur;
        }

        if (idx == toppingCosts.length) {
            return;
        }

        // 3가지 경우를 다 살펴봄 최대 2개이므로 0개, 1개, 2개를 추가할떄
        find(cur, toppingCosts, idx + 1, target); //0개를 추가할떄
        find(cur + toppingCosts[idx], toppingCosts, idx + 1, target); //1를 추가할때
        find(cur + toppingCosts[idx] * 2, toppingCosts, idx + 1, target); //2를 추가할때
    }
}
