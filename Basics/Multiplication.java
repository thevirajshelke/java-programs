/**
 * Multiplication
 */

import java.util.Scanner;
public class Multiplication {
    /*
    public static void main(String[] args) {
        int a = 20, b = 10, c;
        c = a * b;
        System.out.println("The multiplication of " + a + " & " + b + " is " + c);
    }
    
    public static void main(String[] args) {
        int a = 30, b = 20;
        System.out.println("The multiplication of " + a + " & " + b + " is " + (a * b));
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = a * b;
        input.close();
        System.out.println("The multiplication of " + a + " & " + b + " is " + c);
    }
    */
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a = input.nextInt();
        b = input.nextInt();
        input.close();
        System.out.println("The multiplication of " + a + " & " + b + " is " + (a * b));
    }
}