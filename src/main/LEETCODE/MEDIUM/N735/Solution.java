package main.LEETCODE.MEDIUM.N735;

import java.util.Arrays;
import java.util.Stack;

/**
 * 735. Asteroid Collision,https://leetcode.com/problems/asteroid-collision/description/, 구현(Stack)
 * 다시풀기
 *
 * @author hazel
 */
public class Solution {

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            //+,- 조합일때만 충돌함 다른 조건은 충돌X
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (Math.abs(asteroid) == stack.peek()) {
                    stack.pop();
                    asteroid = 0;
                } else if (Math.abs(asteroid) > stack.peek()) {
                    stack.pop();
                } else {
                    asteroid = 0; //0으로 바꾸는 이유는 stack에 추가 X
                }
            }
            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }

        int[] arr = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            arr[i] = stack.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {5, 10, -5};
        int[] answer = solution.asteroidCollision(arr);
        System.out.println(Arrays.toString(answer));
    }
}


