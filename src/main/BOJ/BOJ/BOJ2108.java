package main.BOJ.BOJ;

import java.util.*;

/**
 * 통계학
 * @author hazel
 */
public class BOJ2108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
            arr[i] = num;

        }
        //정렬
        Arrays.sort(arr);

        //산술평균
        //System.out.println((double) sum / arr.length);
        //소수점 첫번째 자리 반올림
        int avg = (int) Math.round((double) sum / arr.length);
        System.out.println(avg);

        //중앙값
        System.out.println(arr[n / 2]);
        //최빈값
        System.out.println(mode(arr, n));
        //범위
        System.out.println(arr[n - 1] - arr[0]);

    }

    //최빈값
    public static int mode(int[] arr, int n) {
        Map<Integer, Integer> mp = new HashMap<>();

        if (n == 1) { //값이 하나면 바로 리턴
            return arr[0];
        }
        //map에 추가
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        //System.out.println(mp.toString());

        //value중 가장 큰 값
        int maxValue = Collections.max(mp.values());
        //System.out.println(maxValue);

        ArrayList<Integer> arrayList = new ArrayList<>();
        //value의 가장 많이 나온 값
        for (Map.Entry<Integer, Integer> m : mp.entrySet()) {
            if (m.getValue() == maxValue) { //같으면 모두 배열에 넣기
                arrayList.add(m.getKey());
            }
        }
        Collections.sort(arrayList);//오름차순 정렬

        // 가장 많이 나온 값이 여러개일 때 두번째로 작은 값
        if (arrayList.size() > 1)
            return arrayList.get(1);
        else // 가장 많이 나온 값이 하나일떄
            return arrayList.get(0);
    }

}
