package main.PROGRAMMERS.LEVEL_0;

import java.util.Objects;

/**
 * @author hazel
 */
public class RemoveVowel {

    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        int cnt = 0;
        String[] arr1 = my_string.split("");
        //[n, i, c, e,  , t, o,  , m, e, e, t,  , y, o, u] = i
        String[] arr2 = {"a", "e", "i","o", "u"};  //j

        for(int i =0; i < arr1.length; i ++){
            for(int j = 0;  j <arr2.length; j++){
                if(!Objects.equals(arr1[i], arr2[j])){
                    cnt +=1;
                    if(cnt == 5){
                        answer.append(arr1[i]);
                        cnt =0;
                    }
                }
            }
        }
        return answer.toString();
    }


    public static void main(String[] args) {
        System.out.println(solution("nice to meet you"));

    }
}
