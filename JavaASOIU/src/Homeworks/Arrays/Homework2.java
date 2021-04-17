//Write a Java Program to Insert an element in an array at specific position. 

package Homeworks.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }

        System.out.format("Enter position (must be smaller than %d): ", size);
        int position = scanner.nextInt();

        System.out.println("Enter element: ");
        int element = scanner.nextInt();
        scanner.close();

        int[] newArray = new int[size + 1];

        for (int i = 0; i < newArray.length; i++) {
            if (i < position) {
                newArray[i] = myArray[i];
            } else if (i == position) {
                newArray[i] = element;
            } else {
                newArray[i] = myArray[i-1];
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