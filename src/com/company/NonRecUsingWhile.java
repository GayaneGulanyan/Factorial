package com.company;

public class NonRecUsingWhile {
    public static int factorial(int n) {
        int fact=n;
        if (n>=0) {
            while (n > 1) {
                fact *= (n - 1);
                n--;
            }
            return fact;
        }
        else {
            return 0;
        }
    }
}
