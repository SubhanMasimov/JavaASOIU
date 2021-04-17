//Write a Java Program to Sort n Strings in Alphabetical Order

package Homeworks.Strings;

import java.util.Scanner;
import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Strings you want to sort: ");
        int countStrings = scanner.nextInt();

        String[] strings = new String[countStrings];

        for (int i = 0; i < strings.length; i++) {
            System.out.print(i + ". string: ");
            strings[i] = scanner.next();
        }

        scanner.close();

        Arrays.sort(strings);

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
    }

}
