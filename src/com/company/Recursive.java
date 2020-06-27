package com.company;

public class Recursive {

        public static int rec(int n) {
       return ((n > 1) ? n * rec(n - 1) : 1);
    }
}
