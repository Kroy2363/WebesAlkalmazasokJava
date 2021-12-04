package com.asszi.demo;

public class SzamologepService {
    public double szamol(int a, int b, String operator) {
        if (operator.equals("+")) {
            return a + b;
        }

        return 0;
    }
}
