package com.company;

public class NonRecursiveMethod2 {
    public static int factorial(int n) {
        int count = n;
        do {
            n = n * (count - 1);
            count--;
        } while (count > 1);
        return n;
    }
}
