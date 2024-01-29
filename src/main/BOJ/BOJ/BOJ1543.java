package main.BOJ.BOJ;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ1543 {
    public static void main(String[] args) throws IOException {

        //BufferedReader 사용
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        String word = br.readLine();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); //next를 사용하면 공백단위로 잘리져서 예제 2를 입력이 불가능함.
        String word = scanner.nextLine();


        int cnt = 0;
        String text = str.replace(word, "!");
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '!') {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

}
