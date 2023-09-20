package Etc;


import java.util.*;

/**
 * @author hazel
 */
public class S1 {

    public static int solution(int n, int[] v) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();

        map1.put(0, Arrays.stream(v).sum());
        for(int i = 0; i < n; i ++){
            for(int j = i; j < n; j ++){
                if(i == j){
                    arr1.add(v[i]);
                }else {
                    arr2.add(v[j]);
                }
            }
            //각 배열의 합
            int v1 = arr1.stream().mapToInt(Integer::intValue).sum();
            int v2 = arr2.stream().mapToInt(Integer::intValue).sum();

            //배열 합의 차이
            int value  = v2 - v1;
            value = Math.abs(value);

            map1.put(i+1, value);
            arr2.clear();
        }


        List<Integer> listKeySet = new ArrayList<>(map1.keySet());
        listKeySet.sort(Comparator.comparing(map1::get));

//        for(Integer key : listKeySet) {
//            System.out.println("key : " + key + " , " + "value : " + map1.get(key));
//        }


        return listKeySet.get(0);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1};
        System.out.println(solution(5, arr));
    }

}
