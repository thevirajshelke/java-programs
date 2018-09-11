/**
 * Division
 */

import java.util.Scanner;
public class Division {
    /*
    public static void main(String[] args) {
        int a = 20, b = 10, c;
        c = a / b;
        System.out.println("The division of " + a + " & " + b + " is " + c);
    }
    
    public static void main(String[] args) {
        int a = 30, b = 10;
        System.out.println("The division of " + a + " & " + b + " is " + (a / b));
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        input.close();
        if(b == 0){
            System.out.println("Division by zero is not possible!");
        }   
        else{
            c = a / b;
            System.out.println("The division of " + a + " & " + b + " is " + c);
        }     
    }
    */
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a = input.nextInt();
        b = input.nextInt();
        input.close();
        if(b == 0){
            System.out.println("Division by zero is not possible!");
        }
        else{
            System.out.println("The division of " + a + " & " + b + " is " + (a / b));
        }
    }
}