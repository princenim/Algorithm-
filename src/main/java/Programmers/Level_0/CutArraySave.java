package Programmers.Level_0;

import java.util.ArrayList;


/**
 * @author hazel
 */
public class CutArraySave {
    //잘라서 배열로 저장하기
    public static ArrayList<String> solution(String my_str, int n) {
        ArrayList<String> answer = new ArrayList<String>();

//        System.out.println(my_str.substring(0,n));
//        System.out.println(my_str.substring(n,n * 2));
//        System.out.println(my_str.substring(n *2));


        for (int i = 0; i < my_str.length(); i++) {
            int lastIdx = (i + 1) * n;

            if (my_str.length() > lastIdx) {
                //System.out.println(my_str.substring(i * n, lastIdx));
                answer.add(my_str.substring(i * n, lastIdx));

            } else {
                //System.out.println(my_str.substring(lastIdx - n));
                answer.add(my_str.substring(lastIdx - n));
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abc1Addfggg4556b", 6));
    }

}

