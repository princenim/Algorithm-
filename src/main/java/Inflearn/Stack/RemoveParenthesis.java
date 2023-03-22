package Inflearn.Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author hazel
 */
public class RemoveParenthesis {
    //5-2 . 괄호 문자 제거

    public static String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(Character x: str.toCharArray()){
            if(x == ')'){

                //while은 해당 조건일때만 돌고, 아니면 빠져나옴!

                //pop 메소드는 stack에서 꺼내고, 원소의 값을 리턴함.
                //따라서 (AB)라면 , ) 를 꺼내고 값이 ) 이므로 false라서 while문 실행
                //마지막에 (를 꺼내고 값이 (이 이므로 true이므로 while문 빠져나감.
                while (stack.pop() != '(');
            }else {
                stack.push(x);
            }
        }


        for(int i = 0; i < stack.size(); i++){
            answer += stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}
