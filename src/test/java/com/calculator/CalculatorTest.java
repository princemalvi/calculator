package com.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest 
{
    @Test
    public void isReturnZeroOnEmpty() {
   	 	assertEquals(0, Calculator.add(""));
    }
    @Test
    public void shouldReturnOne() {
   	 assertEquals(1, Calculator.add("1"));
    }
    @Test
    public void isReturnSumOfTwoNumber() {
   	 	assertEquals(3, Calculator.add("1,2"));
    }
}
