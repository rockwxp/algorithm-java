package main.java.stackqueue;

import java.util.Stack;

//https://leetcode.cn/problems/evaluate-reverse-polish-notation/
public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") ) {
                int result = stack.pop() + stack.pop();
                stack.push(result);
            } else if (tokens[i].equals("-")) {
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                int result = num2 - num1;
                stack.push(result);
            } else if (tokens[i].equals("*")) {
                int result = stack.pop() * stack.pop();
                stack.push(result);
            } else if (tokens[i].equals("/")) {
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                int result = num2 / num1;
                stack.push(result);
            } else {
                stack.add(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();

    }
}
