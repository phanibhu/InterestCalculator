package com.myproject.interestcalculatortest;

import com.myproject.interestcalculator.InterestCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class InterestCalculatorTest{
    @Test
    public void getTotalAmount(){
        InterestCalculator interestCalculator = new InterestCalculator(1000000, 3);
        Assert.assertEquals(1157625.0, interestCalculator.calculateInterest(interestCalculator));
    }



}
