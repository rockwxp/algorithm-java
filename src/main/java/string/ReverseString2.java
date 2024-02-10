package main.java.string;
//https://leetcode.cn/problems/reverse-string-ii/
public class ReverseString2 {

    public String solution(String s,int k){

        char[] charArray = s.toCharArray();
        int size = charArray.length;
        for (int i = 0; i < size; i += 2 * k) {
            int left = i;
            int right = Math.min(left + k - 1, size - 1);
            while (left <= right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }

        return new String(charArray);
    }



}
