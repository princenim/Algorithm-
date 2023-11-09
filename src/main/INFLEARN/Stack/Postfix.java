package main.INFLEARN.Stack;


import java.util.Scanner;
import java.util.Stack;

/**
 * @author hazel
 */
public class Postfix {
    //5-4 . 후위신 연산
    public static int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int tmpSum = 0;
        //계산할 값을 넣을 배열
        //ArrayList<Integer> tmpArr = new ArrayList<>();

        for (Character x : str.toCharArray()) {
            //숫자일 때
            if (Character.isDigit(x)) {
                // (48이나 0을 더해주면 같은 형태의 형변환이 되서 나옴)
                //char to int
                stack.push(x - 48);
            } else {
                //숫자가 아닐때
                int rt = stack.pop();
                int lt = stack.pop();

                if (x == '+') {
                    stack.push(lt + rt);
                } else if (x == '-') {
                    stack.push(lt - rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else {
                    stack.push(lt / rt);
                }

                answer = stack.get(0);

            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }

}
