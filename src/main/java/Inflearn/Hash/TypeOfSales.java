package Inflearn.Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author hazel
 */
public class TypeOfSales {
    private static ArrayList<Integer> solution(int n1, int n2, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        //먼저 n2-1만큼 세팅 -> 밑의 for문에서 바로 하나 넣어줄거라서
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n2-1 ; i ++){
            map.put(arr[i], map.getOrDefault(arr[i],0) +1);
        }

        // 투포인터와 슬라이딩 윈도우로 밀기
        int lt = 0;
        for(int rt = n2-1; rt < n1; rt++){
            //넣고, 카운트 세고, lt 빼고 반복
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) +1);
            answer.add(map.size());

            map.put(arr[lt], map.get(arr[lt])-1);
            if(map.get(arr[lt]) ==0){
                map.remove(arr[lt]);
            }
            lt++;
        }


        return answer;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = in.nextInt();
        }

        for(int x :solution(n1, n2, arr)){
            System.out.print(x + " ");
        }


    }
}
