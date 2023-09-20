package Inflearn.String;

import java.util.*;

/**
 * @author hazel
 */
public class RemoveDuplicatedLetter {
    //1-6 . 중복문자제거

    //풀이 1
//    public static String solutions(String str){
//        String answer = "";
//
//        //linkedHashSet 선언 : 중복을 허용하지 않고 , 순서를 보장한다
//        //그냥 set은 순서를 보장하기 않음.
//        LinkedHashSet<Character> setChar= new LinkedHashSet<>();
//        for(char x : str.toCharArray()){
//            setChar.add(x);
//        }
//w
//        for(char x : setChar){
//            answer += x;
//
//        }
//
//        return answer;
//
//    }

    public static String solutions(String str){
        String answer = "";
        //indexOf는 해당 문자의 첫번재 인덱스를 반환, 없으면 -1 반환
        for(int i = 0; i < str.length();i++){
            //System.out.println(str.indexOf(str.charAt(i)));
            if(i == str.indexOf(str.charAt(i))){
                answer += str.charAt(i);
            }
        }
        return answer;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        System.out.println(solutions(inputStr));
    }
}
