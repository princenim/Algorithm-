package main.LEETCODE.EASY.N1603;

/**
 * 1603. Design Parking System, https://leetcode.com/problems/design-parking-system/description/,구현
 *
 * @author hazel
 */
public class ParkingSystem {

    //대, 중,소 의 주차 공간이 있고, 공간마다 고정 숫자가 있다. 순서대로 1,2,3
    //자동차는 오직 같은 타입의 주차공간에만 주차를 할수있다. 만약에 공간이 충분하다면 true, 아니면 false 리턴
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }


    public boolean addCar(int carType) {
        if (carType == 3) {
            if (small > 0) {
                small--;
                return true;
            } else {
                return false;
            }

        } else if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;

            } else {
                return false;
            }
        } else {
            if (big > 0) {
                big--;
                return true;
            } else {
                return false;
            }
        }
    }
}
