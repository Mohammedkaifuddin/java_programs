//11. Program to add two numbers without using binary addition (+) operator. 

import java.util.Scanner;

public class program_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        int result = num1 - (-num2); 
        System.out.println("Sum of num1 and num2: " + result);
    }
}
