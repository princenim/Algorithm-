package main.LEETCODE.MEDIUM.N1535;

import java.util.LinkedList;

/**
 * @author hazel
 */
public class IncorrectSolution {
    /*
        [시간 초과 코드] -> [1,11,22,33,44,55,66,77,88,99], 1000000000
        제약조건을 보면 k가 10^9이므로 그 비교를 위해서 그 이상을 비교해야하므로 시간초과가가 남
        연산 횟수가 1억이상이면 시간초과 발생
     */

    //1. while 계속 돌면서 arr[0], arr[1]를 확인
    //2. 더 높은 숫자를 winner에 삽입, 그리고 cnt++
    //3.  단 winner가 같을때 삽입 x, cnt++;
    //4. cnt가 k가 되면 break;
    public int getWinner(int[] arr, int k) {
        LinkedList<Integer> newArr = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            newArr.add(arr[i]);
        }

        int cnt = 0;
        int winner = 0;

        while (true) {
            if (newArr.get(0) > newArr.get(1)) {
                newArr.offerLast(newArr.get(1));//넣고
                newArr.remove(1); //삭제
                winner = newArr.get(0);
                if (winner == newArr.get(0)) {
                    cnt += 1;
                } else {
                    cnt = 1;
                }

            } else {
                newArr.offerLast(newArr.get(0));//넣고
                newArr.remove(0); //삭제

                winner = newArr.get(1);
                if (winner == newArr.get(1)) {
                    cnt += 1;
                } else {
                    cnt = 1;
                }
            }

            if (cnt == k) {
                break;
            }
        }
        return winner;
    }
}
