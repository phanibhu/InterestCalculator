package com.myproject.interestcalculator;

public class InterestCalculator {
    private int amount;

    private int tenure;


    public InterestCalculator(int amount, int tenure) {
        this.amount = amount;
        this.tenure = tenure;
    }


    public int calculateInterest(InterestCalculator interestCalculator){
        for(int i=1;i<=tenure;i++) {

            int interest = (int) ((amount * 5) / 100);
            amount = interest + amount;
            System.out.println(amount+" "+"for"+" "+i+" "+"year");
        }
//        System.out.println(amount);
       return amount;


    }
    public static void main(String[] args) {
        InterestCalculator interestCalculator = new InterestCalculator(1000000, 3);
        System.out.println(interestCalculator.calculateInterest(interestCalculator));
    }



}

