//Write a Java Program to find Average of n Numbers using array

package Homeworks.Arrays;
import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] myArray = new int[size];
        int sumOfElements = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
            sumOfElements += myArray[i];
        }
        scanner.close();

        double average = (double) sumOfElements / size;
        System.out.println("Average: " + average);
    }
}