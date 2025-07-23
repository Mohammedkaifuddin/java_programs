//10. Program to swap two numbers using bitwise operators.

import java.util.Scanner;
public class program_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();        
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}
