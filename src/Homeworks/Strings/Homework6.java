//if a and b contains c print true, else false

package Homeworks.Strings;

import java.util.Scanner;

public class Homework6 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a: ");
		String a = scanner.next();

		System.out.print("Enter b: ");
		String b = scanner.next();

		System.out.print("Enter c: ");
		String c = scanner.next();

		scanner.close();

		System.out.print(isContain(a, b, c));

	}

	static boolean isContain(String a, String b, String c) {

		if (a.contains(c) && b.contains(c)) {
			return true;
		}

		return false;

	}

}
