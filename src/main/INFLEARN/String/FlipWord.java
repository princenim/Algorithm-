package main.INFLEARN.String;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author hazel
 */
public class FlipWord {
    //1-4 .단어 뒤집기

    //풀이1 stringbuilder 사용
//    public static ArrayList<String> solution(ArrayList<String> arr) {
//        ArrayList<String> answer = new ArrayList<>();
//
//        for(String x : arr){
//                StringBuilder sb = new StringBuilder(x);
//                String reversedStr = sb.reverse().toString();
//                answer.add(reversedStr);
//        }
//        return answer;
//    }



    //풀이2
    public static ArrayList<String> solution(ArrayList<String> arr) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : arr){
            char[] charArr = x.toCharArray();
            int firstIdx = 0;
            int lastIdx = x.length()-1;

            //처음과 끝을 서로 교환하기
            while(firstIdx < lastIdx){
                char tmp = charArr[lastIdx];
                charArr[lastIdx] = charArr[firstIdx];
                charArr[firstIdx] = tmp;
                firstIdx ++;
                lastIdx --;
            }
            //answer.add(Arrays.toString(charArr));
            //valueOf : char[] to string
            answer.add(String.valueOf(charArr));
        }

        //배열 리턴
        return answer;
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        //받을떄 배열로
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < n; i ++){
            arr.add(kb.next());
        }
        for(String x : solution(arr)){
            //하나씩 출력
            System.out.println(x);
        }

    }
}
