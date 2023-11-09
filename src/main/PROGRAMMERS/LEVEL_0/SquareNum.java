package main.PROGRAMMERS.LEVEL_0;

/**
 * @author hazel
 */
public class SquareNum {

    //제곱수 판별하기
    public static int solution(int n) {

//        for (int i = 0; i < n; i++) {
//            int num = i * i;
//            if (num == n) {
//                return 1;
//            }
//
//        }
//        return 2;


        //제곱근 구해서 그 나눈 값이 0으로 제곱근인지 확인
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }


    }


    public static void main(String[] args) {

        System.out.println(solution(144));

    }
}
