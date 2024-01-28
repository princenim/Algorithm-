package main.BOJ.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        //System.out.println(str);

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};


        for (int i = 0; i < arr.length; i++) {
            //System.out.println(i);
            if (str.contains(arr[i])) {

                str = str.replace(arr[i], "1"); //해당 문자열이 존재시 1로 수정, 1로 수정하는 이유는 그냥 중복 문자를 방지하기 위해서!
            }
        }
        System.out.println(str.length());
    }

}
