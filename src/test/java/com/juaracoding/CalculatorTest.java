package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.add(5, 10);
        Assert.assertEquals(actual,expected);
    }
}
