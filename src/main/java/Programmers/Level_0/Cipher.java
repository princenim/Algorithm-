package Programmers.Level_0;

/**
 * @author hazel
 */
public class Cipher {

    public static String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();

        for(int i = 1; i <= cipher.length(); i++){
            if (i % code ==0){
                //System.out.println(cipher.charAt(i-1));
                answer.append(cipher.charAt(i-1));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));

    }
}
