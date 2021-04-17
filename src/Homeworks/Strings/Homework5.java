//foo(String s, char c, int count){} --> func(“Salam”, ‘b’, 5); -> Salambbbbb

package Homeworks.Strings;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String string = scanner.next();

        System.out.print("Enter char: ");
        char c = scanner.next().charAt(0);

        System.out.print("Enter count: ");
        int count = scanner.nextInt();

        scanner.close();

        System.out.println(change(string, c, count));

    }

    static String change(String string, char c, int count) {

        for (int i = 0; i < count; i++) {
            string += c;
        }

        return string;

    }
}
