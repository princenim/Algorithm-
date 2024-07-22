package main.HACKERRANK.EncryptionDecryption;

import java.util.Arrays;

/**
 * Encryption-Decryption, https://www.hackerrank.com/skills-verification, //todo 테케 4개 통과 못함;,; 공백의
 * 크기가 1 이상이라고 셍각하고 다시 풀기
 *
 * @author hazel
 */
public class Solution {

    /*
     * Complete the 'decryptMessage' function below.
     *  a3     b1 c2 -> cc     b aaa
     *
     * The function is expected to return a STRING.
     * The function accepts STRING encryptedMessage as parameter.
     */
    public static String decryptMessage(String encryptedMessage) {

        //1. 문자열을 공백기준으로 잘라서 배열로 변경하고 위치 변경
        String[] arr = encryptedMessage.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            String tmp = "";
            tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        String reversedStr = String.join(" ", arr);

        //2. 문자열을 돌면서 문자가 숫자라면(아스키코드) 앞의 인덱스 문자를 숫자만큼 추가후 출력
        String newStr = "";
        for (int i = 0; i < reversedStr.length(); i++) {
            if (Character.isDigit(reversedStr.charAt(i))) { //숫자라면
                int cnt = 1;
                while (cnt < reversedStr.charAt(i) - '0') {
                    newStr += reversedStr.charAt(i - 1);
                    cnt++;
                }
            } else { //숫자가 아닐 때
                newStr += reversedStr.charAt(i);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.decryptMessage("a3     b1 c2");  //cc     b aaa
        System.out.println(s);
    }
    //w u av frc mzeeeeeeee va nnn uouzy  cyyyzx mra a iiiiiie   f  rl b zbx j  y skazgggxxxxxloo   e aaaaawx   pvl   npppp  vbbm  bvwussssss  izzzzzzzzzpin    v s c i qs ggg  uuu dddddddnq nzt llllll  yyyyyyyyeeeeeeeoaxinf  f t aaaab qi   ivh feeeeeeen gggg af     j    mzqqaa  bbbbb e m xxlmmmmmmzs x z   y t hgggggggggjzzzzzzzzzi  t s gc vdvvvvvvvuuuuuuuuugx  dd ee ttjqyzwghhhhhhhhhdoddddddddd qmzam  ssstttt  c b  hhhh bdddddddddzzz qwkkkkkkkkzzzzzmkkoppppnbbbbbbxb  v  oooooozdpyiv bzzhgggcmffffffffv iiiiic re jor fb rnl sssssssgguuu   wwwwwwwwwwyzq ssz xpbiiiiiiiin fffffdddddddmmmmvbbbbbbv ccccccpttttthubh od z dnl g sabb b uuuuu ok   rjggggggelqq nigv  nutttqqqqqqqqebbbbbbbu yyyp v x rrrrrrr ciiiiiiihhhh nnnjfadwsdd hfz c w p k af luly  m  kc  w  xxxxxxx q  mmmmmmmmmc iiii l  ktvvvv gg   vwwwwwwwwwu kau ei essssddddcc   p wp f ew ht cu tuv  thhhhhh   h y  xs  teiy gggggggzzzzzzza lh a y ie z o q gq zeeeeee u szzzzzlpjpvyn m  nnnnb k  i s  gtccccccccc t awl lp ueeeeeepxxsgj sqlmhwjjjj  nnnnna dddddd  tl q   n c c {-truncated-}"
}
