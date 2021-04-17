//Write a Java Program to Remove or Delete Words from String using Function

package Homeworks.Strings;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = "Hello World";

        String[] newString = string.split(" ");

        System.out.print("Deleted string: ");
        String stringToDelete = scanner.next();
        scanner.close();

        for (int i = 0; i < newString.length; i++) {
            if (newString[i].equals(stringToDelete)) {
                newString[i] = "";
            }
        }

        System.out.println("-------New output-------");
        for (int i = 0; i < newString.length; i++) {
            System.out.print(newString[i]);
        }
    }
}
