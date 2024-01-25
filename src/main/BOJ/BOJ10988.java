package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        StringBuffer sb = new StringBuffer(str);
        String reverseStr = sb.reverse().toString();


        if (str.equals(reverseStr)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }


    }

}
