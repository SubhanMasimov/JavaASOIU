//Write a Java Program to Delete an Element in an array.

package Homeworks.Arrays;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }

        System.out.print("Enter will deleted element: ");
        int deleted = scanner.nextInt();

        scanner.close();

        int countDeletedItems = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == deleted)
                countDeletedItems++;
        }

        int[] newArray = new int[size - countDeletedItems];

        int k = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != deleted) {
                newArray[k] = myArray[i];
                k++;
            }
        }

        System.out.println("--------------OLD ARRAY--------------");

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println("\n--------------NEW ARRAY--------------");

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

}