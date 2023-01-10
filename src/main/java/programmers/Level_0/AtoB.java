package programmers.Level_0;

/**
 * @author hazel
 */
public class AtoB {
    public static int solution(String before, String after) {
        int answer = 0;

        //모든 요소가 같아야함.
        int j = 0;
        for(int i = before.length() -1; i >=0; i --){
            if(before.charAt(i) == after.charAt(j)){
                j++;
                answer = 1;
            }else {
                return 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("allpe","apple"));

    }

}
