package org.selenium.automation;

public class Palindrome {

    public static void main(String[] args) {
        int num = 122; 
        int originalInput = num;
        int output = 0;

        for (int i = num; i > 0; i = i / 10) {
            int rem = i % 10;
            output = (output * 10) + rem;
        }

        if (originalInput == output) {
            System.out.println(originalInput + " is a Palindrome.");
        } else {
            System.out.println(originalInput + " is NOT a Palindrome.");
        }
    }
}
