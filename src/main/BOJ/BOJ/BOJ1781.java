package main.BOJ.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author hazel
 */


class Problem {
    int deadline;
    int num;

    Problem(int deadline, int num) {
        this.deadline = deadline;
        this.num = num;
    }


    public String toString() {
        return "deadline :" + deadline + ", " + "num :" + num;
    }
}

public class BOJ1781 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Problem[] problems = new Problem[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

            int d = Integer.parseInt(stringTokenizer.nextToken()); //데드라인
            int cnt = Integer.parseInt(stringTokenizer.nextToken()); //컵라면 수

            problems[i] = new Problem(d, cnt);
        }

        //배열 정렬 - 데드라인이 오름차순 같으면 내림차순

        Comparator<Problem> comparator = (o1, o2) -> {
            if (o1.deadline == o2.deadline) {
                return o2.num - o1.num;
            }
            return o1.deadline - o2.deadline;
        };
        //데드라인 오름차순, 만약 데드라인이 같다면 컵라면 수 내림차순
        Arrays.sort(problems, comparator);
        //System.out.println(Arrays.toString(problems));

        //우선순위 큐
        PriorityQueue<Integer> q = new PriorityQueue<>(); //오름차순
        //System.out.println(q.size()); //요소의 개수
        for (int i = 0; i < n; i++) {
            q.add(problems[i].num); //먼저 넣고 , 확인하고 , 빼기 -
            if (q.size() > problems[i].deadline) {
                q.poll();
            }
        }

        int answer = 0;
        while (!q.isEmpty()) {
            answer += q.poll();
        }
        System.out.println(answer);
    }


}



