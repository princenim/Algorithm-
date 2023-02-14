package programmers.Etc;

import java.util.Arrays;

public class Test {

    public static int solution(int[][] lotteries) {
        int answer = 0;
        double tempPercent = 0;
        double tempPrice = 0;

        //System.out.println(lotteries);

        for (int i = 0; i < lotteries.length; i++) {
            //System.out.println(Arrays.toString(lotteries[i]));

            double percent = (lotteries[i][0] * 100 / (double) (lotteries[i][1] + 1));
            System.out.println(percent);

            if (tempPercent < percent) {
                    tempPercent = percent;
                    answer = i + 1;
            }else if(tempPrice == lotteries[i][2]){
                System.out.println("333333");
                tempPrice= lotteries[i][2];
                answer = i +1;
            }


        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] array = {{10, 19, 800}, {20, 39, 200}, {100, 199, 500}};
        System.out.println(solution(array));
    }
}
