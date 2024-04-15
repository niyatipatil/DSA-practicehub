//GCD (Greatest common divisor)
//LCM (Least common multiple)
//Eg. GCD for 20,30 is 10 ,whereas LCM for 20,30 is 60

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println("---GCD & LCM---");
        System.out.println("Enter 2 numbers:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = 0;
        for (int i = 1; i < Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        System.out.println("GCD is " + gcd);

        int lcm = (num1 * num2) / gcd; // formula LCM(a, b) = (a * b) / GCD(a, b)
        System.out.println("LCM is " + lcm);
    }
}
