package main.PROGRAMMERS.LEVEL_3.여행경로;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 여행경로,https://school.programmers.co.kr/learn/courses/30/lessons/43164, DFS/BFS 반례 참고 -
 * https://school.programmers.co.kr/questions/76946
 * <p>
 * todo 꼭 위에 반례 사용해서 풀어보기!
 * 단순히 그냥 경로를 알파벳 순서대로 방문한다고 가정하고 풀면 틀림
 *
 * @author hazel
 */
public class Solution {

    static ArrayList<String> results;
    static boolean[] visited; //방문체크배열

    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        results = new ArrayList<>(); //나의 경로를 모두 배열에 추가 ex) ["ICN BBB ICN AAA", "다른 경로"]
        int cnt = 0; //현재까지 사용한 티켓 수

        dfs(cnt, "ICN", "ICN", tickets);
        Collections.sort(results);
        return results.get(0)
                      .split(" ");
    }

    public void dfs(int cnt, String present, String result, String[][] tickets) {
        if (cnt == tickets.length) { //모든 티켓을 사용했을때만 현재 경로를 result에 추가
            results.add(result);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i]
                && tickets[i][0] == present) { //현재 티켓을 사용하지 않았고, 현재 공항이 present인 경우 다음 공항으로 이동
                visited[i] = true;
                dfs(cnt + 1, tickets[i][1], result + " " + tickets[i][1], tickets);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //String[][] arr = {{"ICN", "BBB"}, {"BBB", "ICN"}, {"ICN", "AAA"}};
        String[][] arr = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"},
            {"ATL", "SFO"}};

        String[] answer = solution.solution(arr);
        System.out.println(Arrays.toString(answer));
    }
}
