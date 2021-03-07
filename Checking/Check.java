package Checking;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {

        // k = k + 1;
        // k + = 1;
        // k++; --> yalnız 1 artırdıqda mümkündür

        // k = k - 1;
        // k - = 1;
        // k--; --> yalnız 1 azaltdıqda mümkündür

        Scanner scanner = new Scanner(System.in);
        System.out.print("Matrisin setirlerinin sayini daxil edin: ");
        int row = scanner.nextInt();
        System.out.print("Matrisin sutunlarinin sayini daxil edin: ");
        int column = scanner.nextInt();

        int myArray[][] = new int[row][column];
        int countOddNumbers = 0;
        int countEvenNumbers = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("myArray: [" + i + "] [" + j + "] = ");
                myArray[i][j] = scanner.nextInt();
                if (myArray[i][j] % 2 == 1 && myArray[i][j] > 0) {
                    countOddNumbers++;

                } else if (myArray[i][j] % 2 == 0 && myArray[i][j] > 0) {
                    countEvenNumbers++;
                }
            }
        }

        scanner.close();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(myArray[i][j] + " ");

            }
            System.out.println("");
        }

        int[] oddNumbers = new int[countOddNumbers];
        int[] evenNumbers = new int[countEvenNumbers];

        int k = 0;
        int n = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (myArray[i][j] % 2 == 1 && myArray[i][j] > 0) {
                    oddNumbers[k] = myArray[i][j];
                    k++;
                } else if (myArray[i][j] % 2 == 0 && myArray[i][j] > 0) {
                    evenNumbers[n] = myArray[i][j];
                    n++;
                }
            }
        }

        System.out.println("-----------Odd numbers-------");

        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        System.out.println("\n-----------Even numbers-------");

        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

    }

}
