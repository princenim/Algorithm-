package main.PROGRAMMERS.LEVEL_0;

/**
 * @author hazel
 */
public class HideNum {

//    public static int solution(String my_string) {
//        int answer = 0;
//        String[] arr1 = my_string.split("");
//        for (int i = 0; i < my_string.length(); i++) {
//
//            //string to char
//            char word = arr1[i].charAt(0);
//            //char to int !!!!!!
//            int ascii =  word;
//            //System.out.println(ascii);
//
//            //문자 0 ~ 9 -> 48 ~ 57
//            if (48 <= ascii && ascii < 58) {
//                answer += Integer.parseInt(arr1[i]);
//            }
//        }
//        return answer;
//    }


        public static int solution2(String my_string) {
        int answer = 0;

        for(int i = 0; i < my_string.length(); i ++){
            if(48 <= my_string.charAt(i) && my_string.charAt(i) < 58 ){

                //char로 더하면 XXXXXXX
                //System.out.println(my_string.charAt(i));
                //answer += my_string.charAt(i);

                //char to String and string to int
                answer += Integer.parseInt(my_string.charAt(i) + "");
            }
        }

        return answer;
    }




    public static void main(String[] args) {
        //System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution2("aAb1B2cC34oOp"));

    }
}
