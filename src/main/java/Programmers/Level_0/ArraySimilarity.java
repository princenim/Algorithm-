package Programmers.Level_0;

import java.util.Objects;

/**
 * @author hazel
 */
public class ArraySimilarity {

    public static  int solution(String[] s1, String[] s2) {
        int answer = 0;

        for(int i =0; i < s1.length; i ++){
            for(int j = 0; j < s2.length; j ++){
                if (Objects.equals(s1[i], s2[j])){
                    answer +=1;
                    break;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c"};
        String[] arr2= {"com", "b", "d", "p", "c"};
        System.out.println(solution(arr1, arr2));


    }
}
