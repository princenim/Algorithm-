package programmers.Level_0;

/**
 * @author hazel
 */
public class AgeOfExoplanets {
    public static String solution(int age) {
        StringBuilder answer = new StringBuilder();

        //int to String
        String strAges= age + "";


        for(int i =0; i < strAges.length(); i++){

            //char to int 후에 아스키코드만큼 더하기
            int ascii = (int)strAges.charAt(i) + 49;
            //int to char해서 문자로 바꾸기
            char ch = (char)ascii;
            answer.append(ch);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(23));

    }


}
