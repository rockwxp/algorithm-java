package main.java.string;
//https://leetcode.cn/problems/reverse-string/
public class ReverseString {

    public void reverseString(char[] s){
        int length = s.length;
        int left = 0;
        int right = length-1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right --;
        }

    }
}
