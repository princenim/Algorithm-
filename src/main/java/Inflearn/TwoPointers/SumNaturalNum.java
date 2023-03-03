package Inflearn.TwoPointers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class SumNaturalNum {
    //3-5 . 연속된 자연수의 합
    public static int solution(int n){
        int answer = 0;
        //n을 전부다 확인 할 필요값음
        //n/2 +1이 배열의 제일 큰 값보다 커질수 없음.
        int m = n/2 +1;
        int sum =0;

        ArrayList<Integer> arr= new ArrayList<>();
        for(int i =1; i <= m; i ++){
            arr.add(i);
        }

        int lt = 0;
        for(int rt = 0; rt < m; rt ++ ) {
            sum = sum + arr.get(rt);

            while (sum > n) {
                sum = sum - arr.get(lt);
                lt++;
            }
            if (sum == n) {
                answer++;
            }
        }
        return answer;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        System.out.println(solution(input1));
    }
}
