package main.PROGRAMMERS.LEVEL_1.소수찾기;

/**
 * 소수 찾기, https://school.programmers.co.kr/learn/courses/30/lessons/12921, 구현
 *
 * @author hazel
 */
public class Solution {

    //소수 : 1 이상의 숫자 중에서 약수가 1과 나밖에 없는 수
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) { //하나씩 소수인지 확인
            if (isPrime(i)) {
                answer += 1;
            }
        }

        return answer;
    }

    //에라토스테네스의 체, n이 소수인지 판별
    public boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        //sqrt는 제곱근을 구함. 제곱근까지 구하는 이유는 약수가 짝의 형태로 나타나서
        //n이 16이라면 약수는 1,2,4,8,16 (1 * 16, 2* 8 , 4 *4) 따라서 1,2,4까지만 확인해도 모든 약수를 확인하는 형태
        //제곱근은 sqaure root 라고함.
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; //나눠지면 소수아님
            }
        }

        return true; //나눠지는게 없을때
    }

}
