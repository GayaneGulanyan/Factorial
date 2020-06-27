package com.company;

public class NonRecUsingFor {
    public static int factorial(int n) {
        int fact = 1;
           for (; n > 0; fact=fact*(n--)) ;
                return fact;
            }
}

