package main.BOJ.BOJ;

import java.util.*;

/**
 * @author hazel
 */
public class BOJ1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Float> arr = new ArrayList<>(); //int로 나눌경우 소수점에 의해 값이 0이 나오므로 float형으로 해야함.
        for (int i = 0; i < n; i++) {
            arr.add((float) scanner.nextInt());
        }

        Float maxNum = Collections.max(arr);

        float sum = 0;
        for (int i = 0; i < n; i++) {
            float num = (arr.get(i) / maxNum) * 100;
            arr.add(num);
            sum += num;
        }

        System.out.println(sum / n);


    }

}
