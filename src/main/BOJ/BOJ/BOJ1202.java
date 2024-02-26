package main.BOJ.BOJ;


import java.io.*;
import java.util.*;

/**
 * 보석 도둑
 * 그리디 : 각 단계에서 지금 당장 좋은 선택을 하는 방식
 * 무게가 같을때 가격이 더 비싸야 더 보석 가격의  최대값을 얻을 수 있으므로 그리디 알고리즘이다.
 * @author hazel
 */

public class BOJ1202 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); //한줄

        int n = Integer.parseInt(st.nextToken()); //보석 수
        int k = Integer.parseInt(st.nextToken()); // 보석 가격
        long answer = 0; //가방 하나의 최대무게가 100,000,000 이므로 int가 아니라 long으로 해야한다.

        Jewelry[] jewelries = new Jewelry[n]; //보석를 담을 배열
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            jewelries[i] = new Jewelry(m, v);
        }

        Comparator<Jewelry> jewelryComparator = new Comparator<Jewelry>() {
            @Override
            public int compare(Jewelry o1, Jewelry o2) { //오버라이딩 시 객체를 비교해 음수,0,양수중의 하나를 리턴해야함.
                if (o1.mass == o2.mass) { //무게가 같으면
                    return o2.price - o1.price; //가격 오름차순
                }
                return o1.mass - o2.mass; //무게 내림차순
            }
        };

        //무게를 오름차순 정렬하되 무게가 같을 때는 가격 내림차순
        //Comparator 인터페이스을 가지고 사용자 정의 정렬을 할 수 있음.
        Arrays.sort(jewelries, jewelryComparator);
        //System.out.println(Arrays.toString(jewelries));

        //가방 오름차순
        Integer[] bag = new Integer[k];
        for (int i = 0; i < k; i++) {
            bag[i] = Integer.parseInt(br.readLine());
        }
        // 가방의 무게를 오름차순 정렬
        Arrays.sort(bag);

        //높은 숫자가 우선순위 큐 - 즉  무거운 게 가장 먼저 나옴
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());  //내림차순
        int idx = 0;
        for (int i = 0; i < bag.length; i++) { //가장 기준으로 탐색
            // 현재 가방의 무게보다 작거나 같은 보석을 모두 우선순위 큐에 넣음.
            while (idx < n) {
                if (jewelries[idx].mass <= bag[i]) {
                    q.add(jewelries[idx].price);
                    idx++;
                } else {
                    //이미 오른차순으로 정렬했기 때문에 이후로는 검사 x
                    break;
                }
            }

            // 우선순위 큐에 있는 요소를 하나 빼서 가방에 넣음.
            // 이 때, 우선순위 큐는 내림차순 정렬이 되어있으므로 가장 값이 나옴
            if (!q.isEmpty()) {
                answer += q.poll();
            }
        }
        System.out.println(answer);

    }

    static class Jewelry {
        int mass; //무게
        int price;//가격

        Jewelry(int mass, int price) { //생성자
            this.mass = mass;
            this.price = price;
        }
        public String toString() {
            return "mass :" + mass + ", " + "price :" + price;
        }
    }
}




