package Programmers.Level_0;

/**
 * @author hazel
 */
public class Plus {


    public static  int solution2(int n) {
        int answer = 0;
        //int to string
        String str = Integer.toString(n);
        System.out.println(str);
        String[] arr1 = str.split("");

        for(int i = 0; i < arr1.length; i ++ ){
            answer += Integer.parseInt(arr1[i]);

        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution2(1234));

    }
}
