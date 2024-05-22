package main.PROGRAMMERS.LEVEL_2.타켓넘버;

/**
 * 타켓 넘버,https://school.programmers.co.kr/learn/courses/30/lessons/43165, DFS/BFS
 *
 * @author hazel
 */
public class Solution {

    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }

    public void dfs(int[] numbers, int target, int depth, int sum) {

        if (depth == numbers.length) { //마지막 depth에서 지나고 확인
            if (sum == target) {
                answer++;
            }
            return;
        }
        dfs(numbers, target, depth + 1, sum + numbers[depth]);
        dfs(numbers, target, depth + 1, sum - numbers[depth]);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {4, 1, 2, 1};
        int answer = solution.solution(arr, 4);
        System.out.println(answer);
    }


}
