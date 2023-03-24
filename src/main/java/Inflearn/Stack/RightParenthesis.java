package Inflearn.Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author hazel
 */
public class RightParenthesis {

    //5-1 올바른 괄호

    public static String solution(String str) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                if(stack.isEmpty()){
                    return "NO";
                }else {
                    stack.pop();
                }
            }
        }

        //여는 괄호가 더 많을 떄
        if(!stack.isEmpty()){
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

}
