package com.yfy.Array;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }


//    public boolean isValid(String s) {
//        int length = s.length();
//        if(length % 2 == 1) {
//            return false;
//        }
//        List<Character> characters = new ArrayList<>();
//        for(int left = 0; left < length; left ++) {
//            char leftChar = s.charAt(left);
//            if(!isOpenBracket(leftChar) && characters.size() > 0) {
//                char last = characters.remove(characters.size() - 1);
//                if(!isMactch(last, leftChar)) {
//                    return false;
//                }
//            } else {
//                characters.add(leftChar);
//            }
//        }
//        return characters.size() == 0;
//    }
//
//    public boolean isOpenBracket(char c) {
//        return c == '{' || c == '[' || c == '(';
//    }
//
//    private boolean isMactch(char left, char right) {
//        if(left == '{' && right == '}') {
//            return true;
//        }
//        if(left == '[' && right == ']') {
//            return true;
//        }
//        if(left == '(' && right == ')') {
//            return true;
//        }
//        return false;
//    }

}
