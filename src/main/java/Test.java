package main.java;


import main.java.string.ReplaceNums;
import main.java.string.ReverseWords;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        ReverseWords re = new ReverseWords();
        String s = re.solution("  hello world!   ");
        System.out.println(s);


    }

}
