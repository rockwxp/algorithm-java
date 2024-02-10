package main.java.hash;
//https://leetcode.cn/problems/valid-anagram/description/
public class IsAnagram {

    public boolean solution(String s, String t){
        int[] record = new int[26];

        // 并不需要记住字符a的ASCII，只要求出一个相对数值就可以了
        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            record[t.charAt(i)-'a']--;
        }

        for (int index : record) {
            if (index != 0) {
                return false;
            }
        }
        return true;
    }
}
