package org.example;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double addNrOfTimes(int times) {
        double totaal = 0;
        for(int i = 0; i< times; i++) {
            totaal += 0.01;
            System.out.println(totaal);
        }
        return totaal;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
