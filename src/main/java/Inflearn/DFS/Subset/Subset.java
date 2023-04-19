package Inflearn.DFS.Subset;


/**
 * @author hazel
 */
public class Subset {
    //7-6. 부분 집합 구하기 (경우의 수를 모두 구하기 ! )
    //자연수 n이 주어지면 1부터 n까지의 원소를 갖는 집합의 부분 집합을 모두 출력해라 -> 2의 n 제곱
    static int n;
    static int[] ch;

    // L은 숫자
    public void DFS(int L) {
        if (L == n + 1) {
            //종착점에 오면 값이 1인 ch의 배열 값을 출력
            //n이 3이니까 4가 된다면 멈추기
            String tmp = "";
            //0은 없다고 출력 X 하고 값이 1인 인덱스만 출력
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }
        } else {
            //왼쪽으로 - L이라는 원소를 사용한다
            ch[L] = 1;
            DFS(L + 1);
            //오른쪽으로 - L이라는 원소를 사용하지 않는다.
            ch[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) {
        Subset subset = new Subset();
        n = 3;

        //index 번호가 출력할 배열의 값
        ch = new int[n + 1];


        //1부터 시작해서 숫자를 출력
        subset.DFS(1);
    }
}
