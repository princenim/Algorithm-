package main.LEETCODE.MEDIUM.N1441;

import java.util.ArrayList;
import java.util.List;

/**
 * 1441. Build an Array With Stack Operations,
 * https://leetcode.com/problems/build-an-array-with-stack-operations/description/, 구현
 *
 * @author hazel
 */
public class Solution {

    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> answer = new ArrayList<>();

        int index = 0; //target 배열을 추적할 인덱스
        for (int i = 1; i <= n; i++) {//1부터 n을 스택에 넣고 빼니까 target이 아닌 스트림이 기준
            //종료 조건
            if (index == target.length) {
                break;
            }

            answer.add("Push");//먼저 넣고
            if (i == target[index]) { //같으면
                index++;
            } else {//다르면
                answer.add("Pop");
            }
        }
        return answer;
    }
}
