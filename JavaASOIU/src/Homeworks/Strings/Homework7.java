//HeLLo WorlD->hEllO wORLd.

package Homeworks.Strings;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = scanner.next();
        scanner.close();

        char[] newString = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) < 97) {
                char tempChar = string.charAt(i);
                newString[i] = (char) (tempChar + 32);
            }

            else {
                char tempChar = string.charAt(i);
                newString[i] = (char) (tempChar - 32);
            }
        }

        for (int i = 0; i < newString.length; i++) {
            System.out.print(newString[i]);
        }

    }
}
