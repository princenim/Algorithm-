package main.BOJ;

import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = n;
        for (int i = 0; i < n; i++) {

            String str = scanner.next();
            StringBuilder checkStr = new StringBuilder();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (!checkStr.toString().contains(String.valueOf(c))) {
                    checkStr.append(c);
                } else {
                    //배열에 값이 있는데
                    if (!(str.charAt(j - 1) == c)) {
                        //이전값이랑 다르면
                        answer--;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
