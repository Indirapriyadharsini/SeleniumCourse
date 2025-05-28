package org.selenium.automation;


public class FibonacciSeries {
    public static void main(String[] args) {
        
        int range = 15;

        int a = 0, b = 1;

        System.out.print("Fibonacci series up to " + range + ": ");

        
        if (a <= range) {
            System.out.print(a);
        }

        
        for (int i = 1; ; i++) {
            int next = a + b;
            if (next > range) {
                break; 
            }
            System.out.print(", " + b);
            a = b;
            b = next;
        }

    }
}

