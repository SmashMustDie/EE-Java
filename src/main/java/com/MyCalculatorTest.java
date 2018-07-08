package com;

public class MyCalculatorTest {
    public static void main(String[] args) {
        int expectedResult = 25;
        int actualResult = new MyCalculator(12, 13).sum();
        int actualResultStr = new MyCalculator("12", "13").sum();
        assert expectedResult == actualResult && expectedResult == actualResultStr : "bug";
        System.out.println("Success");
    }
}
