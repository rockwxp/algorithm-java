package main.java.greedy;

import java.util.Arrays;

public class AssignCookies {

    public int findContentChildren(int[] g,int[] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int cookiesIndex = s.length-1;
        int result = 0;

        for (int i = g.length-1; i >=0; i--) {

            if (cookiesIndex >= 0 && s[cookiesIndex] >= g[i]) {
                result++;
                cookiesIndex--;
            }
        }

        return result;
    }

}
