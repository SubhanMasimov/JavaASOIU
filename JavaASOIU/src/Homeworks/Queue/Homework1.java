//Java Program to implement Deque using circular array

package Homeworks.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();
        showMenu();

        int process = 0;

        while (process != 6) {

            System.out.print("Enter process number: ");
            process = new Scanner(System.in).nextInt();

            switch (process) {
            case 1:
                System.out.print("Enter added item: ");
                int itemToAdded = new Scanner(System.in).nextInt();
                deque.addFirst(itemToAdded);
                System.out.println("Deque: " + deque);
                break;

            case 2:
                System.out.print("Enter added item: ");
                itemToAdded = new Scanner(System.in).nextInt();
                deque.addLast(itemToAdded);
                System.out.println("Deque: " + deque);
                break;

            case 3:
                deque.pollFirst();
                System.out.println("Item deleted in front end.");
                System.out.println("Deque: " + deque);
                break;

            case 4:
                deque.pollLast();
                System.out.println("Item deleted in rear end.");
                System.out.println("Deque: " + deque);
                break;

            case 5:
                System.out.println("Deque: " + deque);
                break;

            case 6:
                break;

            default:
                System.out.println("Wrong process number!");
                break;
            }

        }
    }

    static void showMenu() {
        System.out.println("------------------------------");
        System.out.println("1.Insert at the front end");
        System.out.println("2.Insert at the rear end");
        System.out.println("3.Delete from front end");
        System.out.println("4.Delete from rear end");
        System.out.println("5.Display");
        System.out.println("6.Quit");
        System.out.println("------------------------------");
    }
}
