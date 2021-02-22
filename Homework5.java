//Write a Java program to find the duplicate values of an array of integer values.

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
        scanner.close();

        int duplicateCount = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    duplicateCount++;
                }
                if (duplicateCount == 2) {
                    System.out.print(myArray[i] + " ");
                    duplicateCount = 0;
                }
            }
            duplicateCount = 0;
        }
    }
}
