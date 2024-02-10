package main.java.hash;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.cn/problems/happy-number/
public class IsHappy {

    public static void main(String[] args) {
        IsHappy happy = new IsHappy();
        System.out.println(happy.solution(19));
    }
    public boolean solution(int n) {

        Set<Integer> set1 = new HashSet<>();
        while (n != 1 && !set1.contains(n)) {
            set1.add(n);
            n = getNum(n);

        }
        return n == 1;

    }

    public int getNum(int n){

        int result = 0;
        while (n > 0) {
            int temp = n %10;
            result += temp * temp;
            n = n / 10;
        }
        return result;
    }




}
