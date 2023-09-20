package INFLEARN.Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class Fibonacci {
    //2-4 .피보나치 수열
    public static ArrayList<Integer> solution(int n){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(1);
        for(int i =2; i < n; i ++){
            arr.add(arr.get(i-2) + arr.get(i-1));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        //System.out.println(solution(n));
        for(int x : solution(n)){
            System.out.print(x + " ");
        }
    }
}
