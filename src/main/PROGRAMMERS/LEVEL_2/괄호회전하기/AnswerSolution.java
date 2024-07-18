package main.PROGRAMMERS.LEVEL_2.괄호회전하기;

import java.util.HashMap;
import java.util.Stack;

/**
 * 괄호 회전하기, https://wikidocs.net/232011, 스택
 *
 * @author hazel
 */
public class AnswerSolution {
    //연속된 문자열 2개가 짝이 맞지않다면 그건 올바론 괄호 문자열이 아님 ex) [[[}

    //1. 문자열을 2배로 늘린다. (문자열을 직접 옮기지 않아도 인덱스를 활용해서 확인가능 123 -> 123123 다음과 같이 늘려서 탐색)
    //2. map에 괄호의 짝을 넣는다.
    //3. 문자열을 돌면서 만약에 여는 괄호라면 스택에 추가, 닫는 괄호라면 스택에서 값을 가져와 확인한다.
    //4. 문자열을 한바퀴 돌고 만약 올바른 괄호 문자열이라면 +=1;

    public int solution(String s) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        int answer = 0;
        int len = s.length();
        s += s;

        A:
        for (int i = 0; i < len; i++) {
            Stack<Character> stack = new Stack<>();
            for (int j = i; j < i + len; j++) {
                char value = s.charAt(j);
                if (!map.containsKey(value)) { //여는 괄호 추가
                    stack.push(value);
                } else { //닫는 괄호일때는 기존 stack을 pop해서 나온 값과 확인
                    if (stack.isEmpty() || !stack.pop()
                                                 .equals(map.get(value))) {
                        continue A;  //올바른 괄호 문자열이 아니면 바로 다음 인덱스로
                    }
                }

            }
            //올바른 괄호이면 즉 중간에 continue되지 않았고, stack이 비어있을때
            if (stack.isEmpty()) {
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        AnswerSolution answerSolution = new AnswerSolution();
        int answer = answerSolution.solution("({[]})({");
    }
}
