//simple example of Queue datastructure

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<>(); // common step

        Scanner sc = new Scanner(System.in);
        System.out.println("How many students?");
        int NoOfStudents = sc.nextInt();

        System.out.println("Enter the Names : ");
        for (int i = 1; i <= NoOfStudents; i++) {
            String name = sc.next();
            q.add(name);
        }
        System.out.println("How many seats are available?");
        int NoOfSeats = sc.nextInt();
        for (int i = 1; i <= NoOfSeats; i++) {
            String name = q.remove();
            System.out.println(name + " got the seat.");
        }
    }

}
