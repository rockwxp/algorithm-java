package main.java.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinations {
    String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    List<String> result = new ArrayList<>();

    StringBuilder temp = new StringBuilder();
    public List<String> letterCombinations(String digits){
        if (digits == null || digits.length() == 0) {
            return result;
        }

        backtracking(digits,0);

        return result;
    }

    public void backtracking(String digits,int index){
        if (index == digits.length()) {
            result.add(temp.toString());
            return;
        }

        String letter = letters[digits.charAt(index) - '0'];
        for (int i = 0; i < letter.length(); i++) {
            temp.append(letter.charAt(i));
            backtracking(digits,index+1);
            temp.deleteCharAt(temp.length()-1);
        }

    }


}
