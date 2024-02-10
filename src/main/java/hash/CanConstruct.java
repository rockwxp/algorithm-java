package main.java.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//https://leetcode.cn/problems/ransom-note/
public class CanConstruct {

    public boolean solution(String ransomNote, String magazine){

        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        int[] arr = new int[26];

        for (char c : magazine.toCharArray()) {
            arr[c - 'a'] ++;
        }

        for (char c : ransomNote.toCharArray()) {
            arr[c- 'a']--;
        }

        for (int i : arr) {
            if (i < 0) {
                return false;
            }
        }

        return true;
    }


}
