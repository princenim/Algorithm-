package main.ETC.TEST;

import java.util.ArrayList;

/**
 * @author hazel
 */
public class M1 {
    public static int solution(int inner, int outer, int[] points_x, int[] points_y) {
        int answer = 0;

        ArrayList<Integer> bigIdxArr =  new ArrayList<>();
        //큰 원 반지름 제곱
        double bigR = Math.pow(outer, 2);
        //큰 원
        for(int i = 0; i < points_x.length; i ++){
            double big = Math.pow(0- points_x[i], 2) + Math.pow(0 - points_y[i],2);
            if( bigR> big){
                bigIdxArr.add(i);
            }
        }


        //작은 원
        ArrayList<Integer> sIdxArr = new ArrayList<>();
        //작은 원 반지름 제곱
        double sR= Math.pow(inner, 2);
        for(int i =0; i< points_x.length; i ++){
            double small = Math.pow(0 - points_x[i], 2) + Math.pow(0 - points_y[i],2);
            if(sR < small){
                sIdxArr.add(i);
            }

        }


        System.out.println(bigIdxArr);
        System.out.println(sIdxArr);

        bigIdxArr.retainAll(sIdxArr);
        answer = bigIdxArr.size();


        return answer;

    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int in = sc.nextInt();
//        int out = sc.nextInt();
//
//        //d
//        ArrayList<Integer> arr1= new ArrayList<>();
//        for(int i = 0; i < 5; i ++){
//            arr1.add(sc.nextInt());
//        }
//
//        ArrayList<Integer> arr2= new ArrayList<>();
//        for(int i = 0; i < 5; i ++){
//            arr2.add(sc.nextInt());
//        }
//
//        System.out.println(solution(in, out, arr1, arr2));
//
//
//    }

    public static class Test {

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
}
