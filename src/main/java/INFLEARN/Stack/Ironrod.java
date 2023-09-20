package INFLEARN.Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author hazel
 */
public class Ironrod {
    //5.5. 쇠막대기
    public static int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                if (str.charAt(i - 1) == ')') {
                    //막대기의 끝이므로 막대기 여는 괄호도 pop
                    answer = answer + 1;
                    stack.pop();
                } else {
                //() 상황일 때 즉 -> 레이저
                    stack.pop();
                    answer += stack.size();
                }


            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
