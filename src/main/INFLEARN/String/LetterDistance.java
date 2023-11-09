package main.INFLEARN.String;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class LetterDistance {
    //1-10. 가장 짧은 문자거리
    public static ArrayList<Integer> solution(String str1, char str2) {
        ArrayList<Integer> arr = new ArrayList<>();

        char[] strArr = str1.toCharArray();

        //임시 tmp으로 일단 갈게
        int tmp = 1000;
        //왼에서 오른쪽으로
        for (int i = 0; i < str1.length(); i++) {
            if (strArr[i] == str2) {
                tmp = 0;
            }
            arr.add(tmp);
            tmp++;
        }

        //다시 초기화
        tmp = 1000;
        for (int i = str1.length() - 1; i > -1; i--) {
            if (strArr[i] == str2) {
                tmp = 0;
            }

            // 크기 비교 방법 1
//            if (arr.get(i) > tmp) {
//                arr.set(i, tmp);
//            }

            //math로 둘중에 작은 값 가져올 수 있음
            arr.set(i, Math.min(arr.get(i), tmp));
            tmp++;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        char str2 = in.next().charAt(0);

        for (int x : solution(str1, str2)) {
            System.out.print(x + " ");
        }
    }
}
