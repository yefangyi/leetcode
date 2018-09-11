package com.yfy.Array;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    private ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void case1() {
        Assert.assertEquals(true, validParentheses.isValid("()"));
    }

    @Test
    public void case2() {
        Assert.assertEquals(true, validParentheses.isValid("()[]{}"));
    }

    @Test
    public void case3() {
        Assert.assertEquals(false, validParentheses.isValid("(]"));
    }

    @Test
    public void case4() {
        Assert.assertEquals(false, validParentheses.isValid("([)]"));
    }

    @Test
    public void case5() {
        Assert.assertEquals(true, validParentheses.isValid("{[]}"));
    }

    @Test
    public void case6() {
        Assert.assertEquals(true, validParentheses.isValid("{[]}{}"));
    }

    @Test
    public void case7() {
        Assert.assertEquals(true, validParentheses.isValid("(([]){})"));
    }

    @Test
    public void case8() {
        Assert.assertEquals(false, validParentheses.isValid("(("));
    }

    @Test
    public void case9() {
        Assert.assertEquals(false, validParentheses.isValid("){"));
    }


}
