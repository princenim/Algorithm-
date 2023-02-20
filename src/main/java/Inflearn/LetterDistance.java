package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class LetterDistance {
    //1-10. 가장 짧은 문자거리
    //어차피 해야해 집중하자

    public static ArrayList<Integer> solution(String str1, String str2) {
        ArrayList<Integer> arr = new ArrayList<>();

        char[] strArr = str1.toCharArray();

        //임시 tmp으로 일단 갈게
        int tmp = 100;
        //왼에서 오른쪽으로
        for (int i = 0; i < str1.length(); i++) {
            if (strArr[i] == 'e') {
                tmp = 0;
            }
            arr.add(tmp);
            tmp++;
        }

        tmp = 0;
        for (int i = str1.length() - 1; i > -1; i--) {
            if (strArr[i] == 'e') {
                tmp = 0;
            }
            if (arr.get(i) > tmp) {
                arr.set(i, tmp);
            }
            tmp++;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(solution(str1, String.valueOf(str2.charAt(0))));
    }
}
