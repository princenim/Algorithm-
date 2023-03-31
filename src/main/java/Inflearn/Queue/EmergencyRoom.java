package Inflearn.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author hazel
 */

class Person {
    int id; //순서
    int priority; //위험도

    //생성자
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class EmergencyRoom {
    //6-8 . 응급실 (큐)

    public static int solution(int n, int m, int[] arr) {
        int answer = 0;

        //클래스로 풀기
        Queue<Person> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(new Person(i, arr[i]));
        }


        //q가 빈값이면 끝남
        while (!q.isEmpty()) {
            Person tmp = q.poll();
            for (Person x : q) {
                //대기목록에 있는 환자의 위험도 하나라도 크면 ,
                if (x.priority > tmp.priority) {
                    q.offer(tmp);
                    tmp = null;
                    break;
                } else {
                    // else일때는 q에 아무것도 안하고 넘기기
                }
            }
            //모든 큐를 다 확인하고, tmp 가 null이 아니라는 건 tmp가 가장 크다는 것
            if (tmp != null) {
                answer++;
                if (tmp.id == m) {
                    //몇번째로 진료받는지
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));


    }
}

