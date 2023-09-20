package PROGRAMMERS.LEVEL_0;

/**
 * @author hazel
 */
public class CloseDiscount {
    public static int solution(int price) {


        //10 이상 ~ 30미만 -> 0.05
        //30이상 ~ 50미만 -> 0.1
        //50 이상 -> 0.2

        if (500000 <= price) {
            price = (int)(price * 0.8);
        } else if (price >= 300000 ) {
            price = (int) (price * 0.9);
        } else if(price >= 100000){
            price = (int) (price * 0.95);
        }
        return price ;
    }

    public static void main(String[] args) {
        System.out.println(solution(580000));
    }


}
