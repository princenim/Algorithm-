package main.LEETCODE.EASY.N434;

/**
 * 434. Number of Segments in a String,
 * https://leetcode.com/problems/number-of-segments-in-a-string/description/, 구현
 *
 * @author hazel
 */
public class Solution {
    //1. 문자열을 공백으로 나누어서 배열로 변환
    //2. 배열을 돌면서 공백이 아닌 문자열의 개수 카운팅

    public int countSegments(String s) {

        String[] arr = s.split(" ");  //-> O(N)
        int answer = 0;
        for (int i = 0; i < arr.length; i++) { //-> O(N)
            if (!arr[i].isEmpty()) {
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.countSegments("");
        System.out.println(answer);
    }
}
