package com.yfy.String;

/**
 * Question 344
 */
public class ReverseString {

    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length / 2; i++) {
            char temp = chars[chars.length - 1 -i];
            chars[chars.length - 1 -i] = chars[i];
            chars[i] = temp;
        }
        return new String(chars);
    }

}
