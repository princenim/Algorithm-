package main.BOJ.BOJ;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author hazel
 */
public class BOJ10951 {

    /*
    EOF : end of file - 더이상 읽을 데이터가 없으면 종료한다. 즉 더 이상 입력을 하지 않는다 = null
    인텔리제이 상에서는 그냥 cntl + z , cntl + D로 종료시키면 된다.
 */

    /**
     * 풀이 1 : Scanner 사용
     */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            System.out.println(a + b);
//        }
//    }

    /**
     * 풀이 2 : BufferedReader 사용
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력
        String line;

        while ((line = br.readLine()) != null) {
            //입력값이 존재하지않는 EOF일 경우 false, 아닐떄 true반환함
            //즉 readline를 통해 line에 저장된 데이터가 null이면 false, 아니면 true
            StringTokenizer st = new StringTokenizer(line);

            // 엔터기준으로 문자열을 가져옴
            int a = Integer.parseInt(st.nextToken()); //nextToken()- 다음 토큰 리턴 (for문 필요 X)
            int b = Integer.parseInt(st.nextToken());
            bw.write(a + b + "\n");

        }

        bw.flush();
        bw.close();

    }
}
