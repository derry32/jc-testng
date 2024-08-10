package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        int expected = 17;
        int actual = calculator.Add(7, 10);
        Assert.assertEquals(actual,expected);

        System.out.println("Hasil yang di Inginkan :" + expected);
        System.out.println("Hasil :" + actual);
        System.out.println("=================");
    }
    @Test
    public void testSubtract(){
        int expected = 3;
        int actual = calculator.Subtract(10, 7);
        Assert.assertEquals(actual,expected);

        System.out.println("Hasil yang di Inginkan :" + expected);
        System.out.println("Hasil :" + actual);
        System.out.println("=================");
    }
}
