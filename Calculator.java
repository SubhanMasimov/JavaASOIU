import java.util.Scanner;

public class file {
    // line --> sətir
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1+ 2- 3* 4/

        System.out.print("Birinci ededi daxil edin: ");
        double number1 = scanner.nextDouble();

        System.out.print("Ikinci ededi daxil edin: ");
        double number2 = scanner.nextDouble();

        System.out.print("Emeliyyati daxil edin: ");
        char process = scanner.next().charAt(0);

        double result = 0;

        if (process == '1' || process == '+') {
            result = number1 + number2;
            System.out.println("Result: " + result);
        }

        else if (process == '2' || process == '-') {
            result = number1 - number2;
            System.out.println("Result: " + result);
        }

        else if (process == '3' || process == '*') {
            result = number1 * number2;
            System.out.println("Result: " + result);
        }

        else if (process == '4' || process == '/') {

            if (number2 == 0) {
                System.out.println("Sifira bolmek olmaz!");
            }

            else {
                result = number1 / number2;
                System.out.println("Result: " + result);
            }

        }

        // DRY --> Don't Repeat Yourself! --> Özünü təkrarlama!

        else {
            System.out.println("Yanlis emeliyyat!");
        }
    }
}