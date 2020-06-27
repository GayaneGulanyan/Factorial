package com.company;

public class Main {

    public static void main(String[] args) {
        int recM = -3;
        int nonrecM = 0;
        int nonrecM2 = 5;
        int nonrecUfor = 7;
        int nonrecUwhile = 9;
        if (recM < 0) {
            System.out.println("Recursive Method Wront Operand Walue!");
        } else if (recM > 0) {
            System.out.println("Recursive Method = " + Recursive.rec(recM));
        } else {
            System.out.println("Recursive Method = 1");
        }
        System.out.println("NonRecursive Method = " + NonRecursive.factorial(nonrecM));
        System.out.println("NonRecursive Method 2 = " + NonRecursiveMethod2.factorial(nonrecM2));
        System.out.println("NonRecUsingFor = " + NonRecursive.factorial(nonrecUfor));
        System.out.println("NonRecUsingWhile = " + NonRecUsingWhile.factorial(nonrecUwhile));
    }
}

