package main.PROGRAMMERS.LEVEL_2.소수찾기;

import java.util.HashSet;

/**
 * 소수 찾기,https://school.programmers.co.kr/learn/courses/30/lessons/42839, 완전탐색(dfs)
 *
 * @author hazel
 */
public class Solution {

    boolean[] visited;
    int n;
    HashSet<Integer> set;

    public int solution(String numbers) {
        int answer = 0;
        n = numbers.length();
        visited = new boolean[n];

        set = new HashSet<>();
        dfs(0, "", numbers);

        System.out.println(set);
        for (int tmp : set) {
            if (isPrime(tmp)) {
                answer += 1;
            }
        }
        return answer;
    }

    public void dfs(int depth, String num, String numbers) {
        if (depth == n) {
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                set.add(Integer.parseInt(num + numbers.charAt(i))); //만든 숫자를 int로 바꿔서 추가
                dfs(depth + 1, num + numbers.charAt(i), numbers);
                visited[i] = false;
            }
        }
    }

    //소수판별
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.solution("17");
        System.out.println(answer);
    }
}
