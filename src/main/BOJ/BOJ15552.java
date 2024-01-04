package main.BOJ;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author hazel
 */
public class BOJ15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader는 예외처리 필수
        int n = Integer.parseInt(br.readLine()); //리턴타입이 string이기 때문에 int로 변환

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); //BufferedReader는 한 라인을 읽기때문에 StringTokenizer으로 문자열을 잘라줘야함
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(a + b + "\n");//출력 버퍼 스트림에 문자열을 모두 보낸다. , BufferedWriter는 개행이 안 되기 떄문에 "\n"추가
        }

        bw.flush(); //남아있는 데이터를 한번에 모두 출력
        bw.close(); //스트림을 닫아줌.


    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n  = scanner.nextInt();
//        for(int i =0; i < n; i ++){
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            System.out.println();
//
//    }
//    }
}

