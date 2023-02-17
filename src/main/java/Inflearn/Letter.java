package Inflearn;

import java.util.Scanner;

/**
 * @author hazel
 */
public class Letter {
    //1-7 .회문 문자열 (앞에서 읽거나 뒤에서 읽어도 같은 문자여)

    //풀이 1
//    public static String solution(String str){
//        str= str.toUpperCase();
//        int lt = 0;
//        int rt = str.length() -1;
//        while (lt < rt){
//            if(str.charAt(lt)== str.charAt(rt)){
//                lt ++;
//                rt --;
//            }else {
//                return "NO";
//            }
//        }
//        return "YES";
//
//    }


//    private static  String solution(String str){
//        String answer = "YES";
//        str=str.toUpperCase();
//
//        //길이가 홀수여도 가운데는 체크하지 않아도 되기때문에 반만 체크해도 ㄱㅊ
//        for(int i = 0; i < str.length()/2;i++){
//            //문자열의 첫번째와 마지막 인덱스를 비교
//            if(str.charAt(i) != str.charAt(str.length()- 1 -i)){
//                return "NO";
//            }
//        }
//        return answer;
//    }


    //플이 3
    public static String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase();
        String tmp = new StringBuilder(str).reverse().toString();
        if (tmp.equals(str)) {
            return "YES";
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        System.out.println(solution(inputStr));
    }
}
