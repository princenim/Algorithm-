package main.PROGRAMMERS.LEVEL_3.단어변환;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * 단어변환,https://school.programmers.co.kr/learn/courses/30/lessons/43163, BFS/DFS, BFS로 풀이
 *
 * @author hazel
 */
public class Solution {

    boolean[] visited; //방문 체크 배열
    static int answer = 0;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        answer = bfs(begin, target, words);
        return answer;
    }

    public int bfs(String begin, String target, String[] words) {

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(begin, 0));

        while (!q.isEmpty()) {
            Node current = q.poll();
            if (Objects.equals(current.word, target)) {
                return current.level;
            }

            for (int i = 0; i < words.length; i++) {
                if (!visited[i]) {
                    boolean check = check(current.word, words[i]);
                    if (check) {
                        q.add(new Node(words[i], current.level + 1));
                        visited[i] = true;
                    }
                }
            }
        }

        return 0;
    }

    //단어의 한 알파벳만 다른지 확인
    public boolean check(String word1, String word2) {
        int cnt = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                cnt++;
            }
        }

        return cnt == 1;//1일때 true, 나머지 false
    }

    static class Node {

        String word;
        int level;

        Node(String word, int level) {
            this.word = word;
            this.level = level;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        int answer = solution.solution(begin, target, words);
        System.out.println(answer);
    }
}




