//Write a Java Program to Find Even and Odd Numbers using array.

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println("----------Even Numbers----------");

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                System.out.print(myArray[i] + " ");
            }
        }

        System.out.println("\n----------Odd Numbers----------");

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 1) {
                System.out.print(myArray[i] + " ");
            }
        }
    }
}