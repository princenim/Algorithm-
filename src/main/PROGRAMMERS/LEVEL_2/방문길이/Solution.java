package main.PROGRAMMERS.LEVEL_2.방문길이;

import java.util.HashSet;

/**
 * 방문 길이, https://school.programmers.co.kr/learn/courses/30/lessons/49994, 구현
 *
 * @author hazel
 */
public class Solution {

    //1. string을 돌면서 좌표가 아닌 경로(x,y-> x+1,y)를 set에 추가
    //(00 -> 01, 01 -> 00은 같은 경로로 취급한다. 예를들어 UDU는 1이다. )
    //이때 좌표를 string으로 저장하고 범위를 체크하기 위해 5,-5를 벗어날 경우 건너뛴다.
    public int solution(String dirs) {
        int x = 0; //초기값
        int y = 0;
        int nextX = 0;
        int nextY = 0;

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < dirs.length(); i++) {

            if (dirs.charAt(i) == 'U') {
                nextY = y + 1;
            } else if (dirs.charAt(i) == 'L') {
                nextX = x - 1;
            } else if (dirs.charAt(i) == 'R') {
                nextX = x + 1;
            } else {
                nextY = y - 1;
            }

            //범위를 벗어나면 이동을 하지 않음.
            if (nextX < -5 || nextX > 5 || nextY < -5 || nextY > 5) {
                nextX = x; //따라서 이동하지 않았을때 값을 업데이트 시키지 않도록 함!
                nextY = y;
                continue;
            }

            //2개의 경로를 다 저장해야함.
            System.out.println(nextX + " " + nextY);
            set.add(x + " " + y + " " + nextX + " " + nextY);
            set.add(nextX + " " + nextY + " " + x + " " + y);
            x = nextX;
            y = nextY;
        }
        //System.out.println(set);
        return set.size() / 2;
    }
}
