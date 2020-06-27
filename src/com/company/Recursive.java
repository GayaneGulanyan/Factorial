package com.company;

public class Recursive {

        public static int rec(int n) {
           // return n*rec(n-1);
       return ((n > 1) ? n * rec(n - 1) : 1);
    }

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
