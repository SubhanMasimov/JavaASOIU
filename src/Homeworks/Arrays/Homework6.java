//find-largest-and-smallest-element-matrix

package Homeworks.Arrays;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int[][] myArray = new int[row][column];

        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) {
                myArray[i][j] = scanner.nextInt();
            }

        scanner.close();

        int smallest = myArray[0][0];

        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) {
                if (myArray[i][j] < smallest) {
                    smallest = myArray[i][j];
                }
            }

        System.out.println("Smallest element in array: " + smallest);

        int largest = myArray[0][0];

        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) {
                if (myArray[i][j] > largest) {
                    largest = myArray[i][j];
                }
            }

        System.out.println("Largest element in array: " + largest);
    }
}