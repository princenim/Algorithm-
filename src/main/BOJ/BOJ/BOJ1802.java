package main.BOJ.BOJ;


import java.util.Scanner;

/**
 * @author hazel
 */
public class BOJ1802 {

    /*
    접었을 때 기준으로 대칭되는 좌, 우의 값이 달랴야한다.
    1번 접었을 때 -> 0 ->001
    2번 접엇을 때  -> 0 -> 001 -> 001 0 011
    즉 접는 가운데 기준으로 얖 영이 달라야한다.
    만약 단순히 문자열의 가운데 기준으로 양옆만 비교하면 000 0 111 같은 경우는 0과 1을 기준으로 양옆이 다르지 않으므로 틀리다.
    분할정복을 통해 대칭성을 판단해야한다. 이때 재귀를 이용해서 구현했다.

 */

    static String str = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {

            str = scanner.next();
            boolean answer = recursive(0, str.length() - 1);

            if (answer) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    //재귀 함수
    public static boolean recursive(int start, int end) {
        if (start == end) { //재귀 종료 조건
            return true;
        }

        int middle = (start + end) / 2; // 7일 때 3
        for (int i = start; i < middle; i++) {//0부터 2까지
            if (str.charAt(i) == str.charAt(end - i)) {
                return false;
            }
        }
        return recursive(start, middle - 1) && recursive(middle + 1, end);
    }
}


