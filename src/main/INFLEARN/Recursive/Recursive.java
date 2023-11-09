package main.INFLEARN.Recursive;

/**
 * @author hazel
 */
public class Recursive {
    //재귀함수(스택프레임) : 자기가 자기자신을 호출하는 함수

    public static void DFS(int n){
        if(n==0){
            //함수 종료
            return;
        }else {
            //System.out.println(n); //3,2,1

            //여기까지 처리되고 이 밑으로는 스택에 들어감
            DFS(n-1);


            //스택의 상단부터 작동해서 0,1,2이 출력
            System.out.print(n + " ");
        }

    }

    public static void main(String[] args) {
        DFS(3);

    }
}
