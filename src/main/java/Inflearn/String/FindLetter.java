package Inflearn.String;

import java.util.Scanner;

/**
 * @author hazel
 */
public class FindLetter {

    //1-1. 문자 찾기

    public int solution(String str, char t){
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        //for
//        for (int i = 0; i < str.length(); i ++){
//            if(str.charAt(i) == t) {
//                answer++;
//            }
//        }

        //for-each :배열 또는 collecion, string은 불가능
        for(char x : str.toCharArray()){
            if(x == t) {
                answer ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FindLetter T = new FindLetter();
        Scanner kb =new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(T.solution(str, c));

    }



}

