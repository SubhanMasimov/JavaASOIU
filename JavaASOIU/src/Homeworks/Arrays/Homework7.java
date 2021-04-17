//Write a Java Program to Find Sum Above and Below of Main Diagonal Matrix.

package Homeworks.Arrays;
import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[][] myArray = new int[size][size];

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                myArray[i][j] = scanner.nextInt();
            }

        scanner.close();

        int sumAbove = 0, sumBelow = 0;

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                if (i > j) {
                    sumBelow += myArray[i][j];
                } else if (i < j) {
                    sumAbove += myArray[i][j];
                }
            }

        System.out.println("Sum of elements above the diagonal: " + sumAbove);
        System.out.println("Sum of elements below the diagonal: " + sumBelow);
    }
}