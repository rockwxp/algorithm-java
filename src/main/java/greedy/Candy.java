package main.java.greedy;

import java.util.Arrays;

public class Candy {

    // 1 2 2 5 4 3 2
    // 1 2 1 2 1 1 1
    // 1 1 1 4 3 2 1
    public int candy(int[] ratings){
        int[] left = new int[ratings.length];
        int result = 0;
        Arrays.fill(left, 1);

        for (int i = 1; i < ratings.length; i++) {
            if( ratings[i] > ratings[i-1] ){
                left[i] = left[i-1]+1;
            }
        }
        for (int i = ratings.length-2; i >=0; i--) {
            if(ratings[i] > ratings[i+1]){
                left[i] = Math.max(left[i],left[i+1]+1);
            }
        }

        for (int i = 0; i < left.length; i++) {
            result+= left[i];
        }

        return result;
    }
}
