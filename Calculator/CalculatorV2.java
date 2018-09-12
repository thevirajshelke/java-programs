/**
 * CalculatorV2
 */
import java.util.Scanner;
public class CalculatorV2 {
    public static void main(String[] args) {
        int a, b, choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Select any one of the following:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        choice = input.nextInt();
        input.close();
        switch (choice) {
        case 1:
            System.out.println("The addition of " + a + " & " + b + " is " + (a + b));
            break;
        case 2:
            System.out.println("The subtraction of " + a + " & " + b + " is " + (a - b));
            break;
        case 3:
            System.out.println("The multiplication of " + a + " & " + b + " is " + (a * b));
            break;
        case 4:
            if (b == 0) {
                System.out.println("Division by zero is not possible!");
            } else {
                System.out.println("The division of " + a + " & " + b + " is " + (a / b));
            }
            break;
        default:
            System.out.println("Invalid Input!");
        }
    }
}