package INFLEARN.Recursive;

/**
 * @author hazel
 */
public class BinaryNumber {
    //7-2. 이진수 출력 (재귀)
    //10진수 n이 입력되면 재귀함수를 사용해 2진수로 변환해 출력하시오
    //n의 2진수 구하는 법을 잘 생각해보기
    public static void DFS(int n ){
        if(n ==0){
                return;
        }else {
            DFS(n/2);
            System.out.print(n %2 + "");
        }

    }
    public static void main(String[] args) {
        DFS(11);

    }
}
