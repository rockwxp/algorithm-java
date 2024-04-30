package main.java.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionLabels {

    public List<Integer> partitionLabels(String s){
        ArrayList<Integer> result = new ArrayList<>();

        int[] edge = new int[26];
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            edge[chars[i] - 'a'] = i;
        }

        int right = 0;
        int last = -1;

        for (int i = 0; i < chars.length; i++) {
            right = Math.max(right,edge[chars[i]-'a']);

            if (right == i) {
                result.add(i - last);
                last = i;
            }
        }
        return result;
    }
}
