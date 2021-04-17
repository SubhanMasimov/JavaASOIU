//Java program to implement queue operations using linked list

package Homeworks.Queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        showMenu();

        int process = 0;

        while (process != 5) {

            System.out.print("Enter process number: ");
            process = new Scanner(System.in).nextInt();

            switch (process) {
            case 1:
                System.out.print("Enter added item: ");
                int itemToAdded = new Scanner(System.in).nextInt();
                queue.add(itemToAdded);
                System.out.println("Queue: " + queue);
                break;

            case 2:
                queue.poll();
                System.out.println("Item deleted in front end.");
                System.out.println("Queue: " + queue);
                break;

            case 3:
                System.out.println("Queue: " + queue);
                System.out.println("Queue's item at the front: " + queue.peek());
                break;

            case 4:
                System.out.println("Queue: " + queue);
                break;

            case 5:
                break;

            default:
                System.out.println("Wrong process number!");
                break;
            }
        }
    }

    static void showMenu() {
        System.out.println("------------------------------");
        System.out.println("1.Insert");
        System.out.println("2.Delete");
        System.out.println("3.Display the element at the front");
        System.out.println("4.Display all elements of the queue");
        System.out.println("5.Quit");
        System.out.println("------------------------------");
    }
}
