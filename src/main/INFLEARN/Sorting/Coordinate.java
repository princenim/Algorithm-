package main.INFLEARN.Sorting;

import java.util.*;

/**
 * @author hazel
 */


//좌표 클래스
class Point implements Comparable<Point> {

    public int x;
    public int y;

    //생성자
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //상속받아서 정렬할 기준을 만들어야함
    //객체를 정렬하기 위해 Comparable 인터페이스의 compartTo 메서드를 구현해야함.
    @Override
    public int compareTo(Point o) {

        //객체의 정렬기준
        if (this.x == o.x) {
            //같으면 y기준으로 정렬

            //this -> o 으로 순서를 고정으로 음수값이 리턴되도록 하기
            //내림차순으로 정렬할땐 this - o, 오름차순으로 정렬할때는 o -this
            return this.y - o.y;
        } else {
            //다르니까 x기준으로 정렬
            return this.x - o.x;
        }
    }
}

public class Coordinate {
    //6-7. 좌표 정렬
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>(); //arr는 Point(좌표)의 묶음
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x, y));
        }
        //여기까지가 입력

        //내가 만든 정렬 기준에 의해 정렬됨
        //즉 Comparable 인터페이스를 구현한 point 객체 리스트가 인자로 넘어가서 정렬됨
        //Comparable 인터페이스, comparteTo(), Collections.sort가 한 세트라고 생각하기
        Collections.sort(arr);

        for (Point o : arr) {
            System.out.println(o.x + " " + o.y);
        }

    }
}
