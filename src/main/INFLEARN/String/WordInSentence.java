package main.INFLEARN.String;

import java.util.Scanner;

/**
 * @author hazel
 */
public class WordInSentence {
    //1-3
    //풀이 1
//    public static String solution(String str) {
//        String answer = "";
//        int len = 0;
//
//        String[] strArr = str.split(" ");
//        for (String x : strArr) {
//            //기존길이보다 더 길때
//            //최대값 구하는 알고리즘
//            if ( x.length() >len ) {
//                len = x.length();
//                answer = x;
//            }
//        }
//
//        return answer;
//    }

    //풀이2 - indexOf 랑 subString 써보기
    public static String solution(String str) {
        String answer = "";
        //pos는 문자와 문자사이의 공백의 인덱스 위치이름
        int m = 0, pos;


        //pos가 -1이 아닐때 while문이 작동
        //indexOf에서 해당 인덱스를 찾을 수 없을때 -1리턴함
        while ((pos = str.indexOf(" ")) != -1) {

            //System.out.println(pos);
            //문자부터 빈 공백전까지
            String temp = str.substring(0, pos);
            int len = temp.length();
            if (len > m) {
                m = len;
                answer = temp;
            }
            //길이 체크한 단어 잘라내기
            str = str.substring(pos +1);
        }

        if(str.length() > m ){
            answer = str;
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        System.out.println(solution(inputStr));
    }

}
