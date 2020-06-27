package com.company;

public class NonRecursive
{
    public static int factorial(int n)
    {
        int count = 0;
        int fact = 1;
        do {
            fact=fact*(count+1);
            count++;
        } while (count < n);
        return fact;


        /*while (x<1) {
            System.out.println("Factorial=1");
            while (x<=n)
            {
                    y = y*x;
            System.out.println("Factorial=" + y);
            x++;
            );
            System.out.println(y);
            }
*/

    }

}

