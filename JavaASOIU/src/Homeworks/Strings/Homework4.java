//Java Program to Count Frequency of Character in String

package Homeworks.Strings;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter string: ");
		String string = scanner.next();

		System.out.print("Enter character: ");
		char character = scanner.next().charAt(0);

		scanner.close();

		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == character) {
				count++;
			}
		}

		System.out.println("Count: " + count);

	}

}
