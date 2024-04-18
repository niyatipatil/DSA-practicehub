
//Printing hello world
//Printing a block of stars by user input; time complexity = O(n^2)
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("Enter the Square side value : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
