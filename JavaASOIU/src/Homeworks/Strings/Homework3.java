//Write a Java Program to Check whether string is palindrome or not using Function

package Homeworks.Strings;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = scanner.next();

        scanner.close();

        if (reverseString(string).equals(string)) {
            System.out.println(string + " is palindrome.");
        }

        else {
            System.out.println(string + " is not palindrome.");
        }

        System.out.println(reverseString(string));
    }

    static String reverseString(String string) {

        String reversedString = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }

        return reversedString;
    }
}
