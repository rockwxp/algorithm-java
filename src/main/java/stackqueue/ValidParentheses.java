package main.java.stackqueue;

import java.util.ArrayList;
import java.util.Stack;

//https://leetcode.cn/problems/valid-parentheses/description/
public class ValidParentheses {

    public boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        char c ;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || c != stack.peek()) {
                return false;
            } else {
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }

}
